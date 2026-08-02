package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.t0a;

/* compiled from: VideoBottomSheetActionTracker.kt */
/* loaded from: classes6.dex */
public final class j6s0 implements s60 {
    public final String a;
    public final s0a b;

    /* compiled from: VideoBottomSheetActionTracker.kt */
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
                iArr[VideoBottomSheetOptions.REMOVE_FROM_VIEW_HISTORY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoBottomSheetOptions.ADD_TO_PLAYLIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoBottomSheetOptions.NOT_INTERESTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j6s0(String str, s0a s0aVar) {
        this.a = str;
        this.b = s0aVar;
    }

    @Override // xsna.s60
    public final void a(VideoFile videoFile, VideoBottomSheetOptions videoBottomSheetOptions) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        switch (a.$EnumSwitchMapping$0[videoBottomSheetOptions.ordinal()]) {
            case 1:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.FAVE;
                break;
            case 2:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNFAVE;
                break;
            case 3:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD;
                break;
            case 4:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_ME;
                break;
            case 5:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_FROM_ME;
                break;
            case 6:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK;
                break;
            case 7:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE;
                break;
            case 8:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_RECENT;
                break;
            case 9:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_TO_PLAYLIST;
                break;
            case 10:
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.NOT_INTERESTED;
                break;
            default:
                action = null;
                break;
        }
        if (action == null) {
            return;
        }
        this.b.a(new t0a.a(this.a, null, null, new t0a.a.d(action, SchemeStat$EventItem.Type.VIDEO), 6));
    }
}
