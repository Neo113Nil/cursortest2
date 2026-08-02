package defpackage;

import com.yandex.go.analytics.b;
import defpackage.nbl0;
import defpackage.tje;
import kotlin.a;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment;

/* loaded from: classes9.dex */
public final class nbl0 {
    public final hit a;
    public final b b;
    public final q c;
    public final i3y d;

    public nbl0(rqo rqoVar, hit hitVar, b bVar) {
        this.a = hitVar;
        this.b = bVar;
        RouteStatsPrefetchExperiment.Companion.getClass();
        this.c = ((jbh) rqoVar).d(RouteStatsPrefetchExperiment.i);
        this.d = a.a(new sls() { // from class: ru.yandex.taxi.routestats.prefetch.c
            @Override // defpackage.sls
            public final Object invoke() {
                nbl0 nbl0Var = nbl0.this;
                return tje.h(nbl0Var.a.a, null, null, new RouteStatsPrefetchExperimentRepositoryImpl$config$2$1(nbl0Var, null), 3);
            }
        });
    }
}
