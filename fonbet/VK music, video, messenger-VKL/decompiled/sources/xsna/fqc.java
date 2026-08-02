package xsna;

import android.text.Spannable;
import com.vk.common.links.AwayLink;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipViewerDescriptionItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: ClipDescriptionAnalyticsHelper.kt */
/* loaded from: classes4.dex */
public final class fqc {

    /* compiled from: ClipDescriptionAnalyticsHelper.kt */
    public static final class a implements saz {
        public final SchemeStat$EventItem b;

        public a(ClipVideoFile clipVideoFile) {
            this.b = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(clipVideoFile.c), Long.valueOf(clipVideoFile.b.b), null, clipVideoFile.W, null, 40, null);
        }

        @Override // xsna.saz
        public final void I(AwayLink awayLink) {
            String str;
            if (awayLink == null || (str = awayLink.b) == null) {
                return;
            }
            SchemeStat$TypeClipViewerItem.ScreenType screenType = SchemeStat$TypeClipViewerItem.ScreenType.FEED;
            SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_DESCRIPTION;
            SchemeStat$EventItem schemeStat$EventItem = this.b;
            Long c = schemeStat$EventItem.c();
            long longValue = c != null ? c.longValue() : 0L;
            Long b = schemeStat$EventItem.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipViewerDescriptionItem(longValue, b != null ? (int) b.longValue() : 0, MobileOfficialAppsClipsStat$ClipViewerDescriptionItem.ObjectType.LINK, str), null, null, null, null, null, null, null, 1069547516, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b2, uzp0Var.a).q();
        }
    }

    public static void a(NewsEntry newsEntry, ej90 ej90Var) {
        Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
        if (videos != null) {
            if (!videos.Ea()) {
                videos = null;
            }
            if (videos == null) {
                return;
            }
            VideoAttachment j = di60.j(videos);
            VideoFile videoFile = j != null ? j.k : null;
            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            if (clipVideoFile == null) {
                return;
            }
            Object obj = ej90Var != null ? ej90Var.a : null;
            Spannable spannable = obj instanceof Spannable ? (Spannable) obj : null;
            if (spannable == null) {
                return;
            }
            a aVar = new a(clipVideoFile);
            for (Object obj2 : spannable.getSpans(0, spannable.length(), qaz.class)) {
                ((qaz) obj2).j = aVar;
            }
        }
    }
}
