package defpackage;

import com.google.protobuf.ProtoSyntax;

/* loaded from: classes.dex */
public abstract /* synthetic */ class pe00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProtoSyntax.values().length];
        a = iArr;
        try {
            iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
