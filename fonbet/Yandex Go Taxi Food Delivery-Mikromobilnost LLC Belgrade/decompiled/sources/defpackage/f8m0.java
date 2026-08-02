package defpackage;

import com.ybsdk.feature.savings.internal.entities.AccountType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class f8m0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AccountType.values().length];
        try {
            iArr[AccountType.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountType.DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccountType.INVEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
