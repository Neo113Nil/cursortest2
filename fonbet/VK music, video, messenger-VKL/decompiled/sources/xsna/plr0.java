package xsna;

import java.util.List;

/* compiled from: ImageVector.kt */
/* loaded from: classes11.dex */
public final class plr0 extends klr0 {
    public final String b;
    public final List<qq90> c;
    public final int d;
    public final yk8 e;
    public final float f;
    public final yk8 g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;

    public plr0() {
        throw null;
    }

    public plr0(String str, List list, int i, yk8 yk8Var, float f, yk8 yk8Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.b = str;
        this.c = list;
        this.d = i;
        this.e = yk8Var;
        this.f = f;
        this.g = yk8Var2;
        this.h = f2;
        this.i = f3;
        this.j = i2;
        this.k = i3;
        this.l = f4;
        this.m = f5;
        this.n = f6;
        this.o = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && plr0.class == obj.getClass()) {
            plr0 plr0Var = (plr0) obj;
            return epx.f(this.b, plr0Var.b) && epx.f(this.e, plr0Var.e) && this.f == plr0Var.f && epx.f(this.g, plr0Var.g) && this.h == plr0Var.h && this.i == plr0Var.i && this.j == plr0Var.j && this.k == plr0Var.k && this.l == plr0Var.l && this.m == plr0Var.m && this.n == plr0Var.n && this.o == plr0Var.o && this.d == plr0Var.d && epx.f(this.c, plr0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int a = fw3.a(this.b.hashCode() * 31, 31, this.c);
        yk8 yk8Var = this.e;
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.f, (a + (yk8Var != null ? yk8Var.hashCode() : 0)) * 31, 31);
        yk8 yk8Var2 = this.g;
        return Integer.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.o, io.reactivex.rxjava3.subjects.b.a(this.n, io.reactivex.rxjava3.subjects.b.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, shy.a(this.k, shy.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, (a2 + (yk8Var2 != null ? yk8Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
