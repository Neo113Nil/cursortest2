package xsna;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MessagesGetChangedObjectsApiCmd.kt */
/* loaded from: classes2.dex */
public final class le20 implements k7r0<me20> {
    public static ArrayList b(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            long optLong = jSONObject2.optLong("user_id");
            jSONObject2.optInt("subcode");
            arrayList.add(new ke20(optLong));
        }
        return arrayList;
    }
}
