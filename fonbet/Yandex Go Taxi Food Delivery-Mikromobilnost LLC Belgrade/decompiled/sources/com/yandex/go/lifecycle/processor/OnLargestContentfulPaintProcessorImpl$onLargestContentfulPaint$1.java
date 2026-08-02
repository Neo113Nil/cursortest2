package com.yandex.go.lifecycle.processor;

import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import com.yandex.go.perf.MemoryConsumptionMetric;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.by2;
import defpackage.e3n;
import defpackage.f8z0;
import defpackage.fyc;
import defpackage.hst;
import defpackage.jst;
import defpackage.kls;
import defpackage.lz60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi10;
import defpackage.s630;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import io.appmetrica.analytics.MviTimestamp;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lifecycle.processor.OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1", f = "OnLargestContentfulPaintProcessorImpl.kt", l = {49, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.lifecycle.processor.OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1$1", f = "OnLargestContentfulPaintProcessorImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 60}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.lifecycle.processor.OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        
            if (r8 == r0) goto L20;
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
                e eVar = this.this$0;
                this.label = 1;
                obj = eVar.b(this);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            for (lz60 lz60Var : (Iterable) obj) {
                lz60Var.getName();
                long a = s630.a();
                lz60Var.g();
                long a2 = f8z0.a(a);
                hst hstVar = jst.e;
                Thread.currentThread().getName();
                e3n.p(a2);
                hstVar.getClass();
            }
            pi10 pi10Var = (pi10) this.this$0.g.get();
            MemoryConsumptionMetric memoryConsumptionMetric = MemoryConsumptionMetric.Fcp;
            this.label = 2;
            pi10Var.getClass();
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnLargestContentfulPaintProcessorImpl$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        if (defpackage.tje.k0(r13, r0, r12) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0029, code lost:
    
        if (r13.s(r12) == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fyc fycVar = this.this$0.i;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        jst.e.getClass();
        by2 by2Var = (by2) this.this$0.e.get();
        SystemClock.elapsedRealtime();
        ru.yandex.taxi.perf.c cVar = (ru.yandex.taxi.perf.c) by2Var;
        ComponentActivity componentActivity = cVar.a;
        kls fullyDrawnReporter = componentActivity.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.b) {
            z = fullyDrawnReporter.c;
        }
        if (!z) {
            try {
                componentActivity.reportFullyDrawn();
            } catch (Exception e) {
                xby.l(jst.e, "MVI_ERROR", null, e, "Activity report failed", 2);
            }
            cVar.c.onFullyDrawn(cVar.d, MviTimestamp.now());
            hst hstVar = jst.e;
            Objects.toString(cVar.b.b());
            hstVar.getClass();
        }
        r0 r0Var = this.this$0.f.b;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        this.this$0.c.getClass();
        sjh sjhVar = uyj.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
    }
}
