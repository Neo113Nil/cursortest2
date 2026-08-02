package xsna;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.internal.api.GsonHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CatalogReplaceBlocks.kt */
/* loaded from: classes16.dex */
public final class bda extends rsg0<CatalogReplacementResponse> {
    public final wba s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bda(wba wbaVar, List list, String str, List list2, int i) {
        super("catalog.replaceBlocks");
        list2 = (i & 16) != 0 ? null : list2;
        this.s = wbaVar;
        K("replacement_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
        if (str != null) {
            K("replacement_place", str);
        }
        if (list2 != null) {
            K("applied_toggles", GsonHolder.a().toJson(list2));
        }
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        this.s.getClass();
        CatalogExtendedData catalogExtendedData = new CatalogExtendedData(jSONObject2);
        JSONObject optJSONObject = jSONObject2.optJSONObject("replacements");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONArray f = wba.f("replacements", optJSONObject);
        ArrayList arrayList = new ArrayList(f.length());
        int length = f.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = f.getJSONObject(i);
            JSONArray f2 = wba.f("to_blocks", jSONObject3);
            ArrayList arrayList2 = new ArrayList(f2.length());
            int length2 = f2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.add(wba.b("", f2.getJSONObject(i2)));
            }
            arrayList.add(new CatalogReplacement(f370.O(wba.f("from_block_ids", jSONObject3)), arrayList2));
        }
        return new CatalogReplacementResponse(arrayList, catalogExtendedData, optJSONObject.optString("new_next_from"));
    }
}
