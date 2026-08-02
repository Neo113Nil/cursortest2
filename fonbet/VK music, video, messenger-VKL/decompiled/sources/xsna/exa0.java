package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sx40;

/* compiled from: PlaybackQueue.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue$QueueScaffold$1$1", f = "PlaybackQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class exa0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    final /* synthetic */ mtk0<Boolean> $shouldLoadMore$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exa0(spj spjVar, izs izsVar, mtk0 mtk0Var) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$shouldLoadMore$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new exa0(spjVar, this.$onAction, this.$shouldLoadMore$delegate);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((exa0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$shouldLoadMore$delegate.getValue().booleanValue()) {
            this.$onAction.invoke(sx40.m.b);
        }
        return s3q0.a;
    }
}
