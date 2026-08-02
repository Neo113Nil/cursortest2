package defpackage;

import android.text.Editable;
import com.yandex.go.address.models.Address;
import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Service;
import com.yandex.go.messenger_native.analytics.NativeMessengerAnalytics$Status;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Service;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Status;
import com.yandex.go.preorder.navigation.p;
import com.yandex.go.tappable_poi.experiments.f;
import com.yandex.go.taxi.order.change.destinations.navigation.a;
import com.yandex.go.taxi.order.chat.domain.model.MessengerType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import com.yandex.go.taxi.order.view.tips.TipsInputModalView;
import com.yandex.go.taxi.tariffs.analytics.c;
import com.yandex.go.tips.data.model.TipsValue;
import com.yandex.go.tips.ui.TipItemUiState$ItemType;
import com.yandex.messaging.internal.view.chat.input.textsuggest.d;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.combo.ui.TravelCompanionStatusView;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class bax0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bax0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0336 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        g18 bwiVar;
        NativeMessengerAnalytics$Status nativeMessengerAnalytics$Status;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        zfz0 zfz0Var;
        Object obj2;
        Object obj3;
        jfz0 jfz0Var;
        jfz0 jfz0Var2;
        ief iefVar;
        TaxiOrder b;
        Iterator it;
        int i = 0;
        Float f = null;
        switch (this.a) {
            case 0:
                nm00 nm00Var = (nm00) obj;
                cax0 cax0Var = (cax0) this.b;
                aax0 aax0Var = cax0Var.e;
                if (aax0Var != null) {
                    Iterator it2 = nm00Var.c.iterator();
                    while (it2.hasNext()) {
                        for (z zVar : ((uud0) it2.next()).a) {
                            if ((zVar instanceof s) && evu0.y(((s) zVar).a, "userplace", false)) {
                                cax0Var.b.a(nm00Var.a, "favorite", null, aax0Var.a(), Boolean.valueOf(aax0Var.b()), false, null);
                                if (((f) cax0Var.c).a.b) {
                                    aax0Var.q(nm00Var.b);
                                }
                            }
                        }
                    }
                }
                return zy11.a;
            case 1:
                Pair pair = (Pair) obj;
                xfj xfjVar = (xfj) pair.getFirst();
                boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                com.yandex.go.tariffcard.ui.r0 r0Var3 = (com.yandex.go.tariffcard.ui.r0) this.b;
                r0Var3.e.setAnimateChanges(booleanValue);
                r0Var3.f.M(xfjVar);
                return zy11.a;
            case 2:
                i890 i890Var = (i890) obj;
                jkx0 jkx0Var = (jkx0) this.b;
                jkx0Var.Ud(i890Var.a);
                int i2 = i890Var.d;
                if (i2 >= 0) {
                    jkx0Var.Ad(i2);
                }
                return zy11.a;
            case 3:
                ((c) this.b).a(false);
                return zy11.a;
            case 4:
                omx0 omx0Var = (omx0) this.b;
                xj0 xj0Var = omx0Var.c;
                Address b2 = ((d0l0) obj).b();
                jpv0 b3 = omx0Var.b.b();
                b3.getClass();
                xj0Var.a(b2, b3 instanceof hpv0);
                return zy11.a;
            case 5:
                hox0 hox0Var = (hox0) obj;
                iox0 iox0Var = (iox0) this.b;
                g18 g18Var = iox0Var.g;
                if (g18Var != null) {
                    g18Var.cancel();
                }
                iox0Var.g = null;
                String str = hox0Var.a;
                if (str != null) {
                    cwi cwiVar = (cwi) iox0Var.f;
                    if (str.equals(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                        cwiVar.b();
                        bwiVar = new bwi(i, cwiVar);
                    } else {
                        cwiVar.getClass();
                        bwiVar = iox0Var.a.c(new eai(str, 0));
                    }
                    iox0Var.g = bwiVar;
                }
                if (hox0Var.b) {
                    iox0Var.c.a.g(new ye11(hox0Var.a));
                }
                return zy11.a;
            case 6:
                qlq0 qlq0Var = (qlq0) obj;
                xrx0 xrx0Var = (xrx0) this.b;
                ufr0 ufr0Var = (ufr0) xrx0Var.Dg();
                List list = qlq0Var.a;
                PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = qlq0Var.b;
                ufr0Var.B9(list, priceUpdate$PriceLoadingState);
                xrx0Var.A.a(qlq0Var.a, priceUpdate$PriceLoadingState, !xrx0Var.D.c());
                return zy11.a;
            case 7:
                ((TariffsRibbonView) this.b).invalidateVisibleState((ux31) obj);
                return zy11.a;
            case 8:
                ((vsx0) this.b).a(((Number) obj).intValue());
                return zy11.a;
            case 9:
                return ((p) this.b).L.a.emit(zy11.a, continuation);
            case 10:
                if (an91.g((DriveState) obj)) {
                    ((a) this.b).r(new qu(9));
                }
                return zy11.a;
            case 11:
                ((Consumer) this.b).accept((q6y0) obj);
                return zy11.a;
            case 12:
                NativeMessengerAnalyticsFacade$Status nativeMessengerAnalyticsFacade$Status = (NativeMessengerAnalyticsFacade$Status) obj;
                m3y0 m3y0Var = (m3y0) this.b;
                if (m3y0Var.F == MessengerType.NATIVE) {
                    r350 r350Var = m3y0Var.B;
                    NativeMessengerAnalyticsFacade$Service nativeMessengerAnalyticsFacade$Service = NativeMessengerAnalyticsFacade$Service.TAXI;
                    String str2 = m3y0Var.D.b;
                    co40 co40Var = r350Var.a;
                    NativeMessengerAnalytics$Service b4 = r350.b(nativeMessengerAnalyticsFacade$Service);
                    int i3 = q350.d[nativeMessengerAnalyticsFacade$Status.ordinal()];
                    if (i3 == 1) {
                        nativeMessengerAnalytics$Status = NativeMessengerAnalytics$Status.Connected;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        nativeMessengerAnalytics$Status = NativeMessengerAnalytics$Status.Failed;
                    }
                    co40Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.KEY_SERVICE, b4.getEventValue());
                    hashMap.put("chat_id", str2);
                    hashMap.put(ACSPConstants.STATUS, nativeMessengerAnalytics$Status.getEventValue());
                    co40Var.a.a("NativeMessenger.ConnectionStatus.Received", hashMap, 1, new HashMap());
                }
                return zy11.a;
            case 13:
                ((k3y0) this.b).showDriverAvatar(((mb4) obj).b);
                return zy11.a;
            case 14:
                ((h4y0) this.b).Ee((s4y0) obj);
                return zy11.a;
            case 15:
                String str3 = (String) obj;
                Iterator it3 = ((kay0) this.b).d.iterator();
                while (it3.hasNext()) {
                    ((Consumer) it3.next()).accept(str3);
                }
                return zy11.a;
            case 16:
                ((tdy0) this.b).render((ydy0) obj);
                return zy11.a;
            case 17:
                lhy0 lhy0Var = (lhy0) obj;
                com.ybsdk.feature.testpayment.internal.presentation.a aVar = (com.ybsdk.feature.testpayment.internal.presentation.a) this.b;
                if ((lhy0Var instanceof hhy0) || (lhy0Var instanceof ihy0) || (lhy0Var instanceof jhy0)) {
                    pz40 Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, ghy0.a((ghy0) value, null, lhy0Var, null, 5)));
                } else {
                    if (!(lhy0Var instanceof khy0)) {
                        w511.b();
                        return null;
                    }
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, ghy0.a((ghy0) value2, r501.a(((khy0) lhy0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534), null, null, 4)));
                }
                return zy11.a;
            case 18:
                jty0 jty0Var = (jty0) obj;
                d dVar = (d) this.b;
                qty0 qty0Var = dVar.g;
                if (!jl40.l(qty0Var != null ? qty0Var.b : null, jty0Var.b)) {
                    dVar.d.reportEvent("irrelevant_bot_suggest", b.i(new Pair("chat id", dVar.f), new Pair("action id", jty0Var.b), new Pair("count", Integer.valueOf(jty0Var.a.size()))));
                }
                return zy11.a;
            case 19:
                ((owy0) this.b).b.invoke();
                return zy11.a;
            case 20:
                i1z0 i1z0Var = (i1z0) obj;
                zy11 zy11Var = zy11.a;
                com.yandex.go.masstransit.sdk.order.impl.activation.b bVar = (com.yandex.go.masstransit.sdk.order.impl.activation.b) this.b;
                if (i1z0Var instanceof h1z0) {
                    ((com.yandex.go.masstransit.sdk.order.impl.activation.b) bVar.M.a).r(new g8r0(((h1z0) i1z0Var).a, 21));
                } else if (i1z0Var instanceof g1z0) {
                    ((com.yandex.go.masstransit.sdk.order.impl.activation.b) bVar.M.a).r(new g8r0(((g1z0) i1z0Var).a, 20));
                } else {
                    if (!(i1z0Var instanceof f1z0)) {
                        w511.b();
                        return null;
                    }
                    jhu0 jhu0Var = bVar.M;
                    String str4 = ((f1z0) i1z0Var).a;
                    com.yandex.go.masstransit.sdk.order.impl.activation.b bVar2 = (com.yandex.go.masstransit.sdk.order.impl.activation.b) jhu0Var.a;
                    if (str4 != null) {
                        at20 at20Var = (at20) bVar2.J.a;
                        xl10 xl10Var = (xl10) at20Var.a;
                        v740 v740Var = ((w740) at20Var.b).a;
                        String str5 = v740Var.a;
                        String str6 = v740Var.c;
                        pj pjVar = (pj) xl10Var.a;
                        pjVar.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("order_id", str5);
                        hashMap2.put("ticket_id", str4);
                        if (str6 != null) {
                            hashMap2.put("request_id", str6);
                        }
                        pjVar.a.a("MasstransitTickets.ActivationTicket.InvalidQr", hashMap2, 2, new HashMap());
                    }
                    bVar2.A((m950) bVar2.K.invoke(), zy11Var, new j2f(bVar2, 7));
                }
                return zy11Var;
            case 21:
                u6z0 u6z0Var = (u6z0) this.b;
                u6z0Var.A = (String) obj;
                u6z0Var.Kg(u6z0Var.z.getThemeType());
                return zy11.a;
            case 22:
                zfz0Var = ((TipsInputModalView) this.b).presenter;
                String obj4 = ((Editable) obj).toString();
                zfz0Var.getClass();
                if (obj4.length() != 1 || Character.isDigit(gvu0.u0(obj4))) {
                    ((yfz0) zfz0Var.Dg()).enableConfirmButton(!evu0.J(obj4));
                } else {
                    ((yfz0) zfz0Var.Dg()).enableConfirmButton(false);
                }
                return zy11.a;
            case 23:
                ksq ksqVar = (ksq) obj;
                bgz0 bgz0Var = (bgz0) this.b;
                bgz0Var.getClass();
                if (ksqVar.e) {
                    tgz0 tgz0Var = bgz0Var.e;
                    Iterable iterable = ksqVar.d;
                    if (iterable == null) {
                        iterable = EmptyList.a;
                    }
                    String str7 = ksqVar.f;
                    TipsType tipsType = ksqVar.g;
                    TaxiOrder b5 = bgz0Var.c.b();
                    tgz0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it4 = iterable.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            List a = ((TipsVariant) obj2).a();
                            ArrayList arrayList2 = new ArrayList(tcc.n(a, 10));
                            Iterator it5 = a.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(((TipsVariant.TipsChoice) it5.next()).a);
                            }
                            if (!arrayList2.isEmpty()) {
                                Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    if (((TipsType) it6.next()) == TipsType.FLAT) {
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    TipsVariant tipsVariant = (TipsVariant) obj2;
                    if (tipsVariant == null) {
                        tipsVariant = TipsVariant.f;
                    }
                    pze0 b6 = b5 != null ? ((wze0) tgz0Var.c).b(b5) : null;
                    Iterator it7 = tipsVariant.a().iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj3 = it7.next();
                            String a2 = ((TipsVariant.TipsChoice) obj3).a();
                            if (a2 != null) {
                                f = Float.valueOf(Float.parseFloat(a2));
                            }
                            if (!jl40.j(f, 0.0f)) {
                                f = null;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    TipsVariant.TipsChoice tipsChoice = (TipsVariant.TipsChoice) obj3;
                    jfz0 b7 = tipsChoice == null ? null : tgz0Var.b(tipsChoice, b6, jl40.j(str7 != null ? avu0.j(str7) : null, 0.0f));
                    if (b7 != null) {
                        arrayList.add(b7);
                    }
                    ine0 ine0Var = tgz0Var.b;
                    TipsType b8 = tipsVariant.b();
                    TipsType tipsType2 = TipsType.PERCENT;
                    Object[] objArr = b8 != tipsType2;
                    if (ine0Var.a.s() <= TipsValue.ZERO_PERCENT.getValue() || !objArr == true) {
                        jfz0Var = null;
                    } else {
                        boolean z = tipsType == tipsType2 && jl40.l(str7, ine0Var.a.t());
                        String t = ine0Var.a.t();
                        jfz0Var = new jfz0(tipsType2, tgz0Var.c(tipsType2, t, b6), t, z, TipItemUiState$ItemType.VALUE, null, nkz0.a);
                    }
                    if (jfz0Var != null) {
                        arrayList.add(jfz0Var);
                    }
                    boolean F = b5 != null ? b5.F() : false;
                    List a3 = tipsVariant.a();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : a3) {
                        String a4 = ((TipsVariant.TipsChoice) obj5).a();
                        if (!jl40.j(a4 != null ? Float.valueOf(Float.parseFloat(a4)) : null, 0.0f)) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it8 = arrayList3.iterator();
                    while (it8.hasNext()) {
                        TipsVariant.TipsChoice tipsChoice2 = (TipsVariant.TipsChoice) it8.next();
                        jfz0 b9 = tgz0Var.b(tipsChoice2, b6, !F && jl40.l(tipsChoice2.a(), str7) && tipsChoice2.a == tipsType);
                        if (b9 != null) {
                            arrayList4.add(b9);
                        }
                    }
                    arrayList.addAll(arrayList4);
                    if (b5 != null) {
                        boolean z2 = tipsVariant.b() != TipsType.PERCENT;
                        if (b5.V().E.a().b && z2) {
                            String d = diz0.d(b5.l.W.g);
                            if (d == null) {
                                d = "";
                            }
                            fef h = (b6 == null || (iefVar = b6.d) == null) ? null : gwk0.h(iefVar);
                            jfz0Var2 = new jfz0(TipsType.FLAT, !evu0.J(d) ? tgz0Var.d.c(h, d, false) : ((avj0) tgz0Var.a).h(kyh0.tips_another_amount), d, b5.F(), TipItemUiState$ItemType.INPUT, (evu0.J(d) || h == null) ? null : h.a, new okz0(((avj0) tgz0Var.a).b(usg0.text_tips_text_size)));
                            if (jfz0Var2 != null) {
                                arrayList.add(jfz0Var2);
                            }
                            b = bgz0Var.c.b();
                            ArrayList arrayList5 = new ArrayList(tcc.n(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                String str8 = ((jfz0) it.next()).f;
                                if (str8.length() == 0) {
                                    str8 = "0";
                                }
                                arrayList5.add(str8);
                            }
                            synchronized (b) {
                                b.l = b.l.J(arrayList5);
                            }
                            r0 r0Var4 = bgz0Var.m;
                            biz0 biz0Var = new biz0(arrayList, true);
                            r0Var4.getClass();
                            r0Var4.m(null, biz0Var);
                            TaxiOrder b10 = bgz0Var.c.b();
                            String str9 = ksqVar.f;
                            TipsType tipsType3 = ksqVar.g;
                            b10.getClass();
                            TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType g = diz0.g(tipsType3);
                            synchronized (b10) {
                                TaxiOrderLocalData taxiOrderLocalData = b10.l;
                                TaxiOrderFeedback taxiOrderFeedback = taxiOrderLocalData.W;
                                TaxiOrderLocalData b11 = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, null, taxiOrderFeedback.g.d(str9), null, 191), false, null, false, null, null, null, -1, 16711679);
                                TaxiOrderFeedback taxiOrderFeedback2 = b11.W;
                                b10.l = TaxiOrderLocalData.b(b11, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback2, null, null, null, null, null, null, taxiOrderFeedback2.g.e(g), null, 191), false, null, false, null, null, null, -1, 16711679);
                            }
                        }
                    }
                    jfz0Var2 = null;
                    if (jfz0Var2 != null) {
                    }
                    b = bgz0Var.c.b();
                    ArrayList arrayList52 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    synchronized (b) {
                    }
                } else {
                    r0 r0Var5 = bgz0Var.m;
                    biz0 biz0Var2 = new biz0(EmptyList.a, false);
                    r0Var5.getClass();
                    r0Var5.m(null, biz0Var2);
                }
                return zy11.a;
            case 24:
                ((sqz0) this.b).Ed((frz0) obj);
                return zy11.a;
            case 25:
                lqz0 lqz0Var = (lqz0) obj;
                xqz0 xqz0Var = (xqz0) this.b;
                xqz0Var.getClass();
                if (jl40.l(lqz0Var, lqz0.d)) {
                    ((wqz0) xqz0Var.Dg()).J4(false);
                } else {
                    ((wqz0) xqz0Var.Dg()).c5(xqz0Var.z.a());
                    ((wqz0) xqz0Var.Dg()).J4(true);
                    ((wqz0) xqz0Var.Dg()).Nf(lqz0Var.a, lqz0Var.b);
                    ((wqz0) xqz0Var.Dg()).V2(lqz0Var.c);
                }
                return zy11.a;
            case 26:
                Pair pair2 = (Pair) obj;
                Address address = (Address) pair2.getFirst();
                return ((ru.yandex.taxi.masstransit.paymentcards.d) this.b).g.a(address != null ? address.B() : null, ((q111) pair2.getSecond()).a, continuation);
            case 27:
                hc11 hc11Var = (hc11) this.b;
                hc11Var.a0.d(hc11Var.Z, (hxx0) obj, kyh0.order_screens_transporting_timeleft_with_hours_preview, kyh0.taxiotw_transporting);
                return zy11.a;
            case 28:
                ((yc11) this.b).renderCompanionCard((List) obj);
                return zy11.a;
            default:
                ((TravelCompanionStatusView) this.b).setTitleTime(((Number) obj).longValue());
                return zy11.a;
        }
    }
}
