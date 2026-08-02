package defpackage;

import com.yandex.go.settings.experiments.SuperAppConfigAppSettingsExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class fdr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppConfigAppSettingsExperiment.Type.values().length];
        try {
            iArr[SuperAppConfigAppSettingsExperiment.Type.V1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppConfigAppSettingsExperiment.Type.V2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
