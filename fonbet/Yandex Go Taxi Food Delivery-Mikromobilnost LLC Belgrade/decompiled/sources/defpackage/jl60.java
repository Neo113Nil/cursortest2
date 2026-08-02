package defpackage;

import com.yandex.xplat.payment.sdk.NspkMembersSource;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class jl60 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NspkMembersSource.values().length];
        try {
            iArr[NspkMembersSource.qr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NspkMembersSource.sub.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
