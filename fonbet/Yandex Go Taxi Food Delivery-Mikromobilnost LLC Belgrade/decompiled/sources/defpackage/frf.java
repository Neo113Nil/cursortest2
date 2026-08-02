package defpackage;

import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.CardInputMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class frf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CardInputMode.values().length];
        try {
            iArr[CardInputMode.BindOnly.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardInputMode.PayAndBind.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[CardInput$State.values().length];
        try {
            iArr2[CardInput$State.CARD_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CardInput$State.CARD_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CardInput$State.CARD_NUMBER_VALID.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CardInput$State.CARD_DETAILS_VALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
