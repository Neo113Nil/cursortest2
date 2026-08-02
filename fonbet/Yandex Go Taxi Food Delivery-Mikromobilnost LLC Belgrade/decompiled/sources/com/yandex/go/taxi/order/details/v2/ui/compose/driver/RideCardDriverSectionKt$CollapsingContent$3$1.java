package com.yandex.go.taxi.order.details.v2.ui.compose.driver;

import defpackage.bhk0;
import defpackage.ldf;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.qgk0;
import defpackage.tse;
import defpackage.tx40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.compose.driver.RideCardDriverSectionKt$CollapsingContent$3$1", f = "RideCardDriverSection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSectionKt$CollapsingContent$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $alphaAnimationEasing$delegate;
    final /* synthetic */ qgk0 $contentUiState;
    final /* synthetic */ tx40 $prevAlphaTarget$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSectionKt$CollapsingContent$3$1(qgk0 qgk0Var, tx40 tx40Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$contentUiState = qgk0Var;
        this.$prevAlphaTarget$delegate = tx40Var;
        this.$alphaAnimationEasing$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverSectionKt$CollapsingContent$3$1(this.$contentUiState, this.$prevAlphaTarget$delegate, this.$alphaAnimationEasing$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardDriverSectionKt$CollapsingContent$3$1 rideCardDriverSectionKt$CollapsingContent$3$1 = (RideCardDriverSectionKt$CollapsingContent$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardDriverSectionKt$CollapsingContent$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ldf ldfVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        oz40 oz40Var = this.$alphaAnimationEasing$delegate;
        if (this.$contentUiState.c > this.$prevAlphaTarget$delegate.getFloatValue()) {
            ldf ldfVar2 = bhk0.a;
            ldfVar = bhk0.a;
        } else {
            ldf ldfVar3 = bhk0.a;
            ldfVar = bhk0.b;
        }
        oz40Var.setValue(ldfVar);
        this.$prevAlphaTarget$delegate.setFloatValue(this.$contentUiState.c);
        return zy11.a;
    }
}
