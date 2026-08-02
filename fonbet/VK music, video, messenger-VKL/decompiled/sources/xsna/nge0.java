package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Purchase.java */
/* loaded from: classes18.dex */
public final class nge0 {
    public final int a;
    public final JSONObject b;
    public final JSONArray c;
    public final JSONObject d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;
    public final long[] i;
    public final int j;
    public final Long k;

    @Nullable
    public final StickersBonusResult l;

    @Nullable
    public final a m;

    /* compiled from: Purchase.java */
    public static class a {
        public int a;
        public int b;
    }

    public nge0(JSONObject jSONObject) {
        StickersBonusResult a2;
        this.a = jSONObject.optInt("success");
        this.h = jSONObject.optInt("state");
        this.e = jSONObject.optString("message");
        this.f = jSONObject.optString("error_message");
        this.g = jSONObject.optInt("error_fatal") == 1;
        this.b = jSONObject.optJSONObject("product");
        this.c = jSONObject.optJSONArray("products");
        this.d = jSONObject.optJSONObject("random_selector_result");
        this.j = jSONObject.optInt("order_status", -1);
        JSONArray optJSONArray = jSONObject.optJSONArray("user_ids");
        if (optJSONArray != null) {
            this.i = new long[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.i[i] = optJSONArray.optLong(i);
            }
            Arrays.sort(this.i);
        }
        a aVar = null;
        this.k = jSONObject.has("order_id") ? Long.valueOf(jSONObject.optLong("order_id")) : null;
        JSONObject optJSONObject = jSONObject.optJSONObject("stickers_bonus");
        if (optJSONObject == null) {
            a2 = null;
        } else {
            Serializer.c<StickersBonusResult> cVar = StickersBonusResult.CREATOR;
            a2 = StickersBonusResult.a.a(optJSONObject);
        }
        this.l = a2;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("confirmation");
        if (optJSONObject2 != null) {
            aVar = new a();
            aVar.a = optJSONObject2.optInt("price");
            aVar.b = optJSONObject2.optInt("balance");
        }
        this.m = aVar;
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.a + ", product=" + this.b + ", products=" + this.c + ", randomSelectorResult=" + this.d + ", message='" + this.e + "', error_message='" + this.f + "', error_fatal=" + this.g + ", state=" + this.h + ", userIds=" + Arrays.toString(this.i) + ", orderStatus=" + this.j + ", orderId=" + this.k + ", stickerBonus=" + this.l + ", confirmation=" + this.m + '}';
    }
}
