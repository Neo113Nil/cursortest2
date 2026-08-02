package defpackage;

import com.yandex.go.service_catalog.analytics.ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class puq0 {
    public final pho a;

    public puq0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState serviceCatalogAnalytics$ServiceCatalogScreenLoadingState) {
        HashMap hashMap = new HashMap();
        hashMap.put("screen_state", serviceCatalogAnalytics$ServiceCatalogScreenLoadingState.getEventValue());
        this.a.a("ServiceCatalog.BackButton.Tapped", hashMap, 1, new HashMap());
    }
}
