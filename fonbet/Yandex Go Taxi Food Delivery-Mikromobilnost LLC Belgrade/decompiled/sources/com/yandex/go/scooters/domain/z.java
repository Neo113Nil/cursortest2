package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.domain.model.ScootersPreselectionException;
import defpackage.a22;
import defpackage.c430;
import defpackage.cq60;
import defpackage.jyx;
import defpackage.m5u0;
import defpackage.ny61;
import defpackage.p5u0;
import defpackage.rol0;
import defpackage.s5u0;
import defpackage.tyx;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.layers.api.StateRequirementsFailedType;

/* loaded from: classes13.dex */
public final class z {
    public final jyx a;
    public final tyx b;
    public final a22 c;

    public z(jyx jyxVar, tyx tyxVar, a22 a22Var) {
        this.a = jyxVar;
        this.b = tyxVar;
        this.c = a22Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(z zVar, ContinuationImpl continuationImpl) {
        ScootersPreselectionErrorInteractor$obtainPreselectionException$1 scootersPreselectionErrorInteractor$obtainPreselectionException$1;
        int i;
        cq60 cq60Var;
        c430 c430Var;
        a22 a22Var;
        List list;
        m5u0 m5u0Var;
        zVar.getClass();
        if (continuationImpl instanceof ScootersPreselectionErrorInteractor$obtainPreselectionException$1) {
            scootersPreselectionErrorInteractor$obtainPreselectionException$1 = (ScootersPreselectionErrorInteractor$obtainPreselectionException$1) continuationImpl;
            int i2 = scootersPreselectionErrorInteractor$obtainPreselectionException$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreselectionErrorInteractor$obtainPreselectionException$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreselectionErrorInteractor$obtainPreselectionException$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreselectionErrorInteractor$obtainPreselectionException$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n0 n0Var = zVar.b.b;
                    ScootersPreselectionErrorInteractor$obtainPreselectionException$2 scootersPreselectionErrorInteractor$obtainPreselectionException$2 = new ScootersPreselectionErrorInteractor$obtainPreselectionException$2(2, null);
                    scootersPreselectionErrorInteractor$obtainPreselectionException$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.x(n0Var, scootersPreselectionErrorInteractor$obtainPreselectionException$2, scootersPreselectionErrorInteractor$obtainPreselectionException$1);
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
                Pair pair = (Pair) obj;
                cq60Var = (cq60) pair.getFirst();
                c430Var = (c430) pair.getSecond();
                a22Var = zVar.c;
                a22Var.getClass();
                s5u0 s5u0Var = cq60Var.k;
                list = s5u0Var == null ? s5u0Var.a : null;
                if (list == null && (m5u0Var = (m5u0) kotlin.collections.a.R(list)) != null && m5u0Var.a == StateRequirementsFailedType.SELECTED_SCOOTER_UNAVAILABLE) {
                    p5u0 p5u0Var = m5u0Var.b;
                    return new ScootersPreselectionException(p5u0Var == null ? p5u0Var.a : null, p5u0Var != null ? p5u0Var.b : null);
                }
                return a22Var.b(cq60Var, c430Var);
            }
        }
        scootersPreselectionErrorInteractor$obtainPreselectionException$1 = new ScootersPreselectionErrorInteractor$obtainPreselectionException$1(zVar, continuationImpl);
        Object obj2 = scootersPreselectionErrorInteractor$obtainPreselectionException$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreselectionErrorInteractor$obtainPreselectionException$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        cq60Var = (cq60) pair2.getFirst();
        c430Var = (c430) pair2.getSecond();
        a22Var = zVar.c;
        a22Var.getClass();
        s5u0 s5u0Var2 = cq60Var.k;
        if (s5u0Var2 == null) {
        }
        if (list == null) {
            return a22Var.b(cq60Var, c430Var);
        }
        p5u0 p5u0Var2 = m5u0Var.b;
        return new ScootersPreselectionException(p5u0Var2 == null ? p5u0Var2.a : null, p5u0Var2 != null ? p5u0Var2.b : null);
    }

    public final kotlinx.coroutines.flow.internal.h b() {
        return kotlinx.coroutines.flow.e.K(new rol0(new ScootersPreselectionErrorInteractor$listenToScooterPreselectionError$1(this, null)), new rol0(new ScootersPreselectionErrorInteractor$waitForNoSelectedObjectError$1(this, null)));
    }
}
