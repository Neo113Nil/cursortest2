package defpackage;

import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class dfb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PhoneInputSource.values().length];
        try {
            iArr[PhoneInputSource.MANUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PhoneInputSource.COPY_PASTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PhoneInputSource.PHONEBOOK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PhoneInputSource.PREDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
