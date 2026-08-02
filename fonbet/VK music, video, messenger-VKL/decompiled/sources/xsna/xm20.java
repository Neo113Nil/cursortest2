package xsna;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class xm20 extends hm20 {
    public static final xm20 c = new xm20(8, 9);

    @Override // xsna.hm20
    public final void b(sin0 sin0Var) {
        sin0Var.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
