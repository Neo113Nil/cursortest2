package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlaybackQueue.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue$MutableQueueItems$3$1", f = "PlaybackQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class axa0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<String> $swipedItemUniqueId;
    int label;
    final /* synthetic */ gxa0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axa0(gxa0 gxa0Var, wh50<String> wh50Var, spj<? super axa0> spjVar) {
        super(2, spjVar);
        this.this$0 = gxa0Var;
        this.$swipedItemUniqueId = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new axa0(this.this$0, this.$swipedItemUniqueId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((axa0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (!this.this$0.i()) {
            this.$swipedItemUniqueId.setValue("");
        }
        return s3q0.a;
    }
}
