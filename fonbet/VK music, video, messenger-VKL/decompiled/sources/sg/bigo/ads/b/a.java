package sg.bigo.ads.b;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.view.accessibility.AccessibilityManager;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes9.dex */
public final class a implements g<JSONArray> {
    @Override // sg.bigo.ads.b.g
    public final /* synthetic */ JSONArray a(Context context) {
        HashSet hashSet = new HashSet();
        Iterator<AccessibilityServiceInfo> it = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().getResolveInfo().serviceInfo;
            if ((serviceInfo.applicationInfo.flags & 1) == 0) {
                hashSet.add(serviceInfo.packageName + DomExceptionUtils.SEPARATOR + serviceInfo.name);
            }
        }
        JSONArray a = sg.bigo.ads.c.g.a(hashSet);
        if (sg.bigo.ads.c.g.a(a)) {
            return null;
        }
        return a;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return sg.bigo.ads.a.a.p;
    }
}
