package xsna;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class pm20 extends hm20 {
    public static final pm20 c = new pm20(12, 13);

    @Override // xsna.hm20
    public final void b(sin0 sin0Var) {
        sin0Var.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        sin0Var.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
