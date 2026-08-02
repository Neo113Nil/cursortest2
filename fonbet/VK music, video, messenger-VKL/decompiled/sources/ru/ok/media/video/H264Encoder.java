package ru.ok.media.video;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.android.grafika.EncoderConfig;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.opengles.GL10;
import kotlin.NoWhenBranchMatchedException;
import one.video.streaming.tools.TimeMachine;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.media.api.H264VideoProvider;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.VideoCBRMode;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.DataSample;
import ru.ok.media.utils.DebugUtils;
import ru.ok.media.utils.VideoSize;
import xsna.b3m;
import xsna.cyo0;
import xsna.d9;
import xsna.epx;
import xsna.ft5;
import xsna.gsi0;
import xsna.gzs;
import xsna.hoo0;
import xsna.izs;
import xsna.ji;
import xsna.mnh0;
import xsna.ne7;
import xsna.qo2;
import xsna.s3q0;
import xsna.t12;
import xsna.tgw;
import xsna.tvo0;
import xsna.yis0;
import xsna.zcl;
import xsna.zds0;

/* compiled from: H264Encoder.kt */
/* loaded from: classes9.dex */
public final class H264Encoder implements H264VideoProvider {
    private static final String TAG = "Publisher";
    private static final long TIMESTAMP_UNSET = -1;
    private final ft5 _captureFpsCounter;
    private EncoderConfig _encoderConfig;
    private final ft5 _encoderFpsCounter;
    private VideoSize _lastCapturedFrameSize;
    private Integer _lastFrameRotation;
    private volatile boolean _muteMediaCallbacks;
    private volatile H264VideoProvider.Params _params;
    private final TimeMachine _timeMachine;
    private volatile VideoDataHandler _videoDataHandler;
    private final hoo0 _videoEncoder;
    private final VideoCBRMode cbrMode;
    private final Context mContext;
    private final izs<gzs<s3q0>, s3q0> runOnGLThread;
    private final int videoBitrateMarginPercent;
    private final Handler workingHandler;
    private static final Companion Companion = new Companion(null);
    private static final AtomicInteger s_nextVideoDataHandlerId = new AtomicInteger(0);
    private volatile H264VideoProvider.State _state = H264VideoProvider.State.IDLE;
    private final AtomicLong _framesCaptured = new AtomicLong(0);
    private final AtomicLong _numEncodedConfigs = new AtomicLong(0);
    private final AtomicLong _framesEncoded = new AtomicLong(0);
    private final AtomicLong _framesSkipped = new AtomicLong(0);
    private final AtomicLong _framesDropped = new AtomicLong(0);
    private final AtomicBoolean _keyFrameRequested = new AtomicBoolean(false);

    /* compiled from: H264Encoder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: H264Encoder.kt */
    public final class VideoDataHandler implements zds0 {
        private final int _id;
        private long _lastTimestampMs;
        private byte[] _parameterSets;
        private Boolean _prevActive;
        private Boolean _prevBlocked;
        private final H264VideoProvider.Params params;

        public VideoDataHandler(H264VideoProvider.Params params) {
            this.params = params;
            int andIncrement = H264Encoder.s_nextVideoDataHandlerId.getAndIncrement();
            this._id = andIncrement;
            this._lastTimestampMs = -1L;
            ne7.m(H264Encoder.TAG, "VideoDataHandler constructor - [" + andIncrement + X3.j.e);
        }

        public final int get_id() {
            return this._id;
        }

        public void handleEndOfStream() {
            ne7.m(H264Encoder.TAG, "VideoDataHandler.handleEndOfStream() - [" + this._id + X3.j.e);
        }

        @Override // xsna.zds0
        public void handleFormatChange(byte[] bArr) {
            ne7.m(H264Encoder.TAG, "VideoDataHandler.handleFormatChange() - [" + this._id + "] codecConfig=" + bArr);
            H264Encoder.this._numEncodedConfigs.incrementAndGet();
            this._parameterSets = (byte[]) bArr.clone();
        }

        @Override // xsna.zds0
        public void handleSampleData(DataSample dataSample, long j, boolean z, int i) {
            DataSample dataSample2;
            Throwable th;
            H264Encoder.this._framesEncoded.incrementAndGet();
            H264Encoder h264Encoder = H264Encoder.this;
            synchronized (h264Encoder) {
                ft5 ft5Var = h264Encoder._encoderFpsCounter;
                ft5Var.getClass();
                tvo0.a(ft5Var, 1);
                s3q0 s3q0Var = s3q0.a;
            }
            long j2 = j / 1000;
            this._lastTimestampMs = j2;
            try {
                byte[] bArr = this._parameterSets;
                try {
                    if (!isActive() || H264Encoder.this._muteMediaCallbacks) {
                        H264Encoder.this._framesDropped.incrementAndGet();
                        dataSample.release();
                        return;
                    }
                    Integer unused = H264Encoder.this._lastFrameRotation;
                    if (z && bArr != null) {
                        try {
                            this.params.getConsumer().handleH264Headers(bArr, j2, i);
                        } catch (Throwable th2) {
                            th = th2;
                            dataSample2 = dataSample;
                            dataSample2.release();
                            throw th;
                        }
                    }
                    this.params.getConsumer().handleH264Frame(dataSample, z, j2, 1000 / this.params.getFps(), i);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    dataSample2.release();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                dataSample2 = dataSample;
            }
        }

        public final boolean isActive() {
            boolean z = this == H264Encoder.this._videoDataHandler && H264Encoder.this._params == this.params;
            if (!Boolean.valueOf(z).equals(this._prevActive)) {
                ne7.m(H264Encoder.TAG, "VideoDataHandler.isActive() - [" + this._id + "] " + this._prevActive + " -> " + z);
                this._prevActive = Boolean.valueOf(z);
            }
            return z;
        }

        @Override // xsna.zds0
        public boolean isBlocked() {
            boolean isH264Blocked = (!isActive() || H264Encoder.this._muteMediaCallbacks) ? true : this.params.getConsumer().isH264Blocked();
            if (!epx.f(this._prevBlocked, Boolean.valueOf(isH264Blocked))) {
                int i = this._id;
                Boolean bool = this._prevBlocked;
                boolean isActive = isActive();
                boolean z = H264Encoder.this._muteMediaCallbacks;
                StringBuilder sb = new StringBuilder("VideoDataHandler.isBlocked() - [");
                sb.append(i);
                sb.append("] ");
                sb.append(bool);
                sb.append(" -> ");
                gsi0.c(sb, isH264Blocked, " active= ", isActive, " _muteMediaCallbacks= ");
                sb.append(z);
                ne7.m(H264Encoder.TAG, sb.toString());
                this._prevBlocked = Boolean.valueOf(isH264Blocked);
            }
            return isH264Blocked;
        }

        @Override // xsna.zds0
        public boolean isKeyFrameRequested() {
            if (!isActive() || H264Encoder.this._muteMediaCallbacks) {
                return false;
            }
            return H264Encoder.this._keyFrameRequested.getAndSet(false) || this.params.getConsumer().isH264KeyFrameRequired();
        }
    }

    /* compiled from: H264Encoder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[H264VideoProvider.State.values().length];
            try {
                iArr[H264VideoProvider.State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H264VideoProvider.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H264VideoProvider.State.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoCBRMode.values().length];
            try {
                iArr2[VideoCBRMode.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoCBRMode.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoCBRMode.ENFORCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H264Encoder(Context context, Handler handler, String str, VideoCBRMode videoCBRMode, int i, TimeMachine timeMachine, izs<? super gzs<s3q0>, s3q0> izsVar, LoggerInterface loggerInterface) {
        this.mContext = context;
        this.workingHandler = handler;
        this.cbrMode = videoCBRMode;
        this.videoBitrateMarginPercent = i;
        this._timeMachine = timeMachine;
        this.runOnGLThread = izsVar;
        this._videoEncoder = new hoo0(createTSProvider(), str, loggerInterface);
        this._captureFpsCounter = new ft5(1000L, timeMachine);
        this._encoderFpsCounter = new ft5(1000L, timeMachine);
    }

    private final EncoderConfig.CBRMode convertToEncoderConfigCBRMode(VideoCBRMode videoCBRMode) {
        int i = WhenMappings.$EnumSwitchMapping$1[videoCBRMode.ordinal()];
        if (i == 1) {
            return EncoderConfig.CBRMode.DISABLED;
        }
        if (i == 2) {
            return EncoderConfig.CBRMode.ENABLED;
        }
        if (i == 3) {
            return EncoderConfig.CBRMode.ENFORCED;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EncoderConfig createEncoderConfig(H264VideoProvider.Params params) {
        ne7.m(TAG, "createEncoderConfig() - " + params.getSize());
        int width = params.getSize().getWidth();
        int height = params.getSize().getHeight();
        Integer num = this._lastFrameRotation;
        return new EncoderConfig(width, height, num != null ? num.intValue() : 0, (int) params.getBitrate(), this.videoBitrateMarginPercent, params.getFps(), params.getIframeIntervalSeconds(), convertToEncoderConfigCBRMode(this.cbrMode));
    }

    private final cyo0 createTSProvider() {
        return new d9(this, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createTSProvider$lambda$0(H264Encoder h264Encoder) {
        return h264Encoder._timeMachine.currentTimeMillis();
    }

    private final double getFps() {
        double b;
        synchronized (this) {
            ft5 ft5Var = this._encoderFpsCounter;
            ft5Var.getClass();
            b = tvo0.b(ft5Var);
            s3q0 s3q0Var = s3q0.a;
        }
        return b;
    }

    private final int getLastFrameRotationAngle() {
        Integer num = this._lastFrameRotation;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final void internalSetBitrate(final H264VideoProvider.Params params) {
        ne7.m(TAG, "internalSetBitrate()");
        this._params = params;
        VideoDataHandler videoDataHandler = this._videoDataHandler;
        if (videoDataHandler != null) {
            videoDataHandler.handleEndOfStream();
        }
        final VideoDataHandler videoDataHandler2 = new VideoDataHandler(params);
        set_videoDataHandler(videoDataHandler2);
        this.runOnGLThread.invoke(new gzs() { // from class: ru.ok.media.video.c
            @Override // xsna.gzs
            public final Object invoke() {
                s3q0 internalSetBitrate$lambda$5;
                internalSetBitrate$lambda$5 = H264Encoder.internalSetBitrate$lambda$5(H264Encoder.this, videoDataHandler2, params);
                return internalSetBitrate$lambda$5;
            }
        });
        ne7.m(TAG, "internalSetBitrate() - end, videoDataHandler: isActive= " + videoDataHandler2.isActive() + " isBlocked()= " + videoDataHandler2.isBlocked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 internalSetBitrate$lambda$5(H264Encoder h264Encoder, VideoDataHandler videoDataHandler, H264VideoProvider.Params params) {
        hoo0 hoo0Var = h264Encoder._videoEncoder;
        hoo0Var.m = videoDataHandler;
        int bitrate = (int) params.getBitrate();
        EncoderConfig encoderConfig = hoo0Var.e;
        StringBuilder b = ji.b(bitrate, "TextureMovieEncoder.setBitrate() - bitrate= ", "currentConfig.bitrateMarginPercent= ");
        b.append(encoderConfig == null ? "null" : Integer.valueOf(encoderConfig.e));
        ne7.m("xsna.hoo0", b.toString());
        com.android.grafika.a aVar = hoo0Var.c;
        if (aVar != null) {
            int i = encoderConfig.a;
            int i2 = encoderConfig.b;
            int i3 = encoderConfig.c;
            int i4 = encoderConfig.e;
            EncoderConfig encoderConfig2 = new EncoderConfig(i, i2, i3, bitrate, i4, encoderConfig.f, encoderConfig.g, encoderConfig.h);
            if (bitrate > 0 || i4 == 0) {
                bitrate = (int) ((bitrate * (100 - i4)) / 100);
            }
            synchronized (aVar) {
                ne7.n("xsna.bjs0", "VideoEncoderMediaCodec.setBitrate() - bitrate= " + bitrate);
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", bitrate);
                try {
                    aVar.e.setParameters(bundle);
                } catch (IllegalStateException e) {
                    aVar.b.a.logDetailed("VideoEncoderMediaCodec.setBitrate() - failed to set bitrate= " + bitrate + " error= " + e);
                }
            }
            hoo0Var.e = encoderConfig2;
        } else {
            ne7.n("xsna.hoo0", "TextureMovieEncoder.setBitrate() - failed to set bitrate " + bitrate + " - no encoder");
        }
        return s3q0.a;
    }

    private final void internalStart(H264VideoProvider.Params params) {
        ne7.m(TAG, "internalStart()");
        this._muteMediaCallbacks = false;
        this._params = params;
        this._state = H264VideoProvider.State.RUNNING;
        final VideoDataHandler videoDataHandler = new VideoDataHandler(params);
        set_videoDataHandler(videoDataHandler);
        this._encoderConfig = createEncoderConfig(params);
        this.runOnGLThread.invoke(new gzs() { // from class: ru.ok.media.video.b
            @Override // xsna.gzs
            public final Object invoke() {
                s3q0 internalStart$lambda$3;
                internalStart$lambda$3 = H264Encoder.internalStart$lambda$3(H264Encoder.this, videoDataHandler);
                return internalStart$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 internalStart$lambda$3(H264Encoder h264Encoder, VideoDataHandler videoDataHandler) {
        ne7.m(TAG, "internalStart() - gl begin");
        h264Encoder._videoEncoder.c();
        hoo0 hoo0Var = h264Encoder._videoEncoder;
        hoo0Var.m = videoDataHandler;
        hoo0Var.e();
        ne7.m(TAG, "internalStart() - gl end");
        return s3q0.a;
    }

    private final void internalStop(H264VideoProvider.StopReason stopReason, H264VideoProvider.State state) {
        H264VideoProvider.Consumer consumer;
        if (this._state != H264VideoProvider.State.RELEASED) {
            this._state = state;
        }
        H264VideoProvider.Params params = this._params;
        this._params = null;
        final VideoDataHandler videoDataHandler = this._videoDataHandler;
        set_videoDataHandler(null);
        this.runOnGLThread.invoke(new gzs() { // from class: ru.ok.media.video.a
            @Override // xsna.gzs
            public final Object invoke() {
                s3q0 internalStop$lambda$4;
                internalStop$lambda$4 = H264Encoder.internalStop$lambda$4(H264Encoder.this, videoDataHandler);
                return internalStop$lambda$4;
            }
        });
        if (params == null || (consumer = params.getConsumer()) == null) {
            return;
        }
        consumer.handleH264Stopped(stopReason, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 internalStop$lambda$4(H264Encoder h264Encoder, VideoDataHandler videoDataHandler) {
        ne7.m(TAG, "internalStop() - gl begin");
        h264Encoder._videoEncoder.d();
        hoo0 hoo0Var = h264Encoder._videoEncoder;
        hoo0Var.m = videoDataHandler;
        hoo0Var.e();
        if (videoDataHandler != null) {
            videoDataHandler.handleEndOfStream();
        }
        ne7.m(TAG, "internalStop() - gl end");
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$8(H264Encoder h264Encoder) {
        ne7.t(TAG, "H264Encoder.release() - in state " + h264Encoder._state);
        int i = WhenMappings.$EnumSwitchMapping$0[h264Encoder._state.ordinal()];
        if (i == 1) {
            h264Encoder._state = H264VideoProvider.State.RELEASED;
        } else if (i == 2) {
            h264Encoder.internalStop(H264VideoProvider.StopReason.RELEASED, H264VideoProvider.State.RELEASED);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void set_videoDataHandler(VideoDataHandler videoDataHandler) {
        if (this._videoDataHandler != videoDataHandler) {
            ne7.m(TAG, "_videoDataHandler setter: " + this._videoDataHandler + " -> " + videoDataHandler + " from " + mnh0.A(new Exception()));
            this._videoDataHandler = videoDataHandler;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$6(H264Encoder h264Encoder, H264VideoProvider.Params params) {
        ne7.t(TAG, "H264Encoder.start() - in state " + h264Encoder._state);
        int i = WhenMappings.$EnumSwitchMapping$0[h264Encoder._state.ordinal()];
        if (i == 1) {
            h264Encoder.internalStart(params);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (epx.f(h264Encoder._params, params)) {
                return;
            }
            if (params.isSameWithoutBitrate(h264Encoder._params)) {
                h264Encoder.internalSetBitrate(params);
            } else {
                h264Encoder.internalStop(H264VideoProvider.StopReason.PARAMS_CHANGED, H264VideoProvider.State.IDLE);
                h264Encoder.internalStart(params);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$7(H264Encoder h264Encoder) {
        ne7.t(TAG, "H264Encoder.stop() - in state " + h264Encoder._state);
        int i = WhenMappings.$EnumSwitchMapping$0[h264Encoder._state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                h264Encoder.internalStop(H264VideoProvider.StopReason.STOP, H264VideoProvider.State.IDLE);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final String toShortString(VideoCBRMode videoCBRMode) {
        int i = WhenMappings.$EnumSwitchMapping$1[videoCBRMode.ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return "CBR";
        }
        if (i == 3) {
            return "CBR!";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public double getCaptureAverageFps() {
        double b;
        synchronized (this) {
            ft5 ft5Var = this._captureFpsCounter;
            ft5Var.getClass();
            b = tvo0.b(ft5Var);
            s3q0 s3q0Var = s3q0.a;
        }
        return b;
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public H264VideoProvider.Params getCurrentParams() {
        return this._params;
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public String getDebugString() {
        String b;
        String str;
        String str2;
        H264VideoProvider.Params params = this._params;
        VideoDataHandler videoDataHandler = this._videoDataHandler;
        H264VideoProvider.State state = this._state;
        if (videoDataHandler == null) {
            b = "null";
        } else {
            b = com.vk.movika.sdk.base.model.history.b.b(videoDataHandler.get_id(), X3.j.d, "] ", videoDataHandler.isActive() ? SignalingProtocol.KEY_ACTIVE : "inactive");
        }
        str = "";
        if (params != null) {
            Locale locale = Locale.US;
            VideoSize videoSize = this._lastCapturedFrameSize;
            if (videoSize == null || (str2 = videoSize.toString()) == null) {
                str2 = "?";
            }
            String str3 = str2;
            String videoSize2 = params.getSize().toString();
            Integer valueOf = Integer.valueOf(params.getFps());
            Double valueOf2 = Double.valueOf(getFps());
            Integer valueOf3 = Integer.valueOf(getLastFrameRotationAngle());
            String formatBitrate = DebugUtils.formatBitrate(params.getBitrate(), false);
            int i = this.videoBitrateMarginPercent;
            str = String.format(locale, "\nH.264: %s -> %s@%d (%.1f) %d° %s%s %s", Arrays.copyOf(new Object[]{str3, videoSize2, valueOf, valueOf2, valueOf3, formatBitrate, i != 0 ? tgw.b(i, " (-", " %)") : "", toShortString(this.cbrMode)}, 8));
        }
        return "Video " + state + " " + b + str + "\nCap: " + this._framesCaptured + " cfgs: " + this._numEncodedConfigs + " frms: " + this._framesEncoded + " skip/drop: " + this._framesSkipped + DomExceptionUtils.SEPARATOR + this._framesDropped;
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public H264VideoProvider.State getState() {
        return this._state;
    }

    public final void processVideoFrame(GL10 gl10, Streamer.VideoFrame videoFrame) {
        this._framesCaptured.incrementAndGet();
        synchronized (this) {
            ft5 ft5Var = this._captureFpsCounter;
            ft5Var.getClass();
            tvo0.a(ft5Var, 1);
            s3q0 s3q0Var = s3q0.a;
        }
        this._lastFrameRotation = Integer.valueOf(videoFrame.getVideoRotationAngle());
        this._lastCapturedFrameSize = videoFrame.getSize();
        yis0 textureInfo = videoFrame.getTextureInfo();
        textureInfo.getClass();
        hoo0 hoo0Var = this._videoEncoder;
        hoo0Var.getClass();
        hoo0Var.b = new yis0(textureInfo.a, textureInfo.d, textureInfo.b, textureInfo.c, textureInfo.e, textureInfo.f);
        hoo0 hoo0Var2 = this._videoEncoder;
        if (hoo0Var2.h) {
            hoo0Var2.k = true;
        }
        hoo0Var2.h = false;
        this._videoEncoder.e();
        this._videoEncoder.d = this._encoderConfig;
        VideoDataHandler videoDataHandler = this._videoDataHandler;
        if (videoDataHandler == null) {
            this._framesSkipped.incrementAndGet();
            return;
        }
        hoo0 hoo0Var3 = this._videoEncoder;
        hoo0Var3.m = videoDataHandler;
        hoo0Var3.a(this.mContext, gl10);
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public void release() {
        this._muteMediaCallbacks = true;
        this.workingHandler.post(new b3m(this, 2));
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public void requestKeyFrame() {
        ne7.t(TAG, "H264Encoder.requestKeyFrame()");
        this._keyFrameRequested.getAndSet(true);
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public void start(H264VideoProvider.Params params) {
        params.getSize().getWidth();
        params.getSize().getHeight();
        params.getBitrate();
        params.getBitrate();
        params.getFps();
        params.getIframeIntervalSeconds();
        this.workingHandler.post(new qo2(4, this, params));
    }

    @Override // ru.ok.media.api.H264VideoProvider
    public void stop() {
        this._muteMediaCallbacks = true;
        this.workingHandler.post(new t12(this, 7));
    }
}
