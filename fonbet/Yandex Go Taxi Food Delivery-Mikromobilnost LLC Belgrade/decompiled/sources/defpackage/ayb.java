package defpackage;

import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyButtonName;
import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyCloseReason;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes12.dex */
public final class ayb {
    public final pho a;

    public ayb(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ClarifyAnalytics$ClarifyButtonName clarifyAnalytics$ClarifyButtonName) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", clarifyAnalytics$ClarifyButtonName.getEventValue());
        this.a.a("Clarify.Button.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(ClarifyAnalytics$ClarifyCloseReason clarifyAnalytics$ClarifyCloseReason) {
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, clarifyAnalytics$ClarifyCloseReason.getEventValue());
        this.a.a("Clarify.Closed", hashMap, 1, new HashMap());
    }
}
