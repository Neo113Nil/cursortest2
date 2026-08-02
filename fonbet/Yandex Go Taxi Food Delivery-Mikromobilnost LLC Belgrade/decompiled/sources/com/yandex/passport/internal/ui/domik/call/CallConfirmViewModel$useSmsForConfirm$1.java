package com.yandex.passport.internal.ui.domik.call;

import com.yandex.passport.internal.entities.ConfirmMethod;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.usecase.ui.u0;
import com.yandex.passport.internal.usecase.ui.v0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.call.CallConfirmViewModel$useSmsForConfirm$1", f = "CallConfirmViewModel.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CallConfirmViewModel$useSmsForConfirm$1 extends SuspendLambda implements wls {
    final /* synthetic */ RegTrack $regTrack;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallConfirmViewModel$useSmsForConfirm$1(e eVar, RegTrack regTrack, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$regTrack = regTrack;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallConfirmViewModel$useSmsForConfirm$1(this.this$0, this.$regTrack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallConfirmViewModel$useSmsForConfirm$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v0 v0Var = this.this$0.D;
            u0 u0Var = new u0(this.$regTrack.withConfirmMethod(ConfirmMethod.BY_SMS), this.$regTrack.requirePhoneNumber(), this.this$0.G);
            this.label = 1;
            if (v0Var.a(u0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
