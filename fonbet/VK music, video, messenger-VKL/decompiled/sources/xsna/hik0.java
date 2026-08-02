package xsna;

import xsna.us2;
import xsna.vho0;

/* compiled from: SpanStyle.kt */
/* loaded from: classes11.dex */
public final class hik0 implements us2.a {
    public final vho0 a;
    public final long b;
    public final b6s c;
    public final u5s d;
    public final v5s e;
    public final v4s f;
    public final String g;
    public final long h;
    public final et6 i;
    public final zho0 j;
    public final lwz k;
    public final long l;
    public final pdo0 m;
    public final v4j0 n;
    public final hua0 o;
    public final qio p;

    public hik0(long j, long j2, b6s b6sVar, u5s u5sVar, v5s v5sVar, v4s v4sVar, String str, long j3, et6 et6Var, zho0 zho0Var, lwz lwzVar, long j4, pdo0 pdo0Var, v4j0 v4j0Var, hua0 hua0Var, qio qioVar) {
        this(j != 16 ? new j8g(j) : vho0.a.a, j2, b6sVar, u5sVar, v5sVar, v4sVar, str, j3, et6Var, zho0Var, lwzVar, j4, pdo0Var, v4j0Var, hua0Var, qioVar);
    }

    public static hik0 a(hik0 hik0Var, long j, int i) {
        long c = (i & 1) != 0 ? hik0Var.a.c() : j;
        long j2 = hik0Var.b;
        b6s b6sVar = hik0Var.c;
        u5s u5sVar = hik0Var.d;
        v5s v5sVar = hik0Var.e;
        v4s v4sVar = (i & 32) != 0 ? hik0Var.f : null;
        String str = hik0Var.g;
        long j3 = hik0Var.h;
        et6 et6Var = hik0Var.i;
        zho0 zho0Var = hik0Var.j;
        lwz lwzVar = hik0Var.k;
        long j4 = hik0Var.l;
        pdo0 pdo0Var = hik0Var.m;
        v4j0 v4j0Var = hik0Var.n;
        hua0 hua0Var = hik0Var.o;
        qio qioVar = hik0Var.p;
        vho0 vho0Var = hik0Var.a;
        if (!l5g.d(c, vho0Var.c())) {
            vho0Var = c != 16 ? new j8g(c) : vho0.a.a;
        }
        return new hik0(vho0Var, j2, b6sVar, u5sVar, v5sVar, v4sVar, str, j3, et6Var, zho0Var, lwzVar, j4, pdo0Var, v4j0Var, hua0Var, qioVar);
    }

    public final boolean b(hik0 hik0Var) {
        if (this == hik0Var) {
            return true;
        }
        return fno0.b(this.b, hik0Var.b) && epx.f(this.c, hik0Var.c) && epx.f(this.d, hik0Var.d) && epx.f(this.e, hik0Var.e) && epx.f(this.f, hik0Var.f) && epx.f(this.g, hik0Var.g) && fno0.b(this.h, hik0Var.h) && epx.f(this.i, hik0Var.i) && epx.f(this.j, hik0Var.j) && epx.f(this.k, hik0Var.k) && l5g.d(this.l, hik0Var.l) && epx.f(this.o, hik0Var.o);
    }

    public final boolean c(hik0 hik0Var) {
        return epx.f(this.a, hik0Var.a) && epx.f(this.m, hik0Var.m) && epx.f(this.n, hik0Var.n) && epx.f(this.p, hik0Var.p);
    }

    public final hik0 d(hik0 hik0Var) {
        if (hik0Var == null) {
            return this;
        }
        vho0 vho0Var = hik0Var.a;
        return iik0.a(this, vho0Var.c(), vho0Var.e(), vho0Var.a(), hik0Var.b, hik0Var.c, hik0Var.d, hik0Var.e, hik0Var.f, hik0Var.g, hik0Var.h, hik0Var.i, hik0Var.j, hik0Var.k, hik0Var.l, hik0Var.m, hik0Var.n, hik0Var.o, hik0Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hik0)) {
            return false;
        }
        hik0 hik0Var = (hik0) obj;
        return b(hik0Var) && c(hik0Var);
    }

    public final int hashCode() {
        vho0 vho0Var = this.a;
        long c = vho0Var.c();
        int i = l5g.l;
        int hashCode = Long.hashCode(c) * 31;
        yk8 e = vho0Var.e();
        int hashCode2 = (Float.hashCode(vho0Var.a()) + ((hashCode + (e != null ? e.hashCode() : 0)) * 31)) * 31;
        gno0[] gno0VarArr = fno0.b;
        int a = bh10.a(hashCode2, 31, this.b);
        b6s b6sVar = this.c;
        int i2 = (a + (b6sVar != null ? b6sVar.b : 0)) * 31;
        u5s u5sVar = this.d;
        int hashCode3 = (i2 + (u5sVar != null ? Integer.hashCode(u5sVar.a) : 0)) * 31;
        v5s v5sVar = this.e;
        int hashCode4 = (hashCode3 + (v5sVar != null ? Integer.hashCode(v5sVar.a) : 0)) * 31;
        v4s v4sVar = this.f;
        int hashCode5 = (hashCode4 + (v4sVar != null ? v4sVar.hashCode() : 0)) * 31;
        String str = this.g;
        int a2 = bh10.a((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        et6 et6Var = this.i;
        int hashCode6 = (a2 + (et6Var != null ? Float.hashCode(et6Var.a) : 0)) * 31;
        zho0 zho0Var = this.j;
        int hashCode7 = (hashCode6 + (zho0Var != null ? zho0Var.hashCode() : 0)) * 31;
        lwz lwzVar = this.k;
        int a3 = bh10.a((hashCode7 + (lwzVar != null ? lwzVar.b.hashCode() : 0)) * 31, 31, this.l);
        pdo0 pdo0Var = this.m;
        int i3 = (a3 + (pdo0Var != null ? pdo0Var.a : 0)) * 31;
        v4j0 v4j0Var = this.n;
        int hashCode8 = (i3 + (v4j0Var != null ? v4j0Var.hashCode() : 0)) * 31;
        hua0 hua0Var = this.o;
        int hashCode9 = (hashCode8 + (hua0Var != null ? hua0Var.hashCode() : 0)) * 31;
        qio qioVar = this.p;
        return hashCode9 + (qioVar != null ? qioVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        vho0 vho0Var = this.a;
        sb.append((Object) l5g.j(vho0Var.c()));
        sb.append(", brush=");
        sb.append(vho0Var.e());
        sb.append(", alpha=");
        sb.append(vho0Var.a());
        sb.append(", fontSize=");
        sb.append((Object) fno0.f(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) fno0.f(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        dn.h(this.l, ", textDecoration=", sb);
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public hik0(vho0 vho0Var, long j, b6s b6sVar, u5s u5sVar, v5s v5sVar, v4s v4sVar, String str, long j2, et6 et6Var, zho0 zho0Var, lwz lwzVar, long j3, pdo0 pdo0Var, v4j0 v4j0Var, hua0 hua0Var, qio qioVar) {
        this.a = vho0Var;
        this.b = j;
        this.c = b6sVar;
        this.d = u5sVar;
        this.e = v5sVar;
        this.f = v4sVar;
        this.g = str;
        this.h = j2;
        this.i = et6Var;
        this.j = zho0Var;
        this.k = lwzVar;
        this.l = j3;
        this.m = pdo0Var;
        this.n = v4j0Var;
        this.o = hua0Var;
        this.p = qioVar;
    }

    public hik0(long j, long j2, b6s b6sVar, u5s u5sVar, v5s v5sVar, v4s v4sVar, String str, long j3, et6 et6Var, zho0 zho0Var, lwz lwzVar, long j4, pdo0 pdo0Var, v4j0 v4j0Var, int i) {
        this((i & 1) != 0 ? l5g.k : j, (i & 2) != 0 ? fno0.c : j2, (i & 4) != 0 ? null : b6sVar, (i & 8) != 0 ? null : u5sVar, (i & 16) != 0 ? null : v5sVar, (i & 32) != 0 ? null : v4sVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? fno0.c : j3, (i & 256) != 0 ? null : et6Var, (i & 512) != 0 ? null : zho0Var, (i & 1024) != 0 ? null : lwzVar, (i & 2048) != 0 ? l5g.k : j4, (i & 4096) != 0 ? null : pdo0Var, (i & 8192) != 0 ? null : v4j0Var, (hua0) null, (qio) null);
    }
}
