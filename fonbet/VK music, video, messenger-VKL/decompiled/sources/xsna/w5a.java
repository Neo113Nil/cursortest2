package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import org.json.JSONObject;

/* compiled from: CatalogGetAudioClipsSearch.kt */
/* loaded from: classes16.dex */
public final class w5a extends rsg0<hda> {
    public final wba s;

    public w5a(wba wbaVar, String str) {
        super("catalog.getAudioClipsSearch");
        this.s = wbaVar;
        j("ref", "");
        K("query", str);
        C(1, "need_blocks");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        hda c = this.s.c(jSONObject.getJSONObject("response"));
        CatalogSection Ab = ((CatalogCatalog) c.a).Ab();
        return new hda(Ab, c.b, Ab.e);
    }
}
