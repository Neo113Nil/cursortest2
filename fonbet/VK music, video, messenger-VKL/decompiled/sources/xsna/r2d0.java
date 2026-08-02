package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FeedFooter.kt */
@b6l(c = "com.vk.feed.design.compose.newsfeed.footer.PressScaleNode$observePresses$2$1", f = "FeedFooter.kt", l = {873}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class r2d0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ t2d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2d0(t2d0 t2d0Var, float f, spj<? super r2d0> spjVar) {
        super(2, spjVar);
        this.this$0 = t2d0Var;
        this.$target = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new r2d0(this.this$0, this.$target, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((r2d0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if2<Float, sq2> if2Var = this.this$0.s;
            Float f = new Float(this.$target);
            dtp0 d = jq2.d(this.this$0.r, 0, null, 6);
            i750 i750Var = new i750(this.this$0, 16);
            this.label = 1;
            if (if2.c(if2Var, f, d, i750Var, this, 4) == coroutineSingletons) {
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
