package defpackage;

import com.yandex.go.sdk_registry.api.SdkLogLevel;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class lrt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SdkLogLevel.values().length];
        try {
            iArr[SdkLogLevel.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SdkLogLevel.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SdkLogLevel.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SdkLogLevel.CRITICAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
