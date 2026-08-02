package com.yandex.go.flex.main_screen.data.widgets.orders;

import android.view.View;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.czo0;
import defpackage.fb80;
import defpackage.hbp0;
import defpackage.i601;
import defpackage.qd80;
import defpackage.rd80;
import defpackage.rn70;
import defpackage.sn70;
import defpackage.t2w0;
import defpackage.vn70;
import defpackage.w511;
import defpackage.wn70;

/* loaded from: classes.dex */
public final class e implements qd80 {
    public final y a;
    public final com.yandex.go.mainscreen.superapp.orders.presentation.color.c b;
    public final hbp0 c = new hbp0(new czo0(14), "OrdersWidgetWrapperImpl", null);
    public final View w;
    public final fb80 x;

    public e(t2w0 t2w0Var, y yVar, com.yandex.go.mainscreen.superapp.orders.presentation.color.c cVar) {
        this.a = yVar;
        this.b = cVar;
        SuperAppMainScreenOrdersView create = t2w0Var.create();
        this.w = create;
        this.x = create;
    }

    @Override // defpackage.qd80
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.qd80
    public final void p(i601 i601Var) {
        wn70 rn70Var;
        fb80 fb80Var = this.x;
        if (fb80Var != null) {
            String str = i601Var.a;
            int i = rd80.a[i601Var.c.ordinal()];
            y yVar = this.a;
            if (i == 1) {
                rn70Var = new rn70(yVar.z(), yVar.p(), yVar.N(), yVar.H());
            } else if (i == 2) {
                rn70Var = new sn70(yVar.z(), yVar.p(), yVar.N(), yVar.H());
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                rn70Var = new vn70(true, true);
            }
            fb80Var.bind(str, rn70Var);
        }
        hbp0 hbp0Var = this.c;
        hbp0Var.f();
        hbp0.e(hbp0Var, null, null, new OrdersWidgetWrapperImpl$bind$1(this, i601Var, null), 3);
    }

    @Override // defpackage.qd80
    public final View w() {
        return this.w;
    }
}
