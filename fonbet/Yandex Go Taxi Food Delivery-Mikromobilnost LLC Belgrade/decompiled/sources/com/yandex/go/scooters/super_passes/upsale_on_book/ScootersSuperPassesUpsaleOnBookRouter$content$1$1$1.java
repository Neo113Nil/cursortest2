package com.yandex.go.scooters.super_passes.upsale_on_book;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName;
import defpackage.b2p0;
import defpackage.h2p0;
import defpackage.i2p0;
import defpackage.j2p0;
import defpackage.jl40;
import defpackage.k2p0;
import defpackage.lrm0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q8p0;
import defpackage.qu;
import defpackage.qxm0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.tse0;
import defpackage.tyo0;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.super_passes.upsale_on_book.ScootersSuperPassesUpsaleOnBookRouter$content$1$1$1", f = "ScootersSuperPassesUpsaleOnBookRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesUpsaleOnBookRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ j2p0 $action;
    final /* synthetic */ b2p0 $innerNavigator;
    final /* synthetic */ k2p0 $scootersSuperPassesUpsaleOnBookUiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesUpsaleOnBookRouter$content$1$1$1(k2p0 k2p0Var, j2p0 j2p0Var, b2p0 b2p0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersSuperPassesUpsaleOnBookUiActionInteractor = k2p0Var;
        this.$action = j2p0Var;
        this.$innerNavigator = b2p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSuperPassesUpsaleOnBookRouter$content$1$1$1(this.$scootersSuperPassesUpsaleOnBookUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersSuperPassesUpsaleOnBookRouter$content$1$1$1 scootersSuperPassesUpsaleOnBookRouter$content$1$1$1 = (ScootersSuperPassesUpsaleOnBookRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersSuperPassesUpsaleOnBookRouter$content$1$1$1.invokeSuspend(zy11Var);
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
        k2p0 k2p0Var = this.$scootersSuperPassesUpsaleOnBookUiActionInteractor;
        j2p0 j2p0Var = this.$action;
        b2p0 b2p0Var = this.$innerNavigator;
        qxm0 qxm0Var = k2p0Var.a;
        if (jl40.l(j2p0Var, h2p0.d)) {
            qxm0Var.a.a("Scooters.SuperpassUpsale.Shown", tse0.p(qxm0Var), 1, new HashMap());
        } else if (jl40.l(j2p0Var, h2p0.b)) {
            b2p0Var.a.r(new qu(9));
        } else if (jl40.l(j2p0Var, h2p0.a)) {
            ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName = ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName.Disagree;
            HashMap p = tse0.p(qxm0Var);
            p.put("button_name", scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName.getEventValue());
            qxm0Var.a.a("Scooters.SuperpassUpsale.Tapped", p, 1, new HashMap());
            b2p0Var.a.r(new tyo0(4));
        } else if (jl40.l(j2p0Var, h2p0.c)) {
            ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName2 = ScootersAnalytics$ScootersSuperpassUpsaleTappedButtonName.Agree;
            HashMap p2 = tse0.p(qxm0Var);
            p2.put("button_name", scootersAnalytics$ScootersSuperpassUpsaleTappedButtonName2.getEventValue());
            qxm0Var.a.a("Scooters.SuperpassUpsale.Tapped", p2, 1, new HashMap());
            b2p0Var.a.r(new tyo0(5));
        } else {
            if (!(j2p0Var instanceof i2p0)) {
                w511.b();
                return null;
            }
            String str = ((i2p0) j2p0Var).a;
            lrm0 lrm0Var = b2p0Var.a;
            lrm0Var.A((m950) lrm0Var.I.get(), new w8p0(new q8p0(str, false), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
        }
        return zy11.a;
    }
}
