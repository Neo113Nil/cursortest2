package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.config.i;
import com.yandex.go.feed_video.presentation.divkit.c;
import com.yandex.go.payments.data.PaymentsApi;
import com.yandex.go.payments.domain.m;
import com.yandex.go.user_profile.fullscreen.models.l;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.analytics.p;
import ru.yandex.taxi.layers.e;
import ru.yandex.taxi.location.lbs.a;
import ru.yandex.taxi.settings.activity.MenuButtonAttachStateChangeListener;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.zalogin.k;

/* loaded from: classes10.dex */
public final class bvx implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ bvx(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                return new h((dne0) xvf0Var3.get(), (b03) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 1:
                return new fwx((b03) xvf0Var2.get(), (wnt) xvf0Var.get(), (dne0) xvf0Var3.get());
            case 2:
                return new a(i5m.a(xvf0Var3), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 3:
                return new p((h630) xvf0Var3.get(), (rqo) xvf0Var2.get(), (k0b0) xvf0Var.get());
            case 4:
                return new com.yandex.go.account.activity.a((tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (k) xvf0Var.get());
            case 5:
                return new uoy((ipy) xvf0Var3.get(), (wnt) xvf0Var2.get(), (xdf) xvf0Var.get());
            case 6:
                return new c((FragmentActivity) xvf0Var3.get(), (com.yandex.go.feed_video.domain.manager.a) xvf0Var2.get(), (xzq0) xvf0Var.get());
            case 7:
                return new ru.yandex.taxi.personalstate.data.local.a((tt2) xvf0Var3.get(), (h4z) xvf0Var2.get(), (ru.yandex.taxi.personalstate.data.remote.a) xvf0Var.get());
            case 8:
                return new x6z((n) xvf0Var3.get(), (g) xvf0Var2.get(), (tse) xvf0Var.get());
            case 9:
                return new i((qcz) xvf0Var3.get(), (rcz) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 10:
                return new v8z((k0b0) xvf0Var3.get(), (n) xvf0Var2.get(), (zz2) xvf0Var.get());
            case 11:
                return new w9z((b) xvf0Var2.get(), (Context) xvf0Var3.get(), (AppAnalyticsReporter) xvf0Var.get());
            case 12:
                return new hnz((qmp) xvf0Var3.get(), (n20) xvf0Var2.get(), (kmz) xvf0Var.get());
            case 13:
                return new m((PaymentsApi) xvf0Var3.get(), (dyz) xvf0Var2.get(), (ayz) xvf0Var.get());
            case 14:
                return new jb7(18, (o8h) xvf0Var3.get(), (qmp) xvf0Var2.get(), (com.yandex.go.payments.experiments.g) xvf0Var.get());
            case 15:
                return new z300(i5m.a(xvf0Var3), xvf0Var2, (oep0) xvf0Var.get());
            case 16:
                return new b400((ly01) xvf0Var2.get(), (pep0) xvf0Var.get());
            case 17:
                return new com.yandex.go.user_profile.main_menu.log_out.domain.c((l) xvf0Var3.get(), (ru.yandex.taxi.am.m) xvf0Var2.get(), (j20) xvf0Var.get());
            case 18:
                return new te61((kf00) xvf0Var3.get(), (ah00) xvf0Var2.get(), ViewConfiguration.get((Activity) xvf0Var.get()));
            case 19:
                return new ru.yandex.taxi.preorder.source.a((ah00) xvf0Var2.get(), (com.yandex.go.pin.api.a) xvf0Var3.get(), (Context) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.map.overlay.pickup.intersections.a((lp00) xvf0Var3.get(), (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var2.get(), (tse) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.map.overlay.pickup.intersections.b((lp00) xvf0Var3.get(), (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var2.get(), (tse) xvf0Var.get());
            case 22:
                return new ok00((com.yandex.go.navigation.screen.c) xvf0Var3.get(), (oc50) xvf0Var2.get(), (lx4) xvf0Var.get());
            case 23:
                return new e((ah00) xvf0Var3.get(), (qwc) xvf0Var2.get(), (po21) xvf0Var.get());
            case 24:
                return new tt00(i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 25:
                return new sy00((ma1) xvf0Var2.get(), (lx4) xvf0Var3.get(), (dne0) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.masstransit.deeplink.a((h010) xvf0Var3.get(), (x111) xvf0Var2.get(), (fx60) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.masstransit.geopayment.b((com.yandex.go.zone.interactors.b) xvf0Var3.get(), (po21) xvf0Var2.get(), (tu30) xvf0Var.get());
            case 28:
                return new MenuButtonAttachStateChangeListener(i5m.a(xvf0Var3), (fc5) xvf0Var2.get(), (hcs) xvf0Var.get());
            default:
                return new cn10((g9a0) xvf0Var3.get(), (com.yandex.go.payments.googlepay.domain.e) xvf0Var2.get(), i5m.a(xvf0Var));
        }
    }
}
