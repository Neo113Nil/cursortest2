package com.yandex.go.summary.ui.compose;

import androidx.compose.runtime.f;
import defpackage.b2k;
import defpackage.gp5;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pjv0;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.yur;
import defpackage.yw20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.SummaryPaneKt$ForceFocusEffect$1$1", f = "SummaryPane.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryPaneKt$ForceFocusEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $anchoredToolbarFocusRequester;
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ yur $expandedAddressesFocusRequester;
    final /* synthetic */ yur $expandedToolbarFocusRequester;
    final /* synthetic */ yur $footerOrderButtonFocusRequester;
    final /* synthetic */ m3u0 $latestSummaryUiState;
    final /* synthetic */ yw20 $localModalAccessibilityDelegate;
    final /* synthetic */ yur $surgeFocusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPaneKt$ForceFocusEffect$1$1(wg6 wg6Var, yur yurVar, yw20 yw20Var, m3u0 m3u0Var, yur yurVar2, yur yurVar3, yur yurVar4, yur yurVar5, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = wg6Var;
        this.$footerOrderButtonFocusRequester = yurVar;
        this.$localModalAccessibilityDelegate = yw20Var;
        this.$latestSummaryUiState = m3u0Var;
        this.$expandedToolbarFocusRequester = yurVar2;
        this.$expandedAddressesFocusRequester = yurVar3;
        this.$surgeFocusRequester = yurVar4;
        this.$anchoredToolbarFocusRequester = yurVar5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPaneKt$ForceFocusEffect$1$1(this.$bottomSheetState, this.$footerOrderButtonFocusRequester, this.$localModalAccessibilityDelegate, this.$latestSummaryUiState, this.$expandedToolbarFocusRequester, this.$expandedAddressesFocusRequester, this.$surgeFocusRequester, this.$anchoredToolbarFocusRequester, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPaneKt$ForceFocusEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b2k s = e.s(new c(f.o(new gp5(this.$bottomSheetState, 28))), new pjv0(0));
            a aVar = new a(this.$footerOrderButtonFocusRequester, this.$localModalAccessibilityDelegate, this.$latestSummaryUiState, this.$expandedToolbarFocusRequester, this.$expandedAddressesFocusRequester, this.$surgeFocusRequester, this.$anchoredToolbarFocusRequester);
            this.label = 1;
            if (s.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
