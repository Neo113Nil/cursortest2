package defpackage;

import androidx.room.RoomDatabase;

/* loaded from: classes.dex */
public final class p0c extends RoomDatabase.a {
    public final n2x0 a;

    public p0c(n2x0 n2x0Var) {
        this.a = n2x0Var;
    }

    @Override // androidx.room.RoomDatabase.a
    public final void c(hkw0 hkw0Var) {
        hkw0Var.i();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.a.getClass();
            sb.append(System.currentTimeMillis() - 86400000);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            hkw0Var.r(sb.toString());
            hkw0Var.s();
        } finally {
            hkw0Var.t();
        }
    }
}
