package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ecs {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        try {
            iArr[Lifecycle.State.DESTROYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
