package defpackage;

import android.content.Context;
import android.location.LocationManager;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.feed_video.domain.manager.b;
import com.yandex.go.permission.location_with_agreement.interactor.e;
import com.yandex.go.taxi.tariffs.repository.d;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.location.lbs.c;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.systemrequeirements.location.m;
import ru.yandex.taxi.zalogin.l;

/* loaded from: classes9.dex */
public final class etx implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ etx(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new dtx((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 1:
                return new evx((g) xvf0Var2.get(), (a) xvf0Var.get());
            case 2:
                return new sxx((pav) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 3:
                return new cyx((tt2) xvf0Var2.get(), (dyx) xvf0Var.get());
            case 4:
                return new c(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 5:
                return new d((on2) xvf0Var.get(), (h) xvf0Var2.get());
            case 6:
                return new eex((Context) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 7:
                Context context = (Context) xvf0Var2.get();
                eyu0 eyu0Var = (eyu0) xvf0Var.get();
                return new avj0(context, eyu0Var.a.a(eyu0Var.b.getThemeType()).b);
            case 8:
                return new za90((Context) xvf0Var2.get(), (eyu0) xvf0Var.get());
            case 9:
                return new tjy((l) xvf0Var2.get(), (g) xvf0Var.get());
            case 10:
                return new eky((dne0) xvf0Var2.get(), (rs2) xvf0Var.get());
            case 11:
                return new hky((ru.yandex.taxi.zalogin.d) xvf0Var2.get(), (fhz) xvf0Var.get());
            case 12:
                return new com.yandex.go.feed_video.presentation.a((k3c) xvf0Var2.get(), (b) xvf0Var.get());
            case 13:
                return new com.yandex.go.feed_video.domain.manager.a((b) xvf0Var2.get(), (tse) xvf0Var.get());
            case 14:
                return new b((FragmentActivity) xvf0Var2.get(), (rs2) xvf0Var.get());
            case 15:
                return new h4z((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 16:
                return new ru.yandex.taxi.masstransit.geopayment.tickets.storage.a((tt2) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.requirements.repository.b((ru.yandex.taxi.requirements.storage.a) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 18:
                return new hzk((LocationManager) xvf0Var2.get(), (k0b0) xvf0Var.get());
            case 19:
                return new o8z((rqo) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.polling.c((rqo) xvf0Var2.get(), (g9z) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.map_common.map.d((el00) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 22:
                return new m(i5m.a(xvf0Var2), (hyn) xvf0Var.get());
            case 23:
                return new com.yandex.go.a((com.yandex.go.g) xvf0Var2.get(), (tse) xvf0Var.get());
            case 24:
                return new com.yandex.go.permission.location_with_agreement.interactor.h((e) xvf0Var2.get(), (lbz) xvf0Var.get());
            case 25:
                return new jhz(i5m.a(xvf0Var2), (ju6) xvf0Var.get());
            case 26:
                return new whz(xvf0Var2, (oep0) xvf0Var.get());
            case 27:
                return new aiz((lhz) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 28:
                return new com.yandex.go.safety.center.lost_item.data.a((on2) xvf0Var2.get(), (dne0) xvf0Var.get());
            default:
                return new com.yandex.go.lottie_loader.data.repositories.a((Context) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }
}
