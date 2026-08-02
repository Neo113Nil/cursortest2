package defpackage;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class nz80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OverdraftContext.values().length];
        try {
            iArr[OverdraftContext.SUMMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OverdraftContext.MAIN_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OverdraftContext.ORDER_PAY_CASH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
