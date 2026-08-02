package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class lic {
    public final oz40 a;
    public final oz40 b;
    public final oz40 c;
    public final oz40 d;
    public final oz40 e;
    public final oz40 f;
    public final oz40 g;
    public final oz40 h;
    public final oz40 i;
    public final oz40 j;
    public final oz40 k;
    public final oz40 l;
    public final oz40 m;

    public lic(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        ldc ldcVar = new ldc(j);
        ngd0 ngd0Var = ngd0.F;
        this.a = f.i(ldcVar, ngd0Var);
        this.b = f.i(new ldc(j2), ngd0Var);
        this.c = f.i(new ldc(j3), ngd0Var);
        this.d = f.i(new ldc(j4), ngd0Var);
        this.e = f.i(new ldc(j5), ngd0Var);
        this.f = f.i(new ldc(j6), ngd0Var);
        this.g = f.i(new ldc(j7), ngd0Var);
        this.h = f.i(new ldc(j8), ngd0Var);
        this.i = f.i(new ldc(j9), ngd0Var);
        this.j = f.i(new ldc(j10), ngd0Var);
        this.k = f.i(new ldc(j11), ngd0Var);
        this.l = f.i(new ldc(j12), ngd0Var);
        this.m = f.i(Boolean.TRUE, ngd0Var);
    }

    public final long a() {
        return ((ldc) this.g.getValue()).a;
    }

    public final long b() {
        return ((ldc) this.k.getValue()).a;
    }

    public final long c() {
        return ((ldc) this.a.getValue()).a;
    }

    public final long d() {
        return ((ldc) this.f.getValue()).a;
    }

    public final boolean e() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) ldc.i(c()));
        sb.append(", primaryVariant=");
        xvz.w(((ldc) this.b.getValue()).a, ", secondary=", sb);
        xvz.w(((ldc) this.c.getValue()).a, ", secondaryVariant=", sb);
        xvz.w(((ldc) this.d.getValue()).a, ", background=", sb);
        sb.append((Object) ldc.i(((ldc) this.e.getValue()).a));
        sb.append(", surface=");
        sb.append((Object) ldc.i(d()));
        sb.append(", error=");
        sb.append((Object) ldc.i(a()));
        sb.append(", onPrimary=");
        xvz.w(((ldc) this.h.getValue()).a, ", onSecondary=", sb);
        xvz.w(((ldc) this.i.getValue()).a, ", onBackground=", sb);
        sb.append((Object) ldc.i(((ldc) this.j.getValue()).a));
        sb.append(", onSurface=");
        sb.append((Object) ldc.i(b()));
        sb.append(", onError=");
        sb.append((Object) ldc.i(((ldc) this.l.getValue()).a));
        sb.append(", isLight=");
        sb.append(e());
        sb.append(')');
        return sb.toString();
    }
}
