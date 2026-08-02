package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: VideoSetActionButton.java */
/* loaded from: classes15.dex */
public final class cgt0 extends xsg0 {
    public cgt0(UserId userId, Integer num, String str) {
        super("video.setActionButton");
        F(userId, "owner_id");
        C(num.intValue(), "video_id");
        K("link", str);
    }

    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    /* renamed from: F0 */
    public final Boolean a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optInt("response", 0) == 1);
    }
}
