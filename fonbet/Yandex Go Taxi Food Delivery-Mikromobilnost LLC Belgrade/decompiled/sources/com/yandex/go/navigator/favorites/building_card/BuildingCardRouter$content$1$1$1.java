package com.yandex.go.navigator.favorites.building_card;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ps6;
import defpackage.qu;
import defpackage.ts6;
import defpackage.tse;
import defpackage.us6;
import defpackage.vs6;
import defpackage.w511;
import defpackage.wls;
import defpackage.ws6;
import defpackage.xs6;
import defpackage.yd0;
import defpackage.ys6;
import defpackage.zs6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.building_card.BuildingCardRouter$content$1$1$1", f = "BuildingCardRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BuildingCardRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ys6 $action;
    final /* synthetic */ ps6 $innerNavigator;
    final /* synthetic */ zs6 $uiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildingCardRouter$content$1$1$1(zs6 zs6Var, ys6 ys6Var, ps6 ps6Var, Continuation continuation) {
        super(2, continuation);
        this.$uiActionInteractor = zs6Var;
        this.$action = ys6Var;
        this.$innerNavigator = ps6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuildingCardRouter$content$1$1$1(this.$uiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BuildingCardRouter$content$1$1$1 buildingCardRouter$content$1$1$1 = (BuildingCardRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        buildingCardRouter$content$1$1$1.invokeSuspend(zy11Var);
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
        zs6 zs6Var = this.$uiActionInteractor;
        ys6 ys6Var = this.$action;
        ps6 ps6Var = this.$innerNavigator;
        zs6Var.getClass();
        if (ys6Var instanceof ts6) {
            ps6Var.a.r(new qu(9));
        } else if (ys6Var instanceof us6) {
            ps6Var.a.r(new yd0(((us6) ys6Var).a, 6));
        } else if (ys6Var instanceof vs6) {
            ps6Var.a.r(new yd0(((vs6) ys6Var).a, 7));
        } else if (jl40.l(ys6Var, ws6.a)) {
            zs6Var.a.a();
        } else {
            if (!jl40.l(ys6Var, xs6.a)) {
                w511.b();
                return null;
            }
            zs6Var.b.a();
        }
        return zy11.a;
    }
}
