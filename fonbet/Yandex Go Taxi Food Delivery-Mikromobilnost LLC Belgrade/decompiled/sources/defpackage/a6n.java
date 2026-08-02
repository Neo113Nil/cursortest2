package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.b;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.d;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.a;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class a6n implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a6n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = null;
        str = null;
        switch (this.a) {
            case 0:
                b6n b6nVar = (b6n) this.b;
                tls tlsVar = (tls) this.c;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f1a1.d((mu90) b6nVar.j, tlsVar, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11.a;
            case 1:
                n351 n351Var = (n351) this.b;
                d dVar = (d) this.c;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    b6n b6nVar2 = (b6n) n351Var;
                    Object Q = btsVar2.Q();
                    if (Q == did.a) {
                        Q = new t8j(17, dVar, n351Var);
                        btsVar2.o0(Q);
                    }
                    f1a1.a(b6nVar2, null, (tls) Q, btsVar2, 384, 2);
                } else {
                    btsVar2.Y();
                }
                return zy11.a;
            case 2:
                ((Integer) obj2).getClass();
                a.b((f530) this.b, (w9n) this.c, (fid) obj, vng.O(7));
                return zy11.a;
            case 3:
                ((Integer) obj2).getClass();
                i4a1.a((yel0) this.b, (tls) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 4:
                m611 m611Var = (m611) this.b;
                ety0 ety0Var = (ety0) this.c;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    c530 c530Var = c530.a;
                    sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d = b.d(btsVar3, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, androidx.compose.ui.node.d.f, a);
                    qje.W(btsVar3, androidx.compose.ui.node.d.e, o);
                    qje.W(btsVar3, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar3, androidx.compose.ui.node.d.h);
                    qje.W(btsVar3, androidx.compose.ui.node.d.d, d);
                    qgy.b(m611Var.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                    String str2 = m611Var.f;
                    if (str2 != null && !evu0.J(str2)) {
                        str = str2;
                    }
                    if (str == null) {
                        btsVar3.e0(-1215852501);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-1215852500);
                        a8a1.d(48, btsVar3, an91.o(c530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), str);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11.a;
            case 5:
                ((Integer) obj2).getClass();
                oaa1.a((vnb) this.b, (tls) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 6:
                TaxiOrder taxiOrder = (TaxiOrder) this.b;
                mxo mxoVar = (mxo) this.c;
                if (((DriveState) obj2) != taxiOrder.h.b) {
                    cug cugVar = mxoVar.a;
                    String str3 = taxiOrder.a;
                    String name = taxiOrder.h.b.name();
                    cugVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str3);
                    hashMap.put(ClidProvider.STATE, name);
                    cugVar.a.a("ExtendedNotification.Show", hashMap, 1, new HashMap());
                }
                return taxiOrder.h.b;
            case 7:
                ((Integer) obj2).getClass();
                iha1.c((nxo) this.b, (sls) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 8:
                CharSequence charSequence = (CharSequence) this.b;
                wp2 wp2Var = (wp2) this.c;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    qgy.b(charSequence, null, null, wp2Var, 0L, 0L, null, 0L, 1, 1, 0, null, null, btsVar4, 805306368, 6, 14838);
                } else {
                    btsVar4.Y();
                }
                return zy11.a;
            case 9:
                cuq cuqVar = (cuq) this.b;
                tls tlsVar2 = (tls) this.c;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean z = cuqVar.e;
                    iib iibVar = iib.e;
                    boolean k = btsVar5.k(tlsVar2) | btsVar5.k(cuqVar);
                    Object Q2 = btsVar5.Q();
                    if (k || Q2 == did.a) {
                        Q2 = new btq(tlsVar2, cuqVar, 0);
                        btsVar5.o0(Q2);
                    }
                    clb1.a(null, z, false, null, iibVar, 0L, 0L, 0L, (tls) Q2, null, 0, btsVar5, 0, 1773);
                } else {
                    btsVar5.Y();
                }
                return zy11.a;
            case 10:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.a.e((mfz0) this.b, (tls) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 11:
                n611 n611Var = (n611) this.b;
                ety0 ety0Var2 = (ety0) this.c;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    jeb1.f(n611Var.a, null, tp2.a, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar6, 384, 0, 16378);
                } else {
                    btsVar6.Y();
                }
                return zy11.a;
            case 12:
                i4u i4uVar = (i4u) this.b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                String str4 = (String) obj2;
                n53 n53Var = new n53(0);
                Iterator it = ((nj51) obj).a.iterator();
                while (it.hasNext()) {
                    n53Var.b.add(new ktu0((String) it.next()));
                }
                tyj0 b = ((qdh) i4uVar.a).b(n53Var);
                if (b.c()) {
                    linkedHashMap.put(str4, b.a());
                }
                return zy11.a;
            case 13:
                jdj jdjVar = (jdj) this.b;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.c;
                String str5 = (String) obj2;
                zy11 zy11Var = zy11.a;
                if (obj instanceof String) {
                    tyj0 a2 = ((qdh) ((i4u) jdjVar.b).a).a((String) obj);
                    if (a2.c()) {
                        y3x y3xVar = (y3x) a2.a();
                        y3x d2 = y3xVar instanceof wj00 ? ((wj00) y3xVar).d("value") : null;
                        if (d2 != null) {
                            linkedHashMap2.put(str5, d2);
                        } else {
                            LinkedHashMap linkedHashMap3 = zdz.a;
                            ogb1.b("Couldn't deserialize value for flag \"" + str5 + "\":\n" + mbb1.a((y3x) a2.a()));
                        }
                    } else {
                        LinkedHashMap linkedHashMap4 = zdz.a;
                        YSError ySError = a2.b;
                        c.b(ySError);
                        ogb1.b("Couldn't deserialize value for flag \"" + str5 + "\":\n" + ySError.getMessage());
                    }
                }
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                msa1.k((o5f) this.b, (f530) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 15:
                ((Integer) obj2).getClass();
                cta1.c((ovi0) this.b, (sls) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 16:
                ((Integer) obj2).getClass();
                mi91.h((ohx0) this.b, (f530) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 17:
                ib30 ib30Var = (ib30) this.b;
                Object obj3 = this.c;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ib30Var.a.invoke(obj3, btsVar7, 0);
                } else {
                    btsVar7.Y();
                }
                return zy11.a;
            case 18:
                zti0 zti0Var = (zti0) this.b;
                ows0 ows0Var = (ows0) this.c;
                int intValue8 = ((Integer) obj).intValue();
                if (obj2 instanceof qgd) {
                    zti0Var.f.b((qgd) obj2);
                } else if (!(obj2 instanceof l2k0)) {
                    if (obj2 instanceof gts) {
                        wwg.T(ows0Var, intValue8, obj2);
                        zti0Var.e((gts) obj2);
                    } else if (obj2 instanceof aii0) {
                        wwg.T(ows0Var, intValue8, obj2);
                        ((aii0) obj2).c();
                    }
                }
                return zy11.a;
            case 19:
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) this.b;
                e1u e1uVar = (e1u) this.c;
                fid fidVar8 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    aVar.invoke(e1uVar.c, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11.a;
            case 20:
                ((Integer) obj2).getClass();
                vza1.a((vdu) this.b, (f530) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 21:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.e((y9u) this.b, (f530) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 22:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.l((tex0) this.b, (f530) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 23:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.o((ngx0) this.b, (f530) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 24:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header.a.n((hgx0) this.b, (f530) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 25:
                e eVar = (e) this.b;
                tls tlsVar3 = (tls) this.c;
                View inflate = ((LayoutInflater) obj).inflate(srh0.scooters_surge_info_header_item, (ViewGroup) obj2, false);
                int i = qfh0.surge_info_content_description;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = qfh0.surge_info_content_details;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        i = qfh0.surge_info_content_icon;
                        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
                        if (goImageView != null) {
                            i = qfh0.surge_info_content_title;
                            RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView3 != null) {
                                return new com.yandex.go.scooters.offers.v2.surge.info.d(new h3p0((GoConstraintLayout) inflate, robotoTextView, robotoTextView2, goImageView, robotoTextView3), eVar, tlsVar3);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return null;
            case 26:
                ((Integer) obj2).getClass();
                b0b1.b((f530) this.b, (vbu) this.c, (fid) obj, vng.O(1));
                return zy11.a;
            case 27:
                wsy0 wsy0Var = (wsy0) this.b;
                wsy0 wsy0Var2 = (wsy0) this.c;
                fid fidVar9 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String str6 = wsy0Var.a;
                    lzr lzrVar = wsy0Var.b;
                    int i2 = wsy0Var.c;
                    web1.e(null, null, null, str6, wsy0Var.e, 0L, lzrVar, new hzr(i2), new sty0(wsy0Var.d), 0, false, 0, null, wsy0Var2 != null ? wsy0Var2.a : null, wsy0Var2 != null ? wsy0Var2.e : null, wsy0Var2 != null ? wsy0Var2.b : null, wsy0Var2 != null ? new hzr(wsy0Var2.c) : null, wsy0Var2 != null ? new sty0(wsy0Var2.d) : null, false, 0L, 0, false, 0, false, null, true, btsVar9, 0, 0, 12582912, 133200999);
                } else {
                    btsVar9.Y();
                }
                return zy11.a;
            case 28:
                com.yandex.go.tariffcard.ui.adapter.header.e eVar2 = (com.yandex.go.tariffcard.ui.adapter.header.e) this.b;
                nhx0 nhx0Var = (nhx0) this.c;
                View inflate2 = ((LayoutInflater) obj).inflate(xrh0.tariff_card_header_item, (ViewGroup) obj2, false);
                int i3 = yfh0.addresses;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i3, inflate2);
                if (linearLayout != null) {
                    i3 = yfh0.destination_address;
                    RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i3, inflate2);
                    if (robotoTextView4 != null) {
                        i3 = yfh0.header_content;
                        ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i3, inflate2);
                        if (constraintLayout != null) {
                            i3 = yfh0.price_details_placeholder;
                            PlaceholderView placeholderView = (PlaceholderView) cma1.O(i3, inflate2);
                            if (placeholderView != null) {
                                i3 = yfh0.price_placeholder;
                                PlaceholderView placeholderView2 = (PlaceholderView) cma1.O(i3, inflate2);
                                if (placeholderView2 != null) {
                                    i3 = yfh0.prices_flow;
                                    Flow flow = (Flow) cma1.O(i3, inflate2);
                                    if (flow != null) {
                                        i3 = yfh0.source_address;
                                        RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i3, inflate2);
                                        if (robotoTextView5 != null) {
                                            i3 = yfh0.tariff_card_car_image;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i3, inflate2);
                                            if (appCompatImageView != null) {
                                                i3 = yfh0.tariff_card_info_icon;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i3, inflate2);
                                                if (appCompatImageView2 != null) {
                                                    i3 = yfh0.tariff_card_price;
                                                    ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i3, inflate2);
                                                    if (shimmeringRobotoTextView != null) {
                                                        i3 = yfh0.tariff_card_price_details;
                                                        ShimmeringRobotoTextView shimmeringRobotoTextView2 = (ShimmeringRobotoTextView) cma1.O(i3, inflate2);
                                                        if (shimmeringRobotoTextView2 != null) {
                                                            i3 = yfh0.tariff_card_tariff_description;
                                                            ShimmeringRobotoTextView shimmeringRobotoTextView3 = (ShimmeringRobotoTextView) cma1.O(i3, inflate2);
                                                            if (shimmeringRobotoTextView3 != null) {
                                                                i3 = yfh0.tariff_card_tariff_name;
                                                                RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i3, inflate2);
                                                                if (robotoTextView6 != null) {
                                                                    i3 = yfh0.tariff_description_placeholder;
                                                                    PlaceholderView placeholderView3 = (PlaceholderView) cma1.O(i3, inflate2);
                                                                    if (placeholderView3 != null) {
                                                                        return new com.yandex.go.tariffcard.ui.adapter.header.a(new icx0((GoFrameLayout) inflate2, linearLayout, robotoTextView4, constraintLayout, placeholderView, placeholderView2, flow, robotoTextView5, appCompatImageView, appCompatImageView2, shimmeringRobotoTextView, shimmeringRobotoTextView2, shimmeringRobotoTextView3, robotoTextView6, placeholderView3), eVar2, nhx0Var);
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
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                return null;
            default:
                ((Integer) obj2).getClass();
                j2b1.a((f530) this.b, (tzu) this.c, (fid) obj, vng.O(1));
                return zy11.a;
        }
    }

    public /* synthetic */ a6n(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
