package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CatalogMusicBottomSheetActionTracker.kt */
/* loaded from: classes16.dex */
public final class p9a implements MusicBottomSheetActionTracker {
    public final b5a a;
    public final UIBlock b;
    public final SearchStatsLoggingInfo c;

    /* compiled from: CatalogMusicBottomSheetActionTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicBottomSheetActionTracker.Action.values().length];
            try {
                iArr[MusicBottomSheetActionTracker.Action.ListenNext.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.AddToMyMusic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.RemoveFromMyMusic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.GoToArtists.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.Download.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.Share.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.CopyLink.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.OpenAlbum.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.ShowSimilar.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.AddToPlaylist.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.SetSleepTimer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.Broadcast.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.Fave.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.Unfave.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MusicBottomSheetActionTracker.Action.AddToStory.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p9a(b5a b5aVar, UIBlock uIBlock, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        this.a = b5aVar;
        this.b = uIBlock;
        this.c = searchStatsLoggingInfo;
    }

    @Override // com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker
    public final SearchStatsLoggingInfo a() {
        return this.c;
    }

    @Override // com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker
    public final void b(MusicBottomSheetActionTracker.Action action) {
        MusicAnalyticsInfo.ClickTarget clickTarget;
        switch (a.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                clickTarget = MusicAnalyticsInfo.ClickTarget.ListenNext;
                break;
            case 2:
                clickTarget = MusicAnalyticsInfo.ClickTarget.AddToMe;
                break;
            case 3:
                clickTarget = MusicAnalyticsInfo.ClickTarget.RemoveFromMe;
                break;
            case 4:
                clickTarget = MusicAnalyticsInfo.ClickTarget.OpenMusician;
                break;
            case 5:
                clickTarget = MusicAnalyticsInfo.ClickTarget.Download;
                break;
            case 6:
                clickTarget = MusicAnalyticsInfo.ClickTarget.Share;
                break;
            case 7:
                clickTarget = MusicAnalyticsInfo.ClickTarget.CopyLink;
                break;
            case 8:
                clickTarget = MusicAnalyticsInfo.ClickTarget.OpenAlbum;
                break;
            case 9:
                clickTarget = MusicAnalyticsInfo.ClickTarget.ShowSimilar;
                break;
            case 10:
                clickTarget = MusicAnalyticsInfo.ClickTarget.AddToPlaylist;
                break;
            case 11:
                clickTarget = MusicAnalyticsInfo.ClickTarget.SetSleepTimer;
                break;
            case 12:
                clickTarget = MusicAnalyticsInfo.ClickTarget.Broadcast;
                break;
            case 13:
                clickTarget = MusicAnalyticsInfo.ClickTarget.Fave;
                break;
            case 14:
                clickTarget = MusicAnalyticsInfo.ClickTarget.Unfave;
                break;
            case 15:
                clickTarget = MusicAnalyticsInfo.ClickTarget.AddToStory;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.a.a(new cfp0(this.b, new MusicAnalyticsInfo(clickTarget)));
    }
}
