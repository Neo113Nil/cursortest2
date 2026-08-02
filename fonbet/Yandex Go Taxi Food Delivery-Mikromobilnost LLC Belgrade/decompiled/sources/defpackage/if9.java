package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.chargers.multiorder.domain.a;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.i;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.change.requirements.interactor.b;
import com.yandex.go.taxi.order.change.source.interactor.c;
import ru.yandex.taxi.experiments.superapp.j;
import ru.yandex.taxi.logistics.sdk.delivery_launch.domain.DeliveryLaunchLoadingStateRepository;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes8.dex */
public final class if9 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ if9(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new b((Context) xvf0Var4.get(), (tj60) xvf0Var3.get(), (e) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 1:
                return new c((on2) xvf0Var4.get(), (tt2) xvf0Var3.get(), (com.yandex.go.taxi.order.change.source.data.e) xvf0Var2.get(), (vyx0) xvf0Var.get());
            case 2:
                return new a3a((bg5) xvf0Var4.get(), (ysa) xvf0Var3.get(), (com.yandex.go.chargers.data.e) xvf0Var2.get(), (com.yandex.go.chargers.push.domain.c) xvf0Var.get());
            case 3:
                return new zda((tse) xvf0Var4.get(), (g) xvf0Var3.get(), (a) xvf0Var2.get(), (wmh) xvf0Var.get());
            case 4:
                return new ru.yandex.taxi.superapp.chat.view.e((yu41) xvf0Var4.get(), (ru.yandex.taxi.am.token.a) xvf0Var3.get(), (j) xvf0Var2.get(), (j5z) xvf0Var.get());
            case 5:
                return new m7c((x22) xvf0Var4.get(), (com.yandex.messaging.utils.b) xvf0Var3.get(), (lqo) xvf0Var2.get(), (eil0) xvf0Var.get());
            case 6:
                return new com.yandex.go.image.loader.domain.a((Context) xvf0Var4.get(), (tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 7:
                return new i((k0b0) xvf0Var4.get(), (n) xvf0Var3.get(), (x8z) xvf0Var2.get(), (ehe0) xvf0Var.get());
            case 8:
                return new hpc((dqe0) xvf0Var4.get(), (kpi0) xvf0Var3.get(), (ra00) xvf0Var2.get(), xvf0Var);
            case 9:
                return new qwc((SensorManager) xvf0Var4.get(), (tse) xvf0Var3.get(), (LocationManager) xvf0Var2.get(), (k0b0) xvf0Var.get());
            case 10:
                return new xwc((Looper) xvf0Var4.get(), (bwu) xvf0Var3.get(), (qf4) xvf0Var2.get(), (x22) xvf0Var.get());
            case 11:
                return new bue((due) xvf0Var4.get(), (ru.yandex.taxi.settings.email.a) xvf0Var3.get(), (ru.yandex.taxi.am.g) xvf0Var2.get(), (h) xvf0Var.get());
            case 12:
                return new ru.yandex.taxi.deeplinks.e((com.yandex.go.zone.interactors.b) xvf0Var4.get(), (atd0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (po21) xvf0Var.get());
            case 13:
                return new n3h((Context) xvf0Var4.get(), (y72) xvf0Var3.get(), (zh11) xvf0Var2.get(), (v9h) xvf0Var.get());
            case 14:
                return new ru.yandex.taxi.fragment.common.b((tse) xvf0Var4.get(), (y50) xvf0Var3.get(), (ru.yandex.taxi.activity.g) xvf0Var2.get(), (v7j0) xvf0Var.get());
            case 15:
                return new apf((tjt0) xvf0Var4.get(), (dqe0) xvf0Var3.get(), (y9y0) xvf0Var2.get(), (g0j) xvf0Var.get(), 8);
            case 16:
                return new zzh((w030) xvf0Var4.get(), (Context) xvf0Var3.get(), (a3v) xvf0Var2.get(), (ru.yandex.taxi.design.utils.a) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.logistics.sdk.delivery_launch.domain.a((ru.yandex.taxi.logistics.sdk.delivery_launch.data.b) xvf0Var4.get(), (n0i) xvf0Var3.get(), (st2) xvf0Var2.get(), (DeliveryLaunchLoadingStateRepository) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.logistics.dashboard.address.c(xvf0Var4, (ljz) xvf0Var3.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get(), (cyx) xvf0Var.get());
            case 19:
                return new ru.yandex.taxi.logistics.ndd_map.layers.a((rp60) xvf0Var4.get(), (ddi) xvf0Var3.get(), (com.yandex.go.layers.domain.g) xvf0Var2.get(), (uxx) xvf0Var.get());
            case 20:
                return new vhi(i5m.a(xvf0Var4), (u7i) xvf0Var3.get(), (AppVisibilitySubscriptionImpl) xvf0Var2.get(), (st2) xvf0Var.get());
            case 21:
                return new tji((tt2) xvf0Var4.get(), (sdi) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (pav) xvf0Var.get());
            case 22:
                return new zzi((qgu0) xvf0Var4.get(), (xam) xvf0Var3.get(), (tk51) xvf0Var2.get(), (hbm) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.diagnostic.a((Context) xvf0Var4.get(), (tt2) xvf0Var3.get(), (dne0) xvf0Var2.get(), (b03) xvf0Var.get());
            case 24:
                return new qcj((tse) xvf0Var4.get(), (fn21) xvf0Var3.get(), (kb20) xvf0Var2.get(), (ru.yandex.taxi.diagnostic.a) xvf0Var.get());
            case 25:
                return new vdm(xvf0Var4.get(), xvf0Var3.get(), xvf0Var2.get(), xvf0Var.get(), 0);
            case 26:
                return new com.yandex.go.drive.superapp.a((com.yandex.go.drive.sdkintegration.domain.session.e) xvf0Var4.get(), (kfm) xvf0Var3.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 27:
                return new kem((tt2) xvf0Var4.get(), (tse) xvf0Var3.get(), (g) xvf0Var2.get(), (wmh) xvf0Var.get());
            case 28:
                return new apf((ycq0) xvf0Var4.get(), (cda0) xvf0Var3.get(), (xku0) xvf0Var2.get(), (vem) xvf0Var.get(), 27);
            default:
                return new apf((drd) xvf0Var4.get(), (vem) xvf0Var3.get(), (com.yandex.go.payments.paymentlist.domain.i) xvf0Var2.get(), (xku0) xvf0Var.get(), 28);
        }
    }
}
