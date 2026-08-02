package defpackage;

import com.ybsdk.rconfig.configs.SslTrustMode;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ex50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SslTrustMode.values().length];
        try {
            iArr[SslTrustMode.SYSTEM_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SslTrustMode.SYSTEM_AND_YANDEX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
