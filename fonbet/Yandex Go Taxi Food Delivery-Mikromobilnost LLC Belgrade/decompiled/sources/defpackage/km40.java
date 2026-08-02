package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class km40 {
    public kk2 a;
    public dyr b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public xt3 h;
    public gh20 i;
    public fwi k;
    public ety0 l;
    public xv10 m;
    public LayoutDirection n;
    public dry0 o;
    public jm40 r;
    public long s;
    public long j = mxv.a;
    public int p = -1;
    public int q = -1;

    public km40(kk2 kk2Var, ety0 ety0Var, dyr dyrVar, int i, boolean z, int i2, int i3, List list, xt3 xt3Var) {
        this.a = kk2Var;
        this.b = dyrVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = xt3Var;
        this.l = ety0Var;
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = p8e.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            a = h(a, layoutDirection);
        }
        int a2 = jlb1.a(b(a, layoutDirection).e);
        int j = n8e.j(a);
        if (a2 < j) {
            a2 = j;
        }
        this.p = i;
        this.q = a2;
        return a2;
    }

    public final hm40 b(long j, LayoutDirection layoutDirection) {
        xv10 e = e(layoutDirection);
        long d = zcb1.d(j, this.d, this.c, e.d());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new hm40(e, d, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, LayoutDirection layoutDirection) {
        this.s = (this.s << 2) | 3;
        long h = this.f > 1 ? h(j, layoutDirection) : j;
        dry0 dry0Var = this.o;
        if (dry0Var != null) {
            hm40 hm40Var = dry0Var.b;
            cry0 cry0Var = dry0Var.a;
            if (!hm40Var.a.a()) {
                LayoutDirection layoutDirection2 = cry0Var.h;
                long j2 = cry0Var.j;
                if (layoutDirection == layoutDirection2 && (n8e.c(h, j2) || (n8e.i(h) == n8e.i(j2) && n8e.k(h) == n8e.k(j2) && n8e.h(h) >= hm40Var.e && !hm40Var.c))) {
                    if (n8e.c(h, this.o.a.j)) {
                        return false;
                    }
                    this.o = g(layoutDirection, h, this.o.b);
                    return true;
                }
            }
        }
        xt3 xt3Var = this.h;
        if (xt3Var != null) {
            this.n = layoutDirection;
            long j3 = this.l.a.b;
            if (this.r == null) {
                this.r = new jm40(this);
            }
            jm40 jm40Var = this.r;
            float i0 = jm40Var.i0(xt3Var.c);
            float i02 = jm40Var.i0(xt3Var.a);
            float i03 = jm40Var.i0(xt3Var.b);
            float f = 2.0f;
            float f2 = (i02 + i03) / 2.0f;
            float f3 = i03;
            float f4 = i02;
            while (f3 - f4 >= i0) {
                float f5 = f;
                float f6 = f3;
                if (xt3.a(jm40Var.a(j, jm40Var.n(f2)))) {
                    f3 = f2;
                } else {
                    f4 = f2;
                    f3 = f6;
                }
                f2 = (f4 + f3) / f5;
                f = f5;
            }
            float floor = (((float) Math.floor((f4 - i02) / i0)) * i0) + i02;
            float f7 = i0 + floor;
            if (f7 <= i03 && !xt3.a(jm40Var.a(j, jm40Var.n(f7)))) {
                floor = f7;
            }
            long n = jm40Var.n(floor);
            if (sty0.d(n)) {
                n = lm40.a(j3, n);
            }
            long j4 = n;
            if (this.r == null) {
                this.r = new jm40(this);
            }
            dry0 dry0Var2 = this.r.a;
            if (dry0Var2 != null) {
                cry0 cry0Var2 = dry0Var2.a;
                if (sty0.a(j4, cry0Var2.b.a.b) && cry0Var2.f == this.c) {
                    this.o = dry0Var2;
                    return true;
                }
            }
            f(ety0.a(this.l, 0L, j4, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213));
        }
        this.o = g(layoutDirection, h, b(h, layoutDirection));
        return true;
    }

    public final void d(fwi fwiVar) {
        long j;
        fwi fwiVar2 = this.k;
        if (fwiVar != null) {
            int i = mxv.b;
            j = mxv.a(fwiVar.getDensity(), fwiVar.u0());
        } else {
            j = mxv.a;
        }
        if (fwiVar2 == null) {
            this.k = fwiVar;
            this.j = j;
            return;
        }
        if (fwiVar == null || this.j != j) {
            this.k = fwiVar;
            this.j = j;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.p = -1;
            this.r = null;
        }
    }

    public final xv10 e(LayoutDirection layoutDirection) {
        xv10 xv10Var = this.m;
        if (xv10Var == null || layoutDirection != this.n || xv10Var.a()) {
            this.n = layoutDirection;
            kk2 kk2Var = this.a;
            ety0 I = bb1.I(this.l, layoutDirection);
            fwi fwiVar = this.k;
            dyr dyrVar = this.b;
            List list = this.g;
            if (list == null) {
                list = EmptyList.a;
            }
            xv10Var = new xv10(kk2Var, I, list, fwiVar, dyrVar);
        }
        this.m = xv10Var;
        return xv10Var;
    }

    public final void f(ety0 ety0Var) {
        boolean c = ety0Var.c(this.l);
        this.l = ety0Var;
        if (c) {
            return;
        }
        this.s <<= 2;
        this.m = null;
        this.o = null;
        this.q = -1;
        this.p = -1;
    }

    public final dry0 g(LayoutDirection layoutDirection, long j, hm40 hm40Var) {
        float min = Math.min(hm40Var.a.d(), hm40Var.d);
        kk2 kk2Var = this.a;
        ety0 ety0Var = this.l;
        List list = this.g;
        if (list == null) {
            list = EmptyList.a;
        }
        return new dry0(new cry0(kk2Var, ety0Var, list, this.e, this.d, this.c, this.k, layoutDirection, this.b, j), hm40Var, p8e.d(j, (jlb1.a(min) << 32) | (jlb1.a(hm40Var.e) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }

    public final long h(long j, LayoutDirection layoutDirection) {
        gh20 c = tlb1.c(this.i, layoutDirection, this.l, this.k, this.b);
        this.i = c;
        return c.a(this.f, j);
    }

    public final String toString() {
        cry0 cry0Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        sb.append(this.o != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) mxv.b(this.j));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=");
        dry0 dry0Var = this.o;
        if (dry0Var != null && (cry0Var = dry0Var.a) != null) {
            obj = new n8e(cry0Var.j);
        }
        return qv10.r(sb, obj, ')');
    }
}
