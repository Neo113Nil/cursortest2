package defpackage;

import com.yandex.payment.sdk.ui.CardInput$State;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class jrf {
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
        a = iArr;
    }
}
