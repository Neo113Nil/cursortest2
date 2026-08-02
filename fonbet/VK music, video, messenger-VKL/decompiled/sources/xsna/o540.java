package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ko20;
import xsna.us2;
import xsna.v4s;

/* compiled from: MultiParagraphLayoutCache.kt */
/* loaded from: classes11.dex */
public final class o540 {
    public us2 a;
    public v4s.a b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List<us2.d<esa0>> g;
    public ko20 h;
    public azl j;
    public nmo0 k;
    public n540 l;
    public LayoutDirection m;
    public ljo0 n;
    public long q;
    public long i = j0x.a;
    public int o = -1;
    public int p = -1;

    public o540(us2 us2Var, nmo0 nmo0Var, v4s.a aVar, int i, boolean z, int i2, int i3, List list) {
        this.a = us2Var;
        this.b = aVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = nmo0Var;
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = s6j.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            ko20 a2 = ko20.a.a(this.h, layoutDirection, this.k, this.j, this.b);
            this.h = a2;
            a = a2.a(this.f, a);
        }
        int a3 = tdo0.a(b(a, layoutDirection).e);
        int j = o6j.j(a);
        if (a3 < j) {
            a3 = j;
        }
        this.o = i;
        this.p = a3;
        return a3;
    }

    public final m540 b(long j, LayoutDirection layoutDirection) {
        n540 e = e(layoutDirection);
        long a = wpy.a(e.a(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new m540(e, a, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, LayoutDirection layoutDirection) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            ko20 a = ko20.a.a(this.h, layoutDirection, this.k, this.j, this.b);
            this.h = a;
            j = a.a(this.f, j);
        }
        ljo0 ljo0Var = this.n;
        if (ljo0Var != null) {
            m540 m540Var = ljo0Var.b;
            kjo0 kjo0Var = ljo0Var.a;
            if (!m540Var.a.b()) {
                LayoutDirection layoutDirection2 = kjo0Var.h;
                long j2 = kjo0Var.j;
                if (layoutDirection == layoutDirection2 && (o6j.c(j, j2) || (o6j.i(j) == o6j.i(j2) && o6j.k(j) == o6j.k(j2) && o6j.h(j) >= m540Var.e && !m540Var.c))) {
                    if (o6j.c(j, this.n.a.j)) {
                        return false;
                    }
                    this.n = f(layoutDirection, j, this.n.b);
                    return true;
                }
            }
        }
        this.n = f(layoutDirection, j, b(j, layoutDirection));
        return true;
    }

    public final void d(azl azlVar) {
        long j;
        azl azlVar2 = this.j;
        if (azlVar != null) {
            int i = j0x.b;
            j = j0x.a(azlVar.getDensity(), azlVar.getFontScale());
        } else {
            j = j0x.a;
        }
        if (azlVar2 == null) {
            this.j = azlVar;
            this.i = j;
        } else if (azlVar == null || this.i != j) {
            this.j = azlVar;
            this.i = j;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final n540 e(LayoutDirection layoutDirection) {
        n540 n540Var = this.l;
        if (n540Var == null || layoutDirection != this.m || n540Var.b()) {
            this.m = layoutDirection;
            us2 us2Var = this.a;
            nmo0 a = tmo0.a(this.k, layoutDirection);
            azl azlVar = this.j;
            v4s.a aVar = this.b;
            List list = this.g;
            if (list == null) {
                list = EmptyList.b;
            }
            n540Var = new n540(us2Var, a, list, azlVar, aVar);
        }
        this.l = n540Var;
        return n540Var;
    }

    public final ljo0 f(LayoutDirection layoutDirection, long j, m540 m540Var) {
        float min = Math.min(m540Var.a.a(), m540Var.d);
        us2 us2Var = this.a;
        nmo0 nmo0Var = this.k;
        List list = this.g;
        if (list == null) {
            list = EmptyList.b;
        }
        return new ljo0(new kjo0(us2Var, nmo0Var, list, this.e, this.d, this.c, this.j, layoutDirection, this.b, j), m540Var, s6j.d(j, (tdo0.a(min) << 32) | (tdo0.a(m540Var.e) & 4294967295L)));
    }

    public final String toString() {
        kjo0 kjo0Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        sb.append(this.n != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) j0x.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        ljo0 ljo0Var = this.n;
        if (ljo0Var != null && (kjo0Var = ljo0Var.a) != null) {
            obj = new o6j(kjo0Var.j);
        }
        return k73.c(sb, obj, ')');
    }
}
