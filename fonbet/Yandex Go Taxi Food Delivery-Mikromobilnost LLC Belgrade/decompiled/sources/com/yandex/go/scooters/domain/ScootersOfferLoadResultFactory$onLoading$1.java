package com.yandex.go.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.domain.ScootersOfferLoadResultFactory", f = "ScootersOfferLoadResultFactory.kt", l = {32}, m = "onLoading", v = 2)
/* loaded from: classes13.dex */
final class ScootersOfferLoadResultFactory$onLoading$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOfferLoadResultFactory$onLoading$1(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
