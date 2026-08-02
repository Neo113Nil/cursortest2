package xsna;

import com.vk.geo.api.data.IconDrawConfig;
import com.vk.geo.impl.model.VisibleStyle;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: HorizontalIconSizeCalculator.kt */
/* loaded from: classes2.dex */
public final class cev extends crv {
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final long o;
    public final int p;
    public final int q;
    public final b r;
    public final c s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final bpn0 y;

    /* compiled from: HorizontalIconSizeCalculator.kt */
    public abstract class a {
        public final long a = y8x.a(cn70.b(200), cn70.b(46));

        public a() {
        }

        public abstract long a(CharSequence charSequence);

        public abstract long b(CharSequence charSequence);

        public abstract long c(CharSequence charSequence);

        public abstract long d(CharSequence charSequence);

        public abstract long e(CharSequence charSequence);

        public abstract long f(CharSequence charSequence);

        public abstract long g(CharSequence charSequence);

        public abstract long h(CharSequence charSequence);

        public final int i(int i, CharSequence charSequence) {
            if (charSequence == null || drm0.N(charSequence)) {
                return 0;
            }
            int a = an10.a(i * 1.3d * charSequence.length());
            int i2 = cev.this.p;
            return a > i2 ? i2 : a;
        }
    }

    /* compiled from: HorizontalIconSizeCalculator.kt */
    public static final class b extends a {
        public b() {
            super();
        }

        @Override // xsna.cev.a
        public final long a(CharSequence charSequence) {
            int d = (int) (d(charSequence) >> 32);
            return gqr.a(Math.abs(d - ((int) (cev.this.c >> 32))) == 0 ? 0.5f : ((int) (r1.c >> 32)) / d, 0.5f);
        }

        @Override // xsna.cev.a
        public final long b(CharSequence charSequence) {
            return a(charSequence);
        }

        @Override // xsna.cev.a
        public final long c(CharSequence charSequence) {
            return y8x.a((int) (d(charSequence) >> 32), cev.this.q);
        }

        @Override // xsna.cev.a
        public final long d(CharSequence charSequence) {
            int i;
            cev cevVar = cev.this;
            long j = cevVar.c;
            int i2 = (int) (j >> 32);
            int i3 = cevVar.i;
            int i4 = i(i3, charSequence);
            if (i4 > 0) {
                i2 = cevVar.f + ((int) (j >> 32)) + cevVar.e + i4 + cevVar.g;
            }
            if (charSequence != null && !drm0.N(charSequence)) {
                if (an10.a(i3 * 1.3d * charSequence.length()) > cev.this.p) {
                    i = cevVar.q;
                    return y8x.a(i2, i);
                }
            }
            i = (int) (j & 4294967295L);
            return y8x.a(i2, i);
        }

        @Override // xsna.cev.a
        public final long e(CharSequence charSequence) {
            long h = h(charSequence);
            cev cevVar = cev.this;
            return gqr.a(((cevVar.l * 0.5f) + cevVar.f) / ((int) (h >> 32)), 0.5f);
        }

        @Override // xsna.cev.a
        public final long f(CharSequence charSequence) {
            return e(charSequence);
        }

        @Override // xsna.cev.a
        public final long g(CharSequence charSequence) {
            return h(charSequence);
        }

        @Override // xsna.cev.a
        public final long h(CharSequence charSequence) {
            cev cevVar = cev.this;
            int i = i(cevVar.j, charSequence) + cevVar.f + cevVar.l + cevVar.e + cevVar.g;
            long j = cevVar.k;
            return i >= ((int) (j >> 32)) ? j : y8x.a(i, (int) (j & 4294967295L));
        }
    }

    /* compiled from: HorizontalIconSizeCalculator.kt */
    public static final class c extends a {
        public c() {
            super();
        }

        @Override // xsna.cev.a
        public final long a(CharSequence charSequence) {
            int d = (int) (d(charSequence) >> 32);
            return gqr.a(Math.abs(d - ((int) (cev.this.c >> 32))) == 0 ? 0.5f : ((int) (r1.c >> 32)) / d, 0.5f);
        }

        @Override // xsna.cev.a
        public final long b(CharSequence charSequence) {
            return a(charSequence);
        }

        @Override // xsna.cev.a
        public final long c(CharSequence charSequence) {
            return d(charSequence);
        }

        @Override // xsna.cev.a
        public final long d(CharSequence charSequence) {
            cev cevVar = cev.this;
            int i = cevVar.f + ((int) (cevVar.c >> 32)) + cevVar.m + cevVar.g;
            int i2 = i(cevVar.i, charSequence);
            if (i2 > 0) {
                i += cevVar.e + i2;
            }
            return y8x.a(i, cn70.b(40));
        }

        @Override // xsna.cev.a
        public final long e(CharSequence charSequence) {
            long h = h(charSequence);
            cev cevVar = cev.this;
            return gqr.a(((cevVar.l * 0.5f) + cevVar.f) / ((int) (h >> 32)), 0.5f);
        }

        @Override // xsna.cev.a
        public final long f(CharSequence charSequence) {
            return e(charSequence);
        }

        @Override // xsna.cev.a
        public final long g(CharSequence charSequence) {
            return h(charSequence);
        }

        @Override // xsna.cev.a
        public final long h(CharSequence charSequence) {
            cev cevVar = cev.this;
            int i = i(cevVar.j, charSequence) + cevVar.f + cevVar.l + cevVar.e + cevVar.g;
            long j = cevVar.k;
            return i >= ((int) (j >> 32)) ? j : y8x.a(i, (int) (j & 4294967295L));
        }
    }

    public cev() {
        this(IconDrawConfig.x);
    }

    @Override // xsna.crv
    public final long a(int i, CharSequence charSequence) {
        a aVar = (VisibleStyle.C(i) || VisibleStyle.o(i)) ? this.s : this.r;
        return VisibleStyle.D(i) ? VisibleStyle.b(i) ? this.u : VisibleStyle.d(i) ? aVar.e(charSequence) : aVar.f(charSequence) : (!VisibleStyle.p(i) && (VisibleStyle.l(i) || VisibleStyle.C(i))) ? VisibleStyle.b(i) ? this.t : VisibleStyle.d(i) ? aVar.a(charSequence) : aVar.b(charSequence) : this.x;
    }

    @Override // xsna.crv
    public final long b(int i, CharSequence charSequence) {
        a aVar = (VisibleStyle.C(i) || VisibleStyle.o(i)) ? this.s : this.r;
        return VisibleStyle.D(i) ? VisibleStyle.b(i) ? aVar.a : VisibleStyle.d(i) ? aVar.h(charSequence) : aVar.g(charSequence) : VisibleStyle.p(i) ? this.w : VisibleStyle.l(i) ? VisibleStyle.b(i) ? this.c : VisibleStyle.d(i) ? aVar.d(charSequence) : aVar.c(charSequence) : VisibleStyle.C(i) ? VisibleStyle.b(i) ? this.n : VisibleStyle.d(i) ? aVar.d(charSequence) : aVar.c(charSequence) : this.v;
    }

    @Override // xsna.crv
    public final long c() {
        return this.w;
    }

    @Override // xsna.crv
    public final y8x d() {
        return new y8x(this.o);
    }

    @Override // xsna.crv
    public final long e() {
        return ((y8x) this.y.getValue()).a;
    }

    public cev(IconDrawConfig iconDrawConfig) {
        super(iconDrawConfig);
        this.c = y8x.a(an10.b(cn70.a() * 20.0f), an10.b(cn70.a() * 20.0f));
        this.d = cn70.b(12);
        cn70.b(23);
        this.e = cn70.b(4);
        this.f = cn70.b(4);
        this.g = cn70.b(8);
        this.h = cn70.b(4);
        cn70.b(4);
        cn70.b(4);
        int i = iconDrawConfig.e;
        this.i = cn70.f(i);
        this.j = cn70.f(i + 2);
        this.k = y8x.a(cn70.b(178), cn70.b(44));
        this.l = cn70.b(20);
        int b2 = cn70.b(32);
        this.m = b2;
        this.n = y8x.a(b2, b2);
        this.o = y8x.a(b2 - cn70.b(2), b2 - cn70.b(2));
        this.p = cn70.b(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        this.q = cn70.b(34);
        this.r = new b();
        this.s = new c();
        long a2 = gqr.a(0.5f, 0.5f);
        this.t = a2;
        this.u = a2;
        this.v = y8x.a(0, 0);
        this.w = y8x.a(cn70.b(12), cn70.b(12));
        this.x = a2;
        cn70.b(12);
        this.y = new bpn0(new dnh(this, 29));
    }
}
