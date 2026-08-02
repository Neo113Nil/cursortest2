package defpackage;

import androidx.compose.material3.SnackbarDuration;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class q0t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SnackbarDuration.values().length];
        try {
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SnackbarDuration.Long.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SnackbarDuration.Short.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
