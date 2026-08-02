package defpackage;

import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class i6b0 {
    public static final /* synthetic */ int[] a;

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
    }
}
