package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import org.json.JSONObject;

/* compiled from: CatalogGetShortVideoSearch.kt */
/* loaded from: classes16.dex */
public final class s6a extends rsg0<hda> {
    public final wba s;

    public s6a(wba wbaVar, String str, String str2, String str3) {
        super("catalog.getShortVideoSearch");
        this.s = wbaVar;
        C(1, "need_blocks");
        if (str != null) {
            K(CampaignEx.JSON_KEY_AD_Q, str);
        }
        if (str2 != null) {
            K("screen_ref", str2);
        }
        if (str3 != null) {
            K("input_method", str3);
        }
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        hda c = this.s.c(jSONObject.getJSONObject("response"));
        CatalogSection Ab = ((CatalogCatalog) c.a).Ab();
        return new hda(Ab, c.b, Ab.e);
    }
}
