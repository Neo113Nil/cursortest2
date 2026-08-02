package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: VideoGetByIdRequestProvider.kt */
/* loaded from: classes15.dex */
public final class gns0 extends awi<VideoFile> {
    public final UserId s;
    public final int t;
    public final String u;

    public gns0(UserId userId, int i, String str) {
        this.s = userId;
        this.t = i;
        this.u = str;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        List<UsersFieldsDto> list = hns0.a;
        List c0 = drm0.c0(bkq0.a("first_name,last_name,photo_base,name,friend_status,member_status,verified,trending,image_status,is_nft,is_nft_photo,owner_state,deactivated,members_count,followers_count,video_notifications_status,url"), new String[]{StringUtils.COMMA}, 0, 6);
        return hns0.c(this.u, hns0.b(l7r0Var, this.s, this.t, this.u, c0, null)).a;
    }
}
