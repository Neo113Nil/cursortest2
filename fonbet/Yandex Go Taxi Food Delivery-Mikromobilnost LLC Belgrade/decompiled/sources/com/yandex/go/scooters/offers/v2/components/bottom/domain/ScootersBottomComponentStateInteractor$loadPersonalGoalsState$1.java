package com.yandex.go.scooters.offers.v2.components.bottom.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.ScootersBottomComponentStateInteractor", f = "ScootersBottomComponentStateInteractor.kt", l = {102, 106}, m = "loadPersonalGoalsState", v = 2)
/* loaded from: classes13.dex */
final class ScootersBottomComponentStateInteractor$loadPersonalGoalsState$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBottomComponentStateInteractor$loadPersonalGoalsState$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
