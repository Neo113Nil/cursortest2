package xsna;

import org.json.JSONObject;
import xsna.xe3;

/* compiled from: AppsGetCollectionApps.kt */
/* loaded from: classes14.dex */
public final class we3 extends aay<xe3.a> {
    @Override // xsna.aay
    public final xe3.a a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("collection");
        return new xe3.a(optJSONObject != null ? optJSONObject.optLong("id", -1L) : -1L, optJSONObject != null ? optJSONObject.optString("name") : null);
    }
}
