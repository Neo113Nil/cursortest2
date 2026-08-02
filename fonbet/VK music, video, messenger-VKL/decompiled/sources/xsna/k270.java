package xsna;

import com.vk.geo.api.data.IconDrawConfig;
import com.vk.geo.impl.model.VisibleStyle;

/* compiled from: NoCategoriesIconSizeCalculator.kt */
/* loaded from: classes2.dex */
public final class k270 extends crv {
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final int t;
    public final bpn0 u;

    public k270() {
        this(IconDrawConfig.x);
    }

    @Override // xsna.crv
    public final long a(int i, CharSequence charSequence) {
        if (VisibleStyle.D(i)) {
            return VisibleStyle.b(i) ? this.p : VisibleStyle.d(i) ? this.l : this.n;
        }
        boolean p = VisibleStyle.p(i);
        long j = this.r;
        return p ? j : (VisibleStyle.l(i) || VisibleStyle.C(i)) ? VisibleStyle.b(i) ? this.o : VisibleStyle.d(i) ? this.h : this.j : j;
    }

    @Override // xsna.crv
    public final long b(int i, CharSequence charSequence) {
        return VisibleStyle.D(i) ? VisibleStyle.b(i) ? this.f : VisibleStyle.d(i) ? this.k : this.m : VisibleStyle.p(i) ? this.s : (VisibleStyle.l(i) || VisibleStyle.C(i)) ? VisibleStyle.b(i) ? this.e : VisibleStyle.d(i) ? this.g : this.i : this.q;
    }

    @Override // xsna.crv
    public final long c() {
        return this.s;
    }

    @Override // xsna.crv
    public final long e() {
        return ((y8x) this.u.getValue()).a;
    }

    public k270(IconDrawConfig iconDrawConfig) {
        super(iconDrawConfig);
        cn70.b(14);
        cn70.b(12);
        float f = iconDrawConfig.s;
        this.c = f;
        float f2 = iconDrawConfig.t;
        this.d = f2;
        long a = y8x.a(an10.b(cn70.a() * f), an10.b(cn70.a() * f2));
        this.e = a;
        int i = (int) (a >> 32);
        int i2 = (int) (a & 4294967295L);
        float f3 = i2;
        long a2 = y8x.a(an10.b(i * 1.95f), an10.b(1.95f * f3));
        this.f = a2;
        int i3 = iconDrawConfig.u;
        int max = Math.max(i, cn70.b(i3));
        float f4 = iconDrawConfig.i;
        float a3 = cn70.a() * f4;
        int i4 = iconDrawConfig.c;
        int i5 = iconDrawConfig.e;
        long a4 = y8x.a(max, an10.b(a3 + (cn70.f(i5) * i4) + this.a) + i2);
        this.g = a4;
        int i6 = (int) (a4 & 4294967295L);
        this.h = gqr.a(0.5f, f3 / i6);
        int i7 = iconDrawConfig.d;
        int i8 = iconDrawConfig.j;
        this.i = y8x.a((int) (a4 >> 32), i6 + an10.b(dq.a(iconDrawConfig.n, cn70.f(i8) * i7) + this.b));
        this.j = gqr.a(0.5f, f3 / ((int) (r2 & 4294967295L)));
        int i9 = (int) (a2 & 4294967295L);
        long a5 = y8x.a(Math.max((int) (a2 >> 32), cn70.b(i3)), an10.b((cn70.a() * f4) + (cn70.f(i5) * i4) + this.a) + i9);
        this.k = a5;
        float f5 = i9;
        int i10 = (int) (a5 & 4294967295L);
        this.l = gqr.a(0.5f, f5 / i10);
        this.m = y8x.a((int) (a5 >> 32), i10 + an10.b((cn70.f(i8) * i7) + this.b));
        this.n = gqr.a(0.5f, f5 / ((int) (r3 & 4294967295L)));
        long a6 = gqr.a(0.5f, 0.5f);
        long a7 = gqr.a(0.5f, 1.0f);
        this.o = a7;
        this.p = a7;
        this.q = y8x.a(0, 0);
        this.r = a6;
        int i11 = iconDrawConfig.v;
        this.s = y8x.a(cn70.b(i11), cn70.b(i11));
        this.t = cn70.b(12);
        this.u = new bpn0(new yu60(this, 2));
    }
}
