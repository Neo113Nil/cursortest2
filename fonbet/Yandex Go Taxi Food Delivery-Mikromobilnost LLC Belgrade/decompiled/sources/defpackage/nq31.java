package defpackage;

import com.yandex.plus.pay.ui.core.mobile.haptic.HapticType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class nq31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HapticType.values().length];
        try {
            iArr[HapticType.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HapticType.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HapticType.CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
