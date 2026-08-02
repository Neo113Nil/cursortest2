package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: DeviceTypeConverters.kt */
/* loaded from: classes12.dex */
public final class x6m {
    public static final Object a;

    static {
        Map k = pn00.k(new Pair(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0), new Pair("CHEST_STRAP", 7), new Pair("FITNESS_BAND", 6), new Pair("HEAD_MOUNTED", 5), new Pair("PHONE", 2), new Pair("RING", 4), new Pair("SCALE", 3), new Pair("SMART_DISPLAY", 8), new Pair("WATCH", 1));
        a = k;
        Set<Map.Entry> entrySet = k.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap.put(pair.i(), pair.j());
        }
    }
}
