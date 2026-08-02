package xsna;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NameHistory.kt */
/* loaded from: classes7.dex */
public final class st50 {
    public final boolean a;
    public final ArrayList b;

    public st50(JSONObject jSONObject) {
        ArrayList arrayList;
        this.a = jSONObject.optBoolean("has_more", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("history");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new com.vkontakte.android.api.a(optJSONArray.getJSONObject(i)));
            }
        } else {
            arrayList = null;
        }
        this.b = arrayList;
    }
}
