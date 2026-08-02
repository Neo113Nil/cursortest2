package yads;

import java.util.Collections;
import java.util.List;
import xsna.c9o;
import xsna.d9o;

/* loaded from: classes10.dex */
public final class hf0 extends gf0 {
    public final boolean f;
    public final af0 g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final int s;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hf0(int i, l83 l83Var, int i2, af0 af0Var, int i3, int i4, boolean z) {
        super(i, i2, l83Var);
        boolean z2;
        boolean z3;
        int i5;
        nx0 nx0Var;
        int i6;
        int i7;
        float f;
        int i8;
        nx0 nx0Var2;
        int i9;
        int i10;
        int i11;
        this.g = af0Var;
        int i12 = af0Var.E ? 24 : 16;
        this.o = af0Var.D && (i4 & i12) != 0;
        if (z && (((i9 = (nx0Var2 = this.e).r) == -1 || i9 <= af0Var.b) && ((i10 = nx0Var2.s) == -1 || i10 <= af0Var.c))) {
            float f2 = nx0Var2.t;
            if ((f2 == -1.0f || f2 <= af0Var.d) && ((i11 = nx0Var2.i) == -1 || i11 <= af0Var.e)) {
                z2 = true;
                this.f = z2;
                if (z && (((i6 = (nx0Var = this.e).r) == -1 || i6 >= af0Var.f) && ((i7 = nx0Var.s) == -1 || i7 >= af0Var.g))) {
                    f = nx0Var.t;
                    if ((f != -1.0f || f >= af0Var.h) && ((i8 = nx0Var.i) == -1 || i8 >= af0Var.i)) {
                        z3 = true;
                        this.h = z3;
                        this.i = if0.a(false, i3);
                        nx0 nx0Var3 = this.e;
                        this.j = nx0Var3.i;
                        this.k = nx0Var3.a();
                        this.m = if0.a(this.e.f, af0Var.n);
                        int i13 = this.e.f;
                        this.n = (i13 == 0 && (i13 & 1) == 0) ? false : true;
                        i5 = 0;
                        while (true) {
                            if (i5 < af0Var.m.size()) {
                                i5 = Integer.MAX_VALUE;
                                break;
                            }
                            String str = this.e.m;
                            if (str != null && str.equals(af0Var.m.get(i5))) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        this.l = i5;
                        this.q = ro.a(i3) != 128;
                        this.r = ro.b(i3) == 64;
                        this.s = if0.a(this.e.m);
                        this.p = a(i3, i12);
                    }
                }
                z3 = false;
                this.h = z3;
                this.i = if0.a(false, i3);
                nx0 nx0Var32 = this.e;
                this.j = nx0Var32.i;
                this.k = nx0Var32.a();
                this.m = if0.a(this.e.f, af0Var.n);
                int i132 = this.e.f;
                this.n = (i132 == 0 && (i132 & 1) == 0) ? false : true;
                i5 = 0;
                while (true) {
                    if (i5 < af0Var.m.size()) {
                    }
                    i5++;
                }
                this.l = i5;
                this.q = ro.a(i3) != 128;
                this.r = ro.b(i3) == 64;
                this.s = if0.a(this.e.m);
                this.p = a(i3, i12);
            }
        }
        z2 = false;
        this.f = z2;
        if (z) {
            f = nx0Var.t;
            if (f != -1.0f) {
            }
            z3 = true;
            this.h = z3;
            this.i = if0.a(false, i3);
            nx0 nx0Var322 = this.e;
            this.j = nx0Var322.i;
            this.k = nx0Var322.a();
            this.m = if0.a(this.e.f, af0Var.n);
            int i1322 = this.e.f;
            this.n = (i1322 == 0 && (i1322 & 1) == 0) ? false : true;
            i5 = 0;
            while (true) {
                if (i5 < af0Var.m.size()) {
                }
                i5++;
            }
            this.l = i5;
            this.q = ro.a(i3) != 128;
            this.r = ro.b(i3) == 64;
            this.s = if0.a(this.e.m);
            this.p = a(i3, i12);
        }
        z3 = false;
        this.h = z3;
        this.i = if0.a(false, i3);
        nx0 nx0Var3222 = this.e;
        this.j = nx0Var3222.i;
        this.k = nx0Var3222.a();
        this.m = if0.a(this.e.f, af0Var.n);
        int i13222 = this.e.f;
        this.n = (i13222 == 0 && (i13222 & 1) == 0) ? false : true;
        i5 = 0;
        while (true) {
            if (i5 < af0Var.m.size()) {
            }
            i5++;
        }
        this.l = i5;
        this.q = ro.a(i3) != 128;
        this.r = ro.b(i3) == 64;
        this.s = if0.a(this.e.m);
        this.p = a(i3, i12);
    }

    public static int a(hf0 hf0Var, hf0 hf0Var2) {
        hy a = fy.a(lq.a(hf0Var.i, hf0Var2.i)).a(hf0Var.m, hf0Var2.m).a(hf0Var.n, hf0Var2.n).a(hf0Var.f, hf0Var2.f).a(hf0Var.h, hf0Var2.h);
        Integer valueOf = Integer.valueOf(hf0Var.l);
        Integer valueOf2 = Integer.valueOf(hf0Var2.l);
        a92.b.getClass();
        hy a2 = a.a(valueOf, valueOf2, kr2.b).a(hf0Var.q, hf0Var2.q).a(hf0Var.r, hf0Var2.r);
        if (hf0Var.q && hf0Var.r) {
            a2 = a2.a(hf0Var.s, hf0Var2.s);
        }
        return a2.a();
    }

    public static int b(hf0 hf0Var, hf0 hf0Var2) {
        tb2 a = (hf0Var.f && hf0Var.i) ? if0.i : if0.i.a();
        return fy.a((hf0Var.g.x ? if0.i.a() : if0.j).compare(Integer.valueOf(hf0Var.j), Integer.valueOf(hf0Var2.j))).a(Integer.valueOf(hf0Var.k), Integer.valueOf(hf0Var2.k), a).a(Integer.valueOf(hf0Var.j), Integer.valueOf(hf0Var2.j), a).a();
    }

    public static int a(List list, List list2) {
        return fy.a(a((hf0) Collections.max(list, new c9o(1)), (hf0) Collections.max(list2, new c9o(1)))).a(list.size(), list2.size()).a((hf0) Collections.max(list, new d9o(1)), (hf0) Collections.max(list2, new d9o(1)), new d9o(1)).a();
    }

    public final int a(int i, int i2) {
        if ((this.e.f & 16384) != 0 || !if0.a(this.g.M, i)) {
            return 0;
        }
        if (!this.f && !this.g.C) {
            return 0;
        }
        if (!if0.a(false, i) || !this.h || !this.f || this.e.i == -1) {
            return 1;
        }
        af0 af0Var = this.g;
        return (af0Var.y || af0Var.x || (i & i2) == 0) ? 1 : 2;
    }

    @Override // yads.gf0
    public final int a() {
        return this.p;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        hf0 hf0Var = (hf0) gf0Var;
        if (!this.o && !mc3.a(this.e.m, hf0Var.e.m)) {
            return false;
        }
        if (this.g.F) {
            return true;
        }
        return this.q == hf0Var.q && this.r == hf0Var.r;
    }
}
