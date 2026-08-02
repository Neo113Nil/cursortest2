package defpackage;

import com.yandex.go.scooters.analytics.ScootersOrderCompletionCardAnalytics$ButtonName;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class p5o0 {
    public final pho a;

    public p5o0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ScootersOrderCompletionCardAnalytics$ButtonName scootersOrderCompletionCardAnalytics$ButtonName, String str) {
        HashMap hashMap = new HashMap();
        if (scootersOrderCompletionCardAnalytics$ButtonName != null) {
            hashMap.put("button_name", scootersOrderCompletionCardAnalytics$ButtonName.getEventValue());
        }
        if (str != null) {
            hashMap.put("order_id", str);
        }
        this.a.a("ScootersOrderCompletionCard.Tapped", hashMap, 1, new HashMap());
    }
}
