package com.yandex.go.safety.center;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.experiment.p;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.gqc;
import defpackage.h55;
import defpackage.itl0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.otl0;
import defpackage.p2y0;
import defpackage.qmp;
import defpackage.sul0;
import defpackage.tje;
import defpackage.ul51;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes13.dex */
public final class k extends h55 {
    public final qmp D;
    public final p2y0 E;
    public final gqc F;
    public final yvf0 G;
    public final p H;

    public k(qmp qmpVar, p2y0 p2y0Var, gqc gqcVar, yvf0 yvf0Var, p pVar) {
        super(null);
        this.D = qmpVar;
        this.E = p2y0Var;
        this.F = gqcVar;
        this.G = yvf0Var;
        this.H = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(k kVar, SafetyCenterExperiment safetyCenterExperiment, String str, SafetyCenterParams$Source safetyCenterParams$Source, ContinuationImpl continuationImpl) {
        SafetyCenterRootRouterImpl$launchWebSafetyCenter$1 safetyCenterRootRouterImpl$launchWebSafetyCenter$1;
        int i;
        boolean z;
        DriveState c;
        kVar.getClass();
        if (continuationImpl instanceof SafetyCenterRootRouterImpl$launchWebSafetyCenter$1) {
            safetyCenterRootRouterImpl$launchWebSafetyCenter$1 = (SafetyCenterRootRouterImpl$launchWebSafetyCenter$1) continuationImpl;
            int i2 = safetyCenterRootRouterImpl$launchWebSafetyCenter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterRootRouterImpl$launchWebSafetyCenter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterRootRouterImpl$launchWebSafetyCenter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterRootRouterImpl$launchWebSafetyCenter$1.label;
                zy11 zy11Var = zy11.a;
                z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (safetyCenterExperiment.p == null) {
                        return zy11Var;
                    }
                    if (safetyCenterParams$Source == SafetyCenterParams$Source.ORDER_CARD && str != null) {
                        p2y0 p2y0Var = kVar.E;
                        safetyCenterRootRouterImpl$launchWebSafetyCenter$1.L$0 = safetyCenterExperiment;
                        safetyCenterRootRouterImpl$launchWebSafetyCenter$1.L$1 = str;
                        safetyCenterRootRouterImpl$launchWebSafetyCenter$1.L$2 = safetyCenterParams$Source;
                        safetyCenterRootRouterImpl$launchWebSafetyCenter$1.label = 1;
                        obj = ((e0) p2y0Var).p(str, safetyCenterRootRouterImpl$launchWebSafetyCenter$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    kVar.A((m950) kVar.F.get(), new sul0(str, !z, safetyCenterExperiment, safetyCenterParams$Source), new otl0(kVar, 1));
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                safetyCenterParams$Source = (SafetyCenterParams$Source) safetyCenterRootRouterImpl$launchWebSafetyCenter$1.L$2;
                String str2 = (String) safetyCenterRootRouterImpl$launchWebSafetyCenter$1.L$1;
                SafetyCenterExperiment safetyCenterExperiment2 = (SafetyCenterExperiment) safetyCenterRootRouterImpl$launchWebSafetyCenter$1.L$0;
                kotlin.b.b(obj);
                str = str2;
                safetyCenterExperiment = safetyCenterExperiment2;
                o2y0 o2y0Var = (o2y0) obj;
                c = o2y0Var != null ? o2y0Var.c() : null;
                if (c != null && c.compareTo(DriveState.TRANSPORTING) >= 0) {
                    z = true;
                }
                kVar.A((m950) kVar.F.get(), new sul0(str, !z, safetyCenterExperiment, safetyCenterParams$Source), new otl0(kVar, 1));
                return zy11Var;
            }
        }
        safetyCenterRootRouterImpl$launchWebSafetyCenter$1 = new SafetyCenterRootRouterImpl$launchWebSafetyCenter$1(kVar, continuationImpl);
        Object obj2 = safetyCenterRootRouterImpl$launchWebSafetyCenter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterRootRouterImpl$launchWebSafetyCenter$1.label;
        zy11 zy11Var2 = zy11.a;
        z = false;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (o2y0Var2 != null) {
        }
        if (c != null) {
            z = true;
        }
        kVar.A((m950) kVar.F.get(), new sul0(str, !z, safetyCenterExperiment, safetyCenterParams$Source), new otl0(kVar, 1));
        return zy11Var2;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ((ul51) this.D).getClass();
        tje.N(o(), null, null, new SafetyCenterRootRouterImpl$onLaunch$1(this, (itl0) obj, null), 3);
    }
}
