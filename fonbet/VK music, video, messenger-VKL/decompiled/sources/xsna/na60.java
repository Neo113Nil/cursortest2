package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import java.util.ArrayList;

/* compiled from: NewsEntryExt.kt */
/* loaded from: classes4.dex */
public final class na60 {
    public static final int a(NewsEntry newsEntry) {
        boolean z;
        ArrayList<EntryAttachment> arrayList;
        boolean z2 = newsEntry instanceof Photos;
        if (z2 || (((z = newsEntry instanceof Videos)) && ((arrayList = ((Videos) newsEntry).o) == null || arrayList.size() != 1))) {
            return cn70.b(10);
        }
        if (z2) {
            return cn70.b(4);
        }
        if (z) {
            ArrayList<EntryAttachment> arrayList2 = ((Videos) newsEntry).o;
            if (arrayList2 == null || arrayList2.size() != 1) {
                return cn70.b(4);
            }
            return 0;
        }
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            if (post.hc()) {
                return cn70.b(16);
            }
            Activity activity = post.C;
            if (activity == null || activity.b != 1) {
                return 0;
            }
            return cn70.b(6);
        }
        if (newsEntry instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry;
            Post post2 = promoPost.n;
            if (post2.l.zb(34359738368L)) {
                EntryAttachment entryAttachment = (EntryAttachment) j5g.k0(post2.Gb());
                Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
                if (!drm0.N(promoPost.q)) {
                    return cn70.b(2);
                }
                if (!(attachment instanceof VideoSnippetAttachment) && !(attachment instanceof PollAttachment) && !(attachment instanceof AudioPlaylistAttachment) && !(attachment instanceof PodcastAttachment)) {
                    if (!(attachment instanceof eso0)) {
                        return attachment instanceof SnippetAttachment ? cn70.b(8) : ((attachment instanceof PrettyCardAttachment) || (attachment instanceof GeoAttachment)) ? cn70.b(16) : cn70.b(8);
                    }
                    if (post2.z.size() == 1) {
                        return 0;
                    }
                    return cn70.b(8);
                }
            }
        }
        return 0;
    }

    public static final boolean b(NewsEntry newsEntry) {
        VideoAttachment Nb;
        VideoFile videoFile;
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).l.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        }
        if (!(newsEntry instanceof Videos) || (Nb = ((Videos) newsEntry).Nb()) == null || (videoFile = Nb.k) == null) {
            return false;
        }
        return epx.f(videoFile.Aa(), Boolean.TRUE);
    }

    public static final EasyPromote c(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).I;
        }
        if (newsEntry instanceof Videos) {
            return ((Videos) newsEntry).z;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EntryHeader d(NewsEntry newsEntry) {
        wsx0 wsx0Var = newsEntry instanceof wsx0 ? (wsx0) newsEntry : null;
        if (wsx0Var != null) {
            return wsx0Var.getHeader();
        }
        return null;
    }

    public static final boolean e(NewsEntry newsEntry) {
        return ((newsEntry instanceof Post) || (newsEntry instanceof Videos)) && b(newsEntry);
    }

    public static final boolean f(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).mc();
        }
        if (newsEntry instanceof Videos) {
            return ((Videos) newsEntry).Rb();
        }
        return false;
    }

    public static final boolean g(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).l.zb(1125899906842624L);
        }
        if (newsEntry instanceof Videos) {
            Videos videos = (Videos) newsEntry;
            if ((videos.y & 4) != 0 && videos.Ea() && videos.Bb() != null) {
                return true;
            }
        }
        return false;
    }

    public static final NewsEntry h(NewsEntry newsEntry) {
        if (newsEntry instanceof Photos) {
            Photos photos = (Photos) newsEntry;
            return Photos.Lb(photos, 0, null, pwu.b(photos.o), 3839);
        }
        if (!(newsEntry instanceof Videos)) {
            return newsEntry;
        }
        Videos videos = (Videos) newsEntry;
        return Videos.Mb(videos, 0L, 0, null, pwu.b(videos.m), 32703);
    }

    public static final void i(NewsEntry newsEntry, boolean z) {
        VideoAttachment Nb;
        VideoFile videoFile;
        if (newsEntry instanceof Post) {
            ((Post) newsEntry).l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, z);
        } else {
            if (!(newsEntry instanceof Videos) || (Nb = ((Videos) newsEntry).Nb()) == null || (videoFile = Nb.k) == null) {
                return;
            }
            videoFile.e4(Boolean.valueOf(z));
        }
    }
}
