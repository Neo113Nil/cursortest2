package defpackage;

import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.e;
import com.ybsdk.feature.pin.internal.a;
import com.ybsdk.feature.pinstorage.internal.data.c;
import com.ybsdk.network.PciDssApi;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class k6g implements xvf0 {
    public final /* synthetic */ int a;
    public final tw51 b;

    public /* synthetic */ k6g(tw51 tw51Var, int i) {
        this.a = i;
        this.b = tw51Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tw51 tw51Var = this.b;
        switch (i) {
            case 0:
                k03 k03Var = (k03) ((h9g) tw51Var).L.get();
                q5z.h(k03Var);
                return k03Var;
            case 1:
                h9g h9gVar = (h9g) tw51Var;
                fj3 fj3Var = (fj3) h9gVar.v.e.c.invoke(h9gVar);
                q5z.i(fj3Var);
                return fj3Var;
            case 2:
                return ((h9g) tw51Var).v.a;
            case 3:
                f fVar = (f) ((h9g) tw51Var).v.G.get();
                q5z.h(fVar);
                return fVar;
            case 4:
                a3h a3hVar = (a3h) ((h9g) tw51Var).v.T0.get();
                q5z.h(a3hVar);
                return a3hVar;
            case 5:
                j3h h = ((h9g) tw51Var).h();
                q5z.h(h);
                return h;
            case 6:
                DeviceIdProvider deviceIdProvider = (DeviceIdProvider) ((h9g) tw51Var).v.D.get();
                q5z.h(deviceIdProvider);
                return deviceIdProvider;
            case 7:
                return ((h9g) tw51Var).v.e;
            case 8:
                ppp0 ppp0Var = (ppp0) ((h9g) tw51Var).v.w.get();
                q5z.h(ppp0Var);
                return ppp0Var;
            case 9:
                r6a0 r6a0Var = (r6a0) ((h9g) tw51Var).v.Q.get();
                q5z.h(r6a0Var);
                return r6a0Var;
            case 10:
                PciDssApi pciDssApi = (PciDssApi) ((h9g) tw51Var).v.Z1.get();
                q5z.h(pciDssApi);
                return pciDssApi;
            case 11:
                r960 r960Var = (r960) ((h9g) tw51Var).v.Z0.get();
                q5z.h(r960Var);
                return r960Var;
            case 12:
                xra0 xra0Var = (xra0) ((h9g) tw51Var).V.get();
                q5z.h(xra0Var);
                return xra0Var;
            case 13:
                a aVar = (a) ((h9g) tw51Var).O.get();
                q5z.h(aVar);
                return aVar;
            case 14:
                c cVar = (c) ((h9g) tw51Var).v.E.get();
                q5z.h(cVar);
                return cVar;
            case 15:
                return ((h9g) tw51Var).o();
            case 16:
                e eVar = (e) ((h9g) tw51Var).v.n0.get();
                q5z.h(eVar);
                return eVar;
            case 17:
                return ((h9g) tw51Var).u;
            case 18:
                b q = ((h9g) tw51Var).q();
                q5z.h(q);
                return q;
            case 19:
                AppAnalyticsReporter r = ((h9g) tw51Var).r();
                q5z.h(r);
                return r;
            case 20:
                t0k0 s = ((h9g) tw51Var).s();
                q5z.h(s);
                return s;
            case 21:
                tfl0 t = ((h9g) tw51Var).t();
                q5z.h(t);
                return t;
            case 22:
                nvd nvdVar = (nvd) ((h9g) tw51Var).v.Q1.get();
                q5z.h(nvdVar);
                return nvdVar;
            case 23:
                nbp0 nbp0Var = (nbp0) ((h9g) tw51Var).v.u.get();
                q5z.h(nbp0Var);
                return nbp0Var;
            case 24:
                com.ybsdk.utils.smsretriever.a aVar2 = (com.ybsdk.utils.smsretriever.a) ((h9g) tw51Var).v.Y1.get();
                q5z.h(aVar2);
                return aVar2;
            case 25:
                return ((h9g) tw51Var).c;
            case 26:
                np41 np41Var = (np41) ((h9g) tw51Var).M.get();
                q5z.h(np41Var);
                return np41Var;
            case 27:
                return ((h9g) tw51Var).v.a;
            case 28:
                zon zonVar = (zon) ((h9g) tw51Var).m0.get();
                q5z.h(zonVar);
                return zonVar;
            default:
                h9g h9gVar2 = (h9g) tw51Var;
                return new aye0(27, flx0.a(h9gVar2.j, h9gVar2));
        }
    }
}
