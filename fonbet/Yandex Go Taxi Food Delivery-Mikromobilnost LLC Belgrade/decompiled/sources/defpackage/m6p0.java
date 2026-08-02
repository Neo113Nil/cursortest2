package defpackage;

import com.yandex.go.scooters.data.model.ScootersUsePointAExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class m6p0 implements q {
    public final /* synthetic */ q a;

    public m6p0(rqo rqoVar) {
        ScootersUsePointAExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersUsePointAExperiment.c);
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
        return (ScootersUsePointAExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
