package com.yandex.go.pickup_from_photo.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/address/clarification/AddressClarificationCloseReason;", CRLReasonCodeExtension.REASON, "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/address/clarification/AddressClarificationCloseReason;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.navigation.PickupFromPhotoRouterImpl$onLaunch$1", f = "PickupFromPhotoRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoRouterImpl$onLaunch$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupFromPhotoRouterImpl$onLaunch$1 pickupFromPhotoRouterImpl$onLaunch$1 = new PickupFromPhotoRouterImpl$onLaunch$1(this.this$0, continuation);
        pickupFromPhotoRouterImpl$onLaunch$1.L$0 = obj;
        return pickupFromPhotoRouterImpl$onLaunch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PickupFromPhotoRouterImpl$onLaunch$1 pickupFromPhotoRouterImpl$onLaunch$1 = (PickupFromPhotoRouterImpl$onLaunch$1) create((AddressClarificationCloseReason) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pickupFromPhotoRouterImpl$onLaunch$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AddressClarificationCloseReason addressClarificationCloseReason = (AddressClarificationCloseReason) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        boolean z = addressClarificationCloseReason == AddressClarificationCloseReason.MOVE_PIN_OUT_AREA;
        cVar.c0 = z;
        cVar.H.n = !z;
        return zy11.a;
    }
}
