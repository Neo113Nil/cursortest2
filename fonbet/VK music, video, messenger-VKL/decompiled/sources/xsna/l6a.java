package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: CatalogGetPodcast.kt */
/* loaded from: classes16.dex */
public final class l6a extends rsg0<hda> {
    public final wba s;

    public l6a(wba wbaVar, UserId userId, String str, String str2) {
        super("catalog.getPodcasts");
        this.s = wbaVar;
        C(1, "need_blocks");
        K("ref", str);
        if (str2 != null) {
            K("category_id", str2);
        }
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
