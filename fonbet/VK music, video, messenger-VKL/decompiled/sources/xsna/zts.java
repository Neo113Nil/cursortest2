package xsna;

import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ems;

/* compiled from: FriendsUtils.kt */
/* loaded from: classes16.dex */
public final class zts {
    public static final Integer a(OnlineInfo onlineInfo) {
        if (onlineInfo.Ab()) {
            return null;
        }
        VisibleStatus zb = onlineInfo.zb();
        return (zb != null ? zb.e : null) == Platform.WEB ? Integer.valueOf(R.drawable.ic_online_web_composite_16) : Integer.valueOf(R.drawable.ic_online_mobile_vkapp_composite_16);
    }

    public static kym0 b(ems emsVar) {
        if (emsVar instanceof ems.a) {
            return new kym0(SubscribeStatus.FRIEND_STATUS_FRIENDS, ((ems.a) emsVar).a.A.c, null, null, 12);
        }
        if (emsVar instanceof ems.e) {
            return new kym0(SubscribeStatus.FRIEND_STATUS_FOLLOWNG, ((ems.e) emsVar).a.A.c, null, null, 12);
        }
        if (emsVar instanceof ems.b) {
            return new kym0(SubscribeStatus.FRIEND_STATUS_NOT_FRIENDS, ((ems.b) emsVar).a.A.c, null, null, 12);
        }
        if (emsVar instanceof ems.d) {
            return new kym0(SubscribeStatus.FRIEND_STATUS_INCOME_FRIENDSHIP_REQUEST, ((ems.d) emsVar).a.A.c, null, null, 12);
        }
        if (!(emsVar instanceof ems.c)) {
            throw new NoWhenBranchMatchedException();
        }
        SubscribeStatus.a aVar = SubscribeStatus.Companion;
        throw null;
    }
}
