package defpackage;

import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ahb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraType.values().length];
        try {
            iArr[CameraType.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraType.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
