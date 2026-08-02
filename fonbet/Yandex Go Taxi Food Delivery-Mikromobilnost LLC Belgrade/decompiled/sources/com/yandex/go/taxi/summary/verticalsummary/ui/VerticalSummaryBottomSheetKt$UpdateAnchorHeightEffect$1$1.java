package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.lx40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qor;
import defpackage.rol0;
import defpackage.sf11;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.VerticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1", f = "VerticalSummaryBottomSheet.kt", l = {411}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ qor $addressesHeightState;
    final /* synthetic */ lx40 $mutableAnchor;
    final /* synthetic */ qor $requirementsHeightState;
    final /* synthetic */ qor $verticalSelectorHeightState;
    final /* synthetic */ float $visibleTariffsHeightPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1(lx40 lx40Var, qor qorVar, qor qorVar2, qor qorVar3, float f, Continuation continuation) {
        super(2, continuation);
        this.$mutableAnchor = lx40Var;
        this.$addressesHeightState = qorVar;
        this.$verticalSelectorHeightState = qorVar2;
        this.$requirementsHeightState = qorVar3;
        this.$visibleTariffsHeightPx = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1(this.$mutableAnchor, this.$addressesHeightState, this.$verticalSelectorHeightState, this.$requirementsHeightState, this.$visibleTariffsHeightPx, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.$mutableAnchor != null) {
            final qor qorVar = this.$addressesHeightState;
            final qor qorVar2 = this.$verticalSelectorHeightState;
            final qor qorVar3 = this.$requirementsHeightState;
            final float f = this.$visibleTariffsHeightPx;
            rol0 o = androidx.compose.runtime.f.o(new sls() { // from class: eh31
                @Override // defpackage.sls
                public final Object invoke() {
                    return Float.valueOf(qorVar3.getFloatValue() + qorVar2.getFloatValue() + qor.this.getFloatValue() + f);
                }
            });
            sf11 sf11Var = new sf11(21, this.$mutableAnchor);
            this.label = 1;
            if (o.collect(sf11Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
