package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes11.dex */
public final /* synthetic */ class b0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ b0(dic dicVar, oz40 oz40Var, f530 f530Var, wls wlsVar, wls wlsVar2, a aVar) {
        this.a = 8;
        this.c = oz40Var;
        this.b = f530Var;
        this.w = wlsVar;
        this.x = wlsVar2;
        this.y = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                com.yandex.go.requirements.comment.summary.ui.v3.ui.a.e((f530) obj7, (oip0) obj6, (r5v0) obj5, (m3u0) obj4, (tls) obj3, (fid) obj, vng.O(3073));
                return zy11Var;
            case 1:
                ky kyVar = (ky) obj7;
                String str = (String) obj6;
                lhg lhgVar = (lhg) obj5;
                String str2 = (String) obj4;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    cuj0 cuj0Var = new cuj0(wzg0.ic_right, null, Boolean.TRUE, null, 26);
                    kyVar.getClass();
                    String str3 = kyVar.a;
                    f530 o = an91.o(c530.a, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    boolean k = btsVar.k(str);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new h0(str, 5);
                        btsVar.o0(Q);
                    }
                    f530 a = fnq0.a(o, (tls) Q);
                    boolean e = btsVar.e(lhgVar) | btsVar.k(str2);
                    Object obj8 = this.y;
                    boolean e2 = e | btsVar.e(obj8) | btsVar.k(kyVar);
                    Object Q2 = btsVar.Q();
                    if (e2 || Q2 == o430Var) {
                        sq0 sq0Var = new sq0(lhgVar, str2, obj8, kyVar, 1);
                        btsVar.o0(sq0Var);
                        Q2 = sq0Var;
                    }
                    s3b1.c(cuj0Var, a, true, str3, false, null, (sls) Q2, btsVar, 0, 48);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                up1 up1Var = (up1) obj7;
                m3u0 m3u0Var = (m3u0) obj4;
                tls tlsVar = (tls) obj3;
                oz40 oz40Var = (oz40) obj6;
                m3u0 m3u0Var2 = (m3u0) obj5;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str4 = up1Var.e;
                    boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                    f530 b = tra1.b(c530Var, ((Number) m3u0Var2.getValue()).floatValue());
                    boolean k2 = btsVar2.k(m3u0Var);
                    Object Q3 = btsVar2.Q();
                    if (k2 || Q3 == o430Var) {
                        Q3 = new xo1(m3u0Var, 0);
                        btsVar2.o0(Q3);
                    }
                    f530 d = sm91.d(b, (tls) Q3);
                    boolean k3 = btsVar2.k(tlsVar);
                    Object Q4 = btsVar2.Q();
                    if (k3 || Q4 == o430Var) {
                        Q4 = new o0(18, tlsVar);
                        btsVar2.o0(Q4);
                    }
                    com.yandex.go.ai_widget.ui.a.a(0, 0, btsVar2, (sls) Q4, d, str4, booleanValue);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                com.yandex.go.benefits_center.activation.ui.a.a((f530) obj7, (qm5) obj6, (String) obj5, (tls) obj3, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                dib1.a((f530) obj7, (paa) obj6, (z0a0) obj5, (String) obj4, (tls) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.offer.ui.compose.ui.a.a((paa) obj7, (z0a0) obj6, (u8a) obj5, (String) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                djb1.a((qla) obj7, (oip0) obj6, (z0a0) obj5, (String) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                xnb1.a((qor) obj6, (f530) obj7, (rbn) obj5, (a) obj4, (a) obj3, (fid) obj, vng.O(28039));
                return zy11Var;
            case 8:
                oz40 oz40Var2 = (oz40) obj6;
                f530 f530Var = (f530) obj7;
                wls wlsVar = (wls) obj5;
                to5 to5Var = x4c.E;
                wls wlsVar2 = (wls) obj4;
                wls wlsVar3 = (wls) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                boolean V = btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2);
                dmw0 dmw0Var = btsVar3.a;
                if (!V) {
                    btsVar3.Y();
                    return zy11Var;
                }
                igr0 b2 = dbb1.b(btsVar3);
                c530 c530Var2 = c530.a;
                f530 c = hbb1.c(c530Var2, b2, false, 24.0f, oz40Var2, 2);
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o2 = btsVar3.o();
                f530 d3 = b.d(btsVar3, c);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                wls wlsVar4 = d.f;
                qje.W(btsVar3, wlsVar4, d2);
                wls wlsVar5 = d.e;
                qje.W(btsVar3, wlsVar5, o2);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar6 = d.g;
                qje.W(btsVar3, wlsVar6, valueOf);
                tls tlsVar2 = d.h;
                qje.M(btsVar3, tlsVar2);
                wls wlsVar7 = d.d;
                qje.W(btsVar3, wlsVar7, d3);
                f530 h = ljs0.h(i9a1.f(m4m0.b(ymb1.l(f530Var, cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3)), ((ldc) btsVar3.m(k2z.b)).a, qke.q)), dsz0.c);
                boolean k4 = btsVar3.k(to5Var) | btsVar3.k(to5Var) | btsVar3.k(to5Var);
                Object Q5 = btsVar3.Q();
                if (k4 || Q5 == o430Var) {
                    Q5 = new jg0(13);
                    btsVar3.o0(Q5);
                }
                z910 z910Var = (z910) Q5;
                int hashCode2 = Long.hashCode(btsVar3.T);
                r1b0 o3 = btsVar3.o();
                f530 d4 = b.d(btsVar3, h);
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, wlsVar4, z910Var);
                qje.W(btsVar3, wlsVar5, o3);
                vfc.v(hashCode2, btsVar3, wlsVar6, btsVar3, tlsVar2);
                qje.W(btsVar3, wlsVar7, d4);
                wlsVar.invoke(btsVar3, 0);
                f530 h2 = pj91.h(c530Var2, "center");
                z910 d5 = pi6.d(x4c.y, false);
                int hashCode3 = Long.hashCode(btsVar3.T);
                r1b0 o4 = btsVar3.o();
                f530 d6 = b.d(btsVar3, h2);
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, wlsVar4, d5);
                qje.W(btsVar3, wlsVar5, o4);
                vfc.v(hashCode3, btsVar3, wlsVar6, btsVar3, tlsVar2);
                qje.W(btsVar3, wlsVar7, d6);
                wlsVar2.invoke(btsVar3, 0);
                btsVar3.t(true);
                wlsVar3.invoke(btsVar3, 0);
                btsVar3.t(true);
                btsVar3.t(true);
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                atb1.a((w1f) obj6, (yur) obj5, (tls) obj3, (sls) obj4, (f530) obj7, (fid) obj, vng.O(49));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                r891.a((z4f) obj6, (f530) obj7, (tls) obj3, (sls) obj5, (sls) obj4, (fid) obj, vng.O(27697));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.courier_comment_view.a.b((String) obj7, (String) obj6, (Integer) obj5, (tls) obj3, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                pav pavVar = (pav) obj7;
                k7x0 k7x0Var = (k7x0) obj6;
                qnh qnhVar = (qnh) obj5;
                hei heiVar = (hei) obj4;
                vsi vsiVar = (vsi) obj3;
                View inflate = ((LayoutInflater) obj).inflate(hqh0.item_delivery_block_header, (ViewGroup) obj2, false);
                AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) inflate;
                int i2 = deh0.delivery_form_annotation;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
                if (listItemComponent != null) {
                    i2 = deh0.delivery_form_title;
                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i2, inflate);
                    if (listItemComponent2 != null) {
                        return new psg(new f1x(autoDividerComponentList, autoDividerComponentList, listItemComponent, listItemComponent2), pavVar, k7x0Var, qnhVar, heiVar, vsiVar);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 13:
                ((Integer) obj2).getClass();
                wrl.a((String) obj6, (f530) obj7, (ety0) obj5, (wp2) obj4, (wp2) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                jxm jxmVar = (jxm) obj7;
                Triple triple = (Triple) obj6;
                tls tlsVar3 = (tls) obj3;
                tls tlsVar4 = (tls) obj5;
                tls tlsVar5 = (tls) obj4;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar4, 0);
                    int hashCode4 = Long.hashCode(btsVar4.T);
                    r1b0 o5 = btsVar4.o();
                    f530 d7 = b.d(btsVar4, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a2);
                    qje.W(btsVar4, d.e, o5);
                    wls wlsVar8 = d.g;
                    if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode4))) {
                        b64.z(hashCode4, btsVar4, hashCode4, wlsVar8);
                    }
                    qje.W(btsVar4, d.d, d7);
                    oy91.d(jxmVar.a, jxmVar.b, btsVar4, 0);
                    dk91.a(0.0f, 6, 6, 0L, btsVar4, an91.m(c530Var, 16.0f, 0.0f, 2));
                    oy91.f(jxmVar.d, ((Number) triple.f()).intValue(), ((Number) triple.g()).intValue(), ((Number) triple.h()).intValue(), tlsVar3, tlsVar4, tlsVar5, btsVar4, 0);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                k0a1.b((o5n) obj6, (f530) obj7, (tls) obj3, (tls) obj5, (tls) obj4, (fid) obj, vng.O(28033));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.a.a((jtq) obj7, (tls) obj3, (tls) obj6, (tls) obj5, (sls) obj4, (fid) obj, vng.O(28081));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                mi91.c((qzr) obj6, (f530) obj7, (tls) obj3, (tls) obj5, (yur) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.f((sdu) obj6, (f530) obj7, (m3u0) obj4, (yur) obj5, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                a0b1.a((f530) obj7, (wsy0) obj6, (wsy0) obj5, (v4v) obj4, (ome) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.mapcontent.a.a((ug00) obj6, (f530) obj7, (yur) obj5, (qor) obj4, (tls) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                kj20.b((String) obj7, (String) obj6, (ArrayList) obj5, (v4v) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                omb1.a((ak20) obj7, (sls) obj6, (tls) obj3, (tls) obj5, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                vpb1.a((f530) obj7, (CharSequence) obj6, (String) obj5, (List) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                tls tlsVar6 = (tls) obj3;
                co60 co60Var = (co60) obj7;
                yur yurVar = (yur) obj6;
                zx40 zx40Var = (zx40) obj5;
                oz40 oz40Var3 = (oz40) obj4;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.a.b((hoy0) oz40Var3.getValue(), tlsVar6, co60Var, yurVar, zx40Var, btsVar5, 27648);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.a.b((hoy0) obj7, (tls) obj3, (co60) obj6, (yur) obj5, (zx40) obj4, (fid) obj, vng.O(27649));
                return zy11Var;
            case 26:
                f530 f530Var2 = (f530) obj7;
                oz40 oz40Var4 = (oz40) obj6;
                a aVar = (a) obj5;
                androidx.compose.foundation.text.contextmenu.provider.a aVar2 = (androidx.compose.foundation.text.contextmenu.provider.a) obj4;
                sls slsVar3 = (sls) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Object Q6 = btsVar6.Q();
                    if (Q6 == o430Var) {
                        Q6 = new ttm(10, oz40Var4);
                        btsVar6.o0(Q6);
                    }
                    f530 y = eja1.y(f530Var2, (tls) Q6);
                    z910 d8 = pi6.d(x4c.b, true);
                    int hashCode5 = Long.hashCode(btsVar6.T);
                    r1b0 o6 = btsVar6.o();
                    f530 d9 = b.d(btsVar6, y);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar4);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, d8);
                    qje.W(btsVar6, d.e, o6);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode5));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d9);
                    aVar.invoke(btsVar6, 0);
                    aVar2.b(slsVar3, btsVar6, 6);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 27:
                String str5 = (String) obj7;
                sls slsVar5 = (sls) obj6;
                sls slsVar6 = (sls) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    c530 c530Var3 = c530.a;
                    f530 k5 = an91.k(m4m0.b(ljs0.r(c530Var3, 200.0f, 300.0f), ldc.b(ldc.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), cyk0.c(16.0f)), 16.0f);
                    sic a3 = qic.a(new i43(8.0f, true, new quz(11)), x4c.H, btsVar7, 54);
                    int hashCode6 = Long.hashCode(btsVar7.T);
                    r1b0 o7 = btsVar7.o();
                    f530 d10 = b.d(btsVar7, k5);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar7);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a3);
                    qje.W(btsVar7, d.e, o7);
                    wls wlsVar9 = d.g;
                    if (btsVar7.S || !jl40.l(btsVar7.Q(), Integer.valueOf(hashCode6))) {
                        b64.z(hashCode6, btsVar7, hashCode6, wlsVar9);
                    }
                    qje.W(btsVar7, d.d, d10);
                    ymb1.e(str5, null, ldc.f, tq7.a, lzr.E, null, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar7, 28032, 0, 64482);
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar5, ljs0.e(ljs0.c(an91.o(c530Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), 48.0f), null, 0L, 0L, null, false, null, null, null, wwg.S(-1464645433, true, new jk30(str6, 26), btsVar7), btsVar7, 0, 4092);
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar6, ljs0.e(ljs0.c(c530Var3, 1.0f), 48.0f), null, ((el51) btsVar7.m(gl51.a)).g(), 0L, null, null, null, false, null, null, null, wwg.S(1862214237, true, new jk30(str7, 27), btsVar7), btsVar7, 0, 384, 4084);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                csb1.e((CharSequence) obj7, (CharSequence) obj6, (CharSequence) obj5, (CharSequence) obj4, (CharSequence) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                tb31.h((je31) obj7, (tls) obj3, (wg6) obj6, (z0a0) obj5, (yur) obj4, (fid) obj, vng.O(24577));
                return zy11Var;
        }
    }

    public /* synthetic */ b0(up1 up1Var, m3u0 m3u0Var, tls tlsVar, oz40 oz40Var, m3u0 m3u0Var2) {
        this.a = 2;
        this.b = up1Var;
        this.x = m3u0Var;
        this.y = tlsVar;
        this.c = oz40Var;
        this.w = m3u0Var2;
    }

    public /* synthetic */ b0(w1f w1fVar, yur yurVar, tls tlsVar, sls slsVar, f530 f530Var, int i) {
        this.a = 9;
        this.c = w1fVar;
        this.w = yurVar;
        this.y = tlsVar;
        this.x = slsVar;
        this.b = f530Var;
    }

    public /* synthetic */ b0(jxm jxmVar, Triple triple, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        this.a = 14;
        this.b = jxmVar;
        this.c = triple;
        this.y = tlsVar;
        this.w = tlsVar2;
        this.x = tlsVar3;
    }

    public /* synthetic */ b0(tls tlsVar, co60 co60Var, yur yurVar, zx40 zx40Var, oz40 oz40Var) {
        this.a = 24;
        this.y = tlsVar;
        this.b = co60Var;
        this.c = yurVar;
        this.w = zx40Var;
        this.x = oz40Var;
    }

    public /* synthetic */ b0(sdu sduVar, f530 f530Var, m3u0 m3u0Var, yur yurVar, tls tlsVar, int i) {
        this.a = 18;
        this.c = sduVar;
        this.b = f530Var;
        this.x = m3u0Var;
        this.w = yurVar;
        this.y = tlsVar;
    }

    public /* synthetic */ b0(ak20 ak20Var, sls slsVar, tls tlsVar, tls tlsVar2, sls slsVar2, int i) {
        this.a = 22;
        this.b = ak20Var;
        this.c = slsVar;
        this.y = tlsVar;
        this.w = tlsVar2;
        this.x = slsVar2;
    }

    public /* synthetic */ b0(f530 f530Var, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = f530Var;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
    }

    public /* synthetic */ b0(Object obj, tls tlsVar, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.y = tlsVar;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public /* synthetic */ b0(Object obj, f530 f530Var, tls tlsVar, cms cmsVar, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = f530Var;
        this.y = tlsVar;
        this.w = cmsVar;
        this.x = obj2;
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, tls tlsVar, cms cmsVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.y = tlsVar;
        this.x = cmsVar;
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    public /* synthetic */ b0(String str, sls slsVar, sls slsVar2, String str2, String str3) {
        this.a = 27;
        this.b = str;
        this.c = slsVar;
        this.w = slsVar2;
        this.x = str2;
        this.y = str3;
    }
}
