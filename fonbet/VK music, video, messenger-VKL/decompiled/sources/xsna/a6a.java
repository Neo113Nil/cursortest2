package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: CatalogGetBlockItems.kt */
@ozl
/* loaded from: classes16.dex */
public final class a6a extends rsg0<hda> {
    public final wba s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6a(wba wbaVar, String str, String str2, Long l, String str3, ArrayList arrayList, int i) {
        super("catalog.getBlockItems");
        l = (i & 16) != 0 ? null : l;
        arrayList = (i & 64) != 0 ? null : arrayList;
        this.s = wbaVar;
        K("block_id", str);
        if (str2 != null) {
            K("start_from", str2);
        }
        if (l != null) {
            D(l.longValue(), "purchase_for");
        }
        if (str3 != null) {
            K("ref", str3);
        }
        if (arrayList != null) {
            K("applied_toggles", GsonHolder.a().toJson(arrayList));
        }
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        this.s.getClass();
        CatalogExtendedData catalogExtendedData = new CatalogExtendedData(jSONObject2);
        CatalogBlock b = wba.b("", jSONObject2.getJSONObject("block"));
        return new hda(b, catalogExtendedData, b.f);
    }
}
