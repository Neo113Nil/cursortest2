package xsna;

/* compiled from: VideoPageUiState.kt */
/* loaded from: classes5.dex */
public final class s1t0 {
    public static final boolean a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (z && !z2) {
            return true;
        }
        if (z && z2 && !z3) {
            return true;
        }
        if (!z4 && !z5) {
            return true;
        }
        if (z5) {
            return z6 || z7;
        }
        return false;
    }
}
