package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ClipFeedSearchAnalyticsDelegate.kt */
/* loaded from: classes17.dex */
public final class uyc implements rih0 {
    public final SearchStatsLoggingInfo a;

    public uyc(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = searchStatsLoggingInfo;
    }

    public final dkd a(VideoFile videoFile) {
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        return new dkd(new SearchStatsLoggingInfo(null, 0, searchStatsLoggingInfo.d, 0L, videoFile.r(), searchStatsLoggingInfo.g, null, false, false, 459, null));
    }

    @Override // xsna.rih0
    public final void o2(SdkClipViewerClick sdkClipViewerClick) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        if (sdkClipViewerClick instanceof SdkClipViewerClick.b) {
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT;
        } else if (sdkClipViewerClick instanceof SdkClipViewerClick.g) {
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DISLIKE_OUT;
        } else if (sdkClipViewerClick instanceof SdkClipViewerClick.l) {
            action = ((SdkClipViewerClick.l) sdkClipViewerClick).b ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LIKE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNLIKE_OUT;
        } else if (sdkClipViewerClick instanceof SdkClipViewerClick.s) {
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
        } else if (sdkClipViewerClick instanceof SdkClipViewerClick.u) {
            action = ((SdkClipViewerClick.u) sdkClipViewerClick).b ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT;
        } else if (sdkClipViewerClick instanceof SdkClipViewerClick.c) {
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_COMMENTS_OUT;
        } else if (sdkClipViewerClick instanceof SdkClipViewerClick.d) {
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_THEMATIC_OUT;
        } else if (sdkClipViewerClick instanceof SdkClipViewerClick.r) {
            action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_ATTACHED_MUSIC_OUT;
        } else {
            if (sdkClipViewerClick instanceof SdkClipViewerClick.a) {
                String str = ((SdkClipViewerClick.a) sdkClipViewerClick).b.e;
                if (str.equals("video") || str.equals("link")) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FULL_VIDEO_OUT;
                }
            }
            action = null;
        }
        if (action == null) {
            return;
        }
        SchemeStat$TypeClick Ab = this.a.Ab(action, sdkClipViewerClick.a.r());
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, Ab, uzp0Var.a).q();
    }
}
