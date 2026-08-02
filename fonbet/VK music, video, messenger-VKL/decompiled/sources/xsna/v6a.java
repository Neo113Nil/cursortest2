package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: CatalogGetStickersSearchSection.kt */
/* loaded from: classes16.dex */
public final class v6a extends rsg0<hda> {
    public final wba s;

    public v6a(wba wbaVar, String str, String str2, String str3, UserId userId, UserId userId2) {
        super("catalog.getStickersSearch");
        this.s = wbaVar;
        C(1, "need_blocks");
        K("query", str);
        K("context", str2);
        K("ref", str3);
        if (userId != null) {
            F(userId, "owner_id");
        }
        if (userId2 != null) {
            F(userId2, "purchase_for");
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        hda c = this.s.c(jSONObject.getJSONObject("response"));
        CatalogSection Ab = ((CatalogCatalog) c.a).Ab();
        return new hda(Ab, c.b, Ab.e);
    }
}
