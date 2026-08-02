package defpackage;

import com.ybsdk.feature.nfc.api.models.NfcProductType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o860 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NfcProductType.values().length];
        try {
            iArr[NfcProductType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NfcProductType.CREDIT_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NfcProductType.CORP_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NfcProductType.PRO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NfcProductType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
