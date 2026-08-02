package defpackage;

import com.yandex.go.yb.api.domain.model.YbDepositType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ps51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YbDepositType.values().length];
        try {
            iArr[YbDepositType.EXACT_AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbDepositType.ORDER_AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
