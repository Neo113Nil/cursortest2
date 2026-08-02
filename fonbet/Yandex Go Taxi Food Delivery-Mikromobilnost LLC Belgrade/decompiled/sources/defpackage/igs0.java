package defpackage;

import com.ybsdk.feature.card.internal.network.dto.CardProductType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class igs0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardProductType.values().length];
        try {
            iArr[CardProductType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardProductType.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardProductType.CREDIT_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardProductType.CORP_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardProductType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
