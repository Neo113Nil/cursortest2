package defpackage;

import com.ybsdk.common.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.pin.b;
import com.ybsdk.screens.registration.a;

/* loaded from: classes3.dex */
public final class p5g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ p5g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                xui0 xui0Var = (xui0) ((h9g) tw51Var).v.F1.get();
                q5z.h(xui0Var);
                return xui0Var;
            case 1:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 2:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 3:
                return ((h9g) tw51Var).v();
            case 4:
                return new lz70(28, (a) ((h9g) tw51Var).R.get());
            case 5:
                return new b((e) ((h9g) tw51Var).v.T.get());
            case 6:
                AppAnalyticsReporter d = ((h9g) tw51Var).d();
                q5z.h(d);
                return d;
            case 7:
                qg6 qg6Var = ((h9g) tw51Var).f;
                q5z.h(qg6Var);
                return qg6Var;
            case 8:
                return ((h9g) tw51Var).v.a;
            case 9:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 10:
                return new d7g0(0, (qa60) ((h9g) tw51Var).c0.get());
            case 11:
                return new ff8((qa60) ((h9g) tw51Var).c0.get());
            case 12:
                return new aye0((a8b0) ((h9g) tw51Var).v.I1.get());
            case 13:
                return new f7g0((com.ybsdk.rconfig.b) ((h9g) tw51Var).v.A.get());
            case 14:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new vfc0((com.ybsdk.rconfig.b) x8gVar.A.get(), (twu0) x8gVar.R1.get());
            case 15:
                return new g7g0(((h9g) tw51Var).u());
            case 16:
                return new um90(((h9g) tw51Var).v.e());
            case 17:
                x8g x8gVar2 = ((h9g) tw51Var).v;
                return new v5c0(x8gVar2.e(), new um90(x8gVar2.e()));
            case 18:
                x8g x8gVar3 = ((h9g) tw51Var).v;
                return new sue0(x8gVar3.e(), new um90(x8gVar3.e()));
            case 19:
                return new me1((a1b0) ((h9g) tw51Var).v.n.get(), 2);
            case 20:
                x8g x8gVar4 = ((h9g) tw51Var).v;
                return new y4a0((com.ybsdk.rconfig.b) x8gVar4.A.get(), (a3h) x8gVar4.T0.get());
            case 21:
                com.ybsdk.feature.qr.api.domain.a aVar = (com.ybsdk.feature.qr.api.domain.a) ((h9g) tw51Var).v.m1.get();
                q5z.h(aVar);
                return aVar;
            case 22:
                h9g h9gVar = (h9g) tw51Var;
                j3h j3hVar = (j3h) h9gVar.E.get();
                x8g x8gVar5 = h9gVar.v;
                return new com.ybsdk.di.modules.mediators.a(j3hVar, (AppAnalyticsReporter) x8gVar5.q.get(), (com.ybsdk.qr.a) x8gVar5.o1.get());
            case 23:
                x8g x8gVar6 = ((h9g) tw51Var).v;
                return new yxf0((com.ybsdk.rconfig.b) x8gVar6.A.get(), (qpi0) x8gVar6.S0.get());
            case 24:
                return new jzz(((h9g) tw51Var).v.e);
            case 25:
                return new e7g0((np41) ((h9g) tw51Var).M.get());
            case 26:
                com.ybsdk.feature.qr.internal.domain.a aVar2 = (com.ybsdk.feature.qr.internal.domain.a) ((h9g) tw51Var).v.n1.get();
                q5z.h(aVar2);
                return aVar2;
            case 27:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 28:
                AppAnalyticsReporter d2 = ((h9g) tw51Var).d();
                q5z.h(d2);
                return d2;
            default:
                return new sue0(9, ((h9g) tw51Var).b());
        }
    }
}
