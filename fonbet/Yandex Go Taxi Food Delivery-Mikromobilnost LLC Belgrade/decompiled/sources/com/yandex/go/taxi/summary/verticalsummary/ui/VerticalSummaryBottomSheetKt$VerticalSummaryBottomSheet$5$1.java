package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.dh31;
import defpackage.mvg;
import defpackage.nc31;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1", f = "VerticalSummaryBottomSheet.kt", l = {425}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ dh31 $anchors;
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ tpr $uiEffectFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1(tpr tprVar, wg6 wg6Var, dh31 dh31Var, Continuation continuation) {
        super(2, continuation);
        this.$uiEffectFlow = tprVar;
        this.$bottomSheetState = wg6Var;
        this.$anchors = dh31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1(this.$uiEffectFlow, this.$bottomSheetState, this.$anchors, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$uiEffectFlow;
            wg6 wg6Var = this.$bottomSheetState;
            dh31 dh31Var = this.$anchors;
            o oVar = new o(tprVar, new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            nc31 nc31Var = new nc31(1, wg6Var, dh31Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(nc31Var, this) == coroutineSingletons) {
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
