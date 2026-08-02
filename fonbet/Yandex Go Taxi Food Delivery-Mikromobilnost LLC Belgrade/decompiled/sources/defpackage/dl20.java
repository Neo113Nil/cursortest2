package defpackage;

import android.content.Context;
import com.yandex.mob.api.model.MobEnvironment;
import com.yandex.mob.d;
import com.yandex.mob.datastore.c;
import com.yandex.mob.datastore.f;
import com.yandex.mob.domain.g;
import com.yandex.mob.domain.l;
import com.yandex.mob.domain.n;
import com.yandex.mob.domain.o;
import com.yandex.mob.j;
import com.yandex.mob.k;
import com.yandex.mob.m;
import com.yandex.mob.reporting.a;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class dl20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ dl20(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        int i3 = 2;
        d dVar = this.b;
        switch (i) {
            case 0:
                return dVar.n;
            case 1:
                return (f) dVar.N.getValue();
            case 2:
                return (c) dVar.w.getValue();
            case 3:
                return (l) dVar.x.getValue();
            case 4:
                return (com.yandex.mob.data.c) dVar.M.getValue();
            case 5:
                return (n) dVar.I.getValue();
            case 6:
                return (a) dVar.H.getValue();
            case 7:
                return new com.yandex.mob.a(dVar.a, dVar.n);
            case 8:
                return (m) dVar.B.getValue();
            case 9:
                return new a041(dVar.k(), (com.yandex.mob.datastore.d) dVar.G.getValue());
            case 10:
                return new z160(dVar.k(), (com.yandex.mob.datastore.d) dVar.G.getValue());
            case 11:
                return (com.yandex.mob.datastore.d) dVar.G.getValue();
            case 12:
                return new io20((com.yandex.mob.n) dVar.y.getValue(), dVar.o);
            case 13:
                return new rr20(dVar.l, dVar.m, (com.yandex.mob.n) dVar.y.getValue());
            case 14:
                return new m((jr20) dVar.r.getValue(), (c) dVar.w.getValue());
            case 15:
                return new xp20((m) dVar.B.getValue());
            case 16:
                return new vp20((rr20) dVar.A.getValue(), null, (xp20) dVar.C.getValue(), (io20) dVar.z.getValue());
            case 17:
                return new fl20(dVar);
            case 18:
                return new com.yandex.mob.datastore.d((tpg) dVar.v.getValue());
            case 19:
                return new a((l) dVar.x.getValue(), dVar.c, (com.yandex.mob.datastore.d) dVar.G.getValue());
            case 20:
                sot sotVar = (sot) dVar.e;
                sotVar.getClass();
                AppMetrica.activateReporter(sotVar.a, ReporterConfig.newConfigBuilder("b1b14fd8-aad7-4d9b-9e24-975f6db5c42a").withLogs().build());
                return new rot(sotVar);
            case 21:
                return new g((o) dVar.J.getValue());
            case 22:
                return new com.yandex.mob.data.c((f) dVar.N.getValue(), (l) dVar.x.getValue(), (g) dVar.K.getValue(), (an20) dVar.L.getValue());
            case 23:
                return new f((tpg) dVar.v.getValue());
            case 24:
                i3y i3yVar = dVar.q;
                jqh jqhVar = new jqh(1, new yuf0((rot) i3yVar.getValue(), dVar.k(), dVar.f));
                flv flvVar = new flv((d5e) dVar.u.getValue(), (vp20) dVar.D.getValue());
                flv flvVar2 = new flv(null, new vp20((rr20) dVar.A.getValue(), jqhVar, (xp20) dVar.C.getValue(), (io20) dVar.z.getValue()));
                qm20 qm20Var = dVar.c;
                MobEnvironment mobEnvironment = dVar.b;
                jr20 jr20Var = (jr20) dVar.r.getValue();
                List list = dVar.d;
                rot rotVar = (rot) i3yVar.getValue();
                npt nptVar = dVar.f;
                com.yandex.go.proxyprovision.mob.a aVar = dVar.g;
                jse jseVar = dVar.n;
                yn20 yn20Var = dVar.h;
                tot totVar = dVar.i;
                no20 no20Var = dVar.k;
                com.yandex.go.proxyprovision.mob.d dVar2 = dVar.j;
                k kVar = new k();
                return new j(new yo20(mobEnvironment, qm20Var, nptVar, list, aVar, yn20Var, rotVar, totVar, dVar2, dVar.p, (g) dVar.K.getValue(), no20Var, jr20Var, jseVar, new lo20(), kVar, new el20(flvVar2, dVar, 0), new el20(flvVar, dVar, 1), new el20(flvVar2, dVar, 2), new el20(flvVar2, dVar, 3), new dl20(dVar, 7), new dl20(dVar, 8), new dl20(dVar, 9), new dl20(dVar, 10), new dl20(dVar, 11), new dl20(dVar, 1), new dl20(dVar, 2), new dl20(dVar, 3), new dl20(dVar, 4), new dl20(dVar, 5), new dl20(dVar, 6)));
            case 25:
                return new jr20(new dl20(dVar, i2), (rot) dVar.q.getValue());
            case 26:
                return new cb2(dVar.a);
            case 27:
                return qv10.e(dVar.n);
            case 28:
                Context context = dVar.a;
                MobEnvironment mobEnvironment2 = dVar.b;
                return xn20.a(context, mobEnvironment2, Collections.singletonList(new com.yandex.mob.o(context, mobEnvironment2, (rot) dVar.q.getValue(), new jl20(dVar, i3))), (tse) dVar.t.getValue());
            default:
                return new c((tpg) dVar.v.getValue());
        }
    }
}
