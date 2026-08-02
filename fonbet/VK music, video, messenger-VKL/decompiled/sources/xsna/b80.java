package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import java.util.Iterator;

/* compiled from: ActionsTapsHandler.kt */
/* loaded from: classes16.dex */
public final class b80 implements ud40 {
    public final w950 a;

    /* compiled from: ActionsTapsHandler.kt */
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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_ARTIST_MIX_BLURRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.SUBSECTION_TABS.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b80(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        Object obj2;
        String str = uIBlock.b;
        int i = a.$EnumSwitchMapping$1[uIBlock.d.ordinal()];
        w950 w950Var = this.a;
        switch (i) {
            case 1:
                UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlock instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlock : null;
                String str2 = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.D : null;
                if (str2 == null || str2.length() == 0) {
                    w950Var.M(str, null);
                } else {
                    Iterator<E> it = CommonAudioStat$TypeAudioUiClickItem.EventType.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (cqm0.m(((CommonAudioStat$TypeAudioUiClickItem.EventType) obj2).name()).equals(str2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    CommonAudioStat$TypeAudioUiClickItem.EventType eventType = (CommonAudioStat$TypeAudioUiClickItem.EventType) obj2;
                    if (eventType != null) {
                        w950Var.M(str, eventType);
                    } else {
                        w950Var.M(str, null);
                    }
                }
                w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                break;
            case 2:
                w950Var.K(str);
                w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                break;
            case 3:
            case 4:
                MusicAnalyticsInfo musicAnalyticsInfo = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
                MusicAnalyticsInfo.ClickTarget clickTarget = musicAnalyticsInfo != null ? musicAnalyticsInfo.a : null;
                int i2 = clickTarget == null ? -1 : a.$EnumSwitchMapping$0[clickTarget.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        w950Var.s(str);
                        break;
                    }
                } else {
                    w950Var.h(str);
                    break;
                }
                break;
            case 5:
                String str3 = obj instanceof String ? (String) obj : null;
                if (str3 != null) {
                    w950Var.B(str3);
                    break;
                }
                break;
            case 6:
                w950Var.F(str);
                break;
        }
    }
}
