package com.yandex.go.pin.api;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w65;
import defpackage.wls;
import defpackage.x65;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.BasePinVersionController$listenState$1", f = "BasePinVersionController.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class BasePinVersionController$listenState$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $collector;
    final /* synthetic */ boolean $distinct;
    final /* synthetic */ tpr $flow;
    int label;
    final /* synthetic */ x65 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePinVersionController$listenState$1(tpr tprVar, x65 x65Var, tls tlsVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$flow = tprVar;
        this.this$0 = x65Var;
        this.$collector = tlsVar;
        this.$distinct = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePinVersionController$listenState$1(this.$flow, this.this$0, this.$collector, this.$distinct, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePinVersionController$listenState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$flow;
            if (this.$distinct) {
                tprVar = e.t(tprVar);
            }
            this.this$0.a.getClass();
            tpr F = e.F(tprVar, uyj.a);
            w65 w65Var = new w65(0, this.$collector);
            this.label = 1;
            if (F.collect(w65Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
