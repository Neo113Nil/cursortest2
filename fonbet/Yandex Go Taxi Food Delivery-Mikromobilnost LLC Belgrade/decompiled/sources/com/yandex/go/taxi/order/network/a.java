package com.yandex.go.taxi.order.network;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.inapp_calls.experiment.p;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;
import com.yandex.go.taxi.auction.data.request.FullAuctionParam;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.affiliate.AffiliateInfo;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.go.taxi.order.models.api.preorder.Transfer;
import com.yandex.go.taxi.order.models.api.preorder.delivery.AddressDeliveryInfo;
import com.yandex.go.taxi.order.models.api.preorder.delivery.RouteDeliveryInfo;
import com.yandex.go.taxi.order.models.api.preorder.extraphone.ExtraPhoneContact;
import com.yandex.go.taxi.order.models.api.preorder.intercity.IntercityPreorderInfo;
import com.yandex.go.taxi.order.models.api.preorder.requirements.RequirementAddressInfo;
import com.yandex.go.taxi.order.models.api.preorder.requirements.RequirementAddressRouteInfo;
import defpackage.a3y0;
import defpackage.acz;
import defpackage.b580;
import defpackage.b64;
import defpackage.bgb0;
import defpackage.bgq0;
import defpackage.cu70;
import defpackage.d0l0;
import defpackage.d1t;
import defpackage.d9w;
import defpackage.dni;
import defpackage.e9w;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.fs70;
import defpackage.fu70;
import defpackage.gsi;
import defpackage.gu70;
import defpackage.gw00;
import defpackage.gwk0;
import defpackage.h3y;
import defpackage.hqj0;
import defpackage.i4u;
import defpackage.iu70;
import defpackage.ju70;
import defpackage.jve;
import defpackage.lcj0;
import defpackage.lv90;
import defpackage.lvp0;
import defpackage.mbj0;
import defpackage.mu70;
import defpackage.ny61;
import defpackage.pv70;
import defpackage.rcc;
import defpackage.rfa0;
import defpackage.ri1;
import defpackage.rkv;
import defpackage.rpj0;
import defpackage.rq80;
import defpackage.sfa0;
import defpackage.tcc;
import defpackage.ucj0;
import defpackage.uzs;
import defpackage.vsi;
import defpackage.w511;
import defpackage.wb80;
import defpackage.wnt;
import defpackage.wt70;
import defpackage.wwf;
import defpackage.xku0;
import defpackage.xnt;
import defpackage.ylw;
import defpackage.ysi;
import defpackage.yxf0;
import defpackage.z580;
import defpackage.zt70;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.net.taxi.dto.request.OrderDraftParam$CallTypePreferences;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class a implements iu70 {
    public final h3y a;
    public final h3y b;
    public final d1t c;
    public final sfa0 d;
    public final rq80 e;
    public final acz f;
    public final wnt g;
    public final i4u h;
    public final rkv i;
    public final p j;
    public final a3y0 k = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderDraftParamsCollector");

    public a(h3y h3yVar, h3y h3yVar2, d1t d1tVar, sfa0 sfa0Var, rq80 rq80Var, acz aczVar, wnt wntVar, i4u i4uVar, rkv rkvVar, p pVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = d1tVar;
        this.d = sfa0Var;
        this.e = rq80Var;
        this.f = aczVar;
        this.g = wntVar;
        this.h = i4uVar;
        this.i = rkvVar;
        this.j = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x00f3, code lost:
    
        if (defpackage.lvp0.a(r8, r14) != null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x068a A[EDGE_INSN: B:174:0x068a->B:134:0x068a BREAK  A[LOOP:2: B:163:0x0655->B:173:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x055e A[LOOP:4: B:198:0x0558->B:200:0x055e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01ab A[LOOP:8: B:285:0x01a5->B:287:0x01ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [zt70] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r14v15, types: [fck0] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Preorder preorder, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        OrderDraftParamsCollectorImpl$composeOrderDraftParam$2 orderDraftParamsCollectorImpl$composeOrderDraftParam$2;
        int i;
        OrderDraftParam$CallTypePreferences orderDraftParam$CallTypePreferences;
        boolean e;
        String str4;
        String str5;
        Calendar calendar;
        EmptyList emptyList;
        yxf0 yxf0Var;
        d0l0 d0l0Var;
        RequirementAddressRouteInfo requirementAddressRouteInfo;
        String str6;
        String str7;
        String str8;
        String str9;
        Object a;
        Iterator it;
        RequirementAddressInfo requirementAddressInfo;
        d0l0 d0l0Var2;
        Address b;
        RequirementAddressInfo requirementAddressInfo2;
        String str10;
        String str11;
        String str12;
        boolean z;
        Address h;
        AddressDeliveryInfo addressDeliveryInfo;
        List list;
        List list2;
        boolean z2;
        boolean z3;
        OrderDraftParam$CallTypePreferences orderDraftParam$CallTypePreferences2;
        OrderDraftParam$CallTypePreferences orderDraftParam$CallTypePreferences3;
        Calendar g;
        int d;
        Iterator it2;
        lv90 c;
        PaymentMethod$Type paymentMethod$Type;
        lv90 lv90Var;
        String str13;
        int i2;
        String str14;
        String str15;
        int i3;
        boolean z4;
        rfa0 b2;
        zt70 zt70Var;
        Double d2;
        PaymentMethod$Type paymentMethod$Type2;
        jve b3;
        Iterator it3;
        Iterator it4;
        ArrayList arrayList;
        Address address;
        boolean z5;
        FullAuctionParam fullAuctionParam;
        Location a2;
        zzs zzsVar;
        Set set;
        Iterator it5;
        bgq0 bgq0Var;
        wb80 wb80Var;
        Transfer.ManualLookup manualLookup;
        Boolean bool;
        Preorder preorder2 = preorder;
        EmptyList emptyList2 = EmptyList.a;
        if (continuationImpl instanceof OrderDraftParamsCollectorImpl$composeOrderDraftParam$2) {
            orderDraftParamsCollectorImpl$composeOrderDraftParam$2 = (OrderDraftParamsCollectorImpl$composeOrderDraftParam$2) continuationImpl;
            int i4 = orderDraftParamsCollectorImpl$composeOrderDraftParam$2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                orderDraftParamsCollectorImpl$composeOrderDraftParam$2.label = i4 - Integer.MIN_VALUE;
                Object obj = orderDraftParamsCollectorImpl$composeOrderDraftParam$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDraftParamsCollectorImpl$composeOrderDraftParam$2.label;
                Calendar calendar2 = null;
                orderDraftParam$CallTypePreferences = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e = ((com.yandex.go.geosharing.controller.e) this.c).e();
                    pv70 pv70Var = preorder2.M;
                    ExtraPhoneContact extraPhoneContact = preorder2.N;
                    if (extraPhoneContact != null && !evu0.J(extraPhoneContact.b)) {
                        str4 = bgb0.e(extraPhoneContact.b);
                        str5 = extraPhoneContact.a;
                    } else if (pv70Var != null) {
                        String b4 = pv70Var.b();
                        str5 = pv70Var.c();
                        str4 = b4;
                    } else {
                        str4 = null;
                        str5 = null;
                    }
                    wwf wwfVar = ((z580) this.b.get()).m;
                    wwfVar.getClass();
                    d0l0 d0l0Var3 = preorder2.G;
                    String str16 = preorder2.O.a;
                    RouteDeliveryInfo routeDeliveryInfo = preorder2.H;
                    Iterator it6 = d0l0Var3.a().iterator();
                    while (it6.hasNext()) {
                        ((Address) it6.next()).b2(null);
                        calendar2 = calendar2;
                    }
                    calendar = calendar2;
                    if (str16 != null && ((gsi) wwfVar.a).g(str16) && routeDeliveryInfo != null) {
                        vsi e2 = ((gsi) wwfVar.a).e(str16);
                        List list3 = preorder2.x;
                        ysi ysiVar = e2.m;
                        if (ysiVar != null) {
                            lvp0 lvp0Var = (lvp0) wwfVar.b;
                            String str17 = ysiVar.a;
                            lvp0Var.getClass();
                        }
                        if (e2.n) {
                            z = false;
                            h = d0l0Var3.h();
                            addressDeliveryInfo = routeDeliveryInfo.a;
                            if (addressDeliveryInfo != null && h != null) {
                                ((dni) wwfVar.c).getClass();
                                h.b2(dni.a(addressDeliveryInfo, z));
                            }
                            list = d0l0Var3.b;
                            list2 = routeDeliveryInfo.b;
                            if (list2 != null && !list2.isEmpty()) {
                                if (list.size() != list2.size()) {
                                    int size = list.size();
                                    int i5 = 0;
                                    while (i5 < size) {
                                        Address address2 = (Address) list.get(i5);
                                        dni dniVar = (dni) wwfVar.c;
                                        EmptyList emptyList3 = emptyList2;
                                        AddressDeliveryInfo addressDeliveryInfo2 = (AddressDeliveryInfo) list2.get(i5);
                                        dniVar.getClass();
                                        address2.b2(dni.a(addressDeliveryInfo2, z));
                                        i5++;
                                        emptyList2 = emptyList3;
                                    }
                                } else {
                                    emptyList = emptyList2;
                                    Address address3 = (Address) b64.c(1, list);
                                    dni dniVar2 = (dni) wwfVar.c;
                                    AddressDeliveryInfo addressDeliveryInfo3 = (AddressDeliveryInfo) b64.c(1, list2);
                                    dniVar2.getClass();
                                    address3.b2(dni.a(addressDeliveryInfo3, z));
                                    yxf0Var = ((z580) this.b.get()).n;
                                    yxf0Var.getClass();
                                    d0l0Var = preorder2.G;
                                    requirementAddressRouteInfo = preorder2.K;
                                    if (((lcj0) yxf0Var.b).b().b && requirementAddressRouteInfo != null) {
                                        it = d0l0Var.a().iterator();
                                        while (it.hasNext()) {
                                            ((Address) it.next()).b2(null);
                                        }
                                        Address h2 = d0l0Var.h();
                                        requirementAddressInfo = requirementAddressRouteInfo.a;
                                        if (requirementAddressInfo != null || h2 == null) {
                                            d0l0Var2 = d0l0Var;
                                        } else {
                                            ((ucj0) yxf0Var.a).getClass();
                                            String str18 = requirementAddressInfo.a;
                                            if (str18 == null) {
                                                str18 = "";
                                            }
                                            String str19 = requirementAddressInfo.b;
                                            if (str19 == null) {
                                                str19 = "";
                                            }
                                            d0l0Var2 = d0l0Var;
                                            String str20 = requirementAddressInfo.c;
                                            if (str20 == null) {
                                                str20 = "";
                                            }
                                            String str21 = requirementAddressInfo.d;
                                            if (str21 == null) {
                                                str21 = "";
                                            }
                                            h2.b2(new mu70(str18, str19, str20, str21));
                                        }
                                        b = d0l0Var2.b();
                                        requirementAddressInfo2 = requirementAddressRouteInfo.b;
                                        if (requirementAddressInfo2 != null && b != null) {
                                            ((ucj0) yxf0Var.a).getClass();
                                            str10 = requirementAddressInfo2.a;
                                            if (str10 == null) {
                                                str10 = "";
                                            }
                                            str11 = requirementAddressInfo2.b;
                                            if (str11 == null) {
                                                str11 = "";
                                            }
                                            str12 = requirementAddressInfo2.c;
                                            if (str12 == null) {
                                                str12 = "";
                                            }
                                            String str22 = requirementAddressInfo2.d;
                                            b.b2(new mu70(str10, str11, str12, str22 != null ? str22 : ""));
                                        }
                                    }
                                    if (((InAppOnlySettingsToggleExperiment) this.i.a.b()).b) {
                                        orderDraftParam$CallTypePreferences = null;
                                        str6 = str;
                                        str7 = str2;
                                        str8 = str5;
                                        str9 = str3;
                                        z2 = false;
                                        boolean z6 = e;
                                        String str23 = str9;
                                        String str24 = str7;
                                        String str25 = str6;
                                        z3 = !z2 && ((z580) this.b.get()).a.a("FIELD_INAPP_ONLY_CALLS", false);
                                        boolean z7 = z3 && ((z580) this.b.get()).a.a("FIELD_DONT_CALL", false);
                                        if (!z3) {
                                            orderDraftParam$CallTypePreferences3 = OrderDraftParam$CallTypePreferences.INAPP_ONLY;
                                        } else {
                                            if (!z7) {
                                                orderDraftParam$CallTypePreferences2 = orderDraftParam$CallTypePreferences;
                                                String Hg = ((z580) this.b.get()).d.Hg();
                                                Set set2 = preorder2.O.b;
                                                g = preorder2.g();
                                                if (g == null) {
                                                    Transfer transfer = preorder2.T;
                                                    g = transfer != null ? transfer.getA() : calendar;
                                                }
                                                String str26 = preorder2.S.c;
                                                Transfer transfer2 = preorder2.T;
                                                Object obj2 = transfer2 != null ? transfer2.b : orderDraftParam$CallTypePreferences;
                                                Transfer transfer3 = preorder2.T;
                                                ?? r29 = transfer3 != null ? transfer3.d : orderDraftParam$CallTypePreferences;
                                                List a3 = preorder2.G.a();
                                                String str27 = preorder2.b;
                                                String str28 = preorder2.a;
                                                rpj0 rpj0Var = RequirementsParam.Companion;
                                                List list4 = preorder2.x;
                                                String str29 = preorder2.y;
                                                rpj0Var.getClass();
                                                RequirementsParam a4 = rpj0.a(str29, list4);
                                                List list5 = preorder2.x;
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj3 : list5) {
                                                    String str30 = ((b580) obj3).f;
                                                    if (str30 != null && !evu0.J(str30)) {
                                                        arrayList2.add(obj3);
                                                    }
                                                }
                                                d = gw00.d(tcc.n(arrayList2, 10));
                                                if (d < 16) {
                                                    d = 16;
                                                }
                                                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                                it2 = arrayList2.iterator();
                                                while (it2.hasNext()) {
                                                    b580 b580Var = (b580) it2.next();
                                                    String str31 = b580Var.a;
                                                    String str32 = str25;
                                                    String str33 = b580Var.f;
                                                    if (str33 == null) {
                                                        ny61.g("Required value was null.");
                                                        return calendar;
                                                    }
                                                    Pair pair = new Pair(str31, new mbj0(str33));
                                                    linkedHashMap.put(pair.c(), pair.f());
                                                    str25 = str32;
                                                }
                                                String str34 = str25;
                                                LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
                                                c = preorder2.c();
                                                paymentMethod$Type = c.a;
                                                lv90Var = preorder2.w;
                                                if (lv90Var != null && preorder2.a0) {
                                                    paymentMethod$Type = lv90Var.a;
                                                    c = lv90Var;
                                                }
                                                PaymentMethod$Type paymentMethod$Type3 = paymentMethod$Type;
                                                if (lv90Var != null || preorder2.a0) {
                                                    lv90Var = preorder2.e();
                                                }
                                                ArrayList arrayList3 = new ArrayList();
                                                if (lv90Var != null) {
                                                    String str35 = lv90Var.b;
                                                    PaymentMethod$Type paymentMethod$Type4 = lv90Var.a;
                                                    str13 = Hg;
                                                    String str36 = lv90Var.c;
                                                    if (str35 != null && !evu0.J(str35) && paymentMethod$Type4 != null) {
                                                        arrayList3.add(new rfa0(paymentMethod$Type4, str35, str36, lv90Var.d, (List) null, 16));
                                                    }
                                                } else {
                                                    str13 = Hg;
                                                }
                                                i2 = paymentMethod$Type3 == null ? -1 : ju70.a[paymentMethod$Type3.ordinal()];
                                                if (i2 != -1) {
                                                    if (i2 == 1) {
                                                        this.d.getClass();
                                                        str14 = str27;
                                                        zt70Var = 0;
                                                        str15 = str28;
                                                        i3 = 10;
                                                        b2 = new rfa0(paymentMethod$Type3, (String) null, (String) null, (Boolean) null, arrayList3, 12);
                                                    } else if (i2 != 2) {
                                                        String str37 = c.b;
                                                        if (str37 == null || evu0.J(str37)) {
                                                            c(paymentMethod$Type3);
                                                            str14 = str27;
                                                            str15 = str28;
                                                            i3 = 10;
                                                            z4 = false;
                                                        } else {
                                                            this.d.getClass();
                                                            str14 = str27;
                                                            str15 = str28;
                                                            b2 = new rfa0(paymentMethod$Type3, str37, (String) null, (Boolean) null, arrayList3, 12);
                                                            i3 = 10;
                                                            zt70Var = 0;
                                                        }
                                                    } else if (str24 == null || evu0.J(str24)) {
                                                        c(paymentMethod$Type3);
                                                        str14 = str27;
                                                        str15 = str28;
                                                        i3 = 10;
                                                        z4 = false;
                                                    } else {
                                                        this.d.getClass();
                                                        str14 = str27;
                                                        str15 = str28;
                                                        b2 = new rfa0(paymentMethod$Type3, str24, (String) null, (Boolean) null, arrayList3, 12);
                                                        i3 = 10;
                                                        zt70Var = 0;
                                                    }
                                                    Tips tips = new Tips(((z580) this.b.get()).b.a.t());
                                                    ((z580) this.b.get()).f.getClass();
                                                    ri1 ri1Var = ((z580) this.b.get()).k;
                                                    AffiliateInfo affiliateInfo = !ri1Var.b.isEmpty() ? ri1Var.a : zt70Var;
                                                    d2 = new Double(preorder2.F);
                                                    if (d2.doubleValue() == -1.0d) {
                                                        d2 = zt70Var;
                                                    }
                                                    wt70 wt70Var = d2 == null ? new wt70(d2.doubleValue()) : zt70Var;
                                                    xku0 xku0Var = ((z580) this.b.get()).c;
                                                    fga0 fga0Var = xku0Var.a;
                                                    fga0Var.getClass();
                                                    paymentMethod$Type2 = PaymentMethod$Type.CORP;
                                                    CorpAccount j = fga0Var.j(fga0Var.q(paymentMethod$Type2));
                                                    b3 = j == null ? xku0Var.c.b(j) : null;
                                                    if (preorder2.h() == paymentMethod$Type2 && b3 != null) {
                                                        List list6 = b3.e;
                                                        ArrayList arrayList4 = new ArrayList();
                                                        for (Object obj4 : list6) {
                                                            if (((CostCenterField) obj4).c.contains(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                                                                arrayList4.add(obj4);
                                                            }
                                                        }
                                                        ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, i3));
                                                        it3 = arrayList4.iterator();
                                                        while (it3.hasNext()) {
                                                            CostCenterField costCenterField = (CostCenterField) it3.next();
                                                            String str38 = costCenterField.a;
                                                            arrayList5.add(new CostCenterParam(str38, costCenterField.b, preorder2.f(str38)));
                                                        }
                                                        ArrayList arrayList6 = new ArrayList();
                                                        it4 = arrayList5.iterator();
                                                        while (it4.hasNext()) {
                                                            Object next = it4.next();
                                                            if (((CostCenterParam) next).c != null ? !evu0.J(r13) : false) {
                                                                arrayList6.add(next);
                                                            }
                                                        }
                                                        arrayList = arrayList6;
                                                    } else {
                                                        arrayList = zt70Var;
                                                    }
                                                    boolean a5 = ((z580) this.b.get()).a.a("FIELD_DONT_SMS", false);
                                                    boolean booleanValue = ((Boolean) ((z580) this.b.get()).i.b.getValue()).booleanValue();
                                                    String d3 = preorder2.d();
                                                    EmptyList singletonList = preorder2.e0 ? Collections.singletonList("overdraft") : emptyList;
                                                    TollRoads tollRoads = preorder2.d0;
                                                    fu70 fu70Var = tollRoads == null ? zt70Var : new fu70(tollRoads.b, tollRoads.a);
                                                    String str39 = preorder2.W;
                                                    cu70 cu70Var = (preorder2.Z && (address = this.e.a) != null) ? new cu70(address.B(), address.d()) : zt70Var;
                                                    String str40 = preorder2.b0;
                                                    z5 = str40 != null;
                                                    if (!z5) {
                                                        fullAuctionParam = new FullAuctionParam(str40, preorder2.c0);
                                                    } else {
                                                        if (z5) {
                                                            w511.b();
                                                            return null;
                                                        }
                                                        fullAuctionParam = zt70Var;
                                                    }
                                                    a2 = this.f.a();
                                                    if (a2 == null) {
                                                        zzs.Companion.getClass();
                                                        zzsVar = uzs.b(a2);
                                                    } else {
                                                        zzsVar = zt70Var;
                                                    }
                                                    i4u i4uVar = this.h;
                                                    i4uVar.getClass();
                                                    set = preorder2.O.b;
                                                    if ((set instanceof Collection) || !set.isEmpty()) {
                                                        it5 = set.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                break;
                                                            }
                                                            String str41 = (String) it5.next();
                                                            e9w e9wVar = (e9w) ((d9w) i4uVar.a);
                                                            if (e9wVar.a((ylw) e9wVar.b.b(), str41) != null) {
                                                                IntercityPreorderInfo intercityPreorderInfo = preorder2.J;
                                                                if (intercityPreorderInfo != null && (bgq0Var = intercityPreorderInfo.a) != null) {
                                                                    wb80Var = new wb80(bgq0Var.a, bgq0Var.b);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    wb80Var = zt70Var;
                                                    String str42 = preorder2.V;
                                                    String str43 = !gwk0.v(str42) ? str42 : zt70Var;
                                                    String str44 = (str4 != null || evu0.J(str4)) ? zt70Var : str4;
                                                    String str45 = (str8 != null || evu0.J(str8)) ? zt70Var : str8;
                                                    ListBuilder a6 = rcc.a();
                                                    a6.add("code_dispatch");
                                                    if (((hqj0) this.a.get()).b().b) {
                                                        a6.add("requirements_v2");
                                                    }
                                                    ListBuilder j2 = a6.j();
                                                    Transfer transfer4 = preorder2.T;
                                                    manualLookup = transfer4 == null ? transfer4.c : zt70Var;
                                                    if (manualLookup != null && (bool = manualLookup.a) != null) {
                                                        zt70Var = new zt70(bool.booleanValue());
                                                    }
                                                    return new gu70(str13, str34, set2, g, str26, obj2, zt70Var, r29, a3, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a5, str23, booleanValue, d3, arrayList, wt70Var, affiliateInfo, tips, b2, a4, linkedHashMap2, str44, z6, str45, j2, fu70Var, str43, str39, cu70Var, fullAuctionParam, zzsVar, wb80Var);
                                                }
                                                str14 = str27;
                                                str15 = str28;
                                                i3 = 10;
                                                z4 = false;
                                                a3y0.m(this.k, "paymentParam", new IllegalStateException("Unexpected payment method is null"), calendar, 4);
                                                b2 = this.d.b(PaymentMethod$Type.CASH, null, null, null, null);
                                                zt70Var = z4;
                                                Tips tips2 = new Tips(((z580) this.b.get()).b.a.t());
                                                ((z580) this.b.get()).f.getClass();
                                                ri1 ri1Var2 = ((z580) this.b.get()).k;
                                                if (!ri1Var2.b.isEmpty()) {
                                                }
                                                d2 = new Double(preorder2.F);
                                                if (d2.doubleValue() == -1.0d) {
                                                }
                                                if (d2 == null) {
                                                }
                                                xku0 xku0Var2 = ((z580) this.b.get()).c;
                                                fga0 fga0Var2 = xku0Var2.a;
                                                fga0Var2.getClass();
                                                paymentMethod$Type2 = PaymentMethod$Type.CORP;
                                                CorpAccount j3 = fga0Var2.j(fga0Var2.q(paymentMethod$Type2));
                                                if (j3 == null) {
                                                }
                                                if (preorder2.h() == paymentMethod$Type2) {
                                                    List list62 = b3.e;
                                                    ArrayList arrayList42 = new ArrayList();
                                                    while (r10.hasNext()) {
                                                    }
                                                    ArrayList arrayList52 = new ArrayList(tcc.n(arrayList42, i3));
                                                    it3 = arrayList42.iterator();
                                                    while (it3.hasNext()) {
                                                    }
                                                    ArrayList arrayList62 = new ArrayList();
                                                    it4 = arrayList52.iterator();
                                                    while (it4.hasNext()) {
                                                    }
                                                    arrayList = arrayList62;
                                                    boolean a52 = ((z580) this.b.get()).a.a("FIELD_DONT_SMS", false);
                                                    boolean booleanValue2 = ((Boolean) ((z580) this.b.get()).i.b.getValue()).booleanValue();
                                                    String d32 = preorder2.d();
                                                    if (preorder2.e0) {
                                                    }
                                                    TollRoads tollRoads2 = preorder2.d0;
                                                    if (tollRoads2 == null) {
                                                    }
                                                    String str392 = preorder2.W;
                                                    if (preorder2.Z) {
                                                        String str402 = preorder2.b0;
                                                        if (str402 != null) {
                                                        }
                                                        if (!z5) {
                                                        }
                                                        a2 = this.f.a();
                                                        if (a2 == null) {
                                                        }
                                                        i4u i4uVar2 = this.h;
                                                        i4uVar2.getClass();
                                                        set = preorder2.O.b;
                                                        if (set instanceof Collection) {
                                                        }
                                                        it5 = set.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                            }
                                                        }
                                                        wb80Var = zt70Var;
                                                        String str422 = preorder2.V;
                                                        if (!gwk0.v(str422)) {
                                                        }
                                                        if (str4 != null) {
                                                        }
                                                        if (str8 != null) {
                                                        }
                                                        ListBuilder a62 = rcc.a();
                                                        a62.add("code_dispatch");
                                                        if (((hqj0) this.a.get()).b().b) {
                                                        }
                                                        ListBuilder j22 = a62.j();
                                                        Transfer transfer42 = preorder2.T;
                                                        if (transfer42 == null) {
                                                        }
                                                        if (manualLookup != null) {
                                                            zt70Var = new zt70(bool.booleanValue());
                                                        }
                                                        return new gu70(str13, str34, set2, g, str26, obj2, zt70Var, r29, a3, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a52, str23, booleanValue2, d32, arrayList, wt70Var, affiliateInfo, tips2, b2, a4, linkedHashMap2, str44, z6, str45, j22, fu70Var, str43, str392, cu70Var, fullAuctionParam, zzsVar, wb80Var);
                                                    }
                                                    String str4022 = preorder2.b0;
                                                    if (str4022 != null) {
                                                    }
                                                    if (!z5) {
                                                    }
                                                    a2 = this.f.a();
                                                    if (a2 == null) {
                                                    }
                                                    i4u i4uVar22 = this.h;
                                                    i4uVar22.getClass();
                                                    set = preorder2.O.b;
                                                    if (set instanceof Collection) {
                                                    }
                                                    it5 = set.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                        }
                                                    }
                                                    wb80Var = zt70Var;
                                                    String str4222 = preorder2.V;
                                                    if (!gwk0.v(str4222)) {
                                                    }
                                                    if (str4 != null) {
                                                    }
                                                    if (str8 != null) {
                                                    }
                                                    ListBuilder a622 = rcc.a();
                                                    a622.add("code_dispatch");
                                                    if (((hqj0) this.a.get()).b().b) {
                                                    }
                                                    ListBuilder j222 = a622.j();
                                                    Transfer transfer422 = preorder2.T;
                                                    if (transfer422 == null) {
                                                    }
                                                    if (manualLookup != null) {
                                                    }
                                                    return new gu70(str13, str34, set2, g, str26, obj2, zt70Var, r29, a3, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a52, str23, booleanValue2, d32, arrayList, wt70Var, affiliateInfo, tips2, b2, a4, linkedHashMap2, str44, z6, str45, j222, fu70Var, str43, str392, cu70Var, fullAuctionParam, zzsVar, wb80Var);
                                                }
                                                arrayList = zt70Var;
                                                boolean a522 = ((z580) this.b.get()).a.a("FIELD_DONT_SMS", false);
                                                boolean booleanValue22 = ((Boolean) ((z580) this.b.get()).i.b.getValue()).booleanValue();
                                                String d322 = preorder2.d();
                                                if (preorder2.e0) {
                                                }
                                                TollRoads tollRoads22 = preorder2.d0;
                                                if (tollRoads22 == null) {
                                                }
                                                String str3922 = preorder2.W;
                                                if (preorder2.Z) {
                                                }
                                                String str40222 = preorder2.b0;
                                                if (str40222 != null) {
                                                }
                                                if (!z5) {
                                                }
                                                a2 = this.f.a();
                                                if (a2 == null) {
                                                }
                                                i4u i4uVar222 = this.h;
                                                i4uVar222.getClass();
                                                set = preorder2.O.b;
                                                if (set instanceof Collection) {
                                                }
                                                it5 = set.iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                    }
                                                }
                                                wb80Var = zt70Var;
                                                String str42222 = preorder2.V;
                                                if (!gwk0.v(str42222)) {
                                                }
                                                if (str4 != null) {
                                                }
                                                if (str8 != null) {
                                                }
                                                ListBuilder a6222 = rcc.a();
                                                a6222.add("code_dispatch");
                                                if (((hqj0) this.a.get()).b().b) {
                                                }
                                                ListBuilder j2222 = a6222.j();
                                                Transfer transfer4222 = preorder2.T;
                                                if (transfer4222 == null) {
                                                }
                                                if (manualLookup != null) {
                                                }
                                                return new gu70(str13, str34, set2, g, str26, obj2, zt70Var, r29, a3, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a522, str23, booleanValue22, d322, arrayList, wt70Var, affiliateInfo, tips2, b2, a4, linkedHashMap2, str44, z6, str45, j2222, fu70Var, str43, str3922, cu70Var, fullAuctionParam, zzsVar, wb80Var);
                                            }
                                            orderDraftParam$CallTypePreferences3 = OrderDraftParam$CallTypePreferences.PREFER_DONT_CALL;
                                        }
                                        orderDraftParam$CallTypePreferences2 = orderDraftParam$CallTypePreferences3;
                                        String Hg2 = ((z580) this.b.get()).d.Hg();
                                        Set set22 = preorder2.O.b;
                                        g = preorder2.g();
                                        if (g == null) {
                                        }
                                        String str262 = preorder2.S.c;
                                        Transfer transfer22 = preorder2.T;
                                        if (transfer22 != null) {
                                        }
                                        Transfer transfer32 = preorder2.T;
                                        if (transfer32 != null) {
                                        }
                                        List a32 = preorder2.G.a();
                                        String str272 = preorder2.b;
                                        String str282 = preorder2.a;
                                        rpj0 rpj0Var2 = RequirementsParam.Companion;
                                        List list42 = preorder2.x;
                                        String str292 = preorder2.y;
                                        rpj0Var2.getClass();
                                        RequirementsParam a42 = rpj0.a(str292, list42);
                                        List list52 = preorder2.x;
                                        ArrayList arrayList22 = new ArrayList();
                                        while (r13.hasNext()) {
                                        }
                                        d = gw00.d(tcc.n(arrayList22, 10));
                                        if (d < 16) {
                                        }
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
                                        it2 = arrayList22.iterator();
                                        while (it2.hasNext()) {
                                        }
                                        String str342 = str25;
                                        if (linkedHashMap3.isEmpty()) {
                                        }
                                        c = preorder2.c();
                                        paymentMethod$Type = c.a;
                                        lv90Var = preorder2.w;
                                        if (lv90Var != null) {
                                            paymentMethod$Type = lv90Var.a;
                                            c = lv90Var;
                                        }
                                        PaymentMethod$Type paymentMethod$Type32 = paymentMethod$Type;
                                        if (lv90Var != null) {
                                        }
                                        lv90Var = preorder2.e();
                                        ArrayList arrayList32 = new ArrayList();
                                        if (lv90Var != null) {
                                        }
                                        if (paymentMethod$Type32 == null) {
                                        }
                                        if (i2 != -1) {
                                        }
                                        b2 = this.d.b(PaymentMethod$Type.CASH, null, null, null, null);
                                        zt70Var = z4;
                                        Tips tips22 = new Tips(((z580) this.b.get()).b.a.t());
                                        ((z580) this.b.get()).f.getClass();
                                        ri1 ri1Var22 = ((z580) this.b.get()).k;
                                        if (!ri1Var22.b.isEmpty()) {
                                        }
                                        d2 = new Double(preorder2.F);
                                        if (d2.doubleValue() == -1.0d) {
                                        }
                                        if (d2 == null) {
                                        }
                                        xku0 xku0Var22 = ((z580) this.b.get()).c;
                                        fga0 fga0Var22 = xku0Var22.a;
                                        fga0Var22.getClass();
                                        paymentMethod$Type2 = PaymentMethod$Type.CORP;
                                        CorpAccount j32 = fga0Var22.j(fga0Var22.q(paymentMethod$Type2));
                                        if (j32 == null) {
                                        }
                                        if (preorder2.h() == paymentMethod$Type2) {
                                        }
                                        arrayList = zt70Var;
                                        boolean a5222 = ((z580) this.b.get()).a.a("FIELD_DONT_SMS", false);
                                        boolean booleanValue222 = ((Boolean) ((z580) this.b.get()).i.b.getValue()).booleanValue();
                                        String d3222 = preorder2.d();
                                        if (preorder2.e0) {
                                        }
                                        TollRoads tollRoads222 = preorder2.d0;
                                        if (tollRoads222 == null) {
                                        }
                                        String str39222 = preorder2.W;
                                        if (preorder2.Z) {
                                        }
                                        String str402222 = preorder2.b0;
                                        if (str402222 != null) {
                                        }
                                        if (!z5) {
                                        }
                                        a2 = this.f.a();
                                        if (a2 == null) {
                                        }
                                        i4u i4uVar2222 = this.h;
                                        i4uVar2222.getClass();
                                        set = preorder2.O.b;
                                        if (set instanceof Collection) {
                                        }
                                        it5 = set.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                            }
                                        }
                                        wb80Var = zt70Var;
                                        String str422222 = preorder2.V;
                                        if (!gwk0.v(str422222)) {
                                        }
                                        if (str4 != null) {
                                        }
                                        if (str8 != null) {
                                        }
                                        ListBuilder a62222 = rcc.a();
                                        a62222.add("code_dispatch");
                                        if (((hqj0) this.a.get()).b().b) {
                                        }
                                        ListBuilder j22222 = a62222.j();
                                        Transfer transfer42222 = preorder2.T;
                                        if (transfer42222 == null) {
                                        }
                                        if (manualLookup != null) {
                                        }
                                        return new gu70(str13, str342, set22, g, str262, obj2, zt70Var, r29, a32, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a5222, str23, booleanValue222, d3222, arrayList, wt70Var, affiliateInfo, tips22, b2, a42, linkedHashMap2, str44, z6, str45, j22222, fu70Var, str43, str39222, cu70Var, fullAuctionParam, zzsVar, wb80Var);
                                    }
                                    p pVar = this.j;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$0 = preorder2;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$1 = str;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$2 = str2;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$3 = str3;
                                    orderDraftParam$CallTypePreferences = null;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$4 = null;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$5 = null;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$6 = str4;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$7 = str5;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.Z$0 = e;
                                    orderDraftParamsCollectorImpl$composeOrderDraftParam$2.label = 1;
                                    a = pVar.a(orderDraftParamsCollectorImpl$composeOrderDraftParam$2);
                                    if (a == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    str6 = str;
                                    str7 = str2;
                                    str8 = str5;
                                    str9 = str3;
                                }
                            }
                        }
                        z = true;
                        h = d0l0Var3.h();
                        addressDeliveryInfo = routeDeliveryInfo.a;
                        if (addressDeliveryInfo != null) {
                            ((dni) wwfVar.c).getClass();
                            h.b2(dni.a(addressDeliveryInfo, z));
                        }
                        list = d0l0Var3.b;
                        list2 = routeDeliveryInfo.b;
                        if (list2 != null) {
                            if (list.size() != list2.size()) {
                            }
                        }
                    }
                    emptyList = emptyList2;
                    yxf0Var = ((z580) this.b.get()).n;
                    yxf0Var.getClass();
                    d0l0Var = preorder2.G;
                    requirementAddressRouteInfo = preorder2.K;
                    if (((lcj0) yxf0Var.b).b().b) {
                        it = d0l0Var.a().iterator();
                        while (it.hasNext()) {
                        }
                        Address h22 = d0l0Var.h();
                        requirementAddressInfo = requirementAddressRouteInfo.a;
                        if (requirementAddressInfo != null) {
                        }
                        d0l0Var2 = d0l0Var;
                        b = d0l0Var2.b();
                        requirementAddressInfo2 = requirementAddressRouteInfo.b;
                        if (requirementAddressInfo2 != null) {
                            ((ucj0) yxf0Var.a).getClass();
                            str10 = requirementAddressInfo2.a;
                            if (str10 == null) {
                            }
                            str11 = requirementAddressInfo2.b;
                            if (str11 == null) {
                            }
                            str12 = requirementAddressInfo2.c;
                            if (str12 == null) {
                            }
                            String str222 = requirementAddressInfo2.d;
                            b.b2(new mu70(str10, str11, str12, str222 != null ? str222 : ""));
                        }
                    }
                    if (((InAppOnlySettingsToggleExperiment) this.i.a.b()).b) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z8 = orderDraftParamsCollectorImpl$composeOrderDraftParam$2.Z$0;
                    str8 = (String) orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$7;
                    str4 = (String) orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$6;
                    str9 = (String) orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$3;
                    str7 = (String) orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$2;
                    str6 = (String) orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$1;
                    Preorder preorder3 = (Preorder) orderDraftParamsCollectorImpl$composeOrderDraftParam$2.L$0;
                    kotlin.b.b(obj);
                    emptyList = emptyList2;
                    calendar = null;
                    a = obj;
                    e = z8;
                    preorder2 = preorder3;
                }
                if (((Boolean) a).booleanValue()) {
                    z2 = true;
                    boolean z62 = e;
                    String str232 = str9;
                    String str242 = str7;
                    String str252 = str6;
                    if (z2) {
                    }
                    if (z3) {
                    }
                    if (!z3) {
                    }
                    orderDraftParam$CallTypePreferences2 = orderDraftParam$CallTypePreferences3;
                    String Hg22 = ((z580) this.b.get()).d.Hg();
                    Set set222 = preorder2.O.b;
                    g = preorder2.g();
                    if (g == null) {
                    }
                    String str2622 = preorder2.S.c;
                    Transfer transfer222 = preorder2.T;
                    if (transfer222 != null) {
                    }
                    Transfer transfer322 = preorder2.T;
                    if (transfer322 != null) {
                    }
                    List a322 = preorder2.G.a();
                    String str2722 = preorder2.b;
                    String str2822 = preorder2.a;
                    rpj0 rpj0Var22 = RequirementsParam.Companion;
                    List list422 = preorder2.x;
                    String str2922 = preorder2.y;
                    rpj0Var22.getClass();
                    RequirementsParam a422 = rpj0.a(str2922, list422);
                    List list522 = preorder2.x;
                    ArrayList arrayList222 = new ArrayList();
                    while (r13.hasNext()) {
                    }
                    d = gw00.d(tcc.n(arrayList222, 10));
                    if (d < 16) {
                    }
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap(d);
                    it2 = arrayList222.iterator();
                    while (it2.hasNext()) {
                    }
                    String str3422 = str252;
                    if (linkedHashMap32.isEmpty()) {
                    }
                    c = preorder2.c();
                    paymentMethod$Type = c.a;
                    lv90Var = preorder2.w;
                    if (lv90Var != null) {
                    }
                    PaymentMethod$Type paymentMethod$Type322 = paymentMethod$Type;
                    if (lv90Var != null) {
                    }
                    lv90Var = preorder2.e();
                    ArrayList arrayList322 = new ArrayList();
                    if (lv90Var != null) {
                    }
                    if (paymentMethod$Type322 == null) {
                    }
                    if (i2 != -1) {
                    }
                    b2 = this.d.b(PaymentMethod$Type.CASH, null, null, null, null);
                    zt70Var = z4;
                    Tips tips222 = new Tips(((z580) this.b.get()).b.a.t());
                    ((z580) this.b.get()).f.getClass();
                    ri1 ri1Var222 = ((z580) this.b.get()).k;
                    if (!ri1Var222.b.isEmpty()) {
                    }
                    d2 = new Double(preorder2.F);
                    if (d2.doubleValue() == -1.0d) {
                    }
                    if (d2 == null) {
                    }
                    xku0 xku0Var222 = ((z580) this.b.get()).c;
                    fga0 fga0Var222 = xku0Var222.a;
                    fga0Var222.getClass();
                    paymentMethod$Type2 = PaymentMethod$Type.CORP;
                    CorpAccount j322 = fga0Var222.j(fga0Var222.q(paymentMethod$Type2));
                    if (j322 == null) {
                    }
                    if (preorder2.h() == paymentMethod$Type2) {
                    }
                    arrayList = zt70Var;
                    boolean a52222 = ((z580) this.b.get()).a.a("FIELD_DONT_SMS", false);
                    boolean booleanValue2222 = ((Boolean) ((z580) this.b.get()).i.b.getValue()).booleanValue();
                    String d32222 = preorder2.d();
                    if (preorder2.e0) {
                    }
                    TollRoads tollRoads2222 = preorder2.d0;
                    if (tollRoads2222 == null) {
                    }
                    String str392222 = preorder2.W;
                    if (preorder2.Z) {
                    }
                    String str4022222 = preorder2.b0;
                    if (str4022222 != null) {
                    }
                    if (!z5) {
                    }
                    a2 = this.f.a();
                    if (a2 == null) {
                    }
                    i4u i4uVar22222 = this.h;
                    i4uVar22222.getClass();
                    set = preorder2.O.b;
                    if (set instanceof Collection) {
                    }
                    it5 = set.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                        }
                    }
                    wb80Var = zt70Var;
                    String str4222222 = preorder2.V;
                    if (!gwk0.v(str4222222)) {
                    }
                    if (str4 != null) {
                    }
                    if (str8 != null) {
                    }
                    ListBuilder a622222 = rcc.a();
                    a622222.add("code_dispatch");
                    if (((hqj0) this.a.get()).b().b) {
                    }
                    ListBuilder j222222 = a622222.j();
                    Transfer transfer422222 = preorder2.T;
                    if (transfer422222 == null) {
                    }
                    if (manualLookup != null) {
                    }
                    return new gu70(str13, str3422, set222, g, str2622, obj2, zt70Var, r29, a322, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a52222, str232, booleanValue2222, d32222, arrayList, wt70Var, affiliateInfo, tips222, b2, a422, linkedHashMap2, str44, z62, str45, j222222, fu70Var, str43, str392222, cu70Var, fullAuctionParam, zzsVar, wb80Var);
                }
                z2 = false;
                boolean z622 = e;
                String str2322 = str9;
                String str2422 = str7;
                String str2522 = str6;
                if (z2) {
                }
                if (z3) {
                }
                if (!z3) {
                }
                orderDraftParam$CallTypePreferences2 = orderDraftParam$CallTypePreferences3;
                String Hg222 = ((z580) this.b.get()).d.Hg();
                Set set2222 = preorder2.O.b;
                g = preorder2.g();
                if (g == null) {
                }
                String str26222 = preorder2.S.c;
                Transfer transfer2222 = preorder2.T;
                if (transfer2222 != null) {
                }
                Transfer transfer3222 = preorder2.T;
                if (transfer3222 != null) {
                }
                List a3222 = preorder2.G.a();
                String str27222 = preorder2.b;
                String str28222 = preorder2.a;
                rpj0 rpj0Var222 = RequirementsParam.Companion;
                List list4222 = preorder2.x;
                String str29222 = preorder2.y;
                rpj0Var222.getClass();
                RequirementsParam a4222 = rpj0.a(str29222, list4222);
                List list5222 = preorder2.x;
                ArrayList arrayList2222 = new ArrayList();
                while (r13.hasNext()) {
                }
                d = gw00.d(tcc.n(arrayList2222, 10));
                if (d < 16) {
                }
                LinkedHashMap linkedHashMap322 = new LinkedHashMap(d);
                it2 = arrayList2222.iterator();
                while (it2.hasNext()) {
                }
                String str34222 = str2522;
                if (linkedHashMap322.isEmpty()) {
                }
                c = preorder2.c();
                paymentMethod$Type = c.a;
                lv90Var = preorder2.w;
                if (lv90Var != null) {
                }
                PaymentMethod$Type paymentMethod$Type3222 = paymentMethod$Type;
                if (lv90Var != null) {
                }
                lv90Var = preorder2.e();
                ArrayList arrayList3222 = new ArrayList();
                if (lv90Var != null) {
                }
                if (paymentMethod$Type3222 == null) {
                }
                if (i2 != -1) {
                }
                b2 = this.d.b(PaymentMethod$Type.CASH, null, null, null, null);
                zt70Var = z4;
                Tips tips2222 = new Tips(((z580) this.b.get()).b.a.t());
                ((z580) this.b.get()).f.getClass();
                ri1 ri1Var2222 = ((z580) this.b.get()).k;
                if (!ri1Var2222.b.isEmpty()) {
                }
                d2 = new Double(preorder2.F);
                if (d2.doubleValue() == -1.0d) {
                }
                if (d2 == null) {
                }
                xku0 xku0Var2222 = ((z580) this.b.get()).c;
                fga0 fga0Var2222 = xku0Var2222.a;
                fga0Var2222.getClass();
                paymentMethod$Type2 = PaymentMethod$Type.CORP;
                CorpAccount j3222 = fga0Var2222.j(fga0Var2222.q(paymentMethod$Type2));
                if (j3222 == null) {
                }
                if (preorder2.h() == paymentMethod$Type2) {
                }
                arrayList = zt70Var;
                boolean a522222 = ((z580) this.b.get()).a.a("FIELD_DONT_SMS", false);
                boolean booleanValue22222 = ((Boolean) ((z580) this.b.get()).i.b.getValue()).booleanValue();
                String d322222 = preorder2.d();
                if (preorder2.e0) {
                }
                TollRoads tollRoads22222 = preorder2.d0;
                if (tollRoads22222 == null) {
                }
                String str3922222 = preorder2.W;
                if (preorder2.Z) {
                }
                String str40222222 = preorder2.b0;
                if (str40222222 != null) {
                }
                if (!z5) {
                }
                a2 = this.f.a();
                if (a2 == null) {
                }
                i4u i4uVar222222 = this.h;
                i4uVar222222.getClass();
                set = preorder2.O.b;
                if (set instanceof Collection) {
                }
                it5 = set.iterator();
                while (true) {
                    if (it5.hasNext()) {
                    }
                }
                wb80Var = zt70Var;
                String str42222222 = preorder2.V;
                if (!gwk0.v(str42222222)) {
                }
                if (str4 != null) {
                }
                if (str8 != null) {
                }
                ListBuilder a6222222 = rcc.a();
                a6222222.add("code_dispatch");
                if (((hqj0) this.a.get()).b().b) {
                }
                ListBuilder j2222222 = a6222222.j();
                Transfer transfer4222222 = preorder2.T;
                if (transfer4222222 == null) {
                }
                if (manualLookup != null) {
                }
                return new gu70(str13, str34222, set2222, g, str26222, obj2, zt70Var, r29, a3222, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a522222, str2322, booleanValue22222, d322222, arrayList, wt70Var, affiliateInfo, tips2222, b2, a4222, linkedHashMap2, str44, z622, str45, j2222222, fu70Var, str43, str3922222, cu70Var, fullAuctionParam, zzsVar, wb80Var);
            }
        }
        orderDraftParamsCollectorImpl$composeOrderDraftParam$2 = new OrderDraftParamsCollectorImpl$composeOrderDraftParam$2(this, continuationImpl);
        Object obj5 = orderDraftParamsCollectorImpl$composeOrderDraftParam$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDraftParamsCollectorImpl$composeOrderDraftParam$2.label;
        Calendar calendar22 = null;
        orderDraftParam$CallTypePreferences = null;
        if (i != 0) {
        }
        if (((Boolean) a).booleanValue()) {
        }
        z2 = false;
        boolean z6222 = e;
        String str23222 = str9;
        String str24222 = str7;
        String str25222 = str6;
        if (z2) {
        }
        if (z3) {
        }
        if (!z3) {
        }
        orderDraftParam$CallTypePreferences2 = orderDraftParam$CallTypePreferences3;
        String Hg2222 = ((z580) this.b.get()).d.Hg();
        Set set22222 = preorder2.O.b;
        g = preorder2.g();
        if (g == null) {
        }
        String str262222 = preorder2.S.c;
        Transfer transfer22222 = preorder2.T;
        if (transfer22222 != null) {
        }
        Transfer transfer32222 = preorder2.T;
        if (transfer32222 != null) {
        }
        List a32222 = preorder2.G.a();
        String str272222 = preorder2.b;
        String str282222 = preorder2.a;
        rpj0 rpj0Var2222 = RequirementsParam.Companion;
        List list42222 = preorder2.x;
        String str292222 = preorder2.y;
        rpj0Var2222.getClass();
        RequirementsParam a42222 = rpj0.a(str292222, list42222);
        List list52222 = preorder2.x;
        ArrayList arrayList22222 = new ArrayList();
        while (r13.hasNext()) {
        }
        d = gw00.d(tcc.n(arrayList22222, 10));
        if (d < 16) {
        }
        LinkedHashMap linkedHashMap3222 = new LinkedHashMap(d);
        it2 = arrayList22222.iterator();
        while (it2.hasNext()) {
        }
        String str342222 = str25222;
        if (linkedHashMap3222.isEmpty()) {
        }
        c = preorder2.c();
        paymentMethod$Type = c.a;
        lv90Var = preorder2.w;
        if (lv90Var != null) {
        }
        PaymentMethod$Type paymentMethod$Type32222 = paymentMethod$Type;
        if (lv90Var != null) {
        }
        lv90Var = preorder2.e();
        ArrayList arrayList32222 = new ArrayList();
        if (lv90Var != null) {
        }
        if (paymentMethod$Type32222 == null) {
        }
        if (i2 != -1) {
        }
        b2 = this.d.b(PaymentMethod$Type.CASH, null, null, null, null);
        zt70Var = z4;
        Tips tips22222 = new Tips(((z580) this.b.get()).b.a.t());
        ((z580) this.b.get()).f.getClass();
        ri1 ri1Var22222 = ((z580) this.b.get()).k;
        if (!ri1Var22222.b.isEmpty()) {
        }
        d2 = new Double(preorder2.F);
        if (d2.doubleValue() == -1.0d) {
        }
        if (d2 == null) {
        }
        xku0 xku0Var22222 = ((z580) this.b.get()).c;
        fga0 fga0Var22222 = xku0Var22222.a;
        fga0Var22222.getClass();
        paymentMethod$Type2 = PaymentMethod$Type.CORP;
        CorpAccount j32222 = fga0Var22222.j(fga0Var22222.q(paymentMethod$Type2));
        if (j32222 == null) {
        }
        if (preorder2.h() == paymentMethod$Type2) {
        }
        arrayList = zt70Var;
        boolean a5222222 = ((z580) this.b.get()).a.a("FIELD_DONT_SMS", false);
        boolean booleanValue222222 = ((Boolean) ((z580) this.b.get()).i.b.getValue()).booleanValue();
        String d3222222 = preorder2.d();
        if (preorder2.e0) {
        }
        TollRoads tollRoads222222 = preorder2.d0;
        if (tollRoads222222 == null) {
        }
        String str39222222 = preorder2.W;
        if (preorder2.Z) {
        }
        String str402222222 = preorder2.b0;
        if (str402222222 != null) {
        }
        if (!z5) {
        }
        a2 = this.f.a();
        if (a2 == null) {
        }
        i4u i4uVar2222222 = this.h;
        i4uVar2222222.getClass();
        set = preorder2.O.b;
        if (set instanceof Collection) {
        }
        it5 = set.iterator();
        while (true) {
            if (it5.hasNext()) {
            }
        }
        wb80Var = zt70Var;
        String str422222222 = preorder2.V;
        if (!gwk0.v(str422222222)) {
        }
        if (str4 != null) {
        }
        if (str8 != null) {
        }
        ListBuilder a62222222 = rcc.a();
        a62222222.add("code_dispatch");
        if (((hqj0) this.a.get()).b().b) {
        }
        ListBuilder j22222222 = a62222222.j();
        Transfer transfer42222222 = preorder2.T;
        if (transfer42222222 == null) {
        }
        if (manualLookup != null) {
        }
        return new gu70(str13, str342222, set22222, g, str262222, obj2, zt70Var, r29, a32222, str15, str14, singletonList, z7, orderDraftParam$CallTypePreferences2, a5222222, str23222, booleanValue222222, d3222222, arrayList, wt70Var, affiliateInfo, tips22222, b2, a42222, linkedHashMap2, str44, z6222, str45, j22222222, fu70Var, str43, str39222222, cu70Var, fullAuctionParam, zzsVar, wb80Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Preorder preorder, String str, String str2, ContinuationImpl continuationImpl) {
        OrderDraftParamsCollectorImpl$createOrderDraftParams$1 orderDraftParamsCollectorImpl$createOrderDraftParams$1;
        int i;
        a aVar;
        if (continuationImpl instanceof OrderDraftParamsCollectorImpl$createOrderDraftParams$1) {
            orderDraftParamsCollectorImpl$createOrderDraftParams$1 = (OrderDraftParamsCollectorImpl$createOrderDraftParams$1) continuationImpl;
            int i2 = orderDraftParamsCollectorImpl$createOrderDraftParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderDraftParamsCollectorImpl$createOrderDraftParams$1.label = i2 - Integer.MIN_VALUE;
                OrderDraftParamsCollectorImpl$createOrderDraftParams$1 orderDraftParamsCollectorImpl$createOrderDraftParams$12 = orderDraftParamsCollectorImpl$createOrderDraftParams$1;
                Object obj = orderDraftParamsCollectorImpl$createOrderDraftParams$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDraftParamsCollectorImpl$createOrderDraftParams$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    orderDraftParamsCollectorImpl$createOrderDraftParams$12.L$0 = null;
                    orderDraftParamsCollectorImpl$createOrderDraftParams$12.L$1 = null;
                    orderDraftParamsCollectorImpl$createOrderDraftParams$12.L$2 = null;
                    orderDraftParamsCollectorImpl$createOrderDraftParams$12.label = 1;
                    String str3 = "";
                    try {
                        String str4 = (String) ((z580) this.b.get()).l.b.get("clid2006");
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (!str4.equals("0")) {
                            str3 = str4;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        this.k.b("composeOrderDraftParam", th, new fs70(12));
                    }
                    aVar = this;
                    obj = aVar.a(preorder, str, str2, str3, orderDraftParamsCollectorImpl$createOrderDraftParams$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    aVar = this;
                }
                KSerializer serializer = gu70.Companion.serializer();
                return ((xnt) aVar.g).e((gu70) obj, serializer);
            }
        }
        orderDraftParamsCollectorImpl$createOrderDraftParams$1 = new OrderDraftParamsCollectorImpl$createOrderDraftParams$1(this, continuationImpl);
        OrderDraftParamsCollectorImpl$createOrderDraftParams$1 orderDraftParamsCollectorImpl$createOrderDraftParams$122 = orderDraftParamsCollectorImpl$createOrderDraftParams$1;
        Object obj2 = orderDraftParamsCollectorImpl$createOrderDraftParams$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDraftParamsCollectorImpl$createOrderDraftParams$122.label;
        if (i != 0) {
        }
        KSerializer serializer2 = gu70.Companion.serializer();
        return ((xnt) aVar.g).e((gu70) obj2, serializer2);
    }

    public final void c(PaymentMethod$Type paymentMethod$Type) {
        a3y0.m(this.k, "reportInconsistency", new IllegalStateException("Missed payment method id for " + paymentMethod$Type), null, 4);
    }
}
