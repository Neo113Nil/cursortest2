package defpackage;

import android.view.View;
import androidx.compose.animation.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.input.InputState;
import com.yandex.go.summary.navigation.e;
import defpackage.aw9;
import defpackage.bts;
import defpackage.bw9;
import defpackage.cw9;
import defpackage.did;
import defpackage.dw9;
import defpackage.fid;
import defpackage.iv9;
import defpackage.jl40;
import defpackage.ohb1;
import defpackage.phb1;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.yv9;
import defpackage.zpn;
import defpackage.zr9;
import defpackage.zv9;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes5.dex */
public final /* synthetic */ class gv9 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ gv9(ldc ldcVar, tls tlsVar, boolean z, sls slsVar) {
        this.a = 4;
        this.c = ldcVar;
        this.x = tlsVar;
        this.b = z;
        this.w = slsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Throwable th;
        int i;
        zy11 zy11Var;
        int i2 = this.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var2 = zy11.a;
        Object obj5 = this.x;
        Object obj6 = this.w;
        Object obj7 = this.c;
        switch (i2) {
            case 0:
                dw9 dw9Var = (dw9) obj7;
                final oip0 oip0Var = (oip0) obj6;
                final tls tlsVar = (tls) obj5;
                j690 j690Var = (j690) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    th = null;
                    intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
                } else {
                    th = null;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
                    f530 j = an91.j(bzk0.c(ljs0.c(c530Var, 1.0f), this.b ? AppColor$Palette.CardDivider : AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), j690Var);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, j);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw th;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    Object Q = btsVar.Q();
                    if (Q == o430Var) {
                        Q = new jv8(27);
                        btsVar.o0(Q);
                    }
                    tls tlsVar2 = (tls) Q;
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new jv8(28);
                        btsVar.o0(Q2);
                    }
                    a.b(dw9Var, null, tlsVar2, null, "chargers_discounts_content", (tls) Q2, wwg.S(1502467225, true, new bms() { // from class: com.yandex.go.chargers.discounts.list.ui.a
                        @Override // defpackage.bms
                        public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                            dw9 dw9Var2 = (dw9) obj9;
                            fid fidVar2 = (fid) obj10;
                            int intValue2 = ((Integer) obj11).intValue();
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= (intValue2 & 64) == 0 ? ((bts) fidVar2).k(dw9Var2) : fidVar2.e(dw9Var2) ? 32 : 16;
                            }
                            boolean z = true;
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                                btsVar2.Y();
                            } else if (jl40.l(dw9Var2, cw9.a)) {
                                btsVar2.e0(2146997703);
                                iv9.c(btsVar2, 0);
                                btsVar2.t(false);
                            } else {
                                boolean z2 = dw9Var2 instanceof yv9;
                                tls tlsVar3 = tlsVar;
                                if (z2) {
                                    btsVar2.e0(2147121486);
                                    ohb1.a(oip0Var, (yv9) dw9Var2, tlsVar3, null, btsVar2, intValue2 & 112);
                                    btsVar2.t(false);
                                } else if (dw9Var2 instanceof aw9) {
                                    btsVar2.e0(2147297163);
                                    phb1.a((aw9) dw9Var2, tlsVar3, null, btsVar2, (intValue2 >> 3) & 14);
                                    btsVar2.t(false);
                                } else if (dw9Var2 instanceof bw9) {
                                    btsVar2.e0(2147448381);
                                    iv9.c(btsVar2, 0);
                                    boolean k = btsVar2.k(tlsVar3);
                                    if ((intValue2 & 112) != 32 && ((intValue2 & 64) == 0 || !btsVar2.e(dw9Var2))) {
                                        z = false;
                                    }
                                    boolean z3 = k | z;
                                    Object Q3 = btsVar2.Q();
                                    if (z3 || Q3 == did.a) {
                                        Q3 = new ChargersDiscountsListScreenKt$ChargersDiscountsListScreen$4$1$3$1$1(tlsVar3, dw9Var2, null);
                                        btsVar2.o0(Q3);
                                    }
                                    zpn.e(btsVar2, (wls) Q3, dw9Var2);
                                    btsVar2.t(false);
                                } else {
                                    if (!(dw9Var2 instanceof zv9)) {
                                        throw unr0.y(761993316, btsVar2, false);
                                    }
                                    btsVar2.e0(-2147263692);
                                    zr9.a(((zv9) dw9Var2).a, btsVar2, 0);
                                    btsVar2.t(false);
                                }
                            }
                            return zy11.a;
                        }
                    }, btsVar), btsVar, 1794432, 10);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var2;
            case 1:
                e eVar = (e) obj7;
                tfx tfxVar = (tfx) obj6;
                hnr0 hnr0Var = (hnr0) obj5;
                xfd xfdVar = (xfd) obj;
                zqv0 zqv0Var = (zqv0) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = ((intValue2 & 8) == 0 ? ((bts) fidVar2).k(xfdVar) : fidVar2.e(xfdVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((bts) fidVar2).k(zqv0Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i & 1, (i & 147) != 146)) {
                    fva0 a = f4z.a();
                    View view = (View) btsVar2.m(AndroidCompositionLocals_androidKt.f);
                    boolean k = btsVar2.k(view);
                    Object Q3 = btsVar2.Q();
                    Object obj8 = Q3;
                    if (k || Q3 == o430Var) {
                        View rootView = view.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        xva0 xva0Var = (xva0) tag;
                        btsVar2.o0(xva0Var);
                        obj8 = xva0Var;
                    }
                    xva0 xva0Var2 = (xva0) obj8;
                    Object Q4 = btsVar2.Q();
                    if (Q4 == o430Var) {
                        fva0.f(a, "SummaryScreenCompose", PerformanceAnalytics$Type.Inflate, 0L, 4);
                        yuf0 yuf0Var = xva0Var2.a;
                        if (yuf0Var != null) {
                            yuf0Var.I("SummaryScreenCompose");
                            zy11Var = zy11Var2;
                        } else {
                            zy11Var = null;
                        }
                        btsVar2.o0(zy11Var);
                        Q4 = zy11Var;
                    }
                    boolean e = btsVar2.e(eVar);
                    Object Q5 = btsVar2.Q();
                    Object obj9 = Q5;
                    if (e || Q5 == o430Var) {
                        juc jucVar = new juc(eVar);
                        btsVar2.o0(jucVar);
                        obj9 = jucVar;
                    }
                    hpb1.a((sls) obj9, wwg.S(-994248887, true, new hc0(zqv0Var, this.b, xfdVar, tfxVar, hnr0Var), btsVar2), btsVar2, 48);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 2:
                uu21 uu21Var = (uu21) obj7;
                u5t0 u5t0Var = (u5t0) obj6;
                oz40 oz40Var = (oz40) obj5;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    boolean k2 = btsVar3.k(u5t0Var) | btsVar3.k(oz40Var);
                    Object Q6 = btsVar3.Q();
                    if (k2 || Q6 == o430Var) {
                        Q6 = new bdp(r14 ? 1 : 0, u5t0Var, oz40Var);
                        btsVar3.o0(Q6);
                    }
                    r5a1.b(uu21Var, this.b, (sls) Q6, btsVar3, 0, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var2;
            case 3:
                byk0 byk0Var = (byk0) obj7;
                x700 x700Var = (x700) obj6;
                tls tlsVar3 = (tls) obj5;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    com.yandex.go.navigator.main_screen.ui.a.c(bzk0.c(c530Var, AppColor$Palette.Background, byk0Var), this.b, x700Var, tlsVar3, btsVar4, 512);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 4:
                ldc ldcVar = (ldc) obj7;
                tls tlsVar4 = (tls) obj5;
                sls slsVar2 = (sls) obj6;
                tys0 tys0Var = (tys0) obj2;
                fid fidVar5 = (fid) obj3;
                ((Integer) obj4).getClass();
                if (tys0Var instanceof sys0) {
                    bts btsVar5 = (bts) fidVar5;
                    btsVar5.e0(-787158392);
                    ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.a.a(ldcVar, btsVar5, 0);
                    btsVar5.t(false);
                } else if (tys0Var instanceof rys0) {
                    bts btsVar6 = (bts) fidVar5;
                    btsVar6.e0(-787017621);
                    rys0 rys0Var = (rys0) tys0Var;
                    xz91.a(rys0Var.c, rys0Var.a, rys0Var.b, tlsVar4, btsVar6, 8);
                    btsVar6.t(false);
                } else {
                    if (!(tys0Var instanceof qys0)) {
                        throw unr0.y(251701261, (bts) fidVar5, false);
                    }
                    bts btsVar7 = (bts) fidVar5;
                    btsVar7.e0(-786661493);
                    qys0 qys0Var = (qys0) tys0Var;
                    mz91.a(qys0Var.a, qys0Var.b, this.b, qys0Var.c, qys0Var.e, qys0Var.d, slsVar2, tlsVar4, btsVar7, 0);
                    btsVar7.t(false);
                }
                return zy11Var2;
            default:
                nvi0 nvi0Var = (nvi0) obj7;
                nvi0 nvi0Var2 = (nvi0) obj6;
                au2 au2Var = (au2) obj5;
                InputState inputState = (InputState) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                if ((intValue5 & 48) == 0) {
                    intValue5 |= fidVar6.c(inputState.ordinal()) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar6;
                if (btsVar8.V(intValue5 & 1, (intValue5 & 145) != 144)) {
                    ru.yandex.taxi.masstransit.ui.a.b(k7b1.f(inputState), this.b, nvi0Var, nvi0Var2, au2Var, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
        }
    }

    public /* synthetic */ gv9(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.w = obj2;
        this.x = obj3;
    }

    public /* synthetic */ gv9(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
    }
}
