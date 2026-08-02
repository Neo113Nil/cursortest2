package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.rounding.RoundingStatusEntity;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class azk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoundingStatusEntity.values().length];
        try {
            iArr[RoundingStatusEntity.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoundingStatusEntity.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
