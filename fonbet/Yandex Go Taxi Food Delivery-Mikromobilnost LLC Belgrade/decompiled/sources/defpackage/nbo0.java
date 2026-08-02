package defpackage;

import com.yandex.go.scooters.parking.data.model.ScootersParkingDescriptionExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class nbo0 implements q {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ q a;

    public nbo0(rqo rqoVar) {
        ScootersParkingDescriptionExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersParkingDescriptionExperiment.f);
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
        return (ScootersParkingDescriptionExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
