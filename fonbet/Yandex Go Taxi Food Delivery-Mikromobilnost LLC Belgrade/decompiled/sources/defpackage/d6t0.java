package defpackage;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class d6t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryExpandReason.values().length];
        try {
            iArr[SummaryExpandReason.OPTIONS_TAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryExpandReason.PULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SummaryExpandReason.HANDLER_TAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SummaryExpandReason.SELECTOR_TAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_REQUIREMENT_DEEPLINK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_REDIRECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_UNAVAILABLE_TARIFF_ON_ORDER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_GLUED_REQUIREMENT_ON_ORDER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_MULTICLASS_ON_ORDER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_SHUTTLE_ON_ORDER.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_ROUTE_DEEPLINK.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_SUMMARY_ORDER_BUTTON_EXPERIMENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_REMOVE_ALT_CHOICE_BUBBLE_CLICK.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_DELIVERY_REDIRECT_ACTION.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[SummaryExpandReason.AUTO_SHORTCUT_REDIRECT_ACTION.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        a = iArr;
    }
}
