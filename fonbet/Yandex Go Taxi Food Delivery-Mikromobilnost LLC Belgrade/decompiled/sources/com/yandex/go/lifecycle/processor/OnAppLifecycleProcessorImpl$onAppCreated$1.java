package com.yandex.go.lifecycle.processor;

import defpackage.e3n;
import defpackage.f8z0;
import defpackage.g8e;
import defpackage.hst;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s630;
import defpackage.tse;
import defpackage.wls;
import defpackage.yw60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lifecycle.processor.OnAppLifecycleProcessorImpl$onAppCreated$1", f = "OnAppLifecycleProcessorImpl.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class OnAppLifecycleProcessorImpl$onAppCreated$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnAppLifecycleProcessorImpl$onAppCreated$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnAppLifecycleProcessorImpl$onAppCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnAppLifecycleProcessorImpl$onAppCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            this.label = 1;
            obj = cVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        for (yw60 yw60Var : (Iterable) obj) {
            String o = g8e.o("onAppCreated: ", yw60Var.getName());
            try {
                long a = s630.a();
                yw60Var.e();
                long a2 = f8z0.a(a);
                hst hstVar = jst.e;
                Thread.currentThread().getName();
                e3n.p(a2);
                hstVar.getClass();
            } catch (Throwable th) {
                hst hstVar2 = jst.e;
                hstVar2.getClass();
                ke00 a3 = hstVar2.b.a();
                if (a3 != null && a3.b(15)) {
                    a3.a(15, null, th, "OnAppLifecycle listener failed: ".concat(o), hstVar2.a);
                }
            }
        }
        return zy11.a;
    }
}
