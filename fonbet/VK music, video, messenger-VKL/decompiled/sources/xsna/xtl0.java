package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StoriesOnboardingsDelegate.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.executors.StoriesOnboardingsDelegate$loadLikesOnboarding$1", f = "StoriesOnboardingsDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class xtl0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ytl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtl0(ytl0 ytl0Var, spj<? super xtl0> spjVar) {
        super(2, spjVar);
        this.this$0 = ytl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xtl0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xtl0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ytl0 ytl0Var = this.this$0;
        q7v0 q7v0Var = ytl0Var.a;
        q7v0Var.c(new qk(19, q7v0Var, ytl0Var));
        return s3q0.a;
    }
}
