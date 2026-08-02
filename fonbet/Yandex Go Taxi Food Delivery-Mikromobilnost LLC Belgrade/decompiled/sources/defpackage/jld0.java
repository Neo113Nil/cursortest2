package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class jld0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
