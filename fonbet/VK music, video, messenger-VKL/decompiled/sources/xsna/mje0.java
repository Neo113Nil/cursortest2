package xsna;

/* compiled from: PushMessageDao_Impl.java */
/* loaded from: classes5.dex */
public final class mje0 extends tpp<dje0> {
    @Override // xsna.s140
    public final String c() {
        return "DELETE FROM `push_message` WHERE `id` = ?";
    }

    @Override // xsna.tpp
    public final void i(zin0 zin0Var, dje0 dje0Var) {
        zin0Var.bindLong(1, dje0Var.a);
    }
}
