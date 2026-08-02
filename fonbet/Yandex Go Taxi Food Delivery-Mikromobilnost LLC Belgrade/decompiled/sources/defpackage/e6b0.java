package defpackage;

import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class e6b0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SavePersonalStateNotifier$SavePersonalStateReason.values().length];
        try {
            iArr[SavePersonalStateNotifier$SavePersonalStateReason.MULTICLASS_CLASSES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavePersonalStateNotifier$SavePersonalStateReason.SELECTED_TARIFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavePersonalStateNotifier$SavePersonalStateReason.COMMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SavePersonalStateNotifier$SavePersonalStateReason.REQUIREMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SavePersonalStateNotifier$SavePersonalStateReason.ORDER_COMPOSITE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SavePersonalStateNotifier$SavePersonalStateReason.PAYMENT_METHOD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SavePersonalStateNotifier$SavePersonalStateReason.SUMMARY_BUTTON_EXPAND_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[SelectionOrigin.values().length];
        try {
            iArr2[SelectionOrigin.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SelectionOrigin.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SelectionOrigin.DUE_TIMETABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SelectionOrigin.REDIRECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[SelectionOrigin.ACTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[SelectionOrigin.DEEPLINK.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[SelectionOrigin.DELIVERY_CANCEL.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[SelectionOrigin.PROMOTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}
