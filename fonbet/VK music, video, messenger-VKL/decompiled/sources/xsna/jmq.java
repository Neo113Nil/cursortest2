package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: FaveAddPage.kt */
/* loaded from: classes18.dex */
public final class jmq extends rsg0<Boolean> {
    public jmq(UserId userId, String str, String str2, String str3, String str4) {
        super("fave.addPage");
        F(fkq0.a(userId), fkq0.b(userId) ? "group_id" : "user_id");
        if (str != null && str.length() != 0) {
            K("ref", str);
        }
        if (str2 != null && str2.length() != 0) {
            K("track_code", str2);
        }
        if (str3 != null && str3.length() != 0) {
            K("ref_screen", str3);
        }
        if (str4 == null || str4.length() == 0) {
            return;
        }
        K("source", str4);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getInt("response") == 1);
    }
}
