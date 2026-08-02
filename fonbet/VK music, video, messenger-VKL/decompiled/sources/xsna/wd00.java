package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MainContent.kt */
@b6l(c = "com.vk.clips.coauthors.selector.ui.MainContentKt$MainContent$3$1", f = "MainContent.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class wd00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ v6p0 $scrollBehavior;
    final /* synthetic */ mtk0<d8p0> $topBarState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd00(v6p0 v6p0Var, mtk0<d8p0> mtk0Var, spj<? super wd00> spjVar) {
        super(2, spjVar);
        this.$scrollBehavior = v6p0Var;
        this.$topBarState$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wd00(this.$scrollBehavior, this.$topBarState$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wd00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (!this.$topBarState$delegate.getValue().b.isEmpty() || this.$topBarState$delegate.getValue().a.length() == 0) {
                v6p0 v6p0Var = this.$scrollBehavior;
                this.label = 1;
                if (v6p0Var.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
