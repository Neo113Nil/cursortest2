package xsna;

import androidx.room.RoomDatabase;

/* compiled from: WorkDatabase.kt */
/* loaded from: classes.dex */
public final class rhc extends RoomDatabase.b {
    public final i7o0 a;

    public rhc(i7o0 i7o0Var) {
        this.a = i7o0Var;
    }

    @Override // androidx.room.RoomDatabase.b
    public final void b(sin0 sin0Var) {
        sin0Var.beginTransaction();
        try {
            sin0Var.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.a.d() - yux0.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            sin0Var.setTransactionSuccessful();
        } finally {
            sin0Var.endTransaction();
        }
    }
}
