package defpackage;

import flex.logger.FlexLogLevel;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m0x {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FlexLogLevel.values().length];
        try {
            iArr[FlexLogLevel.FAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlexLogLevel.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
