package xsna;

/* compiled from: BiometricsLockSecuritySetupState.kt */
/* loaded from: classes15.dex */
public final class h87 implements km50 {
    public final boolean b;
    public final boolean c;

    public h87() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h87)) {
            return false;
        }
        h87 h87Var = (h87) obj;
        return this.b == h87Var.b && this.c == h87Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometricsLockSecuritySetupState(needShowBiometricsDialog=");
        sb.append(this.b);
        sb.append(", needShowTooManyBiometricsAttemptsDialog=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public h87(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }
}
