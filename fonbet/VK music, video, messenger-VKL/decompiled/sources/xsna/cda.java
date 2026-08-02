package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import org.json.JSONObject;

/* compiled from: CatalogReplaceSections.kt */
/* loaded from: classes16.dex */
public final class cda extends rsg0<hda> {
    public final wba s;

    public cda(wba wbaVar, String str) {
        super("catalog.replaceSections");
        this.s = wbaVar;
        K("replacement_id", str);
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        wba wbaVar = this.s;
        wbaVar.getClass();
        CatalogExtendedData catalogExtendedData = new CatalogExtendedData(jSONObject2);
        CatalogSection e = wbaVar.e(jSONObject2.getJSONObject("section"));
        return new hda(e, catalogExtendedData, e.e);
    }
}
