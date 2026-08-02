package com.yandex.go.payments_widgets.section.payments;

import defpackage.ala0;
import defpackage.iea0;
import defpackage.qv10;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        float floatValue = ((Number) obj).floatValue();
        d dVar = this.a;
        qv10.B(((double) floatValue) < 0.1d, ((iea0) dVar.o).a, null);
        PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState = floatValue >= 1.0f ? PaymentWidgetsAnalyticsInteractor$VisibilityState.VISIBLE : floatValue <= 0.0f ? PaymentWidgetsAnalyticsInteractor$VisibilityState.HIDED : PaymentWidgetsAnalyticsInteractor$VisibilityState.UNDER_SCROLL;
        ala0 ala0Var = dVar.s;
        tje.N(ala0Var.a, null, null, new PaymentWidgetsAnalyticsInteractor$onVisibilityChanged$1(ala0Var, paymentWidgetsAnalyticsInteractor$VisibilityState, null), 3);
        return zy11.a;
    }
}
