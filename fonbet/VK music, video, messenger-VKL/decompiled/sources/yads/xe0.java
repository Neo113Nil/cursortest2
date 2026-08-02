package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class xe0 extends gf0 implements Comparable {
    public final int f;
    public final boolean g;
    public final String h;
    public final af0 i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;

    public xe0(int i, l83 l83Var, int i2, af0 af0Var, int i3, boolean z, ph2 ph2Var) {
        super(i, i2, l83Var);
        int i4;
        int i5;
        int i6;
        this.i = af0Var;
        this.h = if0.b(this.e.d);
        this.j = if0.a(false, i3);
        int i7 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i7 >= af0Var.o.size()) {
                i5 = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                i5 = if0.a(this.e, (String) af0Var.o.get(i7), false);
                if (i5 > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.l = i7;
        this.k = i5;
        this.m = if0.a(this.e.f, af0Var.p);
        nx0 nx0Var = this.e;
        int i8 = nx0Var.f;
        this.n = i8 == 0 || (i8 & 1) != 0;
        this.q = (nx0Var.e & 1) != 0;
        int i9 = nx0Var.z;
        this.r = i9;
        this.s = nx0Var.A;
        int i10 = nx0Var.i;
        this.t = i10;
        this.g = (i10 == -1 || i10 <= af0Var.r) && (i9 == -1 || i9 <= af0Var.q) && ph2Var.apply(nx0Var);
        String[] d = mc3.d();
        int i11 = 0;
        while (true) {
            if (i11 >= d.length) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = if0.a(this.e, d[i11], false);
                if (i6 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.o = i11;
        this.p = i6;
        int i12 = 0;
        while (true) {
            if (i12 < af0Var.s.size()) {
                String str = this.e.m;
                if (str != null && str.equals(af0Var.s.get(i12))) {
                    i4 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.u = i4;
        this.v = ro.a(i3) == 128;
        this.w = ro.b(i3) == 64;
        this.f = a(z, i3);
    }

    public static int a(List list, List list2) {
        return ((xe0) Collections.max(list)).compareTo((xe0) Collections.max(list2));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xe0 xe0Var) {
        tb2 a = (this.g && this.j) ? if0.i : if0.i.a();
        hy a2 = fy.a(lq.a(this.j, xe0Var.j));
        Integer valueOf = Integer.valueOf(this.l);
        Integer valueOf2 = Integer.valueOf(xe0Var.l);
        a92.b.getClass();
        kr2 kr2Var = kr2.b;
        hy a3 = a2.a(valueOf, valueOf2, kr2Var).a(this.k, xe0Var.k).a(this.m, xe0Var.m).a(this.q, xe0Var.q).a(this.n, xe0Var.n).a(Integer.valueOf(this.o), Integer.valueOf(xe0Var.o), kr2Var).a(this.p, xe0Var.p).a(this.g, xe0Var.g).a(Integer.valueOf(this.u), Integer.valueOf(xe0Var.u), kr2Var).a(Integer.valueOf(this.t), Integer.valueOf(xe0Var.t), this.i.x ? if0.i.a() : if0.j).a(this.v, xe0Var.v).a(this.w, xe0Var.w).a(Integer.valueOf(this.r), Integer.valueOf(xe0Var.r), a).a(Integer.valueOf(this.s), Integer.valueOf(xe0Var.s), a);
        Integer valueOf3 = Integer.valueOf(this.t);
        Integer valueOf4 = Integer.valueOf(xe0Var.t);
        if (!mc3.a(this.h, xe0Var.h)) {
            a = if0.j;
        }
        return a3.a(valueOf3, valueOf4, a).a();
    }

    public final int a(boolean z, int i) {
        if (!if0.a(this.i.M, i)) {
            return 0;
        }
        if (!this.g && !this.i.G) {
            return 0;
        }
        if (!if0.a(false, i) || !this.g || this.e.i == -1) {
            return 1;
        }
        af0 af0Var = this.i;
        if (af0Var.y || af0Var.x) {
            return 1;
        }
        return (af0Var.O || !z) ? 2 : 1;
    }

    @Override // yads.gf0
    public final int a() {
        return this.f;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        int i;
        String str;
        int i2;
        xe0 xe0Var = (xe0) gf0Var;
        af0 af0Var = this.i;
        if (!af0Var.J && ((i2 = this.e.z) == -1 || i2 != xe0Var.e.z)) {
            return false;
        }
        if (!af0Var.H && ((str = this.e.m) == null || !TextUtils.equals(str, xe0Var.e.m))) {
            return false;
        }
        af0 af0Var2 = this.i;
        if (!af0Var2.I && ((i = this.e.A) == -1 || i != xe0Var.e.A)) {
            return false;
        }
        if (af0Var2.K) {
            return true;
        }
        return this.v == xe0Var.v && this.w == xe0Var.w;
    }
}
