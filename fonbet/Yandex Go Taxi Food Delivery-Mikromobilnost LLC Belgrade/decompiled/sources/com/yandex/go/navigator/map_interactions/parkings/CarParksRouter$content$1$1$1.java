package com.yandex.go.navigator.map_interactions.parkings;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.map_interactions.parkings.analytics.NavigatorCarParksAnalytics$CarParkCardButtonType;
import defpackage.b68;
import defpackage.f68;
import defpackage.g68;
import defpackage.h68;
import defpackage.i68;
import defpackage.j68;
import defpackage.jl40;
import defpackage.k68;
import defpackage.l68;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.parkings.CarParksRouter$content$1$1$1", f = "CarParksRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarParksRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ k68 $action;
    final /* synthetic */ l68 $carParksUiActionInteractor;
    final /* synthetic */ b68 $innerNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarParksRouter$content$1$1$1(l68 l68Var, k68 k68Var, b68 b68Var, Continuation continuation) {
        super(2, continuation);
        this.$carParksUiActionInteractor = l68Var;
        this.$action = k68Var;
        this.$innerNavigator = b68Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarParksRouter$content$1$1$1(this.$carParksUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CarParksRouter$content$1$1$1 carParksRouter$content$1$1$1 = (CarParksRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        carParksRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        l68 l68Var = this.$carParksUiActionInteractor;
        k68 k68Var = this.$action;
        b68 b68Var = this.$innerNavigator;
        if (k68Var instanceof f68) {
            l68Var.c.d();
            b68Var.b.r(new qu(9));
        } else {
            l68Var.getClass();
            if (k68Var instanceof g68) {
                Address address = ((g68) k68Var).a;
                e eVar = b68Var.b;
                eVar.H.e(NavigatorCarParksAnalytics$CarParkCardButtonType.GoHere, b68Var.a);
                eVar.r(new yd0(address, 9));
            } else if (k68Var instanceof h68) {
                Address address2 = ((h68) k68Var).a;
                e eVar2 = b68Var.b;
                eVar2.H.e(NavigatorCarParksAnalytics$CarParkCardButtonType.GoVia, b68Var.a);
                eVar2.r(new yd0(address2, 8));
            } else if (jl40.l(k68Var, i68.a)) {
                l68Var.a.a();
            } else {
                if (!jl40.l(k68Var, j68.a)) {
                    w511.b();
                    return null;
                }
                l68Var.b.a();
            }
        }
        return zy11.a;
    }
}
