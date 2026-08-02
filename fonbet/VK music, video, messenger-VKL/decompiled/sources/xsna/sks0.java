package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoFeedDialogSearchActionTracker.kt */
/* loaded from: classes14.dex */
public final class sks0 implements s60 {
    public final SearchStatsLoggingInfo a;

    /* compiled from: VideoFeedDialogSearchActionTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoBottomSheetOptions.values().length];
            try {
                iArr[VideoBottomSheetOptions.FAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoBottomSheetOptions.UNFAVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoBottomSheetOptions.DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoBottomSheetOptions.ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoBottomSheetOptions.REMOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoBottomSheetOptions.COPY_LINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoBottomSheetOptions.SHARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoBottomSheetOptions.ADD_TO_PLAYLIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoBottomSheetOptions.GO_TO_ARTIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sks0(SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = searchStatsLoggingInfo;
    }

    @Override // xsna.s60
    public final void a(VideoFile videoFile, VideoBottomSheetOptions videoBottomSheetOptions) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        String r = videoFile.r();
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.a;
        String str = searchStatsLoggingInfo.f;
        if (epx.f(r, str)) {
            switch (a.$EnumSwitchMapping$0[videoBottomSheetOptions.ordinal()]) {
                case 1:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE_OUT;
                    break;
                case 2:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE_OUT;
                    break;
                case 3:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT;
                    break;
                case 4:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME_OUT;
                    break;
                case 5:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME_OUT;
                    break;
                case 6:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK_OUT;
                    break;
                case 7:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
                    break;
                case 8:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST_OUT;
                    break;
                case 9:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT;
                    break;
                default:
                    action = null;
                    break;
            }
            if (action == null) {
                return;
            }
            SchemeStat$TypeClick Ab = searchStatsLoggingInfo.Ab(action, str);
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, Ab, uzp0Var.a).q();
        }
    }
}
