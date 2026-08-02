package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import org.json.JSONObject;

/* compiled from: CatalogPodcastSearchRequest.kt */
/* loaded from: classes16.dex */
public final class zba extends rsg0<hda> {
    public final wba s;

    public zba(wba wbaVar, String str, String str2) {
        super("catalog.getPodcastsSearch");
        this.s = wbaVar;
        R("need_blocks", true);
        K("query", str);
        K("context", str2);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        hda c = this.s.c(jSONObject.getJSONObject("response"));
        CatalogSection Ab = ((CatalogCatalog) c.a).Ab();
        return new hda(Ab, c.b, Ab.e);
    }
}
