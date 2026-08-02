package defpackage;

import com.ybsdk.common.a;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.h;
import com.ybsdk.di.modules.features.i;
import com.ybsdk.feature.banners.api.MarkEventsApi;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class byf implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ byf(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                return new tv3((b) ((h9g) tw51Var).v.A.get());
            case 1:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 2:
                tu4 tu4Var = (tu4) ((h9g) tw51Var).l0.get();
                q5z.h(tu4Var);
                return tu4Var;
            case 3:
                a e = ((h9g) tw51Var).e();
                q5z.h(e);
                return e;
            case 4:
                return ((h9g) tw51Var).v.a;
            case 5:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 6:
                h9g h9gVar = (h9g) tw51Var;
                gsl gslVar = h9gVar.a;
                return new esl(h9gVar.u(), (xgk) h9gVar.k0.get());
            case 7:
                h9g h9gVar2 = (h9g) tw51Var;
                gsl gslVar2 = h9gVar2.a;
                return new fsl((b) h9gVar2.v.A.get());
            case 8:
                zon zonVar = (zon) ((h9g) tw51Var).m0.get();
                q5z.h(zonVar);
                return zonVar;
            case 9:
                return ((h9g) tw51Var).j();
            case 10:
                tvv tvvVar = (tvv) ((h9g) tw51Var).v.U.get();
                q5z.h(tvvVar);
                return tvvVar;
            case 11:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 12:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 13:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 14:
                y1r0 w = ((h9g) tw51Var).w();
                q5z.h(w);
                return w;
            case 15:
                return ((h9g) tw51Var).y();
            case 16:
                a e2 = ((h9g) tw51Var).e();
                q5z.h(e2);
                return e2;
            case 17:
                return new h((f) ((h9g) tw51Var).v.G.get());
            case 18:
                return new bpn(((h9g) tw51Var).u());
            case 19:
                return new i(new com.ybsdk.feature.banners.api.interactors.a((MarkEventsApi) ((t0k0) ((h9g) tw51Var).v.s.get()).b(MarkEventsApi.class)));
            case 20:
                return new gym((nbp0) ((h9g) tw51Var).v.u.get());
            case 21:
                AppAnalyticsReporter r2 = ((h9g) tw51Var).r();
                q5z.h(r2);
                return r2;
            case 22:
                return ((h9g) tw51Var).v.a;
            case 23:
                jbo jboVar = (jbo) ((h9g) tw51Var).s0.get();
                q5z.h(jboVar);
                return jboVar;
            case 24:
                pbo pboVar = (pbo) ((h9g) tw51Var).t0.get();
                q5z.h(pboVar);
                return pboVar;
            case 25:
                lbo lboVar = (lbo) ((h9g) tw51Var).r0.get();
                q5z.h(lboVar);
                return lboVar;
            case 26:
                com.ybsdk.di.modules.features.kyc.a aVar = (com.ybsdk.di.modules.features.kyc.a) ((h9g) tw51Var).q0.get();
                q5z.h(aVar);
                return aVar;
            case 27:
                AppAnalyticsReporter r3 = ((h9g) tw51Var).r();
                q5z.h(r3);
                return r3;
            case 28:
                tfl0 t3 = ((h9g) tw51Var).t();
                q5z.h(t3);
                return t3;
            default:
                AppAnalyticsReporter r4 = ((h9g) tw51Var).r();
                q5z.h(r4);
                return r4;
        }
    }
}
