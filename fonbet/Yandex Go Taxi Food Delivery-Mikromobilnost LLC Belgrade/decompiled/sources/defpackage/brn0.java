package defpackage;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes8.dex */
public final class brn0 implements q {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ q a;

    public brn0(rqo rqoVar) {
        ScootersIgnitionExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersIgnitionExperiment.t);
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
        return (ScootersIgnitionExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
