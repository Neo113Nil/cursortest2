package defpackage;

import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes9.dex */
public final class jbh implements rqo {
    public final h3y a;
    public final gbh b;
    public final an5 c;

    public jbh(h3y h3yVar) {
        this.a = h3yVar;
        Boolean bool = Boolean.FALSE;
        this.b = new gbh(bool);
        this.c = new an5(bool);
    }

    public final qqo a(SimpleBooleanExperiment simpleBooleanExperiment) {
        u1b0 u1b0Var = (u1b0) this.a.get();
        String id = simpleBooleanExperiment.getId();
        v1b0 a = u1b0Var.a((clw0) u1b0Var.a.a.get(id), id);
        return a == null ? this.b : new gbh(a, simpleBooleanExperiment, 0);
    }

    public final en11 b(n96 n96Var) {
        v1b0 b = ((u1b0) this.a.get()).b(n96Var);
        return b == null ? new dn11(n96Var) : new fbh(b, n96Var);
    }

    public final qqo c(xn11 xn11Var) {
        v1b0 b = ((u1b0) this.a.get()).b(xn11Var);
        return b == null ? new gbh(xn11Var) : new gbh(b, xn11Var, 1);
    }

    public final q d(w96 w96Var) {
        v1b0 b = ((u1b0) this.a.get()).b(w96Var);
        return b == null ? new a3b0(w96Var) : new hbh(b, w96Var);
    }

    public final t1b0 e(vn11 vn11Var) {
        v1b0 b = ((u1b0) this.a.get()).b(vn11Var);
        return b == null ? new an5(vn11Var) : new ibh(b, vn11Var, 0);
    }

    public final t1b0 f(SimplePersistentBooleanExperiment simplePersistentBooleanExperiment) {
        u1b0 u1b0Var = (u1b0) this.a.get();
        String id = simplePersistentBooleanExperiment.getId();
        v1b0 a = u1b0Var.a((clw0) u1b0Var.a.a.get(id), id);
        return a == null ? this.c : new ibh(a, simplePersistentBooleanExperiment, 1);
    }
}
