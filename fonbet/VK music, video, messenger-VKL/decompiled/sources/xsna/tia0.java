package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.stickers.StickerItem;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PickerStickers.java */
/* loaded from: classes15.dex */
public final class tia0 extends rsg0<StickerItem[]> {
    public static StickerItem[] s;

    /* compiled from: PickerStickers.java */
    public class a implements hx2<StickerItem[]> {
        @Override // xsna.hx2
        public final void b(StickerItem[] stickerItemArr) {
            StickerItem[] stickerItemArr2 = stickerItemArr;
            if (stickerItemArr2 != null) {
                tia0.s = stickerItemArr2;
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            com.vk.metrics.eventtracking.b.a.a(vKApiExecutionException);
        }
    }

    public tia0() {
        super("photos.getEditorStickers");
        this.d = true;
    }

    public static void F0() {
        new jx2(new tia0(), new a()).a();
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
            int length = jSONArray.length();
            StickerItem[] stickerItemArr = new StickerItem[length];
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                StickerItem stickerItem = StickerItem.l;
                stickerItemArr[i] = StickerItem.a.a(jSONObject2);
            }
            return stickerItemArr;
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            return null;
        }
    }
}
