package defpackage;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* loaded from: classes.dex */
public abstract /* synthetic */ class jvf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Protobuf$IntEncoding.values().length];
        a = iArr;
        try {
            iArr[Protobuf$IntEncoding.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Protobuf$IntEncoding.SIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Protobuf$IntEncoding.FIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
