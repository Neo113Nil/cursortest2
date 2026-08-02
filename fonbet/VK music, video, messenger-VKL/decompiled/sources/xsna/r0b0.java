package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.wqs0;

/* compiled from: PlayerControlsDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerControlsDelegateKt$handleTimelineAction$4", f = "PlayerControlsDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class r0b0 extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
    final /* synthetic */ wqs0.o $action;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0b0(wqs0.o oVar, spj<? super r0b0> spjVar) {
        super(2, spjVar);
        this.$action = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        r0b0 r0b0Var = new r0b0(this.$action, spjVar);
        r0b0Var.L$0 = obj;
        return r0b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
        return ((r0b0) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yg5 yg5Var = (yg5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yg5Var.seek(((wqs0.o.a) this.$action).c);
        yg5Var.play();
        return s3q0.a;
    }
}
