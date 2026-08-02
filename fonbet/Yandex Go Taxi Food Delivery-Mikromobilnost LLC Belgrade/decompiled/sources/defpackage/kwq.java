package defpackage;

import com.yandex.payment.sdk.core.data.BankName;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class kwq {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BankName.values().length];
        try {
            iArr[BankName.AlfaBank.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BankName.SberBank.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BankName.Tinkoff.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BankName.Vtb.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BankName.GazpromBank.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BankName.OpenBank.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BankName.PromsvyazBank.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BankName.RosBank.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BankName.UnicreditBank.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[BankName.RaiffeisenBank.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
    }
}
