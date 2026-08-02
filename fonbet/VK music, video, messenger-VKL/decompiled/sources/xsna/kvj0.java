package xsna;

import com.vk.core.preference.single_pref.SinglePreferenceMigrationType;

/* compiled from: SinglePreferenceMigrationType.kt */
/* loaded from: classes.dex */
public final class kvj0 {
    public final boolean a;
    public final SinglePreferenceMigrationType b;
    public final long c;
    public final boolean d;
    public final Integer e;
    public final boolean f;

    public /* synthetic */ kvj0(boolean z, SinglePreferenceMigrationType singlePreferenceMigrationType, long j, Integer num, boolean z2, int i) {
        this(z, singlePreferenceMigrationType, j, (i & 8) == 0, (i & 16) != 0 ? null : num, (i & 32) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvj0)) {
            return false;
        }
        kvj0 kvj0Var = (kvj0) obj;
        return this.a == kvj0Var.a && this.b == kvj0Var.b && this.c == kvj0Var.c && this.d == kvj0Var.d && epx.f(this.e, kvj0Var.e) && this.f == kvj0Var.f;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SinglePreferenceMigrationResult(isSuccess=");
        sb.append(this.a);
        sb.append(", migrationType=");
        sb.append(this.b);
        sb.append(", migrationTime=");
        sb.append(this.c);
        sb.append(", isTimeoutError=");
        sb.append(this.d);
        sb.append(", modifiedFilesCount=");
        sb.append(this.e);
        sb.append(", isWorkManagerMigration=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public kvj0(boolean z, SinglePreferenceMigrationType singlePreferenceMigrationType, long j, boolean z2, Integer num, boolean z3) {
        this.a = z;
        this.b = singlePreferenceMigrationType;
        this.c = j;
        this.d = z2;
        this.e = num;
        this.f = z3;
    }
}
