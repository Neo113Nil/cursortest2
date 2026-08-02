package xsna;

import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchHistoryViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SearchHistoryTapsHandler.kt */
/* loaded from: classes16.dex */
public final class lvh0 implements ud40 {
    public final w950 a;

    /* compiled from: SearchHistoryTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SearchHistoryViewStyle.Style.values().length];
            try {
                iArr[SearchHistoryViewStyle.Style.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.TrackLyrics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Curator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Artist.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Podcast.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.AudioBook.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Album.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Playlist.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.RadioStation.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SearchHistoryViewStyle.Style.Video.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr2[MusicAnalyticsInfo.ClickTarget.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MusicAnalyticsInfo.ClickTarget.Pause.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public lvh0(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        String str = uIBlock.b;
        String str2 = uIBlock.b;
        CatalogViewStyle catalogViewStyle = uIBlock.l;
        SearchHistoryViewStyle searchHistoryViewStyle = catalogViewStyle instanceof SearchHistoryViewStyle ? (SearchHistoryViewStyle) catalogViewStyle : null;
        if (searchHistoryViewStyle == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[searchHistoryViewStyle.b.ordinal()];
        w950 w950Var = this.a;
        switch (i) {
            case 1:
                b(uIBlock, obj);
                return;
            case 2:
                b(uIBlock, obj);
                return;
            case 3:
            case 10:
                return;
            case 4:
                w950Var.f(str);
                return;
            case 5:
                w950Var.y(str);
                return;
            case 6:
                w950Var.v(str);
                return;
            case 7:
                w950Var.G(str2, false);
                w950Var.t(str2, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                return;
            case 8:
                w950Var.G(str2, false);
                w950Var.t(str2, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                return;
            case 9:
                b(uIBlock, obj);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void b(UIBlock uIBlock, Object obj) {
        MusicAnalyticsInfo musicAnalyticsInfo = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
        if (musicAnalyticsInfo == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$1[musicAnalyticsInfo.a.ordinal()];
        w950 w950Var = this.a;
        if (i == 1) {
            w950Var.C(uIBlock.b, true);
        } else {
            if (i != 2) {
                return;
            }
            w950Var.C(uIBlock.b, false);
        }
    }
}
