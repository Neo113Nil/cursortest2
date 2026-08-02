package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: EditCommentStatusRequest.kt */
/* loaded from: classes4.dex */
public abstract class szo extends rsg0<Boolean> {
    public szo(String str, UserId userId, int i, String str2, String str3, Integer num, String str4, String str5) {
        super(str);
        C(i, "comment_id");
        F(userId, "owner_id");
        K("message", str2);
        K("attachments", str3);
        if (num != null) {
            C(num.intValue(), "parent_object_id");
        }
        if (str4 != null) {
            K("access_key", str4);
        }
        if (str5 != null) {
            K("ref", str5);
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optInt("response") == 1);
    }
}
