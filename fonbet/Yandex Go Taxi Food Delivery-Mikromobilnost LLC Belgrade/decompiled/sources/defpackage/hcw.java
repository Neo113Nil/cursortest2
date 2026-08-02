package defpackage;

import com.yandex.go.dto.response.Action$CityMode;

/* loaded from: classes5.dex */
public final class hcw extends h55 {
    public final yvf0 D;
    public final ciw E;
    public final oep0 F;

    public hcw(yvf0 yvf0Var, ciw ciwVar, oep0 oep0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = ciwVar;
        this.F = oep0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        gcw gcwVar = (gcw) obj;
        tse o = o();
        gau gauVar = new gau(20, this);
        ciw ciwVar = this.E;
        ciwVar.a.set(gauVar);
        gtq0.t(o, new mgu(15, ciwVar, gauVar));
        ((pep0) this.F).f((m950) this.D.get(), new zow(new tnw(gcwVar.a, gcwVar.b, gcwVar.c, Action$CityMode.Context.b, gcwVar.d), false), hxx.a);
    }
}
