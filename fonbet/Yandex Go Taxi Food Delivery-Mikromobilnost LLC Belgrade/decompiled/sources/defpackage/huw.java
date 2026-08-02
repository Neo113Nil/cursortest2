package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import flex.core.model.Document$TransitionSettings$Option$Interpolator;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class huw {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Document$TransitionSettings$Option$Interpolator.values().length];
        try {
            iArr[Document$TransitionSettings$Option$Interpolator.Linear.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Document$TransitionSettings$Option$Interpolator.EaseIn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Document$TransitionSettings$Option$Interpolator.EaseOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Document$TransitionSettings$Option$Interpolator.EaseInOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[InterpolationType.values().length];
        try {
            iArr2[InterpolationType.Linear.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[InterpolationType.EaseIn.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[InterpolationType.EaseOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[InterpolationType.EaseInOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
