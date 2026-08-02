package defpackage;

import com.yandex.go.chargers.passes.domain.ChargersPassType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class mga {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersPassType.values().length];
        try {
            iArr[ChargersPassType.SUBSCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersPassType.RENTAL_PACKAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
