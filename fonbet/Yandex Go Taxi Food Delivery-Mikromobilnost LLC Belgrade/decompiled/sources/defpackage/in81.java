package defpackage;

/* loaded from: classes7.dex */
public final class in81 extends y6k {
    public final z471 a = new z471();
    public f281 b;

    @Override // defpackage.y6k
    public final boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        if (super.handleAction(f9lVar, fplVar, rvoVar)) {
            return true;
        }
        f281 f281Var = this.b;
        return f281Var != null ? f281Var.handleAction(f9lVar, fplVar, rvoVar) : false;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        if (super.handleAction(v3kVar, fplVar, rvoVar)) {
            return true;
        }
        f281 f281Var = this.b;
        return f281Var != null ? f281Var.handleAction(v3kVar, fplVar, rvoVar) : false;
    }
}
