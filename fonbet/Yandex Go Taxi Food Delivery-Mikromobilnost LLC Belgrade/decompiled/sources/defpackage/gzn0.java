package defpackage;

import android.content.Context;
import com.yandex.go.scooters.data.g;
import com.yandex.go.scooters.domain.z;
import com.yandex.go.scooters.mosru.data.b;
import com.yandex.go.scooters.mosru.domain.a;
import com.yandex.go.scooters.newbie.f;
import com.yandex.go.scooters.offers.v2.domain.h;
import com.yandex.go.scooters.passes.data.ScootersPassesListApi;
import com.yandex.go.scooters.passes.v2.e;
import com.yandex.go.scooters.payments.data.c;
import com.yandex.go.scooters.qr.data.ScootersScooterAvailabilityApi;
import com.yandex.go.scooters.subscription.data.ScootersSubscriptionPurchaseApi;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;
import com.ybsdk.network.Api;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.scooters.data.ScootersPhotoLocationRepository;
import ru.yandex.taxi.scooters.data.a0;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.data.w;
import ru.yandex.taxi.scooters.data.y;
import ru.yandex.taxi.scooters.domain.d;
import ru.yandex.taxi.scooters.domain.m;
import ru.yandex.taxi.scooters.domain.p;

/* loaded from: classes13.dex */
public final class gzn0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ gzn0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        switch (i) {
            case 0:
                return new a((com.yandex.go.scooters.mosru.data.a) xvf0Var.get(), (o) ((e7g) xvf0Var3).get(), (b) ((bwn0) xvf0Var2).get());
            case 1:
                return new f((qxm0) xvf0Var.get(), (qwo0) xvf0Var3.get(), (u1o0) ((bwn0) xvf0Var2).get());
            case 2:
                return new h((pwy0) xvf0Var.get(), (com.yandex.go.scooters.offers.v2.domain.mapper.b) ((wun0) xvf0Var3).get(), (z2o0) xvf0Var2.get());
            case 3:
                return new m((d) ((s3f0) xvf0Var3).get(), (nqm0) xvf0Var.get(), (y) xvf0Var2.get());
            case 4:
                return new fco0((Context) xvf0Var.get(), (qwo0) xvf0Var3.get(), (nbo0) ((mbo0) xvf0Var2).get());
            case 5:
                return new g((com.yandex.go.scooters.data.mapper.d) ((m580) xvf0Var3).get(), (ScootersPassesListApi) ((m7g) xvf0Var2).get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 6:
                return new e((zuj0) ((l7g) xvf0Var3).get(), (q3p0) xvf0Var.get(), (f3p0) ((ivo0) xvf0Var2).get());
            case 7:
                return new com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.g((n6n0) xvf0Var.get(), (c) xvf0Var3.get(), (com.yandex.go.scooters.offers.v2.components.bottom.data.a) ((bwn0) xvf0Var2).get());
            case 8:
                return new com.yandex.go.scooters.domain.lifecycle.a((tse) ((j7g) xvf0Var).get(), (tt2) ((e7g) xvf0Var3).get(), (com.yandex.go.scooters.payments.domain.a) ((l7g) xvf0Var2).get());
            case 9:
                return new uv6((Context) xvf0Var.get(), (w030) xvf0Var3.get(), (yjo0) ((mbo0) xvf0Var2).get());
            case 10:
                return new w((Context) xvf0Var.get(), (vtx0) ((e7g) xvf0Var3).get(), (ScootersPhotoLocationRepository) xvf0Var2.get());
            case 11:
                return new z((jyx) ((j7g) xvf0Var).get(), (tyx) ((k7g) xvf0Var3).get(), (a22) ((mbo0) xvf0Var2).get());
            case 12:
                return new cso0((o08) xvf0Var3, (ru.yandex.taxi.scooters.data.h) xvf0Var.get(), (p8k0) xvf0Var2);
            case 13:
                return new com.yandex.go.scooters.qr.data.a((ru.yandex.taxi.scooters.data.a) xvf0Var.get(), (ScootersScooterAvailabilityApi) xvf0Var3.get(), (com.yandex.go.scooters.qr.data.mapper.a) ((oto0) xvf0Var2).get());
            case 14:
                return new p((ru.yandex.taxi.scooters.data.z) xvf0Var.get(), (u) xvf0Var3.get(), (a0) ((oto0) xvf0Var2).get());
            case 15:
                return new com.yandex.go.scooters.subscription.data.a((ru.yandex.taxi.scooters.data.a) xvf0Var.get(), (ScootersSubscriptionPurchaseApi) ((z1n0) xvf0Var3).get(), (com.yandex.go.scooters.subscription.data.mapper.b) ((elo0) xvf0Var2).get());
            case 16:
                return new com.yandex.go.scooters.subscription.domain.a((com.yandex.go.scooters.payments.domain.a) xvf0Var.get(), (com.yandex.go.scooters.subscription.data.c) ((gzn0) xvf0Var3).get(), (com.yandex.go.scooters.subscription.data.b) xvf0Var2.get());
            case 17:
                return new com.yandex.go.scooters.subscription.data.c((ru.yandex.taxi.scooters.data.a) xvf0Var.get(), (ScootersSubscriptionPurchaseApi) xvf0Var3.get(), (com.yandex.go.scooters.subscription.data.mapper.c) ((oto0) xvf0Var2).get());
            case 18:
                return new ej1(18, (w030) xvf0Var.get(), (MapNotificationsMuteRepository) xvf0Var3.get(), (cjm0) ((elo0) xvf0Var2).get());
            case 19:
                return new com.yandex.go.scooters.offers.v2.components.tariffs.ui.b((Context) xvf0Var.get(), (krl0) ((oto0) xvf0Var3).get(), (t5p0) ((nln0) xvf0Var2).get());
            case 20:
                return new com.yandex.go.scooters.misc.web.a((w030) xvf0Var.get(), (y8p0) ((n3w) xvf0Var3).a, (m7g) xvf0Var2);
            case 21:
                Api api = (Api) xvf0Var.get();
                nbp0 nbp0Var = (nbp0) xvf0Var3.get();
                return new com.ybsdk.common.repositiories.applications.b(api, nbp0Var.b, (com.ybsdk.utils.poller.b) ((u800) xvf0Var2).get());
            case 22:
                return new com.yandex.go.places.impl.ui.search.a((atd0) xvf0Var.get(), (com.yandex.go.route.interactor.b) xvf0Var3.get(), (com.yandex.go.zone.interactors.b) ((x4g) xvf0Var2).get());
            case 23:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.b((p6s) ((p1g) xvf0Var).get(), (hwy0) ((gxf) xvf0Var3).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.a) ((kze) xvf0Var2).get());
            case 24:
                return new com.ybsdk.feature.settings.internal.domain.security.a((nw70) ((o9g) xvf0Var).get(), (x7r0) ((o9g) xvf0Var3).get(), (if8) ((o9g) xvf0Var2).get());
            case 25:
                return new bkv(2, (i130) xvf0Var.get(), (Context) xvf0Var3.get(), (vpw0) ((m5v0) xvf0Var2).get());
            case 26:
                return new com.yandex.go.morphlex.action.route_address.e((com.yandex.go.route.interactor.b) ((m3g) xvf0Var).get(), (kpi0) ((m3g) xvf0Var3).get(), (com.yandex.go.zone.repository.o) ((r3g) xvf0Var2).get());
            case 27:
                return new SettingsFragment((rer0) ((n3w) xvf0Var).a, (gyp0) ((o9g) xvf0Var3).get(), (com.ybsdk.feature.settings.internal.view.b) ((zmm0) xvf0Var2).get());
            case 28:
                return new com.yandex.go.navigator.share.experiment.c((zuj0) ((l4g) xvf0Var3).get(), (re50) ((j4g) xvf0Var2).get(), (rqo) xvf0Var.get());
            default:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.c(i5m.a((eqh) xvf0Var3), (p070) ((lq40) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a) xvf0Var.get());
        }
    }

    public /* synthetic */ gzn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ gzn0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
    }
}
