package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.compose.ui.window.e;

/* loaded from: classes10.dex */
public final class eae0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public eae0(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, int i) {
        qwd qwdVar = e.a;
        int i2 = !z ? 262152 : 262144;
        i2 = secureFlagPolicy == SecureFlagPolicy.SecureOn ? i2 | 8192 : i2;
        i2 = z4 ? i2 : i2 | 512;
        boolean z5 = secureFlagPolicy == SecureFlagPolicy.Inherit;
        this.a = i2;
        this.b = z5;
        this.c = z2;
        this.d = z3;
        this.e = true;
        this.f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eae0)) {
            return false;
        }
        eae0 eae0Var = (eae0) obj;
        return this.a == eae0Var.a && this.b == eae0Var.b && this.c == eae0Var.c && this.d == eae0Var.d && this.e == eae0Var.e && this.f == eae0Var.f;
    }

    public final int hashCode() {
        return (unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public eae0(boolean z, boolean z2, int i) {
        this(z, (i & 2) != 0, (i & 4) != 0, SecureFlagPolicy.Inherit, (i & 8) != 0 ? true : z2, 0);
    }

    public eae0(int i) {
        this((i & 1) == 0, true, true, SecureFlagPolicy.Inherit, true, 0);
    }
}
