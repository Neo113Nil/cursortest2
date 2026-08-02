package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import org.json.JSONObject;

/* compiled from: StatsTrackCustomEvents.java */
/* loaded from: classes15.dex */
public final class czk0 extends xsg0 {
    public static final String[] t = {"wall.delete", "photos.delete", "video.delete", "video.delete"};
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ czk0(String str, int i) {
        super(str);
        this.s = i;
    }

    public static czk0 H0(NewsEntry newsEntry, Boolean bool) {
        int zb = newsEntry.zb();
        if (zb == 0) {
            Post post = (Post) newsEntry;
            if (!rv60.f(post)) {
                return new czk0(post.m, post.n, 0);
            }
            return new czk0(rv60.d(post, bool.booleanValue()), rv60.c(post, bool.booleanValue()), 0);
        }
        if (zb != 1) {
            if (zb == 2) {
                VideoAttachment Nb = ((Videos) newsEntry).Nb();
                if (Nb != null) {
                    VideoFile videoFile = Nb.k;
                    return new czk0(videoFile.I0(), videoFile.o0(), 2);
                }
                return null;
            }
            if (zb != 9) {
                L.l("Unsupported news entry", newsEntry.toString());
                return null;
            }
        }
        PhotoAttachment Mb = ((Photos) newsEntry).Mb();
        if (Mb != null) {
            Photo photo = Mb.l;
            return new czk0(photo.e, photo.c, 1);
        }
        return null;
    }

    @Override // xsna.xsg0
    /* renamed from: F0 */
    public Boolean a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    public /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czk0(UserId userId, int i, int i2) {
        super(t[i2]);
        this.s = 1;
        if (i2 == 0) {
            F(userId, "owner_id");
            C(i, "post_id");
        }
        if (i2 == 1) {
            F(userId, "owner_id");
            C(i, "photo_id");
        }
        if (i2 == 2 || i2 == 6) {
            F(userId, "owner_id");
            C(i, "video_id");
        }
    }
}
