package com.yandex.go.taxi.order.cancel.reasons.interactor;

import defpackage.hx7;
import defpackage.mdh;
import defpackage.o2y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a {
    public final hx7 a;
    public final tt2 b;
    public final o2y0 c;

    public a(hx7 hx7Var, tt2 tt2Var, o2y0 o2y0Var) {
        this.a = hx7Var;
        this.b = tt2Var;
        this.c = o2y0Var;
    }

    public final Object a(ArrayList arrayList, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new CancelReasonsAnalyticsInteractor$getScreenShownData$2(arrayList, this, null), continuation);
    }
}
