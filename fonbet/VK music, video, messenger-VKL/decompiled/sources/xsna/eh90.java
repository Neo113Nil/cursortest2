package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.EmptyList;
import xsna.ko20;
import xsna.v4s;

/* compiled from: ParagraphLayoutCache.kt */
/* loaded from: classes11.dex */
public final class eh90 {
    public String a;
    public nmo0 b;
    public v4s.a c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public azl i;
    public ya2 j;
    public boolean k;
    public long l;
    public ko20 m;
    public ch90 n;
    public LayoutDirection o;
    public long s;
    public long h = j0x.a;
    public long p = s6j.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public eh90(String str, nmo0 nmo0Var, v4s.a aVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = nmo0Var;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = s6j.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            ko20 a2 = ko20.a.a(this.m, layoutDirection, this.b, this.i, this.c);
            this.m = a2;
            a = a2.a(this.g, a);
        }
        ch90 e = e(layoutDirection);
        long a3 = wpy.a(e.a(), this.d, a, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int a4 = tdo0.a(new ya2((bb2) e, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, a3).c());
        int j = o6j.j(a);
        if (a4 < j) {
            a4 = j;
        }
        this.q = i;
        this.r = a4;
        return a4;
    }

    public final boolean b(long j, LayoutDirection layoutDirection) {
        long j2;
        ch90 ch90Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            ko20 a = ko20.a.a(this.m, layoutDirection, this.b, this.i, this.c);
            this.m = a;
            j2 = a.a(this.g, j);
        } else {
            j2 = j;
        }
        ya2 ya2Var = this.j;
        boolean z2 = false;
        if (ya2Var != null && (ch90Var = this.n) != null && !ch90Var.b() && layoutDirection == this.o && (o6j.c(j2, this.p) || (o6j.i(j2) == o6j.i(this.p) && o6j.k(j2) == o6j.k(this.p) && o6j.h(j2) >= ya2Var.c() && !ya2Var.d.d))) {
            if (!o6j.c(j2, this.p)) {
                ya2 ya2Var2 = this.j;
                this.l = s6j.d(j2, (tdo0.a(Math.min(ya2Var2.a.i.c(), ya2Var2.g())) << 32) | (tdo0.a(ya2Var2.c()) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= ya2Var2.g() && ((int) (4294967295L & r12)) >= ya2Var2.c())) {
                    z = false;
                }
                this.k = z;
                this.p = j2;
            }
            return false;
        }
        ch90 e = e(layoutDirection);
        long a2 = wpy.a(e.a(), this.d, j2, this.e);
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        ya2 ya2Var3 = new ya2((bb2) e, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, a2);
        this.p = j2;
        this.l = s6j.d(j2, (tdo0.a(ya2Var3.c()) & 4294967295L) | (tdo0.a(ya2Var3.g()) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < ya2Var3.g() || ((int) (r1 & 4294967295L)) < ya2Var3.c())) {
            z2 = true;
        }
        this.k = z2;
        this.j = ya2Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = s6j.h(0, 0, 0, 0);
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void d(azl azlVar) {
        long j;
        azl azlVar2 = this.i;
        if (azlVar != null) {
            int i = j0x.b;
            j = j0x.a(azlVar.getDensity(), azlVar.getFontScale());
        } else {
            j = j0x.a;
        }
        if (azlVar2 == null) {
            this.i = azlVar;
            this.h = j;
        } else if (azlVar == null || this.h != j) {
            this.i = azlVar;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final ch90 e(LayoutDirection layoutDirection) {
        ch90 ch90Var = this.n;
        if (ch90Var == null || layoutDirection != this.o || ch90Var.b()) {
            this.o = layoutDirection;
            String str = this.a;
            nmo0 a = tmo0.a(this.b, layoutDirection);
            EmptyList emptyList = EmptyList.b;
            ch90Var = new bb2(str, a, emptyList, emptyList, this.c, this.i);
        }
        this.n = ch90Var;
        return ch90Var;
    }

    public final void f(String str, nmo0 nmo0Var, v4s.a aVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = nmo0Var;
        this.c = aVar;
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
        sb.append((Object) j0x.b(this.h));
        sb.append(", history=");
        return efz.b(this.s, ", constraints=$)", sb);
    }
}
