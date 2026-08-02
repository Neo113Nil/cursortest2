package defpackage;

import com.squareup.moshi.Moshi;
import com.ybsdk.adapters.passportsdk.impl.a;
import com.ybsdk.common.domain.d;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.p;
import com.ybsdk.di.modules.features.q;
import com.ybsdk.di.modules.g;

/* loaded from: classes3.dex */
public final class g7g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ g7g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                return ((h9g) tw51Var).v.b();
            case 1:
                fdm0 fdm0Var = (fdm0) ((h9g) tw51Var).K0.get();
                q5z.h(fdm0Var);
                return fdm0Var;
            case 2:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new p((f) x8gVar.G.get(), (a) x8gVar.v.get());
            case 3:
                return ((h9g) tw51Var).o();
            case 4:
                ut51 ut51Var = (ut51) ((h9g) tw51Var).v.W0.get();
                q5z.h(ut51Var);
                return ut51Var;
            case 5:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 6:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 7:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 8:
                return new npk((gff) ((h9g) tw51Var).v.X.get());
            case 9:
                ucm0 ucm0Var = (ucm0) ((h9g) tw51Var).L0.get();
                q5z.h(ucm0Var);
                return ucm0Var;
            case 10:
                return new g5((j3h) ((h9g) tw51Var).E.get());
            case 11:
                return new vcm0(((h9g) tw51Var).u());
            case 12:
                x8g x8gVar2 = ((h9g) tw51Var).v;
                return new cab0((Moshi) x8gVar2.k.get(), (a1b0) x8gVar2.n.get(), new g((ppp0) x8gVar2.w.get(), (di51) x8gVar2.l.get()), 1);
            case 13:
                mdm0 mdm0Var = (mdm0) ((h9g) tw51Var).J0.get();
                q5z.h(mdm0Var);
                return mdm0Var;
            case 14:
                return new g5((j3h) ((h9g) tw51Var).E.get());
            case 15:
                return new wcm0((com.ybsdk.screens.registration.a) ((h9g) tw51Var).R.get());
            case 16:
                nbp0 nbp0Var = (nbp0) ((h9g) tw51Var).v.u.get();
                q5z.h(nbp0Var);
                return nbp0Var;
            case 17:
                return ((h9g) tw51Var).v();
            case 18:
                return ((h9g) tw51Var).x();
            case 19:
                return new q(new d((com.ybsdk.common.repositiories.supportchat.a) ((h9g) tw51Var).v.S1.get()));
            case 20:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 21:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 22:
                tfl0 t2 = ((h9g) tw51Var).t();
                q5z.h(t2);
                return t2;
            case 23:
                return ((h9g) tw51Var).x();
            case 24:
                h9g h9gVar = (h9g) tw51Var;
                ihm0 ihm0Var = h9gVar.r;
                return new vfc0(27, (np41) h9gVar.M.get());
            case 25:
                return ((h9g) tw51Var).v.a;
            case 26:
                return null;
            case 27:
                x8g x8gVar3 = ((h9g) tw51Var).v;
                return new krl0((wt51) x8gVar3.W.get(), x8gVar3.c);
            case 28:
                t0k0 s3 = ((h9g) tw51Var).s();
                q5z.h(s3);
                return s3;
            default:
                tfl0 t3 = ((h9g) tw51Var).t();
                q5z.h(t3);
                return t3;
        }
    }
}
