package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementRedirectSource;
import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementTappedSource;
import com.yandex.go.summary.analytics.SummaryAnalytics$UnsupportedRequirementSource;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class iev0 {
    public final xcv0 a;

    public iev0(xcv0 xcv0Var) {
        this.a = xcv0Var;
    }

    public final void a(String str, SummaryAnalytics$RequirementRedirectSource summaryAnalytics$RequirementRedirectSource, String str2, t450 t450Var, String str3, String str4, String str5) {
        Integer valueOf = t450Var != null ? Integer.valueOf(t450Var.a + 1) : null;
        xcv0 xcv0Var = this.a;
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("requirement_id", str);
        hashMap.put("redirect_tariff", str2);
        hashMap.put("source", summaryAnalytics$RequirementRedirectSource.getEventValue());
        if (valueOf != null) {
            hashMap.put("index", valueOf);
        }
        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
        hashMap.put("vertical_id", str4);
        if (str5 != null) {
            hashMap.put("alt_type", str5);
        }
        xcv0Var.a.a("Summary.Card.Requirement.RequirementRedirect.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(String str, SummaryAnalytics$RequirementTappedSource summaryAnalytics$RequirementTappedSource, boolean z, String str2, t450 t450Var, String str3, String str4, String str5) {
        Integer valueOf = t450Var != null ? Integer.valueOf(t450Var.a + 1) : null;
        xcv0 xcv0Var = this.a;
        HashMap m = nnm.m(xcv0Var, "requirement_id", str);
        m.put("source", summaryAnalytics$RequirementTappedSource.getEventValue());
        m.put("is_selected", Boolean.valueOf(z));
        if (str2 != null) {
            m.put(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, str2);
        }
        if (valueOf != null) {
            m.put("index", valueOf);
        }
        m.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
        m.put("vertical_id", str4);
        if (str5 != null) {
            m.put("alt_type", str5);
        }
        xcv0Var.a.a("Summary.Card.Requirement.Tapped", m, 1, new HashMap());
    }

    public final void c(String str, String str2, String str3, String str4, int i, String str5) {
        xcv0 xcv0Var = this.a;
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("requirement_id", str);
        hashMap.put("redirect_tariff", str2);
        hashMap.put("index", Integer.valueOf(i + 1));
        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
        hashMap.put("vertical_id", str4);
        if (str5 != null) {
            hashMap.put("alt_type", str5);
        }
        xcv0Var.a.a("Summary.Card.Requirement.UnsupportedRequirementRedirect.Tapped", hashMap, 1, new HashMap());
    }

    public final void d(String str, SummaryAnalytics$UnsupportedRequirementSource summaryAnalytics$UnsupportedRequirementSource, List list, t450 t450Var, String str2, String str3, String str4) {
        Integer valueOf = t450Var != null ? Integer.valueOf(t450Var.a + 1) : null;
        xcv0 xcv0Var = this.a;
        HashMap m = nnm.m(xcv0Var, "requirement_id", str);
        if (list != null) {
            m.put("options", list);
        }
        m.put("source", summaryAnalytics$UnsupportedRequirementSource.getEventValue());
        if (valueOf != null) {
            m.put("index", valueOf);
        }
        m.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        m.put("vertical_id", str3);
        if (str4 != null) {
            m.put("alt_type", str4);
        }
        xcv0Var.a.a("Summary.Card.Requirement.UnsupportedRequirement.Tapped", m, 1, new HashMap());
    }
}
