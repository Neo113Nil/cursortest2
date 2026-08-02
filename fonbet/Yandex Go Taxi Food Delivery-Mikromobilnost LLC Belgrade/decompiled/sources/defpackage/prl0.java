package defpackage;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class prl0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyCenterExperiment.Strategy.values().length];
        try {
            iArr[SafetyCenterExperiment.Strategy.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyCenterExperiment.Strategy.NEVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyCenterExperiment.Strategy.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyCenterExperiment.Strategy.ONLY_WITH_TRUSTED_CONTACTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
