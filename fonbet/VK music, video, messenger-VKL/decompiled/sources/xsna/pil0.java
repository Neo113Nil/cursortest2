package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickersPacksChunk;
import org.json.JSONObject;

/* compiled from: StoreGetStickersRandomSelectorPacks.kt */
/* loaded from: classes15.dex */
public final class pil0 extends rsg0<StickersPacksChunk> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        Serializer.c<StickersPacksChunk> cVar = StickersPacksChunk.CREATOR;
        return StickersPacksChunk.a.a(jSONObject2);
    }
}
