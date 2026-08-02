package defpackage;

import com.yandex.go.navigator.domain.b;
import com.yandex.go.navigator.repository.TimeOutMode;
import com.yandex.go.navigator.repository.o;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes12.dex */
public final class mlm extends h55 {
    public final yvf0 D;
    public final cb50 E;
    public final aus F;
    public final yvf0 G;
    public final zuj0 H;
    public final ii9 I;
    public final h3y J;
    public final yvf0 K;
    public final yvf0 L;
    public final b M;
    public final o N;
    public final yvf0 O;
    public final com.yandex.go.navigator.address.b P;
    public final hit Q;
    public final i3y R;
    public final i3y S;

    public mlm(yvf0 yvf0Var, cb50 cb50Var, aus ausVar, yvf0 yvf0Var2, zuj0 zuj0Var, ii9 ii9Var, h3y h3yVar, yvf0 yvf0Var3, yvf0 yvf0Var4, b bVar, o oVar, yvf0 yvf0Var5, com.yandex.go.navigator.address.b bVar2, hit hitVar) {
        super(null);
        this.D = yvf0Var;
        this.E = cb50Var;
        this.F = ausVar;
        this.G = yvf0Var2;
        this.H = zuj0Var;
        this.I = ii9Var;
        this.J = h3yVar;
        this.K = yvf0Var3;
        this.L = yvf0Var4;
        this.M = bVar;
        this.N = oVar;
        this.O = yvf0Var5;
        this.P = bVar2;
        this.Q = hitVar;
        this.R = a.a(new elm(this, 0));
        this.S = a.b(LazyThreadSafetyMode.NONE, new elm(this, 1));
    }

    public static final void P(mlm mlmVar) {
        mlmVar.A((m950) mlmVar.G.get(), new qf50(new uf50(null, ((avj0) mlmVar.H).h(kyh0.add_route_stop)), false), new ilm(mlmVar, 0));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        TimeOutMode timeOutMode = TimeOutMode.LONG_TIMEOUT;
        o oVar = this.N;
        oVar.b = timeOutMode;
        oVar.a.a = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((hcc0) ((gcc0) this.J.get())).a();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ((dlm) obj).getClass();
        R(new fkm(true));
    }

    public final uj00 Q() {
        return (uj00) this.R.getValue();
    }

    public final void R(fkm fkmVar) {
        int i = 0;
        if (!v(Q())) {
            A(Q(), new oj00(new elm(this, 2), new elm(this, 3)), new flm(this, i));
        }
        B((m950) this.D.get(), fkmVar, new glm(this), new n1j0(Q()));
    }

    public final void S(gfl0 gfl0Var) {
        Q().i();
        A((m950) this.I.get(), new dg50(false, (ifl0) gfl0Var), new jlm(this, 0));
    }
}
