package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GameCatalogTabsRowLego.kt */
@b6l(c = "com.vk.games.presentation.components.tab.GameCatalogTabsRowLegoKt$GamesCatalogTabsRowLego$1$1$1$1", f = "GameCatalogTabsRowLego.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class p6t extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mc90 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6t(mc90 mc90Var, spj<? super p6t> spjVar) {
        super(2, spjVar);
        this.$pagerState = mc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p6t(this.$pagerState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((p6t) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mc90 mc90Var = this.$pagerState;
            int ordinal = GamesCatalogScreenTab.CATALOG.ordinal();
            this.label = 1;
            if (mc90.g(mc90Var, ordinal, null, this, 6) == coroutineSingletons) {
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
