package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TabEvent;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: CommunityProfileContentAnalyticsDelegate.kt */
/* loaded from: classes5.dex */
public final class hfh {
    public static CommonCommunitiesStat$TypeTabContentType a(CommunityProfileContentItem communityProfileContentItem, boolean z) {
        if (communityProfileContentItem instanceof fq3) {
            return CommonCommunitiesStat$TypeTabContentType.ARTICLES;
        }
        if (communityProfileContentItem instanceof j15) {
            return z ? CommonCommunitiesStat$TypeTabContentType.AUDIOS_PLAYLISTS : CommonCommunitiesStat$TypeTabContentType.AUDIOS;
        }
        if (communityProfileContentItem instanceof pzb) {
            return CommonCommunitiesStat$TypeTabContentType.CHATS;
        }
        if (communityProfileContentItem instanceof Clips) {
            return z ? CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS_PLAYLISTS : CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS;
        }
        if (communityProfileContentItem instanceof tan) {
            return CommonCommunitiesStat$TypeTabContentType.DISCUSSIONS;
        }
        if (communityProfileContentItem instanceof sun) {
            return CommonCommunitiesStat$TypeTabContentType.FILES;
        }
        if (communityProfileContentItem instanceof p5o) {
            return CommonCommunitiesStat$TypeTabContentType.DONUT_WALL;
        }
        if (communityProfileContentItem instanceof uu50) {
            return CommonCommunitiesStat$TypeTabContentType.NARRATIVES;
        }
        if (communityProfileContentItem instanceof iea0) {
            return z ? CommonCommunitiesStat$TypeTabContentType.PHOTOS_ALBUMS : CommonCommunitiesStat$TypeTabContentType.PHOTOS;
        }
        if (communityProfileContentItem instanceof xkb0) {
            return CommonCommunitiesStat$TypeTabContentType.PODCASTS;
        }
        if (communityProfileContentItem instanceof sst0) {
            return z ? CommonCommunitiesStat$TypeTabContentType.VIDEOS_PLAYLISTS : CommonCommunitiesStat$TypeTabContentType.VIDEOS;
        }
        if (communityProfileContentItem instanceof b9x0) {
            return CommonCommunitiesStat$TypeTabContentType.WALL;
        }
        if (communityProfileContentItem instanceof lg00) {
            return CommonCommunitiesStat$TypeTabContentType.MAIN;
        }
        if (communityProfileContentItem instanceof p8u) {
            return z ? CommonCommunitiesStat$TypeTabContentType.MARKET_ALBUMS : CommonCommunitiesStat$TypeTabContentType.MARKET;
        }
        if (communityProfileContentItem instanceof Services) {
            return z ? CommonCommunitiesStat$TypeTabContentType.SERVICES_ALBUMS : CommonCommunitiesStat$TypeTabContentType.SERVICES;
        }
        if (communityProfileContentItem instanceof y0q) {
            return CommonCommunitiesStat$TypeTabContentType.EVENTS;
        }
        throw new IllegalStateException("Unsupported contentItem = " + communityProfileContentItem);
    }

    public static void b(CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType, MobileOfficialAppsGroupsStat$TabEvent.TabEventType tabEventType, UserId userId) {
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_PAGE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId.b, null, new MobileOfficialAppsGroupsStat$TabEvent(tabEventType, commonCommunitiesStat$TypeTabContentType, 0), null, 46), 2)).q();
    }
}
