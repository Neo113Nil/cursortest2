package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;

/* loaded from: classes9.dex */
public final class b34 implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public b34(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(AutoUpdateUserLocationStrategyExperiment.v);
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
        return (AutoUpdateUserLocationStrategyExperiment) this.a.c();
    }
}
