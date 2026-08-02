package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SyntheticSectionTapsHandler.kt */
/* loaded from: classes16.dex */
public final class ipn0 implements ud40 {
    public final w950 a;
    public final Set<String> b = rl3.y0(new String[]{"synthetic_offline_tracks", "synthetic_offline_music_playlist_all", "synthetic_offline_music_album_all", "synthetic_offline_music_podcast_all", "synthetic_offline_music_audiobook_all"});

    /* compiled from: SyntheticSectionTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ipn0(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        ArrayList<UIBlock> arrayList;
        String str = uIBlock.b;
        if (a.$EnumSwitchMapping$0[uIBlock.d.ordinal()] == 1) {
            UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
            w950 w950Var = this.a;
            if (uIBlockList != null && (arrayList = uIBlockList.y) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!(((UIBlock) it.next()) instanceof UIBlockAudioContentCard.PodcastCard)) {
                            break;
                        }
                    }
                }
                MusicAnalyticsInfo musicAnalyticsInfo = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
                if ((musicAnalyticsInfo != null ? musicAnalyticsInfo.a : null) == MusicAnalyticsInfo.ClickTarget.Broadcast) {
                    w950Var.b(str);
                    w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                    return;
                }
            }
            if (obj instanceof kzt0) {
                kzt0 kzt0Var = (kzt0) obj;
                UIBlock uIBlock2 = kzt0Var.a;
                String str2 = kzt0Var.b.b;
                String str3 = uIBlock2.b;
                Set<String> set = this.b;
                if (!set.contains(str3) && !set.contains(str2)) {
                    w950Var.g(str3, str2, kzt0Var.c);
                } else if (set.contains(str2)) {
                    w950Var.M(str3, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_DOWNLOADED_TRACKS_TAB);
                } else {
                    w950Var.M(str2, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO_ALL_TRACKS_TAB);
                }
            }
        }
    }
}
