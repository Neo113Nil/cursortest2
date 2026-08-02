package defpackage;

import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$LocationUpdateType;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ibw0 {
    public final pho a;

    public ibw0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(SuperappMainAnalytics$LocationUpdateType superappMainAnalytics$LocationUpdateType, gbw0 gbw0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("update_type", superappMainAnalytics$LocationUpdateType.getEventValue());
        hashMap.put("location", gbw0Var.i);
        this.a.a("SuperappMain.UserLocation.Received", hashMap, 1, new HashMap());
    }
}
