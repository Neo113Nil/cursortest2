package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FeedFooter.kt */
@b6l(c = "com.vk.feed.design.compose.newsfeed.footer.PressScaleNode$update$1", f = "FeedFooter.kt", l = {858}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class u2d0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ t2d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2d0(t2d0 t2d0Var, spj<? super u2d0> spjVar) {
        super(2, spjVar);
        this.this$0 = t2d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new u2d0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((u2d0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            t2d0 t2d0Var = this.this$0;
            this.label = 1;
            if (t2d0.i2(t2d0Var, this) == coroutineSingletons) {
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
