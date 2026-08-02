package ru.ok.android.webrtc.signaling.api;

import xsna.de;
import xsna.epx;
import xsna.gsi0;
import xsna.n23;
import xsna.wn4;

/* loaded from: classes9.dex */
public final class ServerCallCapabilities {
    public final int a;
    public final Integer b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public ServerCallCapabilities(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, int i4, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = i3;
        this.j = z6;
        this.k = i4;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
    }

    public final int component1() {
        return this.a;
    }

    public final boolean component10() {
        return this.j;
    }

    public final int component11() {
        return this.k;
    }

    public final boolean component12() {
        return this.l;
    }

    public final boolean component13() {
        return this.m;
    }

    public final boolean component14() {
        return this.n;
    }

    public final boolean component15() {
        return this.o;
    }

    public final Integer component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    public final ServerCallCapabilities copy(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, int i4, boolean z7, boolean z8, boolean z9, boolean z10) {
        return new ServerCallCapabilities(i, num, i2, z, z2, z3, z4, z5, i3, z6, i4, z7, z8, z9, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerCallCapabilities)) {
            return false;
        }
        ServerCallCapabilities serverCallCapabilities = (ServerCallCapabilities) obj;
        return this.a == serverCallCapabilities.a && epx.f(this.b, serverCallCapabilities.b) && this.c == serverCallCapabilities.c && this.d == serverCallCapabilities.d && this.e == serverCallCapabilities.e && this.f == serverCallCapabilities.f && this.g == serverCallCapabilities.g && this.h == serverCallCapabilities.h && this.i == serverCallCapabilities.i && this.j == serverCallCapabilities.j && this.k == serverCallCapabilities.k && this.l == serverCallCapabilities.l && this.m == serverCallCapabilities.m && this.n == serverCallCapabilities.n && this.o == serverCallCapabilities.o;
    }

    public final int getAnimojiDataChannelVersion() {
        return this.i;
    }

    public final Integer getEstimatedPerfIndex() {
        return this.b;
    }

    public final int getMaxH264Decoders() {
        return this.a;
    }

    public final int getProducerCommandDataChannelVersion() {
        return this.c;
    }

    public final int getVideoTracksCount() {
        return this.k;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.o) + wn4.b(this.n, wn4.b(this.m, wn4.b(this.l, de.v(this.k, wn4.b(this.j, de.v(this.i, wn4.b(this.h, wn4.b(this.g, wn4.b(this.f, wn4.b(this.e, wn4.b(this.d, de.v(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31))))))))))));
    }

    public final boolean isAnimojiBackendRenderEnabled() {
        return this.j;
    }

    public final boolean isAnimojiDataChannelEnabled() {
        return this.h;
    }

    public final boolean isAsrOnlineEnabled() {
        return this.l;
    }

    public final boolean isConsumerUpdateEnabled() {
        return this.d;
    }

    public final boolean isDataChannelScreenShareRecvEnabled() {
        return this.f;
    }

    public final boolean isDataChannelScreenShareSendEnabled() {
        return this.g;
    }

    public final boolean isDeviceAudioShareEnabled() {
        return this.n;
    }

    public final boolean isFastScreenCaptureEnabled() {
        return this.m;
    }

    public final boolean isOnDemandTracksEnabled() {
        return this.e;
    }

    public final boolean isSimulcastEnabled() {
        return this.o;
    }

    public String toString() {
        int i = this.a;
        Integer num = this.b;
        int i2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        boolean z5 = this.h;
        int i3 = this.i;
        boolean z6 = this.j;
        int i4 = this.k;
        boolean z7 = this.l;
        boolean z8 = this.m;
        boolean z9 = this.n;
        boolean z10 = this.o;
        StringBuilder sb = new StringBuilder("ServerCallCapabilities(maxH264Decoders=");
        sb.append(i);
        sb.append(", estimatedPerfIndex=");
        sb.append(num);
        sb.append(", producerCommandDataChannelVersion=");
        sb.append(i2);
        sb.append(", isConsumerUpdateEnabled=");
        sb.append(z);
        sb.append(", isOnDemandTracksEnabled=");
        gsi0.c(sb, z2, ", isDataChannelScreenShareRecvEnabled=", z3, ", isDataChannelScreenShareSendEnabled=");
        gsi0.c(sb, z4, ", isAnimojiDataChannelEnabled=", z5, ", animojiDataChannelVersion=");
        sb.append(i3);
        sb.append(", isAnimojiBackendRenderEnabled=");
        sb.append(z6);
        sb.append(", videoTracksCount=");
        sb.append(i4);
        sb.append(", isAsrOnlineEnabled=");
        sb.append(z7);
        sb.append(", isFastScreenCaptureEnabled=");
        gsi0.c(sb, z8, ", isDeviceAudioShareEnabled=", z9, ", isSimulcastEnabled=");
        return n23.b(sb, z10, ")");
    }
}
