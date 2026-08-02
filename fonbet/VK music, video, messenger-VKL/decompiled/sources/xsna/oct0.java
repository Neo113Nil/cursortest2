package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: VideoRemoveActionButton.java */
/* loaded from: classes15.dex */
public final class oct0 extends xsg0 {
    public final /* synthetic */ int s = 0;

    public oct0(String str) {
        super("notifications.hide");
        if (str != null) {
            K("query", str);
        }
    }

    @Override // xsna.xsg0
    /* renamed from: F0 */
    public Boolean a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.valueOf(jSONObject.optInt("response", 0) == 1);
            default:
                return super.a(jSONObject);
        }
    }

    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    public /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return a(jSONObject);
            default:
                return super.a(jSONObject);
        }
    }

    public oct0(String str, String str2) {
        super("newsfeed.sendPollFeedback");
        K("answer_id", str);
        K("track_code", str2);
    }

    public oct0(UserId userId, Integer num) {
        super("video.removeActionButton");
        F(userId, "owner_id");
        C(num.intValue(), "video_id");
    }
}
