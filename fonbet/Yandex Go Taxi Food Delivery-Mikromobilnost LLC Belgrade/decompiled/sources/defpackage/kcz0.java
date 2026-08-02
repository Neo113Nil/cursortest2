package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.MifareClassic;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.fintechsdk.core.nfc.api.NfcCardType;
import com.yandex.fintechsdk.core.nfc.impl.internal.nfcstate.NfcStateReceiver;
import com.yandex.go.address.models.Address;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.api.MobilityHubApi;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubDescriptionsPartsParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubDetailsTariffParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPaidOptionsParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubSummaryStyleParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubTariffUnavailableParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubAvailableParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubDriveOfferParamV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubEstimatedWaitingParamV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenRequestParamsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubServiceLevelParamV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubTollRoadsParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PositionObject;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RouteParamV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RouteStatsDataV2;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$DismissType;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$TransferType;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$ValidationFailedReason;
import com.yandex.go.zone.dto.objects.DriveExtra;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.SurgeIconStyle;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.go.zone.dto.response.c;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PromoStoriesEvents$PromoStoriesStoryScreenBigButtonClickType;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.feature.transactions.api.entities.TransactionsListShimmerType;
import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import com.ybsdk.rconfig.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class kcz0 implements cxy, ev31, jg5, e3q0, in60, o231, IVerificationFlowComponent {
    public Object a;
    public Object b;

    public /* synthetic */ kcz0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static TransferCardAnalytics$TransferType p(boolean z) {
        return z ? TransferCardAnalytics$TransferType.Train : TransferCardAnalytics$TransferType.Avia;
    }

    @Override // defpackage.cxy
    public void a() {
        ((lcz0) this.a).d.c("tech end messages prefetch", "chatId", (String) this.b);
    }

    @Override // defpackage.e3q0
    public void b(ef90 ef90Var) {
        vi11 vi11Var = (vi11) this.b;
        SparseArray sparseArray = vi11Var.i;
        df90 df90Var = (df90) this.a;
        if (ef90Var.y() == 0 && (ef90Var.y() & 128) != 0) {
            ef90Var.L(6);
            int a = ef90Var.a() / 4;
            for (int i = 0; i < a; i++) {
                ef90Var.i(0, 4, df90Var.a);
                df90Var.m(0);
                int g = df90Var.g(16);
                df90Var.o(3);
                if (g == 0) {
                    df90Var.o(13);
                } else {
                    int g2 = df90Var.g(13);
                    if (sparseArray.get(g2) == null) {
                        sparseArray.put(g2, new l3q0(new s1n(vi11Var, g2)));
                        vi11Var.o++;
                    }
                }
            }
            if (vi11Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.e3q0
    public void c(sez0 sez0Var, d5p d5pVar, xi11 xi11Var) {
    }

    @Override // defpackage.cxy
    public void d(ChatHistoryResponse chatHistoryResponse) {
        oab oabVar;
        lcz0 lcz0Var = (lcz0) this.a;
        h9b h9bVar = lcz0Var.a;
        String str = (String) this.b;
        s020 e = h9bVar.e(str);
        if (e != null && (oabVar = (oab) ((m8g) e).h.get()) != null) {
            l020 C = lcz0Var.c.C();
            try {
                oabVar.j(C, chatHistoryResponse, false);
                C.s();
                C.close();
            } finally {
            }
        }
        lcz0Var.d.c("tech end messages prefetch", "chatId", str);
    }

    @Override // defpackage.o231
    public Object get(String str) {
        Object obj = ((LinkedHashMap) this.a).get(str);
        return obj == null ? ((o231) this.b).get(str) : obj;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent
    public IVerificationFlowController getVerificationFlowController() {
        a201 a201Var = (a201) this.b;
        if (a201Var != null) {
            return a201Var;
        }
        a201 a201Var2 = new a201(new wpy0(22, new eg01((o021) this.a)));
        this.b = a201Var2;
        return a201Var2;
    }

    public nzr n() {
        return (nzr) this.a;
    }

    public List o() {
        return (ArrayList) this.b;
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        jf01 if01Var;
        cf01 af01Var;
        ff01 ff01Var = (ff01) obj;
        erq erqVar = (erq) this.a;
        boolean z = ff01Var.g;
        TransactionsState transactionsState = ff01Var.f;
        boolean z2 = ff01Var.k;
        b bVar = ((ue01) ((sf01) this.b)).b;
        boolean z3 = jl40.l(bVar.r().isEnabledOnTransactionsFeedScreen(), Boolean.TRUE) && bVar.r().isEnabled();
        u8j0 u8j0Var = ff01Var.d;
        if (u8j0Var instanceof s8j0) {
            if01Var = new hf01(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        } else {
            if (u8j0Var instanceof r8j0) {
                we01 we01Var = (we01) ((r8j0) u8j0Var).a;
                rr51 rr51Var = we01Var.a;
                rr51 rr51Var2 = we01Var.b;
                ve01 ve01Var = we01Var.c;
                ListBuilder a = rcc.a();
                ppl pplVar = ff01Var.e;
                List list = pplVar != null ? pplVar.a : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                a.addAll(list);
                if (transactionsState == TransactionsState.ERROR) {
                    Throwable th = ff01Var.i;
                    boolean z4 = ff01Var.c;
                    erqVar.getClass();
                    a.add(new f990(4, "PAGING_ERROR_VIEW_ITEM_ID", th, z4));
                }
                if (!z && transactionsState == TransactionsState.LOADING) {
                    a.addAll(erqVar.a(ff01Var.h));
                }
                if (z && a.isEmpty()) {
                    a.addAll(erqVar.a(TransactionsListShimmerType.FULL));
                }
                ListBuilder j = a.j();
                if (j.isEmpty()) {
                    erqVar.getClass();
                    af01Var = new af01(new poq());
                } else {
                    gc5 gc5Var = (gc5) a.u0(j);
                    af01Var = gc5Var instanceof f990 ? new af01(gc5Var) : new bf01(j);
                }
                if01Var = new gf01(ve01Var != null ? new stz0(ve01Var.a, null, null, null, null, qtz0.a, false, null, null, ve01Var.b, null, null, 31710) : null, rr51Var, rr51Var2, af01Var);
            } else {
                if (!(u8j0Var instanceof t8j0)) {
                    w511.b();
                    return null;
                }
                if01Var = new if01(z3, z3, z3 && z2, z3 && !z2, !z3 && z2, (z3 || z2) ? false : true);
            }
        }
        return new pf01(fab1.c(ff01Var.b, BottomBarItemId.HISTORY), if01Var);
    }

    public void r(String str, String str2) {
        if (str != null) {
            ((u1n) this.b).q(null, g8e.p(str, ".Photocomment.", str2));
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent
    public void registerVerificationRouter(IVerificationRouter iVerificationRouter) {
        ((o021) this.a).j = iVerificationRouter;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        a201 a201Var = (a201) this.b;
        if (a201Var != null) {
            a201Var.release();
        }
        this.b = null;
        ((o021) this.a).j = null;
    }

    public void s(String str, int i, PromoStoriesEvents$PromoStoriesStoryScreenBigButtonClickType promoStoriesEvents$PromoStoriesStoryScreenBigButtonClickType, String str2) {
        rt1 rt1Var = ((AppAnalyticsReporter) this.a).U;
        LinkedHashMap w = g8e.w(4, "story_id", str);
        w.put("page_index", Integer.valueOf(i + 1));
        w.put("type", promoStoriesEvents$PromoStoriesStoryScreenBigButtonClickType.getOriginalValue());
        w.put("action", str2);
        rt1Var.a.a("promo_stories.story_screen.big.button.click", w);
    }

    public byte[] t(MifareClassic mifareClassic, int i, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                z = mifareClassic.authenticateSectorWithKeyA(i, bArr);
                if (z) {
                    break;
                }
            } catch (IOException e) {
                rwo rwoVar = (rwo) this.a;
                if (rwoVar != null) {
                    sv90 sv90Var = qv90.a;
                    String valueOf = String.valueOf(e.getMessage());
                    sv90Var.getClass();
                    ((y22) rwoVar).a(sv90.z(valueOf));
                }
            }
        }
        if (!z) {
            return a.D0(arrayList);
        }
        int blockCountInSector = mifareClassic.getBlockCountInSector(i);
        for (int i4 = 0; i4 < blockCountInSector; i4++) {
            byte[] readBlock = mifareClassic.readBlock(mifareClassic.sectorToBlock(i) + i4);
            ycc.s(arrayList, readBlock.length == 0 ? ixn.a : new i73(i2, readBlock));
        }
        return a.D0(arrayList);
    }

    public void u(boolean z, TransferCardAnalytics$DismissType transferCardAnalytics$DismissType) {
        ih01 ih01Var = (ih01) this.a;
        TransferCardAnalytics$TransferType p = p(z);
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("transfer_type", p.getEventValue());
        hashMap.put("dismiss_type", transferCardAnalytics$DismissType.getEventValue());
        ih01Var.a.a("TransferCard.Closed", hashMap, 1, new HashMap());
    }

    public void v(boolean z, TransferCardAnalytics$ValidationFailedReason transferCardAnalytics$ValidationFailedReason, String str) {
        ih01 ih01Var = (ih01) this.a;
        TransferCardAnalytics$TransferType p = p(z);
        ih01Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("transfer_type", p.getEventValue());
        hashMap.put(CRLReasonCodeExtension.REASON, transferCardAnalytics$ValidationFailedReason.getEventValue());
        ih01Var.a.a("TransferCard.Validation.Failed", hashMap, 1, tse0.r("transport_number", hashMap, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031a  */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubServiceLevelParamV2] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r2v7, types: [tls] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubEstimatedWaitingParamV2] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubDescriptionsPartsParam] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v4, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubTariffUnavailableParam] */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubEstimatedWaitingParamV2] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1, types: [kotlinx.serialization.json.b] */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(d0l0 d0l0Var, dbl0 dbl0Var, List list, String str, boolean z, List list2, Set set, String str2, String str3, String str4, String str5, Continuation continuation) {
        ArrayList arrayList;
        RouteParamV2 routeParamV2;
        ArrayList arrayList2;
        RouteStatsDataV2 routeStatsDataV2;
        HubAvailableParam hubAvailableParam;
        HubTollRoadsParam hubTollRoadsParam;
        String str6;
        Iterable iterable;
        ServiceLevel.RideTime rideTime;
        c cVar;
        PriceMeta priceMeta;
        ServiceLevel.DescriptionParts descriptionParts;
        Iterator it;
        ?? r31;
        String str7;
        String str8;
        ?? r28;
        String str9;
        String str10;
        ?? r30;
        ServiceLevel serviceLevel;
        Selector selector;
        n7v n7vVar;
        ArrayList arrayList3;
        ?? r34;
        ArrayList arrayList4;
        Calendar calendar;
        RouteParamV2 routeParamV22;
        String str11;
        ?? r33;
        String str12;
        ?? r37;
        ?? r40;
        kotlinx.serialization.json.b bVar;
        SurgeIconStyle surgeIconStyle;
        a2v a2vVar = (a2v) this.a;
        MobilityHubSourceAction mobilityHubSourceAction = a2vVar.a;
        MobilityHubSourceType mobilityHubSourceType = a2vVar.b;
        List a = d0l0Var.a();
        int i = 10;
        ArrayList arrayList5 = new ArrayList(tcc.n(a, 10));
        Iterator it2 = a.iterator();
        while (true) {
            arrayList = null;
            String str13 = null;
            if (!it2.hasNext()) {
                break;
            }
            Address address = (Address) it2.next();
            zzs B = address.B();
            PositionObject positionObject = new PositionObject(B.a, B.b);
            String D1 = address.D1();
            if (!evu0.J(D1)) {
                str13 = D1;
            }
            arrayList5.add(new RouteParamV2.AddressV2(positionObject, str13));
        }
        RouteParamV2 routeParamV23 = new RouteParamV2(arrayList5);
        yal0 yal0Var = dbl0Var.a;
        List list3 = yal0Var.b;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : list3) {
            ServiceLevel serviceLevel2 = (ServiceLevel) obj;
            List list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it3 = list4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (jl40.l(((VerticalTariffDto) it3.next()).a, serviceLevel2.f)) {
                        arrayList6.add(obj);
                        break;
                    }
                }
            }
        }
        if (z) {
            Calendar calendar2 = dbl0Var.e;
            vrz0 vrz0Var = yal0Var.j;
            Boolean bool = vrz0Var.a;
            String str14 = vrz0Var.d;
            if (bool == null && str14.length() == 0) {
                hubTollRoadsParam = null;
            } else {
                int i2 = q1v.a[vrz0Var.b.ordinal()];
                if (i2 == 1) {
                    hubAvailableParam = HubAvailableParam.ENABLED;
                } else if (i2 == 2) {
                    hubAvailableParam = HubAvailableParam.DISABLED;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    hubAvailableParam = HubAvailableParam.ENABLED_IF_ONLY_TOLLS;
                }
                Boolean bool2 = vrz0Var.a;
                if (str14.length() <= 0) {
                    str14 = null;
                }
                hubTollRoadsParam = new HubTollRoadsParam(bool2, str14, Boolean.valueOf(vrz0Var.f), hubAvailableParam);
            }
            String str15 = yal0Var.h;
            Integer valueOf = Integer.valueOf(yal0Var.i);
            fef g = yal0Var.g();
            ief iefVar = new ief(g.a, g.b, g.c, g.d);
            ArrayList arrayList7 = new ArrayList();
            Iterator it4 = arrayList6.iterator();
            while (true) {
                str6 = "";
                if (it4.hasNext()) {
                    ServiceLevel serviceLevel3 = (ServiceLevel) it4.next();
                    if (jl40.l(serviceLevel3.f, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                        calendar = calendar2;
                        routeParamV22 = routeParamV23;
                        str12 = str15;
                        arrayList3 = arrayList;
                    } else {
                        TariffUnavailable tariffUnavailable = serviceLevel3.m;
                        if (tariffUnavailable != null) {
                            arrayList3 = arrayList;
                            r34 = new HubTariffUnavailableParam(tariffUnavailable.a, tariffUnavailable.b);
                        } else {
                            arrayList3 = arrayList;
                            r34 = arrayList3;
                        }
                        List list5 = serviceLevel3.c;
                        if (list5 != null) {
                            List<ServiceLevel.TariffDetail> list6 = list5;
                            ArrayList arrayList8 = new ArrayList(tcc.n(list6, i));
                            for (ServiceLevel.TariffDetail tariffDetail : list6) {
                                arrayList8.add(new HubDetailsTariffParam(tariffDetail.a, tariffDetail.b, tariffDetail.c));
                                calendar2 = calendar2;
                                routeParamV23 = routeParamV23;
                            }
                            arrayList4 = arrayList8;
                        } else {
                            arrayList4 = arrayList3;
                        }
                        calendar = calendar2;
                        routeParamV22 = routeParamV23;
                        HubPaidOptionsParam hubPaidOptionsParam = new HubPaidOptionsParam(serviceLevel3.C.a());
                        SummaryStyle summaryStyle = serviceLevel3.P;
                        ?? r4 = (summaryStyle == null || (surgeIconStyle = summaryStyle.a) == null) ? arrayList3 : surgeIconStyle.b;
                        if (r4 == 0) {
                            r4 = "";
                        }
                        HubSummaryStyleParam hubSummaryStyleParam = new HubSummaryStyleParam(r4);
                        String str16 = serviceLevel3.f;
                        String str17 = serviceLevel3.e;
                        String str18 = serviceLevel3.S;
                        String str19 = serviceLevel3.g;
                        String str20 = serviceLevel3.j;
                        String str21 = serviceLevel3.i;
                        Boolean valueOf2 = Boolean.valueOf(serviceLevel3.K);
                        Boolean valueOf3 = Boolean.valueOf(serviceLevel3.A);
                        PriceMeta priceMeta2 = serviceLevel3.h;
                        if (priceMeta2 != null) {
                            str11 = str16;
                            r33 = new HubPricesParam(priceMeta2.a, priceMeta2.b);
                        } else {
                            str11 = str16;
                            r33 = arrayList3;
                        }
                        ServiceLevel.RideTime rideTime2 = serviceLevel3.k;
                        ?? a2 = rideTime2 != null ? r1v.a(rideTime2) : arrayList3;
                        c cVar2 = serviceLevel3.d;
                        if (cVar2 != null) {
                            str12 = str15;
                            double a3 = cVar2.getA();
                            String b = cVar2.getB();
                            r37 = new HubEstimatedWaitingParamV2(a3, b != null ? b : "");
                        } else {
                            str12 = str15;
                            r37 = arrayList3;
                        }
                        f5 f5Var = serviceLevel3.Q;
                        if (f5Var instanceof ServiceLevelWidget$SurgeBalance) {
                            bVar = ((ServiceLevelWidget$SurgeBalance) f5Var).c;
                        } else if (f5Var instanceof ServiceLevelWidget$SurgeAlert) {
                            bVar = ((ServiceLevelWidget$SurgeAlert) f5Var).c;
                        } else if (f5Var instanceof ServiceLevelWidget$Invisible) {
                            bVar = ((ServiceLevelWidget$Invisible) f5Var).a;
                        } else {
                            if (!jl40.l(f5Var, e5.INSTANCE)) {
                                w511.b();
                                return arrayList3;
                            }
                            r40 = arrayList3;
                            arrayList = new HubServiceLevelParamV2(str11, str17, str18, str19, str20, str21, valueOf2, valueOf3, r33, r34, arrayList4, a2, r37, hubPaidOptionsParam, hubSummaryStyleParam, r40);
                        }
                        r40 = bVar;
                        arrayList = new HubServiceLevelParamV2(str11, str17, str18, str19, str20, str21, valueOf2, valueOf3, r33, r34, arrayList4, a2, r37, hubPaidOptionsParam, hubSummaryStyleParam, r40);
                    }
                    if (arrayList != null) {
                        arrayList7.add(arrayList);
                    }
                    arrayList = arrayList3;
                    calendar2 = calendar;
                    str15 = str12;
                    routeParamV23 = routeParamV22;
                    i = 10;
                } else {
                    Calendar calendar3 = calendar2;
                    routeParamV2 = routeParamV23;
                    String str22 = str15;
                    arrayList2 = arrayList;
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        ServiceLevel serviceLevel4 = (ServiceLevel) it5.next();
                        DriveExtra driveExtra = serviceLevel4.L;
                        if (driveExtra == null) {
                            iterable = EmptyList.a;
                        } else {
                            List list7 = driveExtra.b;
                            ArrayList arrayList10 = new ArrayList(tcc.n(list7, 10));
                            Iterator it6 = list7.iterator();
                            while (it6.hasNext()) {
                                DriveExtra.Offer offer = (DriveExtra.Offer) it6.next();
                                ServiceLevel serviceLevel5 = offer.d;
                                if (serviceLevel5 == null || (rideTime = serviceLevel5.k) == null) {
                                    rideTime = serviceLevel4.k;
                                }
                                if (serviceLevel5 == null || (cVar = serviceLevel5.d) == null) {
                                    cVar = serviceLevel4.d;
                                }
                                if (serviceLevel5 == null || (priceMeta = serviceLevel5.h) == null) {
                                    priceMeta = serviceLevel4.h;
                                }
                                Iterator it7 = it5;
                                if (serviceLevel5 == null || (descriptionParts = serviceLevel5.a) == null) {
                                    descriptionParts = serviceLevel4.a;
                                }
                                ArrayList arrayList11 = arrayList7;
                                if (descriptionParts != null) {
                                    it = it6;
                                    r31 = new HubDescriptionsPartsParam(descriptionParts.c, descriptionParts.d);
                                } else {
                                    it = it6;
                                    r31 = arrayList2;
                                }
                                if (serviceLevel5 == null || (str7 = serviceLevel5.f) == null) {
                                    str7 = serviceLevel4.f;
                                }
                                String str23 = str7;
                                if (serviceLevel5 == null || (str8 = serviceLevel5.e) == null) {
                                    str8 = serviceLevel4.e;
                                }
                                String str24 = str8;
                                String str25 = offer.a;
                                if (serviceLevel5 == null || (selector = serviceLevel5.G) == null || (n7vVar = selector.c) == null || (str9 = n7vVar.b) == null) {
                                    n7v n7vVar2 = serviceLevel4.G.c;
                                    if (n7vVar2 != null) {
                                        str9 = n7vVar2.b;
                                    } else {
                                        r28 = arrayList2;
                                        ?? a4 = rideTime == null ? r1v.a(rideTime) : arrayList2;
                                        if (cVar == null) {
                                            str10 = str6;
                                            double a5 = cVar.getA();
                                            String b2 = cVar.getB();
                                            if (b2 == null) {
                                                b2 = str10;
                                            }
                                            r30 = new HubEstimatedWaitingParamV2(a5, b2);
                                        } else {
                                            str10 = str6;
                                            r30 = arrayList2;
                                        }
                                        serviceLevel = offer.d;
                                        if (serviceLevel != null || (r9 = serviceLevel.j) == null) {
                                            String str26 = serviceLevel4.j;
                                        }
                                        String str27 = str26;
                                        if (serviceLevel != null || (r3 = serviceLevel.i) == null) {
                                            String str28 = serviceLevel4.i;
                                        }
                                        arrayList10.add(new HubDriveOfferParamV2(str23, str24, str25, r28, a4, r30, r31, str27, str28, priceMeta == null ? new HubPricesParam(priceMeta.a, priceMeta.b) : arrayList2));
                                        it5 = it7;
                                        arrayList7 = arrayList11;
                                        str6 = str10;
                                        it6 = it;
                                    }
                                }
                                r28 = str9;
                                if (rideTime == null) {
                                }
                                if (cVar == null) {
                                }
                                serviceLevel = offer.d;
                                if (serviceLevel != null) {
                                }
                                String str262 = serviceLevel4.j;
                                String str272 = str262;
                                if (serviceLevel != null) {
                                }
                                String str282 = serviceLevel4.i;
                                arrayList10.add(new HubDriveOfferParamV2(str23, str24, str25, r28, a4, r30, r31, str272, str282, priceMeta == null ? new HubPricesParam(priceMeta.a, priceMeta.b) : arrayList2));
                                it5 = it7;
                                arrayList7 = arrayList11;
                                str6 = str10;
                                it6 = it;
                            }
                            iterable = arrayList10;
                        }
                        Iterator it8 = it5;
                        ArrayList arrayList12 = arrayList7;
                        String str29 = str6;
                        ycc.r(iterable, arrayList9);
                        it5 = it8;
                        arrayList7 = arrayList12;
                        str6 = str29;
                    }
                    routeStatsDataV2 = new RouteStatsDataV2(str22, valueOf, iefVar, arrayList7, arrayList9, String.valueOf(calendar3), hubTollRoadsParam);
                }
            }
        } else {
            routeParamV2 = routeParamV23;
            arrayList2 = null;
            routeStatsDataV2 = new RouteStatsDataV2(null, null, null, null, null, null, null);
        }
        return ru.yandex.taxi.network.api.a.a(((MobilityHubApi) ((i3y) this.b).getValue()).a(new HubScreenRequestParamsV2(routeParamV2, routeStatsDataV2, str, !list2.isEmpty() ? list2 : arrayList2, set == null ? EmptySet.a : set, str2, str3, str4, mobilityHubSourceAction, mobilityHubSourceType, str5)), arrayList2, continuation);
    }

    public void x(String str, Map map) {
        jwh jwhVar = (jwh) this.a;
        MapBuilder a = ((c1x0) this.b).a(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(a);
        jwhVar.a.o(str, null, linkedHashMap);
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        com.yandex.fintechsdk.core.nfc.impl.internal.a a;
        n2a0 n2a0Var;
        if ((ig5Var instanceof r511 ? (r511) ig5Var : null) == null || (a = ((d860) this.a).a()) == null) {
            return;
        }
        NfcCardType nfcCardType = NfcCardType.TROIKA;
        boolean l = jl40.l(((r511) ig5Var).a, "bind");
        zjy0 zjy0Var = new zjy0(12, this, jh5Var, ig5Var);
        h511 h511Var = new h511(jh5Var, ig5Var, 1 == true ? 1 : 0);
        AppCompatActivity appCompatActivity = (AppCompatActivity) a.c.get();
        if (appCompatActivity != null) {
            NfcStateReceiver nfcStateReceiver = a.i;
            NfcStateReceiver.Companion.getClass();
            appCompatActivity.registerReceiver(nfcStateReceiver, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
            NfcAdapter nfcAdapter = a.d;
            boolean z = nfcAdapter != null && nfcAdapter.isEnabled();
            a.a.a(z);
            if (!z && (n2a0Var = (n2a0) a.g.get()) != null) {
                n2a0Var.a();
            }
        }
        c860 c860Var = new c860(a, h511Var, nfcCardType, zjy0Var, l);
        a.h = c860Var;
        c860Var.invoke();
    }

    public void z(boolean z, boolean z2) {
        if (z && ((PowerManager.WakeLock) this.b) == null) {
            PowerManager powerManager = (PowerManager) ((Context) this.a).getSystemService("power");
            if (powerManager == null) {
                lk91.j("PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.b;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public /* synthetic */ kcz0(Context context) {
        this.a = context;
    }
}
