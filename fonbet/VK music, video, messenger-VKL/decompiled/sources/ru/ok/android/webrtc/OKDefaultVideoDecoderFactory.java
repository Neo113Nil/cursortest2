package ru.ok.android.webrtc;

import android.media.MediaCodecInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import org.webrtc.CalledByNative;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.HardwareVideoDecoderFactory;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;
import xsna.bjn0;
import xsna.bpn0;
import xsna.epx;
import xsna.l500;
import xsna.os30;
import xsna.wr;

/* loaded from: classes9.dex */
public final class OKDefaultVideoDecoderFactory implements VideoDecoderFactory {
    public final EglBase.Context a;
    public final RTCLog b;
    public final boolean e;
    public final Lazy c = new bpn0(new l500(this, 17));
    public final Lazy d = new bpn0(new os30(this, 8));
    public volatile boolean f = true;

    public static final class MyHardwareVideoDecoderFactory extends HardwareVideoDecoderFactory {
        public MyHardwareVideoDecoderFactory(EglBase.Context context) {
            super(context, new z());
        }

        public static final boolean a(MediaCodecInfo mediaCodecInfo) {
            return true;
        }
    }

    public static final class StubVideoDecoderFactory implements VideoDecoderFactory {
        public StubVideoDecoderFactory(RTCLog rTCLog, Throwable th) {
            rTCLog.reportException("OKDefaultVideoDecoderFactory", "Video decoder factory init failed", th);
        }

        @Override // org.webrtc.VideoDecoderFactory
        public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
            return null;
        }
    }

    public static final class VideoDecoderLifecycleLogger implements VideoDecoder {
        public final VideoDecoder a;
        public final RTCLog b;

        public VideoDecoderLifecycleLogger(VideoDecoder videoDecoder, VideoCodecInfo videoCodecInfo, RTCLog rTCLog) {
            this.a = videoDecoder;
            this.b = rTCLog;
            rTCLog.log("VideoDecoderLifecycleLogger", "createDecoder(" + getImplementationName() + "), codec: " + videoCodecInfo);
        }

        @Override // org.webrtc.VideoDecoder
        public long createNative(long j) {
            try {
                return this.a.createNative(j);
            } catch (Throwable th) {
                this.b.reportException("VideoDecoderLifecycleLogger", "Decoder createNative failed", new IllegalStateException("Error on decoder createNative", th));
                return 0L;
            }
        }

        @Override // org.webrtc.VideoDecoder
        @CalledByNative
        public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
            try {
                return this.a.decode(encodedImage, decodeInfo, j);
            } catch (Throwable unused) {
                return VideoCodecStatus.ERROR;
            }
        }

        @Override // org.webrtc.VideoDecoder
        @CalledByNative
        public String getImplementationName() {
            try {
                VideoDecoder videoDecoder = this.a;
                return videoDecoder instanceof VideoDecoderFallback ? "VideoDecoderFallVideoDecoderFallbackback" : videoDecoder.getImplementationName();
            } catch (Throwable unused) {
                return "VideoDecoderLifecycleLogger";
            }
        }

        @Override // org.webrtc.VideoDecoder
        @CalledByNative
        public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
            RTCLog rTCLog = this.b;
            Integer valueOf = settings != null ? Integer.valueOf(settings.numberOfCores) : null;
            Integer valueOf2 = settings != null ? Integer.valueOf(settings.width) : null;
            Integer valueOf3 = settings != null ? Integer.valueOf(settings.height) : null;
            StringBuilder a = wr.a(valueOf, "initDecode(cores=", valueOf2, ", size=", "x");
            a.append(valueOf3);
            a.append(")");
            rTCLog.log("VideoDecoderLifecycleLogger", a.toString());
            try {
                return this.a.initDecode(settings, callback);
            } catch (Throwable th) {
                this.b.reportException("VideoDecoderLifecycleLogger", "Decoder init failed", new IllegalStateException("Error on init decoder", th));
                return VideoCodecStatus.ERROR;
            }
        }

        @Override // org.webrtc.VideoDecoder
        @CalledByNative
        public VideoCodecStatus release() {
            this.b.log("VideoDecoderLifecycleLogger", "release()");
            try {
                return this.a.release();
            } catch (Throwable th) {
                this.b.reportException("VideoDecoderLifecycleLogger", "Decoder release failed", new IllegalStateException("Error on release decoder", th));
                return VideoCodecStatus.ERROR;
            }
        }
    }

    public OKDefaultVideoDecoderFactory(EglBase.Context context, RTCLog rTCLog, CallParams callParams) {
        this.a = context;
        this.b = rTCLog;
        this.e = callParams.getExperiments().e0();
    }

    public static final VideoDecoderFactory a(OKDefaultVideoDecoderFactory oKDefaultVideoDecoderFactory) {
        try {
            return new MyHardwareVideoDecoderFactory(oKDefaultVideoDecoderFactory.a);
        } catch (Throwable th) {
            return new StubVideoDecoderFactory(oKDefaultVideoDecoderFactory.b, new IllegalStateException("Can't create HardwareVideoDecoder", th));
        }
    }

    public static final VideoDecoderFactory b(OKDefaultVideoDecoderFactory oKDefaultVideoDecoderFactory) {
        try {
            return new SoftwareVideoDecoderFactory();
        } catch (Throwable th) {
            return new StubVideoDecoderFactory(oKDefaultVideoDecoderFactory.b, new IllegalStateException("Can't create SoftwareVideoDecoder", th));
        }
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        try {
            return a(videoCodecInfo);
        } catch (Throwable th) {
            this.b.reportException("OKDefaultVideoDecoderFactory", "Can't create video decoder", th);
            return null;
        }
    }

    public final void disableHWVPX() {
        this.f = false;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        try {
            return a();
        } catch (Throwable th) {
            this.b.reportException("OKDefaultVideoDecoderFactory", "get.supported.codecs.failed", th);
            return new VideoCodecInfo[0];
        }
    }

    public final VideoCodecInfo[] a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VideoCodecInfo[] supportedCodecs = ((VideoDecoderFactory) this.d.getValue()).getSupportedCodecs();
        Collections.addAll(linkedHashSet, Arrays.copyOf(supportedCodecs, supportedCodecs.length));
        VideoCodecInfo[] supportedCodecs2 = ((VideoDecoderFactory) this.c.getValue()).getSupportedCodecs();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (!this.f) {
            linkedHashSet2.add("VP8");
            linkedHashSet2.add("VP9");
        }
        if (!this.e) {
            linkedHashSet2.add("H265");
        }
        if (linkedHashSet2.isEmpty()) {
            Collections.addAll(linkedHashSet, Arrays.copyOf(supportedCodecs2, supportedCodecs2.length));
        } else {
            for (VideoCodecInfo videoCodecInfo : supportedCodecs2) {
                if (!linkedHashSet2.contains(videoCodecInfo.name)) {
                    linkedHashSet.add(videoCodecInfo);
                }
            }
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[0]);
    }

    public final VideoDecoder a(VideoCodecInfo videoCodecInfo) {
        VideoDecoder videoDecoder;
        if (videoCodecInfo != null) {
            String str = videoCodecInfo.name;
            if ((epx.f(str, "VP8") || epx.f(str, "VP9")) && !this.f) {
                VideoDecoder createDecoder = ((VideoDecoderFactory) this.d.getValue()).createDecoder(videoCodecInfo);
                if (createDecoder != null) {
                    return new VideoDecoderLifecycleLogger(createDecoder, videoCodecInfo, this.b);
                }
            } else {
                try {
                    videoDecoder = ((VideoDecoderFactory) this.c.getValue()).createDecoder(videoCodecInfo);
                } catch (Exception e) {
                    bjn0.b("Hardware encoder creating failed! Error=", e.getMessage(), this.b, "OKDefaultVideoDecoderFactory");
                    videoDecoder = null;
                }
                VideoDecoder createDecoder2 = ((VideoDecoderFactory) this.d.getValue()).createDecoder(videoCodecInfo);
                if (videoDecoder != null && createDecoder2 != null) {
                    videoDecoder = new VideoDecoderFallback(createDecoder2, videoDecoder);
                } else if (videoDecoder == null) {
                    if (createDecoder2 != null) {
                        videoDecoder = createDecoder2;
                    }
                }
                return new VideoDecoderLifecycleLogger(videoDecoder, videoCodecInfo, this.b);
            }
        }
        return null;
    }
}
