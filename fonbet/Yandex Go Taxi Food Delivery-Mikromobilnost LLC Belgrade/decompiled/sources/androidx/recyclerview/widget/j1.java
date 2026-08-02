package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.dai0;
import defpackage.ny61;
import defpackage.rnz;
import defpackage.ycs0;

/* loaded from: classes.dex */
public final class j1 {
    public final ycs0 a = new ycs0();
    public final rnz b = new rnz();

    public final void a(x0 x0Var, RecyclerView.c.a aVar) {
        ycs0 ycs0Var = this.a;
        h1 h1Var = (h1) ycs0Var.get(x0Var);
        if (h1Var == null) {
            h1Var = h1.a();
            ycs0Var.put(x0Var, h1Var);
        }
        h1Var.c = aVar;
        h1Var.a |= 8;
    }

    public final RecyclerView.c.a b(x0 x0Var, int i) {
        h1 h1Var;
        RecyclerView.c.a aVar;
        ycs0 ycs0Var = this.a;
        int d = ycs0Var.d(x0Var);
        if (d >= 0 && (h1Var = (h1) ycs0Var.j(d)) != null) {
            int i2 = h1Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                h1Var.a = i3;
                if (i == 4) {
                    aVar = h1Var.b;
                } else if (i == 8) {
                    aVar = h1Var.c;
                } else {
                    ny61.g("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ycs0Var.h(d);
                    h1Var.a = 0;
                    h1Var.b = null;
                    h1Var.c = null;
                    h1.d.a0(h1Var);
                }
                return aVar;
            }
        }
        return null;
    }

    public final void c(x0 x0Var) {
        h1 h1Var = (h1) this.a.get(x0Var);
        if (h1Var == null) {
            return;
        }
        h1Var.a &= -2;
    }

    public final void d(x0 x0Var) {
        rnz rnzVar = this.b;
        int j = rnzVar.j() - 1;
        while (true) {
            if (j < 0) {
                break;
            }
            if (x0Var == rnzVar.l(j)) {
                Object[] objArr = rnzVar.c;
                Object obj = objArr[j];
                Object obj2 = dai0.b;
                if (obj != obj2) {
                    objArr[j] = obj2;
                    rnzVar.a = true;
                }
            } else {
                j--;
            }
        }
        h1 h1Var = (h1) this.a.remove(x0Var);
        if (h1Var != null) {
            h1Var.a = 0;
            h1Var.b = null;
            h1Var.c = null;
            h1.d.a0(h1Var);
        }
    }
}
