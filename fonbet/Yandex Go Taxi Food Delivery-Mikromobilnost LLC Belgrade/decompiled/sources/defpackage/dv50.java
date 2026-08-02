package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.CardNetwork;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class dv50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardNetwork.values().length];
        try {
            iArr[CardNetwork.AMEX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardNetwork.DISCOVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardNetwork.JCB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardNetwork.MASTERCARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardNetwork.VISA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardNetwork.MIR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CardNetwork.UNIONPAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CardNetwork.UZCARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CardNetwork.MAESTRO.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CardNetwork.VISAELECTRON.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[CardNetwork.HUMOCARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[CardNetwork.UNKNOWN.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
