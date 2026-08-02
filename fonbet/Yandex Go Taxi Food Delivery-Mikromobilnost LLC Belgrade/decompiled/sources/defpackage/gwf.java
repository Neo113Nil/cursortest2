package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.banners.api.MarkEventsApi;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.common.c;
import com.ybsdk.screens.registration.a;

/* loaded from: classes3.dex */
public final class gwf implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ gwf(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                h9g h9gVar = (h9g) tw51Var;
                i5 i5Var = h9gVar.e;
                return new g5((j3h) h9gVar.E.get());
            case 1:
                h9g h9gVar2 = (h9g) tw51Var;
                i5 i5Var2 = h9gVar2.e;
                x8g x8gVar = h9gVar2.v;
                return new h5(x8gVar.e, (b) x8gVar.A.get(), h9gVar2.c);
            case 2:
                h9g h9gVar3 = (h9g) tw51Var;
                i5 i5Var3 = h9gVar3.e;
                return new ddf(4, new yvi0(h9gVar3.v.a));
            case 3:
                return ((h9g) tw51Var).v.a;
            case 4:
                h9g h9gVar4 = (h9g) tw51Var;
                return new jk((j3h) h9gVar4.E.get(), (np41) h9gVar4.M.get());
            case 5:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 6:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 7:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((h9g) tw51Var).v.q.get();
                q5z.h(appAnalyticsReporter);
                return appAnalyticsReporter;
            case 8:
                return new g191((c) ((h9g) tw51Var).I0.get());
            case 9:
                return new mf1((gff) ((h9g) tw51Var).v.X.get(), 6);
            case 10:
                return new ov3(((h9g) tw51Var).v.a());
            case 11:
                h9g h9gVar5 = (h9g) tw51Var;
                tfl0 tfl0Var = (tfl0) h9gVar5.S.get();
                np41 np41Var = (np41) h9gVar5.M.get();
                wig f = m7q0.f(h9gVar5);
                return new sv3(h9gVar5.u(), (j3h) h9gVar5.E.get(), np41Var, tfl0Var, f, (xgk) h9gVar5.k0.get());
            case 12:
                h9g h9gVar6 = (h9g) tw51Var;
                tfl0 tfl0Var2 = (tfl0) h9gVar6.S.get();
                np41 np41Var2 = (np41) h9gVar6.M.get();
                return new nv3(h9gVar6.u(), tfl0Var2, m7q0.f(h9gVar6), np41Var2);
            case 13:
                return new tv3((b) ((h9g) tw51Var).v.A.get());
            case 14:
                return new vv3((a) ((h9g) tw51Var).R.get());
            case 15:
                return new com.ybsdk.di.modules.features.a((com.ybsdk.common.repositiories.user.a) ((h9g) tw51Var).v.F.get());
            case 16:
                h9g h9gVar7 = (h9g) tw51Var;
                return new h0w(17, h9gVar7.E, (np41) h9gVar7.M.get());
            case 17:
                com.ybsdk.common.a e = ((h9g) tw51Var).e();
                q5z.h(e);
                return e;
            case 18:
                return ((h9g) tw51Var).v.a;
            case 19:
                h9g h9gVar8 = (h9g) tw51Var;
                wu4 wu4Var = h9gVar8.i;
                return (com.ybsdk.feature.banners.impl.domain.interactors.a) ((tu4) h9gVar8.l0.get()).b.get();
            case 20:
                tvv tvvVar = (tvv) ((h9g) tw51Var).v.U.get();
                q5z.h(tvvVar);
                return tvvVar;
            case 21:
                return ((h9g) tw51Var).v.b();
            case 22:
                return ((h9g) tw51Var).o();
            case 23:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 24:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 25:
                y1r0 w = ((h9g) tw51Var).w();
                q5z.h(w);
                return w;
            case 26:
                return new uu4((a1b0) ((h9g) tw51Var).v.n.get());
            case 27:
                com.ybsdk.common.a e2 = ((h9g) tw51Var).e();
                q5z.h(e2);
                return e2;
            case 28:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            default:
                return new com.ybsdk.feature.banners.api.interactors.a((MarkEventsApi) ((t0k0) ((h9g) tw51Var).v.s.get()).b(MarkEventsApi.class));
        }
    }
}
