package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.taxi.tariffs.interactor.g;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.linked_order.a;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.map.overlay.b;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes9.dex */
public final class o10 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ o10(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
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
                return new n10((Lifecycle) xvf0Var4.get(), xvf0Var3, (a) xvf0Var2.get(), (oep0) xvf0Var.get());
            case 1:
                return new com.yandex.go.payments.deeplink.a((com.yandex.go.lifecycle.a) xvf0Var4.get(), xvf0Var3, (hb0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 2:
                return new ry0((b) xvf0Var4.get(), (y46) xvf0Var3.get(), (g21) xvf0Var2.get(), (et00) xvf0Var.get());
            case 3:
                return new ha1((zuj0) xvf0Var4.get(), (lx4) xvf0Var3.get(), (q0h) xvf0Var2.get(), (qqc) xvf0Var.get());
            case 4:
                return new sd1((lx4) xvf0Var4.get(), (kf00) xvf0Var3.get(), (dyx) xvf0Var2.get(), (nmx) xvf0Var.get());
            case 5:
                return new cxq0((jfb) xvf0Var4.get(), (ri1) xvf0Var3.get(), (jtq0) xvf0Var2.get(), (yqg) xvf0Var.get(), 3);
            case 6:
                return new ru.yandex.taxi.altpins.source.modal.a((nx1) xvf0Var4.get(), (irs0) xvf0Var3.get(), (pdc) xvf0Var2.get(), (c) xvf0Var.get());
            case 7:
                return new iz1((mf00) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var2.get(), (c4r0) xvf0Var.get(), 0);
            case 8:
                return new k((dne0) xvf0Var4.get(), (tt2) xvf0Var3.get(), (zl60) xvf0Var2.get(), (ru11) xvf0Var.get());
            case 9:
                return new uk51((r8o) xvf0Var4.get(), (fkh) xvf0Var3.get(), (pm51) xvf0Var2.get(), (a731) xvf0Var.get());
            case 10:
                Context context = (Context) xvf0Var4.get();
                kb20 kb20Var = (kb20) xvf0Var3.get();
                return new pm51(context, context.getPackageName(), new pt51(2, kb20Var), new d9(13, (jtq0) xvf0Var.get()), (ktq0) xvf0Var2.get());
            case 11:
                return new com.yandex.go.payments.delayed.a((k0) xvf0Var4.get(), (com.yandex.go.payments.summary.domain.a) xvf0Var3.get(), (i0) xvf0Var2.get(), (lw90) xvf0Var.get());
            case 12:
                return new c33((ycq0) xvf0Var4.get(), (fga0) xvf0Var3.get(), (xma0) xvf0Var2.get(), (i) xvf0Var.get());
            case 13:
                return new g((tt2) xvf0Var4.get(), (com.yandex.go.zone.interactors.b) xvf0Var3.get(), (po21) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 14:
                return new cxq0(i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var), 4);
            case 15:
                return new h15((zuj0) xvf0Var4.get(), (as21) xvf0Var3.get(), (h) xvf0Var2.get(), (lsq) xvf0Var.get());
            case 16:
                return new com.yandex.go.beginners.domain.interactor.b((ru.yandex.taxi.am.g) xvf0Var4.get(), (bk1) xvf0Var3.get(), (rqo) xvf0Var2.get(), (j5z) xvf0Var.get());
            case 17:
                return new com.yandex.go.superapp.biometrics.domain.b((com.yandex.go.ble.domain.a) xvf0Var4.get(), (y16) xvf0Var3.get(), (yy5) xvf0Var2.get(), (com.yandex.go.superapp.biometrics.data.a) xvf0Var.get());
            case 18:
                return new b((ah00) xvf0Var4.get(), (tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (et00) xvf0Var.get());
            case 19:
                return new com.yandex.go.payments.shared.a((vnr0) xvf0Var4.get(), (tt2) xvf0Var3.get(), (cw6) xvf0Var2.get(), (tse) xvf0Var.get());
            case 20:
                com.yandex.go.payments.shared.business.c cVar = (com.yandex.go.payments.shared.business.c) xvf0Var4.get();
                return new com.yandex.go.payments.shared.business.onboarding.a(cVar, (o3h) xvf0Var2.get(), (fw6) xvf0Var.get());
            case 21:
                return new sw6((com.yandex.go.payments.shared.business.c) xvf0Var4.get(), (fw6) xvf0Var3.get(), (cpr0) xvf0Var2.get(), (com.yandex.go.payments.shared.g) xvf0Var.get());
            case 22:
                return new sb7((Looper) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 23:
                return new ru.yandex.taxi.logistics.sdk.delivery.cancel.domain.b(i5m.a(xvf0Var4), (u7i) xvf0Var3.get(), (AppVisibilitySubscriptionImpl) xvf0Var2.get(), (st2) xvf0Var.get());
            case 24:
                return new m2v((xdf) xvf0Var4.get(), (w030) xvf0Var3.get(), (mxf0) xvf0Var2.get(), (gf41) xvf0Var.get());
            case 25:
                return new d49((cda0) xvf0Var4.get(), (u500) xvf0Var3.get(), (a29) xvf0Var2.get(), (ru.yandex.taxi.cashback.international.c) xvf0Var.get());
            case 26:
                return new k49((bxx0) xvf0Var4.get(), (tj60) xvf0Var3.get(), (tj60) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 27:
                return new n99((nft) xvf0Var4.get(), (w5t) xvf0Var3.get(), (lwi) xvf0Var2.get(), (j3u) xvf0Var.get());
            case 28:
                return new com.yandex.go.taxi.order.change.destination.a((Context) xvf0Var4.get(), (tj60) xvf0Var3.get(), (e) xvf0Var2.get(), (tt2) xvf0Var.get());
            default:
                return new com.yandex.go.taxi.order.change.driver.c((Context) xvf0Var4.get(), (tj60) xvf0Var3.get(), (e) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }
}
