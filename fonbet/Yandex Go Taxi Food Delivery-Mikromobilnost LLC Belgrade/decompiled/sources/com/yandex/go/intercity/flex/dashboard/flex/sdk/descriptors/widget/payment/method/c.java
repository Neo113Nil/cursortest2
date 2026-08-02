package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method;

import android.view.ViewGroup;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.payments.domain.m0;
import defpackage.c231;
import defpackage.dpw;
import defpackage.l30;
import defpackage.ltg0;
import defpackage.oep0;
import defpackage.op70;
import defpackage.pdc;
import defpackage.s8a0;
import defpackage.tje;
import defpackage.u131;
import defpackage.u290;
import defpackage.wys;
import defpackage.z0a0;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class c extends wys {
    public final ListItemComponent R;
    public final m0 S;
    public final z0a0 T;
    public final dpw U;
    public final pdc V;
    public final com.yandex.div.core.expression.variables.a W;
    public final oep0 Z;
    public final CompositePaymentIconsView a0;

    public c(ListItemComponent listItemComponent, m0 m0Var, z0a0 z0a0Var, dpw dpwVar, pdc pdcVar, com.yandex.div.core.expression.variables.a aVar, oep0 oep0Var) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = m0Var;
        this.T = z0a0Var;
        this.U = dpwVar;
        this.V = pdcVar;
        this.W = aVar;
        this.Z = oep0Var;
        CompositePaymentIconsView compositePaymentIconsView = new CompositePaymentIconsView(listItemComponent.getContext(), null, 0, 6, null);
        this.a0 = compositePaymentIconsView;
        int r = tje.r(ltg0.intercity_flex_native_payment_widget_icon_size, listItemComponent.getContext());
        compositePaymentIconsView.setLayoutParams(new ViewGroup.LayoutParams(r, r));
        listItemComponent.setLeadView(compositePaymentIconsView);
        listItemComponent.setTrailMode(2);
        listItemComponent.setDebounceClickListener(new op70(20, this));
        listItemComponent.setClipToOutline(true);
    }

    @Override // defpackage.wys
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void c(s8a0 s8a0Var) {
        Z(new PaymentMethodWidgetViewHolder$registerViewContentUpdatesTask$1(s8a0Var, this, null), s8a0Var.a, false);
        com.yandex.div.core.expression.variables.a aVar = this.W;
        if (!aVar.h("is_reloading_payment_method")) {
            aVar.f(new u131("is_reloading_payment_method", false));
        }
        u290 u290Var = new u290(18, this);
        c231 g = aVar.g("is_reloading_payment_method");
        if (g != null) {
            g.a(u290Var);
        }
        a0(new l30(12, g, u290Var));
    }
}
