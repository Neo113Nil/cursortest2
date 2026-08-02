package defpackage;

import com.yandex.go.address.models.add.BackNavigationStrategy;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class oe0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BackNavigationStrategy.values().length];
        try {
            iArr[BackNavigationStrategy.ORDER_DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BackNavigationStrategy.SUGGESTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BackNavigationStrategy.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
