package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class lhl0 implements z910, ghl0 {
    public final h43 a;
    public final to5 b;

    public lhl0(h43 h43Var, to5 to5Var) {
        this.a = h43Var;
        this.b = to5Var;
    }

    @Override // defpackage.ghl0
    public final void a(int i, int[] iArr, int[] iArr2, k kVar) {
        this.a.u(kVar, i, iArr, kVar.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        return jva1.b(this, n8e.k(j), n8e.j(j), n8e.i(j), n8e.h(j), kVar.f0(this.a.b()), kVar, list, new o[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.ghl0
    public final long c(int i, int i2, int i3, boolean z) {
        return !z ? p8e.a(i, i2, 0, i3) : qje.m(i, i2, 0, i3);
    }

    @Override // defpackage.ghl0
    public final int d(o oVar) {
        return oVar.b;
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            x910 x910Var = (x910) list.get(i4);
            float c = cva1.c(cva1.b(x910Var));
            int k0 = x910Var.k0(i);
            if (c == 0.0f) {
                i3 += k0;
            } else if (c > 0.0f) {
                f += c;
                i2 = Math.max(i2, Math.round(k0 / c));
            }
        }
        return ((list.size() - 1) * f0) + Math.round(i2 * f) + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhl0)) {
            return false;
        }
        lhl0 lhl0Var = (lhl0) obj;
        return this.a.equals(lhl0Var.a) && jl40.l(this.b, lhl0Var.b);
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            x910 x910Var = (x910) list.get(i4);
            float c = cva1.c(cva1.b(x910Var));
            int e0 = x910Var.e0(i);
            if (c == 0.0f) {
                i3 += e0;
            } else if (c > 0.0f) {
                f += c;
                i2 = Math.max(i2, Math.round(e0 / c));
            }
        }
        return ((list.size() - 1) * f0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * f0, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            x910 x910Var = (x910) list.get(i3);
            float c = cva1.c(cva1.b(x910Var));
            if (c == 0.0f) {
                int min2 = Math.min(x910Var.k0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, x910Var.y(min2));
            } else if (c > 0.0f) {
                f += c;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            x910 x910Var2 = (x910) list.get(i4);
            float c2 = cva1.c(cva1.b(x910Var2));
            if (c2 > 0.0f) {
                i2 = Math.max(i2, x910Var2.y(round != Integer.MAX_VALUE ? Math.round(round * c2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.ghl0
    public final int h(o oVar) {
        return oVar.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        int f0 = yuwVar.f0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * f0, i);
        List list2 = list;
        int size = list2.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            x910 x910Var = (x910) list.get(i3);
            float c = cva1.c(cva1.b(x910Var));
            if (c == 0.0f) {
                int min2 = Math.min(x910Var.k0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, x910Var.V(min2));
            } else if (c > 0.0f) {
                f += c;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            x910 x910Var2 = (x910) list.get(i4);
            float c2 = cva1.c(cva1.b(x910Var2));
            if (c2 > 0.0f) {
                i2 = Math.max(i2, x910Var2.V(round != Integer.MAX_VALUE ? Math.round(round * c2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.ghl0
    public final aa10 j(o[] oVarArr, k kVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        aa10 w;
        w = kVar.w(i, i2, b.f(), new mt0(oVarArr, this, i2, iArr, 7));
        return w;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
