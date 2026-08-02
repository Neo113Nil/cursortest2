package defpackage;

import java.util.Comparator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class pjn implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObject2 = (JSONObject) obj2;
        return uvc.b(jSONObject != null ? Integer.valueOf(jSONObject.optInt("index")) : null, jSONObject2 != null ? Integer.valueOf(jSONObject2.optInt("index")) : null);
    }
}
