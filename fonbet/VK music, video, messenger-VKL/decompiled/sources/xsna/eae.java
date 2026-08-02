package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.VideoStatistic;
import java.util.List;

/* compiled from: ClipsGetComment.kt */
/* loaded from: classes4.dex */
public final class eae {
    public static final List<String> b = e43.l("first_name_dat", "last_name_dat", "verified", "trending", "emoji_status", "image_status", "video_files", "members_count", "followers_count", "photo_base");
    public final fae a;

    public eae(fae faeVar) {
        this.a = faeVar;
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, UserId userId, VideoStatistic videoStatistic) {
        UserId userId2;
        tfx tfxVar = new tfx("video.getComment", new lft0(), new s3j0(7));
        tfx.l(tfxVar, "comment_id", i, 1, 0, 8);
        if (userId != null) {
            userId2 = userId;
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        } else {
            userId2 = userId;
        }
        tfxVar.j("extended", true);
        List<String> list = b;
        if (list != null) {
            tfxVar.i("fields", list);
        }
        tfxVar.f(2, 0, 10, "thread_items_count");
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.w0(x).l(new lh3(new o15(this, userId2, videoStatistic, 2), 7));
    }
}
