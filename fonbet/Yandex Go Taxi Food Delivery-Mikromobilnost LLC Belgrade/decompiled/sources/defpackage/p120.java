package defpackage;

import com.yandex.alicekit.core.experiments.ExperimentFlag$Type;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class p120 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ExperimentFlag$Type.values().length];
        try {
            iArr[ExperimentFlag$Type.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExperimentFlag$Type.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExperimentFlag$Type.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ExperimentFlag$Type.ENUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ExperimentFlag$Type.FLOAT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
