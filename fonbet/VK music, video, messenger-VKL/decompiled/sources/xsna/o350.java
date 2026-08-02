package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;

/* compiled from: MusicRecommendedPlaylistTapsHandler.kt */
/* loaded from: classes16.dex */
public final class o350 implements ud40 {
    public final w950 a;

    /* compiled from: MusicRecommendedPlaylistTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MusicAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.PlayAll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Pause.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Open.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Menu.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.LARGE_SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public o350(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        String str = uIBlock.b;
        int i = a.$EnumSwitchMapping$1[uIBlock.d.ordinal()];
        if (i == 1 || i == 2) {
            boolean z = obj instanceof MusicTrack;
            w950 w950Var = this.a;
            if (z) {
                w950Var.e(str);
                return;
            }
            if (obj instanceof MusicAnalyticsInfo) {
                int i2 = a.$EnumSwitchMapping$0[((MusicAnalyticsInfo) obj).a.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    w950Var.H(str);
                    return;
                }
                if (i2 == 3) {
                    w950Var.L(str);
                    return;
                }
                if (i2 == 4) {
                    w950Var.G(str, false);
                    w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                } else {
                    if (i2 != 5) {
                        return;
                    }
                    w950Var.k(str);
                }
            }
        }
    }
}
