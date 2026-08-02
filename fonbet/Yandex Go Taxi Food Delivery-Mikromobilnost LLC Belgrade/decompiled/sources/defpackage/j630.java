package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class j630 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KeyStatusType.values().length];
        a = iArr;
        try {
            iArr[KeyStatusType.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[KeyStatusType.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[KeyStatusType.DESTROYED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
