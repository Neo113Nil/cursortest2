package com.yandex.go.scooters.offers.v2;

import defpackage.m6n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxm0;
import defpackage.r7p0;
import defpackage.tse;
import defpackage.tse0;
import defpackage.wls;
import defpackage.x6p0;
import defpackage.y6p0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.ScootersCardV2Presenter$handleVehicleActualPhoto$1", f = "ScootersCardV2Presenter.kt", l = {236}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardV2Presenter$handleVehicleActualPhoto$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isTooltipShown;
    final /* synthetic */ r7p0 $number;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardV2Presenter$handleVehicleActualPhoto$1(f fVar, r7p0 r7p0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$number = r7p0Var;
        this.$isTooltipShown = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardV2Presenter$handleVehicleActualPhoto$1(this.this$0, this.$number, this.$isTooltipShown, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardV2Presenter$handleVehicleActualPhoto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6p0 y6p0Var = this.this$0.L;
            r7p0 r7p0Var = this.$number;
            this.label = 1;
            obj = ((com.yandex.go.scooters.misc.vehicle_actual_photo.domain.a) y6p0Var).a(r7p0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        x6p0 x6p0Var = (x6p0) obj;
        f fVar = this.this$0;
        if (x6p0Var == null) {
            ((m6n0) fVar.Dg()).C0();
            ((m6n0) fVar.Dg()).F0();
        } else {
            boolean z = this.$isTooltipShown;
            qxm0 qxm0Var = fVar.x;
            qxm0Var.a.a("Scooters.VehicleActualPhotoButton.Shown", tse0.p(qxm0Var), 1, new HashMap());
            ((m6n0) fVar.Dg()).T(x6p0Var.b, x6p0Var.c, x6p0Var.a, x6p0Var.e);
            if (!z && (charSequence = x6p0Var.d) != null) {
                ((m6n0) fVar.Dg()).S(charSequence);
            }
        }
        return zy11.a;
    }
}
