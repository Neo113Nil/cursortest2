package defpackage;

/* loaded from: classes9.dex */
public final class bul extends y6k {
    public final xk7 a;

    public bul(xk7 xk7Var) {
        this.a = xk7Var;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        zrl zrlVar;
        if (super.handleAction(v3kVar, fplVar, rvoVar)) {
            return true;
        }
        xk7 xk7Var = this.a;
        Boolean bool = null;
        if (((Boolean) xk7Var.a.invoke()).booleanValue() && (zrlVar = (zrl) xk7Var.b) != null) {
            bool = Boolean.valueOf(zrlVar.handleAction(v3kVar, fplVar, rvoVar));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        zrl zrlVar;
        if (super.handleAction(f9lVar, fplVar, rvoVar)) {
            return true;
        }
        xk7 xk7Var = this.a;
        Boolean bool = null;
        if (((Boolean) xk7Var.a.invoke()).booleanValue() && (zrlVar = (zrl) xk7Var.b) != null) {
            bool = Boolean.valueOf(zrlVar.handleAction(f9lVar, fplVar, rvoVar));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
