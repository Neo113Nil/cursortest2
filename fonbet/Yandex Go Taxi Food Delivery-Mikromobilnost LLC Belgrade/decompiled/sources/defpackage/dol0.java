package defpackage;

import com.adjust.sdk.Constants;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class dol0 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(13);
        a = hashMap;
        Integer valueOf = Integer.valueOf(Constants.MINIMAL_ERROR_STATUS_CODE);
        hashMap.put(Constants.NORMAL, valueOf);
        hashMap.put("bold", 700);
        b64.B(1, hashMap, "bolder", -1, "lighter");
        b64.B(100, hashMap, "100", 200, "200");
        hashMap.put("300", 300);
        hashMap.put("400", valueOf);
        b64.B(500, hashMap, "500", 600, "600");
        vfc.C(hashMap, "700", 700, 800, "800");
        hashMap.put("900", 900);
    }
}
