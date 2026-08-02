package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.address.address_map_picker.domain.c;
import com.yandex.go.address.address_map_picker.domain.e;
import com.yandex.go.address.address_map_picker.pin.g;
import com.yandex.go.payments.acceptance.navigation.a;
import com.yandex.go.user_profile.ui.am.h;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.network.Api;
import ru.yandex.taxi.am.internal.d;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.deeplinks.b;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes8.dex */
public final class oe implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ oe(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                return new a((okv) xvf0Var3.get(), (qe) xvf0Var2.get(), (ff) xvf0Var.get());
            case 1:
                return new com.yandex.go.safety.center.a((com.yandex.go.lifecycle.a) xvf0Var3.get(), (p2y0) xvf0Var2.get(), xvf0Var);
            case 2:
                return new ru.yandex.taxi.am.internal.a((k) xvf0Var3.get(), (d) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 3:
                return new i00((Looper) xvf0Var3.get(), (el21) xvf0Var2.get(), (wff0) xvf0Var.get());
            case 4:
                return new com.yandex.go.broadcast.a((Context) xvf0Var3.get(), (tse) xvf0Var2.get(), (wfi0) xvf0Var.get());
            case 5:
                return new ru.yandex.taxi.router.a((com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var3.get(), (b) xvf0Var2.get(), xvf0Var);
            case 6:
                return new com.yandex.messaging.internal.search.domain.a((wjt) xvf0Var3.get(), (w5t) xvf0Var2.get(), (kse) xvf0Var.get());
            case 7:
                return new ru.yandex.taxi.search.a((Context) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) xvf0Var.get());
            case 8:
                return new e((ah00) xvf0Var3.get(), (c) xvf0Var2.get(), (i) xvf0Var.get());
            case 9:
                return new g((r0c0) xvf0Var3.get(), (AddressMapPickerAddressStateRepository) xvf0Var2.get(), (vtb0) xvf0Var.get());
            case 10:
                return new w71((x51) xvf0Var3.get(), (hjs) xvf0Var2.get(), (hnb0) xvf0Var.get());
            case 11:
                return new r91((lx4) xvf0Var3.get(), (czf0) xvf0Var2.get(), (jua0) xvf0Var.get());
            case 12:
                return new ru.yandex.taxi.analytics.referrer.b((as21) xvf0Var3.get(), (noi0) xvf0Var2.get(), (ru.yandex.taxi.analytics.referrer.c) xvf0Var.get());
            case 13:
                return new com.yandex.go.agreement.interactor.a((zj1) xvf0Var3.get(), (of) xvf0Var2.get(), (com.yandex.go.agreement.trackable.repository.b) xvf0Var.get());
            case 14:
                return new com.ybsdk.common.repositiories.agreements.a((Api) xvf0Var3.get(), (com.ybsdk.rconfig.b) xvf0Var2.get(), (f) xvf0Var.get());
            case 15:
                return new iw1((dqe0) xvf0Var3.get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var2.get(), (sw1) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.altpins.order.i((tt2) xvf0Var3.get(), (ysg) xvf0Var2.get(), (n20) xvf0Var.get());
            case 17:
                return new tz1((pdc) xvf0Var2.get(), (zuj0) xvf0Var.get(), (Context) xvf0Var3.get());
            case 18:
                zuj0 zuj0Var = (zuj0) xvf0Var3.get();
                return new h((tt2) xvf0Var.get(), (wnt) xvf0Var2.get(), zuj0Var);
            case 19:
                return new com.yandex.go.antirobot.a((com.yandex.go.antirobot.c) xvf0Var3.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 20:
                return new g9y0((h7u0) xvf0Var.get());
            case 21:
                return new cay0((hit) xvf0Var3.get(), (p3h) xvf0Var2.get(), (xzq0) xvf0Var.get());
            case 22:
                return ((lt2) xvf0Var3.get()).h((zuj0) xvf0Var2.get(), (oz01) xvf0Var.get());
            case 23:
                return ((lt2) xvf0Var3.get()).k((ju6) xvf0Var2.get(), (ko21) xvf0Var.get());
            case 24:
                lt2 lt2Var = (lt2) xvf0Var3.get();
                Context context = (Context) xvf0Var2.get();
                dne0 dne0Var = (dne0) xvf0Var.get();
                lt2Var.getClass();
                am2 am2Var = new am2();
                am2Var.a = context;
                am2Var.b = dne0Var.a("ru.yandex.taxi.map_common.PREFERENCES");
                am2Var.c = dne0Var.a("ru.yandex.taxi.map_common.MAP_STYLES_DARK");
                return am2Var;
            case 25:
                lt2 lt2Var2 = (lt2) xvf0Var3.get();
                Context context2 = (Context) xvf0Var2.get();
                ((rs2) xvf0Var.get()).getClass();
                return lt2Var2.o(context2, "5.89.0", "128354");
            case 26:
                return new com.yandex.messaging.utils.b((Context) xvf0Var3.get(), (vse) xvf0Var2.get(), (kse) xvf0Var.get());
            case 27:
                return new am2((acz) xvf0Var3.get(), (ru.yandex.taxi.maas.impl.ride.c) xvf0Var2.get(), (dhe0) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.startup.launch.a((ru.yandex.taxi.am.token.a) xvf0Var3.get(), (t36) xvf0Var2.get(), (i38) xvf0Var.get());
            default:
                return new com.ybsdk.common.repositiories.auth.b((ppp0) xvf0Var3.get(), (w4o) xvf0Var2.get(), (gff) xvf0Var.get());
        }
    }
}
