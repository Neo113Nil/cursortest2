package ru.ok.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import one.video.streaming.tools.TimeMachine;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import ru.ok.audio.util.SystemAudioConfiguration;
import ru.ok.media.ConnectionsManager;
import ru.ok.media.PublisherImpl;
import ru.ok.media.api.AudioEffectController;
import ru.ok.media.api.Publisher;
import ru.ok.media.api.PublisherCameraCallback;
import ru.ok.media.api.PublisherCameraClient;
import ru.ok.media.api.PublisherRenderer;
import ru.ok.media.api.PublisherRendererCallback;
import ru.ok.media.api.PublisherStateChangeListener;
import ru.ok.media.audio.AudioCaptureEffectsController;
import ru.ok.media.audio.AudioCaptureNative;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.NetworkConnection;
import ru.ok.media.utils.RateRange;
import ru.ok.media.utils.RotationController;
import ru.ok.media.utils.TimeSampler;
import ru.ok.media.utils.TimedEvent;
import ru.ok.media.utils.VideoSize;
import ru.ok.proto.AudioAdaptationConfig;
import ru.ok.proto.BitrateConfiguration;
import ru.ok.proto.NetPublisher;
import ru.ok.proto.PacketStats;
import ru.ok.proto.PublisherConfiguration;
import ru.ok.proto.QualityController;
import xsna.b04;
import xsna.b3m;
import xsna.bv9;
import xsna.cyo0;
import xsna.e630;
import xsna.ef2;
import xsna.fp;
import xsna.hoo0;
import xsna.ji;
import xsna.l370;
import xsna.n93;
import xsna.ne7;
import xsna.o93;
import xsna.or4;
import xsna.ou4;
import xsna.qo2;
import xsna.r490;
import xsna.t34;
import xsna.tn9;
import xsna.tto0;
import xsna.tw3;
import xsna.u12;
import xsna.xqc;
import xsna.xy4;
import xsna.zds0;

/* loaded from: classes9.dex */
public class PublisherImpl implements Publisher, PublisherCameraClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_NETWORK_MONITOR_DELAY = 2000;
    private static final int NETWORK_MONITOR_DELAY = 350;
    static final int START_AUDIO_BIT_RATE = 131072;
    static final int START_FRAME_RATE = 25;
    static final int START_VIDEO_BIT_RATE = 1700000;
    private static final String TAG = "Publisher";
    private static final List<VideoSize> slowpokeVideoSize = Collections.unmodifiableList(Arrays.asList(VideoSize.FULLHD_VIDEO_SIZE, VideoSize.HD_VIDEO_SIZE, VideoSize.FAST_VIDEO_SIZE, VideoSize.FASTER_VIDEO_SIZE, VideoSize.FASTEST_VIDEO_SIZE));
    private volatile int audioBitrate;
    private AudioCaptureNative audioCapture;
    private final AudioCaptureEffectsController audioEffectsController;
    private volatile boolean badNetworkPending;

    @Nullable
    private PublisherStateChangeListener callback;
    private boolean cameraIsExternal;
    private boolean cameraIsFront;
    private int cameraRotation;
    private final PublisherConfiguration config;
    private ConnectionsManager connectionsManager;
    private final ConnectivityManager connectivityManager;
    private RateRange currentRateRange;
    private boolean forceOpenSL;
    private ScheduledExecutorService framePushExecutor;
    private AtomicLong framesCaptured;
    private long initialBitrate;
    private TimedEvent lastRenderEvent;
    private TimedEvent lastSwitchDown;
    private TimedEvent lastSwitchUp;
    private final LoggerInterface logger;
    private volatile VideoSize mCameraPreviewSize;
    private Context mContext;
    private volatile VideoSize mEncoderVideoSize;
    private PublisherSurfaceRenderer mRenderer;
    private PacketStats m_packetStats;
    private volatile VideoSize maxVideoSize;
    private boolean muted;
    private long nativeAudioProcessingFactory;
    private volatile NetPublisher netPublisher;
    private TimedEvent pauseEvent;

    @Nullable
    private PublisherCameraCallback publisherCameraCallback;
    private boolean publishing;
    private QualityController qualityController;
    private final SortedMap<VideoSize, RateRange> rangeMap;
    private final RotationController rotationController;
    private final PublisherSharedPreferences sharedPrefs;
    private int slowpokeIdx;
    private final TimedEvent startEvent;
    private volatile boolean stopping;
    private String streamName;
    private volatile long videoBitrate;
    private VideoDataHandler videoDataHandler;
    private final hoo0 videoEncoder;
    private volatile int videoRotation;
    private Set<VideoSize> videoSizeBlackList;
    private boolean voiceMode;
    private Handler workerHandler;
    private HandlerThread workerThread;

    /* renamed from: ru.ok.media.PublisherImpl$1, reason: invalid class name */
    public class AnonymousClass1 extends AudioCaptureNative {
        private int lastAudioTimestampMs;
        final /* synthetic */ NetPublisher val$publisher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SystemAudioConfiguration systemAudioConfiguration, String str, AudioCaptureNative.AudioEncoderParams audioEncoderParams, int i, Context context, boolean z, TimeMachine timeMachine, long j, NetPublisher netPublisher) {
            super(systemAudioConfiguration, str, audioEncoderParams, i, context, z, timeMachine, j);
            this.val$publisher = netPublisher;
        }

        private boolean isActive() {
            return this == PublisherImpl.this.audioCapture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleError$1() {
            if (isActive()) {
                PublisherImpl.this.sendErrorToCallback(14);
                PublisherImpl.this.audioCapture = null;
                PublisherImpl.this.stopPublishing();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleStopped$0() {
            if (isActive()) {
                PublisherImpl.this.audioCapture = null;
                PublisherImpl.this.checkedClose();
            }
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleEncodedData(ByteBuffer byteBuffer, long j) {
            if (byteBuffer.remaining() <= 0 || this.val$publisher == null) {
                return;
            }
            int i = (int) j;
            this.lastAudioTimestampMs = i;
            this.val$publisher.pushAACAudioFrame(byteBuffer, false, i, ((1024 / getChannelCount()) * 1000) / getSampleRate());
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleError(@NonNull Throwable th) {
            ne7.m(PublisherImpl.TAG, "AudioCaptureNative.handleError() - t= " + th);
            PublisherImpl.this.executeOnInitThread(new Runnable() { // from class: ru.ok.media.d
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass1.this.lambda$handleError$1();
                }
            });
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleFormatChange(ByteBuffer byteBuffer, long j) {
            ne7.m(PublisherImpl.TAG, "AudioCaptureNative.handleFormatChange() - codecConfig=" + r490.f(byteBuffer, true));
            if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                return;
            }
            NetPublisher netPublisher = this.val$publisher;
            int i = this.lastAudioTimestampMs + 1;
            this.lastAudioTimestampMs = i;
            netPublisher.pushAACAudioFrame(byteBuffer, true, i, 1);
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public void handleStopped() {
            ne7.m(PublisherImpl.TAG, "AudioCaptureNative.handleStopped()");
            PublisherImpl.this.executeOnInitThread(new Runnable() { // from class: ru.ok.media.c
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass1.this.lambda$handleStopped$0();
                }
            });
        }

        @Override // ru.ok.media.audio.AudioCaptureNative
        public boolean isQueueBlocked() {
            return !PublisherImpl.this.qualityController.isAudioFrameAllowed();
        }
    }

    /* renamed from: ru.ok.media.PublisherImpl$2, reason: invalid class name */
    public class AnonymousClass2 implements NetPublisher.Callback {
        final /* synthetic */ NetPublisher val$cbPublisher;

        public AnonymousClass2(NetPublisher netPublisher) {
            this.val$cbPublisher = netPublisher;
        }

        private boolean isActive() {
            return PublisherImpl.this.netPublisher == this.val$cbPublisher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleError$3(int i) {
            ne7.m(PublisherImpl.TAG, "Callback.handleError(" + i + ") - started");
            if (isActive() && !PublisherImpl.this.stopping) {
                PublisherImpl.this.stopPublishing();
                PublisherImpl.this.sendErrorToCallback(i);
            }
            ne7.m(PublisherImpl.TAG, "Callback.handleError(" + i + ") - done");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleHandshakeComplete$6(NetPublisher netPublisher) {
            ne7.m(PublisherImpl.TAG, "Callback.handleHandshakeComplete() - started");
            if (isActive() && !PublisherImpl.this.stopping) {
                netPublisher.publishStream(PublisherImpl.this.streamName);
                QualityController qualityController = PublisherImpl.this.qualityController;
                if (qualityController != null) {
                    qualityController.start(PublisherImpl.this.initialBitrate);
                }
                PublisherImpl publisherImpl = PublisherImpl.this;
                publisherImpl.switchByRate(publisherImpl.initialBitrate);
            }
            ne7.m(PublisherImpl.TAG, "Callback.handleHandshakeComplete() - done");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handlePublishingRestart$1() {
            ne7.m(PublisherImpl.TAG, "Callback.handlePublishingRestart() - started");
            if (!isActive()) {
                ne7.m(PublisherImpl.TAG, "Callback.handlePublishingRestart() - not active");
                return;
            }
            PublisherStateChangeListener publisherStateChangeListener = PublisherImpl.this.callback;
            if (publisherStateChangeListener != null) {
                publisherStateChangeListener.handleStarted();
            }
            PublisherImpl publisherImpl = PublisherImpl.this;
            publisherImpl.switchByRate(publisherImpl.initialBitrate);
            ne7.m(PublisherImpl.TAG, "Callback.handlePublishingRestart() - done");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handlePublishingStart$0(NetPublisher netPublisher) {
            ne7.m(PublisherImpl.TAG, "Callback.handlePublishingStart() - started");
            if (!isActive()) {
                ne7.m(PublisherImpl.TAG, "Callback.handlePublishingStart() - not active");
                return;
            }
            if (PublisherImpl.this.stopping) {
                ne7.m(PublisherImpl.TAG, "Callback.handlePublishingStart() - stopping");
                return;
            }
            ne7.m(PublisherImpl.TAG, "Callback.handlePublishingStart() - audio capture setup");
            PublisherImpl.this.notifyRendererStateChange(true);
            PublisherImpl publisherImpl = PublisherImpl.this;
            publisherImpl.audioCapture = publisherImpl.createAudioCapture();
            PublisherImpl.this.audioCapture.requestVoice(PublisherImpl.this.voiceMode, PublisherImpl.this.config.agc, PublisherImpl.this.config.ns, PublisherImpl.this.config.suppress16K);
            PublisherImpl.this.audioEffectsController.setCapture(PublisherImpl.this.audioCapture);
            PublisherImpl.this.audioCapture.setBitrate(PublisherImpl.this.audioBitrate);
            PublisherImpl.this.audioCapture.start();
            PublisherStateChangeListener publisherStateChangeListener = PublisherImpl.this.callback;
            if (publisherStateChangeListener != null) {
                ne7.m(PublisherImpl.TAG, "Callback.handlePublishingStart() - calling PublisherStateChangeListener.handleStarted()");
                publisherStateChangeListener.handleStarted();
            }
            PublisherImpl publisherImpl2 = PublisherImpl.this;
            publisherImpl2.switchByRate(publisherImpl2.initialBitrate);
            PublisherImpl.this.startNetworkMonitor(netPublisher, 2000);
            ne7.m(PublisherImpl.TAG, "Callback.handlePublishingStart() - completed");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleRestarted$5() {
            ne7.m(PublisherImpl.TAG, "Callback.handleRestarted() - started");
            PublisherStateChangeListener publisherStateChangeListener = PublisherImpl.this.callback;
            if (isActive() && !PublisherImpl.this.stopping && publisherStateChangeListener != null) {
                publisherStateChangeListener.handleStarted();
            }
            ne7.m(PublisherImpl.TAG, "Callback.handleRestarted() - done");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleRetrying$4() {
            ne7.m(PublisherImpl.TAG, "Callback.handleRetrying() - started");
            PublisherStateChangeListener publisherStateChangeListener = PublisherImpl.this.callback;
            if (isActive() && !PublisherImpl.this.stopping && publisherStateChangeListener != null) {
                publisherStateChangeListener.handleRetrying();
            }
            ne7.m(PublisherImpl.TAG, "Callback.handleRetrying() - done");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleStopped$2() {
            ne7.m(PublisherImpl.TAG, "Callback.handleStopped() - started");
            if (isActive()) {
                PublisherImpl.this.netPublisher = null;
                PublisherImpl.this.checkedClose();
            }
            ne7.m(PublisherImpl.TAG, "Callback.handleStopped() - done");
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public int getId() {
            return 0;
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleError(int i, final int i2) {
            ne7.m(PublisherImpl.TAG, "Callback.handleError(" + i2 + ")");
            PublisherImpl.this.executeOnInitThread(new Runnable() { // from class: ru.ok.media.j
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass2.this.lambda$handleError$3(i2);
                }
            });
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleHandshakeComplete(int i) {
            ne7.m(PublisherImpl.TAG, "Callback.handleHandshakeComplete()");
            PublisherImpl publisherImpl = PublisherImpl.this;
            final NetPublisher netPublisher = this.val$cbPublisher;
            publisherImpl.executeOnInitThread(new Runnable() { // from class: ru.ok.media.h
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass2.this.lambda$handleHandshakeComplete$6(netPublisher);
                }
            });
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handlePublishingRestart(int i) {
            ne7.m(PublisherImpl.TAG, "Callback.handlePublishingRestart()");
            PublisherImpl.this.executeOnInitThread(new Runnable() { // from class: ru.ok.media.e
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass2.this.lambda$handlePublishingRestart$1();
                }
            });
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handlePublishingStart(int i) {
            ne7.m(PublisherImpl.TAG, "Callback.handlePublishingStart()");
            PublisherImpl publisherImpl = PublisherImpl.this;
            final NetPublisher netPublisher = this.val$cbPublisher;
            publisherImpl.executeOnInitThread(new Runnable() { // from class: ru.ok.media.g
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass2.this.lambda$handlePublishingStart$0(netPublisher);
                }
            });
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleRestarted(int i) {
            ne7.m(PublisherImpl.TAG, "Callback.handleRestarted()");
            PublisherImpl.this.executeOnInitThread(new Runnable() { // from class: ru.ok.media.f
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass2.this.lambda$handleRestarted$5();
                }
            });
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleRetrying(int i) {
            ne7.m(PublisherImpl.TAG, "Callback.handleRetrying()");
            PublisherImpl.this.executeOnInitThread(new Runnable() { // from class: ru.ok.media.k
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass2.this.lambda$handleRetrying$4();
                }
            });
        }

        @Override // ru.ok.proto.NetPublisher.Callback
        public void handleStopped(int i) {
            ne7.m(PublisherImpl.TAG, "Callback.handleStopped()");
            PublisherImpl.this.executeOnInitThread(new Runnable() { // from class: ru.ok.media.i
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.AnonymousClass2.this.lambda$handleStopped$2();
                }
            });
        }
    }

    public class VideoDataHandler implements zds0 {
        private byte[] parameterSets;
        private final NetPublisher publisher;
        private int reportedVideoRotation = -1;

        public VideoDataHandler(NetPublisher netPublisher) {
            this.publisher = netPublisher;
        }

        private boolean isActive() {
            return this == PublisherImpl.this.videoDataHandler;
        }

        public void handleEndOfStream() {
            ne7.m(PublisherImpl.TAG, "VideoDataHandler.handleEndOfStream()");
            if (isActive()) {
                PublisherImpl.this.videoDataHandler = null;
                this.reportedVideoRotation = -1;
                PublisherImpl publisherImpl = PublisherImpl.this;
                publisherImpl.executeOnInitThread(new or4(publisherImpl, 9));
            }
        }

        @Override // xsna.zds0
        public void handleFormatChange(byte[] bArr) {
            ne7.m(PublisherImpl.TAG, "VideoDataHandler.handleFormatChange() - codecConfig=" + bArr);
            this.parameterSets = bArr;
            this.reportedVideoRotation = -1;
        }

        @Override // xsna.zds0
        public void handleSampleData(DataSample dataSample, long j, boolean z, int i) {
            try {
                int i2 = (int) (j / 1000);
                PublisherImpl.this.rotationController.setEncoderRotation(i);
                if (z && this.parameterSets != null) {
                    pushCodecHeaders(i2);
                }
                if (this.reportedVideoRotation != PublisherImpl.this.videoRotation) {
                    ne7.t(PublisherImpl.TAG, "rotation angle " + this.reportedVideoRotation + " -> " + PublisherImpl.this.videoRotation);
                    this.reportedVideoRotation = PublisherImpl.this.videoRotation;
                    this.publisher.setVideoRotation(PublisherImpl.this.videoRotation);
                }
                this.publisher.pushH264Frame(dataSample, z, i2, (int) (1000.0d / PublisherImpl.this.getFps()));
            } catch (Throwable th) {
                dataSample.release();
                throw th;
            }
        }

        @Override // xsna.zds0
        public boolean isBlocked() {
            return !PublisherImpl.this.qualityController.isVideoFrameAllowed();
        }

        @Override // xsna.zds0
        public boolean isKeyFrameRequested() {
            QualityController qualityController = PublisherImpl.this.qualityController;
            if (qualityController != null) {
                return qualityController.getAndResetKeyFrameRequest();
            }
            return false;
        }

        public void pushCodecHeaders(int i) {
            this.publisher.pushH264Headers(this.parameterSets, i);
        }
    }

    public PublisherImpl(Context context, PublisherConfiguration publisherConfiguration, boolean z, LoggerInterface loggerInterface) {
        TimedEvent timedEvent = new TimedEvent();
        this.startEvent = timedEvent;
        this.lastSwitchUp = new TimedEvent();
        this.lastSwitchDown = new TimedEvent();
        this.framePushExecutor = Executors.newSingleThreadScheduledExecutor();
        this.lastRenderEvent = new TimedEvent();
        this.framesCaptured = new AtomicLong();
        this.audioEffectsController = new AudioCaptureEffectsController();
        this.initialBitrate = -1L;
        RotationController rotationController = new RotationController();
        this.rotationController = rotationController;
        this.audioBitrate = 131072;
        this.mCameraPreviewSize = VideoSize.FULLHD_VIDEO_SIZE;
        this.videoBitrate = 1700000L;
        this.currentRateRange = BitrateConfiguration.START_RATE_RANGE;
        this.pauseEvent = new TimedEvent();
        this.videoSizeBlackList = new HashSet();
        this.nativeAudioProcessingFactory = 0L;
        this.cameraRotation = -1;
        this.cameraIsFront = false;
        this.videoRotation = 0;
        this.m_packetStats = new PacketStats();
        this.badNetworkPending = false;
        ne7.m(TAG, "PublisherImpl() - config=" + publisherConfiguration);
        this.logger = loggerInterface;
        this.rangeMap = publisherConfiguration.bitrateConfig.rangeMap;
        PublisherSharedPreferences publisherSharedPreferences = new PublisherSharedPreferences(context);
        this.sharedPrefs = publisherSharedPreferences;
        this.slowpokeIdx = publisherSharedPreferences.getSlowpokeIdx();
        this.maxVideoSize = getMaxVideoSize(publisherConfiguration);
        this.mEncoderVideoSize = this.maxVideoSize;
        this.mContext = context.getApplicationContext();
        hoo0 hoo0Var = new hoo0(createTSProvider(), publisherConfiguration.videoEncoderSettings, loggerInterface);
        this.videoEncoder = hoo0Var;
        this.connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        this.config = publisherConfiguration;
        HandlerThread handlerThread = new HandlerThread("publisherClientThread");
        this.workerThread = handlerThread;
        handlerThread.start();
        this.workerHandler = new Handler(this.workerThread.getLooper());
        timedEvent.signal();
        PublisherSurfaceRenderer publisherSurfaceRenderer = new PublisherSurfaceRenderer(this.mContext, hoo0Var, z, this.framesCaptured, rotationController);
        this.mRenderer = publisherSurfaceRenderer;
        publisherSurfaceRenderer.setPreviewSize(this.mCameraPreviewSize, 0);
        this.mRenderer.setMaxRenderSize(this.maxVideoSize);
        startSlowpokeMonitor();
    }

    private synchronized void capVideoSize() {
        try {
            VideoSize videoSize = new VideoSize(this.maxVideoSize);
            videoSize.makeSameOrientation(this.mEncoderVideoSize);
            if (this.mEncoderVideoSize.getWidth() <= videoSize.getWidth()) {
                if (this.mEncoderVideoSize.getHeight() > videoSize.getHeight()) {
                }
            }
            ne7.t(TAG, "Encoder performance is low; resolution " + this.mEncoderVideoSize + "=>" + videoSize);
            videoSize.makeSameOrientation(this.maxVideoSize);
            switchVideoSize(videoSize);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkedClose() {
        ne7.m(TAG, "checkedClose");
        if (this.stopping) {
            ConnectionsManager connectionsManager = this.connectionsManager;
            if (connectionsManager != null) {
                connectionsManager.close();
            }
            if (this.netPublisher != null) {
                this.netPublisher.stop();
                this.netPublisher = null;
            }
            PublisherStateChangeListener publisherStateChangeListener = this.callback;
            if (publisherStateChangeListener != null) {
                publisherStateChangeListener.handleStopped();
            }
            this.stopping = false;
            close();
        }
    }

    private void close() {
        ne7.m(TAG, "close()");
        Handler handler = this.workerHandler;
        HandlerThread handlerThread = this.workerThread;
        if (handler != null && handlerThread != null) {
            handler.postDelayed(new tw3(handlerThread, 20), ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
            this.workerThread = null;
            this.workerHandler = null;
        }
        PublisherCameraCallback publisherCameraCallback = this.publisherCameraCallback;
        if (publisherCameraCallback != null) {
            publisherCameraCallback.onClosed();
        }
        this.framePushExecutor.shutdown();
        ConnectionsManager connectionsManager = this.connectionsManager;
        if (connectionsManager != null) {
            connectionsManager.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioCaptureNative createAudioCapture() {
        ne7.m(TAG, "createAudioCapture()");
        NetPublisher netPublisher = this.netPublisher;
        SystemAudioConfiguration systemConfig = SystemAudioConfiguration.getSystemConfig(this.mContext, this.config.systemAudioCfg);
        String str = this.config.microphoneType;
        AudioCaptureNative.AudioEncoderParams audioEncoderParams = new AudioCaptureNative.AudioEncoderParams(44100, 1, getAudioBitrate());
        PublisherConfiguration publisherConfiguration = this.config;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(systemConfig, str, audioEncoderParams, publisherConfiguration.disguiseAudioShift, this.mContext, 128 == (publisherConfiguration.dump_flags & 128), new tto0(), -1L, netPublisher);
        anonymousClass1.setNativeAudioProcessingFactory(this.nativeAudioProcessingFactory);
        anonymousClass1.setForceOpenSL(this.forceOpenSL);
        anonymousClass1.setMuted(this.muted);
        return anonymousClass1;
    }

    @NonNull
    private NetPublisher.Callback createCallback(NetPublisher netPublisher) {
        ne7.m(TAG, "createCallback()");
        return new AnonymousClass2(netPublisher);
    }

    private cyo0 createTSProvider() {
        return new t34(this, 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeOnInitThread(Runnable runnable) {
        Handler handler = this.workerHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    private int getAudioBitrate() {
        return this.audioBitrate;
    }

    private int getFrameRateByBitrate(long j) {
        return 30;
    }

    private long getMaxBW() {
        return (this.rangeMap.get(this.maxVideoSize).getMaxRate() * 15) / 10;
    }

    private VideoSize getMaxVideoSize(PublisherConfiguration publisherConfiguration) {
        VideoSize videoSize = VideoSize.FAST_VIDEO_SIZE;
        com.android.grafika.a aVar = null;
        try {
            try {
                aVar = l370.u(this.mContext, publisherConfiguration.videoEncoderSettings, this.logger);
                for (VideoSize videoSize2 : this.rangeMap.keySet()) {
                    if (!aVar.i(videoSize2)) {
                        this.videoSizeBlackList.add(videoSize2);
                    }
                }
                if (this.videoSizeBlackList.size() == this.rangeMap.size()) {
                    ne7.n(TAG, "All resolutions are blacklisted, MediaCodec bug?");
                    this.videoSizeBlackList.clear();
                }
                Iterator<VideoSize> it = slowpokeVideoSize.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    VideoSize next = it.next();
                    int i2 = i + 1;
                    if (i >= this.slowpokeIdx) {
                        if (next.getMin() <= publisherConfiguration.maxRes) {
                            videoSize = next;
                            break;
                        }
                        videoSize = next;
                    }
                    i = i2;
                }
                VideoSize selectSupportedSize = selectSupportedSize(videoSize);
                aVar.c();
                return selectSupportedSize;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (aVar != null) {
                aVar.c();
            }
            throw th;
        }
    }

    private void increaseSlowpokeIdx() {
        ne7.m(TAG, "increaseSlowpokeIdx()");
        List<VideoSize> list = slowpokeVideoSize;
        int min = Math.min(list.size() - 1, this.slowpokeIdx + 1);
        if (min > this.slowpokeIdx) {
            QualityController qualityController = this.qualityController;
            if (qualityController != null) {
                qualityController.setSlowpokeIdx(min);
            }
            this.slowpokeIdx = min;
            this.maxVideoSize = selectSupportedSize(list.get(min));
            ConnectionsManager connectionsManager = this.connectionsManager;
            if (connectionsManager != null) {
                connectionsManager.limitBW(getMaxBW());
            }
            this.mRenderer.setMaxRenderSize(this.maxVideoSize);
            ne7.J(TAG, "Device is slow, idx=" + this.slowpokeIdx + " setting max size to " + this.maxVideoSize);
            this.sharedPrefs.setSlowpokeIdx(Math.max(0, this.slowpokeIdx + (-1)));
            updateCameraResolution();
        }
    }

    private boolean isLowPerformance() {
        hoo0 hoo0Var = this.videoEncoder;
        if (hoo0Var != null) {
            int max = this.mEncoderVideoSize.getMax();
            int i = 1000 / (max <= VideoSize.FASTER_VIDEO_SIZE.getMax() ? 12 : max <= VideoSize.FAST_VIDEO_SIZE.getMax() ? 18 : max <= VideoSize.HD_VIDEO_SIZE.getMax() ? 22 : 24);
            com.android.grafika.a aVar = hoo0Var.c;
            if (aVar != null) {
                TimeSampler timeSampler = aVar.o;
                long totalTime = timeSampler.getTotalTime() / 1000000;
                long totalCalls = timeSampler.getTotalCalls();
                if (totalTime > 500 && totalTime / totalCalls > i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ long lambda$createTSProvider$1() {
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            return audioCaptureNative.getCurrentTime();
        }
        ne7.J(TAG, "Cannot handle video sample: audio capture was finalized");
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyRendererStateChange$10(boolean z) {
        this.mRenderer.setCallback(this.netPublisher != null ? new VideoDataHandler(this.netPublisher) : null);
        PublisherCameraCallback publisherCameraCallback = this.publisherCameraCallback;
        if (publisherCameraCallback != null) {
            publisherCameraCallback.rendererStateHasChange(z);
        }
        if (z) {
            this.videoEncoder.c();
        } else {
            this.videoEncoder.d();
        }
        this.mRenderer.updateRecordingState();
        this.videoEncoder.e();
        VideoDataHandler videoDataHandler = this.videoDataHandler;
        if (videoDataHandler == null || z) {
            return;
        }
        videoDataHandler.handleEndOfStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$3() {
        this.mRenderer.notifyPausing();
        this.mRenderer.updateRecordingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$4() {
        ConnectionsManager connectionsManager = this.connectionsManager;
        if (connectionsManager != null) {
            connectionsManager.setBackground(true);
        }
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            audioCaptureNative.pause();
        }
        if (this.netPublisher != null) {
            this.netPublisher.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resume$2() {
        ConnectionsManager connectionsManager = this.connectionsManager;
        if (connectionsManager != null) {
            connectionsManager.setBackground(false);
        }
        if (this.netPublisher == null || this.audioCapture == null) {
            return;
        }
        this.netPublisher.resume();
        this.audioCapture.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeConnection$11() {
        ConnectionsManager connectionsManager = this.connectionsManager;
        if (connectionsManager != null) {
            connectionsManager.setBackground(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUrls$5(Collection collection) {
        if (this.connectionsManager == null) {
            ConnectionsManager connectionsManager = new ConnectionsManager(this.workerThread, this.config, START_VIDEO_BIT_RATE, this.logger);
            this.connectionsManager = connectionsManager;
            connectionsManager.limitBW(getMaxBW());
            this.connectionsManager.setUrls(collection);
            this.connectionsManager.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startNetworkClient$12() {
        ne7.m(TAG, "startNetworkClient() - closure");
        try {
            if (this.stopping) {
                return;
            }
            ConnectionsManager connectionsManager = this.connectionsManager;
            if (connectionsManager == null) {
                ne7.J(TAG, "Unexpected null connections manager");
                sendErrorToCallback(12);
                stopPublishing();
                return;
            }
            connectionsManager.start();
            ConnectionsManager.Connection selectPublisher = this.connectionsManager.selectPublisher();
            if (selectPublisher == null) {
                startNetworkClient(100);
                return;
            }
            long measuredBandwidth = selectPublisher.getMeasuredBandwidth();
            if (measuredBandwidth > 0) {
                ne7.t(TAG, "Measured initial bw: " + measuredBandwidth);
            } else {
                measuredBandwidth = NetworkConnection.estimateConnectionSpeed(this.connectivityManager);
                ne7.t(TAG, "Estimated initial bw: " + measuredBandwidth);
            }
            long trimValue = this.config.getRateRange(new AudioAdaptationConfig.Entry()).trimValue(measuredBandwidth);
            ne7.t(TAG, "Initial bw trimmed from " + measuredBandwidth + " to " + trimValue);
            this.initialBitrate = trimValue;
            this.audioBitrate = PublisherConfiguration.audioRateForBandwidth(trimValue);
            this.videoBitrate = (long) PublisherConfiguration.videoRateForBandwidth(this.initialBitrate);
            BitrateConfiguration.FindResult find = this.config.bitrateConfig.find(this.initialBitrate);
            if (find != null) {
                this.mEncoderVideoSize = find.videoSize;
                this.currentRateRange = find.rateRange;
            } else {
                this.mEncoderVideoSize = this.maxVideoSize;
                this.currentRateRange = BitrateConfiguration.START_RATE_RANGE;
            }
            this.netPublisher = selectPublisher.publisher;
            selectPublisher.attachCallback(createCallback(selectPublisher.publisher));
            QualityController qualityController = this.netPublisher.getQualityController();
            this.qualityController = qualityController;
            qualityController.setSlowpokeIdx(this.slowpokeIdx);
            this.videoDataHandler = new VideoDataHandler(this.netPublisher);
            this.netPublisher.setVideoSize(this.mEncoderVideoSize);
        } catch (IOException e) {
            ne7.n(TAG, "Failed to start network client: " + e);
            sendErrorToCallback(10);
            stopPublishing();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startNetworkMonitor$13(NetPublisher netPublisher) {
        if (this.stopping || netPublisher != this.netPublisher) {
            return;
        }
        if (this.mRenderer != null) {
            switchQuality();
            updateCameraResolution();
        }
        startNetworkMonitor(netPublisher, NETWORK_MONITOR_DELAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPublishing$8() {
        if (this.stopping) {
            sendErrorToCallback(12);
        } else {
            startNetworkClient(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startPublishing$9() {
        if (this.publisherCameraCallback != null && this.lastRenderEvent.elapsed(-1) > 100 && this.publisherCameraCallback.requestRender()) {
            this.lastRenderEvent.signal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSlowpokeMonitor$0() {
        if (this.stopping || this.startEvent.elapsed() > ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
            return;
        }
        if (this.startEvent.elapsed() > 10000) {
            this.sharedPrefs.setSlowpokeIdx(Math.max(0, this.slowpokeIdx - 1));
        }
        if (isLowPerformance()) {
            increaseSlowpokeIdx();
            resetPerformanceCounter();
        }
        capVideoSize();
        startSlowpokeMonitor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopNetworkLoad$6() {
        ConnectionsManager connectionsManager = this.connectionsManager;
        if (connectionsManager != null) {
            connectionsManager.stopBenchmark();
        }
        updateCameraResolution();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopPublishing$7() {
        ConnectionsManager connectionsManager = this.connectionsManager;
        if (connectionsManager != null) {
            connectionsManager.close();
        }
        if (this.stopping) {
            return;
        }
        this.stopping = true;
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            audioCaptureNative.stop();
        } else {
            checkedClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchByRate$14(long j) {
        Map.Entry<VideoSize, RateRange> entry;
        ne7.m(TAG, "switchByRate(" + j + ") - started");
        int audioRateForBandwidth = PublisherConfiguration.audioRateForBandwidth(j);
        setAudioBitrate(audioRateForBandwidth);
        long j2 = (long) audioRateForBandwidth;
        long j3 = j - j2;
        long j4 = this.config.maxVideoBitrate;
        long j5 = 0;
        if (j4 > 0 && j3 > j4) {
            StringBuilder b = fp.b(j, "switchByRate(", ") - applying max_video_bitrate (");
            b.append(j4);
            ne7.t(TAG, e630.c(b, ") to targetRate (", j3, ")"));
            j3 = j4;
        }
        VideoSize videoSize = this.mEncoderVideoSize;
        if (this.currentRateRange.isRateAccepted(j3)) {
            Iterator<Map.Entry<VideoSize, RateRange>> it = this.rangeMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<VideoSize, RateRange> next = it.next();
                if (next.getValue() == this.currentRateRange) {
                    videoSize = next.getKey();
                    ne7.t(TAG, "switchByRate(" + j + ") - from matching entry: videoSize= " + videoSize);
                    break;
                }
            }
        } else {
            Iterator<Map.Entry<VideoSize, RateRange>> it2 = this.rangeMap.entrySet().iterator();
            long j6 = 1700000;
            Map.Entry<VideoSize, RateRange> entry2 = null;
            Map.Entry<VideoSize, RateRange> entry3 = null;
            while (true) {
                if (!it2.hasNext()) {
                    entry = null;
                    break;
                }
                Map.Entry<VideoSize, RateRange> next2 = it2.next();
                RateRange value = next2.getValue();
                if (value.getMaxRate() > j5) {
                    j5 = value.getMaxRate();
                    entry2 = next2;
                }
                if (value.getMinRate() < j6) {
                    j6 = value.getMinRate();
                    entry3 = next2;
                }
                if (value.isRateAccepted(j3)) {
                    entry = next2;
                    break;
                }
            }
            if (j3 > j5) {
                entry = entry2;
                j3 = j5;
            } else if (j3 < j6) {
                j3 = j6;
                entry = entry3;
            }
            videoSize = entry == null ? VideoSize.HD_VIDEO_SIZE : entry.getKey();
            this.currentRateRange = entry == null ? BitrateConfiguration.START_RATE_RANGE : entry.getValue();
            StringBuilder b2 = fp.b(j, "switchByRate(", ") - ");
            b2.append(entry == null ? "not " : "");
            b2.append("found, targetRate= ");
            b2.append(j3);
            b2.append(" videoSize= ");
            b2.append(videoSize);
            ne7.t(TAG, b2.toString());
        }
        if (videoSize.getHeight() > this.maxVideoSize.getHeight() || videoSize.getWidth() > this.maxVideoSize.getWidth()) {
            videoSize = this.maxVideoSize;
            ne7.t(TAG, "switchByRate(" + j + ") - restricted by _maxVideoSize: videoSize= " + videoSize);
        }
        VideoSize videoSize2 = this.mCameraPreviewSize;
        if (videoSize.getWidth() > videoSize2.getWidth() || videoSize.getHeight() > videoSize2.getHeight()) {
            Iterator<VideoSize> it3 = slowpokeVideoSize.iterator();
            while (it3.hasNext()) {
                videoSize = it3.next();
                if (videoSize.getWidth() <= videoSize2.getWidth() || videoSize.getHeight() <= videoSize2.getHeight()) {
                    break;
                }
            }
            ne7.t(TAG, "switchByRate(" + j + ") - restricted by _mCameraPreviewSize (" + videoSize2 + "): videoSize= " + videoSize);
        }
        Iterator<Map.Entry<VideoSize, RateRange>> it4 = this.rangeMap.entrySet().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Map.Entry<VideoSize, RateRange> next3 = it4.next();
            if (next3.getKey() == videoSize) {
                long maxRate = (next3.getValue().getMaxRate() * 15) / 10;
                if (j3 > maxRate) {
                    StringBuilder b3 = fp.b(j, "switchByRate(", ") - rate restricted by 3/2 of max rate (");
                    b3.append(next3.getValue().getMaxRate());
                    b3.append("): targetRate= ");
                    b3.append(maxRate);
                    ne7.t(TAG, b3.toString());
                    j3 = maxRate;
                }
            }
        }
        boolean z = this.videoBitrate != j3;
        boolean equalsWithoutOrientation = this.mEncoderVideoSize.equalsWithoutOrientation(videoSize);
        NetPublisher netPublisher = this.netPublisher;
        if (netPublisher != null) {
            netPublisher.setBitrates(j2, j3);
        }
        updateBitrateSettings(j);
        if (!z && equalsWithoutOrientation) {
            ne7.m(TAG, "switchByRate(" + j + ") - done (no need to switch)");
            return;
        }
        if (z) {
            ne7.t(TAG, "Switcher: bitrate " + this.videoBitrate + "=>" + j3);
            this.videoBitrate = j3;
        }
        if (!equalsWithoutOrientation) {
            ne7.t(TAG, "Switcher: resolution " + this.mEncoderVideoSize + "=>" + videoSize);
        }
        switchVideoSize(videoSize);
        ne7.m(TAG, "switchByRate(" + j + ") - ended");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRendererStateChange(final boolean z) {
        ne7.m(TAG, "notifyRendererStateChange(" + z + ")");
        updateRendererVideoSize();
        PublisherCameraCallback publisherCameraCallback = this.publisherCameraCallback;
        if (publisherCameraCallback != null) {
            publisherCameraCallback.runOnGLThread(new Runnable() { // from class: xsna.ife0
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherImpl.this.lambda$notifyRendererStateChange$10(z);
                }
            });
        }
    }

    private void resetPerformanceCounter() {
        com.android.grafika.a aVar;
        hoo0 hoo0Var = this.videoEncoder;
        if (hoo0Var == null || (aVar = hoo0Var.c) == null) {
            return;
        }
        aVar.o = new TimeSampler();
    }

    private VideoSize selectSupportedSize(VideoSize videoSize) {
        VideoSize videoSize2 = videoSize;
        while (this.videoSizeBlackList.contains(videoSize2)) {
            SortedMap<VideoSize, RateRange> headMap = this.rangeMap.headMap(videoSize2);
            if (headMap.isEmpty()) {
                break;
            }
            videoSize2 = headMap.lastKey();
        }
        while (this.videoSizeBlackList.contains(videoSize2)) {
            SortedMap<VideoSize, RateRange> tailMap = this.rangeMap.tailMap(videoSize2);
            if (tailMap.isEmpty()) {
                break;
            }
            videoSize2 = tailMap.firstKey();
        }
        return this.videoSizeBlackList.contains(videoSize2) ? videoSize : videoSize2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendErrorToCallback(int i) {
        ne7.m(TAG, "sendErrorToCallback(" + i + ")");
        PublisherStateChangeListener publisherStateChangeListener = this.callback;
        if (publisherStateChangeListener != null) {
            publisherStateChangeListener.handleError(i);
        }
    }

    private void setAudioBitrate(int i) {
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            audioCaptureNative.setBitrate(i);
        }
        if (this.audioBitrate == i) {
            ne7.t(TAG, "setAudioBitrate(" + i + ") - same");
            return;
        }
        StringBuilder b = ji.b(i, "setAudioBitrate(", ") - from ");
        b.append(this.audioBitrate);
        ne7.t(TAG, b.toString());
        this.audioBitrate = i;
    }

    private void startNetworkClient(int i) {
        ne7.m(TAG, "startNetworkClient()");
        Handler handler = this.workerHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new b04(this, 12), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startNetworkMonitor(NetPublisher netPublisher, int i) {
        this.lastSwitchUp.signalOnce();
        this.workerHandler.postDelayed(new qo2(7, this, netPublisher), i);
    }

    private void startSlowpokeMonitor() {
        Handler handler = this.workerHandler;
        if (handler != null) {
            handler.postDelayed(new n93(this, 7), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void switchByRate(final long j) {
        ne7.m(TAG, "switchByRate(" + j + ")");
        updateBitrateSettings(j);
        this.workerHandler.post(new Runnable() { // from class: xsna.hfe0
            @Override // java.lang.Runnable
            public final void run() {
                PublisherImpl.this.lambda$switchByRate$14(j);
            }
        });
    }

    private synchronized boolean switchQuality() {
        QualityController qualityController = this.qualityController;
        if (qualityController == null) {
            return false;
        }
        long selectedBandwidth = qualityController.getSelectedBandwidth();
        long update = qualityController.update();
        if (update == selectedBandwidth) {
            return false;
        }
        switchByRate(update);
        return true;
    }

    private void switchVideoSize(VideoSize videoSize) {
        ne7.m(TAG, "switchVideoSize(" + videoSize + ") - from " + this.mEncoderVideoSize);
        if (!this.mEncoderVideoSize.equalsWithoutOrientation(videoSize)) {
            VideoSize selectSupportedSize = selectSupportedSize(videoSize);
            selectSupportedSize.makeSameOrientation(this.mEncoderVideoSize);
            this.mEncoderVideoSize = selectSupportedSize;
        }
        updateRendererVideoSize();
    }

    private void updateBitrateSettings(long j) {
        ne7.m(TAG, "updateBitrateSettings(" + j + ")");
        QualityController qualityController = this.qualityController;
        if (qualityController != null) {
            qualityController.setTargetBitrate(j);
        }
        if (this.netPublisher != null) {
            this.netPublisher.updateBuffers();
        }
    }

    private void updateCameraResolution() {
        int max = this.maxVideoSize.getMax();
        VideoSize videoSize = VideoSize.FULLHD_VIDEO_SIZE;
        if (max >= videoSize.getMax() || this.mCameraPreviewSize.getMax() >= videoSize.getMax()) {
            return;
        }
        ne7.m(TAG, "updateCameraResolution()");
        PublisherCameraCallback publisherCameraCallback = this.publisherCameraCallback;
        if (publisherCameraCallback != null) {
            publisherCameraCallback.updateCameraResolution();
        }
    }

    @Override // ru.ok.media.api.Publisher
    public AudioEffectController getAudioEffectsController() {
        return this.audioEffectsController;
    }

    @Override // ru.ok.media.api.Publisher
    public long getAudioEncoderBitrate() {
        return getAudioBitrate();
    }

    @Override // ru.ok.media.api.Publisher
    public long getBitrate() {
        if (this.netPublisher != null) {
            return this.netPublisher.getBitrate();
        }
        return 0L;
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public VideoSize getCameraResolution() {
        return this.mCameraPreviewSize;
    }

    @Override // ru.ok.media.api.Publisher
    public long getCurrentBandwidth() {
        QualityController qualityController = this.qualityController;
        if (qualityController != null) {
            return qualityController.getBandwidth();
        }
        return 0L;
    }

    @Override // ru.ok.media.api.Publisher
    public long getCurrentPosition() {
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative == null) {
            return 0L;
        }
        return audioCaptureNative.getCurrentTime();
    }

    @Override // ru.ok.media.api.Publisher
    @NonNull
    public String getDebugInfo() {
        NetPublisher netPublisher = this.netPublisher;
        return netPublisher != null ? netPublisher.getDebugInfo() : "";
    }

    @Override // ru.ok.media.api.Publisher
    @NonNull
    public VideoSize getEncoderResolution() {
        return this.mEncoderVideoSize;
    }

    @Override // ru.ok.media.api.Publisher
    public double getFps() {
        return this.videoEncoder.n.c.get().doubleValue();
    }

    @Override // ru.ok.media.api.Publisher
    public NetStats getNetStats() {
        NetPublisher netPublisher = this.netPublisher;
        if (netPublisher == null) {
            return null;
        }
        return netPublisher.getNetStats();
    }

    @Override // ru.ok.media.api.Publisher
    @NonNull
    public PacketStats getPacketStats() {
        PacketStats packetStats = new PacketStats(this.m_packetStats);
        if (this.netPublisher != null) {
            packetStats.add(this.netPublisher.getPacketStats());
        }
        return packetStats;
    }

    @Override // ru.ok.media.api.Publisher
    public VideoSize getPerformanceLimitResolution() {
        return this.maxVideoSize;
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public VideoSize getPreferredPreviewSize() {
        int max = this.maxVideoSize.getMax();
        VideoSize videoSize = VideoSize.HD_VIDEO_SIZE;
        return max <= videoSize.getMax() ? videoSize : VideoSize.FULLHD_VIDEO_SIZE;
    }

    @Override // ru.ok.media.api.Publisher
    public String getProtocolName() {
        return this.netPublisher != null ? this.netPublisher.getName() : "OkLive";
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public PublisherRenderer getRenderer() {
        return this.mRenderer;
    }

    @Override // ru.ok.media.api.Publisher
    public int getRotationAngle() {
        return this.cameraRotation;
    }

    @Override // ru.ok.media.api.Publisher
    public long getVideoBitrate() {
        return this.videoBitrate;
    }

    @Override // ru.ok.media.api.Publisher
    public long getVideoEncoderBitrate() {
        return getVideoBitrate();
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public int getVideoRotation() {
        return this.videoRotation;
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public boolean isCameraClientActive() {
        return !isStopping();
    }

    @Override // ru.ok.media.api.Publisher
    public boolean isClosed() {
        return this.workerThread == null;
    }

    @Override // ru.ok.media.api.Publisher
    public boolean isPause() {
        return this.netPublisher != null && this.netPublisher.isPaused();
    }

    @Override // ru.ok.media.api.Publisher
    public boolean isPublishing() {
        return this.publishing;
    }

    @Override // ru.ok.media.api.Publisher
    public boolean isStopping() {
        return this.stopping;
    }

    public void mixAudio(int i, int i2, ByteBuffer byteBuffer) {
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            audioCaptureNative.mixAudio(i, i2, byteBuffer);
        }
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void onFrameCaptured() {
        this.framesCaptured.incrementAndGet();
        this.lastRenderEvent.signal();
    }

    @Override // ru.ok.media.api.Publisher
    public void pause() {
        ne7.m(TAG, "pause()");
        PublisherCameraCallback publisherCameraCallback = this.publisherCameraCallback;
        if (publisherCameraCallback != null) {
            publisherCameraCallback.runOnGLThread(new bv9(this, 12));
        }
        this.pauseEvent.signal();
        executeOnInitThread(new tn9(this, 14));
        QualityController qualityController = this.qualityController;
        if (qualityController != null) {
            qualityController.pause();
        }
    }

    @Override // ru.ok.media.api.Publisher
    public void requestVoice(boolean z) {
        ne7.m(TAG, "requestVoice(" + z + ")");
        this.voiceMode = z;
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            PublisherConfiguration publisherConfiguration = this.config;
            audioCaptureNative.requestVoice(z, publisherConfiguration.agc, publisherConfiguration.ns, publisherConfiguration.suppress16K);
        }
    }

    @Override // ru.ok.media.api.Publisher
    public boolean resume() {
        ne7.m(TAG, "resume()");
        if (isClosed()) {
            return false;
        }
        QualityController qualityController = this.qualityController;
        if (qualityController != null) {
            qualityController.resume();
        }
        if (this.pauseEvent.elapsed() > this.config.resumeTimeout) {
            return false;
        }
        if (isPause()) {
            notifyRendererStateChange(true);
            executeOnInitThread(new o93(this, 21));
        }
        return true;
    }

    @Override // ru.ok.media.api.Publisher
    public void resumeConnection() {
        ne7.m(TAG, "resumeConnection()");
        executeOnInitThread(new ef2(this, 17));
    }

    @Override // ru.ok.media.api.Publisher
    public void setCameraCallback(PublisherCameraCallback publisherCameraCallback) {
        ne7.m(TAG, "setCameraCallback(" + publisherCameraCallback + ")");
        this.publisherCameraCallback = publisherCameraCallback;
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void setCameraIsExternal(boolean z) {
        this.cameraIsExternal = z;
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void setCameraIsFront(boolean z) {
        this.cameraIsFront = z;
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void setCameraPreviewSize(VideoSize videoSize) {
        ne7.t(TAG, "setCameraPreviewSize(" + videoSize + ")");
        this.mCameraPreviewSize = videoSize;
        this.mRenderer.setPreviewSize(videoSize);
        switchByRate(this.videoBitrate + ((long) getAudioBitrate()));
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void setCameraRotation(int i) {
        this.cameraRotation = i;
    }

    @Override // ru.ok.media.api.Publisher
    public void setForceOpenSL(boolean z) {
        ne7.m(TAG, "setForceOpenSL(" + z + ")");
        this.forceOpenSL = z;
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            audioCaptureNative.setForceOpenSL(z);
        }
    }

    @Override // ru.ok.media.api.Publisher
    public void setMuted(boolean z) {
        this.muted = z;
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            audioCaptureNative.setMuted(z);
        }
    }

    @Override // ru.ok.media.api.Publisher
    public void setNativeAudioProcessingFactory(long j) {
        ne7.m(TAG, "setNativeAudioProcessingFactory(" + j + ")");
        this.nativeAudioProcessingFactory = j;
        AudioCaptureNative audioCaptureNative = this.audioCapture;
        if (audioCaptureNative != null) {
            audioCaptureNative.setNativeAudioProcessingFactory(j);
        }
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void setRendererListener(PublisherRendererCallback publisherRendererCallback) {
        ne7.m(TAG, "setRendererListener(" + publisherRendererCallback + ")");
        this.mRenderer.setRendererListener(publisherRendererCallback);
    }

    @Override // ru.ok.media.api.Publisher
    public void setStateChangeListener(PublisherStateChangeListener publisherStateChangeListener) {
        ne7.m(TAG, "setStateChangeListener(" + publisherStateChangeListener + ")");
        this.callback = publisherStateChangeListener;
    }

    @Override // ru.ok.media.api.Publisher
    public void setStreamName(@NonNull String str) {
        ne7.m(TAG, "setStreamName() - " + str);
        this.streamName = str;
    }

    @Override // ru.ok.media.api.Publisher
    public void setUrls(Collection<String> collection) {
        ne7.m(TAG, "setUrls() - " + collection);
        executeOnInitThread(new xy4(5, this, collection));
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void setVideoRotation(int i) {
        ne7.t(TAG, "rotation=" + i);
        while (i < 0) {
            i += 360000;
        }
        int i2 = i % 360;
        this.videoRotation = i2;
        if (this.netPublisher != null) {
            this.netPublisher.setVideoRotation(i2);
        }
    }

    @Override // ru.ok.media.api.Publisher
    public void startPublishing() {
        ne7.t(TAG, "startPublishing()");
        this.publishing = true;
        executeOnInitThread(new xqc(this, 9));
        try {
            if (!this.framePushExecutor.isShutdown()) {
                if (this.framePushExecutor.isTerminated()) {
                }
                this.framePushExecutor.scheduleWithFixedDelay(new b3m(this, 6), 50L, 50L, TimeUnit.MILLISECONDS);
            }
            this.framePushExecutor = Executors.newSingleThreadScheduledExecutor();
            this.framePushExecutor.scheduleWithFixedDelay(new b3m(this, 6), 50L, 50L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            ne7.J(TAG, "Failed to start frame push cycle: " + e);
        }
    }

    @Override // ru.ok.media.api.Publisher
    public void stopNetworkLoad() {
        ne7.m(TAG, "stopNetworkLoad()");
        executeOnInitThread(new ou4(this, 8));
    }

    @Override // ru.ok.media.api.Publisher
    public void stopPublishing() {
        ne7.m(TAG, "stopPublishing()");
        this.publishing = false;
        notifyRendererStateChange(false);
        executeOnInitThread(new u12(this, 10));
    }

    @Override // ru.ok.media.api.PublisherCameraClient
    public void updateRendererVideoSize() {
        ne7.m(TAG, "updateRendererVideoSize()");
        this.mRenderer.setVideoSize(this.mEncoderVideoSize.getWidth(), this.mEncoderVideoSize.getHeight(), this.cameraRotation, this.cameraIsFront, this.cameraIsExternal, (int) this.videoBitrate, getFrameRateByBitrate(this.videoBitrate), this.config.iframeIntervalSeconds);
        NetPublisher netPublisher = this.netPublisher;
        if (netPublisher != null) {
            netPublisher.setVideoSize(this.mEncoderVideoSize);
        }
    }

    @Override // ru.ok.media.api.Publisher
    @NonNull
    public PublisherCameraClient getCameraClient() {
        return this;
    }
}
