package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ju0 implements q0 {
    public final wb3 a;

    public ju0(wb3 wb3Var) {
        this.a = wb3Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String optString2 = jSONObject2.optString("title");
            if (optString2 == null || optString2.length() == 0 || optString2.equals("null")) {
                throw new a22("Native Ad json has not required attributes");
            }
            this.a.getClass();
            arrayList.add(new gu0(optString2, wb3.a("url", jSONObject2)));
        }
        if (arrayList.isEmpty()) {
            throw new a22("Native Ad json has not required attributes");
        }
        return new hu0(optString, arrayList);
    }
}
