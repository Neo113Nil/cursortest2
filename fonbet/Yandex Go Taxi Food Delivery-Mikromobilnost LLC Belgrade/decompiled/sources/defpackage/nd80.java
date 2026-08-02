package defpackage;

import com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetSection;
import com.yandex.go.flex.main_screen.experiments.j;
import java.util.List;
import just.adapter.sticky.StickyGravity;

/* loaded from: classes.dex */
public final class nd80 extends f0q0 {
    public final pxl g;
    public final OrdersWidgetSection h;
    public final qc20 i;
    public final j j;

    public nd80(pxl pxlVar, OrdersWidgetSection ordersWidgetSection, tse tseVar, qc20 qc20Var, lhw0 lhw0Var, j jVar) {
        this.g = pxlVar;
        this.h = ordersWidgetSection;
        this.i = qc20Var;
        this.j = jVar;
    }

    @Override // defpackage.f0q0
    public final void b() {
        aeu0 aeu0Var;
        final qc20 qc20Var = this.i;
        qc20Var.getClass();
        OrdersWidgetSection ordersWidgetSection = this.h;
        l4t0 l4t0Var = (l4t0) qc20.s(ordersWidgetSection.d, qoi0.a(l4t0.class));
        String str = ordersWidgetSection.a;
        md80 md80Var = new md80(ordersWidgetSection.b);
        List list = ordersWidgetSection.d;
        final w4t0 w4t0Var = (w4t0) qc20.s(list, qoi0.a(w4t0.class));
        final t4t0 t4t0Var = (t4t0) qc20.s(list, qoi0.a(t4t0.class));
        if (w4t0Var == null && t4t0Var == null) {
            aeu0Var = null;
        } else {
            boolean z = w4t0Var != null;
            boolean z2 = t4t0Var != null;
            final int i = 0;
            final e0q0 e0q0Var = this.e;
            final pxl pxlVar = this.g;
            tls tlsVar = new tls() { // from class: db80
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    pxl pxlVar2 = pxlVar;
                    t4t0 t4t0Var2 = t4t0Var;
                    w4t0 w4t0Var2 = w4t0Var;
                    qc20 qc20Var2 = qc20Var;
                    wu wuVar = e0q0Var;
                    StickyGravity stickyGravity = (StickyGravity) obj;
                    switch (i2) {
                        case 0:
                            qc20Var2.getClass();
                            rzo.p(wuVar, qc20.q(w4t0Var2, t4t0Var2, stickyGravity, true), pxlVar2);
                            break;
                        default:
                            qc20Var2.getClass();
                            rzo.p(wuVar, qc20.q(w4t0Var2, t4t0Var2, stickyGravity, false), pxlVar2);
                            break;
                    }
                    return zy11Var;
                }
            };
            final int i2 = 1;
            aeu0Var = new aeu0(z, z2, tlsVar, new tls() { // from class: db80
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    pxl pxlVar2 = pxlVar;
                    t4t0 t4t0Var2 = t4t0Var;
                    w4t0 w4t0Var2 = w4t0Var;
                    qc20 qc20Var2 = qc20Var;
                    wu wuVar = e0q0Var;
                    StickyGravity stickyGravity = (StickyGravity) obj;
                    switch (i22) {
                        case 0:
                            qc20Var2.getClass();
                            rzo.p(wuVar, qc20.q(w4t0Var2, t4t0Var2, stickyGravity, true), pxlVar2);
                            break;
                        default:
                            qc20Var2.getClass();
                            rzo.p(wuVar, qc20.q(w4t0Var2, t4t0Var2, stickyGravity, false), pxlVar2);
                            break;
                    }
                    return zy11Var;
                }
            }, new lvl(w4t0Var, t4t0Var, 3), new qz10(14), new x8t0(19));
        }
        id80 id80Var = new id80(str, md80Var, aeu0Var, l4t0Var != null, l4t0Var != null ? l4t0Var.c : null, l4t0Var != null ? l4t0Var.b : null, l4t0Var != null ? l4t0Var.a : null, ((h601) qc20Var.a).a(ordersWidgetSection.e));
        this.j.getClass();
        this.f.C(id80Var);
    }

    @Override // defpackage.f0q0
    public final void c() {
    }
}
