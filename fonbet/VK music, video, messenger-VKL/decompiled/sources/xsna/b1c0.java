package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: PostCommentsPresenter.kt */
/* loaded from: classes4.dex */
public final class b1c0 {
    public static final String[] a = {"com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED", "android.net.conn.CONNECTIVITY_CHANGE"};

    public static final UserId a(NewsEntry newsEntry) {
        VideoFile videoFile;
        UserId I0;
        Photo photo;
        UserId userId;
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).m;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).n.m;
        }
        if (newsEntry instanceof Photos) {
            PhotoAttachment Mb = ((Photos) newsEntry).Mb();
            return (Mb == null || (photo = Mb.l) == null || (userId = photo.e) == null) ? UserId.d : userId;
        }
        if (!(newsEntry instanceof Videos)) {
            return UserId.d;
        }
        VideoAttachment Nb = ((Videos) newsEntry).Nb();
        return (Nb == null || (videoFile = Nb.k) == null || (I0 = videoFile.I0()) == null) ? UserId.d : I0;
    }
}
