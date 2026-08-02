package xsna;

/* compiled from: ClipsVideoStorageSettings.kt */
/* loaded from: classes.dex */
public final class pnf {
    public final boolean a;

    public pnf(boolean z) {
        this.a = z;
    }

    public static int a() {
        nxv nxvVar = m63.c;
        if (nxvVar == null) {
            nxvVar = null;
        }
        ik80 ik80Var = (ik80) nxvVar.invoke();
        if (ik80Var.getBitrateEstimate() > 2500000) {
            return 5;
        }
        return ik80Var.getBitrateEstimate() > 1300000 ? 2 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnf) && this.a == ((pnf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ClipsVideoStorageSettings(isCacheWarmupEnabled="), this.a, ')');
    }
}
