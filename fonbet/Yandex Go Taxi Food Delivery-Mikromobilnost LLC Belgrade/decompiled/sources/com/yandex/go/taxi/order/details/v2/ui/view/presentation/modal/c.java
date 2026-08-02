package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal;

import defpackage.cms;
import defpackage.ibk0;
import defpackage.jl40;
import defpackage.jms;
import defpackage.p9y0;
import defpackage.tje;
import defpackage.ukk0;
import defpackage.wrs0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class c implements p9y0, jms {
    public final /* synthetic */ ukk0 a;

    public c(ukk0 ukk0Var) {
        this.a = ukk0Var;
    }

    @Override // defpackage.p9y0
    public final void a(ibk0 ibk0Var, wrs0 wrs0Var) {
        ukk0 ukk0Var = this.a;
        tje.N(ukk0Var.Jg(), null, null, new RideCardModalViewPresenter$handleAction$1(ukk0Var, ibk0Var, wrs0Var, null), 3);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p9y0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, ukk0.class, "handleAction", "handleAction(Lcom/yandex/go/slot/api/action/SlotItemAction;Lcom/yandex/go/slot/api/ui/SlotItemUiState$Analytics;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
