package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes9.dex */
public final class m7n0 implements q {
    public final /* synthetic */ q a;

    public m7n0(rqo rqoVar) {
        ScootersClientInsuranceNewExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersClientInsuranceNewExperiment.k);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (ScootersClientInsuranceNewExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
