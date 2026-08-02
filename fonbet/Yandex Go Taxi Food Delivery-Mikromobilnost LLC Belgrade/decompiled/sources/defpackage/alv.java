package defpackage;

import com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes.dex */
public final class alv implements q {
    public final /* synthetic */ q a;

    public alv(rqo rqoVar) {
        InAppRealtimeAnalyticsExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(InAppRealtimeAnalyticsExperiment.d);
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
        return (InAppRealtimeAnalyticsExperiment) this.a.c();
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
