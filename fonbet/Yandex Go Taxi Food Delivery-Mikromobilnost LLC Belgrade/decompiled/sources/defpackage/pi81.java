package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class pi81 implements gu71 {
    public final pp61 a;
    public final fp71 b;
    public final hb81 c;
    public final boolean d;

    public pi81(pp61 pp61Var, fp71 fp71Var, hb81 hb81Var, boolean z) {
        this.a = pp61Var;
        this.b = fp71Var;
        this.c = hb81Var;
        this.d = z;
    }

    @Override // defpackage.gu71
    public final xh71 a(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        this.c.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("design");
        ap81 a = optJSONObject != null ? this.a.a(optJSONObject) : null;
        ld71 c = a != null ? this.b.c(a, this.d) : null;
        if (c != null) {
            return new dc81(optString, c, arrayList);
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }
}
