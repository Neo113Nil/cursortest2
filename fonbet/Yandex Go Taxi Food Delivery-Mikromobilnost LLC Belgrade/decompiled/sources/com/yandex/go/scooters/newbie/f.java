package com.yandex.go.scooters.newbie;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersNewbieInitialModalButtonName;
import defpackage.d2o0;
import defpackage.e2o0;
import defpackage.jl40;
import defpackage.m950;
import defpackage.n1o0;
import defpackage.ny61;
import defpackage.p4g0;
import defpackage.qu;
import defpackage.qwo0;
import defpackage.qxm0;
import defpackage.tse0;
import defpackage.u1o0;
import defpackage.w511;
import defpackage.z1o0;
import defpackage.z7n0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final qxm0 a;
    public final qwo0 b;
    public final u1o0 c;

    public f(qxm0 qxm0Var, qwo0 qwo0Var, u1o0 u1o0Var) {
        this.a = qxm0Var;
        this.b = qwo0Var;
        this.c = u1o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e2o0 e2o0Var, z1o0 z1o0Var, ContinuationImpl continuationImpl) {
        ScootersNewbieUiActionInteractor$handleAction$1 scootersNewbieUiActionInteractor$handleAction$1;
        int i;
        int i2;
        zy11 zy11Var;
        n1o0 n1o0Var;
        if (continuationImpl instanceof ScootersNewbieUiActionInteractor$handleAction$1) {
            scootersNewbieUiActionInteractor$handleAction$1 = (ScootersNewbieUiActionInteractor$handleAction$1) continuationImpl;
            int i3 = scootersNewbieUiActionInteractor$handleAction$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersNewbieUiActionInteractor$handleAction$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersNewbieUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersNewbieUiActionInteractor$handleAction$1.label;
                i2 = 9;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean l = jl40.l(e2o0Var, d2o0.c);
                    qwo0 qwo0Var = this.b;
                    qxm0 qxm0Var = this.a;
                    if (l) {
                        qxm0Var.a.a("Scooters.Newbie.InitialModal.Opened", tse0.p(qxm0Var), 1, new HashMap());
                        qwo0Var.x.setValue(qwo0Var, qwo0.B[22], Boolean.TRUE);
                        return zy11Var;
                    }
                    if (!jl40.l(e2o0Var, d2o0.a)) {
                        if (!jl40.l(e2o0Var, d2o0.b)) {
                            w511.b();
                            return null;
                        }
                        ScootersAnalytics$ScootersNewbieInitialModalButtonName scootersAnalytics$ScootersNewbieInitialModalButtonName = ScootersAnalytics$ScootersNewbieInitialModalButtonName.Reject;
                        HashMap p = tse0.p(qxm0Var);
                        p.put("button_name", scootersAnalytics$ScootersNewbieInitialModalButtonName.getEventValue());
                        qxm0Var.a.a("Scooters.Newbie.InitialModal.Tapped", p, 1, new HashMap());
                        z1o0Var.a.r(new qu(i2));
                        return zy11Var;
                    }
                    ScootersAnalytics$ScootersNewbieInitialModalButtonName scootersAnalytics$ScootersNewbieInitialModalButtonName2 = ScootersAnalytics$ScootersNewbieInitialModalButtonName.Confirm;
                    HashMap p2 = tse0.p(qxm0Var);
                    p2.put("button_name", scootersAnalytics$ScootersNewbieInitialModalButtonName2.getEventValue());
                    qxm0Var.a.a("Scooters.Newbie.InitialModal.Tapped", p2, 1, new HashMap());
                    qwo0Var.y.setValue(qwo0Var, qwo0.B[23], Boolean.TRUE);
                    scootersNewbieUiActionInteractor$handleAction$1.L$0 = null;
                    scootersNewbieUiActionInteractor$handleAction$1.L$1 = z1o0Var;
                    scootersNewbieUiActionInteractor$handleAction$1.label = 1;
                    obj = this.c.a.b(scootersNewbieUiActionInteractor$handleAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1o0Var = (z1o0) scootersNewbieUiActionInteractor$handleAction$1.L$1;
                    kotlin.b.b(obj);
                }
                n1o0Var = (n1o0) obj;
                n1o0.b bVar = n1o0Var.e;
                String str = bVar != null ? bVar.f : null;
                if (n1o0Var.b || str == null || str.length() == 0) {
                    z1o0Var.a.r(new qu(i2));
                    return zy11Var;
                }
                d dVar = z1o0Var.a;
                dVar.A((m950) dVar.L.get(), new z7n0(str, false), new p4g0(dVar, 8));
                return zy11Var;
            }
        }
        scootersNewbieUiActionInteractor$handleAction$1 = new ScootersNewbieUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = scootersNewbieUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersNewbieUiActionInteractor$handleAction$1.label;
        i2 = 9;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        n1o0Var = (n1o0) obj2;
        n1o0.b bVar2 = n1o0Var.e;
        if (bVar2 != null) {
        }
        if (n1o0Var.b) {
        }
        z1o0Var.a.r(new qu(i2));
        return zy11Var;
    }
}
