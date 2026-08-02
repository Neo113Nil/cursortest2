package defpackage;

import com.ybsdk.api.DepositType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class lxz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DepositType.values().length];
        try {
            iArr[DepositType.ExactAmount.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DepositType.OrderAmount.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
