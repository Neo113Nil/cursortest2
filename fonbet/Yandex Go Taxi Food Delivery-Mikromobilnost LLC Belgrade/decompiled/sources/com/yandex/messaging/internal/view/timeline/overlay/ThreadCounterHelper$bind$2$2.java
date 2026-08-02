package com.yandex.messaging.internal.view.timeline.overlay;

import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj3b;", "chatInfo", "", "", "Lcom/yandex/messaging/domain/personal/mentions/Mentions;", "mentions", "Lzy11;", "<anonymous>", "(Lj3b;Ljava/util/Set;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.overlay.ThreadCounterHelper$bind$2$2", f = "ThreadCounterHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ThreadCounterHelper$bind$2$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadCounterHelper$bind$2$2(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ThreadCounterHelper$bind$2$2 threadCounterHelper$bind$2$2 = new ThreadCounterHelper$bind$2$2(this.this$0, (Continuation) obj3);
        threadCounterHelper$bind$2$2.L$0 = (j3b) obj;
        threadCounterHelper$bind$2$2.L$1 = (Set) obj2;
        return threadCounterHelper$bind$2$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = ((j3b) this.L$0).l && !((Set) this.L$1).isEmpty();
        f fVar = this.this$0;
        boolean z2 = fVar.M;
        zy11 zy11Var = zy11.a;
        if (z2 == z) {
            return zy11Var;
        }
        fVar.M = z;
        fVar.u();
        return zy11Var;
    }
}
