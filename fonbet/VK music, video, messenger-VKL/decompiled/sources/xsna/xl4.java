package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;

/* compiled from: AudioCardsTapsHandler.kt */
/* loaded from: classes16.dex */
public final class xl4 implements ud40 {
    public final w950 a;

    /* compiled from: AudioCardsTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.AUDIO_CONTENT_CARD_EXTENDED_SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr2[MusicAnalyticsInfo.ClickTarget.Subscribe.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MusicAnalyticsInfo.ClickTarget.Play.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MusicAnalyticsInfo.ClickTarget.Pause.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MusicAnalyticsInfo.ClickTarget.Menu.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MusicAnalyticsInfo.ClickTarget.Open.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public xl4(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        String str = uIBlock.b;
        String str2 = uIBlock.b;
        int i = a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
        if (i == 1 || i == 2) {
            boolean z = obj instanceof MusicAnalyticsInfo;
            w950 w950Var = this.a;
            if (!z) {
                w950Var.M(str2, null);
                w950Var.t(str2, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                return;
            }
            int i2 = a.$EnumSwitchMapping$1[((MusicAnalyticsInfo) obj).a.ordinal()];
            if (i2 == 1) {
                w950Var.a(str);
                return;
            }
            if (i2 == 2) {
                w950Var.n(str);
                return;
            }
            if (i2 == 3) {
                w950Var.o(str);
                return;
            }
            if (i2 == 4) {
                w950Var.x(str);
            } else {
                if (i2 != 5) {
                    return;
                }
                w950Var.M(str2, null);
                w950Var.t(str2, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
            }
        }
    }
}
