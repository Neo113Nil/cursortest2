package xsna;

import androidx.compose.ui.window.SecureFlagPolicy;

/* compiled from: ModalBottomSheet.android.kt */
/* loaded from: classes11.dex */
public final class yx20 {
    public final SecureFlagPolicy a = SecureFlagPolicy.Inherit;
    public final boolean b = true;
    public final boolean c = true;

    public yx20() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx20)) {
            return false;
        }
        yx20 yx20Var = (yx20) obj;
        return this.a == yx20Var.a && this.c == yx20Var.c && this.b == yx20Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 29791, this.b);
    }

    public yx20(int i) {
    }
}
