package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoOwner;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.Result;
import org.json.JSONObject;

/* compiled from: VideoGetByIdRequestProvider.kt */
/* loaded from: classes15.dex */
public final class kns0 extends awi<VideoOwner> {
    public final UserId s;
    public final int t;
    public final String u;
    public final boolean v;
    public final int w = 10;

    public kns0(int i, UserId userId, String str, boolean z) {
        this.s = userId;
        this.t = i;
        this.u = str;
        this.v = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.Result$Failure] */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        l7r0 l7r0Var2;
        JSONObject failure;
        Throwable a;
        List<UsersFieldsDto> list = hns0.a;
        List c0 = drm0.c0(bkq0.a("action_button,is_closed,can_send_friend_request,sex,first_name,last_name,photo_base,name,friend_status,is_member,member_status,is_video_live_notifications_blocked,verified,trending,image_status,is_nft,is_nft_photo,owner_state,deactivated,members_count,followers_count,video_notifications_status,has_market_items,url,video_lives_data"), new String[]{StringUtils.COMMA}, 0, 6);
        if (this.v) {
            try {
                hz2 z = yfb.z(tft0.C(new uft0(), this.t, this.s, null, null, null, 0, Integer.valueOf(this.w), VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST, c0, null, null, null, 15644), new gz30(26));
                ahn.D(z);
                l7r0Var2 = l7r0Var;
                try {
                    failure = (JSONObject) z.f(l7r0Var2);
                } catch (Throwable th) {
                    th = th;
                    failure = new Result.Failure(th);
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    r2 = failure instanceof Result.Failure ? null : failure;
                    nwt c = hns0.c(this.u, hns0.b(l7r0Var2, this.s, this.t, this.u, c0, r2));
                    return new VideoOwner(c.a, c.b, c.c, c.d, c.e);
                }
            } catch (Throwable th2) {
                th = th2;
                l7r0Var2 = l7r0Var;
            }
            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
            a = Result.a(failure);
            if (a != null) {
                bVar2.a(a);
            }
            r2 = failure instanceof Result.Failure ? null : failure;
        } else {
            l7r0Var2 = l7r0Var;
        }
        nwt c2 = hns0.c(this.u, hns0.b(l7r0Var2, this.s, this.t, this.u, c0, r2));
        return new VideoOwner(c2.a, c2.b, c2.c, c2.d, c2.e);
    }
}
