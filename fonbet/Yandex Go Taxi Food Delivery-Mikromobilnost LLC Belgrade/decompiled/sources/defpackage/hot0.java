package defpackage;

import androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hot0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpecialEffectsController$Operation$LifecycleImpact.values().length];
        try {
            iArr[SpecialEffectsController$Operation$LifecycleImpact.ADDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpecialEffectsController$Operation$LifecycleImpact.REMOVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpecialEffectsController$Operation$LifecycleImpact.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
