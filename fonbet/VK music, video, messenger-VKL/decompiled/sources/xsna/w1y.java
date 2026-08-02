package xsna;

import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsArticleEditorBridgeDelegate.kt */
/* loaded from: classes6.dex */
public final class w1y {
    public final x6y a;

    public w1y(x6y x6yVar) {
        this.a = x6yVar;
    }

    public final void a(String str) {
        fvv0 M = this.a.M();
        if (M == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("payload");
            Pair pair = new Pair(Boolean.valueOf(jSONObject.optBoolean("wasSaved")), jSONObject.optString("link"));
            M.getView().Ze((String) pair.j(), ((Boolean) pair.i()).booleanValue());
        } catch (JSONException unused) {
        }
    }
}
