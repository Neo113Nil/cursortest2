package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: GroupsGetMembers.kt */
/* loaded from: classes15.dex */
public final class vpu extends pug0<UserProfile> {
    public vpu(UserId userId, int i, int i2, String str, String str2, String str3) {
        super("groups.getMembers", UserProfile.g0);
        K("fields", str2);
        F(fkq0.a(userId), "group_id");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        if (str != null && str.length() != 0) {
            K("filter", str);
        }
        if (str3 == null || str3.length() == 0) {
            return;
        }
        K("ref", str3);
    }
}
