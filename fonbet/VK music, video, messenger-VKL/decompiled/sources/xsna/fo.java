package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AccountGetCommentGroups.java */
/* loaded from: classes14.dex */
public final class fo extends rsg0 {
    public final /* synthetic */ int s = 0;

    public /* synthetic */ fo(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return new VKList(jSONObject.getJSONObject("response"), new eo());
            case 1:
                return tav0.b(jSONObject.optJSONObject("response"), Group.z0);
            default:
                return Integer.valueOf(jSONObject.getJSONObject("response").getInt("answers_limit"));
        }
    }

    public fo() {
        super("account.getCommentGroups");
        K("fields", "verified");
    }

    public fo(int i, int i2, String str, String str2) {
        super("groups.get");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        C(1, "extended");
        if (str != null && str.length() != 0) {
            K("filter", str);
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        K("fields", str2);
    }
}
