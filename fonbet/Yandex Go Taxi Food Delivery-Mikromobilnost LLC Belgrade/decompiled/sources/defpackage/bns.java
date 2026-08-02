package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.animation.core.c;
import androidx.compose.ui.node.d;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.information.analytics.InformationAnalyticsEvent$ItemType;
import com.yandex.go.information.domain.h;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import com.yandex.go.scooters.zones.info.ui.b;
import com.yandex.go.tariffcard.ui.adapter.header.multiclass.MulticlassHeaderMapView;
import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.smartcamera.arscene.ui.f;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.testSearch.MerchantOffersTestSearchFragment;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import java.util.concurrent.CancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.components.a;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes11.dex */
public final /* synthetic */ class bns implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bns(qau qauVar) {
        this.a = 4;
        this.b = qauVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onCreate$lambda$0;
        zy11 onCreate$lambda$02;
        zy11 adapter$lambda$0$1;
        Object invoke;
        zy11 listAdapter$lambda$0;
        boolean recyclerAdapter_delegate$lambda$3$lambda$1;
        boolean adapter_delegate$lambda$3$lambda$1;
        boolean adapter_delegate$lambda$1$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$0 = FundCreationFragment.onCreate$lambda$0((FundCreationFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$0;
            case 1:
                onCreate$lambda$02 = FundOperationFragment.onCreate$lambda$0((FundOperationFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$02;
            case 2:
                l8x l8xVar = (l8x) obj3;
                Throwable th = (Throwable) obj2;
                if (th != null) {
                    r5 = th instanceof CancellationException ? (CancellationException) th : null;
                    if (r5 == null) {
                        r5 = uh6.b("CompletableFuture was completed exceptionally", th);
                    }
                }
                l8xVar.a(r5);
                return zy11Var;
            case 3:
                adapter$lambda$0$1 = GasStationsFiltersListModalView.adapter$lambda$0$1((GasStationsFiltersListModalView) obj3, (ListItemComponent) obj, (cus) obj2);
                return adapter$lambda$0$1;
            case 4:
                qau qauVar = (qau) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                } else if (qauVar.b != null) {
                    btsVar.e0(-874896914);
                    pa90 a = wya1.a(qauVar.b.intValue(), 0, btsVar);
                    btsVar.e0(-1411607277);
                    btsVar.t(false);
                    o4b1.b(a, null, c530.a, null, null, 0.0f, null, btsVar, 8, 56);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-874787050);
                    btsVar.t(false);
                }
                return zy11Var;
            case 5:
                e eVar = (e) obj3;
                View inflate = ((LayoutInflater) obj).inflate(zjh0.scooters_zones_info_header_item, (ViewGroup) obj2, false);
                int i2 = p7h0.description_text_view;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                if (robotoTextView != null) {
                    i2 = p7h0.icon_image_view;
                    GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
                    if (goImageView != null) {
                        i2 = p7h0.title_text_view;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                        if (robotoTextView2 != null) {
                            return new b(new q9p0((GoConstraintLayout) inflate, goImageView, robotoTextView, robotoTextView2), eVar);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 6:
                ((Integer) obj2).getClass();
                k0b1.c((gbe) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                wbu wbuVar = (wbu) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    c530 c530Var = c530.a;
                    f530 d = androidx.compose.ui.b.d(btsVar2, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a2);
                    qje.W(btsVar2, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar);
                    }
                    qje.W(btsVar2, d.d, d);
                    String str = wbuVar.a;
                    lzr lzrVar = lzr.G;
                    Object Q = btsVar2.Q();
                    if (Q == did.a) {
                        Q = new iws(20);
                        btsVar2.o0(Q);
                    }
                    ymb1.j(str, fnq0.b(c530Var, false, (tls) Q), 0L, null, lzrVar, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, HProv.ALG_TYPE_SECURECHANNEL, 57324);
                    String str2 = wbuVar.b;
                    if (str2 == null) {
                        btsVar2.e0(1600120298);
                    } else {
                        btsVar2.e0(1600120299);
                        ymb1.f(str2, null, ((el51) btsVar2.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 0, 0, 65530);
                    }
                    btsVar2.t(false);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                f0b1.b((ybu) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 9:
                com.yandex.go.tariffcard.ui.adapter.header.e eVar2 = (com.yandex.go.tariffcard.ui.adapter.header.e) obj3;
                View inflate2 = ((LayoutInflater) obj).inflate(xrh0.tariff_card_multiclass_header_item, (ViewGroup) obj2, false);
                int i3 = yfh0.addresses;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i3, inflate2);
                if (linearLayout != null) {
                    i3 = yfh0.destination_address;
                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, inflate2);
                    if (robotoTextView3 != null) {
                        i3 = yfh0.headerMapView;
                        MulticlassHeaderMapView multiclassHeaderMapView = (MulticlassHeaderMapView) cma1.O(i3, inflate2);
                        if (multiclassHeaderMapView != null) {
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
                                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i3, inflate2);
                                        if (robotoTextView4 != null) {
                                            i3 = yfh0.tariff_card_info_icon;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i3, inflate2);
                                            if (appCompatImageView != null) {
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
                                                            RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i3, inflate2);
                                                            if (robotoTextView5 != null) {
                                                                i3 = yfh0.tariff_description_placeholder;
                                                                PlaceholderView placeholderView3 = (PlaceholderView) cma1.O(i3, inflate2);
                                                                if (placeholderView3 != null) {
                                                                    return new com.yandex.go.tariffcard.ui.adapter.header.multiclass.b(new wcx0((ConstraintLayout) inflate2, linearLayout, robotoTextView3, multiclassHeaderMapView, placeholderView, placeholderView2, flow, robotoTextView4, appCompatImageView, shimmeringRobotoTextView, shimmeringRobotoTextView2, shimmeringRobotoTextView3, robotoTextView5, placeholderView3), eVar2);
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
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                g0v g0vVar = (g0v) obj2;
                wls wlsVar2 = ((bpl0) obj3).b;
                return (wlsVar2 == null || (invoke = wlsVar2.invoke(num, g0vVar)) == null) ? Integer.valueOf(g0vVar.hashCode()) : invoke;
            case 11:
                ((Integer) obj2).getClass();
                o2b1.a((c911) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                ((c) obj3).a((fid) obj, vng.O(1));
                return zy11Var;
            case 13:
                vge vgeVar = (vge) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    v4v v4vVar = vgeVar.c;
                    if (v4vVar == null) {
                        btsVar3.e0(-1880609709);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-1880609708);
                        s3b1.f(v4vVar, null, null, btsVar3, 0, 6);
                        btsVar3.t(false);
                    }
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                a.a((xbu) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                com.yandex.go.information.presentation.a.e((vuv) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 16:
                muq0 muq0Var = (muq0) obj2;
                xtv xtvVar = new xtv(((Integer) obj).intValue(), "", muq0Var.a, InformationAnalyticsEvent$ItemType.LINK);
                ((h) obj3).d.getClass();
                return new ixq0(muq0Var.a, muq0Var.b, xtvVar);
            case 17:
                listAdapter$lambda$0 = InternetPaymentSelectProviderFragment.listAdapter$lambda$0((InternetPaymentSelectProviderFragment) obj3, (bj01) obj, ((Integer) obj2).intValue());
                return listAdapter$lambda$0;
            case 18:
                ListItemComponent listItemComponent = (ListItemComponent) obj3;
                listItemComponent.setTitle((CharSequence) obj);
                listItemComponent.setSubtitle((CharSequence) obj2);
                return zy11Var;
            case 19:
                yvy yvyVar = (yvy) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ymb1.e(yvyVar.a, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar4, 0, 0, 65534);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 20:
                ((yly0) obj3).b(((wu60) obj2).a);
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                f.b((v33) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                rhb1.c((s2v0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.a.b((ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.b) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                mdd0.g(((com.yandex.plus.pay.internal.feature.closing.b) obj3).d, PayCoreLogTag.CLOSING_OFFER, "Failed to get closing offer", (PlusPayException) obj2, 8);
                return zy11Var;
            case 25:
                mdd0.g(((com.yandex.plus.pay.internal.feature.counter_offers.b) obj3).d, PayCoreLogTag.COUNTER_OFFERS, "Failed to get counter offers", (PlusPayException) obj2, 8);
                return zy11Var;
            case 26:
                mdd0.g(((com.yandex.plus.pay.internal.feature.presale.b) obj3).d, PayCoreLogTag.PRESALE, "Failed to get presale", (PlusPayException) obj2, 8);
                return zy11Var;
            case 27:
                recyclerAdapter_delegate$lambda$3$lambda$1 = MerchantOffersFragment.recyclerAdapter_delegate$lambda$3$lambda$1((MerchantOffersFragment) obj3, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(recyclerAdapter_delegate$lambda$3$lambda$1);
            case 28:
                adapter_delegate$lambda$3$lambda$1 = MerchantOffersSearchFragment.adapter_delegate$lambda$3$lambda$1((MerchantOffersSearchFragment) obj3, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(adapter_delegate$lambda$3$lambda$1);
            default:
                adapter_delegate$lambda$1$lambda$0 = MerchantOffersTestSearchFragment.adapter_delegate$lambda$1$lambda$0((MerchantOffersTestSearchFragment) obj3, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(adapter_delegate$lambda$1$lambda$0);
        }
    }

    public /* synthetic */ bns(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ bns(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
