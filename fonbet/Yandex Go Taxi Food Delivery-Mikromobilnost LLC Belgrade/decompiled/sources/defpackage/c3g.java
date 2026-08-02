package defpackage;

import android.content.Context;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.data.c;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.payments_widgets.saver.k;
import com.yandex.go.payments_widgets.split.g;
import com.yandex.go.payments_widgets.yandex_bank.RotationDetectorListener;
import com.yandex.go.payments_widgets.yandex_bank.j;
import com.yandex.go.yb.data.u;

/* loaded from: classes.dex */
public final class c3g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ c3g(i6r i6rVar, int i) {
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
                c0g c0gVar = d0gVar.b;
                zqd0 zqd0Var = new zqd0((a) c0gVar.eq.get());
                kld0 J = d0gVar.J();
                a aVar = (a) c0gVar.eq.get();
                wqd0 wqd0Var = new wqd0();
                zzf zzfVar = d0gVar.a;
                ofa0 ofa0Var = new ofa0(zqd0Var, J, aVar, wqd0Var, (tt2) zzfVar.n.get());
                j jVar = new j(new zqd0((a) c0gVar.eq.get(), new cu51()), new zqd0((a) c0gVar.eq.get(), new ey51()), (a) c0gVar.eq.get(), (u) zzfVar.V1.get(), (tt2) zzfVar.n.get(), (mxk0) d0gVar.c3.get());
                g gVar = new g((tt2) zzfVar.n.get(), (a) c0gVar.eq.get(), new va90((a) c0gVar.eq.get(), new fx51()), new dxf0((a) c0gVar.eq.get(), new zw51()), new ix51((u) zzfVar.V1.get(), (jx51) c0gVar.Oq.get(), (mt51) zzfVar.p1.get()));
                k kVar = new k((tt2) zzfVar.n.get(), (a) c0gVar.eq.get(), new yo40((a) c0gVar.eq.get(), new su51()), new o2m0((u) zzfVar.V1.get(), (mt51) zzfVar.p1.get(), (vu51) c0gVar.Pq.get()));
                RotationDetectorListener rotationDetectorListener = (RotationDetectorListener) d0gVar.d3.get();
                mxk0 mxk0Var = (mxk0) d0gVar.c3.get();
                aba0 aba0Var = (aba0) zzfVar.fo.get();
                zzf zzfVar2 = c0gVar.z;
                return new com.yandex.go.payments_widgets.g(ofa0Var, jVar, gVar, kVar, rotationDetectorListener, mxk0Var, aba0Var, new zaa0((rqo) zzfVar2.C.get(), (u) zzfVar2.V1.get(), (lw90) zzfVar2.E9.get(), (yla0) zzfVar2.Pn.get()));
            case 1:
                lg21 d3 = ((c0g) i6rVar).d3();
                q5z.h(d3);
                return d3;
            case 2:
                c0g c0gVar2 = (c0g) i6rVar;
                hay0 v6 = c0gVar2.v6();
                zzf zzfVar3 = c0gVar2.z;
                return new ezw(v6, new a5s0((rqo) zzfVar3.C.get(), (j2t) zzfVar3.s1.get()));
            case 3:
                return ((c0g) i6rVar).w;
            case 4:
                tt2 k = ((c0g) i6rVar).k();
                q5z.h(k);
                return k;
            case 5:
                xdf o1 = ((c0g) i6rVar).o1();
                q5z.h(o1);
                return o1;
            case 6:
                return (brh) ((c0g) i6rVar).W6.get();
            case 7:
                rqo l1 = ((c0g) i6rVar).l1();
                q5z.h(l1);
                return l1;
            case 8:
                wnt m3 = ((c0g) i6rVar).m3();
                q5z.h(m3);
                return m3;
            case 9:
                e eVar = (e) ((c0g) i6rVar).z.Z8.get();
                q5z.h(eVar);
                return eVar;
            case 10:
                zzf zzfVar4 = ((c0g) i6rVar).z;
                return new eex(zzfVar4.a, (wnt) zzfVar4.q.get());
            case 11:
                c cVar = (c) ((c0g) i6rVar).z.Ro.get();
                q5z.h(cVar);
                return cVar;
            case 12:
                ryz ryzVar = (ryz) ((c0g) i6rVar).z.Dj.get();
                q5z.h(ryzVar);
                return ryzVar;
            case 13:
                fga0 fga0Var = (fga0) ((c0g) i6rVar).z.Q8.get();
                q5z.h(fga0Var);
                return fga0Var;
            case 14:
                return p03.k((on2) ((c0g) i6rVar).z.w0.get());
            case 15:
                zuj0 c = ((c0g) i6rVar).c();
                q5z.h(c);
                return c;
            case 16:
                zzf zzfVar5 = ((c0g) i6rVar).z;
                return new com.yandex.go.payments.data.k((b03) zzfVar5.f.get(), (wnt) zzfVar5.q.get(), (dne0) zzfVar5.d.get());
            case 17:
                ao51 ao51Var = (ao51) ((c0g) i6rVar).z.u9.get();
                q5z.h(ao51Var);
                return ao51Var;
            case 18:
                u uVar = (u) ((c0g) i6rVar).z.V1.get();
                q5z.h(uVar);
                return uVar;
            case 19:
                Context W1 = ((c0g) i6rVar).W1();
                q5z.h(W1);
                return W1;
            case 20:
                y50 y0 = ((c0g) i6rVar).y0();
                q5z.h(y0);
                return y0;
            case 21:
                return (com.yandex.go.payments.addmethod.navigation.c) ((c0g) i6rVar).hB.get();
            case 22:
                c0g c0gVar3 = ((c0g) i6rVar).A.a.b;
                Context context = (Context) c0gVar3.U.get();
                zzf zzfVar6 = c0gVar3.z;
                return new bf0(new ik0(context, (wnt) zzfVar6.q.get(), (y50) c0gVar3.n0.get(), (zuj0) zzfVar6.W.get(), (po21) zzfVar6.Y1.get(), c0gVar3.F6(), c0gVar3.x2, (i) zzfVar6.vj.get(), (g9a0) zzfVar6.U8.get(), (wi0) c0gVar3.v2.get(), (BindUniversalPaymentMethodApi) zzfVar6.So.get(), new raa0((e2t) zzfVar6.t1.get()), (hg0) c0gVar3.eB.a, (n20) zzfVar6.o4.get(), (hga0) zzfVar6.Qo.get(), (o3h) zzfVar6.K.get()), 0);
            case 23:
                return new gf0((hf0) ((c0g) i6rVar).A.a.b.iB.a);
            case 24:
                return (bf0) ((c0g) i6rVar).gB.get();
            case 25:
                return (com.yandex.go.payments.yape.navigation.c) ((c0g) i6rVar).fB.get();
            case 26:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                return new dr7((w030) d0gVar2.b.o0.get(), (vf8) d0gVar2.G3.a, 2);
            case 27:
                return (lj8) ((c0g) i6rVar).B2.get();
            case 28:
                return (d49) ((c0g) i6rVar).Iu.get();
            default:
                return (ygs) ((c0g) i6rVar).A.a.F3.get();
        }
    }
}
