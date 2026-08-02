package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: CatalogGetStickers.kt */
/* loaded from: classes16.dex */
public final class t6a extends rsg0<hda> {
    public final wba s;

    public t6a(wba wbaVar, String str, UserId userId, Long l, String str2) {
        super("catalog.getStickers");
        this.s = wbaVar;
        C(1, "need_blocks");
        if (str2 != null) {
            K("url", str2);
        }
        if (fkq0.c(userId)) {
            F(userId, "owner_id");
        }
        if (l != null) {
            D(l.longValue(), "purchase_for");
        }
        if (str != null) {
            K("ref", str);
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.s.c(jSONObject.getJSONObject("response"));
    }
}
