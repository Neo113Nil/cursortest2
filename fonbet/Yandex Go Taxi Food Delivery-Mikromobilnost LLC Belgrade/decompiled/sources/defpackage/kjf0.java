package defpackage;

/* loaded from: classes15.dex */
public final class kjf0 extends rvj0 {
    public final rvj0 a;
    public final xen b;

    public kjf0(rvj0 rvj0Var, xen xenVar) {
        this.a = rvj0Var;
        this.b = xenVar;
    }

    @Override // defpackage.rvj0
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // defpackage.rvj0
    public final wg10 contentType() {
        return this.a.contentType();
    }

    @Override // defpackage.rvj0
    public final qq6 source() {
        rvj0 rvj0Var = this.a;
        return rvj0Var.contentLength() <= 0 ? rvj0Var.source() : new jci0(new jjf0(this, rvj0Var.source()));
    }
}
