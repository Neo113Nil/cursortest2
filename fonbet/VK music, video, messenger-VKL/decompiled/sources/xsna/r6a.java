package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: CatalogGetSection.kt */
@ozl
/* loaded from: classes16.dex */
public final class r6a extends rsg0<hda> {
    public final wba s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6a(wba wbaVar, String str, String str2, boolean z, Long l, Boolean bool, String str3, ArrayList arrayList, int i) {
        super("catalog.getSection");
        z = (i & 8) != 0 ? false : z;
        l = (i & 16) != 0 ? null : l;
        Integer num = (i & 32) != 0 ? null : 20;
        bool = (i & 64) != 0 ? null : bool;
        str3 = (i & 128) != 0 ? null : str3;
        arrayList = (i & 256) != 0 ? null : arrayList;
        this.s = wbaVar;
        K("section_id", str);
        if (str2 != null) {
            K("start_from", str2);
        }
        if (z) {
            R("force_refresh", true);
        }
        if (l != null) {
            D(l.longValue(), "purchase_for");
        }
        if (num != null) {
            C(num.intValue(), "count");
        }
        if (fxc0.B().J().k() && bool != null) {
            C(bool.booleanValue() ? 1 : 0, "sort_album");
        }
        if (str3 != null) {
            K("ref", str3);
        }
        K("device_info", zeq0.c(Boolean.TRUE));
        if (arrayList != null) {
            K("applied_toggles", GsonHolder.a().toJson(arrayList));
        }
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
