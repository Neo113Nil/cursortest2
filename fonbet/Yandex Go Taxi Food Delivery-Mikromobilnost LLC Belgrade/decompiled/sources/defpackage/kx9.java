package defpackage;

import com.yandex.go.dto.response.Action$ChargersDiscounts;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class kx9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action$ChargersDiscounts.ChargersDiscountType.values().length];
        try {
            iArr[Action$ChargersDiscounts.ChargersDiscountType.PROMOCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action$ChargersDiscounts.ChargersDiscountType.DISCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Action$ChargersDiscounts.ChargersDiscountType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
