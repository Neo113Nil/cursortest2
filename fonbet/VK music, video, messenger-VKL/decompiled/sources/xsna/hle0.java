package xsna;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class hle0 extends tpp<pke0> {
    @Override // xsna.s140
    public final String c() {
        return "DELETE FROM `push_token` WHERE `package_info_id` = ?";
    }

    @Override // xsna.tpp
    public final void i(zin0 zin0Var, pke0 pke0Var) {
        zin0Var.bindLong(1, pke0Var.a);
    }
}
