package xsna;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsSilentModeBridgeDelegate.kt */
/* loaded from: classes6.dex */
public final class d6y {
    public final x6y a;

    public d6y(x6y x6yVar) {
        this.a = x6yVar;
    }

    public final void a(String str) {
        fvv0 M = this.a.M();
        if (M == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("payload");
            Boolean valueOf = jSONObject.has("silentModeStatus") ? Boolean.valueOf(jSONObject.getBoolean("silentModeStatus")) : null;
            if (valueOf != null) {
                M.getView().R7(valueOf.booleanValue());
            }
        } catch (JSONException unused) {
        }
    }
}
