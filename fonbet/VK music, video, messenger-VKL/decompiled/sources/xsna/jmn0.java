package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SwipeToRemoveTrackContainer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.SwipeToRemoveTrackContainerKt$SwipeToRemoveTrackContainer$2$1", f = "SwipeToRemoveTrackContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class jmn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ f12<rgo> $draggableState;
    final /* synthetic */ gzs<s3q0> $isSwiped;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmn0(f12<rgo> f12Var, gzs<s3q0> gzsVar, spj<? super jmn0> spjVar) {
        super(2, spjVar);
        this.$draggableState = f12Var;
        this.$isSwiped = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jmn0(this.$draggableState, this.$isSwiped, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jmn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (((zak0) this.$draggableState.g).getValue() == rgo.Center) {
            this.$isSwiped.invoke();
        }
        return s3q0.a;
    }
}
