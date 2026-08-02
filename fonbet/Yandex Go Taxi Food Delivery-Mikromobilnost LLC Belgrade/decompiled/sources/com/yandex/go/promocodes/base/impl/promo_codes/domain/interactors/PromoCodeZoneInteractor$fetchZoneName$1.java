package com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors;

import defpackage.mvg;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.PromoCodeZoneInteractor", f = "PromoCodeZoneInteractor.kt", l = {17}, m = "fetchZoneName-IoAF18A", v = 2)
/* loaded from: classes13.dex */
final class PromoCodeZoneInteractor$fetchZoneName$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeZoneInteractor$fetchZoneName$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable a = this.this$0.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
