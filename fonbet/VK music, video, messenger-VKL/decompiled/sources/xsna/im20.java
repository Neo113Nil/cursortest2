package xsna;

/* compiled from: MigrationArgs.kt */
/* loaded from: classes.dex */
public final class im20 {
    public final long a;
    public final boolean b;

    public im20(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im20)) {
            return false;
        }
        im20 im20Var = (im20) obj;
        return this.a == im20Var.a && this.b == im20Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationArgs(timeout=");
        sb.append(this.a);
        sb.append(", isFullMigration=");
        return n23.b(sb, this.b, ", isWorkManagerMigration=false)");
    }
}
