package com.yandex.go.scooters.domain;

import defpackage.kv90;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm6a0;", "reference", "Lzy11;", "<anonymous>", "(Lm6a0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2", f = "ScootersMmPaymentSyncLifecycleInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2(u uVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2 scootersMmPaymentSyncLifecycleInteractor$onLaunch$2 = new ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2(this.this$0, continuation);
        scootersMmPaymentSyncLifecycleInteractor$onLaunch$2.L$0 = obj;
        return scootersMmPaymentSyncLifecycleInteractor$onLaunch$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2 scootersMmPaymentSyncLifecycleInteractor$onLaunch$2 = (ScootersMmPaymentSyncLifecycleInteractor$onLaunch$2) create((m6a0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersMmPaymentSyncLifecycleInteractor$onLaunch$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m6a0 m6a0Var = (m6a0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kv90 kv90Var = lv90.Companion;
        PaymentMethod$Type paymentMethod$Type = m6a0Var.a;
        String str = m6a0Var.b;
        kv90Var.getClass();
        this.this$0.b.b(kv90.b(str, paymentMethod$Type));
        return zy11.a;
    }
}
