package defpackage;

import ru.yandex.taxi.delivery.experiments.FormType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class aai {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FormType.values().length];
        try {
            iArr[FormType.REDUCED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FormType.SHORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FormType.MINIMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FormType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
