package defpackage;

import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.superapp.tracking.data.e;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.fa;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.autologin.k;
import com.yandex.passport.internal.badges.c;
import com.yandex.passport.internal.badges.f;
import com.yandex.passport.internal.config.b;
import com.yandex.passport.internal.core.accounts.d;
import com.yandex.passport.internal.core.accounts.g;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.di.module.h;
import com.yandex.passport.internal.di.module.n;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.util.p;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.superapp.knownOrder.u;
import ru.yandex.taxi.widgets.data.repository.t;
import ru.yandex.taxi.widgets.data.repository.widgets.a;
import ru.yandex.taxi.widgets.domain.m;

/* loaded from: classes10.dex */
public final class f551 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;

    public f551(n nVar, yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7) {
        this.a = 4;
        this.b = nVar;
        this.d = yvf0Var;
        this.e = yvf0Var2;
        this.c = xvf0Var;
        this.f = yvf0Var3;
        this.g = yvf0Var4;
        this.h = yvf0Var5;
        this.i = yvf0Var6;
        this.j = yvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.j;
        yvf0 yvf0Var2 = this.i;
        yvf0 yvf0Var3 = this.h;
        yvf0 yvf0Var4 = this.g;
        yvf0 yvf0Var5 = this.f;
        yvf0 yvf0Var6 = this.c;
        yvf0 yvf0Var7 = this.e;
        yvf0 yvf0Var8 = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new t((u) ((q9g) obj).get(), (tse) ((xvf0) yvf0Var6).get(), (tt2) ((xvf0) yvf0Var8).get(), (a) ((xvf0) yvf0Var7).get(), (y451) ((xvf0) yvf0Var5).get(), (ru.yandex.taxi.widgets.data.datasources.fallback.a) ((xvf0) yvf0Var4).get(), (g551) ((xvf0) yvf0Var3).get(), (y) ((xvf0) yvf0Var2).get(), (y4z) ((xvf0) yvf0Var).get());
            case 1:
                return new m((j551) ((n3w) obj).a, (rfw0) ((rk21) yvf0Var6).get(), (n4s0) ((n3w) yvf0Var8).a, (tt2) ((q9g) yvf0Var7).get(), (c151) ((q9g) yvf0Var5).get(), (f4s0) ((n3w) yvf0Var4).a, (e) ((n3w) yvf0Var3).a, (bsv0) ((q9g) yvf0Var2).get(), (qc20) ((g931) yvf0Var).get());
            case 2:
                return new k((com.yandex.passport.common.coroutine.a) ((yvf0) obj).get(), (d) yvf0Var6.get(), (c) ((com.yandex.passport.internal.badges.d) yvf0Var8).get(), (f) ((fa) yvf0Var7).get(), (b) yvf0Var5.get(), (com.yandex.passport.common.common.a) yvf0Var4.get(), (j) yvf0Var3.get(), (com.yandex.passport.internal.core.accounts.t) yvf0Var2.get(), (com.yandex.passport.internal.report.reporters.j) yvf0Var.get());
            case 3:
                OkHttpClient okHttpClient = (OkHttpClient) yvf0Var8.get();
                com.yandex.passport.internal.network.e eVar = (com.yandex.passport.internal.network.e) yvf0Var7.get();
                com.yandex.passport.internal.network.a aVar = (com.yandex.passport.internal.network.a) yvf0Var5.get();
                w wVar = (w) yvf0Var4.get();
                com.yandex.passport.common.analytics.f fVar = (com.yandex.passport.common.analytics.f) yvf0Var3.get();
                com.yandex.passport.internal.e eVar2 = (com.yandex.passport.internal.e) yvf0Var2.get();
                com.yandex.passport.common.common.a aVar2 = (com.yandex.passport.common.common.a) yvf0Var.get();
                com.yandex.passport.internal.credentials.d dVar = (com.yandex.passport.internal.credentials.d) ((xvf0) yvf0Var6).get();
                ((h) obj).getClass();
                Environment environment = Environment.PRODUCTION;
                return new com.yandex.passport.internal.network.client.a(okHttpClient, new com.yandex.passport.common.network.u(environment, eVar), p.g(dVar.a, environment), aVar, wVar, fVar, eVar2, aVar2);
            default:
                g gVar = (g) yvf0Var8.get();
                com.yandex.passport.common.a aVar3 = (com.yandex.passport.common.a) yvf0Var7.get();
                com.yandex.passport.internal.usecase.t tVar = (com.yandex.passport.internal.usecase.t) ((xvf0) yvf0Var6).get();
                DatabaseHelper databaseHelper = (DatabaseHelper) yvf0Var5.get();
                com.yandex.passport.common.ui.lang.b bVar = (com.yandex.passport.common.ui.lang.b) yvf0Var4.get();
                j jVar = (j) yvf0Var3.get();
                com.yandex.passport.data.mapper.a aVar4 = (com.yandex.passport.data.mapper.a) yvf0Var.get();
                ((n) obj).getClass();
                return new com.yandex.passport.internal.core.accounts.u(com.yandex.passport.common.time.a.c(((Number) jVar.b(q.q0)).intValue(), 0, 0, 14), gVar, aVar3, tVar, databaseHelper, bVar, aVar4);
        }
    }

    public /* synthetic */ f551(yvf0 yvf0Var, yvf0 yvf0Var2, xvf0 xvf0Var, xvf0 xvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, int i) {
        this.a = i;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = yvf0Var3;
        this.g = yvf0Var4;
        this.h = yvf0Var5;
        this.i = yvf0Var6;
        this.j = yvf0Var7;
    }

    public f551(h hVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, xvf0 xvf0Var) {
        this.a = 3;
        this.b = hVar;
        this.d = yvf0Var;
        this.e = yvf0Var2;
        this.f = yvf0Var3;
        this.g = yvf0Var4;
        this.h = yvf0Var5;
        this.i = yvf0Var6;
        this.j = yvf0Var7;
        this.c = xvf0Var;
    }
}
