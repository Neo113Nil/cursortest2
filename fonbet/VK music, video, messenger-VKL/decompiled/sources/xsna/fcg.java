package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommentRestriction.kt */
/* loaded from: classes18.dex */
public final class fcg implements bxx {
    public final int b;
    public final ArrayList<String> c = new ArrayList<>();

    public fcg(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("descriptions");
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (optString != null) {
                this.c.add(optString);
            }
        }
        this.b = jSONObject.optInt("delay");
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return new JSONObject().put("descriptions", jSONArray).put("delay", this.b);
    }
}
