package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes10.dex */
public final class mx20 {
    public final SecureFlagPolicy a = SecureFlagPolicy.Inherit;
    public final boolean b = true;
    public final boolean c = true;

    public mx20() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx20)) {
            return false;
        }
        mx20 mx20Var = (mx20) obj;
        return this.a == mx20Var.a && this.c == mx20Var.c && this.b == mx20Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 29791, this.b);
    }

    public mx20(int i) {
    }
}
