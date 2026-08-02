package com.yandex.go.blur.performance;

import android.view.View;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.blur.performance.PerformanceTrackingBlurDelegate$attachTo$1", f = "PerformanceTrackingBlurDelegate.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PerformanceTrackingBlurDelegate$attachTo$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceTrackingBlurDelegate$attachTo$1(a aVar, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerformanceTrackingBlurDelegate$attachTo$1(this.this$0, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerformanceTrackingBlurDelegate$attachTo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            o430 o430Var = e3n.b;
            long U = kp50.U(20, DurationUnit.SECONDS);
            this.label = 1;
            if (kotlinx.coroutines.a.j(U, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        AtomicReference atomicReference = this.this$0.e;
        View view = this.$view;
        do {
            boolean compareAndSet = atomicReference.compareAndSet(view, null);
            zy11Var = zy11.a;
            if (compareAndSet) {
                a aVar = this.this$0;
                aVar.b.b(aVar.d);
                return zy11Var;
            }
        } while (atomicReference.get() == view);
        return zy11Var;
    }
}
