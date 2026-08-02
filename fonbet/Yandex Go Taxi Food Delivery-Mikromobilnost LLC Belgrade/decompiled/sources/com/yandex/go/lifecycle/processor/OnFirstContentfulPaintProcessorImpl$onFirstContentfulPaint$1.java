package com.yandex.go.lifecycle.processor;

import com.yandex.go.perf.MemoryConsumptionMetric;
import defpackage.e3n;
import defpackage.f8z0;
import defpackage.hst;
import defpackage.jst;
import defpackage.jy60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi10;
import defpackage.s630;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lifecycle.processor.OnFirstContentfulPaintProcessorImpl$onFirstContentfulPaint$1", f = "OnFirstContentfulPaintProcessorImpl.kt", l = {59, 62, 66, 66}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class OnFirstContentfulPaintProcessorImpl$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnFirstContentfulPaintProcessorImpl$onFirstContentfulPaint$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnFirstContentfulPaintProcessorImpl$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnFirstContentfulPaintProcessorImpl$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r9) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r10 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r6 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0038, code lost:
    
        if (r10 == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.label = 1;
            obj = dVar.b(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            kotlin.b.b(obj);
            ((e) this.this$0.g.get()).i.T(zy11Var);
            com.yandex.go.lifecycle.experiments.d dVar2 = (com.yandex.go.lifecycle.experiments.d) this.this$0.i.get();
            this.label = 3;
            obj = dVar2.d(this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ((e) this.this$0.g.get()).c();
                return zy11Var;
            }
            kotlin.b.b(obj);
            Long l = (Long) obj;
            long longValue = l != null ? l.longValue() : 30000L;
            this.label = 4;
        }
        for (jy60 jy60Var : (Iterable) obj) {
            jy60Var.getName();
            long a = s630.a();
            jy60Var.h();
            long a2 = f8z0.a(a);
            hst hstVar = jst.e;
            Thread.currentThread().getName();
            e3n.p(a2);
            hstVar.getClass();
        }
        pi10 pi10Var = (pi10) this.this$0.j.get();
        MemoryConsumptionMetric memoryConsumptionMetric = MemoryConsumptionMetric.Fcp;
        this.label = 2;
        pi10Var.getClass();
    }
}
