package defpackage;

import com.squareup.moshi.Moshi;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.pin.a;
import com.ybsdk.di.modules.g;
import com.ybsdk.feature.pinstorage.internal.data.c;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class l5g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ l5g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                return ((h9g) tw51Var).o();
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
                return ((h9g) tw51Var).v.a;
            case 5:
                wop0 wop0Var = (wop0) ((h9g) tw51Var).v.r0.get();
                q5z.h(wop0Var);
                return wop0Var;
            case 6:
                return ((h9g) tw51Var).v.b();
            case 7:
                return new nw70(15, ((h9g) tw51Var).u());
            case 8:
                x8g x8gVar = ((h9g) tw51Var).v;
                return new cab0((Moshi) x8gVar.k.get(), (a1b0) x8gVar.n.get(), new g((ppp0) x8gVar.w.get(), (di51) x8gVar.l.get()), 0);
            case 9:
                return new bab0((b) ((h9g) tw51Var).v.A.get());
            case 10:
                h9g h9gVar = (h9g) tw51Var;
                return new oy80(10, (j3h) h9gVar.E.get(), (np41) h9gVar.M.get());
            case 11:
                AppAnalyticsReporter r2 = ((h9g) tw51Var).r();
                q5z.h(r2);
                return r2;
            case 12:
                t0k0 s2 = ((h9g) tw51Var).s();
                q5z.h(s2);
                return s2;
            case 13:
                xls0 xls0Var = (xls0) ((h9g) tw51Var).F0.get();
                q5z.h(xls0Var);
                return xls0Var;
            case 14:
                return ((h9g) tw51Var).y();
            case 15:
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) ((h9g) tw51Var).v.q.get();
                q5z.h(appAnalyticsReporter);
                return appAnalyticsReporter;
            case 16:
                h9g h9gVar2 = (h9g) tw51Var;
                fj3 fj3Var = (fj3) h9gVar2.v.e.c.invoke(h9gVar2);
                q5z.i(fj3Var);
                return fj3Var;
            case 17:
                return ((h9g) tw51Var).v.a;
            case 18:
                return new lz70(26, ((h9g) tw51Var).E);
            case 19:
                return new lz70(29, ((h9g) tw51Var).v.e);
            case 20:
                return new zvb0(((h9g) tw51Var).l());
            case 21:
                return new ff8((qa60) ((h9g) tw51Var).c0.get());
            case 22:
                return new lz70(25, (hyb0) ((h9g) tw51Var).v.N1.get());
            case 23:
                return new nw70(17, (com.ybsdk.core.common.data.cache.b) ((h9g) tw51Var).B.get());
            case 24:
                return new dxf0((DeviceIdProvider) ((h9g) tw51Var).v.D.get());
            case 25:
                return new cwb0(((h9g) tw51Var).c, 0);
            case 26:
                return new bwb0((b) ((h9g) tw51Var).v.A.get());
            case 27:
                h9g h9gVar3 = (h9g) tw51Var;
                x8g x8gVar2 = h9gVar3.v;
                ppp0 ppp0Var = (ppp0) x8gVar2.w.get();
                return new a(h9gVar3.c, (f) x8gVar2.G.get(), ppp0Var);
            case 28:
                c cVar = (c) ((h9g) tw51Var).v.E.get();
                q5z.h(cVar);
                return cVar;
            default:
                return new yj70((com.ybsdk.common.repositiories.auth.g) ((h9g) tw51Var).v.V.get());
        }
    }
}
