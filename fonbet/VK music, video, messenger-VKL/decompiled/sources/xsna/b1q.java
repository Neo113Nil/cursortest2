package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.c1q;

/* compiled from: EventsFlow.kt */
@b6l(c = "com.vk.catalog.mvi.block.ui.EventsFlowKt$HandleEvents$2$1", f = "EventsFlow.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class b1q extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<Object, spj<? super s3q0>, Object> $block;
    final /* synthetic */ ksr<Object> $events;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1q(ksr<Object> ksrVar, wzs<Object, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super b1q> spjVar) {
        super(2, spjVar);
        this.$events = ksrVar;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b1q(this.$events, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b1q) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr<Object> ksrVar = this.$events;
            c1q.a aVar = new c1q.a(this.$block);
            this.label = 1;
            if (ksrVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
