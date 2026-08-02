package defpackage;

import ru.rt.ebs.cryptosdk.presentation.customView.HeaderType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class dnf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HeaderType.values().length];
        try {
            iArr[HeaderType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HeaderType.BIOMETRY_CAPTURING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
