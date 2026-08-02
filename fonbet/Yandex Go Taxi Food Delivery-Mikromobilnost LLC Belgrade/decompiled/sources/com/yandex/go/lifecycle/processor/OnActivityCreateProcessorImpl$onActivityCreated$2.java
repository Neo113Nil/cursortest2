package com.yandex.go.lifecycle.processor;

import defpackage.e3n;
import defpackage.f8z0;
import defpackage.hst;
import defpackage.i6u;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s630;
import defpackage.tse;
import defpackage.vw60;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lifecycle.processor.OnActivityCreateProcessorImpl$onActivityCreated$2", f = "OnActivityCreateProcessorImpl.kt", l = {47, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class OnActivityCreateProcessorImpl$onActivityCreated$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnActivityCreateProcessorImpl$onActivityCreated$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnActivityCreateProcessorImpl$onActivityCreated$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnActivityCreateProcessorImpl$onActivityCreated$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            this.label = 1;
            obj = bVar2.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$2;
                bVar = (b) this.L$1;
                kotlin.b.b(obj);
                while (it.hasNext()) {
                    vw60 vw60Var = (vw60) it.next();
                    vw60Var.getName();
                    long a = s630.a();
                    vw60Var.c();
                    long a2 = f8z0.a(a);
                    hst hstVar = jst.e;
                    Thread.currentThread().getName();
                    e3n.p(a2);
                    hstVar.getClass();
                    this.L$0 = null;
                    this.L$1 = bVar;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    if (i6u.c(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        bVar = this.this$0;
        it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
