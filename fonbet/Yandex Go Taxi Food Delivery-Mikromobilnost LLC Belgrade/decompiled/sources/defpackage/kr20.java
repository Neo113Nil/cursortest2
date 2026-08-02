package defpackage;

import com.yandex.go.sdk_registry.api.SdkLifecycleStage;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class kr20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SdkLifecycleStage.values().length];
        try {
            iArr[SdkLifecycleStage.APP_CONFIGURATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SdkLifecycleStage.LCP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
