package defpackage;

import com.ybsdk.feature.card.internal.entities.GetApplicationStatusEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class pm8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GetApplicationStatusEntity$Status.values().length];
        try {
            iArr[GetApplicationStatusEntity$Status.PROCESSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GetApplicationStatusEntity$Status.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GetApplicationStatusEntity$Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
