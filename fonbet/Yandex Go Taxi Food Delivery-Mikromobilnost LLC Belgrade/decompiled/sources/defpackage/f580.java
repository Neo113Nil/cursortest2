package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementRemoveSource;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;

/* loaded from: classes6.dex */
public final class f580 {
    public final dqe0 a;
    public final arv0 b;
    public final xcv0 c;
    public final mb30 d;
    public final ps21 e;

    public f580(dqe0 dqe0Var, arv0 arv0Var, xcv0 xcv0Var, mb30 mb30Var, ps21 ps21Var) {
        this.a = dqe0Var;
        this.b = arv0Var;
        this.c = xcv0Var;
        this.d = mb30Var;
        this.e = ps21Var;
    }

    public final void a(boolean z, boolean z2, String str, String str2) {
        xcv0 xcv0Var = this.c;
        Boolean valueOf = Boolean.valueOf(z2);
        if (!z) {
            valueOf = null;
        }
        String str3 = this.a.a.V;
        String g = g();
        HashMap m = nnm.m(xcv0Var, "requirement_name", str2);
        if (valueOf != null) {
            m.put(BackendConfig.Restrictions.ENABLED, valueOf);
        }
        m.put("vertical_id", str3);
        m.put("summary_state", g);
        if (str != null) {
            m.put("group_id", str);
        }
        HashMap hashMap = new HashMap();
        Regex regex = sho.a;
        xcv0Var.a.a(sb2.q("Summary.Requirements.${requirement_name}.Tapped", m), m, 1, hashMap);
    }

    public final void b(String str, boolean z) {
        xcv0 xcv0Var = this.c;
        HashMap m = nnm.m(xcv0Var, "requirement_id", str);
        xcv0Var.a.a("Summary.Requirements.CommentClosed", m, 1, x4e.r(z, m, "comment_added"));
    }

    public final void c(String str) {
        xcv0 xcv0Var = this.c;
        xcv0Var.a.a("Summary.Requirements.CommentTapped", nnm.m(xcv0Var, "requirement_id", str), 1, new HashMap());
    }

    public final void d(String str, String str2) {
        String g = g();
        xcv0 xcv0Var = this.c;
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("oldTariff", str);
        hashMap.put("newTariff", str2);
        xcv0Var.a.a("Summary.Requirements.Redirect", hashMap, 2, tse0.r("summary_state", hashMap, g));
    }

    public final void e(String str, List list, RequirementRemoveSource requirementRemoveSource, String str2) {
        SummaryAnalytics$RequirementRemoveSource summaryAnalytics$RequirementRemoveSource;
        xcv0 xcv0Var = this.c;
        String str3 = this.a.a.V;
        List M = a.M(list);
        if (M.isEmpty()) {
            M = null;
        }
        if (str2 == null) {
            str2 = this.a.a.O.a;
        }
        int i = e580.a[requirementRemoveSource.ordinal()];
        if (i == 1) {
            summaryAnalytics$RequirementRemoveSource = SummaryAnalytics$RequirementRemoveSource.Bubble;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            summaryAnalytics$RequirementRemoveSource = SummaryAnalytics$RequirementRemoveSource.List;
        }
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("vertical_id", str3);
        hashMap.put("requirement", str);
        if (M != null) {
            hashMap.put("options", M);
        }
        if (str2 != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        }
        if (summaryAnalytics$RequirementRemoveSource != null) {
            hashMap.put("source", summaryAnalytics$RequirementRemoveSource.getEventValue());
        }
        xcv0Var.a.a("Summary.RequirementLegacy.Deleted", hashMap, 2, new HashMap());
    }

    public final void f(String str, boolean z) {
        xcv0 xcv0Var = this.c;
        HashMap m = nnm.m(xcv0Var, "requirement_id", str);
        xcv0Var.a.a("Summary.Requirements.CommentSaveBox", m, 1, x4e.r(z, m, BackendConfig.Restrictions.ENABLED));
    }

    public final String g() {
        return ((a7t0) this.b).a().b;
    }
}
