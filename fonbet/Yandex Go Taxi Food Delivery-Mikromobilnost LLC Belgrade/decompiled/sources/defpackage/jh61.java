package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class jh61 implements gu71 {
    public final sh81 a;
    public final lm71 b;
    public final w781 c;

    public jh61(Context context, sh81 sh81Var) {
        lm71 lm71Var = new lm71(context, sh81Var);
        w781 w781Var = new w781();
        this.a = sh81Var;
        this.b = lm71Var;
        this.c = w781Var;
    }

    @Override // defpackage.gu71
    public final xh71 a(JSONObject jSONObject) {
        List j;
        String optString = jSONObject.optString("type");
        JSONArray jSONArray = null;
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        this.a.getClass();
        String a = sh81.a("fallbackUrl", jSONObject);
        this.c.getClass();
        JSONArray optJSONArray = jSONObject.optJSONArray("fallbackTrackingUrls");
        ListBuilder a2 = optJSONArray == null ? null : w781.a(optJSONArray);
        if (jSONObject.has("preferredPackages")) {
            jSONArray = jSONObject.getJSONArray("preferredPackages");
        } else if (jSONObject.has("preferredLinks")) {
            jSONArray = jSONObject.getJSONArray("preferredLinks");
        }
        lm71 lm71Var = this.b;
        lm71Var.getClass();
        if (jSONArray == null) {
            j = EmptyList.a;
        } else {
            ListBuilder a3 = rcc.a();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    a3.add(((hn71) lm71Var.b).h(optJSONObject));
                }
            }
            j = a3.j();
        }
        return new wr81(optString, a, a2, j);
    }
}
