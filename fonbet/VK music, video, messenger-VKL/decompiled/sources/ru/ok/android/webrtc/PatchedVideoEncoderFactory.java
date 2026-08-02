package ru.ok.android.webrtc;

import androidx.credentials.provider.CredentialEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.collections.EmptySet;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import org.webrtc.BitrateAdjuster;
import org.webrtc.BitrateAdjusterFactory;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderExceptionHandler;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecMimeType;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoEncoderFallback;
import ru.ok.android.webrtc.PatchedVideoEncoderFactory;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.utils.TopologyProvider;
import xsna.an10;
import xsna.bpn0;
import xsna.efz;
import xsna.epx;
import xsna.g5g;
import xsna.gzs;
import xsna.n6j;
import xsna.w100;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class PatchedVideoEncoderFactory implements VideoEncoderFactory, MediaAdaptation.EventListener {
    public static final Companion Companion = new Companion(null);
    public final CallParams a;
    public final RTCLog b;
    public final TopologyProvider c;
    public final PatchedVideoEncoderFactoryCodecSelector d;
    public VideoCodecInfo e;
    public final CopyOnWriteArraySet f;
    public final boolean g;
    public final Lazy h;
    public final Lazy i;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final void setUpBitrateAdjusterForH265Encoder(final RTCLog rTCLog, CallParams callParams) {
            Float B = callParams.getExperiments().B();
            if (B != null) {
                final float floatValue = B.floatValue();
                HardwareVideoEncoderFactory.bitrateAdjusterFactory = new BitrateAdjusterFactory() { // from class: ru.ok.android.webrtc.PatchedVideoEncoderFactory$Companion$setUpBitrateAdjusterForH265Encoder$1
                    @Override // org.webrtc.BitrateAdjusterFactory
                    public BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
                        BitrateAdjuster createBitrateAdjuster = HardwareVideoEncoderFactory.defaultBitrateAdjusterFactory.createBitrateAdjuster(videoCodecMimeType, str);
                        return videoCodecMimeType == VideoCodecMimeType.H265 ? new PatchedVideoEncoderFactory.H265BitrateAdjuster(createBitrateAdjuster, floatValue, rTCLog) : createBitrateAdjuster;
                    }
                };
            }
        }
    }

    public static final class H265BitrateAdjuster implements BitrateAdjuster {
        public final BitrateAdjuster a;
        public final float b;
        public final RTCLog c;
        public int d;

        public H265BitrateAdjuster(BitrateAdjuster bitrateAdjuster, float f, RTCLog rTCLog) {
            this.a = bitrateAdjuster;
            this.b = f;
            this.c = rTCLog;
        }

        @Override // org.webrtc.BitrateAdjuster
        public int getAdjustedBitrateBps() {
            int adjustedBitrateBps = this.a.getAdjustedBitrateBps();
            int b = an10.b(adjustedBitrateBps * this.b);
            if (this.d != b) {
                this.d = b;
                this.c.log("PatchedVideoEncoderFactory", efz.a(adjustedBitrateBps, b, "Adjust bitrate for H265 encoder ", "->"));
            }
            return b;
        }

        @Override // org.webrtc.BitrateAdjuster
        public double getAdjustedFramerateFps() {
            return this.a.getAdjustedFramerateFps();
        }

        public final BitrateAdjuster getDelegatingBitrateAdjuster() {
            return this.a;
        }

        public final RTCLog getRtcLog() {
            return this.c;
        }

        public final float getScaleDownBy() {
            return this.b;
        }

        @Override // org.webrtc.BitrateAdjuster
        public void reportEncodedFrame(int i) {
            this.a.reportEncodedFrame(i);
        }

        @Override // org.webrtc.BitrateAdjuster
        public void setTargets(int i, double d) {
            this.a.setTargets(i, d);
        }
    }

    public interface Listener {
        void onNewCodecIsCreating(String str);
    }

    public static final class StubVideoEncoderFactory implements VideoEncoderFactory {
        public StubVideoEncoderFactory(RTCLog rTCLog, Throwable th) {
            rTCLog.reportException("PatchedVideoEncoderFactory", "Video encoder factory init failed", th);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            return null;
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return new VideoCodecInfo[0];
        }
    }

    public PatchedVideoEncoderFactory(final EglBase.Context context, boolean z, CallEventualStatSender callEventualStatSender, CallParams callParams, RTCLog rTCLog, TopologyProvider topologyProvider, final CropAndScaleParamsProvider cropAndScaleParamsProvider, final HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        this.a = callParams;
        this.b = rTCLog;
        this.c = topologyProvider;
        this.d = z ? new PatchedVideoEncoderFactoryCodecSelector(this, callEventualStatSender, callParams, rTCLog) : null;
        this.f = new CopyOnWriteArraySet();
        this.g = callParams.getExperiments().e0();
        this.h = new bpn0(new gzs() { // from class: xsna.zp90
            @Override // xsna.gzs
            public final Object invoke() {
                return PatchedVideoEncoderFactory.a(EglBase.Context.this, this, cropAndScaleParamsProvider, hardwareVideoEncoderExceptionHandler);
            }
        });
        this.i = new bpn0(new w100(this, 18));
    }

    public static final VideoEncoderFactory a(EglBase.Context context, PatchedVideoEncoderFactory patchedVideoEncoderFactory, CropAndScaleParamsProvider cropAndScaleParamsProvider, HardwareVideoEncoderExceptionHandler hardwareVideoEncoderExceptionHandler) {
        try {
            return new HardwareVideoEncoderFactory(context, false, false, patchedVideoEncoderFactory.a.getExperiments().h().h(), cropAndScaleParamsProvider, hardwareVideoEncoderExceptionHandler);
        } catch (Throwable th) {
            return new StubVideoEncoderFactory(patchedVideoEncoderFactory.b, new IllegalStateException("Can't create HardwareVideoEncoder", th));
        }
    }

    public static final void setUpBitrateAdjusterForH265Encoder(RTCLog rTCLog, CallParams callParams) {
        Companion.setUpBitrateAdjusterForH265Encoder(rTCLog, callParams);
    }

    public final void addListener(Listener listener) {
        this.f.add(listener);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        PatchedVideoEncoderFactoryCodecSelector patchedVideoEncoderFactoryCodecSelector = this.d;
        boolean isSoftwareCodecProhibited = patchedVideoEncoderFactoryCodecSelector != null ? patchedVideoEncoderFactoryCodecSelector.isSoftwareCodecProhibited(videoCodecInfo) : false;
        VideoEncoder createEncoder = (this.a.getExperiments().h() == ExperimentsInterface.SimulcastState.ONLY_SW_VP8 && this.c.getIdentity() == Topology.SERVER) ? null : ((VideoEncoderFactory) this.h.getValue()).createEncoder(videoCodecInfo);
        VideoEncoder createEncoder2 = (createEncoder == null || !isSoftwareCodecProhibited) ? ((VideoEncoderFactory) this.i.getValue()).createEncoder(videoCodecInfo) : null;
        RTCLog rTCLog = this.b;
        String str = videoCodecInfo.name;
        String str2 = createEncoder == null ? CredentialEntry.FALSE_STRING : "true";
        String str3 = createEncoder2 == null ? CredentialEntry.FALSE_STRING : "true";
        String str4 = this.a.getExperiments().h() == ExperimentsInterface.SimulcastState.DISABLED ? CredentialEntry.FALSE_STRING : "true";
        String str5 = this.a.getExperiments().h() != ExperimentsInterface.SimulcastState.ALL_SUPPORTED_CODEC ? CredentialEntry.FALSE_STRING : "true";
        StringBuilder a = xe9.a("Encoder is about to create: ", str, " hw=", str2, " sw=");
        n6j.b(a, str3, " simulcast sw=", str4, " simulcast hw=");
        a.append(str5);
        rTCLog.log("PatchedVideoEncoderFactory", a.toString());
        this.e = videoCodecInfo;
        String str6 = videoCodecInfo.name;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onNewCodecIsCreating(str6);
        }
        return (createEncoder == null || createEncoder2 == null) ? createEncoder == null ? createEncoder2 : createEncoder : new VideoEncoderFallback(createEncoder2, createEncoder);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return this.d;
    }

    public final String getLastSelectedEncoderName() {
        VideoCodecInfo videoCodecInfo = this.e;
        if (videoCodecInfo != null) {
            return videoCodecInfo.name;
        }
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.a.getExperiments().h().h() && this.c.getIdentity() == Topology.SERVER) {
            VideoCodecInfo[] supportedSoftwareCodecs = getSupportedSoftwareCodecs();
            ArrayList arrayList = new ArrayList();
            for (VideoCodecInfo videoCodecInfo : supportedSoftwareCodecs) {
                if (!epx.f(videoCodecInfo.name, "VP9")) {
                    arrayList.add(videoCodecInfo);
                }
            }
            linkedHashSet.addAll(arrayList);
        } else {
            g5g.A(linkedHashSet, getSupportedSoftwareCodecs());
        }
        VideoCodecInfo[] supportedCodecs = (this.a.getExperiments().h() == ExperimentsInterface.SimulcastState.ONLY_SW_VP8 && this.c.getIdentity() == Topology.SERVER) ? new VideoCodecInfo[0] : ((VideoEncoderFactory) this.h.getValue()).getSupportedCodecs();
        Set singleton = this.g ? EmptySet.b : Collections.singleton("H265");
        if (singleton.isEmpty()) {
            g5g.A(linkedHashSet, supportedCodecs);
        } else {
            for (VideoCodecInfo videoCodecInfo2 : supportedCodecs) {
                if (!singleton.contains(videoCodecInfo2.name)) {
                    linkedHashSet.add(videoCodecInfo2);
                }
            }
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[0]);
    }

    public final VideoCodecInfo[] getSupportedHardwareCodecs() {
        return (this.a.getExperiments().h() == ExperimentsInterface.SimulcastState.ONLY_SW_VP8 && this.c.getIdentity() == Topology.SERVER) ? new VideoCodecInfo[0] : ((VideoEncoderFactory) this.h.getValue()).getSupportedCodecs();
    }

    public final VideoCodecInfo[] getSupportedSoftwareCodecs() {
        return ((VideoEncoderFactory) this.i.getValue()).getSupportedCodecs();
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.MediaAdaptation.EventListener
    public void onNetworkConditionChanged(MediaAdaptation.NetworkConditionChange networkConditionChange) {
        PatchedVideoEncoderFactoryCodecSelector patchedVideoEncoderFactoryCodecSelector = this.d;
        if (patchedVideoEncoderFactoryCodecSelector != null) {
            patchedVideoEncoderFactoryCodecSelector.onNetworkConditionChanged(networkConditionChange);
        }
    }

    public final void removeListener(Listener listener) {
        this.f.remove(listener);
    }

    public static final VideoEncoderFactory a(PatchedVideoEncoderFactory patchedVideoEncoderFactory) {
        try {
            return new SoftwareVideoEncoderFactory();
        } catch (Throwable th) {
            return new StubVideoEncoderFactory(patchedVideoEncoderFactory.b, new IllegalStateException("Can't create SoftwareVideoEncoder", th));
        }
    }
}
