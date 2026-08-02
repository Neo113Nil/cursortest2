package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: StoreGetStickerStockItemByStickerId.java */
/* loaded from: classes15.dex */
public final class lil0 extends rsg0<StickerStockItem> {
    public lil0(int i) {
        super("store.getStockItemByStickerId");
        D(i, "sticker_id");
        BuildInfo.Client client = BuildInfo.a;
        K("merchant", BuildInfo.v());
        C(!vx2.d.o() ? 1 : 0, "no_inapp");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
        StickerStockItem a = StickerStockItem.a.a(jSONObject2);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a);
        wge0.a(arrayList);
        return a;
    }
}
