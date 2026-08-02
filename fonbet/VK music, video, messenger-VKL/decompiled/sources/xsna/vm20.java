package xsna;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class vm20 extends hm20 {
    public static final vm20 c = new vm20(6, 7);

    @Override // xsna.hm20
    public final void b(sin0 sin0Var) {
        sin0Var.execSQL("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
