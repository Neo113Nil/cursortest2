package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class fc90 {
    public String a;
    public ety0 b;
    public dyr c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public fwi i;
    public gb2 j;
    public boolean k;
    public gh20 m;
    public ec90 n;
    public LayoutDirection o;
    public long s;
    public long h = mxv.a;
    public long l = 0;
    public long p = p8e.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public fc90(String str, ety0 ety0Var, dyr dyrVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = ety0Var;
        this.c = dyrVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = p8e.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            gh20 c = tlb1.c(this.m, layoutDirection, this.b, this.i, this.c);
            this.m = c;
            a = c.a(this.g, a);
        }
        ec90 e = e(layoutDirection);
        long d = zcb1.d(a, this.e, this.d, e.d());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int a2 = jlb1.a(new gb2((ib2) e, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, d).b());
        int j = n8e.j(a);
        if (a2 < j) {
            a2 = j;
        }
        this.q = i;
        this.r = a2;
        return a2;
    }

    public final boolean b(long j, LayoutDirection layoutDirection) {
        long j2;
        ec90 ec90Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            gh20 c = tlb1.c(this.m, layoutDirection, this.b, this.i, this.c);
            this.m = c;
            j2 = c.a(this.g, j);
        } else {
            j2 = j;
        }
        gb2 gb2Var = this.j;
        boolean z2 = false;
        if (gb2Var != null && (ec90Var = this.n) != null && !ec90Var.a() && layoutDirection == this.o && (n8e.c(j2, this.p) || (n8e.i(j2) == n8e.i(this.p) && n8e.k(j2) == n8e.k(this.p) && n8e.h(j2) >= gb2Var.b() && !gb2Var.d.d))) {
            if (!n8e.c(j2, this.p)) {
                gb2 gb2Var2 = this.j;
                this.l = p8e.d(j2, (jlb1.a(Math.min(gb2Var2.a.B.c(), gb2Var2.d())) << 32) | (jlb1.a(gb2Var2.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                if (this.d == 3 || (((int) (r12 >> 32)) >= gb2Var2.d() && ((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & r12)) >= gb2Var2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = j2;
            }
            return false;
        }
        ec90 e = e(layoutDirection);
        long d = zcb1.d(j2, this.e, this.d, e.d());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        gb2 gb2Var3 = new gb2((ib2) e, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, d);
        this.p = j2;
        this.l = p8e.d(j2, (jlb1.a(gb2Var3.b()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (jlb1.a(gb2Var3.d()) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < gb2Var3.d() || ((int) (r1 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < gb2Var3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = gb2Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = p8e.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(fwi fwiVar) {
        long j;
        fwi fwiVar2 = this.i;
        if (fwiVar != null) {
            int i = mxv.b;
            j = mxv.a(fwiVar.getDensity(), fwiVar.u0());
        } else {
            j = mxv.a;
        }
        if (fwiVar2 == null) {
            this.i = fwiVar;
            this.h = j;
        } else if (fwiVar == null || this.h != j) {
            this.i = fwiVar;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final ec90 e(LayoutDirection layoutDirection) {
        ec90 ec90Var = this.n;
        if (ec90Var == null || layoutDirection != this.o || ec90Var.a()) {
            this.o = layoutDirection;
            String str = this.a;
            ety0 I = bb1.I(this.b, layoutDirection);
            fwi fwiVar = this.i;
            dyr dyrVar = this.c;
            EmptyList emptyList = EmptyList.a;
            ec90Var = new ib2(str, I, emptyList, emptyList, dyrVar, fwiVar);
        }
        this.n = ec90Var;
        return ec90Var;
    }

    public final void f(String str, ety0 ety0Var, dyr dyrVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = ety0Var;
        this.c = dyrVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.s = (this.s << 2) | 2;
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) mxv.b(this.h));
        sb.append(", history=");
        return oyr.n(this.s, ", constraints=$)", sb);
    }
}
