package defpackage;

import android.content.Context;
import com.yandex.go.account.upgrade.k;
import com.yandex.go.payments.cards.data.j;
import com.yandex.go.payments.data.q;
import com.yandex.go.taxi.tariffs.interactor.b;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.analytics.s;
import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.trains.config.a;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.security.UserConfigRepository;
import ru.yandex.taxi.settings.profile.f;

/* loaded from: classes9.dex */
public final class d701 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ d701(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new kcz0((z501) xvf0Var2.get(), (d) xvf0Var.get());
            case 1:
                return new a((o) xvf0Var2.get(), (be01) xvf0Var.get());
            case 2:
                return new com.yandex.go.preorder.deeplinks.d((vre0) xvf0Var2.get(), (b) xvf0Var.get());
            case 3:
                return new rfw0((c) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 4:
                return new d0((rqo) xvf0Var2.get(), (pdc) xvf0Var.get());
            case 5:
                return new h9p0(1, i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 6:
                return new wc11((xcv0) xvf0Var2.get(), (arv0) xvf0Var.get());
            case 7:
                return new com.yandex.go.ugc.c((fx60) xvf0Var.get(), xvf0Var2);
            case 8:
                return new com.yandex.messaging.activity.b((com.yandex.messaging.profile.d) xvf0Var2.get(), (vse) xvf0Var.get());
            case 9:
                return new com.yandex.go.ultima_mode.action.a((n3h) xvf0Var2.get(), (com.yandex.go.ultima_mode.preferences.a) xvf0Var.get());
            case 10:
                return new com.yandex.go.ultima_mode.domain.c((tv11) xvf0Var2.get(), (com.yandex.go.ultima_mode.preferences.a) xvf0Var.get());
            case 11:
                return new j((cda0) xvf0Var2.get(), (q) xvf0Var.get());
            case 12:
                return new fy11((wnt) xvf0Var2.get(), i5m.a(xvf0Var));
            case 13:
                return new c2n0((i6r) xvf0Var2.get(), (v3u0) xvf0Var.get());
            case 14:
                return new n421((Context) xvf0Var2.get(), (q0k) xvf0Var.get());
            case 15:
                return new a821((o) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.settings.account.c((j20) xvf0Var2.get(), (jm) xvf0Var.get());
            case 17:
                return new j921((jtq0) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 18:
                return new k((j20) xvf0Var2.get(), (jm) xvf0Var.get());
            case 19:
                return new com.yandex.delivery.libs.imageupload.impl.data.a(i5m.a(xvf0Var2), (lc21) xvf0Var.get());
            case 20:
                return new com.yandex.go.urbanads.b((Context) xvf0Var2.get(), (mf21) xvf0Var.get());
            case 21:
                return new mg21((Context) xvf0Var2.get(), (h1h) xvf0Var.get());
            case 22:
                return new tj21((rs2) xvf0Var2.get(), (uj21) xvf0Var.get());
            case 23:
                return new UserConfigRepository((on2) xvf0Var2.get(), (tse) xvf0Var.get());
            case 24:
                return new tm21((Context) xvf0Var2.get(), (k0b0) xvf0Var.get());
            case 25:
                return new s(i5m.a(xvf0Var2), (ru.yandex.taxi.analytics.q) xvf0Var.get());
            case 26:
                return new up21((ijz) xvf0Var2.get(), (wp21) xvf0Var.get());
            case 27:
                return new bs21((sh41) xvf0Var2.get(), (acy0) xvf0Var.get());
            case 28:
                return new f((tt2) xvf0Var.get(), (rqo) xvf0Var2.get());
            default:
                return new ht21(xvf0Var2, (jj3) xvf0Var.get());
        }
    }
}
