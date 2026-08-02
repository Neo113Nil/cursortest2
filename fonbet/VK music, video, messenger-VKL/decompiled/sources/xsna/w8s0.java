package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoCatalogAlbumBottomSheetActionTracker.kt */
/* loaded from: classes16.dex */
public final class w8s0 {
    public final b5a a;
    public final UIBlock b;

    /* compiled from: VideoCatalogAlbumBottomSheetActionTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoCatalogAlbumBottomSheetRedesign.Action.values().length];
            try {
                iArr[VideoCatalogAlbumBottomSheetRedesign.Action.Subscribe.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoCatalogAlbumBottomSheetRedesign.Action.Unsubscribe.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoCatalogAlbumBottomSheetRedesign.Action.PlayAll.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoCatalogAlbumBottomSheetRedesign.Action.CopyLink.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoCatalogAlbumBottomSheetRedesign.Action.Share.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoCatalogAlbumBottomSheetRedesign.Action.GoToOwner.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoCatalogAlbumBottomSheet.Action.values().length];
            try {
                iArr2[VideoCatalogAlbumBottomSheet.Action.Subscribe.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoCatalogAlbumBottomSheet.Action.Unsubscribe.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoCatalogAlbumBottomSheet.Action.PlayAll.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VideoCatalogAlbumBottomSheet.Action.CopyLink.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VideoCatalogAlbumBottomSheet.Action.Share.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VideoCatalogAlbumBottomSheet.Action.GoToOwner.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public w8s0(b5a b5aVar, UIBlock uIBlock) {
        this.a = b5aVar;
        this.b = uIBlock;
    }

    public final void a(VideoCatalogAlbumBottomSheet.Action action) {
        VideoAlbumAnalyticsInfo.ClickTarget clickTarget;
        switch (a.$EnumSwitchMapping$1[action.ordinal()]) {
            case 1:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.Subscribe;
                break;
            case 2:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.Unsubscribe;
                break;
            case 3:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.PlayAll;
                break;
            case 4:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.CopyLink;
                break;
            case 5:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.Share;
                break;
            case 6:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.ShowAuthor;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.a.a(new cfp0(this.b, new VideoAlbumAnalyticsInfo(clickTarget, null)));
    }

    public final void b(VideoCatalogAlbumBottomSheetRedesign.Action action) {
        VideoAlbumAnalyticsInfo.ClickTarget clickTarget;
        switch (a.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.Subscribe;
                break;
            case 2:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.Unsubscribe;
                break;
            case 3:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.PlayAll;
                break;
            case 4:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.CopyLink;
                break;
            case 5:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.Share;
                break;
            case 6:
                clickTarget = VideoAlbumAnalyticsInfo.ClickTarget.ShowAuthor;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.a.a(new cfp0(this.b, new VideoAlbumAnalyticsInfo(clickTarget, null)));
    }
}
