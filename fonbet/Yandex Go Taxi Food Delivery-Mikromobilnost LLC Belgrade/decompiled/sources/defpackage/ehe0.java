package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class ehe0 implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public ehe0(rqo rqoVar) {
        this.a = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.PRECISE_LOCATION_ENABLED);
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
