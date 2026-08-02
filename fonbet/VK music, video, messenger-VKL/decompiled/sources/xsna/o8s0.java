package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import xsna.fb80;

/* compiled from: VideoCardViewsAnalyticsDelegate.kt */
/* loaded from: classes4.dex */
public final class o8s0 {
    public static void a(Object obj, String str, fb80.c cVar) {
        boolean z = str.equals("videos_for_you") || str.equals("clip");
        if ((obj instanceof Videos) && z) {
            d((Videos) obj, cVar);
            return;
        }
        if (obj instanceof Post) {
            Post post = (Post) obj;
            c(post, cVar);
            Post post2 = post.D;
            if (post2 != null) {
                c(post2, cVar);
                return;
            }
            return;
        }
        if (str.equals("discover_media_block") && (obj instanceof DiscoverMediaBlock)) {
            Iterator<T> it = ((DiscoverMediaBlock) obj).j.iterator();
            while (it.hasNext()) {
                NewsEntry newsEntry = ((DiscoverGridItem) it.next()).c;
                Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
                if (videos != null) {
                    d(videos, cVar);
                }
            }
        }
    }

    public static void b(VideoAttachment videoAttachment, fb80.c cVar) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, videoAttachment.k.r(), null, 46, null);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = cVar.i;
        CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        new bvt0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeView.a.a(schemeStat$EventItem, String.valueOf(timeUnit.toMicros(cVar.c)), String.valueOf(timeUnit.toMicros(cVar.d)), Integer.valueOf(cVar.e), commonVideoStat$TypeVideoCardEvent)).q();
    }

    public static void c(Post post, fb80.c cVar) {
        Iterator<T> it = post.z.iterator();
        while (it.hasNext()) {
            Attachment attachment = ((EntryAttachment) it.next()).b;
            VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
            if (videoAttachment != null) {
                b(videoAttachment, cVar);
            }
        }
    }

    public static void d(Videos videos, fb80.c cVar) {
        EntryAttachment entryAttachment;
        ArrayList<EntryAttachment> arrayList = videos.o;
        Serializer.StreamParcelableAdapter streamParcelableAdapter = (arrayList == null || (entryAttachment = (EntryAttachment) j5g.a0(arrayList)) == null) ? null : entryAttachment.b;
        VideoAttachment videoAttachment = streamParcelableAdapter instanceof VideoAttachment ? (VideoAttachment) streamParcelableAdapter : null;
        if (videoAttachment != null) {
            b(videoAttachment, cVar);
        }
    }
}
