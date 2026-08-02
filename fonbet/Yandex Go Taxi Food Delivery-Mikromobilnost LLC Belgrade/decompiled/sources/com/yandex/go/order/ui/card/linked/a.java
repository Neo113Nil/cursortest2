package com.yandex.go.order.ui.card.linked;

import defpackage.avj0;
import defpackage.k7x0;
import defpackage.kyh0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.u501;
import defpackage.w201;
import defpackage.y2y0;
import defpackage.zuj0;

/* loaded from: classes14.dex */
public final class a implements u501 {
    public final k7x0 a;
    public final String b;

    public a(zuj0 zuj0Var, k7x0 k7x0Var) {
        this.a = k7x0Var;
        this.b = ((avj0) zuj0Var).h(kyh0.open_copy_menu);
    }

    @Override // defpackage.u501
    public final tpr a(w201 w201Var) {
        return new rol0(new TaxiTrackingLinkedTrackingCardUiStateInteractor$uiStateFlow$1((y2y0) w201Var, this, null));
    }
}
