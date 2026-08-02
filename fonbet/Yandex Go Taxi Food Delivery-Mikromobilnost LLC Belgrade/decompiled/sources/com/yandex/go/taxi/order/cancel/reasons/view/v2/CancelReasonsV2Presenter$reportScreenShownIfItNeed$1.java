package com.yandex.go.taxi.order.cancel.reasons.view.v2;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2Presenter", f = "CancelReasonsV2Presenter.kt", l = {72}, m = "reportScreenShownIfItNeed", v = 2)
/* loaded from: classes14.dex */
final class CancelReasonsV2Presenter$reportScreenShownIfItNeed$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelReasonsV2Presenter$reportScreenShownIfItNeed$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.Kg(this.this$0, null, this);
    }
}
