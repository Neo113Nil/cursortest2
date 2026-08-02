package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: VideoTrackActionButtonClick.java */
/* loaded from: classes15.dex */
public final class ilt0 extends xsg0 {
    public final /* synthetic */ int s = 0;

    public /* synthetic */ ilt0(String str) {
        super(str);
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

    public ilt0(UserId userId, Integer num) {
        super("video.trackActionButtonClick");
        F(userId, "owner_id");
        C(num.intValue(), "video_id");
    }
}
