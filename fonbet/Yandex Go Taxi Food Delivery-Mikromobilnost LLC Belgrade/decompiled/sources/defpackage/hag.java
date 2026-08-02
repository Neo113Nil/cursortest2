package defpackage;

import com.ybsdk.common.repositiories.agreements.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.s;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class hag implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ hag(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                return ((h9g) tw51Var).v.a;
            case 1:
                fdr fdrVar = (fdr) ((h9g) tw51Var).D0.get();
                q5z.h(fdrVar);
                return fdrVar;
            case 2:
                n860 n860Var = (n860) ((h9g) tw51Var).B0.get();
                q5z.h(n860Var);
                return n860Var;
            case 3:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 4:
                return new g5j0((b) ((h9g) tw51Var).v.A.get());
            case 5:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 6:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 7:
                return ((h9g) tw51Var).v();
            case 8:
                return new imu0(((h9g) tw51Var).u());
            case 9:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new sm31(nb11.c((b) x8gVar.A.get()), (AppAnalyticsReporter) x8gVar.q.get());
            case 10:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((h9g) tw51Var).v.q.get();
                q5z.h(appAnalyticsReporter);
                return appAnalyticsReporter;
            case 11:
                return ((h9g) tw51Var).o();
            case 12:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 13:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 14:
                h9g h9gVar = (h9g) tw51Var;
                return new ahy0(h9gVar.u(), (tfl0) h9gVar.S.get(), (np41) h9gVar.M.get());
            case 15:
                return new s((a) ((h9g) tw51Var).v.H.get());
            case 16:
                AppAnalyticsReporter appAnalyticsReporter2 = (AppAnalyticsReporter) ((h9g) tw51Var).v.q.get();
                q5z.h(appAnalyticsReporter2);
                return appAnalyticsReporter2;
            case 17:
                return (com.ybsdk.feature.autotopup.internal.domain.a) tl3.a((h9g) tw51Var).b.get();
            case 18:
                return ((h9g) tw51Var).v.a;
            case 19:
                return ((h9g) tw51Var).v.b();
            case 20:
                return ((h9g) tw51Var).o();
            case 21:
                t0k0 s3 = ((h9g) tw51Var).s();
                q5z.h(s3);
                return s3;
            case 22:
                tfl0 t3 = ((h9g) tw51Var).t();
                q5z.h(t3);
                return t3;
            case 23:
                return new ki01((h9g) tw51Var);
            case 24:
                return new ji01(((h9g) tw51Var).b());
            case 25:
                return new eg01((j3h) ((h9g) tw51Var).E.get());
            case 26:
                return new bwb0((b) ((h9g) tw51Var).v.A.get());
            case 27:
                h9g h9gVar2 = (h9g) tw51Var;
                return new wpy0((nvd) h9gVar2.v.Q1.get(), h9gVar2.p());
            case 28:
                r90 r90Var = (r90) ((h9g) tw51Var).x0.get();
                q5z.h(r90Var);
                return r90Var;
            default:
                AppAnalyticsReporter d = ((h9g) tw51Var).d();
                q5z.h(d);
                return d;
        }
    }
}
