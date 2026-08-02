package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardCloseMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardOpenMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandReasonV2;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes14.dex */
public final class e6t0 {
    public final arv0 a;
    public final xcv0 b;
    public final wiq0 c;
    public boolean d;

    public e6t0(arv0 arv0Var, xcv0 xcv0Var, wiq0 wiq0Var) {
        this.a = arv0Var;
        this.b = xcv0Var;
        this.c = wiq0Var;
    }

    public final void a(SummaryAnalytics$LegacySummaryCardCloseMethod summaryAnalytics$LegacySummaryCardCloseMethod) {
        this.b.f(summaryAnalytics$LegacySummaryCardCloseMethod, ((a7t0) this.a).a().b);
    }

    public final void b(SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2) {
        String str;
        jn40 jn40Var;
        wiq0 wiq0Var = this.c;
        pex0 m = ((k) wiq0Var).m();
        Set set = (m == null || (jn40Var = m.V) == null) ? null : jn40Var.f;
        String h = ((k) wiq0Var).h();
        pex0 m2 = ((k) wiq0Var).m();
        if (m2 == null || (str = m2.b) == null) {
            str = "";
        }
        this.b.b(summaryAnalytics$SummaryCollapseReasonV2, h, str, set != null ? a.J0(set) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(SummaryExpandReason summaryExpandReason) {
        SummaryAnalytics$SummaryExpandReasonV2 summaryAnalytics$SummaryExpandReasonV2;
        ArrayList arrayList;
        String str;
        Set set;
        Set<String> set2;
        wcv0 wcv0Var;
        List list;
        Object obj;
        for (SummaryAnalytics$LegacySummaryCardOpenMethod summaryAnalytics$LegacySummaryCardOpenMethod : SummaryAnalytics$LegacySummaryCardOpenMethod.a()) {
            if (jl40.l(summaryAnalytics$LegacySummaryCardOpenMethod.getEventValue(), summaryExpandReason.getAnalyticsName())) {
                String str2 = ((a7t0) this.a).a().b;
                xcv0 xcv0Var = this.b;
                xcv0Var.getClass();
                pho phoVar = xcv0Var.a;
                HashMap hashMap = new HashMap();
                hashMap.put("open_method", summaryAnalytics$LegacySummaryCardOpenMethod.getEventValue());
                hashMap.put("summary_state", str2);
                phoVar.a("Summary.SummaryCard.Opened", hashMap, 2, new HashMap());
                switch (d6t0.a[summaryExpandReason.ordinal()]) {
                    case 1:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.OptionsTap;
                        break;
                    case 2:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.Pull;
                        break;
                    case 3:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.HandlerTap;
                        break;
                    case 4:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.SelectorTap;
                        break;
                    case 5:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoRequirementDeeplink;
                        break;
                    case 6:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoRedirect;
                        break;
                    case 7:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoUnavailableTariffOnOrder;
                        break;
                    case 8:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoUnsupportedRequirementOnOrder;
                        break;
                    case 9:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoGluedRequirementOnOrder;
                        break;
                    case 10:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoMulticlassOnOrder;
                        break;
                    case 11:
                        return;
                    case 12:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoRouteDeeplink;
                        break;
                    case 13:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoSummaryOrderButtonExperiment;
                        break;
                    case 14:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoRemoveAltChoiceBubbleClick;
                        break;
                    case 15:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoDeliveryRedirectAction;
                        break;
                    case 16:
                        summaryAnalytics$SummaryExpandReasonV2 = SummaryAnalytics$SummaryExpandReasonV2.AutoShortcutRedirectAction;
                        break;
                    default:
                        w511.b();
                        return;
                }
                k kVar = (k) this.c;
                pex0 m = kVar.m();
                List list2 = null;
                jn40 jn40Var = m != null ? m.V : null;
                if (jn40Var == null || (set2 = jn40Var.e) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (String str3 : set2) {
                        pex0 m2 = kVar.m();
                        if (m2 != null && (list = m2.U) != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (jl40.l(((pex0) obj).b, str3)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            pex0 pex0Var = (pex0) obj;
                            if (pex0Var != null) {
                                wcv0Var = new wcv0(str3, pex0Var.h.b, pex0Var.e());
                                if (wcv0Var == null) {
                                    arrayList.add(wcv0Var);
                                }
                            }
                        }
                        wcv0Var = null;
                        if (wcv0Var == null) {
                        }
                    }
                }
                String h = kVar.h();
                pex0 m3 = kVar.m();
                if (m3 == null || (str = m3.b) == null) {
                    str = "";
                }
                if (jn40Var != null && (set = jn40Var.f) != null) {
                    list2 = a.J0(set);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put(CRLReasonCodeExtension.REASON, summaryAnalytics$SummaryExpandReasonV2.getEventValue());
                hashMap2.put("vertical_id", h);
                hashMap2.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((wcv0) it2.next()).d);
                    }
                    hashMap2.put("tariff_class_list", arrayList2);
                }
                if (list2 != null) {
                    hashMap2.put("preselected_tariffs", list2);
                }
                x4e.B(phoVar, "Summary.Card.Expanded", hashMap2, 3);
                return;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
    }

    public final void d(SummaryExpandReason summaryExpandReason) {
        switch (d6t0.a[summaryExpandReason.ordinal()]) {
            case 1:
                String str = ((a7t0) this.a).a().b;
                xcv0 xcv0Var = this.b;
                xcv0Var.a.a("Summary.SummaryCard.OptionsButtonTapped", nnm.m(xcv0Var, "summary_state", str), 1, new HashMap());
                c(summaryExpandReason);
                break;
            case 2:
                if (!this.d) {
                    c(SummaryExpandReason.PULL);
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                c(summaryExpandReason);
                break;
            default:
                w511.b();
                break;
        }
    }
}
