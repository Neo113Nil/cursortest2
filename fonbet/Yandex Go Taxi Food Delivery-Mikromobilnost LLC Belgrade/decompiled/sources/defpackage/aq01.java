package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class aq01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ItemType.values().length];
        try {
            iArr[ItemType.LAST_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ItemType.FIRST_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ItemType.MIDDLE_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ItemType.ACCOUNT_NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ItemType.BIC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ItemType.INN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ItemType.BENEFICIARY_NAME.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ItemType.PAYMENT_PURPOSE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ItemType.VAT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ItemType.MIDDLE_NAME_RADIO_BUTTON.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ItemType.DIV_WIDGET.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ItemType.PERSONAL_ACCOUNT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ItemType.PAYMENT_PERIOD.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
    }
}
