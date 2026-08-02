package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlayerDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerDelegateKt$handlePlayerAction$2", f = "PlayerDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class x0b0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_handlePlayerAction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0b0(ars0 ars0Var, spj<? super x0b0> spjVar) {
        super(2, spjVar);
        this.$this_handlePlayerAction = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        x0b0 x0b0Var = new x0b0(this.$this_handlePlayerAction, spjVar);
        x0b0Var.L$0 = obj;
        return x0b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((x0b0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        com.vk.libvideo.autoplay.a aVar = ((VideoLargeListState) ((b2a) this.$this_handlePlayerAction.b.b).getCurrentState()).s;
        if (aVar != null) {
            yg5Var.a0(aVar);
        }
        yg5Var.S(false);
        return s3q0.a;
    }
}
