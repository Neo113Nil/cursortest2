package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.vho0;

/* compiled from: TextStyle.kt */
/* loaded from: classes11.dex */
public final class nmo0 {
    public static final nmo0 d = new nmo0(0, 0, null, null, 0, null, null, 0, 0, null, null, 0, 16777215);
    public final hik0 a;
    public final fh90 b;
    public final rua0 c;

    public nmo0(hik0 hik0Var, fh90 fh90Var, rua0 rua0Var) {
        this.a = hik0Var;
        this.b = fh90Var;
        this.c = rua0Var;
    }

    public static nmo0 a(nmo0 nmo0Var, long j, long j2, b6s b6sVar, v4s v4sVar, long j3, long j4, rua0 rua0Var, t7z t7zVar, int i) {
        long c = (i & 1) != 0 ? nmo0Var.a.a.c() : j;
        long j5 = (i & 2) != 0 ? nmo0Var.a.b : j2;
        b6s b6sVar2 = (i & 4) != 0 ? nmo0Var.a.c : b6sVar;
        hik0 hik0Var = nmo0Var.a;
        u5s u5sVar = hik0Var.d;
        v5s v5sVar = hik0Var.e;
        v4s v4sVar2 = (i & 32) != 0 ? hik0Var.f : v4sVar;
        String str = hik0Var.g;
        long j6 = (i & 128) != 0 ? hik0Var.h : j3;
        et6 et6Var = hik0Var.i;
        zho0 zho0Var = hik0Var.j;
        lwz lwzVar = hik0Var.k;
        long j7 = hik0Var.l;
        pdo0 pdo0Var = hik0Var.m;
        v4j0 v4j0Var = (i & 8192) != 0 ? hik0Var.n : null;
        qio qioVar = hik0Var.p;
        int i2 = (i & 32768) != 0 ? nmo0Var.b.a : 3;
        fh90 fh90Var = nmo0Var.b;
        int i3 = fh90Var.b;
        long j8 = (i & 131072) != 0 ? fh90Var.c : j4;
        iio0 iio0Var = fh90Var.d;
        rua0 rua0Var2 = (i & 524288) != 0 ? nmo0Var.c : rua0Var;
        return new nmo0(new hik0(l5g.d(c, hik0Var.a.c()) ? hik0Var.a : c != 16 ? new j8g(c) : vho0.a.a, j5, b6sVar2, u5sVar, v5sVar, v4sVar2, str, j6, et6Var, zho0Var, lwzVar, j7, pdo0Var, v4j0Var, rua0Var2 != null ? rua0Var2.a : null, qioVar), new fh90(i2, i3, j8, iio0Var, rua0Var2 != null ? rua0Var2.b : null, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? fh90Var.f : t7zVar, (i & 2097152) != 0 ? fh90Var.g : 0, fh90Var.h, fh90Var.i), rua0Var2);
    }

    public static nmo0 e(nmo0 nmo0Var, long j, long j2, b6s b6sVar, v4s v4sVar, long j3, pdo0 pdo0Var, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? l5g.k : j;
        long j6 = (i2 & 2) != 0 ? fno0.c : j2;
        b6s b6sVar2 = (i2 & 4) != 0 ? null : b6sVar;
        v4s v4sVar2 = (i2 & 32) != 0 ? null : v4sVar;
        long j7 = (i2 & 128) != 0 ? fno0.c : j3;
        long j8 = l5g.k;
        pdo0 pdo0Var2 = (i2 & 4096) != 0 ? null : pdo0Var;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (i2 & 131072) != 0 ? fno0.c : j4;
        hik0 a = iik0.a(nmo0Var.a, j5, null, Float.NaN, j6, b6sVar2, null, null, v4sVar2, null, j7, null, null, null, j8, pdo0Var2, null, null, null);
        fh90 a2 = gh90.a(nmo0Var.b, i3, 0, j9, null, null, null, 0, 0, null);
        return (nmo0Var.a == a && nmo0Var.b == a2) ? nmo0Var : new nmo0(a, a2);
    }

    public final long b() {
        return this.a.a.c();
    }

    public final boolean c(nmo0 nmo0Var) {
        if (this != nmo0Var) {
            return epx.f(this.b, nmo0Var.b) && this.a.b(nmo0Var.a);
        }
        return true;
    }

    public final nmo0 d(nmo0 nmo0Var) {
        return (nmo0Var == null || nmo0Var.equals(d)) ? this : new nmo0(this.a.d(nmo0Var.a), this.b.a(nmo0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmo0)) {
            return false;
        }
        nmo0 nmo0Var = (nmo0) obj;
        return epx.f(this.a, nmo0Var.a) && epx.f(this.b, nmo0Var.b) && epx.f(this.c, nmo0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        rua0 rua0Var = this.c;
        return hashCode + (rua0Var != null ? rua0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) l5g.j(b()));
        sb.append(", brush=");
        hik0 hik0Var = this.a;
        sb.append(hik0Var.a.e());
        sb.append(", alpha=");
        sb.append(hik0Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) fno0.f(hik0Var.b));
        sb.append(", fontWeight=");
        sb.append(hik0Var.c);
        sb.append(", fontStyle=");
        sb.append(hik0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(hik0Var.e);
        sb.append(", fontFamily=");
        sb.append(hik0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(hik0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) fno0.f(hik0Var.h));
        sb.append(", baselineShift=");
        sb.append(hik0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(hik0Var.j);
        sb.append(", localeList=");
        sb.append(hik0Var.k);
        sb.append(", background=");
        dn.h(hik0Var.l, ", textDecoration=", sb);
        sb.append(hik0Var.m);
        sb.append(", shadow=");
        sb.append(hik0Var.n);
        sb.append(", drawStyle=");
        sb.append(hik0Var.p);
        sb.append(", textAlign=");
        fh90 fh90Var = this.b;
        sb.append((Object) obo0.a(fh90Var.a));
        sb.append(", textDirection=");
        sb.append((Object) udo0.a(fh90Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) fno0.f(fh90Var.c));
        sb.append(", textIndent=");
        sb.append(fh90Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(fh90Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) q7z.a(fh90Var.g));
        sb.append(", hyphens=");
        sb.append((Object) plv.a(fh90Var.h));
        sb.append(", textMotion=");
        sb.append(fh90Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nmo0(hik0 hik0Var, fh90 fh90Var) {
        this(hik0Var, fh90Var, (r0 == null && r1 == null) ? null : new rua0(r0, r1));
        hua0 hua0Var = hik0Var.o;
        yta0 yta0Var = fh90Var.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nmo0(long j, long j2, b6s b6sVar, v4s v4sVar, long j3, pdo0 pdo0Var, v4j0 v4j0Var, int i, long j4, rua0 rua0Var, t7z t7zVar, int i2, int i3) {
        this(new hik0(r4, r6, r8, (u5s) null, (v5s) null, r11, (String) null, r13, (et6) null, (zho0) null, (lwz) null, r18, r20, r21, r9 != null ? r9.a : null, (qio) null), new fh90(r1, 0, r24, null, r10 != null ? r10.b : null, r26, r0, 0, null), r10);
        long j5 = (i3 & 1) != 0 ? l5g.k : j;
        long j6 = (i3 & 2) != 0 ? fno0.c : j2;
        b6s b6sVar2 = (i3 & 4) != 0 ? null : b6sVar;
        v4s v4sVar2 = (i3 & 32) != 0 ? null : v4sVar;
        long j7 = (i3 & 128) != 0 ? fno0.c : j3;
        long j8 = l5g.k;
        pdo0 pdo0Var2 = (i3 & 4096) != 0 ? null : pdo0Var;
        v4j0 v4j0Var2 = (i3 & 8192) != 0 ? null : v4j0Var;
        int i4 = (32768 & i3) != 0 ? 0 : i;
        long j9 = (131072 & i3) != 0 ? fno0.c : j4;
        rua0 rua0Var2 = (524288 & i3) != 0 ? null : rua0Var;
        t7z t7zVar2 = (1048576 & i3) != 0 ? null : t7zVar;
        int i5 = (i3 & 2097152) != 0 ? 0 : i2;
        rua0 rua0Var3 = rua0Var2;
    }
}
