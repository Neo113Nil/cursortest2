package defpackage;

import ru.yandex.taxi.tariffs.analytics.TariffSelectionReporter$ChangeReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class inx0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SelectionOrigin.values().length];
        try {
            iArr[SelectionOrigin.PREORDER_CONTROLLER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectionOrigin.INVALIDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectionOrigin.FORCE_TARIFF_SWITCH_FOR_INTERCITY_ORDERS_EXPERIMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SelectionOrigin.PERSONALSTATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SelectionOrigin.SHORTCUT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SelectionOrigin.TRAP_ONLY_FALLBACK.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SelectionOrigin.ACTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SelectionOrigin.DEEPLINK.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SelectionOrigin.REDIRECT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[SelectionOrigin.DELIVERY_CANCEL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[SelectionOrigin.UNSUPPORTED_REQUIREMENTS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[SelectionOrigin.USER.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[SelectionOrigin.DUE_TIMETABLE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[SelectionOrigin.MAIN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[SelectionOrigin.PROMOTION.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        a = iArr;
        int[] iArr2 = new int[TariffSelectionReporter$ChangeReason.values().length];
        try {
            iArr2[TariffSelectionReporter$ChangeReason.NOT_AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[TariffSelectionReporter$ChangeReason.NOT_FOUND_IN_SELECTED_VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[TariffSelectionReporter$ChangeReason.SELECTED_VERTICAL_NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[TariffSelectionReporter$ChangeReason.PREVIOUSLY_CHANGED_BY_USER.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[TariffSelectionReporter$ChangeReason.NOT_CAN_BE_DEFAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        b = iArr2;
    }
}
