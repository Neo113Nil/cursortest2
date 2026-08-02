package xsna;

import org.json.JSONObject;

/* compiled from: PosterUpload.kt */
/* loaded from: classes15.dex */
public final class fbc0 extends rsg0<String> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        return (optJSONObject == null || (optString = optJSONObject.optString("link")) == null) ? "" : optString;
    }
}
