package com.yandex.go.loyalty.impl.common.domain;

import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzy11;", "<unused var>", "Landroidx/lifecycle/Lifecycle$Event;", "Lcom/yandex/go/loyalty/impl/selector/data/model/GeoState;", "geoState", "<anonymous>", "(VLandroidx/lifecycle/Lifecycle$Event;Lcom/yandex/go/loyalty/impl/selector/data/model/GeoState;)Lcom/yandex/go/loyalty/impl/selector/data/model/GeoState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.loyalty.impl.common.domain.LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$2$3", f = "LoyaltyStateFCPListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$2$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$2$3 loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$2$3 = new LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$2$3(4, (Continuation) obj4);
        loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$2$3.L$0 = (GeoState) obj3;
        return loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$2$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GeoState geoState = (GeoState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return geoState;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
