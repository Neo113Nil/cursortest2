package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.a;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsDataSource;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenButtonV5;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferBottomComponent;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.chargers.order.active.q;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationUsageInstructionView;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.dto.response.Action$ChargersDiscounts;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.FormEventType;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.h;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class hh8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hh8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0407, code lost:
    
        if (r8.equals("amex") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0443, code lost:
    
        r8 = com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork.AMEX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0440, code lost:
    
        if (r8.equals("american express") == false) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        CardNetwork cardNetwork;
        zy11 onCreate$lambda$0;
        zy11 delegatorsHelper$lambda$0;
        ChargersDiscountTypeDto chargersDiscountTypeDto;
        zy11 promoPlate$lambda$0$1;
        zy11 onAttachedToWindow$lambda$1;
        g18 adapter$lambda$0$1;
        zy11 lambda$0$0;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj3;
                et5 et5Var = (et5) obj;
                ot5 ot5Var = (ot5) obj2;
                aVar.r = et5Var;
                aVar.s = ot5Var;
                dk8 dk8Var = aVar.c;
                String str = et5Var.a;
                dk8Var.getClass();
                String lowerCase = str.toLowerCase(Locale.ROOT);
                switch (lowerCase.hashCode()) {
                    case -2038717326:
                        if (lowerCase.equals("mastercard")) {
                            cardNetwork = CardNetwork.MASTERCARD;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case -1120637072:
                        break;
                    case -829640907:
                        if (lowerCase.equals("uzcard")) {
                            cardNetwork = CardNetwork.UZCARD;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case -296504455:
                        if (lowerCase.equals("unionpay")) {
                            cardNetwork = CardNetwork.UNIONPAY;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case 105033:
                        if (lowerCase.equals("jcb")) {
                            cardNetwork = CardNetwork.JCB;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case 108118:
                        if (lowerCase.equals("mir")) {
                            cardNetwork = CardNetwork.MIR;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case 2997727:
                        break;
                    case 3619905:
                        if (lowerCase.equals("visa")) {
                            cardNetwork = CardNetwork.VISA;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case 273184745:
                        if (lowerCase.equals("discover")) {
                            cardNetwork = CardNetwork.DISCOVER;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case 307925729:
                        if (lowerCase.equals("visa electron")) {
                            cardNetwork = CardNetwork.VISAELECTRON;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case 553531135:
                        if (lowerCase.equals("humocard")) {
                            cardNetwork = CardNetwork.HUMOCARD;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    case 827497775:
                        if (lowerCase.equals("maestro")) {
                            cardNetwork = CardNetwork.MAESTRO;
                            break;
                        }
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                    default:
                        cardNetwork = CardNetwork.UNKNOWN;
                        break;
                }
                a.i(aVar, cardNetwork, 2);
                kzo kzoVar = aVar.y;
                sg8 sg8Var = (sg8) aVar.n.getValue();
                String str2 = ot5Var.a;
                if (kzoVar.b) {
                    String str3 = ot5Var.b;
                    if (str3.length() > 6) {
                        str3 = gvu0.A0(6, str3).concat("**");
                    }
                    CardNetwork cardNetwork2 = ((lk8) kzoVar.w).a(str2).a;
                    if (cardNetwork2 == CardNetwork.UNKNOWN) {
                        cardNetwork2 = null;
                    }
                    String stringCode = cardNetwork2 != null ? cardNetwork2.getStringCode() : null;
                    Boolean valueOf = stringCode != null ? Boolean.valueOf(stringCode.equals(str)) : null;
                    int length = str2.length();
                    DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource = sg8Var.e != null ? DynamicBinInfoAnalyticsDataSource.DIEHARD : sg8Var.d != 0 ? DynamicBinInfoAnalyticsDataSource.LOCAL : null;
                    z22 z22Var = (z22) kzoVar.c;
                    DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource2 = DynamicBinInfoAnalyticsDataSource.DIEHARD;
                    long j = ot5Var.d;
                    String a = DynamicBinInfoEventName.DATA_APPLIED.a();
                    MapBuilder mapBuilder = new MapBuilder();
                    mapBuilder.put(AppSettingsContract$Setting.COLUMN_PREFIX, str3);
                    mapBuilder.put("payment_system", str);
                    mapBuilder.put("data_source", dynamicBinInfoAnalyticsDataSource2.getValue());
                    mapBuilder.put("has_icon", String.valueOf(dynamicBinInfoAnalyticsDataSource != null));
                    mapBuilder.put("card_number_length", String.valueOf(length));
                    mapBuilder.put("time_since_request_start_ms", String.valueOf(System.currentTimeMillis() - j));
                    String obj4 = dynamicBinInfoAnalyticsDataSource != null ? dynamicBinInfoAnalyticsDataSource.toString() : null;
                    if (obj4 != null) {
                        mapBuilder.put("icon_source", obj4);
                    }
                    if (stringCode != null) {
                        mapBuilder.put("static_payment_system", stringCode);
                    }
                    String bool = valueOf != null ? valueOf.toString() : null;
                    if (bool != null) {
                        mapBuilder.put("systems_match", bool);
                    }
                    yz91.c(z22Var, new li3(i2, a, mapBuilder.j()), true);
                }
                return zy11Var;
            case 1:
                onCreate$lambda$0 = CardLimitFragment.onCreate$lambda$0((CardLimitFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$0;
            case 2:
                qt8 qt8Var = (qt8) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    mn91.a(qt8Var.a, qt8Var.b, qt8Var.d, qt8Var.c, qt8Var.f, qt8Var.e, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 3:
                tt8 tt8Var = (tt8) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    mn91.c(tt8Var.a, btsVar2, 0);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 4:
                st8 st8Var = (st8) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    mn91.b(st8Var.a, st8Var.b, st8Var.c, st8Var.d, btsVar3, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 5:
                h hVar = (h) obj3;
                if (((Lifecycle.Event) obj2) == Lifecycle.Event.ON_STOP) {
                    ue11 ue11Var = hVar.D;
                    ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.a aVar2 = ue11Var.c;
                    o4 o4Var = (o4) aVar2.j.a.getValue();
                    if (o4Var != null) {
                        aVar2.e(o4Var);
                    }
                    ue11Var.a(FormEventType.APP_ENTERED_BACKGROUND);
                }
                return zy11Var;
            case 6:
                hz8 hz8Var = (hz8) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar4.T);
                    r1b0 o = btsVar4.o();
                    f530 d2 = b.d(btsVar4, c530.a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, d);
                    qje.W(btsVar4, d.e, o);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d2);
                    btsVar4.e0(2140599465);
                    List list = hz8Var.a.a;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a.c((hx8) list.get(i3), null, null, btsVar4, 0, 6);
                    }
                    btsVar4.t(false);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                ngb1.b((t09) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                delegatorsHelper$lambda$0 = CashbackCategoriesFragment.delegatorsHelper$lambda$0((CashbackCategoriesFragment) obj3, (CashbackSelectorCategoryEntity) obj, ((Boolean) obj2).booleanValue());
                return delegatorsHelper$lambda$0;
            case 9:
                return c.u((View) obj3, dwh0.summary_accessibility_tariff_plus_amount, ((Integer) obj).intValue(), (String) obj2);
            case 10:
                return ((avj0) ((x29) obj3).a).a.getResources().getQuantityString(dwh0.summary_accessibility_tariff_plus_amount, ((Integer) obj).intValue(), Arrays.copyOf(new Object[]{(String) obj2}, 1));
            case 11:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.a.a((ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.d) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((q) obj3).getClass();
                return Boolean.valueOf(q.Lg((List) obj).equals(q.Lg((List) obj2)));
            case 13:
                ((Integer) obj2).getClass();
                zr9.a((sr9) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                nhb1.a((vv9) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                bx9 bx9Var = (bx9) obj3;
                Action$ChargersDiscounts.ChargersDiscountType chargersDiscountType = (Action$ChargersDiscounts.ChargersDiscountType) obj;
                String str4 = (String) obj2;
                int i4 = chargersDiscountType == null ? -1 : kx9.a[chargersDiscountType.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        chargersDiscountTypeDto = ChargersDiscountTypeDto.PROMOCODE;
                    } else if (i4 == 2) {
                        chargersDiscountTypeDto = ChargersDiscountTypeDto.DISCOUNT;
                    } else if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    ir9 ir9Var = str4 != null ? new ir9(chargersDiscountTypeDto, str4, null) : null;
                    bx9Var.E.a(ChargersAnalytics$ChargersMainScreenButtonV5.DiscountsAndPromocodes);
                    ((hx9) bx9Var.D.b).r(new fx9(ir9Var, r4 ? 1 : 0));
                    return zy11Var;
                }
                chargersDiscountTypeDto = ChargersDiscountTypeDto.EMPTY;
                if (str4 != null) {
                }
                bx9Var.E.a(ChargersAnalytics$ChargersMainScreenButtonV5.DiscountsAndPromocodes);
                ((hx9) bx9Var.D.b).r(new fx9(ir9Var, r4 ? 1 : 0));
                return zy11Var;
            case 16:
                promoPlate$lambda$0$1 = ChargersOfferBottomComponent.setPromoPlate$lambda$0$1((ChargersOfferBottomComponent) obj3, (String) obj, ((Boolean) obj2).booleanValue());
                return promoPlate$lambda$0$1;
            case 17:
                ((Integer) obj2).getClass();
                fib1.a((y7a) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                onAttachedToWindow$lambda$1 = ChargersOfferModalView.onAttachedToWindow$lambda$1((ChargersOfferModalView) obj3, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return onAttachedToWindow$lambda$1;
            case 19:
                ((Integer) obj2).getClass();
                qib1.c((z3w) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                gjb1.a((kna) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                jjb1.b((pna) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 22:
                adapter$lambda$0$1 = ChargersStationUsageInstructionView.adapter$lambda$0$1((ChargersStationUsageInstructionView) obj3, (ListItemComponent) obj, (xsa) obj2);
                return adapter$lambda$0$1;
            case 23:
                ((Integer) obj2).getClass();
                mjb1.c((vua) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                mjb1.b((uua) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.surge.info.d.b((xva) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.surge.info.d.c((gwa) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                ckb1.b((uwa) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                lambda$0$0 = ChargersTariffsView.lambda$0$0((ChargersTariffsView) obj3, (bya) obj, (twa) obj2);
                return lambda$0$0;
            default:
                ((Integer) obj2).getClass();
                ikb1.a((mya) obj3, (fid) obj, vng.O(9));
                return zy11Var;
        }
    }

    public /* synthetic */ hh8(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
