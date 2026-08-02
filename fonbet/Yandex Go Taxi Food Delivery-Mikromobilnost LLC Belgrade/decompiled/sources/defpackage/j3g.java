package defpackage;

import com.ybsdk.common.repositiories.agreements.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.j;
import com.ybsdk.di.modules.features.k;
import com.ybsdk.di.modules.features.l;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class j3g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ j3g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                return new yo10((np41) ((h9g) tw51Var).M.get());
            case 1:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 2:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 3:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 4:
                y1r0 w = ((h9g) tw51Var).w();
                q5z.h(w);
                return w;
            case 5:
                return ((h9g) tw51Var).y();
            case 6:
                AppAnalyticsReporter r2 = ((h9g) tw51Var).r();
                q5z.h(r2);
                return r2;
            case 7:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 8:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 9:
                h9g h9gVar = (h9g) tw51Var;
                kh90 kh90Var = h9gVar.k;
                return new j((a) h9gVar.v.H.get());
            case 10:
                h9g h9gVar2 = (h9g) tw51Var;
                kh90 kh90Var2 = h9gVar2.k;
                return new mf1((gff) h9gVar2.v.X.get(), 17);
            case 11:
                h9g h9gVar3 = (h9g) tw51Var;
                kh90 kh90Var3 = h9gVar3.k;
                return new k((com.ybsdk.common.repositiories.user.a) h9gVar3.v.F.get());
            case 12:
                h9g h9gVar4 = (h9g) tw51Var;
                return g680.b(h9gVar4.l, h9gVar4);
            case 13:
                return ((h9g) tw51Var).o();
            case 14:
                AppAnalyticsReporter r3 = ((h9g) tw51Var).r();
                q5z.h(r3);
                return r3;
            case 15:
                t0k0 s3 = ((h9g) tw51Var).s();
                q5z.h(s3);
                return s3;
            case 16:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 17:
                AppAnalyticsReporter d = ((h9g) tw51Var).d();
                q5z.h(d);
                return d;
            case 18:
                j3h h2 = ((h9g) tw51Var).h();
                q5z.h(h2);
                return h2;
            case 19:
                return new l((a) ((h9g) tw51Var).v.H.get());
            case 20:
                return new pi90((a3h) ((h9g) tw51Var).v.T0.get());
            case 21:
                h9g h9gVar5 = (h9g) tw51Var;
                ri90 ri90Var = h9gVar5.l;
                return new qi90((j3h) h9gVar5.E.get(), (np41) h9gVar5.M.get());
            case 22:
                return ((h9g) tw51Var).m();
            case 23:
                return ((h9g) tw51Var).o();
            case 24:
                t0k0 s4 = ((h9g) tw51Var).s();
                q5z.h(s4);
                return s4;
            case 25:
                tfl0 t3 = ((h9g) tw51Var).t();
                q5z.h(t3);
                return t3;
            case 26:
                k1x0 k1x0Var = (k1x0) ((h9g) tw51Var).v.b0.get();
                q5z.h(k1x0Var);
                return k1x0Var;
            case 27:
                return ((h9g) tw51Var).v.a;
            case 28:
                return new uqa0(((h9g) tw51Var).u());
            default:
                return new if8((b) ((h9g) tw51Var).v.A.get());
        }
    }
}
