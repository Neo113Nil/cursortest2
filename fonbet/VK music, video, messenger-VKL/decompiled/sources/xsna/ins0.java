package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoOwner;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: VideoGetByIdRequestProvider.kt */
/* loaded from: classes15.dex */
public final class ins0 extends awi<VideoOwner> {
    public final UserId s;
    public final int t;

    public ins0(UserId userId, int i) {
        this.s = userId;
        this.t = i;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        List<UsersFieldsDto> list = hns0.a;
        nwt c = hns0.c(null, hns0.b(l7r0Var, this.s, this.t, null, drm0.c0(bkq0.a("action_button,is_closed,can_send_friend_request,sex,first_name,last_name,photo_base,name,friend_status,is_member,member_status,is_video_live_notifications_blocked,verified,trending,image_status,is_nft,is_nft_photo,owner_state,deactivated,members_count,followers_count,video_notifications_status,has_market_items,url,video_lives_data"), new String[]{StringUtils.COMMA}, 0, 6), null));
        return new VideoOwner(c.a, c.b, c.c);
    }
}
