package com.yandex.go.taxi.summary.shared.requirement;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpex0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "", "<unused var>", "", "<anonymous>", "(Lpex0;Ljava/lang/Object;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.shared.requirement.RequirementsNotificationInteractor$notificationFlow$1", f = "RequirementsNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RequirementsNotificationInteractor$notificationFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementsNotificationInteractor$notificationFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequirementsNotificationInteractor$notificationFlow$1 requirementsNotificationInteractor$notificationFlow$1 = new RequirementsNotificationInteractor$notificationFlow$1(this.this$0, (Continuation) obj3);
        requirementsNotificationInteractor$notificationFlow$1.L$0 = (pex0) obj;
        return requirementsNotificationInteractor$notificationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 pex0Var = (pex0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.g.r(pex0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
