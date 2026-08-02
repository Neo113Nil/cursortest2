package com.yandex.go.taxi.order.cancel.popup.model;

import com.yandex.go.taxi.order.models.api.cancel.DetailedCancelNotification;
import defpackage.ief;
import defpackage.k7x0;
import defpackage.pdc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xdf;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final xdf b;
    public final pdc c;
    public final k7x0 d;

    public a(tt2 tt2Var, xdf xdfVar, pdc pdcVar, k7x0 k7x0Var) {
        this.a = tt2Var;
        this.b = xdfVar;
        this.c = pdcVar;
        this.d = k7x0Var;
    }

    public final Object a(DetailedCancelNotification detailedCancelNotification, ief iefVar, Continuation continuation) {
        this.a.getClass();
        return tje.k0(uyj.a, new DetailedCancelPopupModelMapper$map$2(this, detailedCancelNotification, iefVar, null), continuation);
    }
}
