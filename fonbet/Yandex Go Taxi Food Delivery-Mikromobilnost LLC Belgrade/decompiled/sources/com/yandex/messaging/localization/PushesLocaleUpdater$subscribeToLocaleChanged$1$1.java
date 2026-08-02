package com.yandex.messaging.localization;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0x0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.localization.PushesLocaleUpdater$subscribeToLocaleChanged$1$1", f = "PushesLocaleUpdater.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PushesLocaleUpdater$subscribeToLocaleChanged$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isPushTokenActive;
    final /* synthetic */ o0x0 $pushTokenController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushesLocaleUpdater$subscribeToLocaleChanged$1$1(o0x0 o0x0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$pushTokenController = o0x0Var;
        this.$isPushTokenActive = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushesLocaleUpdater$subscribeToLocaleChanged$1$1(this.$pushTokenController, this.$isPushTokenActive, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PushesLocaleUpdater$subscribeToLocaleChanged$1$1 pushesLocaleUpdater$subscribeToLocaleChanged$1$1 = (PushesLocaleUpdater$subscribeToLocaleChanged$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pushesLocaleUpdater$subscribeToLocaleChanged$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$pushTokenController.c(this.$isPushTokenActive);
        return zy11.a;
    }
}
