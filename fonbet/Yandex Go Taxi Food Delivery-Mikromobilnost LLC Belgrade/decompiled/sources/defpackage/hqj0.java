package defpackage;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.requirements.models.net.experiment.c;
import ru.yandex.taxi.requirements.repository.g;

/* loaded from: classes9.dex */
public final class hqj0 {
    public final c a;
    public final qqo b;

    public hqj0(rqo rqoVar) {
        c cVar = new c(4094);
        this.a = cVar;
        this.b = ((jbh) rqoVar).c(cVar);
    }

    public static cwi0 d(qpj0 qpj0Var, qpj0 qpj0Var2, c cVar, PropertyReference1Impl propertyReference1Impl) {
        cwi0 cwi0Var = (cwi0) propertyReference1Impl.get(qpj0Var);
        return d6z.S(cVar, cwi0Var) ? cwi0Var : (cwi0) propertyReference1Impl.get(qpj0Var2);
    }

    public final c a(c cVar) {
        boolean z = cVar.b;
        yij0 yij0Var = cVar.i;
        return (z && d6z.Z(cVar, cVar.g) && d6z.Z(cVar, cVar.b().d) && d6z.Z(cVar, cVar.a().d) && d6z.S(cVar, (cwi0) ((hpj0) cVar.n.getValue()).e.getValue()) && d6z.Z(cVar, yij0Var.b) && d6z.Z(cVar, yij0Var.a)) ? cVar : this.a;
    }

    public final c b() {
        return a((c) this.b.b());
    }

    public final tpr c() {
        return e.t(new g(this.b.a(), this));
    }
}
