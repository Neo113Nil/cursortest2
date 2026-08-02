package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Type;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class akc0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaqueModel$Type.values().length];
        try {
            iArr[PlaqueModel$Type.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaqueModel$Type.PREFETCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlaqueModel$Type.FALLBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlaqueModel$Type.CONDITIONAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
