package defpackage;

import com.yandex.plus.pay.inapp.api.PlusPayInAppReplacementParams$Strategy;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d0g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayInAppReplacementParams$Strategy.values().length];
        try {
            iArr[PlusPayInAppReplacementParams$Strategy.CHARGE_FULL_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayInAppReplacementParams$Strategy.DEFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
