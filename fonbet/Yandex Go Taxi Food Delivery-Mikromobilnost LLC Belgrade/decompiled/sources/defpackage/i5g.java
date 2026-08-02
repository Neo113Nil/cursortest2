package defpackage;

import android.content.Context;
import com.yandex.go.loyalty.impl.common.data.d;
import com.yandex.go.loyalty.impl.common.domain.a;
import com.yandex.go.loyalty.impl.common.domain.m;
import com.yandex.go.payments.paymentlist.domain.c;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.tips.navigation.b;
import com.yandex.go.zone.repository.o;

/* loaded from: classes8.dex */
public final class i5g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ i5g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                zzf zzfVar = d0gVar.a;
                zuj0 zuj0Var = (zuj0) zzfVar.W.get();
                oz01 oz01Var = (oz01) zzfVar.la.get();
                dfm0 N = d0gVar.N();
                g9a0 g9a0Var = (g9a0) zzfVar.U8.get();
                h3y a = i5m.a(zzfVar.vj);
                c0g c0gVar = d0gVar.b;
                return new c(zuj0Var, oz01Var, N, g9a0Var, a, new m((a) c0gVar.V6.get(), new d(zzfVar.V0())), i5m.a(d0gVar.M3), c0gVar.t8, i5m.a(d0gVar.N3), (oep0) c0gVar.T.get());
            case 1:
                return (oca0) ((c0g) i6rVar).Y9.get();
            case 2:
                return ((c0g) i6rVar).n2();
            case 3:
                return (zsa) ((c0g) i6rVar).KA.get();
            case 4:
                return (k000) ((c0g) i6rVar).s8.get();
            case 5:
                w030 C2 = ((c0g) i6rVar).C2();
                q5z.h(C2);
                return C2;
            case 6:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                c0g c0gVar2 = d0gVar2.b;
                w030 w030Var = (w030) c0gVar2.o0.get();
                zzf zzfVar2 = d0gVar2.a;
                return new z4a0(w030Var, (g9a0) zzfVar2.U8.get(), c0gVar2.B2, (msd0) c0gVar2.P6.get(), (i) zzfVar2.vj.get(), (u4a0) d0gVar2.H3.a, (w4a0) d0gVar2.I3.a, d0gVar2.F3);
            case 7:
                d0g d0gVar3 = ((c0g) i6rVar).A.a;
                return new vha0((i130) d0gVar3.b.g0.get(), (uha0) d0gVar3.D3.a);
            case 8:
                tnr0 tnr0Var = (tnr0) ((c0g) i6rVar).n9.get();
                q5z.h(tnr0Var);
                return tnr0Var;
            case 9:
                return (b) ((c0g) i6rVar).W9.get();
            case 10:
                return (c2n0) ((c0g) i6rVar).y2.get();
            case 11:
                return new g111(((c0g) i6rVar).A.a.b.y6());
            case 12:
                jy51 jy51Var = (jy51) ((c0g) i6rVar).db.get();
                q5z.h(jy51Var);
                return jy51Var;
            case 13:
                rqo l2 = ((c0g) i6rVar).l2();
                q5z.h(l2);
                return l2;
            case 14:
                g gVar = (g) ((c0g) i6rVar).z.e6.get();
                q5z.h(gVar);
                return gVar;
            case 15:
                d0g d0gVar4 = ((c0g) i6rVar).A.a;
                rqo rqoVar = (rqo) d0gVar4.a.C.get();
                c0g c0gVar3 = d0gVar4.b;
                y50 y50Var = (y50) c0gVar3.n0.get();
                ji3 ji3Var = c0gVar3.c0;
                zzf zzfVar3 = c0gVar3.z;
                return new kt51(rqoVar, y50Var, new com.yandex.go.payments.yb.domain.b(ji3Var, zzfVar3.b(), (hit) zzfVar3.z.get()), new wrz((lx4) zzfVar3.Y.get()));
            case 16:
                zzf zzfVar4 = ((c0g) i6rVar).z;
                return new com.yandex.go.payments.paymentlist.details.d((tt2) zzfVar4.n.get(), (n9a0) zzfVar4.yq.get());
            case 17:
                return new v9a0(0, (v9a0) ((c0g) i6rVar).A.a.S3.a);
            case 18:
                chh chhVar = (chh) ((c0g) i6rVar).z.W8.get();
                q5z.h(chhVar);
                return chhVar;
            case 19:
                return (pda0) ((c0g) i6rVar).t8.get();
            case 20:
                ru.yandex.taxi.am.g V1 = ((c0g) i6rVar).V1();
                q5z.h(V1);
                return V1;
            case 21:
                tt2 Z1 = ((c0g) i6rVar).Z1();
                q5z.h(Z1);
                return Z1;
            case 22:
                ru.yandex.taxi.perf.b bVar = (ru.yandex.taxi.perf.b) ((c0g) i6rVar).z.n2.get();
                q5z.h(bVar);
                return bVar;
            case 23:
                ru.yandex.taxi.am.m mVar = (ru.yandex.taxi.am.m) ((c0g) i6rVar).z.r1.get();
                q5z.h(mVar);
                return mVar;
            case 24:
                zzf zzfVar5 = ((c0g) i6rVar).z;
                return new ru.yandex.taxi.settings.support.g((zjw0) zzfVar5.l5.get(), (cda0) zzfVar5.j1.get(), zzfVar5.v1(), (ru.yandex.taxi.launch.c) zzfVar5.Y0.get(), (o) zzfVar5.q2.get());
            case 25:
                d29 d29Var = (d29) ((c0g) i6rVar).wa.get();
                q5z.h(d29Var);
                return d29Var;
            case 26:
                Context e2 = ((c0g) i6rVar).e2();
                q5z.h(e2);
                return e2;
            case 27:
                com.yandex.div.core.expression.variables.a aVar = (com.yandex.div.core.expression.variables.a) ((c0g) i6rVar).eq.get();
                q5z.h(aVar);
                return aVar;
            case 28:
                pho k2 = ((c0g) i6rVar).k2();
                q5z.h(k2);
                return k2;
            default:
                return ((c0g) i6rVar).U1();
        }
    }
}
