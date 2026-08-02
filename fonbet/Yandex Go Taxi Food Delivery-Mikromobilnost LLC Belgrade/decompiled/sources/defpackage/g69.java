package defpackage;

import com.ybsdk.feature.savings.internal.network.dto.DivSavingsAccountResponse;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g69 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivSavingsAccountResponse.Type.values().length];
        try {
            iArr[DivSavingsAccountResponse.Type.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivSavingsAccountResponse.Type.DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivSavingsAccountResponse.Type.INVESTMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DivSavingsAccountResponse.Type.OPENING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DivSavingsAccountResponse.Type.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DivSavingsAccountResponse.Type.BANNER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DivSavingsAccountResponse.Type.SUGGEST_TO_CREATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
