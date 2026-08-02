package com.yandex.go.taxi.order.details.v2.ui.compose.driver;

import defpackage.mvg;
import defpackage.nik0;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.compose.driver.RideCardDriverSectionKt$Title$1$1", f = "RideCardDriverSection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSectionKt$Title$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $prevHasElementsBelowTitle$delegate;
    final /* synthetic */ nik0 $titleUiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSectionKt$Title$1$1(nik0 nik0Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$titleUiState = nik0Var;
        this.$prevHasElementsBelowTitle$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverSectionKt$Title$1$1(this.$titleUiState, this.$prevHasElementsBelowTitle$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardDriverSectionKt$Title$1$1 rideCardDriverSectionKt$Title$1$1 = (RideCardDriverSectionKt$Title$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardDriverSectionKt$Title$1$1.invokeSuspend(zy11Var);
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
        this.$prevHasElementsBelowTitle$delegate.setValue(Boolean.valueOf(this.$titleUiState.c));
        return zy11.a;
    }
}
