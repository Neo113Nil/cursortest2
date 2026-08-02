package defpackage;

import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class att {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayInAppProductType.values().length];
        try {
            iArr[PlusPayInAppProductType.SUBSCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayInAppProductType.ONE_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
