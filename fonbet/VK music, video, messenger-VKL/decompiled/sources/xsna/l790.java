package xsna;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class l790 extends tpp<e790> {
    @Override // xsna.s140
    public final String c() {
        return "UPDATE OR ABORT `package_info` SET `package_id` = ?,`package_name` = ?,`sha_hash` = ?,`package_invalidate_time` = ? WHERE `package_id` = ?";
    }

    @Override // xsna.tpp
    public final void i(zin0 zin0Var, e790 e790Var) {
        e790 e790Var2 = e790Var;
        zin0Var.bindLong(1, e790Var2.a);
        String str = e790Var2.b;
        if (str == null) {
            zin0Var.bindNull(2);
        } else {
            zin0Var.bindString(2, str);
        }
        String str2 = e790Var2.c;
        if (str2 == null) {
            zin0Var.bindNull(3);
        } else {
            zin0Var.bindString(3, str2);
        }
        Long l = e790Var2.d;
        if (l == null) {
            zin0Var.bindNull(4);
        } else {
            zin0Var.bindLong(4, l.longValue());
        }
        zin0Var.bindLong(5, e790Var2.a);
    }
}
