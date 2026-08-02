package defpackage;

import com.ybsdk.common.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.e;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class oxf implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ oxf(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                r90 r90Var = (r90) ((h9g) tw51Var).x0.get();
                q5z.h(r90Var);
                return r90Var;
            case 1:
                return new uc9(((h9g) tw51Var).u());
            case 2:
                return ((h9g) tw51Var).o();
            case 3:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 4:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 5:
                return ((h9g) tw51Var).z();
            case 6:
                r90 r90Var2 = (r90) ((h9g) tw51Var).x0.get();
                q5z.h(r90Var2);
                return r90Var2;
            case 7:
                return ((h9g) tw51Var).v.a;
            case 8:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((h9g) tw51Var).v.q.get();
                q5z.h(appAnalyticsReporter);
                return appAnalyticsReporter;
            case 9:
                awa0 awa0Var = (awa0) ((h9g) tw51Var).v.w0.get();
                q5z.h(awa0Var);
                return awa0Var;
            case 10:
                return new tv3((b) ((h9g) tw51Var).v.A.get());
            case 11:
                h9g h9gVar = (h9g) tw51Var;
                return new sae(11, new g1h((j3h) h9gVar.E.get(), (np41) h9gVar.M.get()));
            case 12:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 13:
                return ((h9g) tw51Var).j();
            case 14:
                return ((h9g) tw51Var).v.b();
            case 15:
                return ((h9g) tw51Var).o();
            case 16:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 17:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 18:
                return ((h9g) tw51Var).z();
            case 19:
                tu4 tu4Var = (tu4) ((h9g) tw51Var).l0.get();
                q5z.h(tu4Var);
                return tu4Var;
            case 20:
                ua8 ua8Var = (ua8) ((h9g) tw51Var).G0.get();
                q5z.h(ua8Var);
                return ua8Var;
            case 21:
                return new ov3(((h9g) tw51Var).v.a());
            case 22:
                return new if8((b) ((h9g) tw51Var).v.A.get());
            case 23:
                h9g h9gVar2 = (h9g) tw51Var;
                return (hh5) ((df8) dx7.a(h9gVar2.h, h9gVar2)).b.get();
            case 24:
                a e = ((h9g) tw51Var).e();
                q5z.h(e);
                return e;
            case 25:
                return ((h9g) tw51Var).v.a;
            case 26:
                h9g h9gVar3 = (h9g) tw51Var;
                fjg fjgVar = h9gVar3.b;
                return new yig(h9gVar3.v.a());
            case 27:
                h9g h9gVar4 = (h9g) tw51Var;
                fjg fjgVar2 = h9gVar4.b;
                return new hf8((bhk) h9gVar4.u0.get());
            case 28:
                h9g h9gVar5 = (h9g) tw51Var;
                fjg fjgVar3 = h9gVar5.b;
                return new cjg(h9gVar5.u());
            default:
                h9g h9gVar6 = (h9g) tw51Var;
                fjg fjgVar4 = h9gVar6.b;
                j3h j3hVar = (j3h) h9gVar6.E.get();
                np41 np41Var = (np41) h9gVar6.M.get();
                b bVar = (b) h9gVar6.v.A.get();
                dx7.a(h9gVar6.h, h9gVar6);
                return new e(j3hVar, np41Var, flx0.a(h9gVar6.j, h9gVar6), bVar);
        }
    }
}
