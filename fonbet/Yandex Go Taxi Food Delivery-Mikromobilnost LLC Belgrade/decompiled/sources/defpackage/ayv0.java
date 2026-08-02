package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes12.dex */
public final class ayv0 implements t1b0, quv0 {
    public final /* synthetic */ t1b0 a;

    public ayv0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.SUPERAPP_DISCOVERY_MAP_TAXI);
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

    @Override // defpackage.quv0
    public final Object d(Continuation continuation) {
        return this.a.b(continuation);
    }
}
