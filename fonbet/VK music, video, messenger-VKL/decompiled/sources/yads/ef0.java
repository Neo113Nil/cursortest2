package yads;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ef0 extends gf0 implements Comparable {
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;

    public ef0(int i, l83 l83Var, int i2, af0 af0Var, int i3, String str) {
        super(i, i2, l83Var);
        int i4;
        int i5 = 0;
        this.g = if0.a(false, i3);
        int i6 = this.e.e & (~af0Var.v);
        this.h = (i6 & 1) != 0;
        this.i = (i6 & 2) != 0;
        s51 a = af0Var.t.isEmpty() ? s51.a("") : af0Var.t;
        int i7 = 0;
        while (true) {
            if (i7 >= a.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            } else {
                i4 = if0.a(this.e, (String) a.get(i7), af0Var.w);
                if (i4 > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.j = i7;
        this.k = i4;
        int a2 = if0.a(this.e.f, af0Var.u);
        this.l = a2;
        this.n = (this.e.f & 1088) != 0;
        int a3 = if0.a(this.e, str, if0.b(str) == null);
        this.m = a3;
        boolean z = i4 > 0 || (af0Var.t.isEmpty() && a2 > 0) || this.h || (this.i && a3 > 0);
        if (if0.a(af0Var.M, i3) && z) {
            i5 = 1;
        }
        this.f = i5;
    }

    public static int a(List list, List list2) {
        return ((ef0) list.get(0)).compareTo((ef0) list2.get(0));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ef0 ef0Var) {
        hy a = fy.a(lq.a(this.g, ef0Var.g));
        Integer valueOf = Integer.valueOf(this.j);
        Integer valueOf2 = Integer.valueOf(ef0Var.j);
        Comparator comparator = a92.b;
        comparator.getClass();
        kr2 kr2Var = kr2.b;
        hy a2 = a.a(valueOf, valueOf2, kr2Var).a(this.k, ef0Var.k).a(this.l, ef0Var.l).a(this.h, ef0Var.h);
        Boolean valueOf3 = Boolean.valueOf(this.i);
        Boolean valueOf4 = Boolean.valueOf(ef0Var.i);
        if (this.k != 0) {
            comparator = kr2Var;
        }
        hy a3 = a2.a(valueOf3, valueOf4, comparator).a(this.m, ef0Var.m);
        if (this.l == 0) {
            a3 = a3.b(this.n, ef0Var.n);
        }
        return a3.a();
    }

    @Override // yads.gf0
    public final int a() {
        return this.f;
    }

    @Override // yads.gf0
    public final /* bridge */ /* synthetic */ boolean a(gf0 gf0Var) {
        return false;
    }
}
