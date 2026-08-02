package com.yandex.go.loyalty.impl.common.domain;

import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/go/loyalty/impl/selector/data/model/GeoState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.loyalty.impl.common.domain.LoyaltyGeoStateRepository$awaitActualGeoState$2", f = "LoyaltyGeoStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LoyaltyGeoStateRepository$awaitActualGeoState$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    public LoyaltyGeoStateRepository$awaitActualGeoState$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoyaltyGeoStateRepository$awaitActualGeoState$2 loyaltyGeoStateRepository$awaitActualGeoState$2 = new LoyaltyGeoStateRepository$awaitActualGeoState$2(2, continuation);
        loyaltyGeoStateRepository$awaitActualGeoState$2.L$0 = obj;
        return loyaltyGeoStateRepository$awaitActualGeoState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoyaltyGeoStateRepository$awaitActualGeoState$2) create((GeoState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GeoState geoState = (GeoState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = geoState.b;
        return Boolean.valueOf(!(str == null || evu0.J(str)));
    }
}
