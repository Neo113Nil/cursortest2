package defpackage;

import androidx.compose.foundation.gestures.Orientation;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class kcc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
