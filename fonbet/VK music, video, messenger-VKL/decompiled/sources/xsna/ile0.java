package xsna;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class ile0 extends tpp<pke0> {
    @Override // xsna.s140
    public final String c() {
        return "UPDATE OR IGNORE `push_token` SET `package_info_id` = ?,`token` = ?,`project_id` = ?,`created_time` = ?,`invalidate_time` = ?,`test_token` = ? WHERE `package_info_id` = ?";
    }

    @Override // xsna.tpp
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
        zin0Var.bindLong(7, pke0Var2.a);
    }
}
