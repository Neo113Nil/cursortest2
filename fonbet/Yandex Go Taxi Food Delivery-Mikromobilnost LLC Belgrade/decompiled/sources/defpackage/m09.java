package defpackage;

/* loaded from: classes14.dex */
public final class m09 extends k09 {
    @Override // defpackage.q09
    public final boolean b(k09 k09Var) {
        if (k09Var instanceof l09) {
            return this.a == ((l09) k09Var).a;
        }
        return false;
    }

    @Override // defpackage.q09
    public final boolean c(q09 q09Var) {
        return q09Var instanceof l09;
    }

    @Override // defpackage.k09
    public final yx01 e() {
        return this.a.i().p6();
    }
}
