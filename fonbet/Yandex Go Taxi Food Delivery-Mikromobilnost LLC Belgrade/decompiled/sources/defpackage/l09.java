package defpackage;

/* loaded from: classes14.dex */
public final class l09 extends k09 {
    @Override // defpackage.q09
    public final boolean b(k09 k09Var) {
        if (k09Var instanceof m09) {
            return this.a == ((m09) k09Var).a;
        }
        return false;
    }

    @Override // defpackage.q09
    public final boolean c(q09 q09Var) {
        if ((q09Var instanceof o09) || (q09Var instanceof m09)) {
            return this.a == ((k09) q09Var).a;
        }
        return false;
    }

    @Override // defpackage.k09
    public final yx01 e() {
        return this.a.i().s5();
    }
}
