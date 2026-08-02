package defpackage;

import com.ybsdk.feature.card.internal.network.dto.CardProductType;
import com.ybsdk.feature.card.internal.network.dto.YbCardTypeResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ag8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[YbCardTypeResponse.values().length];
        try {
            iArr[YbCardTypeResponse.DIGITAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbCardTypeResponse.PLASTIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[CardProductType.values().length];
        try {
            iArr2[CardProductType.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CardProductType.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CardProductType.CREDIT_LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CardProductType.CORP_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CardProductType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
