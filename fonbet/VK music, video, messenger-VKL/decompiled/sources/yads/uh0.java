package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class uh0 implements q0 {
    public final dg0 a;
    public final mi0 b;
    public final q93 c;
    public final boolean d;

    public uh0(dg0 dg0Var, mi0 mi0Var, q93 q93Var, boolean z) {
        this.a = dg0Var;
        this.b = mi0Var;
        this.c = q93Var;
        this.d = z;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        this.c.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i = xsna.wq.b(jSONArray, i, arrayList, i, 1)) {
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("design");
        xf0 a = optJSONObject != null ? this.a.a(optJSONObject) : null;
        hi0 a2 = a != null ? this.b.a(a, this.d) : null;
        if (a2 != null) {
            return new sh0(optString, a2, arrayList);
        }
        throw new a22("Native Ad json has not required attributes");
    }
}
