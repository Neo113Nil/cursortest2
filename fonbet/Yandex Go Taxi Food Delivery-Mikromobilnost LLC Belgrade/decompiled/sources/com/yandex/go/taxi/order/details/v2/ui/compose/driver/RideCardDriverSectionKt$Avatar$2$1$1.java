package com.yandex.go.taxi.order.details.v2.ui.compose.driver;

import defpackage.bhk0;
import defpackage.fgk0;
import defpackage.iy40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.tx40;
import defpackage.ubn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.compose.driver.RideCardDriverSectionKt$Avatar$2$1$1", f = "RideCardDriverSection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverSectionKt$Avatar$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ iy40 $avatarOverlayAnimationDuration$delegate;
    final /* synthetic */ oz40 $avatarOverlayAnimationEasing$delegate;
    final /* synthetic */ tx40 $avatarOverlayScaleTarget$delegate;
    final /* synthetic */ fgk0 $avatarOverlayState;
    final /* synthetic */ tx40 $prevAvatarOverlayScaleTarget$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverSectionKt$Avatar$2$1$1(fgk0 fgk0Var, tx40 tx40Var, tx40 tx40Var2, oz40 oz40Var, iy40 iy40Var, Continuation continuation) {
        super(2, continuation);
        this.$avatarOverlayState = fgk0Var;
        this.$avatarOverlayScaleTarget$delegate = tx40Var;
        this.$prevAvatarOverlayScaleTarget$delegate = tx40Var2;
        this.$avatarOverlayAnimationEasing$delegate = oz40Var;
        this.$avatarOverlayAnimationDuration$delegate = iy40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardDriverSectionKt$Avatar$2$1$1(this.$avatarOverlayState, this.$avatarOverlayScaleTarget$delegate, this.$prevAvatarOverlayScaleTarget$delegate, this.$avatarOverlayAnimationEasing$delegate, this.$avatarOverlayAnimationDuration$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardDriverSectionKt$Avatar$2$1$1 rideCardDriverSectionKt$Avatar$2$1$1 = (RideCardDriverSectionKt$Avatar$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardDriverSectionKt$Avatar$2$1$1.invokeSuspend(zy11Var);
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
        this.$avatarOverlayScaleTarget$delegate.setFloatValue(this.$avatarOverlayState.a ? 1.0f : 0.0f);
        this.$avatarOverlayAnimationEasing$delegate.setValue(this.$avatarOverlayScaleTarget$delegate.getFloatValue() > this.$prevAvatarOverlayScaleTarget$delegate.getFloatValue() ? bhk0.e : ubn.d);
        iy40 iy40Var = this.$avatarOverlayAnimationDuration$delegate;
        float floatValue = this.$avatarOverlayScaleTarget$delegate.getFloatValue();
        float floatValue2 = this.$prevAvatarOverlayScaleTarget$delegate.getFloatValue();
        fgk0 fgk0Var = this.$avatarOverlayState;
        iy40Var.setLongValue(floatValue > floatValue2 ? fgk0Var.b : fgk0Var.c);
        this.$prevAvatarOverlayScaleTarget$delegate.setFloatValue(this.$avatarOverlayScaleTarget$delegate.getFloatValue());
        return zy11.a;
    }
}
