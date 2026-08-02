package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: CronetQuic.kt */
/* loaded from: classes2.dex */
public final class yek {
    public final List<zfv> a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final Map<String, Object> o;

    static {
        new yek(null, 0, 0, 0, false, false, false, false, false, false, false, false, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
    }

    public yek() {
        this(null, 0, 0, 0, false, false, false, false, false, false, false, false, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
    }

    public final Map<String, Object> a() {
        return this.o;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        return this.l;
    }

    public final boolean d() {
        return this.f;
    }

    public final List<zfv> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yek)) {
            return false;
        }
        yek yekVar = (yek) obj;
        return epx.f(this.a, yekVar.a) && this.b == yekVar.b && this.c == yekVar.c && this.d == yekVar.d && this.e == yekVar.e && this.f == yekVar.f && this.g == yekVar.g && this.h == yekVar.h && this.i == yekVar.i && this.j == yekVar.j && this.k == yekVar.k && this.l == yekVar.l && this.m == yekVar.m && epx.f(this.n, yekVar.n) && epx.f(this.o, yekVar.o);
    }

    public final int f() {
        return this.c;
    }

    public final int g() {
        return this.b;
    }

    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        return this.o.hashCode() + urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        return this.g;
    }

    public final boolean k() {
        return this.j;
    }

    public final int l() {
        return this.d;
    }

    public final boolean m() {
        return this.m;
    }

    public final String n() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CronetQuic(hints=");
        sb.append(this.a);
        sb.append(", maxServerConfigs=");
        sb.append(this.b);
        sb.append(", idleConnectionTimeout=");
        cgn.a(this.c, this.d, ", reducedPingTimeout=", ", closeSessionOnIpChange=", sb);
        gsi0.c(sb, this.e, ", goAwaySessionOnIpChange=", this.f, ", migrateSessionOnNetworkChange=");
        gsi0.c(sb, this.g, ", migrateSessionEarly=", this.h, ", migrateIdleSession=");
        gsi0.c(sb, this.i, ", originsToForceQuicOn=", this.j, ", recvBufferOptimizations=");
        gsi0.c(sb, this.k, ", disableTlsZeroRtt=", this.l, ", retryAlternateNetworkBeforeHandshake=");
        sb.append(this.m);
        sb.append(", version=");
        sb.append(this.n);
        sb.append(", additional=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }

    public yek(ArrayList arrayList, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, HashMap hashMap, int i4) {
        List<zfv> list = (i4 & 1) != 0 ? EmptyList.b : arrayList;
        int i5 = (i4 & 2) != 0 ? 0 : i;
        int i6 = (i4 & 4) != 0 ? 30 : i2;
        int i7 = (i4 & 8) != 0 ? 5 : i3;
        boolean z9 = (i4 & 16) != 0 ? true : z;
        boolean z10 = (i4 & 32) != 0 ? true : z2;
        boolean z11 = (i4 & 64) != 0 ? false : z3;
        boolean z12 = (i4 & 128) != 0 ? false : z4;
        boolean z13 = (i4 & 256) == 0 ? z5 : false;
        boolean z14 = (i4 & 512) != 0 ? true : z6;
        boolean z15 = (i4 & 1024) != 0 ? true : z7;
        boolean z16 = (i4 & 4096) != 0 ? true : z8;
        String str2 = (i4 & 8192) != 0 ? "h3" : str;
        Map<String, Object> map = (i4 & 16384) != 0 ? jgp.b : hashMap;
        this.a = list;
        this.b = i5;
        this.c = i6;
        this.d = i7;
        this.e = z9;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = z13;
        this.j = z14;
        this.k = z15;
        this.l = true;
        this.m = z16;
        this.n = str2;
        this.o = map;
    }
}
