package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableSet;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.payments.data.PaymentsApi;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.trackid.push.internal.data.a;
import com.ybsdk.feature.trackid.push.internal.network.TrackIdPushApi;
import com.ybsdk.rconfig.b;
import java.util.Set;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.ScootersPhotoApi;

/* loaded from: classes3.dex */
public abstract class p03 implements v7p {
    public static mrj a(Handler handler, h3y h3yVar, wi60 wi60Var) {
        return new mrj(18, handler, h3yVar, wi60Var);
    }

    public static w040 b(Looper looper, qp90 qp90Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, bbj bbjVar, rj21 rj21Var, q6v q6vVar) {
        return new w040(looper, qp90Var, h3yVar, h3yVar2, h3yVar3, bbjVar, rj21Var, q6vVar);
    }

    public static lg60 c(Handler handler, h3y h3yVar) {
        return new lg60(handler, h3yVar);
    }

    public static o03 d(Set set) {
        return new o03(0, set);
    }

    public static jhu0 e(dnp0 dnp0Var) {
        x8g x8gVar = (x8g) dnp0Var;
        t0k0 t0k0Var = (t0k0) x8gVar.s.get();
        q5z.h(t0k0Var);
        a aVar = new a((TrackIdPushApi) t0k0Var.b(TrackIdPushApi.class));
        AppAnalyticsReporter d = x8gVar.d();
        q5z.h(d);
        return new jhu0(new com.ybsdk.feature.trackid.push.internal.a(aVar, new us3(d), new tv3((b) x8gVar.A.get())));
    }

    public static o03 f(s960 s960Var, q960 q960Var) {
        return new o03(1, q960Var);
    }

    public static im90 g(d8b0 d8b0Var, dt20 dt20Var) {
        int i = 15;
        int i2 = 2;
        n3w a = n3w.a(new lm90(new oy80(i2, new c5g(dt20Var, 0), new l180(i5m.b(new f380(new c5g(dt20Var, 3), 16)), i))));
        n3w a2 = n3w.a(new xm90(vm90.a));
        f380 f380Var = new f380(new c5g(dt20Var, i2), i);
        int i3 = 1;
        im90 im90Var = (im90) i5m.b(new k9c(a, a2, n3w.a(new jm90(new at20(f380Var, new c5g(dt20Var, i3)))), i3)).get();
        q5z.i(im90Var);
        return im90Var;
    }

    public static dt20 h(d8b0 d8b0Var, y4a0 y4a0Var, t0k0 t0k0Var, AppAnalyticsReporter appAnalyticsReporter, tv3 tv3Var) {
        return new dt20(y4a0Var, t0k0Var, appAnalyticsReporter, tv3Var, 24);
    }

    public static y4a0 i(d8b0 d8b0Var, a1b0 a1b0Var, di51 di51Var) {
        return new y4a0(a1b0Var, di51Var, false, 6);
    }

    public static zn90 j(DefaultEnvironment defaultEnvironment) {
        int i = jn90.a[defaultEnvironment.ordinal()];
        if (i == 1) {
            return new zn90("2R/lH4fHsM7QXpbphyuK+i/TFnKIGZHtID2HDl46DS0Qc4CqynWeHmbBl79R/EGD", "3kzlTNKS4MnXWZO4hyyN+B+fd0DjFIxqnpx6wxnELdBrUB9yyLb8C1tz9aig0iyb");
        }
        if (i == 2) {
            return new zn90("0RDgH4WTsZ7RDJK5hyqKryO5wojPeu0SUgC4ScEQPCBgFwkxexNx+AxN1W2CivlI", "2UvlSNGXsJjQXca/h3neqTMdCWkx3o+yo+tIq9SBok4sL1gJbz6SBCmhzPFGsCB5");
        }
        w511.b();
        return null;
    }

    public static PaymentsApi k(on2 on2Var) {
        on2Var.getClass();
        PaymentsApi paymentsApi = (PaymentsApi) on2Var.a(GoApiName.TaxiV4, PaymentsApi.class);
        q5z.i(paymentsApi);
        return paymentsApi;
    }

    public static bac0 l(klr klrVar, bac0 bac0Var, bac0 bac0Var2) {
        return klrVar.a() ? bac0Var : bac0Var2;
    }

    public static com.ybsdk.feature.push.api.overrider.a m(Set set) {
        return new com.ybsdk.feature.push.api.overrider.a(set);
    }

    public static com.ybsdk.feature.trackid.push.internal.a n(jhu0 jhu0Var) {
        return (com.ybsdk.feature.trackid.push.internal.a) jhu0Var.a;
    }

    public static v5c0 o(hh51 hh51Var) {
        return new v5c0(15, hh51Var);
    }

    public static tv3 p(d8b0 d8b0Var, b bVar) {
        return new tv3(bVar);
    }

    public static ScootersPhotoApi q(on2 on2Var) {
        on2Var.getClass();
        ScootersPhotoApi scootersPhotoApi = (ScootersPhotoApi) on2Var.a(GoApiName.TaxiV4, ScootersPhotoApi.class);
        q5z.i(scootersPhotoApi);
        return scootersPhotoApi;
    }

    public static h4s0 r(ImmutableSet immutableSet) {
        return new h4s0(immutableSet);
    }

    public static aye0 s(ku11 ku11Var) {
        ((hcg) ku11Var.a.getValue()).getClass();
        return new aye0(5, new wkt());
    }
}
