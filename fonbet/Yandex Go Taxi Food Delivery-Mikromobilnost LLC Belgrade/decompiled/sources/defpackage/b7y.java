package defpackage;

import androidx.compose.foundation.gestures.Orientation;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b7y {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.Horizontal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.Vertical.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
