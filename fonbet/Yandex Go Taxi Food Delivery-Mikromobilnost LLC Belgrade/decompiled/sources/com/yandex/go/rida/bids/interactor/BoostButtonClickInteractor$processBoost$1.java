package com.yandex.go.rida.bids.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.rida.bids.interactor.BoostButtonClickInteractor", f = "BoostButtonClickInteractor.kt", l = {33}, m = "processBoost", v = 2)
/* loaded from: classes13.dex */
final class BoostButtonClickInteractor$processBoost$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoostButtonClickInteractor$processBoost$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n.a(this.this$0, this);
    }
}
