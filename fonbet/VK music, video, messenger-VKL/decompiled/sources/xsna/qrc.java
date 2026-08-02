package xsna;

import org.json.JSONObject;

/* compiled from: ClipDraftJsonMigration7to8.kt */
/* loaded from: classes14.dex */
public final class qrc extends be {
    @Override // xsna.be
    public final JSONObject S(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("draft");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("base_data") : null;
        JSONObject optJSONObject3 = optJSONObject != null ? optJSONObject.optJSONObject("extra_data") : null;
        Object remove = optJSONObject3 != null ? optJSONObject3.remove("ord_info") : null;
        if (remove != null && optJSONObject2 != null) {
            optJSONObject2.put("ord_info", remove);
        }
        Object remove2 = optJSONObject3 != null ? optJSONObject3.remove("delayed_publication_date") : null;
        if (remove2 != null && optJSONObject2 != null) {
            optJSONObject2.put("delayed_publication_date", remove2);
        }
        return jSONObject;
    }
}
