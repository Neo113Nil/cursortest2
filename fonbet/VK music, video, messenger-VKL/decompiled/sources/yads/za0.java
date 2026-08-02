package yads;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e43;

/* loaded from: classes10.dex */
public final class za0 implements q0 {
    public final wb3 a;
    public final wh2 b;
    public final p93 c;

    public za0(wb3 wb3Var, wh2 wh2Var, p93 p93Var) {
        this.a = wb3Var;
        this.b = wh2Var;
        this.c = p93Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) {
        List g;
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        this.a.getClass();
        String a = wb3.a("fallbackUrl", jSONObject);
        this.c.getClass();
        JSONArray optJSONArray = jSONObject.optJSONArray("fallbackTrackingUrls");
        JSONArray jSONArray = null;
        List a2 = optJSONArray == null ? null : p93.a(optJSONArray);
        if (jSONObject.has("preferredPackages")) {
            jSONArray = jSONObject.getJSONArray("preferredPackages");
        } else if (jSONObject.has("preferredLinks")) {
            jSONArray = jSONObject.getJSONArray("preferredLinks");
        }
        wh2 wh2Var = this.b;
        wh2Var.getClass();
        if (jSONArray == null) {
            g = EmptyList.b;
        } else {
            ListBuilder e = e43.e();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    e.add(wh2Var.a.a(optJSONObject));
                }
            }
            g = e.g();
        }
        return new wa0(optString, a, a2, g);
    }
}
