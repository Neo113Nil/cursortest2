package defpackage;

import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;

/* loaded from: classes6.dex */
public final class ag31 {
    public final pho a;

    public ag31(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, String str3, String str4, VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason) {
        HashMap u = g8e.u("selected_vertical_id", str, "selected_vertical_name", str2);
        u.put("previous_selected_vertical_id", str3);
        u.put("previous_selected_vertical_name", str4);
        u.put(CRLReasonCodeExtension.REASON, verticalSelectorAnalytics$SelectionChangeReason.getEventValue());
        this.a.a("VerticalSelector.SelectionChanged", u, 1, new HashMap());
    }
}
