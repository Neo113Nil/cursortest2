package xsna;

import java.util.Collection;
import org.json.JSONArray;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class kvf {
    public static lp40 a;
    public static jp40 b;

    public static final JSONArray a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            if (obj instanceof bxx) {
                jSONArray.put(((bxx) obj).e5());
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }
}
