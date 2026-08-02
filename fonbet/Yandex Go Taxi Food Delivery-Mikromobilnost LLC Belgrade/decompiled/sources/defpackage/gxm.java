package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.constraintlayout.helper.widget.Flow;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.navigator.main_screen.h;
import com.yandex.go.navigator.main_screen.j;
import com.yandex.go.tariffcard.ui.adapter.header.e;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes5.dex */
public final /* synthetic */ class gxm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ gxm(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [f530] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        g8l0 g8l0Var;
        int i = this.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                jxm jxmVar = (jxm) obj5;
                sls slsVar = (sls) obj4;
                sls slsVar2 = (sls) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    sic a = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530Var);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar3);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    oy91.c(jxmVar.c, btsVar, 0);
                    oy91.b(jxmVar.e, jxmVar.f, slsVar, slsVar2, btsVar, 0);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                String str = (String) obj5;
                tls tlsVar = (tls) obj4;
                b6n b6nVar = (b6n) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean k = btsVar2.k(str);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = new wwb(str, 23);
                        btsVar2.o0(Q);
                    }
                    f530 a2 = fnq0.a(c530Var, (tls) Q);
                    cuj0 cuj0Var = new cuj0(vzg0.ic_tracking_copy, null, Boolean.TRUE, null, 26);
                    boolean k2 = btsVar2.k(tlsVar) | btsVar2.k(b6nVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new y5n(tlsVar, b6nVar, 1);
                        btsVar2.o0(Q2);
                    }
                    s3b1.c(cuj0Var, a2, false, null, false, null, (sls) Q2, btsVar2, 0, 60);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                i4a1.d((dfl0) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 3:
                ArrayList arrayList = (ArrayList) obj5;
                gon gonVar = (gon) obj4;
                vu0 vu0Var = (vu0) obj3;
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                g8l0 g8l0Var2 = (g8l0) a.S(intValue3, arrayList);
                if (g8l0Var2 != null && (g8l0Var = (g8l0) a.S(intValue4, arrayList)) != null && !(vu0Var instanceof su0)) {
                    gonVar.b.b(g8l0Var2, g8l0Var);
                }
                return zy11Var;
            case 4:
                l611 l611Var = (l611) obj5;
                ety0 ety0Var = (ety0) obj4;
                ib11 ib11Var = (ib11) obj3;
                fid fidVar3 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    sic a3 = qic.a(g43Var, x4c.G, btsVar3, 0);
                    int hashCode2 = Long.hashCode(btsVar3.T);
                    r1b0 o2 = btsVar3.o();
                    f530 d2 = b.d(btsVar3, c530Var);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar4);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a3);
                    qje.W(btsVar3, d.e, o2);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d2);
                    qgy.b(l611Var.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 0, 0, ety0Var, null, btsVar3, 805309440, 0, 11766);
                    String str2 = l611Var.c;
                    String str3 = (str2 == null || evu0.J(str2)) ? null : str2;
                    if (str3 == null) {
                        btsVar3.e0(-1947317061);
                        btsVar3.t(false);
                    } else {
                        tse0.s(btsVar3, -1947317060, c530Var, 8.0f, btsVar3);
                        ptb1.b(ib11Var, false, null, null, true, null, l611Var.d, str3, new ldc(tje.n(AppColor$Palette.TextMinor, btsVar3)), null, btsVar3, 24624, 556);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 5:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.a aVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.a) obj5;
                ind0 ind0Var = (ind0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                mnd0 mnd0Var = (mnd0) aVar.y;
                mnd0Var.getClass();
                PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
                PlusTarifficatorPurchase c = ind0Var.c();
                PayUIEvgenAnalytics$PaymentOption a4 = dio.a(c.getOffer());
                String paymentMethodId = c.getPaymentMethodId();
                if (a4 != null) {
                    eu90 eu90Var = mnd0Var.a;
                    String d3 = dio.d(ind0Var.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    if (id == null) {
                        id = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    if (paymentMethodId == null) {
                        paymentMethodId = "no_value";
                    }
                    boolean z = c.getType() == PlusTarifficatorPurchase.Type.SILENT;
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d3, "product_id", id);
                    xvz.A(t, "options_id", arrayList2, true, "is_tarifficator");
                    xvz.x(a4, t, "payment_option", "payment_method_id", paymentMethodId);
                    t.put("link", str4);
                    t.put("silent", String.valueOf(z));
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("PaymentProcess.ErrorScreen.SupportLink.Clicked", t);
                }
                aVar.z.k(str5);
                return zy11Var;
            case 6:
                byk0 byk0Var = (byk0) obj5;
                p4p p4pVar = (p4p) obj4;
                androidx.compose.runtime.internal.a aVar2 = (androidx.compose.runtime.internal.a) obj3;
                fid fidVar4 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    f530 b = m4m0.b(c530Var, ((ldc) btsVar4.m(k2z.b)).a, byk0Var);
                    c530 c530Var2 = c530Var;
                    if (p4pVar.e) {
                        c530Var2 = ymb1.l(c530Var, byk0Var);
                    }
                    f530 k3 = b.k(c530Var2);
                    z910 d4 = pi6.d(x4c.b, false);
                    int hashCode3 = Long.hashCode(btsVar4.T);
                    r1b0 o3 = btsVar4.o();
                    f530 d5 = b.d(btsVar4, k3);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar5);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, d4);
                    qje.W(btsVar4, d.e, o3);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d5);
                    aVar2.invoke(cj6.a, btsVar4, 6);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 7:
                CharSequence charSequence = (CharSequence) obj5;
                wp2 wp2Var = (wp2) obj4;
                sjy0 sjy0Var = (sjy0) obj3;
                fid fidVar5 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    qgy.b(charSequence, null, null, wp2Var, 0L, 0L, sjy0Var, 0L, 1, 1, 0, null, null, btsVar5, 805306368, 6, 14710);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                y5r.c((d6r) obj5, (tls) obj3, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                jsa1.c((o5f) obj5, (sls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                msa1.f((m5f) obj5, (pa90) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                wza1.d((wdu) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.m((yex0) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.i((kze0) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.k((a1f0) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                l0b1.d((CharSequence) obj5, (bcu) obj3, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                e eVar = (e) obj5;
                a22 a22Var = (a22) obj4;
                nhx0 nhx0Var = (nhx0) obj3;
                View inflate = ((LayoutInflater) obj).inflate(xrh0.tariff_card_ultima_header_item, (ViewGroup) obj2, false);
                int i2 = yfh0.addresses;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i2, inflate);
                if (linearLayout != null) {
                    i2 = yfh0.destination_address;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                    if (robotoTextView != null) {
                        i2 = yfh0.price_details_placeholder;
                        PlaceholderView placeholderView = (PlaceholderView) cma1.O(i2, inflate);
                        if (placeholderView != null) {
                            i2 = yfh0.price_placeholder;
                            PlaceholderView placeholderView2 = (PlaceholderView) cma1.O(i2, inflate);
                            if (placeholderView2 != null) {
                                i2 = yfh0.prices_flow;
                                Flow flow = (Flow) cma1.O(i2, inflate);
                                if (flow != null) {
                                    i2 = yfh0.source_address;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                                    if (robotoTextView2 != null) {
                                        i2 = yfh0.tariff_card_background_gradient;
                                        GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
                                        if (goImageView != null) {
                                            i2 = yfh0.tariff_card_background_image;
                                            GoImageView goImageView2 = (GoImageView) cma1.O(i2, inflate);
                                            if (goImageView2 != null) {
                                                i2 = yfh0.tariff_card_info_icon;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
                                                if (appCompatImageView != null) {
                                                    i2 = yfh0.tariff_card_price;
                                                    ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i2, inflate);
                                                    if (shimmeringRobotoTextView != null) {
                                                        i2 = yfh0.tariff_card_price_details;
                                                        ShimmeringRobotoTextView shimmeringRobotoTextView2 = (ShimmeringRobotoTextView) cma1.O(i2, inflate);
                                                        if (shimmeringRobotoTextView2 != null) {
                                                            i2 = yfh0.tariff_card_tariff_description;
                                                            ShimmeringRobotoTextView shimmeringRobotoTextView3 = (ShimmeringRobotoTextView) cma1.O(i2, inflate);
                                                            if (shimmeringRobotoTextView3 != null) {
                                                                i2 = yfh0.tariff_card_tariff_name;
                                                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, inflate);
                                                                if (robotoTextView3 != null) {
                                                                    i2 = yfh0.tariff_description_placeholder;
                                                                    PlaceholderView placeholderView3 = (PlaceholderView) cma1.O(i2, inflate);
                                                                    if (placeholderView3 != null) {
                                                                        i2 = yfh0.ultima_header_layout;
                                                                        GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i2, inflate);
                                                                        if (goConstraintLayout != null) {
                                                                            return new com.yandex.go.tariffcard.ui.adapter.header.b(new eex0((GoFrameLayout) inflate, linearLayout, robotoTextView, placeholderView, placeholderView2, flow, robotoTextView2, goImageView, goImageView2, appCompatImageView, shimmeringRobotoTextView, shimmeringRobotoTextView2, shimmeringRobotoTextView3, robotoTextView3, placeholderView3, goConstraintLayout), eVar, a22Var, nhx0Var);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 17:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.components.a.b((i330) obj5, (wls) obj4, (wls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                com.yandex.messaging.ui.di.a.a((tls) obj5, (tls) obj4, (zls) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                web1.f((wls) obj5, (wls) obj4, (j690) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                j0z.a((f530) obj5, (wnb) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                raz.a(vng.O(1), (fid) obj, (tls) obj3, (abz) obj5, (f530) obj4);
                return zy11Var;
            case 22:
                x700 x700Var = (x700) obj5;
                xfd xfdVar = (xfd) obj4;
                h hVar = (h) obj3;
                fid fidVar6 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    j.a(x700Var, ((bgd) xfdVar).a, hVar, btsVar6, 8);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                j.a((x700) obj5, (tls) obj4, (h) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 24:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                x43 x43Var = (x43) obj3;
                String str6 = (String) obj;
                if (((Set) obj2).contains((String) obj5) && !linkedHashSet.contains(str6)) {
                    x43Var.addLast(str6);
                }
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.a((f530) obj5, (mx00) obj3, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                f530 f530Var = (f530) obj5;
                oip0 oip0Var = (oip0) obj4;
                androidx.compose.runtime.internal.a aVar3 = (androidx.compose.runtime.internal.a) obj3;
                fid fidVar7 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    f530 u = pw91.u(fj91.d(an91.m(f530Var, 0.0f, zl10.a, 1), IntrinsicSize.Max), oip0Var, 14);
                    sic a5 = qic.a(g43Var, x4c.G, btsVar7, 0);
                    int S = cma1.S(btsVar7);
                    r1b0 o4 = btsVar7.o();
                    f530 d6 = b.d(btsVar7, u);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar6);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a5);
                    qje.W(btsVar7, d.e, o4);
                    wls wlsVar2 = d.g;
                    if (btsVar7.S || !jl40.l(btsVar7.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar7, S, wlsVar2);
                    }
                    qje.W(btsVar7, d.d, d6);
                    aVar3.invoke(uic.a, btsVar7, 6);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                omb1.b((ak20) obj5, (sls) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                oob1.a((hk30) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                cl91.e((fd30) obj5, (ll30) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ gxm(Object obj, Object obj2, sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.w = obj2;
        this.c = slsVar;
    }

    public /* synthetic */ gxm(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
