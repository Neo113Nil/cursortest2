package defpackage;

import com.ybsdk.common.entities.ApplicationStatusEntity$Status;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c13 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ApplicationStatusEntity$Status.values().length];
        try {
            iArr[ApplicationStatusEntity$Status.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationStatusEntity$Status.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApplicationStatusEntity$Status.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApplicationStatusEntity$Status.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
