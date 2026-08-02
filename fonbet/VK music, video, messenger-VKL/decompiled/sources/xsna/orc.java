package xsna;

import org.json.JSONObject;

/* compiled from: ClipDraftJsonMigration5to6.kt */
/* loaded from: classes14.dex */
public final class orc extends be {
    @Override // xsna.be
    public final JSONObject S(JSONObject jSONObject) {
        if (f370.t(jSONObject, "aspect_ratio") == null) {
            jSONObject.put("aspect_ratio", Float.valueOf(0.5625f));
        }
        return jSONObject;
    }
}
