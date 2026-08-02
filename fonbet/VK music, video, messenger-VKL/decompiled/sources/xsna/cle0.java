package xsna;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class cle0 extends upp<pke0> {
    @Override // xsna.s140
    public final String c() {
        return "INSERT OR IGNORE INTO `push_token` (`package_info_id`,`token`,`project_id`,`created_time`,`invalidate_time`,`test_token`) VALUES (?,?,?,?,?,?)";
    }

    @Override // xsna.upp
    public final void i(zin0 zin0Var, pke0 pke0Var) {
        pke0 pke0Var2 = pke0Var;
        zin0Var.bindLong(1, pke0Var2.a);
        String str = pke0Var2.b;
        if (str == null) {
            zin0Var.bindNull(2);
        } else {
            zin0Var.bindString(2, str);
        }
        String str2 = pke0Var2.c;
        if (str2 == null) {
            zin0Var.bindNull(3);
        } else {
            zin0Var.bindString(3, str2);
        }
        zin0Var.bindLong(4, pke0Var2.d);
        Long l = pke0Var2.e;
        if (l == null) {
            zin0Var.bindNull(5);
        } else {
            zin0Var.bindLong(5, l.longValue());
        }
        zin0Var.bindLong(6, pke0Var2.f ? 1L : 0L);
    }
}
