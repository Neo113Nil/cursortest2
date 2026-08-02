package xsna;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DatabaseGetCountriesById.kt */
/* loaded from: classes14.dex */
public final class iwk extends rsg0<List<? extends vyj>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("response");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new vyj(jSONObject2.optInt("id"), jSONObject2.optString("title")));
        }
        return arrayList;
    }
}
