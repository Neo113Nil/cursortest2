package ru.ok.media;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.opengles.GL10;
import kotlin.NoWhenBranchMatchedException;
import one.video.streaming.tools.TimeMachine;
import ru.ok.media.ConnectionBenchmark;
import ru.ok.media.OkmpStreamPublisher;
import ru.ok.media.api.AACAudioProvider;
import ru.ok.media.api.H264VideoProvider;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.VideoCBRMode;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.RateRange;
import ru.ok.media.utils.VideoSize;
import ru.ok.media.video.H264Encoder;
import ru.ok.proto.AudioAdaptationConfig;
import ru.ok.proto.AudioParams;
import ru.ok.proto.BitrateConfiguration;
import ru.ok.proto.NetPublisher;
import ru.ok.proto.PacketStats;
import ru.ok.proto.PublisherConfiguration;
import ru.ok.proto.okmp.OkmpHandler;
import ru.ok.proto.okmp.OkmpPublisherNative;
import ru.ok.proto.okmp.PlatformSpecificInfo;
import ru.ok.proto.okmp.QualityControllerNativeProxy;
import xsna.a040;
import xsna.asp;
import xsna.bp7;
import xsna.e43;
import xsna.e630;
import xsna.epx;
import xsna.fp;
import xsna.fr20;
import xsna.ft5;
import xsna.gd70;
import xsna.gsi0;
import xsna.gzs;
import xsna.izs;
import xsna.jz70;
import xsna.k7z;
import xsna.l370;
import xsna.ne7;
import xsna.nm60;
import xsna.odj;
import xsna.qox;
import xsna.r490;
import xsna.s3q0;
import xsna.so40;
import xsna.tj0;
import xsna.tto0;
import xsna.tvo0;
import xsna.w100;
import xsna.wzs;
import xsna.yzs;
import xsna.zcl;
import xsna.zrp;
import xsna.zvo0;

/* compiled from: OkmpStreamPublisher.kt */
/* loaded from: classes9.dex */
public final class OkmpStreamPublisher {
    private static final int AUDIO_CHANNEL_COUNT = 1;
    private static final long INITIAL_NETWORK_MONITOR_DELAY = 2000;
    private static final long NETWORK_MONITOR_DELAY = 350;
    private static final int OKMP_OVERHEAD_PERCENT = 20;
    private static final long START_AUDIO_BIT_RATE = 131072;
    private static final long START_VIDEO_BIT_RATE = 1700000;
    private static final String TAG = "Publisher";
    private static final int VIDEO_ENCODER_FPS = 30;
    private static final int senderOkmpStreamPublisher_AVCaptureAudioDataOutputSampleBufferDelegate_captureOutput = 1014;
    private static final int senderOkmpStreamPublisher_AudioCaptureNative_handleError = 1017;
    private static final int senderOkmpStreamPublisher_AudioCaptureNative_handleStopped = 1016;
    private static final int senderOkmpStreamPublisher_VideoCapture_handleError = 1019;
    private static final int senderOkmpStreamPublisher_VideoCapture_handleStopped = 1018;
    private static final int senderOkmpStreamPublisher_debugSetTargetBitrate = 1013;
    private static final int senderOkmpStreamPublisher_didOutputVideoPixelBuffer = 1006;
    private static final int senderOkmpStreamPublisher_doFail = 1010;
    private static final int senderOkmpStreamPublisher_fail = 1015;
    private static final int senderOkmpStreamPublisher_handleError = 1011;
    private static final int senderOkmpStreamPublisher_handleHandshakeComplete = 1012;
    private static final int senderOkmpStreamPublisher_networkMonitorTick = 1000;
    private static final int senderOkmpStreamPublisher_pause = 1003;
    private static final int senderOkmpStreamPublisher_prepare = 1007;
    private static final int senderOkmpStreamPublisher_resume = 1004;
    private static final int senderOkmpStreamPublisher_start = 1008;
    private static final int senderOkmpStreamPublisher_startAudioEncoding = 1005;
    private static final int senderOkmpStreamPublisher_stop = 1009;
    private static final int senderOkmpStreamPublisher_stopPublishing = 1002;
    private static final int senderOkmpStreamPublisher_switchByRate = 1001;
    private AACAudioProvider.Params _aacParams;
    private int _audioPacketDurationMs;
    private ConnectionBenchmark _connectionBenchmark;
    private OkmpConnectionConfig _connectionConfig;
    private RateRange _currentRateRange;
    private final int _dbgBandwidthDropKBps;
    private final int _dbgBandwidthDropPeriodSeconds;
    private long _dbgLastQualityChangeMs;
    private final izs<Integer, s3q0> _debugJobStarted;
    private String _disconnectReasonString;
    private volatile boolean _failing;
    private int _firstPublisherError;
    private final ft5 _fpsCounter;
    private H264Encoder _h264Encode;
    private H264VideoProvider.Params _h264Params;
    private volatile boolean _handshakeComplete;
    private volatile long _initialBitrate;
    private volatile Integer _lastCapturedFrameHeight;
    private volatile Integer _lastCapturedFrameWidth;
    private volatile VideoSize _mEncoderVideoSize;
    private VideoSize _maxVideoSize;
    private qox _networkMonitor;
    private PacketStats _okmpPacketStats;
    private zvo0 _pauseEvent;
    private zvo0 _prepareEvent;
    private OkmpPublisherNative _publisher;
    private NetPublisher.Callback _publisherCallback;
    private final PublisherConfiguration _publisherConfig;
    private volatile boolean _publishing;
    private final wzs<Integer, gzs<s3q0>, s3q0> _queueJob;
    private final yzs<Integer, Long, gzs<s3q0>, s3q0> _queueJobDelayed;
    private final SortedMap<VideoSize, RateRange> _rangeMap;
    private volatile Integer _reportedVideoRotation;
    private AudioAdaptationConfig.Entry _selectedAudioConfigEntry;
    private zvo0 _startEvent;
    private long _startTimeMs;
    private volatile boolean _stopping;
    private final TimeMachine _timeMachine;
    private long _videoBitrate;
    private long _videoFrameSkipCounter;
    private AtomicLong _videoFramesDropped;
    private final AACAudioProvider aacEncode;
    private final VideoCBRMode cbrMode;
    private final int connectionId;
    private Delegate delegate;
    private final LoggerInterface logger;
    private volatile State state;
    private final boolean useRelativeTimestamps;
    private final int videoBitrateMarginPercent;
    private final HandlerThread workerThread;
    private final Handler workingQueue;
    public static final Companion Companion = new Companion(null);
    private static final List<VideoSize> slowpokeVideoSize = e43.l(VideoSize.FULLHD_VIDEO_SIZE, VideoSize.HD_VIDEO_SIZE, VideoSize.FAST_VIDEO_SIZE, VideoSize.FASTER_VIDEO_SIZE, VideoSize.FASTEST_VIDEO_SIZE);
    private static final Set<VideoSize> videoSizeBlackList = new LinkedHashSet();
    private static final AtomicInteger s_nextId = new AtomicInteger(0);
    private static final AtomicInteger s_nextVideoConsumerId = new AtomicInteger(0);

    /* compiled from: OkmpStreamPublisher.kt */
    public final class AudioConsumer implements AACAudioProvider.Consumer {
        private AACAudioProvider.Params aacParams;
        private final OkmpPublisherNative publisher;

        /* compiled from: OkmpStreamPublisher.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AACAudioProvider.StopReason.values().length];
                try {
                    iArr[AACAudioProvider.StopReason.CAPTURE_ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AACAudioProvider.StopReason.ENCODE_ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AACAudioProvider.StopReason.OTHER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AACAudioProvider.StopReason.PARAMS_CHANGED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AACAudioProvider.StopReason.STOP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AACAudioProvider.StopReason.END_OF_CONTENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AACAudioProvider.StopReason.RELEASED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AudioConsumer(OkmpPublisherNative okmpPublisherNative) {
            this.publisher = okmpPublisherNative;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s3q0 handleAACStopped$lambda$0(AudioConsumer audioConsumer, OkmpStreamPublisher okmpStreamPublisher, AACAudioProvider.StopReason stopReason, String str) {
            if (audioConsumer.isActive()) {
                okmpStreamPublisher._aacParams = null;
                switch (WhenMappings.$EnumSwitchMapping$0[stopReason.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        Delegate delegate = okmpStreamPublisher.delegate;
                        if (delegate != null) {
                            delegate.onAudioFailed(okmpStreamPublisher.connectionId, "error", stopReason + " " + str);
                        }
                        okmpStreamPublisher.fail("audio capture failed: " + stopReason + " " + str);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return s3q0.a;
        }

        private final boolean isActive() {
            return this.aacParams == OkmpStreamPublisher.this._aacParams && this.publisher == OkmpStreamPublisher.this._publisher;
        }

        @Override // ru.ok.media.api.AACAudioProvider.Consumer
        public void handleAACAudioFrame(ByteBuffer byteBuffer, long j, int i) {
            AACAudioProvider.Params params = this.aacParams;
            if (params != null && byteBuffer.remaining() > 0 && isActive()) {
                int convertMediaTimestamp = (int) OkmpStreamPublisher.this.convertMediaTimestamp(j, false);
                int channelCount = ((1024 / params.getChannelCount()) * 1000) / params.getSampleRate();
                if (OkmpStreamPublisher.this.isEnabledCapturedAudioFrameDump()) {
                    int remaining = byteBuffer.remaining();
                    StringBuilder a = odj.a(convertMediaTimestamp, channelCount, "AudioConsumer.handleAACAudioFrame() - ts= ", " dur= ", " size= ");
                    a.append(remaining);
                    ne7.m(OkmpStreamPublisher.TAG, a.toString());
                }
                this.publisher.pushAACAudioFrame(byteBuffer, false, convertMediaTimestamp, channelCount);
            }
        }

        @Override // ru.ok.media.api.AACAudioProvider.Consumer
        public void handleAACConfig(ByteBuffer byteBuffer, long j) {
            if (byteBuffer.remaining() <= 0 || !isActive()) {
                ne7.m(OkmpStreamPublisher.TAG, "AudioConsumer.handleAACConfig() - ignored config=" + r490.f(byteBuffer, true));
                return;
            }
            int convertMediaTimestamp = (int) OkmpStreamPublisher.this.convertMediaTimestamp(j, true);
            ne7.m(OkmpStreamPublisher.TAG, "AudioConsumer.handleAACConfig() - ts= " + convertMediaTimestamp + " config=" + r490.f(byteBuffer, true));
            this.publisher.pushAACAudioFrame(byteBuffer, true, convertMediaTimestamp, 1);
        }

        @Override // ru.ok.media.api.AACAudioProvider.Consumer
        public void handleAACStopped(final AACAudioProvider.StopReason stopReason, final String str) {
            ne7.m(OkmpStreamPublisher.TAG, "AudioConsumer.handleAACStopped() - reason= " + stopReason + " details= " + str);
            wzs wzsVar = OkmpStreamPublisher.this._queueJob;
            final OkmpStreamPublisher okmpStreamPublisher = OkmpStreamPublisher.this;
            wzsVar.invoke(1016, new gzs() { // from class: ru.ok.media.a
                @Override // xsna.gzs
                public final Object invoke() {
                    s3q0 handleAACStopped$lambda$0;
                    handleAACStopped$lambda$0 = OkmpStreamPublisher.AudioConsumer.handleAACStopped$lambda$0(OkmpStreamPublisher.AudioConsumer.this, okmpStreamPublisher, stopReason, str);
                    return handleAACStopped$lambda$0;
                }
            });
        }

        @Override // ru.ok.media.api.AACAudioProvider.Consumer
        public boolean isAACBlocked() {
            if (!isActive()) {
                return true;
            }
            QualityControllerNativeProxy qualityController = this.publisher.getQualityController();
            return !(qualityController != null ? qualityController.isAudioFrameAllowed() : false);
        }

        public final void setParams(AACAudioProvider.Params params) {
            this.aacParams = params;
        }
    }

    /* compiled from: OkmpStreamPublisher.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final VideoSize selectSupportedSize(SortedMap<VideoSize, RateRange> sortedMap, VideoSize videoSize) {
            VideoSize videoSize2 = videoSize;
            while (OkmpStreamPublisher.videoSizeBlackList.contains(videoSize2)) {
                SortedMap<VideoSize, RateRange> headMap = sortedMap.headMap(videoSize2);
                if (headMap.isEmpty()) {
                    break;
                }
                videoSize2 = headMap.lastKey();
            }
            while (OkmpStreamPublisher.videoSizeBlackList.contains(videoSize2)) {
                SortedMap<VideoSize, RateRange> tailMap = sortedMap.tailMap(videoSize2);
                if (tailMap.isEmpty()) {
                    break;
                }
                videoSize2 = tailMap.firstKey();
            }
            return OkmpStreamPublisher.videoSizeBlackList.contains(videoSize2) ? videoSize : videoSize2;
        }

        public final VideoSize getMaxVideoSize(Context context, PublisherConfiguration publisherConfiguration) {
            SortedMap<VideoSize, RateRange> sortedMap = publisherConfiguration.bitrateConfig.rangeMap;
            VideoSize videoSize = VideoSize.FAST_VIDEO_SIZE;
            com.android.grafika.a aVar = null;
            try {
                try {
                    aVar = l370.u(context, publisherConfiguration.videoEncoderSettings, null);
                    for (VideoSize videoSize2 : sortedMap.keySet()) {
                        if (!aVar.i(videoSize2)) {
                            OkmpStreamPublisher.videoSizeBlackList.add(videoSize2);
                        }
                    }
                    if (OkmpStreamPublisher.videoSizeBlackList.size() == sortedMap.size()) {
                        ne7.n(OkmpStreamPublisher.TAG, "All resolutions are blacklisted, MediaCodec bug?");
                        OkmpStreamPublisher.videoSizeBlackList.clear();
                    }
                    Iterator<VideoSize> it = getSlowpokeVideoSize().iterator();
                    while (it.hasNext()) {
                        videoSize = it.next();
                        if (videoSize.getMin() <= publisherConfiguration.maxRes) {
                            break;
                        }
                    }
                    VideoSize selectSupportedSize = selectSupportedSize(sortedMap, videoSize);
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

        public final List<VideoSize> getSlowpokeVideoSize() {
            return OkmpStreamPublisher.slowpokeVideoSize;
        }

        private Companion() {
        }
    }

    /* compiled from: OkmpStreamPublisher.kt */
    public interface Delegate {
        void onAudioFailed(int i, String str, String str2);

        void onHandshaked(int i);

        void onNoNetwork(int i);

        void onStateChanged(int i, State state, State state2);

        void onVideoFailed(int i, String str, String str2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OkmpStreamPublisher.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State preparing = new State("preparing", 0);
        public static final State starting = new State("starting", 1);
        public static final State started = new State(X3.i.d0, 2);
        public static final State paused = new State(X3.i.e0, 3);
        public static final State stopped = new State(X3.i.h0, 4);
        public static final State failed = new State("failed", 5);
        public static final State unrecoverableFailure = new State("unrecoverableFailure", 6);

        private static final /* synthetic */ State[] $values() {
            return new State[]{preparing, starting, started, paused, stopped, failed, unrecoverableFailure};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private State(String str, int i) {
        }

        public static zrp<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: OkmpStreamPublisher.kt */
    public final class VideoConsumer implements H264VideoProvider.Consumer {
        private final int _id;
        private Boolean _prevActive;
        private Boolean _prevBlocked;
        private H264VideoProvider.Params h264Params;
        private final OkmpPublisherNative publisher;

        /* compiled from: OkmpStreamPublisher.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[H264VideoProvider.StopReason.values().length];
                try {
                    iArr[H264VideoProvider.StopReason.ENCODE_ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[H264VideoProvider.StopReason.OTHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[H264VideoProvider.StopReason.PARAMS_CHANGED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[H264VideoProvider.StopReason.STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[H264VideoProvider.StopReason.END_OF_CONTENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[H264VideoProvider.StopReason.RELEASED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public VideoConsumer(OkmpPublisherNative okmpPublisherNative) {
            this.publisher = okmpPublisherNative;
            int andIncrement = OkmpStreamPublisher.s_nextVideoConsumerId.getAndIncrement();
            this._id = andIncrement;
            ne7.m(OkmpStreamPublisher.TAG, "VideoConsumer constructor - [" + andIncrement + X3.j.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s3q0 handleH264Stopped$lambda$0(VideoConsumer videoConsumer, OkmpStreamPublisher okmpStreamPublisher, H264VideoProvider.StopReason stopReason, String str) {
            if (videoConsumer.isActive()) {
                okmpStreamPublisher._h264Params = null;
                switch (WhenMappings.$EnumSwitchMapping$0[stopReason.ordinal()]) {
                    case 1:
                    case 2:
                        Delegate delegate = okmpStreamPublisher.delegate;
                        if (delegate != null) {
                            delegate.onVideoFailed(okmpStreamPublisher.connectionId, "error", stopReason + " " + str);
                        }
                        okmpStreamPublisher.fail("video capture failed: " + stopReason + " " + str);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            return s3q0.a;
        }

        private final boolean isActive() {
            boolean z = this.h264Params == OkmpStreamPublisher.this._h264Params && this.publisher == OkmpStreamPublisher.this._publisher;
            if (!Boolean.valueOf(z).equals(this._prevActive)) {
                ne7.m(OkmpStreamPublisher.TAG, "VideoConsumer.isActive() - [" + this._id + "] " + this._prevActive + " -> " + z);
                this._prevActive = Boolean.valueOf(z);
            }
            return z;
        }

        @Override // ru.ok.media.api.H264VideoProvider.Consumer
        public void handleH264Frame(DataSample dataSample, boolean z, long j, int i, int i2) {
            if (!isActive()) {
                dataSample.release();
                return;
            }
            int convertMediaTimestamp = (int) OkmpStreamPublisher.this.convertMediaTimestamp(j, false);
            if (OkmpStreamPublisher.this.isEnabledCapturedVideoFrameDump()) {
                StringBuilder a = odj.a(this._id, convertMediaTimestamp, "VideoConsumer.handleH264Frame() - [", "] ts= ", " dur= ");
                a.append(i);
                a.append(" key= ");
                a.append(z);
                a.append(" rot= ");
                a.append(i2);
                ne7.m(OkmpStreamPublisher.TAG, a.toString());
            }
            Integer num = OkmpStreamPublisher.this._reportedVideoRotation;
            if (num == null || num.intValue() != i2) {
                OkmpStreamPublisher.this._reportedVideoRotation = Integer.valueOf(i2);
                this.publisher.setVideoRotation(i2);
            }
            this.publisher.pushH264Frame(dataSample, z, convertMediaTimestamp, i);
        }

        @Override // ru.ok.media.api.H264VideoProvider.Consumer
        public void handleH264Headers(byte[] bArr, long j, int i) {
            if (isActive()) {
                int convertMediaTimestamp = (int) OkmpStreamPublisher.this.convertMediaTimestamp(j, false);
                StringBuilder a = odj.a(this._id, convertMediaTimestamp, "VideoConsumer.handleH264Headers() - [", "] ts= ", " rot= ");
                a.append(i);
                a.append(" headers= ");
                a.append(bArr);
                ne7.m(OkmpStreamPublisher.TAG, a.toString());
                Integer num = OkmpStreamPublisher.this._reportedVideoRotation;
                if (num == null || num.intValue() != i) {
                    OkmpStreamPublisher.this._reportedVideoRotation = Integer.valueOf(i);
                    this.publisher.setVideoRotation(i);
                }
                this.publisher.pushH264Headers(bArr, convertMediaTimestamp);
            }
        }

        @Override // ru.ok.media.api.H264VideoProvider.Consumer
        public void handleH264Stopped(final H264VideoProvider.StopReason stopReason, final String str) {
            ne7.m(OkmpStreamPublisher.TAG, "H264VideoProvider.Consumer.handleH264Stopped() - [" + this._id + "] active= " + isActive() + " reason= " + stopReason + " details= " + str);
            wzs wzsVar = OkmpStreamPublisher.this._queueJob;
            final OkmpStreamPublisher okmpStreamPublisher = OkmpStreamPublisher.this;
            wzsVar.invoke(1018, new gzs() { // from class: ru.ok.media.b
                @Override // xsna.gzs
                public final Object invoke() {
                    s3q0 handleH264Stopped$lambda$0;
                    handleH264Stopped$lambda$0 = OkmpStreamPublisher.VideoConsumer.handleH264Stopped$lambda$0(OkmpStreamPublisher.VideoConsumer.this, okmpStreamPublisher, stopReason, str);
                    return handleH264Stopped$lambda$0;
                }
            });
        }

        @Override // ru.ok.media.api.H264VideoProvider.Consumer
        public boolean isH264Blocked() {
            boolean isActive = isActive();
            boolean z = true;
            if (isActive) {
                QualityControllerNativeProxy qualityController = this.publisher.getQualityController();
                if (qualityController != null ? qualityController.isVideoFrameAllowed() : false) {
                    z = false;
                }
            }
            if (!Boolean.valueOf(z).equals(this._prevBlocked)) {
                int i = this._id;
                Boolean bool = this._prevBlocked;
                QualityControllerNativeProxy qualityController2 = this.publisher.getQualityController();
                StringBuilder sb = new StringBuilder("isH264Blocked() - [");
                sb.append(i);
                sb.append("] ");
                sb.append(bool);
                sb.append(" -> ");
                gsi0.c(sb, z, " active= ", isActive, " qc= ");
                sb.append(qualityController2);
                ne7.m(OkmpStreamPublisher.TAG, sb.toString());
                this._prevBlocked = Boolean.valueOf(z);
            }
            return z;
        }

        @Override // ru.ok.media.api.H264VideoProvider.Consumer
        public boolean isH264KeyFrameRequired() {
            QualityControllerNativeProxy qualityController;
            if (!isActive() || (qualityController = this.publisher.getQualityController()) == null) {
                return false;
            }
            return qualityController.getAndResetKeyFrameRequest();
        }

        public final void setParams(H264VideoProvider.Params params) {
            this.h264Params = params;
        }
    }

    /* compiled from: OkmpStreamPublisher.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.preparing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.starting.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[State.started.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[State.paused.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[State.unrecoverableFailure.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OkmpStreamPublisher(Context context, HandlerThread handlerThread, PublisherConfiguration publisherConfiguration, int i, AACAudioProvider aACAudioProvider, VideoCBRMode videoCBRMode, int i2, long j, boolean z, izs<? super gzs<s3q0>, s3q0> izsVar, LoggerInterface loggerInterface, wzs<? super Integer, ? super gzs<s3q0>, s3q0> wzsVar, yzs<? super Integer, ? super Long, ? super gzs<s3q0>, s3q0> yzsVar, izs<? super Integer, s3q0> izsVar2, int i3, int i4) {
        this.workerThread = handlerThread;
        this._publisherConfig = publisherConfiguration;
        this.connectionId = i;
        this.aacEncode = aACAudioProvider;
        this.cbrMode = videoCBRMode;
        this.videoBitrateMarginPercent = i2;
        this.useRelativeTimestamps = z;
        this.logger = loggerInterface;
        this._queueJob = wzsVar;
        this._queueJobDelayed = yzsVar;
        this._debugJobStarted = izsVar2;
        this._dbgBandwidthDropPeriodSeconds = i3;
        this._dbgBandwidthDropKBps = i4;
        this.state = State.stopped;
        Handler handler = new Handler(handlerThread.getLooper());
        this.workingQueue = handler;
        tto0 tto0Var = new tto0();
        this._timeMachine = tto0Var;
        this._fpsCounter = new ft5(1000L, tto0Var);
        this._rangeMap = publisherConfiguration.bitrateConfig.rangeMap;
        this._maxVideoSize = Companion.getMaxVideoSize(context, publisherConfiguration);
        this._selectedAudioConfigEntry = new AudioAdaptationConfig.Entry();
        this._initialBitrate = -1L;
        this._videoBitrate = START_VIDEO_BIT_RATE;
        this._currentRateRange = new RateRange();
        this._pauseEvent = new zvo0(tto0Var);
        this._firstPublisherError = -1;
        this._videoFramesDropped = new AtomicLong(0L);
        this._disconnectReasonString = "";
        this._okmpPacketStats = new PacketStats();
        this._audioPacketDurationMs = 21;
        this._prepareEvent = new zvo0(tto0Var);
        this._startEvent = new zvo0(tto0Var);
        this._h264Encode = new H264Encoder(context, handler, publisherConfiguration.videoEncoderSettings, videoCBRMode, i2, tto0Var, izsVar, loggerInterface);
        if (j <= 0) {
            this._initialBitrate = -1L;
            this._selectedAudioConfigEntry = publisherConfiguration.audioParamsForBandwidth(START_VIDEO_BIT_RATE, this._selectedAudioConfigEntry);
            this._videoBitrate = START_VIDEO_BIT_RATE;
            this._currentRateRange = BitrateConfiguration.START_RATE_RANGE;
            this._mEncoderVideoSize = new VideoSize(this._maxVideoSize);
            return;
        }
        this._initialBitrate = publisherConfiguration.getRateRange(this._selectedAudioConfigEntry).trimValue(j);
        this._selectedAudioConfigEntry = publisherConfiguration.audioParamsForBandwidth(this._initialBitrate, this._selectedAudioConfigEntry);
        long videoRateForBandwidth = publisherConfiguration.videoRateForBandwidth(this._initialBitrate, this._selectedAudioConfigEntry);
        this._videoBitrate = videoRateForBandwidth;
        if (videoRateForBandwidth >= 0) {
            int i5 = (videoRateForBandwidth > 2147483647L ? 1 : (videoRateForBandwidth == 2147483647L ? 0 : -1));
        }
        BitrateConfiguration.FindResult find = publisherConfiguration.bitrateConfig.find(videoRateForBandwidth);
        if (find == null) {
            this._currentRateRange = BitrateConfiguration.START_RATE_RANGE;
            this._mEncoderVideoSize = new VideoSize(this._maxVideoSize);
        } else {
            this._currentRateRange = find.rateRange;
            this._mEncoderVideoSize = new VideoSize(find.videoSize);
        }
    }

    private final void checkedClose() {
        ne7.t(TAG, "checkedClose()");
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            stopBenchmark();
            okmpPublisherNative.pause();
            QualityControllerNativeProxy qualityController = okmpPublisherNative.getQualityController();
            if (qualityController != null) {
                qualityController.pause();
            }
            okmpPublisherNative.stop();
        }
        releasePublisher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long convertMediaTimestamp(long j, boolean z) {
        if (!this.useRelativeTimestamps) {
            return j;
        }
        long j2 = this._startTimeMs;
        if (j >= j2) {
            return j - j2;
        }
        return 0L;
    }

    private final AudioConsumer createAACConsumer() {
        ne7.m(TAG, "createAACConsumer()");
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            return new AudioConsumer(okmpPublisherNative);
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onAudioFailed(this.connectionId, "start", "publisher == null");
        }
        fail("failed to start audio capture: publisher == null");
        return null;
    }

    private final VideoConsumer createH264Consumer() {
        ne7.m(TAG, "createH264Consumer()");
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            return new VideoConsumer(okmpPublisherNative);
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onVideoFailed(this.connectionId, "start", "publisher == null");
        }
        fail("failed to start video capture: publisher == null");
        return null;
    }

    private final NetPublisher.Callback createPublisherCallback() {
        ne7.m(TAG, "createCallback()");
        return new OkmpStreamPublisher$createPublisherCallback$1(this);
    }

    private final void debugSetTargetBitrate(long j) {
        ne7.m(TAG, "debugSetTargetBitrate() - bitrate= " + j);
        final long trimValue = this._publisherConfig.getRateRange(this._selectedAudioConfigEntry).trimValue(j);
        if (j != trimValue) {
            StringBuilder b = fp.b(j, "debugSetTargetBitrate() - bitrate ", " trimmed to ");
            b.append(trimValue);
            ne7.J(TAG, b.toString());
        }
        this._queueJob.invoke(1013, new gzs() { // from class: xsna.hz70
            @Override // xsna.gzs
            public final Object invoke() {
                s3q0 debugSetTargetBitrate$lambda$3;
                debugSetTargetBitrate$lambda$3 = OkmpStreamPublisher.debugSetTargetBitrate$lambda$3(this, trimValue);
                return debugSetTargetBitrate$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 debugSetTargetBitrate$lambda$3(OkmpStreamPublisher okmpStreamPublisher, long j) {
        OkmpPublisherNative okmpPublisherNative = okmpStreamPublisher._publisher;
        if (okmpPublisherNative == null) {
            return s3q0.a;
        }
        QualityControllerNativeProxy qualityController = okmpPublisherNative.getQualityController();
        if (qualityController == null) {
            return s3q0.a;
        }
        qualityController.debugForceTargetBitrate(j);
        okmpStreamPublisher.switchQuality();
        return s3q0.a;
    }

    private final void doFail() {
        ne7.n(TAG, "doFail()");
        Looper.myLooper();
        this.workerThread.getLooper();
        switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
                setState(State.unrecoverableFailure);
                stopPublishing();
                this._queueJob.invoke(1010, new w100(this, 16));
                return;
            case 2:
            case 3:
            case 7:
                ne7.n(TAG, "doFail() - won't do in state " + this.state);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 doFail$lambda$38(OkmpStreamPublisher okmpStreamPublisher) {
        ne7.n(TAG, "doFail() - closure");
        okmpStreamPublisher.checkedClose();
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(String str) {
        ne7.n(TAG, "fail() - reason= " + str);
        synchronized (this) {
            if (this._failing) {
                return;
            }
            this._failing = true;
            setDisconnectReasonString(str);
            s3q0 s3q0Var = s3q0.a;
            this._queueJob.invoke(1015, new jz70(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 fail$lambda$40(OkmpStreamPublisher okmpStreamPublisher) {
        okmpStreamPublisher.doFail();
        return s3q0.a;
    }

    private final int getAudioBitrate() {
        AudioAdaptationConfig.Entry entry = this._selectedAudioConfigEntry;
        if (entry.isValid()) {
            return entry.m_params.m_bitRate;
        }
        return 0;
    }

    private final long getSelectedAudioBitrate() {
        return this._selectedAudioConfigEntry.m_params.m_bitRate;
    }

    private final VideoSize get_lastCapturedFrameSize() {
        synchronized (this) {
            Integer num = this._lastCapturedFrameWidth;
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            Integer num2 = this._lastCapturedFrameHeight;
            if (num2 == null) {
                return null;
            }
            return new VideoSize(intValue, num2.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEnabledCapturedAudioFrameDump() {
        return (this._publisherConfig.dump_flags & 128) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEnabledCapturedVideoFrameDump() {
        return (this._publisherConfig.dump_flags & 256) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 pause$lambda$27(OkmpStreamPublisher okmpStreamPublisher) {
        okmpStreamPublisher.stopAudioEncoding();
        okmpStreamPublisher.stopVideoEncoding();
        OkmpPublisherNative okmpPublisherNative = okmpStreamPublisher._publisher;
        if (okmpPublisherNative != null) {
            ConnectionBenchmark connectionBenchmark = okmpStreamPublisher._connectionBenchmark;
            if (connectionBenchmark != null) {
                connectionBenchmark.setBackground(true);
            }
            okmpPublisherNative.pause();
            QualityControllerNativeProxy qualityController = okmpPublisherNative.getQualityController();
            if (qualityController != null) {
                qualityController.pause();
            }
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 prepare$lambda$20$lambda$19(OkmpStreamPublisher okmpStreamPublisher) {
        ne7.t(TAG, "prepare() - closure");
        OkmpPublisherNative okmpPublisherNative = okmpStreamPublisher._publisher;
        if (okmpPublisherNative != null) {
            okmpPublisherNative.start();
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 processVideoFrame$lambda$34(OkmpStreamPublisher okmpStreamPublisher) {
        okmpStreamPublisher.updateQualityParams();
        return s3q0.a;
    }

    private final void releasePublisher() {
        ne7.t(TAG, "releasePublisher()");
        stopAudioEncoding();
        stopVideoEncoding();
        PacketStats packetStats = getPacketStats();
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        ConnectionBenchmark connectionBenchmark = this._connectionBenchmark;
        synchronized (this) {
            try {
                this._publisherCallback = null;
                this._publisher = null;
                this._connectionBenchmark = null;
                if (okmpPublisherNative != null) {
                    this._okmpPacketStats = packetStats;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (connectionBenchmark == null || !connectionBenchmark.isRunning()) {
            return;
        }
        connectionBenchmark.stop();
    }

    private final void restartAudioEncoding() {
        if (this._aacParams == null) {
            ne7.t(TAG, "restartAudioEncoding() - not running");
            return;
        }
        ne7.t(TAG, "restartAudioEncoding() - restarting...");
        stopAudioEncoding();
        startAudioEncoding();
        ne7.t(TAG, "restartAudioEncoding() - done");
    }

    private final void restartVideoEncoding() {
        if (this._h264Params == null) {
            ne7.t(TAG, "restartVideoEncoding() - not running");
            return;
        }
        ne7.t(TAG, "restartVideoEncoding() - restarting...");
        stopVideoEncoding();
        startVideoEncoding();
        ne7.t(TAG, "restartVideoEncoding() - done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 resume$lambda$29$lambda$28(ConnectionBenchmark connectionBenchmark, boolean z, OkmpPublisherNative okmpPublisherNative, OkmpStreamPublisher okmpStreamPublisher) {
        QualityControllerNativeProxy qualityController;
        if (connectionBenchmark != null) {
            connectionBenchmark.setBackground(false);
        }
        if (!z && (qualityController = okmpPublisherNative.getQualityController()) != null) {
            qualityController.resume();
        }
        okmpPublisherNative.resume();
        if (okmpStreamPublisher.state == State.started) {
            okmpStreamPublisher.startAudioEncoding();
            okmpStreamPublisher.startVideoEncoding();
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void setDisconnectReasonString(String str) {
        if (this._disconnectReasonString.length() == 0) {
            this._disconnectReasonString = str;
        }
    }

    private final void setSelectedAudioConfigEntry(AudioAdaptationConfig.Entry entry) {
        AudioAdaptationConfig.Entry entry2 = this._selectedAudioConfigEntry;
        if (epx.f(entry2, entry)) {
            ne7.t(TAG, "setSelectedAudioConfigEntry() - same " + entry);
            return;
        }
        StringBuilder a = odj.a(entry.m_params.m_bitRate, entry2.m_params.m_bitRate, "setSelectedAudioConfigEntry() - new= ", " from ", " (");
        a.append(entry);
        a.append(" from ");
        a.append(entry2);
        a.append(")");
        ne7.t(TAG, a.toString());
        this._selectedAudioConfigEntry = entry;
        restartAudioEncoding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(State state) {
        State state2 = this.state;
        this.state = state;
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onStateChanged(this.connectionId, state, state2);
        }
    }

    private final void setupAudioConfig() {
        AudioParams audioParams = this._selectedAudioConfigEntry.m_params;
        audioParams.isValid();
        AudioConsumer createAACConsumer = createAACConsumer();
        if (createAACConsumer == null) {
            this._aacParams = null;
            return;
        }
        PublisherConfiguration publisherConfiguration = this._publisherConfig;
        int i = publisherConfiguration.fix_audio_sr;
        if (i <= 0) {
            i = audioParams.m_sampleRate;
        }
        int i2 = publisherConfiguration.fix_audio_br_kbps;
        AACAudioProvider.Params params = new AACAudioProvider.Params(i, 1, i2 > 0 ? i2 * 1000 : audioParams.m_bitRate, createAACConsumer);
        this._aacParams = params;
        createAACConsumer.setParams(params);
    }

    private final void setupVideoConfig() {
        long j = this._videoBitrate;
        VideoConsumer createH264Consumer = createH264Consumer();
        if (createH264Consumer == null) {
            this._h264Params = null;
            return;
        }
        H264VideoProvider.Params params = new H264VideoProvider.Params(new VideoSize(this._mEncoderVideoSize), j, 30, this._publisherConfig.iframeIntervalSeconds, createH264Consumer);
        this._h264Params = params;
        createH264Consumer.setParams(params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 start$lambda$25(OkmpStreamPublisher okmpStreamPublisher) {
        State state = okmpStreamPublisher.state;
        ne7.t(TAG, "start() closure - in state " + state);
        if (state != State.starting) {
            ne7.p(TAG, "start() closure - won't start in state " + state);
            return s3q0.a;
        }
        OkmpPublisherNative okmpPublisherNative = okmpStreamPublisher._publisher;
        ConnectionBenchmark connectionBenchmark = okmpStreamPublisher._connectionBenchmark;
        long resultBitrate = connectionBenchmark != null ? connectionBenchmark.getResultBitrate() : -1L;
        if (resultBitrate > 0) {
            long j = (100 * resultBitrate) / 120;
            StringBuilder b = fp.b(resultBitrate, "start() closure - measured bandwidth= ", ", will use ");
            b.append(j);
            ne7.t(TAG, b.toString());
            okmpStreamPublisher._initialBitrate = okmpStreamPublisher._publisherConfig.getRateRange(okmpStreamPublisher._selectedAudioConfigEntry).trimValue(j);
        } else {
            okmpStreamPublisher._initialBitrate = okmpStreamPublisher.getCurrentBandwidth();
            ne7.t(TAG, "start() closure - using initial bandwidth= " + okmpStreamPublisher._initialBitrate);
        }
        PublisherConfiguration publisherConfiguration = okmpStreamPublisher._publisherConfig;
        if (publisherConfiguration.override_initial_bitrate > 0) {
            long trimValue = publisherConfiguration.getRateRange(okmpStreamPublisher._selectedAudioConfigEntry).trimValue(okmpStreamPublisher._publisherConfig.override_initial_bitrate);
            ne7.J(TAG, "start() closure - using initial bitrate override= " + trimValue);
            okmpStreamPublisher._initialBitrate = trimValue;
        }
        okmpStreamPublisher.stopBenchmark();
        if (okmpPublisherNative != null) {
            if (okmpStreamPublisher._handshakeComplete) {
                okmpStreamPublisher.startPublishing();
            } else {
                ne7.t(TAG, "start() closure - waiting for handshake to complete...");
            }
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startAudioEncoding() {
        ne7.t(TAG, "startAudioEncoding()");
        Looper.myLooper();
        this.workerThread.getLooper();
        setupAudioConfig();
        AACAudioProvider.Params params = this._aacParams;
        if (params == null) {
            return false;
        }
        this.aacEncode.start(params);
        ne7.t(TAG, "startAudioEncoding() - audio encoder created: " + params);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNetworkMonitor() {
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative == null) {
            return;
        }
        qox qoxVar = this._networkMonitor;
        if (qoxVar != null) {
            qoxVar.b();
            this._networkMonitor = null;
        }
        this._networkMonitor = new qox(this.workingQueue, 2000L, NETWORK_MONITOR_DELAY, this._timeMachine, new bp7(25, this, okmpPublisherNative));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 startNetworkMonitor$lambda$2(OkmpStreamPublisher okmpStreamPublisher, OkmpPublisherNative okmpPublisherNative, qox qoxVar) {
        if (okmpStreamPublisher._stopping || !epx.f(okmpStreamPublisher._publisher, okmpPublisherNative)) {
            ne7.t(TAG, "startNetworkMonitor() - stopping, not active anymore");
            qoxVar.b();
            return s3q0.a;
        }
        if (okmpStreamPublisher._dbgBandwidthDropPeriodSeconds > 0 && okmpStreamPublisher._dbgBandwidthDropKBps > 0) {
            long currentTimeMillis = okmpStreamPublisher._timeMachine.currentTimeMillis();
            long j = okmpStreamPublisher._dbgLastQualityChangeMs;
            if (j == 0) {
                okmpStreamPublisher._dbgLastQualityChangeMs = currentTimeMillis;
            } else if (currentTimeMillis - j >= okmpStreamPublisher._dbgBandwidthDropPeriodSeconds) {
                ne7.m(TAG, "_networkMonitor - simulating quality drop to " + okmpStreamPublisher._dbgBandwidthDropKBps + " Kbps");
                okmpStreamPublisher.debugSetTargetBitrate(((long) okmpStreamPublisher._dbgBandwidthDropKBps) * 1000);
                okmpStreamPublisher._dbgLastQualityChangeMs = currentTimeMillis;
            }
        }
        okmpStreamPublisher.switchQuality();
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPublishing() {
        ne7.t(TAG, "startPublishing()");
        stopBenchmark();
        if (this._stopping) {
            ne7.t(TAG, "startPublishing() - won't do: stopping");
            return;
        }
        if (this._publishing) {
            ne7.t(TAG, "startPublishing() - won't do: already publishing");
            return;
        }
        OkmpConnectionConfig okmpConnectionConfig = this._connectionConfig;
        String streamName = okmpConnectionConfig != null ? okmpConnectionConfig.getStreamName() : null;
        long j = this._initialBitrate;
        if (streamName == null) {
            ne7.n(TAG, "startPublishing() - won't do: streamName is NOT set");
            return;
        }
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            okmpPublisherNative.publishStream(streamName);
            QualityControllerNativeProxy qualityController = okmpPublisherNative.getQualityController();
            if (qualityController != null) {
                qualityController.start(j);
            }
            switchByRate(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startVideoEncoding() {
        ne7.t(TAG, "startVideoEncoding()");
        Looper.myLooper();
        this.workerThread.getLooper();
        setupVideoConfig();
        H264VideoProvider.Params params = this._h264Params;
        if (params == null) {
            return false;
        }
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            okmpPublisherNative.setVideoSize(params.getSize());
            QualityControllerNativeProxy qualityController = okmpPublisherNative.getQualityController();
            if (qualityController != null) {
                qualityController.videoSizeChanged();
            }
        }
        this._h264Encode.start(params);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 stop$lambda$37(OkmpStreamPublisher okmpStreamPublisher) {
        ne7.t(TAG, "stop() - closure");
        okmpStreamPublisher.checkedClose();
        return s3q0.a;
    }

    private final void stopAudioEncoding() {
        ne7.t(TAG, "stopAudioEncoding()");
        Looper.myLooper();
        this.workerThread.getLooper();
        if (this._aacParams != null) {
            this.aacEncode.stop();
            this._aacParams = null;
        }
    }

    private final void stopBenchmark() {
        ConnectionBenchmark connectionBenchmark = this._connectionBenchmark;
        if (connectionBenchmark != null) {
            connectionBenchmark.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPublishing() {
        ne7.t(TAG, "stopPublishing()");
        this._publishing = false;
        this._queueJob.invoke(1002, new nm60(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 stopPublishing$lambda$22(OkmpStreamPublisher okmpStreamPublisher) {
        okmpStreamPublisher.stopBenchmark();
        if (okmpStreamPublisher._stopping) {
            return s3q0.a;
        }
        okmpStreamPublisher._stopping = true;
        return s3q0.a;
    }

    private final void stopVideoEncoding() {
        ne7.t(TAG, "stopVideoEncoding()");
        Looper.myLooper();
        this.workerThread.getLooper();
        if (this._h264Params != null) {
            this._h264Encode.stop();
            this._h264Params = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchByRate(final long j) {
        ne7.t(TAG, "switchByRate() - bw= " + j);
        updateBitrateSettings(j);
        this._queueJob.invoke(1001, new gzs() { // from class: xsna.iz70
            @Override // xsna.gzs
            public final Object invoke() {
                s3q0 switchByRate$lambda$10;
                switchByRate$lambda$10 = OkmpStreamPublisher.switchByRate$lambda$10(j, this);
                return switchByRate$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final s3q0 switchByRate$lambda$10(long j, OkmpStreamPublisher okmpStreamPublisher) {
        Object obj;
        long j2;
        RateRange rateRange;
        long j3;
        VideoSize videoSize;
        boolean z;
        boolean f;
        OkmpPublisherNative okmpPublisherNative;
        Object obj2;
        Map.Entry entry;
        Object obj3;
        RateRange rateRange2;
        ne7.t(TAG, "switchByRate(" + j + ") - started, _mEncoderVideoSize= " + okmpStreamPublisher._mEncoderVideoSize + " _lastCapturedFrameSize= " + okmpStreamPublisher.get_lastCapturedFrameSize());
        okmpStreamPublisher.setSelectedAudioConfigEntry(okmpStreamPublisher._publisherConfig.audioParamsForBandwidth(j, okmpStreamPublisher._selectedAudioConfigEntry));
        long audioBitrate = (long) okmpStreamPublisher.getAudioBitrate();
        long j4 = j - audioBitrate;
        long j5 = okmpStreamPublisher._publisherConfig.maxVideoBitrate;
        if (j5 > 0 && j4 > j5) {
            StringBuilder b = fp.b(j, "switchByRate(", ") - applying max_video_bitrate (");
            b.append(j5);
            ne7.t(TAG, e630.c(b, ") to targetRate (", j4, ")"));
            j4 = j5;
        }
        Object makeLandscape = new VideoSize(okmpStreamPublisher._mEncoderVideoSize).makeLandscape();
        if (okmpStreamPublisher._currentRateRange.isRateAccepted(j4)) {
            Iterator<T> it = okmpStreamPublisher._rangeMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(okmpStreamPublisher._currentRateRange, ((Map.Entry) obj).getValue())) {
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                makeLandscape = entry2.getKey();
                ne7.t(TAG, "switchByRate(" + j + ") - from matching entry: videoSize= " + makeLandscape);
            }
        } else {
            Iterator<T> it2 = okmpStreamPublisher._rangeMap.entrySet().iterator();
            long j6 = START_VIDEO_BIT_RATE;
            Map.Entry entry3 = null;
            long j7 = 0;
            Map.Entry entry4 = null;
            while (true) {
                if (!it2.hasNext()) {
                    entry = null;
                    break;
                }
                entry = (Map.Entry) it2.next();
                RateRange rateRange3 = (RateRange) entry.getValue();
                if (rateRange3.getMaxRate() > j7) {
                    j7 = rateRange3.getMaxRate();
                    entry3 = entry;
                }
                if (rateRange3.getMinRate() < j6) {
                    j6 = rateRange3.getMinRate();
                    entry4 = entry;
                }
                if (rateRange3.isRateAccepted(j4)) {
                    break;
                }
            }
            if (j4 > j7) {
                j4 = j7;
            } else if (j4 < j6) {
                j4 = j6;
                entry3 = entry4;
            } else {
                entry3 = entry;
            }
            boolean z2 = entry3 == null;
            if (entry3 == null || (obj3 = (VideoSize) entry3.getKey()) == null) {
                obj3 = VideoSize.HD_VIDEO_SIZE;
            }
            if (entry3 == null || (rateRange2 = (RateRange) entry3.getValue()) == null) {
                rateRange2 = BitrateConfiguration.START_RATE_RANGE;
            }
            okmpStreamPublisher._currentRateRange = rateRange2;
            String str = z2 ? "not " : "";
            StringBuilder sb = new StringBuilder("switchByRate(");
            sb.append(j);
            sb.append(") - ");
            sb.append(str);
            tj0.d(sb, "found, targetRate= ", j4, " videoSize= ");
            sb.append(obj3);
            ne7.t(TAG, sb.toString());
            makeLandscape = obj3;
        }
        VideoSize videoSize2 = (VideoSize) makeLandscape;
        if (videoSize2.getHeight() > okmpStreamPublisher._maxVideoSize.getHeight() || videoSize2.getWidth() > okmpStreamPublisher._maxVideoSize.getWidth()) {
            makeLandscape = okmpStreamPublisher._maxVideoSize;
            ne7.t(TAG, "switchByRate(" + j + ") - restricted by _maxVideoSize: videoSize= " + makeLandscape);
        }
        VideoSize videoSize3 = okmpStreamPublisher.get_lastCapturedFrameSize();
        VideoSize newWithSameOrientation = videoSize3 != null ? videoSize3.newWithSameOrientation((VideoSize) makeLandscape) : null;
        if (newWithSameOrientation != null) {
            VideoSize videoSize4 = (VideoSize) makeLandscape;
            if (videoSize4.getWidth() > newWithSameOrientation.getWidth() || videoSize4.getHeight() > newWithSameOrientation.getHeight()) {
                Iterator it3 = slowpokeVideoSize.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    VideoSize videoSize5 = (VideoSize) next;
                    Iterator it4 = it3;
                    j2 = j4;
                    if (videoSize5.getWidth() <= newWithSameOrientation.getWidth() || videoSize5.getHeight() <= newWithSameOrientation.getHeight()) {
                        obj2 = next;
                        break;
                    }
                    it3 = it4;
                    j4 = j2;
                }
                j2 = j4;
                obj2 = null;
                Object obj4 = (VideoSize) obj2;
                makeLandscape = obj4 == null ? videoSize4 : obj4;
                ne7.t(TAG, "switchByRate(" + j + ") - restricted by _mCameraPreviewSize (" + newWithSameOrientation + "): videoSize= " + makeLandscape);
                rateRange = okmpStreamPublisher._rangeMap.get(makeLandscape);
                if (rateRange != null) {
                    long maxRate = (rateRange.getMaxRate() * 15) / 10;
                    if (j2 > maxRate) {
                        long maxRate2 = rateRange.getMaxRate();
                        StringBuilder b2 = fp.b(j, "switchByRate(", ") - rate restricted by 3/2 of max rate (");
                        b2.append(maxRate2);
                        b2.append("): targetRate= ");
                        b2.append(maxRate);
                        ne7.t(TAG, b2.toString());
                        j3 = maxRate;
                        VideoSize videoSize6 = (VideoSize) makeLandscape;
                        videoSize = okmpStreamPublisher.get_lastCapturedFrameSize();
                        if (videoSize == null) {
                            videoSize = okmpStreamPublisher._mEncoderVideoSize;
                        }
                        videoSize6.makeSameOrientation(videoSize);
                        long j8 = okmpStreamPublisher._videoBitrate;
                        z = j8 != j3;
                        f = epx.f(okmpStreamPublisher._mEncoderVideoSize, makeLandscape);
                        okmpPublisherNative = okmpStreamPublisher._publisher;
                        if (okmpPublisherNative != null) {
                            okmpPublisherNative.setBitrates(audioBitrate, j3);
                        }
                        okmpStreamPublisher.updateBitrateSettings(j);
                        if (z && f) {
                            ne7.m(TAG, "switchByRate(" + j + ") - done (no need to switch), _mEncoderVideoSize= " + makeLandscape + " videoSize= " + makeLandscape + " _lastCapturedFrameSize= " + okmpStreamPublisher.get_lastCapturedFrameSize());
                            return s3q0.a;
                        }
                        if (z) {
                            StringBuilder b3 = fp.b(j, "switchByRate(", ") - Switcher: bitrate ");
                            b3.append(j8);
                            b3.append(" => ");
                            b3.append(j3);
                            ne7.t(TAG, b3.toString());
                            okmpStreamPublisher._videoBitrate = j3;
                        }
                        if (!f) {
                            ne7.t(TAG, "switchByRate(" + j + ") - Switcher: " + okmpStreamPublisher._mEncoderVideoSize + " => " + makeLandscape);
                        }
                        okmpStreamPublisher.switchVideoSize((VideoSize) makeLandscape);
                        ne7.t(TAG, "switchByRate(" + j + ") - ended");
                        return s3q0.a;
                    }
                }
                j3 = j2;
                VideoSize videoSize62 = (VideoSize) makeLandscape;
                videoSize = okmpStreamPublisher.get_lastCapturedFrameSize();
                if (videoSize == null) {
                }
                videoSize62.makeSameOrientation(videoSize);
                long j82 = okmpStreamPublisher._videoBitrate;
                if (j82 != j3) {
                }
                f = epx.f(okmpStreamPublisher._mEncoderVideoSize, makeLandscape);
                okmpPublisherNative = okmpStreamPublisher._publisher;
                if (okmpPublisherNative != null) {
                }
                okmpStreamPublisher.updateBitrateSettings(j);
                if (z) {
                }
                if (z) {
                }
                if (!f) {
                }
                okmpStreamPublisher.switchVideoSize((VideoSize) makeLandscape);
                ne7.t(TAG, "switchByRate(" + j + ") - ended");
                return s3q0.a;
            }
        }
        j2 = j4;
        rateRange = okmpStreamPublisher._rangeMap.get(makeLandscape);
        if (rateRange != null) {
        }
        j3 = j2;
        VideoSize videoSize622 = (VideoSize) makeLandscape;
        videoSize = okmpStreamPublisher.get_lastCapturedFrameSize();
        if (videoSize == null) {
        }
        videoSize622.makeSameOrientation(videoSize);
        long j822 = okmpStreamPublisher._videoBitrate;
        if (j822 != j3) {
        }
        f = epx.f(okmpStreamPublisher._mEncoderVideoSize, makeLandscape);
        okmpPublisherNative = okmpStreamPublisher._publisher;
        if (okmpPublisherNative != null) {
        }
        okmpStreamPublisher.updateBitrateSettings(j);
        if (z) {
        }
        if (z) {
        }
        if (!f) {
        }
        okmpStreamPublisher.switchVideoSize((VideoSize) makeLandscape);
        ne7.t(TAG, "switchByRate(" + j + ") - ended");
        return s3q0.a;
    }

    private final boolean switchQuality() {
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        QualityControllerNativeProxy qualityController = okmpPublisherNative != null ? okmpPublisherNative.getQualityController() : null;
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

    private final void switchVideoSize(VideoSize videoSize) {
        boolean z;
        H264VideoProvider.Params params;
        VideoSize videoSize2 = this._mEncoderVideoSize;
        ne7.m(TAG, "switchVideoSize(" + videoSize + ") - from " + videoSize2);
        if (!epx.f(videoSize2, videoSize)) {
            VideoSize newWithSameOrientation = Companion.selectSupportedSize(this._rangeMap, new VideoSize(videoSize).makeLandscape()).newWithSameOrientation(videoSize);
            if (!epx.f(videoSize2, newWithSameOrientation)) {
                this._mEncoderVideoSize = newWithSameOrientation;
                restartVideoEncoding();
                z = true;
                long j = this._videoBitrate;
                params = this._h264Params;
                if (params != null || z || j == params.getBitrate()) {
                    return;
                }
                updateVideoBitrate(j);
                return;
            }
        }
        z = false;
        long j2 = this._videoBitrate;
        params = this._h264Params;
        if (params != null) {
        }
    }

    private final void updateBitrateSettings(long j) {
        ne7.t(TAG, "updateBitrateSettings(" + j + ")");
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            QualityControllerNativeProxy qualityController = okmpPublisherNative.getQualityController();
            if (qualityController != null) {
                qualityController.setTargetBitrate(j);
            }
            okmpPublisherNative.updateBuffers();
        }
    }

    private final void updateQualityParams() {
        ne7.t(TAG, "updateQualityParams()");
        switchByRate(getCurrentBandwidth());
    }

    private final void updateVideoBitrate(long j) {
        ne7.t(TAG, "updateVideoBitrate(" + j + ") - current h264Params= " + this._h264Params);
        Looper.myLooper();
        this.workerThread.getLooper();
        setupVideoConfig();
        H264VideoProvider.Params params = this._h264Params;
        if (params != null) {
            this._h264Encode.start(params);
        }
    }

    public final int getBitrate() {
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            return (int) okmpPublisherNative.getBitrate();
        }
        return 0;
    }

    public final String getBoundAddress() {
        String boundAddress;
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        return (okmpPublisherNative == null || (boundAddress = okmpPublisherNative.getBoundAddress()) == null) ? "" : boundAddress;
    }

    public final long getCurrentBandwidth() {
        return getSelectedAudioBitrate() + this._videoBitrate;
    }

    public final String getDebugInfo() {
        String str;
        StringBuilder sb = new StringBuilder();
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative == null || (str = okmpPublisherNative.getDebugInfo()) == null) {
            str = "";
        }
        sb.append(str);
        sb.append('\n');
        sb.append(this.aacEncode.getDebugString());
        sb.append('\n');
        sb.append(this._h264Encode.getDebugString());
        sb.append('\n');
        return sb.toString();
    }

    public final synchronized String getDisconnectReasonString() {
        return this._disconnectReasonString;
    }

    public final double getFps() {
        double b;
        synchronized (this) {
            ft5 ft5Var = this._fpsCounter;
            ft5Var.getClass();
            b = tvo0.b(ft5Var);
            s3q0 s3q0Var = s3q0.a;
        }
        return b;
    }

    public final String getInterfaceName() {
        String interfaceName;
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        return (okmpPublisherNative == null || (interfaceName = okmpPublisherNative.getInterfaceName()) == null) ? "" : interfaceName;
    }

    public final PacketStats getPacketStats() {
        PacketStats packetStats;
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        return (okmpPublisherNative == null || (packetStats = okmpPublisherNative.getPacketStats()) == null) ? this._okmpPacketStats : packetStats;
    }

    public final OkmpQualityControllerState getQualityControllerState() {
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative == null) {
            return OkmpQualityControllerState.closed;
        }
        switch (okmpPublisherNative.getQualityControllerStateRaw()) {
        }
        return OkmpQualityControllerState.closed;
    }

    public final int[] getRecentQueueBlocks() {
        int[] recentQueueBlocks;
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative == null || (recentQueueBlocks = okmpPublisherNative.getRecentQueueBlocks()) == null) {
            return null;
        }
        return Arrays.copyOf(recentQueueBlocks, recentQueueBlocks.length);
    }

    public final State getState() {
        return this.state;
    }

    public final long getTicks() {
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            return okmpPublisherNative.getTicks();
        }
        return 0L;
    }

    public final long getVideoFramesDropped() {
        return this._videoFramesDropped.get();
    }

    public final Integer getVideoLastFrameRotationAngle() {
        return this._reportedVideoRotation;
    }

    public final VideoSize getVideoLastFrameSize() {
        VideoSize videoSize = this._mEncoderVideoSize;
        if (this.state == State.started || this.state == State.paused) {
            return videoSize;
        }
        return null;
    }

    public final void pause() {
        ne7.t(TAG, "pause()");
        Looper.myLooper();
        Looper.getMainLooper();
        this._pauseEvent.b();
        setState(State.paused);
        this._queueJob.invoke(1003, new a040(this, 11));
    }

    public final boolean prepare(OkmpConnectionConfig okmpConnectionConfig) {
        ne7.t(TAG, "prepare() - config= " + okmpConnectionConfig);
        Looper.myLooper();
        Looper.getMainLooper();
        if (okmpConnectionConfig.getAppName() == null) {
            ne7.n(TAG, "prepare() - appName is null");
            return false;
        }
        this._prepareEvent.c();
        this._connectionConfig = okmpConnectionConfig;
        this._reportedVideoRotation = null;
        long currentBandwidth = getCurrentBandwidth();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(okmpConnectionConfig.getHost(), okmpConnectionConfig.getPort());
        if (inetSocketAddress.isUnresolved()) {
            ne7.J(TAG, "prepare() - Failed to resolve address: host=" + okmpConnectionConfig.getHost());
            return false;
        }
        String A = l370.A();
        OkmpHandler okmpHandler = new OkmpHandler(this.workerThread.getLooper());
        OkmpPublisherNative okmpPublisherNative = new OkmpPublisherNative(new tto0(), okmpHandler, okmpConnectionConfig.getAppName(), inetSocketAddress.getAddress().getHostAddress(), okmpConnectionConfig.getPort(), this._publisherConfig, (int) currentBandwidth, this.logger, new PlatformSpecificInfo("Android/ru.ok.media/release/" + GrafikaRuntimeConfig.DEBUG + DomExceptionUtils.SEPARATOR + GrafikaRuntimeConfig.VERSION_CODE + "/build" + GrafikaRuntimeConfig.BUILD_NUMBER, Build.BRAND, Build.MANUFACTURER, Build.MODEL, A == null ? "null" : A));
        okmpHandler.setPublisher(okmpPublisherNative);
        NetPublisher.Callback createPublisherCallback = createPublisherCallback();
        okmpPublisherNative.setCallback(createPublisherCallback);
        okmpPublisherNative.getQualityController();
        ConnectionBenchmark connectionBenchmark = new ConnectionBenchmark(this._timeMachine, okmpHandler, okmpPublisherNative);
        connectionBenchmark.limitBW((this._publisherConfig.getRateRange(this._selectedAudioConfigEntry).getMaxRate() * 120) / 100);
        setState(State.preparing);
        synchronized (this) {
            this._publisher = okmpPublisherNative;
            this._publisherCallback = createPublisherCallback;
            this._connectionBenchmark = connectionBenchmark;
            this._queueJob.invoke(1007, new gd70(this, 1));
            s3q0 s3q0Var = s3q0.a;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean processVideoFrame(GL10 gl10, Streamer.VideoFrame videoFrame) {
        boolean z;
        boolean isEnabledCapturedVideoFrameDump = isEnabledCapturedVideoFrameDump();
        if (isEnabledCapturedVideoFrameDump) {
            ne7.m(TAG, "OkmpStreamPublisher.processVideoFrame() - " + videoFrame);
        }
        VideoSize videoSize = get_lastCapturedFrameSize();
        synchronized (this) {
            this._lastCapturedFrameWidth = Integer.valueOf(videoFrame.getSize().getWidth());
            this._lastCapturedFrameHeight = Integer.valueOf(videoFrame.getSize().getHeight());
            s3q0 s3q0Var = s3q0.a;
        }
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            QualityControllerNativeProxy qualityController = okmpPublisherNative.getQualityController();
            if (qualityController != null) {
                z = qualityController.isVideoFrameAllowed();
                if (!z || this._videoFrameSkipCounter >= qualityController.getVideoFrameSkipCounter()) {
                    this._videoFrameSkipCounter = 0L;
                    if (z) {
                        this._videoFramesDropped.incrementAndGet();
                        if (isEnabledCapturedVideoFrameDump) {
                            ne7.n(TAG, "OkmpStreamPublisher.processVideoFrame() - can't send");
                        }
                        return false;
                    }
                    if (epx.f(videoSize, get_lastCapturedFrameSize())) {
                        this._h264Encode.processVideoFrame(gl10, videoFrame);
                        synchronized (this) {
                            ft5 ft5Var = this._fpsCounter;
                            ft5Var.getClass();
                            tvo0.a(ft5Var, 1);
                        }
                        return true;
                    }
                    ne7.t(TAG, "OkmpStreamPublisher.processVideoFrame() - camera resolution changed " + videoSize + " -> " + get_lastCapturedFrameSize() + ", frame skipped, updating...");
                    this._videoFramesDropped.incrementAndGet();
                    this._queueJob.invoke(1006, new so40(this, 6));
                    return false;
                }
                this._videoFrameSkipCounter++;
            }
        } else if (isEnabledCapturedVideoFrameDump) {
            ne7.n(TAG, "OkmpStreamPublisher.processVideoFrame() - no publisher");
        }
        z = false;
        if (z) {
        }
    }

    public final boolean resume() {
        ne7.t(TAG, "resume()");
        Looper.myLooper();
        Looper.getMainLooper();
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null && okmpPublisherNative.isPaused()) {
            long a = this._pauseEvent.a(0L);
            long j = this._publisherConfig.resumeTimeout;
            if (a > j) {
                StringBuilder b = fp.b(a, "resume() - won't resume, was paused for too long (", " > ");
                b.append(j);
                b.append(")");
                ne7.n(TAG, b.toString());
                return false;
            }
            final OkmpPublisherNative okmpPublisherNative2 = this._publisher;
            if (okmpPublisherNative2 != null) {
                final ConnectionBenchmark connectionBenchmark = this._connectionBenchmark;
                final boolean isRunning = connectionBenchmark != null ? connectionBenchmark.isRunning() : false;
                setState(isRunning ? State.preparing : State.started);
                this._queueJob.invoke(1004, new gzs() { // from class: xsna.kz70
                    @Override // xsna.gzs
                    public final Object invoke() {
                        s3q0 resume$lambda$29$lambda$28;
                        resume$lambda$29$lambda$28 = OkmpStreamPublisher.resume$lambda$29$lambda$28(ConnectionBenchmark.this, isRunning, okmpPublisherNative2, this);
                        return resume$lambda$29$lambda$28;
                    }
                });
                return true;
            }
        }
        return false;
    }

    public final void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public final boolean start() {
        State state = this.state;
        ne7.t(TAG, "start() - in state " + state);
        Looper.myLooper();
        Looper.getMainLooper();
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                break;
            case 2:
            case 3:
                OkmpConnectionConfig okmpConnectionConfig = this._connectionConfig;
                if (okmpConnectionConfig == null) {
                    ne7.p(TAG, "start() - connection config is not set");
                    return false;
                }
                if (!prepare(okmpConnectionConfig)) {
                    ne7.p(TAG, "start() - prepare failed");
                    return false;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                ne7.p(TAG, "start() - won't start in state " + state);
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this._startEvent.c();
        setState(State.starting);
        this._startTimeMs = this._timeMachine.currentTimeMillis();
        this._queueJob.invoke(1008, new fr20(this, 10));
        return true;
    }

    public final void stop() {
        ne7.t(TAG, "stop()");
        Looper.myLooper();
        Looper.getMainLooper();
        setState(State.stopped);
        stopPublishing();
        this._queueJob.invoke(1009, new k7z(this, 13));
    }

    public /* synthetic */ OkmpStreamPublisher(Context context, HandlerThread handlerThread, PublisherConfiguration publisherConfiguration, int i, AACAudioProvider aACAudioProvider, VideoCBRMode videoCBRMode, int i2, long j, boolean z, izs izsVar, LoggerInterface loggerInterface, wzs wzsVar, yzs yzsVar, izs izsVar2, int i3, int i4, int i5, zcl zclVar) {
        this(context, handlerThread, publisherConfiguration, i, aACAudioProvider, videoCBRMode, i2, j, z, izsVar, loggerInterface, wzsVar, yzsVar, izsVar2, (i5 & 16384) != 0 ? 0 : i3, (i5 & 32768) != 0 ? 0 : i4);
    }
}
