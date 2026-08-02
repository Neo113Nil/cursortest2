package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.owh;
import defpackage.zgi;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isChosen", "Lzgi;", "paidInsuranceInfo", "Lqgi;", "<anonymous>", "(ZLzgi;)Lqgi;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DeliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1", f = "DeliveryBadgesUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ owh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1(owh owhVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = owhVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DeliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1 deliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1 = new DeliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1(this.this$0, (Continuation) obj3);
        deliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1.Z$0 = booleanValue;
        deliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1.L$0 = (zgi) obj2;
        return deliveryBadgesUiStateInteractor$paidInsuranceBadgeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        zgi zgiVar = (zgi) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (zgiVar == null || !zgiVar.a) {
            return null;
        }
        return this.this$0.j.a(z, zgiVar);
    }
}
