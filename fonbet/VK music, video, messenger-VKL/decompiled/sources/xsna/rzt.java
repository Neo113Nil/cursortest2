package xsna;

import com.vk.dto.gift.GiftCategory;
import org.json.JSONObject;

/* compiled from: GiftsGetCatalogCategory.kt */
/* loaded from: classes15.dex */
public final class rzt extends rsg0<GiftCategory> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return new GiftCategory(jSONObject.getJSONArray("response").getJSONObject(0));
    }
}
