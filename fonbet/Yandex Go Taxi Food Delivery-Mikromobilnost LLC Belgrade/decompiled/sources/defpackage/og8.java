package defpackage;

import com.yandex.payment.sdk.ui.CardInput$State;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class og8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardInput$State.values().length];
        try {
            iArr[CardInput$State.CARD_NUMBER_VALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardInput$State.CARD_DETAILS_VALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardInput$State.CARD_NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardInput$State.CARD_DETAILS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
