package com.yandex.go.scooters.offers.v2;

import com.yandex.go.scooters.data.model.ScootersEboksObjectsSelectScooterAction;
import com.yandex.go.scooters.domain.w;
import defpackage.ad5;
import defpackage.ahn;
import defpackage.b3n0;
import defpackage.e2e0;
import defpackage.i5n0;
import defpackage.ljn0;
import defpackage.m0o0;
import defpackage.m6n0;
import defpackage.mxm0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q4o0;
import defpackage.qoo0;
import defpackage.qr40;
import defpackage.qxm0;
import defpackage.r7p0;
import defpackage.vgn;
import defpackage.w2o0;
import defpackage.y6p0;
import defpackage.ygn;
import defpackage.z2o0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f extends ad5 {
    public final n6n0 A;
    public final b3n0 B;
    public final m0o0 C;
    public final qoo0 D;
    public final qr40 E;
    public final i5n0 F;
    public final w G;
    public final z2o0 H;
    public final w2o0 I;
    public final com.yandex.go.scooters.offers.v2.domain.a J;
    public final ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.a K;
    public final y6p0 L;
    public final com.yandex.go.scooters.offers.v2.domain.b M;
    public final ljn0 N;
    public final q4o0 O;
    public final mxm0 P;
    public final com.yandex.go.scooters.driver_license_notification.domain.c Q;
    public pzt0 R;
    public final qxm0 x;
    public final e2e0 y;
    public final pwy0 z;

    public f(qxm0 qxm0Var, e2e0 e2e0Var, pwy0 pwy0Var, n6n0 n6n0Var, b3n0 b3n0Var, m0o0 m0o0Var, qoo0 qoo0Var, qr40 qr40Var, i5n0 i5n0Var, w wVar, z2o0 z2o0Var, w2o0 w2o0Var, com.yandex.go.scooters.offers.v2.domain.a aVar, ru.yandex.taxi.scooters.presentation.common.ui.alt_offer.a aVar2, y6p0 y6p0Var, com.yandex.go.scooters.offers.v2.domain.b bVar, ljn0 ljn0Var, q4o0 q4o0Var, mxm0 mxm0Var, com.yandex.go.scooters.driver_license_notification.domain.c cVar) {
        super(m6n0.class);
        this.x = qxm0Var;
        this.y = e2e0Var;
        this.z = pwy0Var;
        this.A = n6n0Var;
        this.B = b3n0Var;
        this.C = m0o0Var;
        this.D = qoo0Var;
        this.E = qr40Var;
        this.F = i5n0Var;
        this.G = wVar;
        this.H = z2o0Var;
        this.I = w2o0Var;
        this.J = aVar;
        this.K = aVar2;
        this.L = y6p0Var;
        this.M = bVar;
        this.N = ljn0Var;
        this.O = q4o0Var;
        this.P = mxm0Var;
        this.Q = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(f fVar, r7p0 r7p0Var, ContinuationImpl continuationImpl) {
        ScootersCardV2Presenter$changeVehicleOnMap$1 scootersCardV2Presenter$changeVehicleOnMap$1;
        int i;
        fVar.getClass();
        if (continuationImpl instanceof ScootersCardV2Presenter$changeVehicleOnMap$1) {
            scootersCardV2Presenter$changeVehicleOnMap$1 = (ScootersCardV2Presenter$changeVehicleOnMap$1) continuationImpl;
            int i2 = scootersCardV2Presenter$changeVehicleOnMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCardV2Presenter$changeVehicleOnMap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCardV2Presenter$changeVehicleOnMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCardV2Presenter$changeVehicleOnMap$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                vgn vgnVar = fVar.N.a;
                ahn ahnVar = vgnVar != null ? vgnVar.b : null;
                if (ahnVar != null) {
                    ygn ygnVar = new ygn(new ScootersEboksObjectsSelectScooterAction(r7p0Var.a, r7p0Var.b.k(), fVar.F.a()));
                    scootersCardV2Presenter$changeVehicleOnMap$1.L$0 = null;
                    scootersCardV2Presenter$changeVehicleOnMap$1.label = 1;
                    if (((com.yandex.go.eboks.objects.data.a) ahnVar).b(ygnVar, scootersCardV2Presenter$changeVehicleOnMap$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        scootersCardV2Presenter$changeVehicleOnMap$1 = new ScootersCardV2Presenter$changeVehicleOnMap$1(fVar, continuationImpl);
        Object obj2 = scootersCardV2Presenter$changeVehicleOnMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCardV2Presenter$changeVehicleOnMap$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.R;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.I.a.g(0);
    }

    public final void Lg() {
        pzt0 pzt0Var = this.R;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((m6n0) Dg()).o6();
    }
}
