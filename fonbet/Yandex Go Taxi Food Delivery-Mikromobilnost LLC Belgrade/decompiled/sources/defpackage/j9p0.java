package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes13.dex */
public final class j9p0 implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public j9p0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.SCOOTERS_CLIENT_ZONE_WITH_BIKES);
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
        return (Boolean) this.a.c();
    }
}
