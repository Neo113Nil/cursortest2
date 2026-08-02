package xsna;

/* compiled from: BiometrcsSettingsDialogs.kt */
/* loaded from: classes15.dex */
public final class i47 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public i47() {
        this(false, false, false);
    }

    public static i47 a(i47 i47Var, int i) {
        boolean z = (i & 1) != 0 ? i47Var.a : true;
        boolean z2 = (i & 2) != 0 ? i47Var.b : true;
        boolean z3 = (i & 4) != 0 ? i47Var.c : true;
        i47Var.getClass();
        return new i47(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i47)) {
            return false;
        }
        i47 i47Var = (i47) obj;
        return this.a == i47Var.a && this.b == i47Var.b && this.c == i47Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometrcsSettingsDialogs(isDisableSecureLogin=");
        sb.append(this.a);
        sb.append(", isBiometricsError=");
        sb.append(this.b);
        sb.append(", isTooManyBiometricsAttempts=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public i47(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
