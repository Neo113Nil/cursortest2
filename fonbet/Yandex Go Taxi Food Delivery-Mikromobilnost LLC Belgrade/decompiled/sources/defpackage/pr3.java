package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class pr3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
