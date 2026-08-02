package defpackage;

import com.google.protobuf.JavaType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ayq {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JavaType.values().length];
        a = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
