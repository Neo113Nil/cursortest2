package com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.PromoCodesInteractor", f = "PromoCodesInteractor.kt", l = {31}, m = "requestPromoCodesListUpdate", v = 2)
/* loaded from: classes13.dex */
final class PromoCodesInteractor$requestPromoCodesListUpdate$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodesInteractor$requestPromoCodesListUpdate$3(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
