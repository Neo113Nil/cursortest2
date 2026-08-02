package xsna;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class tm20 extends hm20 {
    public static final tm20 c = new tm20(3, 4);

    @Override // xsna.hm20
    public final void b(sin0 sin0Var) {
        sin0Var.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
