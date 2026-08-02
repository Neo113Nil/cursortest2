package xsna;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GooglePayRequestUtils.kt */
/* loaded from: classes6.dex */
public final class bau {
    public static final /* synthetic */ int a = 0;

    static {
        new JSONArray((Collection) y9u.b);
        new JSONArray((Collection) y9u.a);
    }

    public static JSONObject a() {
        JSONObject d = yq.d("type", "CARD");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("allowedAuthMethods", new JSONArray((Collection) y9u.a));
        jSONObject.put("allowedCardNetworks", new JSONArray((Collection) y9u.b));
        d.put("parameters", jSONObject);
        return d;
    }
}
