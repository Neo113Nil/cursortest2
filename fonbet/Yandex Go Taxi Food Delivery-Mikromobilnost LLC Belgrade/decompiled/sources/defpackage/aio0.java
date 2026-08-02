package defpackage;

import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class aio0 implements q {
    public final /* synthetic */ q a;

    public aio0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).d(new ScootersPhotocontrolExperiment(0));
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
        return (ScootersPhotocontrolExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
