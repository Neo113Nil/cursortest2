package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.ui.bouncer.model.e1;
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
@mvg(c = "com.yandex.passport.internal.ui.bouncer.BouncerActivityTwm$bind$2$1", f = "BouncerActivityTwm.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BouncerActivityTwm$bind$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.common.mvi.h $source;
    final /* synthetic */ e1 $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BouncerActivityTwm$bind$2$1(e1 e1Var, com.yandex.passport.common.mvi.h hVar, Continuation continuation) {
        super(2, continuation);
        this.$this_with = e1Var;
        this.$source = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BouncerActivityTwm$bind$2$1(this.$this_with, this.$source, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BouncerActivityTwm$bind$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e1 e1Var = this.$this_with;
        com.yandex.passport.common.mvi.h hVar = this.$source;
        this.label = 1;
        e1Var.getClass();
        Object collect = kotlinx.coroutines.flow.e.c(((t) hVar).a).a.collect(new com.yandex.passport.common.mvi.j(new com.yandex.passport.common.mvi.i(1, e1Var.f), e1Var), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
