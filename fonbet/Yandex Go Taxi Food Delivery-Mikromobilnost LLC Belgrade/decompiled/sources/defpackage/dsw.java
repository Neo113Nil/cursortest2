package defpackage;

/* loaded from: classes8.dex */
public final class dsw implements yv {
    public final s59 a;

    public dsw(s59 s59Var) {
        this.a = s59Var;
    }

    @Override // defpackage.yv
    public final syj0 a(mo moVar) {
        return a9b1.c(this, moVar);
    }

    public final syj0 b(mo moVar, hko hkoVar) {
        Object value = ((wwi) this.a.a).b.a.getValue();
        axi axiVar = value instanceof axi ? (axi) value : null;
        dsw dswVar = (dsw) (axiVar != null ? axiVar.a() : null);
        if (dswVar != null) {
            return dswVar.b(moVar, hkoVar);
        }
        return y5e.u(aw.a, "Quark not initialized to execute action " + moVar + " with options " + hkoVar);
    }
}
