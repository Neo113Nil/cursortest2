package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogTabsRow.kt */
@b6l(c = "com.vk.games.presentation.components.tab.GamesCatalogTabsRowKt$GamesCatalogTabsRow$1$2$1$1", f = "GamesCatalogTabsRow.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class oet extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mc90 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oet(mc90 mc90Var, spj<? super oet> spjVar) {
        super(2, spjVar);
        this.$pagerState = mc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new oet(this.$pagerState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((oet) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mc90 mc90Var = this.$pagerState;
            int ordinal = GamesCatalogScreenTab.CATEGORIES.ordinal();
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
