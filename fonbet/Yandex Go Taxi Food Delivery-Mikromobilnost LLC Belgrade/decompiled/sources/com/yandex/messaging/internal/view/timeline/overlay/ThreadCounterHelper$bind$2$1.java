package com.yandex.messaging.internal.view.timeline.overlay;

import android.content.res.Resources;
import android.widget.TextView;
import defpackage.ewh0;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3b;", "chatInfo", "Lzy11;", "<anonymous>", "(Lj3b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.overlay.ThreadCounterHelper$bind$2$1", f = "ThreadCounterHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ThreadCounterHelper$bind$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadCounterHelper$bind$2$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ThreadCounterHelper$bind$2$1 threadCounterHelper$bind$2$1 = new ThreadCounterHelper$bind$2$1(this.this$0, continuation);
        threadCounterHelper$bind$2$1.L$0 = obj;
        return threadCounterHelper$bind$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ThreadCounterHelper$bind$2$1 threadCounterHelper$bind$2$1 = (ThreadCounterHelper$bind$2$1) create((j3b) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        threadCounterHelper$bind$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j3b j3bVar = (j3b) this.L$0;
        boolean z = j3bVar.l;
        int i = j3bVar.x;
        boolean z2 = z && j3bVar.d > 0;
        f fVar = this.this$0;
        boolean z3 = fVar.N;
        zy11 zy11Var = zy11.a;
        if (z2 == z3 && fVar.L == i) {
            return zy11Var;
        }
        fVar.L = i;
        fVar.N = z2;
        TextView textView = fVar.q().b;
        Resources resources = this.this$0.D.getResources();
        int i2 = ewh0.messaging_thread_counter_label;
        int i3 = this.this$0.L;
        textView.setText(resources.getQuantityString(i2, i3, new Integer(i3)));
        this.this$0.u();
        return zy11Var;
    }
}
