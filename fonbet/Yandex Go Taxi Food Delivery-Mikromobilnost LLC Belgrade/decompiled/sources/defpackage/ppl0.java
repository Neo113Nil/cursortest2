package defpackage;

import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyButtonType;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class ppl0 {
    public final pho a;

    public ppl0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(SafetyCenterAnalytics$EmergencyButtonType safetyCenterAnalytics$EmergencyButtonType, Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_type", safetyCenterAnalytics$EmergencyButtonType.getEventValue());
        hashMap.put("contacts_count", num);
        this.a.a("SafetyCenter.EmergencyButton.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(String str, SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType safetyCenterAnalytics$LostItemsAnalyticsTappedViewType) {
        HashMap p = x4e.p("order_id", str);
        p.put("button", safetyCenterAnalytics$LostItemsAnalyticsTappedViewType.getEventValue());
        this.a.a("SafetyCenter.LostItemsModalCardContent.Tapped", p, 1, new HashMap());
    }
}
