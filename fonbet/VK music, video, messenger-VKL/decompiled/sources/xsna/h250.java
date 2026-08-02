package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;

/* compiled from: MusicPlaylistsTapsHandler.kt */
/* loaded from: classes16.dex */
public final class h250 implements ud40 {
    public final w950 a;

    /* compiled from: MusicPlaylistsTapsHandler.kt */
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
                iArr2[CatalogViewType.RECOMMS_SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.LARGE_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.ARTISTS_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.CROP_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public h250(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        String str = uIBlock.b;
        CatalogViewType catalogViewType = uIBlock.d;
        int i = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
        w950 w950Var = this.a;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5 && (obj instanceof MusicAnalyticsInfo)) {
                int i2 = a.$EnumSwitchMapping$0[((MusicAnalyticsInfo) obj).a.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    w950Var.z(str);
                    return;
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    w950Var.u(str);
                    return;
                }
            }
            return;
        }
        if (obj instanceof MusicAnalyticsInfo) {
            int i3 = a.$EnumSwitchMapping$0[((MusicAnalyticsInfo) obj).a.ordinal()];
            if (i3 == 1 || i3 == 2) {
                w950Var.h(str);
                return;
            }
            if (i3 == 3) {
                w950Var.s(str);
                return;
            }
            if (i3 == 4) {
                w950Var.G(str, catalogViewType == CatalogViewType.RECOMMS_SLIDER);
                w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
            } else {
                if (i3 != 5) {
                    return;
                }
                w950Var.k(str);
            }
        }
    }
}
