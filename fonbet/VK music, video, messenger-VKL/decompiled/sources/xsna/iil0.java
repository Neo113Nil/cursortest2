package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.random.Random;
import org.json.JSONObject;

/* compiled from: StoreBuyProduct.kt */
/* loaded from: classes15.dex */
public final class iil0 extends rsg0<nge0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iil0(List list, String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, Integer num, int i) {
        super("store.buyProduct");
        bool = (i & 128) != 0 ? null : bool;
        bool2 = (i & 256) != 0 ? null : bool2;
        num = (i & 1024) != 0 ? null : num;
        K("product_id", p4g.k(list, StringUtils.COMMA, null));
        K("type", str);
        if (str2 != null && !"".equals(str2)) {
            K("sticker_referrer", str2);
            K("ref", str2);
        }
        str3 = (str3 == null || str3.length() < 4) ? "0000" : str3;
        int F0 = j5g.F0(list) ^ (((str3.charAt(0) | (str3.charAt(1) << '\b')) | (str3.charAt(2) << 16)) | (str3.charAt(3) << 24));
        Random.b.getClass();
        C(F0 ^ Random.c.j(), "guid");
        C(0, "force_inapp");
        C(!vx2.d.o() ? 1 : 0, "no_inapp");
        if (bool != null) {
            K("confirm", bool.booleanValue() ? "1" : "0");
        }
        if (bool2 != null) {
            K("stickers_bonus_enable", bool2.booleanValue() ? "1" : "0");
        }
        if (str4 != null) {
            K("track_code", str4);
        }
        if (num != null) {
            C(num.intValue(), "random_sticker_pack_attempt_id");
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return new nge0(jSONObject.getJSONObject("response"));
    }
}
