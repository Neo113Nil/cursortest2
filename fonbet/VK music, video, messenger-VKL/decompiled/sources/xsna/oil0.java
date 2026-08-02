package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersPacksChunk;
import org.json.JSONObject;

/* compiled from: StoreGetStickersRandomSelectorOptions.kt */
/* loaded from: classes15.dex */
public final class oil0 extends rsg0<a> {

    /* compiled from: StoreGetStickersRandomSelectorOptions.kt */
    public static final class a {
        public final boolean a;
        public final String b;
        public final int c;
        public final StickersPacksChunk d;
        public final StickerStockItem e;
        public final String f;
        public final Boolean g;
        public final Integer h;
        public final Integer i;

        public a(boolean z, String str, int i, StickersPacksChunk stickersPacksChunk, StickerStockItem stickerStockItem, String str2, Boolean bool, Integer num, Integer num2) {
            this.a = z;
            this.b = str;
            this.c = i;
            this.d = stickersPacksChunk;
            this.e = stickerStockItem;
            this.f = str2;
            this.g = bool;
            this.h = num;
            this.i = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31)) * 31;
            String str2 = this.f;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.g;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.h;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.i;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(enabled=");
            sb.append(this.a);
            sb.append(", reason=");
            sb.append(this.b);
            sb.append(", balance=");
            sb.append(this.c);
            sb.append(", packs=");
            sb.append(this.d);
            sb.append(", stockItem=");
            sb.append(this.e);
            sb.append(", probabilityNote=");
            sb.append(this.f);
            sb.append(", isGiftEnabled=");
            sb.append(this.g);
            sb.append(", freeAttemptsCount=");
            sb.append(this.h);
            sb.append(", giftPrice=");
            return uqi.b(sb, this.i, ')');
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        boolean z = jSONObject2.getBoolean("is_enabled");
        String optString = jSONObject2.optString("reason");
        int i = jSONObject2.getInt("balance");
        Serializer.c<StickersPacksChunk> cVar = StickersPacksChunk.CREATOR;
        StickersPacksChunk a2 = StickersPacksChunk.a.a(jSONObject2.getJSONObject("packs"));
        Serializer.c<StickerStockItem> cVar2 = StickerStockItem.CREATOR;
        return new a(z, optString, i, a2, StickerStockItem.a.a(jSONObject2.getJSONObject("stock_item")), jSONObject2.optString("probability_note"), Boolean.valueOf(jSONObject2.optBoolean("is_gifting_enabled")), Integer.valueOf(jSONObject2.optInt("free_attempts_count")), Integer.valueOf(jSONObject2.optInt("gift_price")));
    }
}
