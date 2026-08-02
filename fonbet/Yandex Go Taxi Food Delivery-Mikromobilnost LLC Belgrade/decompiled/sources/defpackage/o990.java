package defpackage;

import android.animation.Animator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.tooling.PreviewActivity;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.c;
import com.yandex.go.shortcuts.impl.view.adapter.o;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.u;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final /* synthetic */ class o990 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o990(dof0 dof0Var, ibp0 ibp0Var) {
        this.a = 10;
        this.b = dof0Var;
        this.c = ibp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [f530] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 parameterizedContent$lambda$0$1;
        Animator combinedAnimator$lambda$14;
        int i = this.a;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.d((x990) obj4, (q990) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.payment_method_selector.ui.a.d((p7a0) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                kf91.a((f530) obj4, (sda0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                ((rza0) obj4).c((Permission[]) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                bu8 bu8Var = (bu8) obj4;
                String str = (String) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(bu8Var, ljs0.e(ljs0.c(an91.k(c530Var, 16.0f), 1.0f), 56.0f), ((YandexShapes) btsVar.m(qm51.a)).b(), 0L, 0L, null, false, null, null, null, wwg.S(1933422734, true, new jk30(str, 9), btsVar), btsVar, 0, 4088);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 5:
                pav pavVar = (pav) obj4;
                lf80 lf80Var = (lf80) obj3;
                View inflate = ((LayoutInflater) obj).inflate(vuh0.organization_placeholder_slider_item, (ViewGroup) obj2, false);
                int i2 = q6h0.loading_container;
                View O = cma1.O(i2, inflate);
                if (O != null) {
                    ho4 p = ho4.p(O);
                    int i3 = q6h0.placeholder_image;
                    GoImageView goImageView = (GoImageView) cma1.O(i3, inflate);
                    if (goImageView != null) {
                        i3 = q6h0.placeholder_title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
                        if (robotoTextView != null) {
                            return new c(new rj80((GoFrameLayout) inflate, p, goImageView, robotoTextView), pavVar, lf80Var);
                        }
                    }
                    i2 = i3;
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 6:
                parameterizedContent$lambda$0$1 = PreviewActivity.setParameterizedContent$lambda$0$1((Object[]) obj4, (yx40) obj3, (fid) obj, ((Integer) obj2).intValue());
                return parameterizedContent$lambda$0$1;
            case 7:
                t7k0 t7k0Var = (t7k0) obj4;
                f530 f530Var = (f530) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ety0 ety0Var = xya1.d(btsVar2).b.e;
                    m5b1.b(t7k0Var.a, f530Var, ety0.e(ety0Var, tje.n(tp2.a, btsVar2), 0L, null, null, null, 0L, null, 3, 0L, 16744446), null, 0, false, 1, 0, null, new xt3(uh6.E(24), ety0Var.a.b, uh6.D(0.25d)), btsVar2, 1572864, 440);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 8:
                combinedAnimator$lambda$14 = ProductCardListView.getCombinedAnimator$lambda$14((ProductCardListView) obj4, (h7f0) obj3, ((Integer) obj).intValue(), (View) obj2);
                return combinedAnimator$lambda$14;
            case 9:
                w3b1 w3b1Var = (w3b1) obj4;
                n351 n351Var = (n351) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                c530 c530Var2 = c530Var;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (w3b1Var != null) {
                        c530Var2 = an91.m(c530Var, 8.0f, 0.0f, 2);
                    }
                    r3b1.a(c530Var2, w3b1Var, ((YandexShapes) btsVar3.m(qm51.a)).a(), null, wwg.S(812381962, true, new pdf0(1, n351Var), btsVar3), btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 8);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 10:
                dof0 dof0Var = (dof0) obj4;
                ibp0 ibp0Var = (ibp0) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    qnf0 qnf0Var = dof0Var.a;
                    btsVar4.e0(-1136070166);
                    nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar4, false);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                dda1.a((f530) obj4, (wp2) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                h31 h31Var = (h31) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                boolean V = btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2);
                dmw0 dmw0Var = btsVar5.a;
                if (V) {
                    lhl0 a = khl0.a(lr20.a, x4c.E, btsVar5, 48);
                    int hashCode = Long.hashCode(btsVar5.T);
                    r1b0 o = btsVar5.o();
                    c530 c530Var3 = c530.a;
                    f530 d = b.d(btsVar5, c530Var3);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar);
                    } else {
                        btsVar5.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar5, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar5, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar5, wlsVar3, valueOf);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar5, tlsVar2);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar5, wlsVar4, d);
                    qb90 qb90Var = h31Var.i;
                    boolean k = btsVar5.k(tlsVar);
                    Object Q = btsVar5.Q();
                    if (k || Q == o430Var) {
                        Q = new ukb0(15, tlsVar);
                        btsVar5.o0(Q);
                    }
                    cn91.b(qb90Var, (sls) Q, h31Var.j, an91.o(c530Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11), btsVar5, HProv.ALG_TYPE_SECURECHANNEL);
                    Object Q2 = btsVar5.Q();
                    if (Q2 == o430Var) {
                        Q2 = new cbg0(26);
                        btsVar5.o0(Q2);
                    }
                    f530 b = fnq0.b(c530Var3, false, (tls) Q2);
                    z910 d2 = pi6.d(x4c.b, false);
                    int hashCode2 = Long.hashCode(btsVar5.T);
                    r1b0 o2 = btsVar5.o();
                    f530 d3 = b.d(btsVar5, b);
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, wlsVar, d2);
                    qje.W(btsVar5, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar5, wlsVar3, btsVar5, tlsVar2);
                    qje.W(btsVar5, wlsVar4, d3);
                    au2 b2 = hgb1.b();
                    String e = ohb1.e(btsVar5, kyh0.select_current_geolocation_description);
                    boolean k2 = btsVar5.k(tlsVar);
                    Object Q3 = btsVar5.Q();
                    if (k2 || Q3 == o430Var) {
                        Q3 = new ukb0(17, tlsVar);
                        btsVar5.o0(Q3);
                    }
                    nab1.a(b2, e, (sls) Q3, null, btsVar5, 0, 8);
                    btsVar5.t(true);
                    btsVar5.t(true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 13:
                zji0 zji0Var = new zji0((wls) obj3, (zo31) ((wls) ((f3x) obj4).c).invoke((LayoutInflater) obj, (ViewGroup) obj2));
                zji0Var.T(true);
                return zji0Var;
            case 14:
                ((Integer) obj2).getClass();
                jla1.b((rdj0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ikj0 ikj0Var = (ikj0) obj4;
                ibp0 ibp0Var2 = (ibp0) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gkj0 gkj0Var = (gkj0) ikj0Var;
                    if (gkj0Var.b != null) {
                        btsVar6.e0(-397830031);
                        xrb1.b(ibp0Var2, gkj0Var.b.intValue(), c530.a, btsVar6, 0, 12);
                        btsVar6.t(false);
                    } else {
                        btsVar6.e0(-397690841);
                        x901.a.invoke(ibp0Var2, btsVar6, 0);
                        btsVar6.t(false);
                    }
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 16:
                uij0 uij0Var = (uij0) obj4;
                ibp0 ibp0Var3 = (ibp0) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Integer num = uij0Var.b;
                    c530 c530Var4 = c530.a;
                    if (num != null) {
                        btsVar7.e0(764194585);
                        udb1.b(ibp0Var3, uij0Var.b.intValue(), c530Var4, uij0Var.c, btsVar7, 0, 4);
                        btsVar7.t(false);
                    } else {
                        btsVar7.e0(764389792);
                        oeb1.c(btsVar7, ljs0.a(c530Var4, ibp0Var3.c().getSize(), ibp0Var3.c().getSize()));
                        btsVar7.t(false);
                    }
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                apa1.c((f530) obj4, (s7k0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                u7k0 u7k0Var = (u7k0) obj4;
                tls tlsVar3 = (tls) obj3;
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ttb1.a(u7k0Var.g, null, k.e(null, 3), k.f(null, 3), "FloatingEndButton", wwg.S(81620813, true, new o91(8, tlsVar3), btsVar8), btsVar8, 224640, 2);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 19:
                z7k0 z7k0Var = (z7k0) obj4;
                tls tlsVar4 = (tls) obj3;
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    c530 c530Var5 = c530.a;
                    f530 o3 = an91.o(c530Var5, 0.0f, 20.0f, 0.0f, 8.0f, 5);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar9, 0);
                    int hashCode3 = Long.hashCode(btsVar9.T);
                    r1b0 o4 = btsVar9.o();
                    f530 d4 = b.d(btsVar9, o3);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar9.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar9.i0();
                    if (btsVar9.S) {
                        btsVar9.n(slsVar2);
                    } else {
                        btsVar9.r0();
                    }
                    qje.W(btsVar9, d.f, a2);
                    qje.W(btsVar9, d.e, o4);
                    qje.W(btsVar9, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar9, d.h);
                    qje.W(btsVar9, d.d, d4);
                    jeb1.f(z7k0Var.a, an91.o(an91.m(c530Var5, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar9).e.e, btsVar9, 48, 0, 16380);
                    String str2 = z7k0Var.b;
                    if (str2 == null) {
                        btsVar9.e0(-1094945730);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-1094945729);
                        jeb1.f(str2, an91.o(an91.m(c530Var5, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar9).g.a, btsVar9, 48, 0, 16380);
                        btsVar9.t(false);
                    }
                    f530 m = an91.m(ljs0.c(c530Var5, 1.0f), 8.0f, 0.0f, 2);
                    ButtonStyle buttonStyle = ButtonStyle.Main;
                    ButtonSize buttonSize = ButtonSize.M;
                    boolean k3 = btsVar9.k(tlsVar4);
                    Object Q4 = btsVar9.Q();
                    if (k3 || Q4 == o430Var) {
                        Q4 = new v6k0(5, tlsVar4);
                        btsVar9.o0(Q4);
                    }
                    xad.a.getClass();
                    d17.c(m, false, buttonSize, buttonStyle, null, (sls) Q4, xad.b, btsVar9, 1576326, 18);
                    btsVar9.t(true);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 20:
                com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar = (com.yandex.go.shortcuts.impl.ui.shortcutview.a) obj4;
                ykn0 ykn0Var = (ykn0) obj3;
                View inflate2 = ((LayoutInflater) obj).inflate(ekh0.rida_tariffs_view_holder, (ViewGroup) obj2, false);
                int i4 = u7h0.firstTariff;
                View O2 = cma1.O(i4, inflate2);
                if (O2 != null) {
                    w7k0 o5 = w7k0.o(O2);
                    int i5 = u7h0.secondTariff;
                    View O3 = cma1.O(i5, inflate2);
                    if (O3 != null) {
                        return new o(new e8k0((GoLinearLayout) inflate2, o5, w7k0.o(O3)), aVar, ykn0Var);
                    }
                    i4 = i5;
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                return null;
            case 21:
                ((u) obj4).S.a(new lak0((String) obj, ((Boolean) obj2).booleanValue()), ((omk0) obj3).getAnalytics());
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                qqa1.a((vtk0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                qqa1.b((puk0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                qqa1.c((vuk0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                xuk0 xuk0Var = (xuk0) obj4;
                tls tlsVar5 = (tls) obj3;
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    cra1.d(xuk0Var.a, null, tlsVar5, btsVar10, 0);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                ita1.a((d5l0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                ibp0 ibp0Var4 = (ibp0) obj4;
                c5l0 c5l0Var = (c5l0) obj3;
                fid fidVar11 = (fid) obj;
                int intValue11 = ((Integer) obj2).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                    udb1.c(ibp0Var4, c5l0Var.d, null, null, btsVar11, 0, 14);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                r5l0.a((p5l0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                z5l0 z5l0Var = (z5l0) obj4;
                sls slsVar3 = (sls) obj3;
                fid fidVar12 = (fid) obj;
                int intValue12 = ((Integer) obj2).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 3) != 2)) {
                    t5l0.c(z5l0Var.c, slsVar3, btsVar12, 0);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ o990(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ o990(uij0 uij0Var, ibp0 ibp0Var) {
        this.a = 16;
        this.b = uij0Var;
        this.c = ibp0Var;
    }

    public /* synthetic */ o990(ikj0 ikj0Var, ibp0 ibp0Var) {
        this.a = 15;
        this.b = ikj0Var;
        this.c = ibp0Var;
    }

    public /* synthetic */ o990(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
