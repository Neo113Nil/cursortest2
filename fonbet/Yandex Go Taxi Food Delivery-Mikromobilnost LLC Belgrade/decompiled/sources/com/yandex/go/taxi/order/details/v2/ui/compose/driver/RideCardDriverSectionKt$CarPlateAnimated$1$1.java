package com.yandex.go.taxi.order.details.v2.ui.compose.driver;

import defpackage.jl40;
import defpackage.lik0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.sz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuc0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.compose.driver.RideCardDriverSectionKt$CarPlateAnimated$1$1", f = "RideCardDriverSection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSectionKt$CarPlateAnimated$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $lastPlate$delegate;
    final /* synthetic */ lik0 $uiState;
    final /* synthetic */ sz40 $visibleState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSectionKt$CarPlateAnimated$1$1(lik0 lik0Var, sz40 sz40Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$uiState = lik0Var;
        this.$visibleState = sz40Var;
        this.$lastPlate$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverSectionKt$CarPlateAnimated$1$1(this.$uiState, this.$visibleState, this.$lastPlate$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardDriverSectionKt$CarPlateAnimated$1$1 rideCardDriverSectionKt$CarPlateAnimated$1$1 = (RideCardDriverSectionKt$CarPlateAnimated$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardDriverSectionKt$CarPlateAnimated$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        boolean l = jl40.l(this.$uiState.a, zuc0.f);
        boolean z = !l;
        if (!l) {
            this.$lastPlate$delegate.setValue(this.$uiState.a);
        }
        this.$visibleState.b(Boolean.valueOf(z));
        return zy11.a;
    }
}
