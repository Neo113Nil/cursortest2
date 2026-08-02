package xsna;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ceo0;
import xsna.jeo0;
import xsna.jio0;
import xsna.teo0;
import xsna.veo0;

/* compiled from: TextEditStore.kt */
/* loaded from: classes4.dex */
public final class weo0 extends owx<veo0, jeo0, teo0, ceo0> {
    public final xeo0 e;
    public final v7g f;

    public weo0(v7g v7gVar, xeo0 xeo0Var, gfo0 gfo0Var) {
        super(new ueo0(yeo0.b(v7gVar, xeo0Var, gfo0Var)));
        this.e = xeo0Var;
        this.f = v7gVar;
    }

    public final void a(jeo0 jeo0Var) {
        veo0 b;
        if (jeo0Var.equals(keo0.a)) {
            b(teo0.a.C3741a.a);
            return;
        }
        if (jeo0Var.equals(leo0.a)) {
            b(teo0.a.b.a);
            return;
        }
        boolean z = jeo0Var instanceof meo0;
        z9 z9Var = this.a;
        if (z) {
            z9Var.d(new teo0.a.c(((meo0) jeo0Var).a));
            return;
        }
        boolean equals = jeo0Var.equals(deo0.a);
        int i = -1;
        int i2 = 0;
        xeo0 xeo0Var = this.e;
        b8f0 b8f0Var = this.b;
        if (equals) {
            et1 et1Var = ((veo0) b8f0Var.b.getValue()).c.d;
            List<et1> list = xeo0Var.d;
            Iterator<et1> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (et1Var.a == it.next().a) {
                    i = i2;
                    break;
                }
                i2++;
            }
            et1 et1Var2 = (et1) j5g.b0((i + 1) % list.size(), list);
            if (et1Var2 != null) {
                et1Var = et1Var2;
            }
            z9Var.d(new neo0(et1Var));
            return;
        }
        boolean equals2 = jeo0Var.equals(eeo0.a);
        v7g v7gVar = this.f;
        if (equals2) {
            wlo0 wlo0Var = ((veo0) b8f0Var.b.getValue()).c;
            ew5 ew5Var = wlo0Var.c;
            List<ew5> list2 = xeo0Var.c;
            Iterator<ew5> it2 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (epx.f(ew5Var.a.a, it2.next().a.a)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            ew5 ew5Var2 = (ew5) j5g.b0((i + 1) % list2.size(), list2);
            if (ew5Var2 != null) {
                ew5Var = ew5Var2;
            }
            jio0.a aVar = wlo0Var.b.a;
            lw5 lw5Var = ew5Var.a;
            boolean a = v7gVar.a(lw5Var);
            y5g y5gVar = wlo0Var.e;
            y8g y8gVar = y5gVar.a;
            z9Var.d(new teo0.c(new oeo0(ew5Var), new peo0(y5g.a(y5gVar, null, v7gVar.b(y8gVar, aVar, lw5Var), v7gVar.c(y8gVar, aVar, lw5Var), false, a, 25))));
            return;
        }
        if (jeo0Var instanceof feo0) {
            feo0 feo0Var = (feo0) jeo0Var;
            wlo0 wlo0Var2 = ((veo0) b8f0Var.b.getValue()).c;
            ew5 ew5Var3 = wlo0Var2.c;
            jio0.a aVar2 = wlo0Var2.b.a;
            boolean a2 = v7gVar.a(ew5Var3.a);
            y5g y5gVar2 = wlo0Var2.e;
            y8g y8gVar2 = feo0Var.a;
            lw5 lw5Var2 = ew5Var3.a;
            z9Var.d(new peo0(y5g.a(y5gVar2, y8gVar2, v7gVar.b(y8gVar2, aVar2, lw5Var2), v7gVar.c(y8gVar2, aVar2, lw5Var2), feo0Var.b, a2, 8)));
            return;
        }
        if (jeo0Var instanceof geo0) {
            z9Var.d(new qeo0(((geo0) jeo0Var).a));
            return;
        }
        if (jeo0Var instanceof heo0) {
            z9Var.d(new seo0(((heo0) jeo0Var).a));
            return;
        }
        if (jeo0Var instanceof ieo0) {
            z9Var.d(new reo0(((ieo0) jeo0Var).a));
            return;
        }
        boolean equals3 = jeo0Var.equals(jeo0.b.a);
        caj0 caj0Var = this.c;
        if (equals3) {
            caj0Var.e(new ceo0.b(((veo0) b8f0Var.b.getValue()).a));
            return;
        }
        if (jeo0Var.equals(jeo0.c.a)) {
            caj0Var.e(new ceo0.c(((veo0) b8f0Var.b.getValue()).b));
            return;
        }
        if (!(jeo0Var instanceof jeo0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        jeo0.a aVar3 = (jeo0.a) jeo0Var;
        gfo0 gfo0Var = aVar3.a;
        if (aVar3.b) {
            veo0 veo0Var = (veo0) b8f0Var.b.getValue();
            wlo0 a3 = wlo0.a(veo0Var.c, "", null, null, null, null, 30);
            b = veo0.a(veo0Var, gfo0Var, yeo0.a(gfo0Var, a3), a3, veo0.a.c.a, veo0.a.b.a, 32);
        } else {
            b = yeo0.b(v7gVar, xeo0Var, gfo0Var);
        }
        caj0Var.e(new ceo0.a(b));
        z9Var.d(new teo0.b(b));
    }

    public final void b(teo0.a aVar) {
        Bitmap bitmap;
        veo0.a aVar2 = ((veo0) this.b.b.getValue()).e;
        if ((aVar2 instanceof veo0.a.d) && (bitmap = ((veo0.a.d) aVar2).a) != null) {
            bitmap.recycle();
        }
        this.a.d(aVar);
    }
}
