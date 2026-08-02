package defpackage;

import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.o;
import com.ybsdk.di.modules.features.qr.a;
import com.ybsdk.network.Api;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class c6g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ c6g(tw51 tw51Var, int i) {
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
                return ((h9g) tw51Var).v.b();
            case 2:
                return ((h9g) tw51Var).o();
            case 3:
                return new a((com.ybsdk.common.repositiories.agreements.a) ((h9g) tw51Var).v.H.get());
            case 4:
                return new b8g0((ab1) ((h9g) tw51Var).v.b1.get());
            case 5:
                return new bg1((gff) ((h9g) tw51Var).v.X.get());
            case 6:
                j3h j3hVar = (j3h) ((h9g) tw51Var).E.get();
                q5z.h(j3hVar);
                return j3hVar;
            case 7:
                return new hf8((bhk) ((h9g) tw51Var).u0.get());
            case 8:
                return new c8g0(((h9g) tw51Var).u());
            case 9:
                return new aye0(4, ((h9g) tw51Var).p());
            case 10:
                h9g h9gVar = (h9g) tw51Var;
                return new e8g0(h9gVar, (b) h9gVar.v.A.get());
            case 11:
                return (p7g0) ((h9g) tw51Var).v0.get();
            case 12:
                return new cwb0(((h9g) tw51Var).c, 1);
            case 13:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 14:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 15:
                return ((h9g) tw51Var).v();
            case 16:
                return ((h9g) tw51Var).o();
            case 17:
                efi0 efi0Var = (efi0) ((h9g) tw51Var).E1.get();
                q5z.h(efi0Var);
                return efi0Var;
            case 18:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 19:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 20:
                tfl0 tfl0Var = (tfl0) ((h9g) tw51Var).S.get();
                q5z.h(tfl0Var);
                return tfl0Var;
            case 21:
                return ((h9g) tw51Var).z();
            case 22:
                h9g h9gVar2 = (h9g) tw51Var;
                yli0 yli0Var = h9gVar2.m;
                x8g x8gVar = h9gVar2.v;
                return new o((f) x8gVar.G.get(), (ppp0) x8gVar.w.get());
            case 23:
                yli0 yli0Var2 = ((h9g) tw51Var).m;
                return new hay(9);
            case 24:
                h9g h9gVar3 = (h9g) tw51Var;
                yli0 yli0Var3 = h9gVar3.m;
                return new sue0(17, (j3h) h9gVar3.E.get());
            case 25:
                h9g h9gVar4 = (h9g) tw51Var;
                yli0 yli0Var4 = h9gVar4.m;
                return new if8((b) h9gVar4.v.A.get());
            case 26:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 27:
                ab1 ab1Var = (ab1) ((h9g) tw51Var).v.b1.get();
                q5z.h(ab1Var);
                return ab1Var;
            case 28:
                com.ybsdk.common.repositiories.agreements.a aVar = (com.ybsdk.common.repositiories.agreements.a) ((h9g) tw51Var).v.H.get();
                q5z.h(aVar);
                return aVar;
            default:
                Api api = (Api) ((h9g) tw51Var).v.t.get();
                q5z.h(api);
                return api;
        }
    }
}
