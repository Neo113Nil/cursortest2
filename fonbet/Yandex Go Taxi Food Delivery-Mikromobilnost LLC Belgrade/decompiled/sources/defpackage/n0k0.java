package defpackage;

import android.content.Context;
import com.yandex.go.account.user_verification.domain.i;
import com.yandex.go.analytics.b;
import com.yandex.go.inapp_calls.navigation.g;
import com.yandex.go.inapp_calls.repository.c;
import com.yandex.go.safety.center.d;
import com.yandex.go.scooters.domain.j0;
import com.yandex.go.scooters.ignition.data.h;
import com.yandex.messaging.internal.net.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.scooters.domain.q;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes.dex */
public final class n0k0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ n0k0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new g((Context) xvf0Var3.get(), (c) xvf0Var2.get(), (njv) xvf0Var.get());
            case 1:
                return new a((xw50) xvf0Var3.get(), (OkHttpClient) xvf0Var2.get(), (kse) xvf0Var.get());
            case 2:
                return new g2k0((tse) xvf0Var3.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var2.get(), (nid) xvf0Var.get());
            case 3:
                return new com.yandex.go.rida.unavailable.ui.a((tt2) xvf0Var3.get(), (e) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 4:
                return new s6k0((y9y0) xvf0Var3.get(), (tjt0) xvf0Var2.get(), (g0j) xvf0Var.get());
            case 5:
                return new ru.yandex.taxi.routestats.a((tt2) xvf0Var3.get(), (p) xvf0Var2.get(), (hit) xvf0Var.get());
            case 6:
                return new nbl0((rqo) xvf0Var3.get(), (hit) xvf0Var2.get(), (b) xvf0Var.get());
            case 7:
                dne0 dne0Var = (dne0) xvf0Var3.get();
                return new com.yandex.go.analytics.rythm.repository.a((tt2) xvf0Var.get(), (wnt) xvf0Var2.get(), dne0Var);
            case 8:
                return new com.yandex.go.safety.center.c((com.yandex.go.lifecycle.a) xvf0Var3.get(), (p2y0) xvf0Var2.get(), xvf0Var);
            case 9:
                return new d((com.yandex.go.lifecycle.a) xvf0Var3.get(), (p2y0) xvf0Var2.get(), xvf0Var);
            case 10:
                return new com.yandex.go.safety.center.safetycenter_web.domain.a((vjr0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 11:
                return new i((rqo) xvf0Var3.get(), (kyl0) xvf0Var2.get(), (cda0) xvf0Var.get());
            case 12:
                return new iom0((zuj0) xvf0Var3.get(), (ole0) xvf0Var2.get(), (j5z) xvf0Var.get());
            case 13:
                return new jom0((iom0) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (nf7) xvf0Var.get());
            case 14:
                return new com.yandex.go.scooters.deeplink.a((com.yandex.go.lifecycle.a) xvf0Var3.get(), i5m.a(xvf0Var2), xvf0Var);
            case 15:
                return new com.yandex.go.scooters.domain.a((ru.yandex.taxi.am.g) xvf0Var3.get(), (vp21) xvf0Var2.get(), (ru.yandex.taxi.launch.c) xvf0Var.get());
            case 16:
                return new v7n0((ah00) xvf0Var3.get(), (tse) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.scooters.domain.e((ru.yandex.taxi.scooters.data.data_source.a) xvf0Var3.get(), (gko0) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.g) xvf0Var.get());
            case 18:
                return new com.yandex.go.scooters.payments.domain.a((po21) xvf0Var3.get(), (ngo0) xvf0Var2.get(), (com.yandex.go.scooters.payments.data.c) xvf0Var.get());
            case 19:
                return new ru.yandex.taxi.scooters.data.mapper.c((tt2) xvf0Var2.get(), (wnt) xvf0Var3.get(), (zuj0) xvf0Var.get());
            case 20:
                return new com.yandex.go.scooters.ignition.data.c((q) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (m2o0) xvf0Var.get());
            case 21:
                return new com.yandex.go.scooters.ignition.data.e(i5m.a(xvf0Var3), (ru.yandex.taxi.scooters.data.a) xvf0Var2.get(), (xuo0) xvf0Var.get());
            case 22:
                return new h((xdf) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (m2o0) xvf0Var.get());
            case 23:
                return new psn0((Context) xvf0Var3.get(), (com.yandex.go.scooters.ignition.analytics.a) xvf0Var2.get(), (vqn0) xvf0Var.get());
            case 24:
                return new nyn0((qr40) xvf0Var3.get(), (ru.yandex.taxi.scooters.data.p) xvf0Var2.get(), (hyn0) xvf0Var.get());
            case 25:
                return new n5o0((jua0) xvf0Var3.get(), (czf0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 26:
                return new j0((Context) xvf0Var3.get(), (tse) xvf0Var2.get(), (qxm0) xvf0Var.get());
            case 27:
                return new olp0((nzi) xvf0Var3.get(), (jgq0) xvf0Var2.get(), (com.yandex.go.route.interactor.c) xvf0Var.get());
            case 28:
                com.ybsdk.rconfig.b bVar = (com.ybsdk.rconfig.b) xvf0Var3.get();
                kg51 kg51Var = (kg51) xvf0Var2.get();
                return new ab1(bVar, kg51Var.q, (AppAnalyticsReporter) xvf0Var.get());
            default:
                return new et90();
        }
    }

    public /* synthetic */ n0k0(epp0 epp0Var, xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
    }
}
