package xsna;

import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: ClipAdPixelAnalyticsUseCase.kt */
/* loaded from: classes17.dex */
public final class zlc {
    public final ki0 a;

    /* compiled from: ClipAdPixelAnalyticsUseCase.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SchemeStat$TypeClipViewerItem.EventType.values().length];
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_ACTION_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_AUTHOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zlc(ki0 ki0Var) {
        this.a = ki0Var;
    }
}
