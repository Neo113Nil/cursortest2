package defpackage;

import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class fbf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreditType.values().length];
        try {
            iArr[CreditType.CREDIT_LIMIT_DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreditType.MKK_DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CreditType.BOOST_DEPOSIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CreditType.CREDIT_DEPOSIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
