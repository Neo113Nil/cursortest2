package xsna;

import com.vk.clips.design.view.floatingbutton.model.FloatingButtonAnalyticsEvent;

/* compiled from: ClipFloatingButtonSetup.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class izc {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[FloatingButtonAnalyticsEvent.values().length];
        try {
            iArr[FloatingButtonAnalyticsEvent.BUTTON_SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FloatingButtonAnalyticsEvent.BUTTON_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FloatingButtonAnalyticsEvent.BUTTON_CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FloatingButtonAnalyticsEvent.MODAL_CARD_CTA_BUTTON_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
