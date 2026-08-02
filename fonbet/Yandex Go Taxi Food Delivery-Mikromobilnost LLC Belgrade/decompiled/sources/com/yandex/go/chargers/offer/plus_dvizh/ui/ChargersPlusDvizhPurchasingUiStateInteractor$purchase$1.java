package com.yandex.go.chargers.offer.plus_dvizh.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.offer.plus_dvizh.ui.ChargersPlusDvizhPurchasingUiStateInteractor", f = "ChargersPlusDvizhPurchasingUiStateInteractor.kt", l = {48, 52, 54}, m = "purchase", v = 2)
/* loaded from: classes12.dex */
final class ChargersPlusDvizhPurchasingUiStateInteractor$purchase$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPlusDvizhPurchasingUiStateInteractor$purchase$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, this);
    }
}
