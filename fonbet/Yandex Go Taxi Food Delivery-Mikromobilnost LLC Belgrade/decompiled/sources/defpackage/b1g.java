package defpackage;

import android.content.Context;
import com.yandex.go.navigation.screen.c;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.h;
import ru.yandex.taxi.orderbutton.summary.base.analytics.SummaryOrderButtonAnalytics;
import ru.yandex.taxi.surge.interactor.e;
import ru.yandex.taxi.surge.interactor.r;
import ru.yandex.taxi.surge.interactor.s;

/* loaded from: classes6.dex */
public final class b1g implements xvf0 {
    public final /* synthetic */ int a;
    public final h0g b;

    public /* synthetic */ b1g(h0g h0gVar, int i) {
        this.a = i;
        this.b = h0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h0g h0gVar = this.b;
        switch (i) {
            case 0:
                qpt0 qpt0Var = (qpt0) h0gVar.N4.get();
                q5z.h(qpt0Var);
                return qpt0Var;
            case 1:
                return h0gVar.y.a.P();
            case 2:
                exu0 exu0Var = (exu0) h0gVar.x.T.get();
                q5z.h(exu0Var);
                return exu0Var;
            case 3:
                f fVar = (f) h0gVar.x.Fi.get();
                q5z.h(fVar);
                return fVar;
            case 4:
                return (icv0) h0gVar.x.sm.get();
            case 5:
                zzf zzfVar = h0gVar.x;
                return new ucv0((nct0) zzfVar.Vr.get(), (q) zzfVar.lk.get(), (wiq0) zzfVar.B2.get());
            case 6:
                yfv0 yfv0Var = (yfv0) h0gVar.y.nf.get();
                q5z.h(yfv0Var);
                return yfv0Var;
            case 7:
                fgv0 fgv0Var = (fgv0) h0gVar.K.get();
                q5z.h(fgv0Var);
                return fgv0Var;
            case 8:
                mgv0 mgv0Var = (mgv0) h0gVar.y.kf.get();
                q5z.h(mgv0Var);
                return mgv0Var;
            case 9:
                biv0 v0 = h0gVar.v0();
                q5z.h(v0);
                return v0;
            case 10:
                return h0gVar.J1();
            case 11:
                SummaryOrderButtonAnalytics summaryOrderButtonAnalytics = (SummaryOrderButtonAnalytics) h0gVar.H7.get();
                q5z.h(summaryOrderButtonAnalytics);
                return summaryOrderButtonAnalytics;
            case 12:
                smv0 smv0Var = (smv0) h0gVar.y.mw.get();
                q5z.h(smv0Var);
                return smv0Var;
            case 13:
                fgv0 fgv0Var2 = (fgv0) h0gVar.K.get();
                q5z.h(fgv0Var2);
                return fgv0Var2;
            case 14:
                yit0 b1 = h0gVar.b1();
                q5z.h(b1);
                return b1;
            case 15:
                mqv0 mqv0Var = (mqv0) h0gVar.x.j2.get();
                q5z.h(mqv0Var);
                return mqv0Var;
            case 16:
                c0g c0gVar = h0gVar.y;
                b d6 = c0gVar.d6();
                zzf zzfVar2 = h0gVar.x;
                return new e(d6, (c) zzfVar2.Bc.get(), (hww0) zzfVar2.br.get(), (tt2) zzfVar2.n.get(), (Context) c0gVar.U.get(), (rqo) zzfVar2.C.get());
            case 17:
                zzf zzfVar3 = h0gVar.x;
                c cVar = (c) zzfVar3.Bc.get();
                wiq0 wiq0Var = (wiq0) zzfVar3.B2.get();
                c0g c0gVar2 = h0gVar.y;
                return new trv0(cVar, wiq0Var, (a) c0gVar2.g9.get(), (tt2) zzfVar3.n.get(), (ru.yandex.taxi.widget.utils.e) c0gVar2.J9.get(), (Context) c0gVar2.U.get(), (pwy0) zzfVar3.U.get(), (yp2) zzfVar3.kk.get());
            case 18:
                return h0gVar.y.a.Q();
            case 19:
                zzf zzfVar4 = h0gVar.x;
                ru.yandex.taxi.surge.repository.b bVar = (ru.yandex.taxi.surge.repository.b) zzfVar4.dr.get();
                tt2 tt2Var = (tt2) zzfVar4.n.get();
                wiq0 wiq0Var2 = (wiq0) zzfVar4.B2.get();
                c0g c0gVar3 = h0gVar.y;
                zzf zzfVar5 = c0gVar3.z;
                return new ru.yandex.taxi.surge.interactor.q(bVar, tt2Var, wiq0Var2, new ru.yandex.taxi.promotions.factory.a((po21) zzfVar5.Y1.get(), (dqe0) zzfVar5.s2.get(), i5m.a(c0gVar3.Vb), i5m.a(zzfVar5.Dc), (nmx) zzfVar5.Ab.get(), (h) zzfVar5.s0.get(), (tt2) zzfVar5.n.get(), zzfVar5.f1()), (uze0) zzfVar4.B2.get(), (pwy0) zzfVar4.U.get(), new ru.yandex.taxi.surge.mapper.a((Context) c0gVar3.U.get(), (ru.yandex.taxi.widget.utils.e) c0gVar3.J9.get(), (pdc) zzfVar4.Ye.get(), c0gVar3.d6(), (qbl0) zzfVar4.C2.get(), c0gVar3.a.e(), (xdf) zzfVar4.S3.get(), new quw0()));
            case 20:
                zzf zzfVar6 = h0gVar.x;
                return new r((tt2) zzfVar6.n.get(), (wiq0) zzfVar6.B2.get(), (ru.yandex.taxi.widget.utils.e) h0gVar.y.J9.get(), (ru.yandex.taxi.surge.repository.a) zzfVar6.cr.get());
            case 21:
                return new s((ru.yandex.taxi.surge.repository.c) h0gVar.x.er.get());
            case 22:
                b0x0 b0x0Var = (b0x0) h0gVar.y.Ci.get();
                q5z.h(b0x0Var);
                return b0x0Var;
            case 23:
                c2x0 c2x0Var = (c2x0) h0gVar.y.xb.get();
                q5z.h(c2x0Var);
                return c2x0Var;
            case 24:
                kgu kguVar = (kgu) h0gVar.x.jq.get();
                q5z.h(kguVar);
                return kguVar;
            case 25:
                afx0 afx0Var = (afx0) h0gVar.y.vx.get();
                q5z.h(afx0Var);
                return afx0Var;
            case 26:
                return h0gVar.K1();
            case 27:
                return new clx0(new zax0((pho) h0gVar.y.a.a.d0.get()));
            case 28:
                com.yandex.go.taxi.tariffs.analytics.c cVar2 = (com.yandex.go.taxi.tariffs.analytics.c) h0gVar.y.a.Y6.get();
                q5z.h(cVar2);
                return cVar2;
            default:
                return h0gVar.x.A1();
        }
    }
}
