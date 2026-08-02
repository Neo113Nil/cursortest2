package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class tc implements q0 {
    public final wb3 a;
    public final q93 b;

    public tc(wb3 wb3Var, q93 q93Var) {
        this.a = wb3Var;
        this.b = q93Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        this.a.getClass();
        String a = wb3.a("url", jSONObject);
        String a2 = ke1.a("optOutUrl", jSONObject);
        if (a2 == null) {
            a2 = "";
        }
        this.b.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i = xsna.wq.b(jSONArray, i, arrayList, i, 1)) {
        }
        return new rc(optString, a, a2, arrayList);
    }
}
