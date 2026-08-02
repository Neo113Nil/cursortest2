package com.yandex.go.summary.ui.compose.common.selector;

import androidx.compose.foundation.pager.d;
import defpackage.ck11;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.scc;
import defpackage.tse;
import defpackage.ubn;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.selector.SelectorItemKt$TariffSelectorPagerItem$4$1", f = "SelectorItem.kt", l = {190}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SelectorItemKt$TariffSelectorPagerItem$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ m3u0 $latestVerticals$delegate;
    final /* synthetic */ d $pagerState;
    final /* synthetic */ int $selectedVerticalIndex;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorItemKt$TariffSelectorPagerItem$4$1(int i, d dVar, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$selectedVerticalIndex = i;
        this.$pagerState = dVar;
        this.$latestVerticals$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectorItemKt$TariffSelectorPagerItem$4$1(this.$selectedVerticalIndex, this.$pagerState, this.$latestVerticals$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorItemKt$TariffSelectorPagerItem$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int e = y6i0.e(this.$selectedVerticalIndex, scc.e((List) this.$latestVerticals$delegate.getValue()));
            if (this.$pagerState.k() != e) {
                d dVar = this.$pagerState;
                ck11 K = sb2.K(500, 0, ubn.a, 2);
                this.I$0 = e;
                this.label = 1;
                if (d.g(dVar, e, K, this, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
