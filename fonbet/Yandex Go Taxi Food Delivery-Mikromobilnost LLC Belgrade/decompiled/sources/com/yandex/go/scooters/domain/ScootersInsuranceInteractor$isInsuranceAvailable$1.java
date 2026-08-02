package com.yandex.go.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.domain.ScootersInsuranceInteractor", f = "ScootersInsuranceInteractor.kt", l = {27}, m = "isInsuranceAvailable", v = 2)
/* loaded from: classes13.dex */
final class ScootersInsuranceInteractor$isInsuranceAvailable$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersInsuranceInteractor$isInsuranceAvailable$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
