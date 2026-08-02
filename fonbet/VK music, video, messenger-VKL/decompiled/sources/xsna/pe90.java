package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PaginationScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.PaginationScreenContent$ComposeContent$2$1", f = "PaginationScreenContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class pe90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $needScrollByTime$delegate;
    final /* synthetic */ if2<Float, sq2> $pagerProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe90(if2<Float, sq2> if2Var, wh50<Boolean> wh50Var, spj<? super pe90> spjVar) {
        super(2, spjVar);
        this.$pagerProgress = if2Var;
        this.$needScrollByTime$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pe90(this.$pagerProgress, this.$needScrollByTime$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pe90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$pagerProgress.d().floatValue() == 1.0f) {
            this.$needScrollByTime$delegate.setValue(Boolean.TRUE);
        }
        return s3q0.a;
    }
}
