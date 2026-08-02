package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.autotopup.internal.domain.c;
import com.ybsdk.feature.autotopup.internal.domain.d;
import com.ybsdk.feature.pin.internal.a;
import com.ybsdk.persistence.b;

/* loaded from: classes3.dex */
public final class o9g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ o9g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 25;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((h9g) tw51Var).v.q.get();
                q5z.h(appAnalyticsReporter);
                return appAnalyticsReporter;
            case 1:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new x7r0((b) x8gVar.h0.get(), (com.ybsdk.rconfig.b) x8gVar.A.get());
            case 2:
                return new if8((com.ybsdk.rconfig.b) ((h9g) tw51Var).v.A.get());
            case 3:
                return new d7g0(25, ((h9g) tw51Var).a());
            case 4:
                h9g h9gVar = (h9g) tw51Var;
                return new y7r0(h9gVar.E, (np41) h9gVar.M.get());
            case 5:
                return new pgk0(i2, (a) ((h9g) tw51Var).O.get());
            case 6:
                return new nw70(18, (a) ((h9g) tw51Var).O.get());
            case 7:
                h9g h9gVar2 = (h9g) tw51Var;
                h9gVar2.getClass();
                return new w7r0(h9gVar2);
            case 8:
                x8g x8gVar2 = ((h9g) tw51Var).v;
                return new pgk0(26, new krl0(x8gVar2.e, (AppAnalyticsReporter) x8gVar2.q.get()));
            case 9:
                AppAnalyticsReporter d = ((h9g) tw51Var).d();
                q5z.h(d);
                return d;
            case 10:
                h9g h9gVar3 = (h9g) tw51Var;
                htt0 htt0Var = h9gVar3.q;
                return new wor0((xop0) h9gVar3.v.Z.get());
            case 11:
                h9g h9gVar4 = (h9g) tw51Var;
                h9gVar4.getClass();
                return (c) tl3.a(h9gVar4).d.get();
            case 12:
                h9g h9gVar5 = (h9g) tw51Var;
                h9gVar5.getClass();
                return (d) tl3.a(h9gVar5).e.get();
            case 13:
                return ((h9g) tw51Var).v.a;
            case 14:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 15:
                return ((h9g) tw51Var).j();
            case 16:
                return ((h9g) tw51Var).v.b();
            case 17:
                return ((h9g) tw51Var).o();
            case 18:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 19:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 20:
                return ((h9g) tw51Var).u();
            case 21:
                h9g h9gVar6 = (h9g) tw51Var;
                htt0 htt0Var2 = h9gVar6.q;
                return new zxs0((tfl0) h9gVar6.S.get(), m7q0.f(h9gVar6));
            case 22:
                return ((h9g) tw51Var).z();
            case 23:
                np41 np41Var = (np41) ((h9g) tw51Var).M.get();
                q5z.h(np41Var);
                return np41Var;
            case 24:
                j3h h2 = ((h9g) tw51Var).h();
                q5z.h(h2);
                return h2;
            case 25:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 26:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 27:
                return ((h9g) tw51Var).x();
            case 28:
                h9g h9gVar7 = (h9g) tw51Var;
                d9u0 d9u0Var = h9gVar7.s;
                return new c9u0((np41) h9gVar7.M.get());
            default:
                qg6 qg6Var = ((h9g) tw51Var).f;
                q5z.h(qg6Var);
                return qg6Var;
        }
    }
}
