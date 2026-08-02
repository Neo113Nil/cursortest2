package defpackage;

import com.ybsdk.feature.persistence.api.StorageType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class b1b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StorageType.values().length];
        try {
            iArr[StorageType.AUTH_ENCRYPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
