package com.yandex.messaging.internal.view.timeline;

import android.os.Handler;
import com.yandex.messaging.ChatRequest;
import defpackage.abz0;
import defpackage.b00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.TimelineActions$copyMessage$1", f = "TimelineActions.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineActions$copyMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ abz0 $ref;
    int label;
    final /* synthetic */ g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineActions$copyMessage$1(g0 g0Var, abz0 abz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = g0Var;
        this.$ref = abz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimelineActions$copyMessage$1(this.this$0, this.$ref, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimelineActions$copyMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g0 g0Var = this.this$0;
            com.yandex.messaging.internal.translator.k kVar = g0Var.d;
            ChatRequest chatRequest = g0Var.b;
            this.label = 1;
            obj = kVar.d(chatRequest, this);
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
        boolean z = obj != null;
        g0 g0Var2 = this.this$0;
        b00 b00Var = g0Var2.a;
        ((Handler) b00Var.a.get()).post(new rz(b00Var, g0Var2.b, this.$ref, z, 0));
        return zy11.a;
    }
}
