package com.yandex.go.tariffcard.ui;

import defpackage.l8u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.StatusBarThemeTracker$attach$1", f = "StatusBarThemeTracker.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class StatusBarThemeTracker$attach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l8u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarThemeTracker$attach$1(l8u0 l8u0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l8u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatusBarThemeTracker$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StatusBarThemeTracker$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            l8u0 l8u0Var = this.this$0;
            kotlinx.coroutines.flow.r0 r0Var = l8u0Var.b;
            qit0 qit0Var = new qit0(6, l8u0Var);
            this.label = 1;
            Object collect = r0Var.collect(new kotlinx.coroutines.flow.r(qit0Var, new Ref$IntRef()), this);
            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
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
