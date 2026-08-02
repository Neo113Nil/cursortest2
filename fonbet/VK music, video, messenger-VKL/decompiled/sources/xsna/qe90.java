package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PaginationScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.PaginationScreenContent$ComposeContent$3$1", f = "PaginationScreenContent.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class qe90 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $needScrollByTime$delegate;
    final /* synthetic */ mc90 $pagerState;
    final /* synthetic */ int $scrollDuration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe90(mc90 mc90Var, int i, wh50<Boolean> wh50Var, spj<? super qe90> spjVar) {
        super(2, spjVar);
        this.$pagerState = mc90Var;
        this.$scrollDuration = i;
        this.$needScrollByTime$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qe90(this.$pagerState, this.$scrollDuration, this.$needScrollByTime$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qe90) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$needScrollByTime$delegate.getValue().booleanValue() && !this.$pagerState.k.a()) {
                mc90 mc90Var = this.$pagerState;
                int k = mc90Var.k() + 1 >= this.$pagerState.o() ? 0 : this.$pagerState.k() + 1;
                dtp0 d = jq2.d(this.$scrollDuration, 0, null, 6);
                this.label = 1;
                if (mc90.g(mc90Var, k, d, this, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$needScrollByTime$delegate.setValue(Boolean.FALSE);
        return s3q0.a;
    }
}
