package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding;

import defpackage.kp30;
import defpackage.mvg;
import defpackage.np30;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uk10;
import defpackage.up30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.MtMosMetroAuthOnboardingModalRouter$content$1$1$1", f = "MtMosMetroAuthOnboardingModalRouter.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtMosMetroAuthOnboardingModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ up30 $action;
    int label;
    final /* synthetic */ np30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMosMetroAuthOnboardingModalRouter$content$1$1$1(np30 np30Var, up30 up30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = np30Var;
        this.$action = up30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMosMetroAuthOnboardingModalRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMosMetroAuthOnboardingModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            np30 np30Var = this.this$0;
            kp30 kp30Var = np30Var.H;
            up30 up30Var = this.$action;
            b bVar = np30Var.I;
            uk10 uk10Var = np30Var.N;
            this.label = 1;
            kp30Var.getClass();
            kp30.a(up30Var, bVar, uk10Var);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
