package com.yandex.go.summary.ui.compose.common.selector;

import androidx.compose.foundation.pager.d;
import androidx.compose.runtime.f;
import defpackage.fgd;
import defpackage.fre;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ny8;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.selector.SelectorItemKt$TariffSelectorPagerItem$3$1", f = "SelectorItem.kt", l = {177}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SelectorItemKt$TariffSelectorPagerItem$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ fgd $hapticController;
    final /* synthetic */ m3u0 $latestHandleSummaryUiAction$delegate;
    final /* synthetic */ m3u0 $latestSelectedVerticalIndex$delegate;
    final /* synthetic */ m3u0 $latestVerticals$delegate;
    final /* synthetic */ d $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorItemKt$TariffSelectorPagerItem$3$1(d dVar, m3u0 m3u0Var, m3u0 m3u0Var2, fgd fgdVar, m3u0 m3u0Var3, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = dVar;
        this.$latestSelectedVerticalIndex$delegate = m3u0Var;
        this.$latestVerticals$delegate = m3u0Var2;
        this.$hapticController = fgdVar;
        this.$latestHandleSummaryUiAction$delegate = m3u0Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelectorItemKt$TariffSelectorPagerItem$3$1(this.$pagerState, this.$latestSelectedVerticalIndex$delegate, this.$latestVerticals$delegate, this.$hapticController, this.$latestHandleSummaryUiAction$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectorItemKt$TariffSelectorPagerItem$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr t = e.t(f.o(new ny8(this.$pagerState, 9)));
            fre freVar = new fre(this.$latestSelectedVerticalIndex$delegate, this.$latestVerticals$delegate, this.$hapticController, this.$latestHandleSummaryUiAction$delegate, 8);
            this.label = 1;
            if (t.collect(freVar, this) == coroutineSingletons) {
                return coroutineSingletons;
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
