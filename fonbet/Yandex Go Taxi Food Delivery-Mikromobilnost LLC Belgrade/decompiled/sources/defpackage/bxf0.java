package defpackage;

import com.yandex.plus.home.plaque.feature.api.anim.PlaqueAnimator$PlaqueType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class bxf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaqueAnimator$PlaqueType.values().length];
        try {
            iArr[PlaqueAnimator$PlaqueType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaqueAnimator$PlaqueType.CONDITIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
