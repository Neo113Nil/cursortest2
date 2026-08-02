package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import com.yandex.go.scooters.data.ScootersConfigApi;
import com.yandex.go.scooters.data.ScootersSettingsApi;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import defpackage.abn0;
import defpackage.ah00;
import defpackage.av4;
import defpackage.b4p0;
import defpackage.blh;
import defpackage.c0g;
import defpackage.dvw;
import defpackage.h7n0;
import defpackage.i6r;
import defpackage.j18;
import defpackage.jwf;
import defpackage.m7n0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.p7g;
import defpackage.q1b1;
import defpackage.q5z;
import defpackage.qwo0;
import defpackage.r95;
import defpackage.rqo;
import defpackage.s6n0;
import defpackage.si3;
import defpackage.tt2;
import defpackage.ukn0;
import defpackage.v1o0;
import defpackage.w030;
import defpackage.w6n0;
import defpackage.xdf;
import defpackage.xvf0;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.yun0;
import defpackage.z2o0;
import defpackage.zy11;
import defpackage.zzf;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class e extends r95 {
    public final n6n0 b;
    public final y5p0 c;
    public final s6n0 d;
    public final z2o0 e;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a f;

    public e(n6n0 n6n0Var, y5p0 y5p0Var, s6n0 s6n0Var, z2o0 z2o0Var, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar) {
        this.b = n6n0Var;
        this.c = y5p0Var;
        this.d = s6n0Var;
        this.e = z2o0Var;
        this.f = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0234, code lost:
    
        if (com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(r4, r0, r2) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersOnboardingBookHandler$handle$1 scootersOnboardingBookHandler$handle$1;
        int i;
        Object obj;
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        y5n0 y5n0Var;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersOnboardingBookHandler$handle$1) {
            scootersOnboardingBookHandler$handle$1 = (ScootersOnboardingBookHandler$handle$1) continuationImpl;
            int i2 = scootersOnboardingBookHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOnboardingBookHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersOnboardingBookHandler$handle$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOnboardingBookHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    y5n0 a = this.e.a();
                    b4p0 a2 = this.c.a();
                    String str = a2 != null ? a2.i : null;
                    if (a == null || !a.b) {
                        obj = null;
                    } else {
                        if (str != null) {
                            this.d.a(ScootersCardV2Analytics$CardButton.ONBOARDING);
                            ScootersVehicleType scootersVehicleType = q1b1.d(a.j).c;
                            com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar2 = this.f;
                            y5n0 a3 = aVar2.a.a();
                            scootersOnboardingBookHandler$handle$1.L$0 = null;
                            scootersOnboardingBookHandler$handle$1.L$1 = null;
                            scootersOnboardingBookHandler$handle$1.L$2 = null;
                            scootersOnboardingBookHandler$handle$1.L$3 = aVar2;
                            scootersOnboardingBookHandler$handle$1.L$4 = a3;
                            scootersOnboardingBookHandler$handle$1.label = 1;
                            j18 j18Var = new j18(1, dvw.b(scootersOnboardingBookHandler$handle$1));
                            j18Var.u();
                            si3 si3Var = new si3(j18Var, 13);
                            h7n0 h7n0Var = (h7n0) this.b;
                            com.yandex.go.scooters.offers.v2.g gVar = h7n0Var.b;
                            jwf T = gVar.T(h7n0Var.a);
                            p7g p7gVar = (p7g) T.k;
                            i6r i6rVar = p7gVar.a;
                            ru.yandex.taxi.widget.utils.e A2 = ((c0g) i6rVar).A2();
                            q5z.h(A2);
                            c0g c0gVar = (c0g) i6rVar;
                            w030 C2 = c0gVar.C2();
                            zzf zzfVar = c0gVar.z;
                            q5z.h(C2);
                            y5p0 y5p0Var = (y5p0) ((xvf0) T.b).get();
                            qwo0 qwo0Var = (qwo0) p7gVar.e.get();
                            com.yandex.go.scooters.domain.c cVar = new com.yandex.go.scooters.domain.c((qwo0) p7gVar.e.get(), (ukn0) p7gVar.p2.get(), (yun0) p7gVar.n5.get());
                            com.yandex.go.scooters.data.c cVar2 = new com.yandex.go.scooters.data.c((ScootersSettingsApi) p7gVar.K1.get(), zzfVar.o1());
                            r P2 = c0gVar.P2();
                            ru.yandex.taxi.scooters.data.h hVar = (ru.yandex.taxi.scooters.data.h) zzfVar.U3.get();
                            q5z.h(hVar);
                            xdf g2 = c0gVar.g2();
                            q5z.h(g2);
                            ru.yandex.taxi.widget.c r2 = c0gVar.r2();
                            q5z.h(r2);
                            ru.yandex.taxi.scooters.data.h hVar2 = (ru.yandex.taxi.scooters.data.h) zzfVar.U3.get();
                            q5z.h(hVar2);
                            rqo l2 = ((c0g) i6rVar).l2();
                            q5z.h(l2);
                            com.yandex.go.scooters.insurance.data.b bVar = new com.yandex.go.scooters.insurance.data.b(g2, r2, hVar2, new m7n0(l2));
                            com.yandex.go.scooters.insurance.data.a aVar3 = (com.yandex.go.scooters.insurance.data.a) p7gVar.P1.get();
                            rqo l22 = ((c0g) i6rVar).l2();
                            q5z.h(l22);
                            com.yandex.go.scooters.domain.r rVar = new com.yandex.go.scooters.domain.r(cVar2, P2, hVar, bVar, aVar3, new m7n0(l22));
                            ah00 z2 = c0gVar.z2();
                            q5z.h(z2);
                            ScootersConfigApi scootersConfigApi = (ScootersConfigApi) p7gVar.o5.get();
                            ru.yandex.taxi.scooters.data.a o1 = zzfVar.o1();
                            abn0 abn0Var = (abn0) zzfVar.v.get();
                            q5z.h(abn0Var);
                            blh k = zzfVar.k();
                            tt2 Z1 = c0gVar.Z1();
                            q5z.h(Z1);
                            gVar.A(new com.yandex.go.scooters.offers.v2.newbie_guide.b(A2, C2, y5p0Var, qwo0Var, cVar, rVar, new com.yandex.go.scooters.data.f(new com.yandex.go.scooters.data.b(z2, scootersConfigApi, o1, abn0Var, k, Z1)), (av4) T.p, p7gVar.U1, p7gVar.f1), new v1o0(str, scootersVehicleType), new w6n0(si3Var));
                            obj2 = j18Var.s();
                            if (obj2 != obj3) {
                                aVar = aVar2;
                                y5n0Var = a3;
                            }
                        }
                        obj = null;
                    }
                    scootersOnboardingBookHandler$handle$1.L$0 = obj;
                    scootersOnboardingBookHandler$handle$1.L$1 = obj;
                    scootersOnboardingBookHandler$handle$1.label = 3;
                    Object a4 = super.a(scootersOnboardingBookHandler$handle$1);
                    return a4 == obj3 ? obj3 : a4;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                y5n0Var = (y5n0) scootersOnboardingBookHandler$handle$1.L$4;
                aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) scootersOnboardingBookHandler$handle$1.L$3;
                kotlin.b.b(obj2);
                booleanValue = ((Boolean) obj2).booleanValue();
                if (booleanValue) {
                    scootersOnboardingBookHandler$handle$1.L$0 = null;
                    scootersOnboardingBookHandler$handle$1.L$1 = null;
                    scootersOnboardingBookHandler$handle$1.L$2 = null;
                    scootersOnboardingBookHandler$handle$1.L$3 = null;
                    scootersOnboardingBookHandler$handle$1.L$4 = null;
                    scootersOnboardingBookHandler$handle$1.Z$0 = booleanValue;
                    scootersOnboardingBookHandler$handle$1.label = 2;
                }
                return zy11.a;
            }
        }
        scootersOnboardingBookHandler$handle$1 = new ScootersOnboardingBookHandler$handle$1(this, continuationImpl);
        Object obj22 = scootersOnboardingBookHandler$handle$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOnboardingBookHandler$handle$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj22).booleanValue();
        if (booleanValue) {
        }
        return zy11.a;
    }
}
