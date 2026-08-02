package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import defpackage.akk0;
import defpackage.bts0;
import defpackage.jpa1;
import defpackage.p9y0;
import defpackage.qpk0;
import defpackage.u8k0;
import defpackage.vxj0;
import defpackage.xss0;
import defpackage.z8k0;

/* loaded from: classes14.dex */
public final class b extends qpk0 {
    public static final /* synthetic */ int V = 0;
    public final AccordionComponent R;
    public final p9y0 S;
    public final bts0 T;
    public final com.yandex.go.taxi.order.details.v2.analytics.g U;

    public b(AccordionComponent accordionComponent, p9y0 p9y0Var, bts0 bts0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(accordionComponent);
        this.R = accordionComponent;
        this.S = p9y0Var;
        this.T = bts0Var;
        this.U = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        u8k0 u8k0Var = (u8k0) obj;
        akk0 akk0Var = u8k0Var.e;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 0));
        b0(new RideCardAccordionViewHolder$processAnalytics$2(this, akk0Var, null));
        xss0 xss0Var = u8k0Var.c;
        AccordionComponent accordionComponent = this.R;
        accordionComponent.renderHeader(xss0Var);
        accordionComponent.setOnDetachListener(new vxj0(3, this, u8k0Var));
        accordionComponent.setContainerContent(jpa1.e(accordionComponent.getContext(), this.T, u8k0Var.d));
    }
}
