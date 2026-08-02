package com.yandex.go.taxi.order.chat.experiments;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.chat.experiments.TaxiOrderWebMessengerExperimentInteractorImpl", f = "TaxiOrderWebMessengerEnabledExperimentProvider.kt", l = {12}, m = "isAvailableSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
