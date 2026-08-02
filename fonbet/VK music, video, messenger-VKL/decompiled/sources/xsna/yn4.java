package xsna;

import org.json.JSONObject;

/* compiled from: AudioFinishRecomsOnboarding.kt */
/* loaded from: classes3.dex */
public final class yn4 extends rsg0<String> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        return (optJSONObject == null || (optString = optJSONObject.optString("url")) == null) ? "" : optString;
    }
}
