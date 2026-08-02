package com.yandex.go.scooters.offers.v2.components.header;

import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;
import defpackage.b5n0;
import defpackage.k4o0;
import defpackage.l4o0;
import defpackage.m4o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4o0;
import defpackage.pxm0;
import defpackage.q4o0;
import defpackage.qke;
import defpackage.r7p0;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import defpackage.zzs;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.HapticController$Effect;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.header.ScootersCardHeaderComponentPresenter$removeVehicle$1", f = "ScootersCardHeaderComponentPresenter.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardHeaderComponentPresenter$removeVehicle$1 extends SuspendLambda implements wls {
    final /* synthetic */ r7p0 $number;
    int label;
    final /* synthetic */ b5n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardHeaderComponentPresenter$removeVehicle$1(b5n0 b5n0Var, r7p0 r7p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b5n0Var;
        this.$number = r7p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardHeaderComponentPresenter$removeVehicle$1(this.this$0, this.$number, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardHeaderComponentPresenter$removeVehicle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            q4o0 q4o0Var = this.this$0.C;
            o4o0 a = q4o0Var.a();
            r7p0 r7p0Var = this.$number;
            if (a instanceof l4o0) {
                zgz.a("ParkingPresentationState is unchangeable", new IllegalStateException());
            } else if (a instanceof k4o0) {
                LinkedHashSet f = v4r0.f(((k4o0) a).d, r7p0Var);
                r7p0 r7p0Var2 = (r7p0) kotlin.collections.a.t0(f);
                zzs zzsVar = a.a;
                ScootersOffersPresentationState$LaunchContext scootersOffersPresentationState$LaunchContext = a.b;
                pxm0 pxm0Var = a.c;
                a = r7p0Var2 != null ? new m4o0(zzsVar, scootersOffersPresentationState$LaunchContext, pxm0Var, r7p0Var2) : new k4o0(zzsVar, scootersOffersPresentationState$LaunchContext, pxm0Var, f);
            } else {
                if (!(a instanceof m4o0)) {
                    w511.b();
                    return null;
                }
                zgz.a("SingleScooterPresentationState can not be without numbew", new IllegalStateException());
            }
            this.label = 1;
            ((r0) q4o0Var.a).emit(a, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        qke.E(this.this$0.x, HapticController$Effect.CLICK_MEDIUM, false, 12);
        return zy11Var;
    }
}
