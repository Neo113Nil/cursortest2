package defpackage;

import com.yandex.go.taxi.order.delegates.a;

/* loaded from: classes14.dex */
public final class q0y0 {
    public final h3y a;
    public final hq70 b;

    public q0y0(h3y h3yVar, hq70 hq70Var) {
        this.a = h3yVar;
        this.b = hq70Var;
    }

    public final void a(o0y0 o0y0Var) {
        o2y0 o2y0Var = o0y0Var.b;
        l0y0 l0y0Var = o0y0Var.a;
        boolean z = l0y0Var instanceof e0y0;
        hq70 hq70Var = this.b;
        if (z || (l0y0Var instanceof i0y0)) {
            hq70Var.getClass();
            hq70Var.a(new dq70(o2y0Var));
            return;
        }
        if (l0y0Var instanceof d0y0) {
            hq70Var.getClass();
            hq70Var.a(new aq70(o2y0Var, (d0y0) l0y0Var));
        } else if (l0y0Var instanceof xzx0) {
            ((a) ((pg7) this.a.get())).c(o2y0Var.b(), null);
        } else if (l0y0Var instanceof wzx0) {
            hq70Var.getClass();
            hq70Var.a(new zp70(o2y0Var));
        }
    }
}
