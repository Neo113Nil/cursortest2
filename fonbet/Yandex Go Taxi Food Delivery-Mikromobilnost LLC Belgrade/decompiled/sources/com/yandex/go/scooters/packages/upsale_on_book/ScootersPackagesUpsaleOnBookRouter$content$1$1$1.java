package com.yandex.go.scooters.packages.upsale_on_book;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName;
import defpackage.c21;
import defpackage.dbo0;
import defpackage.jao0;
import defpackage.jl40;
import defpackage.k3o0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n12;
import defpackage.ny61;
import defpackage.pzn0;
import defpackage.q8p0;
import defpackage.qao0;
import defpackage.qco0;
import defpackage.qu;
import defpackage.qxm0;
import defpackage.rao0;
import defpackage.sao0;
import defpackage.sco0;
import defpackage.sy60;
import defpackage.tao0;
import defpackage.tse;
import defpackage.tse0;
import defpackage.uao0;
import defpackage.vao0;
import defpackage.vj90;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.wao0;
import defpackage.wls;
import defpackage.xao0;
import defpackage.y5n0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.packages.upsale_on_book.ScootersPackagesUpsaleOnBookRouter$content$1$1$1", f = "ScootersPackagesUpsaleOnBookRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesUpsaleOnBookRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wao0 $action;
    final /* synthetic */ jao0 $innerNavigator;
    final /* synthetic */ xao0 $scootersPackagesUpsaleOnBookUiActionInteractor;
    final /* synthetic */ dbo0 $upsaleWindow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesUpsaleOnBookRouter$content$1$1$1(xao0 xao0Var, wao0 wao0Var, jao0 jao0Var, dbo0 dbo0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersPackagesUpsaleOnBookUiActionInteractor = xao0Var;
        this.$action = wao0Var;
        this.$innerNavigator = jao0Var;
        this.$upsaleWindow = dbo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesUpsaleOnBookRouter$content$1$1$1(this.$scootersPackagesUpsaleOnBookUiActionInteractor, this.$action, this.$innerNavigator, this.$upsaleWindow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersPackagesUpsaleOnBookRouter$content$1$1$1 scootersPackagesUpsaleOnBookRouter$content$1$1$1 = (ScootersPackagesUpsaleOnBookRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersPackagesUpsaleOnBookRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xao0 xao0Var = this.$scootersPackagesUpsaleOnBookUiActionInteractor;
        wao0 wao0Var = this.$action;
        jao0 jao0Var = this.$innerNavigator;
        dbo0 dbo0Var = this.$upsaleWindow;
        qxm0 qxm0Var = xao0Var.a;
        if (wao0Var instanceof vao0) {
            qxm0Var.a.a("Scooters.PackagesUpsale.Shown", tse0.p(qxm0Var), 1, new HashMap());
        } else if (wao0Var instanceof rao0) {
            jao0Var.a.r(new qu(9));
        } else {
            boolean z = wao0Var instanceof sao0;
            c21 c21Var = sy60.Q2;
            if (z) {
                y5n0 a = xao0Var.b.a();
                sco0 sco0Var = a != null ? a.j.a : null;
                qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
                if (qco0Var != null) {
                    Iterator it = qco0Var.h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((vj90) next).a, dbo0Var.a)) {
                            obj2 = next;
                            break;
                        }
                    }
                    vj90 vj90Var = (vj90) obj2;
                    if (vj90Var != null) {
                        String str = vj90Var.c;
                        List list = vj90Var.m;
                        n12 n12Var = jao0Var.a;
                        n12Var.A((m950) ((yvf0) n12Var.J).get(), new k3o0(str, list), c21Var);
                    }
                }
            } else if (wao0Var instanceof qao0) {
                ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName scootersAnalytics$ScootersPackagesUpsaleTappedButtonName = ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName.Disagree;
                HashMap p = tse0.p(qxm0Var);
                p.put("button_name", scootersAnalytics$ScootersPackagesUpsaleTappedButtonName.getEventValue());
                qxm0Var.a.a("Scooters.PackagesUpsale.Tapped", p, 1, new HashMap());
                jao0Var.a.r(new pzn0(15));
            } else if (wao0Var instanceof uao0) {
                ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName scootersAnalytics$ScootersPackagesUpsaleTappedButtonName2 = ScootersAnalytics$ScootersPackagesUpsaleTappedButtonName.Agree;
                HashMap p2 = tse0.p(qxm0Var);
                p2.put("button_name", scootersAnalytics$ScootersPackagesUpsaleTappedButtonName2.getEventValue());
                qxm0Var.a.a("Scooters.PackagesUpsale.Tapped", p2, 1, new HashMap());
                jao0Var.a.r(new pzn0(16));
            } else {
                if (!(wao0Var instanceof tao0)) {
                    w511.b();
                    return null;
                }
                String str2 = ((tao0) wao0Var).a;
                n12 n12Var2 = jao0Var.a;
                n12Var2.A((m950) ((yvf0) n12Var2.I).get(), new w8p0(new q8p0(str2, false), (com.yandex.go.scooters.mosru.b) null, 6), c21Var);
            }
        }
        return zy11.a;
    }
}
