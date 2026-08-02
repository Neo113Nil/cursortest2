package xsna;

import xsna.ug5;

/* compiled from: BiometricsLockSettingsState.kt */
/* loaded from: classes15.dex */
public final class x87 implements km50 {
    public final boolean b;
    public final boolean c;
    public final ug5 d;
    public final i47 e;

    public x87() {
        this(0);
    }

    public static x87 a(x87 x87Var, boolean z, boolean z2, ug5 ug5Var, i47 i47Var, int i) {
        if ((i & 1) != 0) {
            z = x87Var.b;
        }
        if ((i & 2) != 0) {
            z2 = x87Var.c;
        }
        if ((i & 4) != 0) {
            ug5Var = x87Var.d;
        }
        if ((i & 8) != 0) {
            i47Var = x87Var.e;
        }
        x87Var.getClass();
        return new x87(z, z2, ug5Var, i47Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x87)) {
            return false;
        }
        x87 x87Var = (x87) obj;
        return this.b == x87Var.b && this.c == x87Var.c && epx.f(this.d, x87Var.d) && epx.f(this.e, x87Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "BiometricsLockSettingsState(isBiometricEntranceEnabled=" + this.b + ", isBiometricAvailable=" + this.c + ", autoLockTimeStrategy=" + this.d + ", dialogs=" + this.e + ')';
    }

    public x87(boolean z, boolean z2, ug5 ug5Var, i47 i47Var) {
        this.b = z;
        this.c = z2;
        this.d = ug5Var;
        this.e = i47Var;
    }

    public /* synthetic */ x87(int i) {
        this(false, false, ug5.b.b, new i47(false, false, false));
    }
}
