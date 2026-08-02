package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ye0;

/* compiled from: PlayerControlsDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerControlsDelegateKt$handleAdRedirectClick$1", f = "PlayerControlsDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class n0b0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_handleAdRedirectClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0b0(ars0 ars0Var, spj<? super n0b0> spjVar) {
        super(2, spjVar);
        this.$this_handleAdRedirectClick = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        n0b0 n0b0Var = new n0b0(this.$this_handleAdRedirectClick, spjVar);
        n0b0Var.L$0 = obj;
        return n0b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((n0b0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        je0 N0;
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        kzr0 kzr0Var = ((VideoLargeListState) ((b2a) this.$this_handleAdRedirectClick.b.b).getCurrentState()).y;
        if (kzr0Var != null && (N0 = yg5Var.N0()) != null) {
            ((ye0.a) N0).h(kzr0Var);
        }
        return s3q0.a;
    }
}
