package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.stats.NewsEntryEventItem;
import com.vk.newsfeed.api.stats.NewsEntryEventItemType;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: NewsEntryEventItemMapper.kt */
/* loaded from: classes4.dex */
public final class ma60 {
    public static NewsEntryEventItem a(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            return new NewsEntryEventItem(NewsEntryEventItemType.POST, Long.valueOf(post.n), post.m, post.L.b);
        }
        if (newsEntry instanceof Photos) {
            Photos photos = (Photos) newsEntry;
            Attachment R1 = photos.R1();
            if (!(R1 instanceof PhotoAttachment)) {
                return null;
            }
            return new NewsEntryEventItem(NewsEntryEventItemType.PHOTO, Long.valueOf(r0.f), ((PhotoAttachment) R1).g, photos.w.b);
        }
        if (newsEntry instanceof Videos) {
            Videos videos = (Videos) newsEntry;
            Attachment R12 = videos.R1();
            if (!(R12 instanceof VideoAttachment)) {
                return null;
            }
            VideoAttachment videoAttachment = (VideoAttachment) R12;
            return new NewsEntryEventItem(videoAttachment.C2() ? NewsEntryEventItemType.CLIP : NewsEntryEventItemType.VIDEO, Long.valueOf(videoAttachment.k.o0()), videoAttachment.k.I0(), videos.v.b);
        }
        if (newsEntry instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry;
            return new NewsEntryEventItem(NewsEntryEventItemType.POST, Long.valueOf(r0.n), promoPost.n.m, promoPost.u.b);
        }
        if (!(newsEntry instanceof FaveEntry)) {
            return null;
        }
        gmq gmqVar = ((FaveEntry) newsEntry).i.f;
        if (!(gmqVar instanceof Post)) {
            return null;
        }
        Post post2 = (Post) gmqVar;
        return new NewsEntryEventItem(NewsEntryEventItemType.POST, Long.valueOf(post2.n), post2.m, post2.L.b);
    }
}
