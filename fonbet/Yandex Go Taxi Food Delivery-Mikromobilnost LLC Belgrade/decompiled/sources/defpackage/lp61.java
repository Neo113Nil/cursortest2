package defpackage;

import java.util.Comparator;
import yads.io2;
import yads.n62;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class lp61 extends t371 implements Comparable {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final int x;
    public final boolean y;
    public final boolean z;

    public lp61(int i, tu71 tu71Var, int i2, zu81 zu81Var, int i3, String str) {
        super(i, tu71Var, i2);
        int i4;
        int i5 = 0;
        this.y = ba71.g(i3, false);
        int i6 = this.w.w;
        int i7 = zu81Var.N;
        wk2 wk2Var = zu81Var.L;
        int i8 = i6 & (~i7);
        this.z = (i8 & 1) != 0;
        this.A = (i8 & 2) != 0;
        wk2 n = wk2Var.isEmpty() ? t31.n("") : wk2Var;
        int i9 = 0;
        while (true) {
            if (i9 >= n.w) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = ba71.c(this.w, (String) n.get(i9), zu81Var.O);
                if (i4 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.B = i9;
        this.C = i4;
        int i10 = this.w.x;
        int i11 = zu81Var.M;
        int bitCount = (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
        this.D = bitCount;
        this.F = (this.w.x & 1088) != 0;
        int c = ba71.c(this.w, str, ba71.e(str) == null);
        this.E = c;
        boolean z = i4 > 0 || (wk2Var.isEmpty() && bitCount > 0) || this.z || (this.A && c > 0);
        if (ba71.g(i3, zu81Var.f0) && z) {
            i5 = 1;
        }
        this.x = i5;
    }

    @Override // defpackage.t371
    public final int a() {
        return this.x;
    }

    @Override // defpackage.t371
    public final /* bridge */ /* synthetic */ boolean b(t371 t371Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(lp61 lp61Var) {
        wd81 g = u681.g(ena1.a(this.y, lp61Var.y));
        Integer valueOf = Integer.valueOf(this.B);
        Integer valueOf2 = Integer.valueOf(lp61Var.B);
        Comparator comparator = n62.a;
        comparator.getClass();
        io2 io2Var = io2.a;
        wd81 d = g.d(valueOf, valueOf2, io2Var);
        int i = lp61Var.C;
        int i2 = this.C;
        wd81 b = d.b(i2, i);
        int i3 = lp61Var.D;
        int i4 = this.D;
        wd81 e = b.b(i4, i3).e(this.z, lp61Var.z);
        Boolean valueOf3 = Boolean.valueOf(this.A);
        Boolean valueOf4 = Boolean.valueOf(lp61Var.A);
        if (i2 != 0) {
            comparator = io2Var;
        }
        wd81 b2 = e.d(valueOf3, valueOf4, comparator).b(this.E, lp61Var.E);
        if (i4 == 0) {
            b2 = b2.f(this.F, lp61Var.F);
        }
        return b2.a();
    }
}
