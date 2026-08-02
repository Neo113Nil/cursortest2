package com.yandex.go.promocodes.base.impl.promo_codes.data.datasources;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.PromoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1", f = "PromoCodeRemoteDatasource.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes13.dex */
public final class PromoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeRemoteDatasource$list$2$launchInfo$1$invokeSuspend$$inlined$mapNotNull$1$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
