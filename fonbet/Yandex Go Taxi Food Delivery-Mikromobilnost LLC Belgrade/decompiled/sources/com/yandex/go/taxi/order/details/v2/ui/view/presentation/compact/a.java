package com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact;

import defpackage.cms;
import defpackage.eek0;
import defpackage.ibk0;
import defpackage.jl40;
import defpackage.jms;
import defpackage.p9y0;
import defpackage.tje;
import defpackage.wrs0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements p9y0, jms {
    public final /* synthetic */ eek0 a;

    public a(eek0 eek0Var) {
        this.a = eek0Var;
    }

    @Override // defpackage.p9y0
    public final void a(ibk0 ibk0Var, wrs0 wrs0Var) {
        eek0 eek0Var = this.a;
        tje.N(eek0Var.Jg(), null, null, new RideCardCompactPresenter$handleAction$1(eek0Var, ibk0Var, wrs0Var, null), 3);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p9y0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, eek0.class, "handleAction", "handleAction(Lcom/yandex/go/slot/api/action/SlotItemAction;Lcom/yandex/go/slot/api/ui/SlotItemUiState$Analytics;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
