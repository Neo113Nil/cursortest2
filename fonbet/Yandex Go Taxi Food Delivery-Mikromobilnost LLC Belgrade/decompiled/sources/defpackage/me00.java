package defpackage;

import com.yandex.go.external_service.preloader.SuperAppConfigEatsKitStaticExperiment;

/* loaded from: classes.dex */
public abstract /* synthetic */ class me00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppConfigEatsKitStaticExperiment.BundleStrategy.values().length];
        try {
            iArr[SuperAppConfigEatsKitStaticExperiment.BundleStrategy.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppConfigEatsKitStaticExperiment.BundleStrategy.PRELOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppConfigEatsKitStaticExperiment.BundleStrategy.IGNORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
