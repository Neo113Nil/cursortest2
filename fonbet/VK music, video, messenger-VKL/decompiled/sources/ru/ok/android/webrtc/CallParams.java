package ru.ok.android.webrtc;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptationConfig;
import xsna.bh10;
import xsna.cgn;
import xsna.de;
import xsna.efz;
import xsna.h5s;
import xsna.odj;
import xsna.tj0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class CallParams {
    public final Bitrates a;
    public final boolean b;
    public final boolean c;
    public final Timeouts d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final String[] p;
    public final String[] q;
    public final boolean r;
    public final MediaAdaptation s;
    public final boolean t;
    public final ExperimentsInterface u;
    public final boolean v;
    public final boolean w;
    public final BadNetworkIndicatorConfig x;
    public final boolean y;
    public final boolean z;

    public static final class Bitrates {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public Bitrates(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
        }

        public static /* synthetic */ Bitrates copy$default(Bitrates bitrates, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i = bitrates.a;
            }
            if ((i10 & 2) != 0) {
                i2 = bitrates.b;
            }
            if ((i10 & 4) != 0) {
                i3 = bitrates.c;
            }
            if ((i10 & 8) != 0) {
                i4 = bitrates.d;
            }
            if ((i10 & 16) != 0) {
                i5 = bitrates.e;
            }
            if ((i10 & 32) != 0) {
                i6 = bitrates.f;
            }
            if ((i10 & 64) != 0) {
                i7 = bitrates.g;
            }
            if ((i10 & 128) != 0) {
                i8 = bitrates.h;
            }
            if ((i10 & 256) != 0) {
                i9 = bitrates.i;
            }
            int i11 = i8;
            int i12 = i9;
            int i13 = i6;
            int i14 = i7;
            int i15 = i5;
            int i16 = i3;
            return bitrates.copy(i, i2, i16, i4, i15, i13, i14, i11, i12);
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final int component3() {
            return this.c;
        }

        public final int component4() {
            return this.d;
        }

        public final int component5() {
            return this.e;
        }

        public final int component6() {
            return this.f;
        }

        public final int component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        public final int component9() {
            return this.i;
        }

        public final Bitrates copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new Bitrates(i, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bitrates)) {
                return false;
            }
            Bitrates bitrates = (Bitrates) obj;
            return this.a == bitrates.a && this.b == bitrates.b && this.c == bitrates.c && this.d == bitrates.d && this.e == bitrates.e && this.f == bitrates.f && this.g == bitrates.g && this.h == bitrates.h && this.i == bitrates.i;
        }

        public final int getBitrateAudio2g() {
            return this.f;
        }

        public final int getBitrateAudio3g() {
            return this.g;
        }

        public final int getBitrateAudioLte() {
            return this.h;
        }

        public final int getBitrateAudioMin() {
            return this.e;
        }

        public final int getBitrateAudioWifi() {
            return this.i;
        }

        public final int getBitrateVideo2g() {
            return this.a;
        }

        public final int getBitrateVideo3g() {
            return this.b;
        }

        public final int getBitrateVideoLte() {
            return this.c;
        }

        public final int getBitrateVideoWifi() {
            return this.d;
        }

        public int hashCode() {
            return Integer.hashCode(this.i) + de.v(this.h, de.v(this.g, de.v(this.f, de.v(this.e, de.v(this.d, de.v(this.c, de.v(this.b, Integer.hashCode(this.a) * 31)))))));
        }

        public final void setBitrateAudio2g(int i) {
            this.f = i;
        }

        public final void setBitrateAudio3g(int i) {
            this.g = i;
        }

        public final void setBitrateAudioLte(int i) {
            this.h = i;
        }

        public final void setBitrateAudioMin(int i) {
            this.e = i;
        }

        public final void setBitrateAudioWifi(int i) {
            this.i = i;
        }

        public final void setBitrateVideo2g(int i) {
            this.a = i;
        }

        public final void setBitrateVideo3g(int i) {
            this.b = i;
        }

        public final void setBitrateVideoLte(int i) {
            this.c = i;
        }

        public final void setBitrateVideoWifi(int i) {
            this.d = i;
        }

        public String toString() {
            int i = this.a;
            int i2 = this.b;
            int i3 = this.c;
            int i4 = this.d;
            int i5 = this.e;
            int i6 = this.f;
            int i7 = this.g;
            int i8 = this.h;
            int i9 = this.i;
            StringBuilder a = odj.a(i, i2, "Bitrates(bitrateVideo2g=", ", bitrateVideo3g=", ", bitrateVideoLte=");
            cgn.a(i3, i4, ", bitrateVideoWifi=", ", bitrateAudioMin=", a);
            cgn.a(i5, i6, ", bitrateAudio2g=", ", bitrateAudio3g=", a);
            cgn.a(i7, i8, ", bitrateAudioLte=", ", bitrateAudioWifi=", a);
            return h5s.c(i9, ")", a);
        }
    }

    public static final class MediaAdaptation {
        public final Settings a;
        public final Settings b;

        public static final class Settings {
            public final boolean a;
            public final MediaAdaptationConfig b;

            public Settings(boolean z, MediaAdaptationConfig mediaAdaptationConfig) {
                this.a = z;
                this.b = mediaAdaptationConfig;
            }

            public final MediaAdaptationConfig getConfig() {
                return this.b;
            }

            public final boolean isEnabled() {
                return this.a;
            }
        }

        public MediaAdaptation(Settings settings, Settings settings2) {
            this.a = settings;
            this.b = settings2;
        }

        public final Settings getGroupCallSettings() {
            return this.b;
        }

        public final Settings getP2pCallSettings() {
            return this.a;
        }
    }

    public static final class Timeouts {
        public final int a;
        public final int b;
        public final int c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final long h;

        public Timeouts(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = j5;
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final int component3() {
            return this.c;
        }

        public final long component4() {
            return this.d;
        }

        public final long component5() {
            return this.e;
        }

        public final long component6() {
            return this.f;
        }

        public final long component7() {
            return this.g;
        }

        public final long component8() {
            return this.h;
        }

        public final Timeouts copy(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
            return new Timeouts(i, i2, i3, j, j2, j3, j4, j5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Timeouts)) {
                return false;
            }
            Timeouts timeouts = (Timeouts) obj;
            return this.a == timeouts.a && this.b == timeouts.b && this.c == timeouts.c && this.d == timeouts.d && this.e == timeouts.e && this.f == timeouts.f && this.g == timeouts.g && this.h == timeouts.h;
        }

        public final long getMediaReceivingTimeoutMs() {
            return this.g;
        }

        public final long getNoDataTimeout() {
            return this.h;
        }

        public final long getNoPeerConnectionTimeoutMs() {
            return this.f;
        }

        public final long getNoSoundTimeoutMs() {
            return this.e;
        }

        public final int getSignalingMaxRetryCount() {
            return this.b;
        }

        public final int getSignalingMaxRetryTimeout() {
            return this.c;
        }

        public final long getSignalingPingTimeout() {
            return this.d;
        }

        public final int getTimeoutIceReconnectMillis() {
            return this.a;
        }

        public int hashCode() {
            return Long.hashCode(this.h) + bh10.a(bh10.a(bh10.a(bh10.a(de.v(this.c, de.v(this.b, Integer.hashCode(this.a) * 31)), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public String toString() {
            int i = this.a;
            int i2 = this.b;
            int i3 = this.c;
            long j = this.d;
            long j2 = this.e;
            long j3 = this.f;
            long j4 = this.g;
            long j5 = this.h;
            StringBuilder a = odj.a(i, i2, "Timeouts(timeoutIceReconnectMillis=", ", signalingMaxRetryCount=", ", signalingMaxRetryTimeout=");
            a.append(i3);
            a.append(", signalingPingTimeout=");
            a.append(j);
            tj0.d(a, ", noSoundTimeoutMs=", j2, ", noPeerConnectionTimeoutMs=");
            a.append(j3);
            tj0.d(a, ", mediaReceivingTimeoutMs=", j4, ", noDataTimeout=");
            return efz.b(j5, ")", a);
        }
    }

    public CallParams(Bitrates bitrates, boolean z, boolean z2, Timeouts timeouts, int i, boolean z3, boolean z4, boolean z5, boolean z6, List<String> list, boolean z7, boolean z8, int i2, boolean z9, boolean z10, String[] strArr, String[] strArr2, boolean z11, MediaAdaptation mediaAdaptation, boolean z12, ExperimentsInterface experimentsInterface, boolean z13, boolean z14, BadNetworkIndicatorConfig badNetworkIndicatorConfig, boolean z15, boolean z16) {
        this.a = bitrates;
        this.b = z;
        this.c = z2;
        this.d = timeouts;
        this.e = i;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = list;
        this.k = z7;
        this.l = z8;
        this.m = i2;
        this.n = z9;
        this.o = z10;
        this.p = strArr;
        this.q = strArr2;
        this.r = z11;
        this.s = mediaAdaptation;
        this.t = z12;
        this.u = experimentsInterface;
        this.v = z13;
        this.w = z14;
        this.x = badNetworkIndicatorConfig;
        this.y = z15;
        this.z = z16;
    }

    public final List<String> getAdditionalWhitelistedCodecPrefixes() {
        return this.j;
    }

    public final int getAnimojiDataChannelVersion() {
        return 2;
    }

    public final BadNetworkIndicatorConfig getBadNetworkIndicatorConfig() {
        return this.x;
    }

    public final Bitrates getBitrates() {
        return this.a;
    }

    public final boolean getDisablePerfReport() {
        return this.c;
    }

    public final boolean getDisableTCPCandidates() {
        return this.b;
    }

    public final boolean getEnableLossRttBadConnectionHandling() {
        return this.i;
    }

    public final ExperimentsInterface getExperiments() {
        return this.u;
    }

    public final MediaAdaptation getMediaAdaptation() {
        return this.s;
    }

    public final int getProducerCommandDataChannelVersion() {
        if (this.x.getSignalingConfig().getProducerCommandV3()) {
            return 3;
        }
        return isVideoTracksCountEnabled() ? 2 : 1;
    }

    public final boolean getShouldCircumventCallBlock() {
        return this.f;
    }

    public final boolean getShowLocalVideoInOriginalQuality() {
        return this.r;
    }

    public final boolean getStartCameraCapturerOnDemand() {
        return this.y;
    }

    public final int getTcpTurnCount() {
        return this.e;
    }

    public final Timeouts getTimeouts() {
        return this.d;
    }

    public final int getVideoTracksCount() {
        return this.m;
    }

    public final String[] getWebRTCAudioCodecs() {
        return this.p;
    }

    public final String[] getWebRTCVideoCodecs() {
        return this.q;
    }

    public final boolean isAsrOnlineEnabled() {
        return this.t;
    }

    public final boolean isConsumerReapplyEnabled() {
        return this.g;
    }

    public final boolean isDataChannelScreenshareRecvEnabled() {
        return this.k;
    }

    public final boolean isDataChannelScreenshareSendEnabled() {
        return this.l;
    }

    public final boolean isDeviceAudioShareEnabled() {
        return this.w;
    }

    public final boolean isFastRecoverEnabled() {
        return this.n;
    }

    public final boolean isFastScreenCaptureEnabled() {
        return this.v;
    }

    public final boolean isOnDemandTracksEnabled() {
        return this.h;
    }

    public final boolean isVideoTracksCountEnabled() {
        return this.m > 0;
    }

    public final boolean isWaitForAdminEnabled() {
        return this.z;
    }

    public final boolean isWebRTCCodecFilteringEnabled() {
        return this.o;
    }

    public CallParams(Bitrates bitrates, boolean z, boolean z2, Timeouts timeouts, int i, boolean z3, boolean z4, boolean z5, boolean z6, List list, boolean z7, boolean z8, int i2, boolean z9, boolean z10, String[] strArr, String[] strArr2, boolean z11, MediaAdaptation mediaAdaptation, boolean z12, ExperimentsInterface experimentsInterface, boolean z13, boolean z14, BadNetworkIndicatorConfig badNetworkIndicatorConfig, boolean z15, boolean z16, int i3, zcl zclVar) {
        this(bitrates, (i3 & 2) != 0 ? true : z, z2, timeouts, (i3 & 16) != 0 ? 0 : i, z3, z4, z5, z6, (i3 & 512) != 0 ? EmptyList.b : list, z7, z8, i2, z9, z10, strArr, strArr2, z11, mediaAdaptation, z12, experimentsInterface, z13, z14, badNetworkIndicatorConfig, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? true : z15, z16);
    }
}
