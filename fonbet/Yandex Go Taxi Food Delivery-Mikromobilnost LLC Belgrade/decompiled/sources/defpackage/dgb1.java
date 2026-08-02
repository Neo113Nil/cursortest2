package defpackage;

import android.net.Uri;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import com.ybsdk.deeplink.generated.StatusScreenAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes3.dex */
public abstract class dgb1 {
    public static final Pair a(String str, String str2) {
        if (str2 == null) {
            str2 = str;
        }
        return new Pair(str, str2);
    }

    public static StatusScreenAction b(Uri uri) {
        String queryParameter = uri.getQueryParameter("target");
        if (queryParameter == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!Collections.singleton("target").contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String queryParameter2 = uri.getQueryParameter((String) next);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            linkedHashMap.put(next, queryParameter2);
        }
        return new StatusScreenAction(queryParameter, linkedHashMap.isEmpty() ? null : linkedHashMap);
    }

    public static final String c(ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment, String str) {
        return (String) chargersLowBatteryPushExperiment.c.get(str);
    }

    public static final String d(ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment, String str) {
        if (str != null) {
            return c(chargersLowBatteryPushExperiment, str);
        }
        return null;
    }
}
