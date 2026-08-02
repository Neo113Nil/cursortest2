package defpackage;

import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* loaded from: classes.dex */
public abstract /* synthetic */ class got0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpecialEffectsController$Operation$State.values().length];
        try {
            iArr[SpecialEffectsController$Operation$State.REMOVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpecialEffectsController$Operation$State.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpecialEffectsController$Operation$State.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SpecialEffectsController$Operation$State.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
