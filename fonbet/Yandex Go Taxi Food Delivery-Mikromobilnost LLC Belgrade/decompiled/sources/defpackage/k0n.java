package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.go.explorer.impl.data.repositories.b;
import com.yandex.go.explorer.impl.domain.interactors.a;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.i;
import com.yandex.messaging.internal.r;
import com.yandex.messaging.ui.folders.f;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.d;

/* loaded from: classes15.dex */
public final class k0n implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public k0n(pkr pkrVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 10;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new j0n((dqe0) this.b.get(), (nf7) this.c.get());
            case 1:
                return new fub((dci) this.b.get(), (pv4) this.c.get());
            case 2:
                return new c((dci) this.b.get(), (o8j) this.c.get());
            case 3:
                return new d((dci) this.b.get(), (isy) this.c.get());
            case 4:
                return new fub((dci) this.b.get(), (jfe0) this.c.get());
            case 5:
                return new n3o((y9y0) this.b.get(), (tft0) this.c.get());
            case 6:
                return new a((b) this.b.get(), (rto) this.c.get());
            case 7:
                return new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.b(i5m.a(this.b), (st2) this.c.get());
            case 8:
                return new ezq((sfl0) this.b.get(), (zg10) this.c.get());
            case 9:
                return new kzq((Context) this.b.get(), (ras0) this.c.get());
            case 10:
                rwo rwoVar = (rwo) this.b.get();
                pcy pcyVar = (pcy) this.c.get();
                OkHttpClient.a aVar = new OkHttpClient.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVar.b(30L, timeUnit);
                aVar.g(30L, timeUnit);
                aVar.i(30L);
                aVar.c.add(new okr(rwoVar));
                if (pcyVar.a.getIsDebug()) {
                    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(0);
                    httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.BODY;
                    aVar.a(httpLoggingInterceptor);
                }
                return new com.yandex.payment.sdk.network.a(new OkHttpClient(aVar));
            case 11:
                return new f((o7t) this.b.get(), (p7t) this.c.get());
            case 12:
                return new u1n(22, (jwh) this.b.get(), (mv8) this.c.get());
            case 13:
                return new zrm(23, (m6s) this.b.get(), (l6s) this.c.get());
            case 14:
                return new t6s((o5s) this.b.get(), (b6s) this.c.get());
            case 15:
                return new cu8((f4l0) this.b.get(), (st2) this.c.get());
            case 16:
                return new rgs((vif) this.b.get(), (PayEnvironment) this.c.get());
            case 17:
                return new com.yandex.messaging.internal.team.gaps.b((to3) this.b.get(), (MessengerEnvironment) this.c.get());
            case 18:
                return new gws((com.yandex.go.navigator.gas_stations.repositories.c) this.b.get(), (com.yandex.go.navigator.gas_stations.b) this.c.get());
            case 19:
                return new ows((qb60) this.b.get(), (sws) this.c.get());
            case 20:
                return new com.yandex.messaging.domain.d((kse) this.c.get(), (com.yandex.messaging.internal.authorized.chat.b) this.b.get());
            case 21:
                return new u4t((kse) this.c.get(), (com.yandex.messaging.internal.authorized.chat.b) this.b.get());
            case 22:
                return new zx6((h9b) this.b.get(), (kse) this.c.get());
            case 23:
                return new x4t((kse) this.c.get(), (p4t) this.b.get());
            case 24:
                return new y4t((kse) this.c.get(), (p4t) this.b.get());
            case 25:
                return new w6t((Activity) this.b.get(), (otx) this.c.get());
            case 26:
                return new y6t((Activity) this.b.get(), (i) this.c.get());
            case 27:
                return new b7t((kse) this.b.get(), (j) this.c.get());
            case 28:
                return new v8t((kse) this.c.get(), (com.yandex.messaging.internal.authorized.chat.b) this.b.get());
            default:
                return new r((kse) this.c.get(), (com.yandex.messaging.internal.authorized.chat.b) this.b.get());
        }
    }

    public /* synthetic */ k0n(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
