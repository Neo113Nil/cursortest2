package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.data.q;
import com.yandex.go.scooters.domain.p;
import com.yandex.go.summary.branding_pin.i;
import com.yandex.go.taxi.order.change.driver.d;
import com.yandex.go.zone.interactors.b;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.main.map.autofs.g;
import ru.yandex.taxi.persuggest.repository.a;
import ru.yandex.taxi.superapp.f;
import ru.yandex.taxi.systemrequeirements.location.l;

/* loaded from: classes9.dex */
public final class fr3 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ fr3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                return new g((ir3) xvf0Var3.get(), (n20) xvf0Var2.get(), (p) xvf0Var.get());
            case 1:
                return new ir3((ky2) xvf0Var3.get(), (cr3) xvf0Var2.get(), (a) xvf0Var.get());
            case 2:
                return new ru.yandex.taxi.location.autolocation.a((po21) xvf0Var3.get(), (kr0) xvf0Var2.get(), (l) xvf0Var.get());
            case 3:
                return new ru.yandex.taxi.analytics.autologging.a((Lifecycle) xvf0Var3.get(), (tse) xvf0Var2.get(), (t94) xvf0Var.get());
            case 4:
                return new db4((ab4) xvf0Var2.get(), i5m.a(xvf0Var));
            case 5:
                return new hf4((Lifecycle) xvf0Var3.get(), xvf0Var2, (kf4) xvf0Var.get());
            case 6:
                return new com.yandex.go.benefits_center.data.a((b) xvf0Var3.get(), (po21) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 7:
                return new com.yandex.go.cryptosdk.a((u02) xvf0Var3.get(), (ip90) xvf0Var2.get(), (m) xvf0Var.get());
            case 8:
                return new i((wiq0) xvf0Var3.get(), (f1c0) xvf0Var2.get(), (xdf) xvf0Var.get());
            case 9:
                return new er6((Activity) xvf0Var3.get(), (w030) xvf0Var2.get(), i5m.a(xvf0Var));
            case 10:
                return new gr6(xvf0Var3, (i130) xvf0Var2.get(), (Activity) xvf0Var.get());
            case 11:
                return new zx6((kse) xvf0Var3.get(), (el21) xvf0Var2.get(), (com.yandex.messaging.chat.b) xvf0Var.get());
            case 12:
                return new ru.yandex.taxi.preorder.source.userposition.repository.a((dne0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ccz) xvf0Var.get());
            case 13:
                return new com.yandex.go.taxi.order.cache.domain.a((com.yandex.go.taxi.order.cache.data.b) xvf0Var3.get(), (tse) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 14:
                return new aj7((Activity) xvf0Var3.get(), (v7j0) xvf0Var2.get(), (ney) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.logistics.care.impl.auth.a((f) xvf0Var3.get(), (jj3) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 16:
                return new zsa((zuj0) xvf0Var3.get(), (vp21) xvf0Var2.get(), xvf0Var);
            case 17:
                return new com.yandex.go.payments.delivery.domain.a((qw6) xvf0Var.get(), (rqo) xvf0Var3.get(), (fvt) xvf0Var2.get());
            case 18:
                return new wz8((uz8) xvf0Var3.get(), (ru.yandex.taxi.preorder.source.cars.a) xvf0Var2.get(), (pav) xvf0Var.get());
            case 19:
                return new d((on2) xvf0Var3.get(), (uk70) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 20:
                return new uv6((Context) xvf0Var3.get(), (w030) xvf0Var2.get(), (ycq0) xvf0Var.get());
            case 21:
                return new lh9((gmr) xvf0Var3.get(), (Context) xvf0Var2.get(), (pat) xvf0Var.get());
            case 22:
                return new com.yandex.go.chargers.order.domain.g((tt2) xvf0Var3.get(), (ky11) xvf0Var2.get(), (iy11) xvf0Var.get());
            case 23:
                return new dm9((ma1) xvf0Var2.get(), (lx4) xvf0Var3.get(), (dne0) xvf0Var.get());
            case 24:
                return new com.yandex.go.chargers.data.f((vp21) xvf0Var3.get(), (po21) xvf0Var2.get(), (kb20) xvf0Var.get());
            case 25:
                return new com.yandex.go.chargers.deeplink.a((com.yandex.go.lifecycle.a) xvf0Var3.get(), i5m.a(xvf0Var2), xvf0Var);
            case 26:
                return new com.yandex.go.chargers.domain.a((ru.yandex.taxi.am.g) xvf0Var3.get(), (vp21) xvf0Var2.get(), (c) xvf0Var.get());
            case 27:
                return new j6a((pav) xvf0Var2.get(), (tj60) xvf0Var.get(), (Context) xvf0Var3.get());
            case 28:
                return new q((ky11) xvf0Var3.get(), (iy11) xvf0Var2.get(), (e) xvf0Var.get());
            default:
                return new cxq0((b03) xvf0Var3.get(), (wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
        }
    }
}
