package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o9t;
import xsna.udt;

/* compiled from: HorizontalGameBannerSectionHolder.kt */
@b6l(c = "com.vk.games.presentation.components.items.HorizontalGameBannerSectionHolderKt$HorizontalGameBannerItems$1$1", f = "HorizontalGameBannerSectionHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ydv extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ udt.d $content;
    final /* synthetic */ izs<o9t, s3q0> $onAction;
    final /* synthetic */ mc90 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ydv(mc90 mc90Var, udt.d dVar, izs<? super o9t, s3q0> izsVar, spj<? super ydv> spjVar) {
        super(2, spjVar);
        this.$pagerState = mc90Var;
        this.$content = dVar;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ydv(this.$pagerState, this.$content, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ydv) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$onAction.invoke(new o9t.b((uet) this.$content.b.get(this.$pagerState.k() % this.$content.b.size())));
        return s3q0.a;
    }
}
