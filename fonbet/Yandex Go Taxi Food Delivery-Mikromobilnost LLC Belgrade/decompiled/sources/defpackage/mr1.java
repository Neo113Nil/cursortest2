package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import com.yandex.go.chargers.discounts.discount_stations.ui.b;
import com.yandex.go.chargers.subscription.presentation.landing.c;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.scooters.passes.purchase.packages.f;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class mr1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ mr1(nae naeVar, sls slsVar, boolean z) {
        this.a = 21;
        this.w = naeVar;
        this.c = slsVar;
        this.b = z;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c530 c530Var = c530.a;
        int i2 = 9;
        int i3 = 5;
        o430 o430Var = did.a;
        boolean z = this.b;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jra1.d((List) obj4, (f530) obj3, z, (fid) obj, vng.O(49));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                a9b1.a(z, (f530) obj3, (a) obj4, (fid) obj, vng.O(433));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                b.c((n7u0) obj4, (tls) obj3, z, (fid) obj, vng.O(9));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                c.a((gta) obj4, (tls) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                akb1.b((CharSequence) obj4, z, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                m791.e(z, (bpb) obj4, (sls) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.c.b((String) obj4, (Integer) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                pav pavVar = (pav) obj4;
                tls tlsVar = (tls) obj3;
                View inflate = ((LayoutInflater) obj).inflate(qrh0.scooters_damage_item, (ViewGroup) obj2, false);
                int i4 = pfh0.image;
                GoImageView goImageView = (GoImageView) cma1.O(i4, inflate);
                if (goImageView != null) {
                    i4 = pfh0.remove;
                    GoImageButton goImageButton = (GoImageButton) cma1.O(i4, inflate);
                    if (goImageButton != null) {
                        return new ru.yandex.taxi.scooters.presentation.ontheway.damage.b(new xbn0((GoFrameLayout) inflate, goImageView, goImageButton), pavVar, z, tlsVar);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                return null;
            case 8:
                tgg tggVar = (tgg) obj4;
                g2q0 g2q0Var = (g2q0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                } else if (z) {
                    btsVar.e0(1126080899);
                    qti.c(null, null, true, wwg.S(-1909650500, true, new sgg(tggVar, g2q0Var), btsVar), btsVar, 3456, 3);
                    btsVar.t(false);
                } else {
                    btsVar.e0(1126243928);
                    tggVar.b(g2q0Var, btsVar, 0);
                    btsVar.t(false);
                }
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                mka1.a(z, (xj50) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                com.yandex.go.information.presentation.a.d(z, (List) obj4, (a) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                kww.e(z, (tls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                jl10 jl10Var = (jl10) obj4;
                wls wlsVar = (wls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.e0(-913082743);
                    btsVar2.t(false);
                    sb2.b(bfe.a.a(new ldc(z ? jl10Var.a : jl10Var.d)), wwg.S(-893579015, true, new cp1(wlsVar, i3), btsVar2), btsVar2, 56);
                    btsVar2.e0(-913082743);
                    btsVar2.t(false);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                mob1.a((String) obj4, (String) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                tls tlsVar2 = (tls) obj4;
                u540 u540Var = (u540) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean z2 = !z;
                    boolean k = btsVar3.k(tlsVar2);
                    Object Q = btsVar3.Q();
                    if (k || Q == o430Var) {
                        Q = new s140(i3, tlsVar2);
                        btsVar3.o0(Q);
                    }
                    ohb1.b(null, z2, null, (sls) Q, wwg.S(1067222746, true, new my8(z, u540Var, 8), btsVar3), btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 5);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                cpb1.b((nyy0) obj4, (f530) obj3, z, (fid) obj, vng.O(9));
                return zy11Var;
            case 16:
                tls tlsVar3 = (tls) obj4;
                czy0 czy0Var = (czy0) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean z3 = !z;
                    boolean k2 = btsVar4.k(tlsVar3) | btsVar4.e(czy0Var);
                    Object Q2 = btsVar4.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new ve30(12, tlsVar3, czy0Var);
                        btsVar4.o0(Q2);
                    }
                    ohb1.b(null, z3, null, (sls) Q2, wwg.S(-1623740152, true, new my8(z, czy0Var, i2), btsVar4), btsVar4, HProv.ALG_CLASS_DATA_ENCRYPT, 5);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                gxd0.a((sls) obj4, (String) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                sls slsVar = (sls) obj4;
                a37 a37Var = (a37) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    f530 e = ljs0.e(c530Var, 32.0f);
                    byk0 byk0Var = cyk0.a;
                    long g = ((el51) btsVar5.m(gl51.a)).g();
                    boolean k3 = btsVar5.k(slsVar);
                    Object Q3 = btsVar5.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new zvr(22, slsVar);
                        btsVar5.o0(Q3);
                    }
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q3, e, byk0Var, g, 0L, null, null, null, this.b, null, null, null, wwg.S(698031406, true, new pdf0(r8 ? 1 : 0, a37Var), btsVar5), btsVar5, 0, 384, 3824);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 19:
                u7k0 u7k0Var = (u7k0) obj4;
                xfd xfdVar = (xfd) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    com.yandex.go.taxi.summary.rida_summary.ui.a.a(u7k0Var, z, ((bgd) xfdVar).a, btsVar6, 0);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.summary.rida_summary.ui.a.a((u7k0) obj4, z, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                nae naeVar = (nae) obj4;
                sls slsVar2 = (sls) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    bce bceVar = naeVar.e;
                    if (bceVar instanceof zbe) {
                        btsVar7.e0(2138353192);
                        j76.f(null, null, null, 0.0f, new c36(((el51) btsVar7.m(gl51.a)).k(), 5), btsVar7, 0);
                        btsVar7.t(false);
                    } else if (bceVar instanceof ybe) {
                        btsVar7.e0(2138564302);
                        ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar2, null, null, 0L, 0L, null, this.b, null, null, null, wwg.S(487633413, true, new pdf0(17, naeVar), btsVar7), btsVar7, 0, 3838);
                        btsVar7.t(false);
                    } else {
                        if (!(bceVar instanceof ace)) {
                            throw unr0.y(-1177948127, btsVar7, false);
                        }
                        btsVar7.e0(2139170507);
                        j76.c(null, null, null, 0.0f, null, btsVar7, 0, 63);
                        btsVar7.t(false);
                    }
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 22:
                d41 d41Var = (d41) obj4;
                sls slsVar3 = (sls) obj3;
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (!btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    btsVar8.Y();
                } else if (d41Var.f || !z) {
                    btsVar8.e0(731809268);
                    j76.f(null, null, null, 0.0f, new c36(((el51) btsVar8.m(gl51.a)).k(), 5), btsVar8, 0);
                    btsVar8.t(false);
                } else {
                    btsVar8.e0(731975955);
                    if (d41Var.h) {
                        btsVar8.e0(732017743);
                        String e2 = ohb1.e(btsVar8, rzh0.common_delete);
                        cuj0 cuj0Var = new cuj0(ozg0.ic_delivery_delete, null, null, new zez0(((el51) btsVar8.m(gl51.a)).j()), 22);
                        boolean k4 = btsVar8.k(e2);
                        Object Q4 = btsVar8.Q();
                        Object obj5 = Q4;
                        if (k4 || Q4 == o430Var) {
                            dcc0 dcc0Var = new dcc0(e2, 20);
                            btsVar8.o0(dcc0Var);
                            obj5 = dcc0Var;
                        }
                        f530 b = fnq0.b(c530Var, false, (tls) obj5);
                        boolean k5 = btsVar8.k(slsVar3);
                        Object Q5 = btsVar8.Q();
                        Object obj6 = Q5;
                        if (k5 || Q5 == o430Var) {
                            n7l0 n7l0Var = new n7l0(1, slsVar3);
                            btsVar8.o0(n7l0Var);
                            obj6 = n7l0Var;
                        }
                        s3b1.f(cuj0Var, q791.d(b, false, null, null, (sls) obj6, 15), null, btsVar8, 0, 4);
                        btsVar8.t(false);
                    } else {
                        btsVar8.e0(732688583);
                        j76.c(null, null, null, 0.0f, null, btsVar8, 0, 63);
                        btsVar8.t(false);
                    }
                    btsVar8.t(false);
                }
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                fxa1.a((e47) obj4, z, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                f.h(vng.O(1), (fid) obj, (tls) obj3, (List) obj4, z);
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                f.g((l8o0) obj4, z, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                udb1.d((xss0) obj4, (tls) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                f1a1.c((String) obj4, z, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                ogb1.a((egu0) obj4, (tls) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                sgb1.a((viu0) obj4, (tls) obj3, z, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ mr1(Object obj, Object obj2, boolean z, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.c = obj2;
        this.b = z;
    }

    public /* synthetic */ mr1(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.w = obj;
        this.b = z;
        this.c = obj2;
    }

    public /* synthetic */ mr1(Object obj, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = z;
        this.c = obj2;
    }

    public /* synthetic */ mr1(boolean z, f530 f530Var, a aVar, int i) {
        this.a = 1;
        this.b = z;
        this.c = f530Var;
        this.w = aVar;
    }

    public /* synthetic */ mr1(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.w = obj;
        this.c = obj2;
    }

    public /* synthetic */ mr1(boolean z, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.w = obj;
        this.c = obj2;
    }
}
