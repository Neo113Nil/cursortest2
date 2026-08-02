package xsna;

import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: AudienceResearchSurfaceMapper.kt */
/* loaded from: classes4.dex */
public final class sa4 {

    /* compiled from: AudienceResearchSurfaceMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsCoreNavStat$EventScreen.values().length];
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_FULL_TABS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_DIGEST_DZEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static AudienceResearchSurfaceCode a(NewsEntry newsEntry, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        if (!(newsEntry instanceof Post)) {
            return newsEntry instanceof DzenNews ? a.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()] == 4 ? AudienceResearchSurfaceCode.DZEN_NEWS : AudienceResearchSurfaceCode.OTHER : newsEntry instanceof DzenStory ? a.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()] == 5 ? AudienceResearchSurfaceCode.DZEN_STORY : AudienceResearchSurfaceCode.OTHER : newsEntry instanceof DiscoverMediaBlock ? a.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()] == 6 ? AudienceResearchSurfaceCode.MEDIADISCOVER : AudienceResearchSurfaceCode.OTHER : newsEntry instanceof Digest ? a.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()] == 4 ? AudienceResearchSurfaceCode.NEWS_POST : AudienceResearchSurfaceCode.OTHER : AudienceResearchSurfaceCode.OTHER;
        }
        int i = a.$EnumSwitchMapping$0[mobileOfficialAppsCoreNavStat$EventScreen.ordinal()];
        return (i == 1 || i == 2) ? AudienceResearchSurfaceCode.WALL_POST : i != 3 ? AudienceResearchSurfaceCode.POST : AudienceResearchSurfaceCode.DETAILED_POST;
    }
}
