package xsna;

import org.json.JSONObject;

/* compiled from: ClipDraftJsonMigration8to9.kt */
/* loaded from: classes14.dex */
public final class rrc extends be {
    @Override // xsna.be
    public final JSONObject S(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("draft");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("extra_data") : null;
        String optString = optJSONObject2 != null ? optJSONObject2.optString("involvement_attachment") : null;
        if (optString != null && !drm0.N(optString)) {
            w9y w9yVar = new w9y();
            w9yVar.e(optString, "type");
            w9yVar.b(Boolean.TRUE, "value");
            s3q0 s3q0Var = s3q0.a;
            optJSONObject2.put("involvement_attachment", w9yVar.a);
        }
        return jSONObject;
    }
}
