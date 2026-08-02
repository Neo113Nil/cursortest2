package xsna;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.x9m;

/* compiled from: DialogAppearanceModel.kt */
/* loaded from: classes2.dex */
public final class y9m {
    public static final x9m.a a(String str) {
        JSONObject j = cqm0.j(str);
        return new x9m.a(j.getString("accent_color"), j.getString("header_tint"), j.getString("write_bar_tint"), f370.A("text_primary", j), f370.A("text_placeholder", j), f370.A("forward_line", j), new x9m.a.C3987a(f370.O(j.getJSONObject("bubble_gradient").getJSONArray("bubble_gradient_colors")), j.getJSONObject("bubble_gradient").getInt("bubble_gradient_angle")));
    }

    public static final String b(x9m.a aVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        x9m.a.C3987a c3987a = aVar.g;
        jSONObject2.put("bubble_gradient_angle", c3987a.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = c3987a.a.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        s3q0 s3q0Var = s3q0.a;
        jSONObject2.put("bubble_gradient_colors", jSONArray);
        jSONObject.put("accent_color", aVar.a);
        jSONObject.put("header_tint", aVar.b);
        jSONObject.put("write_bar_tint", aVar.c);
        jSONObject.put("text_primary", aVar.d);
        jSONObject.put("text_placeholder", aVar.e);
        jSONObject.put("forward_line", aVar.f);
        jSONObject.put("bubble_gradient", jSONObject2);
        return jSONObject.toString();
    }
}
