package defpackage;

import com.yandex.go.payments.api.preorder.SuitabilityCheckType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class hcv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuitabilityCheckType.values().length];
        try {
            iArr[SuitabilityCheckType.BY_ZONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuitabilityCheckType.BY_TARIFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuitabilityCheckType.BY_COMPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
