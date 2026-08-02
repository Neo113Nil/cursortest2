package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlayerControlsDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerControlsDelegateKt$handleTimelineAction$2", f = "PlayerControlsDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class q0b0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public q0b0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        q0b0 q0b0Var = new q0b0(2, spjVar);
        q0b0Var.L$0 = obj;
        return q0b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((q0b0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yg5Var.C(true);
        return s3q0.a;
    }
}
