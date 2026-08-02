package defpackage;

import coil.graphics.DataSource;

/* loaded from: classes10.dex */
public final class pcf implements qx01 {
    public final int b;

    public pcf(int i, int i2) {
        i = (i2 & 1) != 0 ? 100 : i;
        this.b = i;
        if (i > 0) {
            return;
        }
        ny61.g("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.qx01
    public final wx01 a(qy01 qy01Var, nev nevVar) {
        boolean z = nevVar instanceof u3v0;
        re60 re60Var = qx01.a;
        if (!z) {
            re60Var.getClass();
            return new se60(qy01Var, nevVar);
        }
        if (((u3v0) nevVar).c != DataSource.MEMORY_CACHE) {
            return new qcf(qy01Var, nevVar, this.b, false);
        }
        re60Var.getClass();
        return new se60(qy01Var, nevVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pcf) {
            return this.b == ((pcf) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b * 31);
    }

    public pcf() {
        this(0, 3);
    }
}
