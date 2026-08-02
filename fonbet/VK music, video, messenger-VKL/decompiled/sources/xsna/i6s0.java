package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAnalyticsInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;

/* compiled from: VideoBottomSheetActionTracker.kt */
/* loaded from: classes16.dex */
public final class i6s0 implements s60 {
    public final b5a a;
    public final UIBlock b;

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

    public i6s0(b5a b5aVar, UIBlock uIBlock) {
        this.a = b5aVar;
        this.b = uIBlock;
    }

    @Override // xsna.s60
    public final void a(VideoFile videoFile, VideoBottomSheetOptions videoBottomSheetOptions) {
        VideoAnalyticsInfo.ClickTarget clickTarget;
        switch (a.$EnumSwitchMapping$0[videoBottomSheetOptions.ordinal()]) {
            case 1:
                clickTarget = VideoAnalyticsInfo.ClickTarget.Fave;
                break;
            case 2:
                clickTarget = VideoAnalyticsInfo.ClickTarget.Unfave;
                break;
            case 3:
                clickTarget = VideoAnalyticsInfo.ClickTarget.Download;
                break;
            case 4:
                clickTarget = VideoAnalyticsInfo.ClickTarget.AddToMe;
                break;
            case 5:
                clickTarget = VideoAnalyticsInfo.ClickTarget.RemoveFromMe;
                break;
            case 6:
                clickTarget = VideoAnalyticsInfo.ClickTarget.CopyLink;
                break;
            case 7:
                clickTarget = VideoAnalyticsInfo.ClickTarget.Share;
                break;
            case 8:
                clickTarget = VideoAnalyticsInfo.ClickTarget.RemoveSeen;
                break;
            case 9:
                clickTarget = VideoAnalyticsInfo.ClickTarget.AddToPlaylist;
                break;
            case 10:
                clickTarget = VideoAnalyticsInfo.ClickTarget.NotInterested;
                break;
            default:
                clickTarget = null;
                break;
        }
        if (clickTarget == null) {
            return;
        }
        this.a.a(new cfp0(this.b, new VideoAnalyticsInfo(clickTarget)));
    }
}
