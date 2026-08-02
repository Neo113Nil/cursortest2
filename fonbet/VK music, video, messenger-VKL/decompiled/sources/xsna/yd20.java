package xsna;

/* compiled from: MessagesDeleteFolderApiCmd.kt */
/* loaded from: classes18.dex */
public final class yd20 extends nx2<s3q0> {
    public final int b;

    public yd20(int i) {
        this.b = i;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        tfx tfxVar = new tfx("messages.deleteFolder", new gr(22), new dn(24));
        tfx.l(tfxVar, "folder_id", this.b, 1, 0, 8);
        bz2.n(tfxVar, new xmz(6)).f(l7r0Var);
        return s3q0.a;
    }
}
