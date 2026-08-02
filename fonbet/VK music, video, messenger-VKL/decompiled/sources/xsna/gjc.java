package xsna;

import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: ClickToPayloadMapper.kt */
/* loaded from: classes17.dex */
public final class gjc {
    public final SchemeStat$TypeClipViewerItem.ScreenType a;
    public final q20 b;
    public final boolean c;

    /* compiled from: ClickToPayloadMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStat$TypeClipViewerItem.EventType.values().length];
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_AUTHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_ACTION_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_MARKET_ITEM_SNIPPET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_DESCRIPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_SUBSCRIPTION_BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_MUSIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gjc(SchemeStat$TypeClipViewerItem.ScreenType screenType, fjc fjcVar, q20 q20Var) {
        this.a = screenType;
        this.b = q20Var;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
        videoFeatures.getClass();
        this.c = com.vk.toggle.b.A.a(videoFeatures);
    }

    public final SchemeStat$TypeClipViewerItem a(SchemeStat$TypeClipViewerItem.EventType eventType) {
        return new SchemeStat$TypeClipViewerItem(this.a, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null);
    }
}
