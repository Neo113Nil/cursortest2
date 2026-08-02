package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.chargers.data.g;
import com.yandex.go.chargers.domain.a;
import com.yandex.go.chargers.order.domain.d;
import com.yandex.go.loyalty.impl.common.domain.l;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.payments.paymentlist.experiments.change_payment_modal.f;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.profile.b;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.analytics.o;
import ru.yandex.taxi.logistics.sdk.management.k;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes8.dex */
public final class bt2 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public /* synthetic */ bt2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.h;
        xvf0 xvf0Var7 = this.c;
        switch (i) {
            case 0:
                return new b((at2) xvf0Var3.get(), (w3c) xvf0Var7.get(), (x22) xvf0Var5.get(), (xdf0) xvf0Var2.get(), (o5e) xvf0Var4.get(), (com.yandex.messaging.utils.b) xvf0Var.get(), (n0c) xvf0Var6.get());
            case 1:
                return new f((u5s0) xvf0Var3.get(), (fga0) xvf0Var7.get(), (c) xvf0Var5.get(), (rgf) xvf0Var2.get(), (dne0) xvf0Var4.get(), (qea0) xvf0Var.get(), (lw90) xvf0Var6.get());
            case 2:
                return new com.yandex.go.chargers.order.domain.b((Lifecycle) xvf0Var3.get(), (tse) xvf0Var7.get(), (g) xvf0Var5.get(), (a) xvf0Var2.get(), (com.yandex.go.chargers.order.domain.a) xvf0Var4.get(), (iy11) xvf0Var.get(), (com.yandex.go.chargers.data.a) xvf0Var6.get());
            case 3:
                return new d((Lifecycle) xvf0Var3.get(), (tse) xvf0Var7.get(), (tt2) xvf0Var5.get(), (x5a) xvf0Var2.get(), (g) xvf0Var4.get(), (a) xvf0Var.get(), (ml9) xvf0Var6.get());
            case 4:
                return new ru.yandex.taxi.logistics.sdk.management.a((ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.management.deliveries.d) xvf0Var7.get(), (j2s) xvf0Var5.get(), (k) xvf0Var2.get(), (ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c) xvf0Var4.get(), (ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d) xvf0Var.get(), (aci) xvf0Var6.get());
            case 5:
                return new drd((fga0) xvf0Var3.get(), (nrd) xvf0Var7.get(), (dqe0) xvf0Var5.get(), (g8a0) xvf0Var2.get(), (x1f0) xvf0Var4.get(), (lz90) xvf0Var.get(), (jvz) xvf0Var6.get());
            case 6:
                return new zue((xue) xvf0Var3.get(), (uve) xvf0Var7.get(), (awb) xvf0Var5.get(), (fve) xvf0Var2.get(), this.f, this.g, (or41) xvf0Var6.get());
            case 7:
                return new cve(this.b, (hue) xvf0Var7.get(), (com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.a) xvf0Var5.get(), this.e, (zue) xvf0Var4.get(), this.g, (oep0) xvf0Var6.get());
            case 8:
                return new cgf((k7x0) xvf0Var3.get(), (bgf) xvf0Var7.get(), (po21) xvf0Var5.get(), (atd0) xvf0Var2.get(), (n) xvf0Var4.get(), (mob0) xvf0Var.get(), (lcz) xvf0Var6.get());
            case 9:
                return new dgf((k7x0) xvf0Var3.get(), (jgf) xvf0Var7.get(), (po21) xvf0Var5.get(), (atd0) xvf0Var2.get(), (n) xvf0Var4.get(), (mob0) xvf0Var.get(), (lcz) xvf0Var6.get());
            case 10:
                return new igf((k7x0) xvf0Var3.get(), (hgf) xvf0Var7.get(), (po21) xvf0Var5.get(), (atd0) xvf0Var2.get(), (n) xvf0Var4.get(), (lcz) xvf0Var.get(), (mob0) xvf0Var6.get());
            case 11:
                return new w8h((h) xvf0Var3.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var5), (f0) xvf0Var2.get(), (rqd0) xvf0Var4.get(), (k42) xvf0Var.get(), (w9w0) xvf0Var6.get());
            case 12:
                return new com.yandex.go.logistics.cargo_flow.interactor.a((com.yandex.go.zone.interactors.b) xvf0Var3.get(), (atd0) xvf0Var7.get(), (com.yandex.go.route.interactor.b) xvf0Var5.get(), (ru.yandex.taxi.favorites.data.repo.a) xvf0Var2.get(), (v5v0) xvf0Var4.get(), (y5i) xvf0Var.get(), (jei) xvf0Var6.get());
            case 13:
                return new lzh(this.b, (o4i) xvf0Var7.get(), (a5i) xvf0Var5.get(), (a3v) xvf0Var2.get(), (w030) xvf0Var4.get(), (Context) xvf0Var.get(), (ru.yandex.taxi.design.utils.a) xvf0Var6.get());
            case 14:
                return new j4n((Context) xvf0Var3.get(), (pav) xvf0Var7.get(), (k7x0) xvf0Var5.get(), (pdc) xvf0Var2.get(), (tt2) xvf0Var4.get(), (xdf) xvf0Var.get(), (pho) xvf0Var6.get());
            case 15:
                return new q0k((Context) xvf0Var3.get(), i5m.a(xvf0Var7), i5m.a(xvf0Var5), i5m.a(xvf0Var2), i5m.a(xvf0Var4), i5m.a(xvf0Var), (db4) xvf0Var6.get());
            case 16:
                return new com.yandex.go.drive.sdkintegration.domain.session.drive.c((tse) xvf0Var3.get(), (kfm) xvf0Var7.get(), (com.yandex.go.drive.experiments.c) xvf0Var5.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var4), i5m.a(xvf0Var), (com.yandex.go.drive.delegates.b) xvf0Var6.get());
            case 17:
                return new ru.yandex.taxi.superapp.deeplink.a(i5m.a(xvf0Var3), i5m.a(xvf0Var7), i5m.a(xvf0Var5), this.e, (tse) xvf0Var4.get(), (tt2) xvf0Var.get(), i5m.a(xvf0Var6));
            case 18:
                return new ru.yandex.taxi.notifications.b((tse) xvf0Var3.get(), (tt2) xvf0Var7.get(), (jxo) xvf0Var5.get(), (ru.yandex.taxi.notifications.g) xvf0Var2.get(), i5m.a(xvf0Var4), (p2y0) xvf0Var.get(), (hxo) xvf0Var6.get());
            case 19:
                return new ru.yandex.taxi.failure_notificator.b((Lifecycle) xvf0Var3.get(), (tt2) xvf0Var7.get(), (zuj0) xvf0Var5.get(), (ru.yandex.taxi.failure_notificator.c) xvf0Var2.get(), (c) xvf0Var4.get(), (spt) xvf0Var.get(), (c9p) xvf0Var6.get());
            case 20:
                return new zqq(i5m.a(xvf0Var3), i5m.a(xvf0Var7), i5m.a(xvf0Var5), i5m.a(xvf0Var2), (pwy0) xvf0Var4.get(), (tse) xvf0Var.get(), (tt2) xvf0Var6.get());
            case 21:
                return new ru.yandex.logistics.cargo_form.async.impl.interactor.b((ru.yandex.logistics.cargo_form.async.impl.data.a) xvf0Var3.get(), (st2) xvf0Var7.get(), (ru.yandex.logistics.cargo_form.async.impl.polling.a) xvf0Var5.get(), (v6s) xvf0Var2.get(), (com.yandex.delivery.utils.dialogmanager.a) xvf0Var4.get(), (z2s) xvf0Var.get(), (ru.yandex.logistics.cargo_form.async.impl.storage.b) xvf0Var6.get());
            case 22:
                return new com.yandex.messaging.internal.translator.g((kse) xvf0Var3.get(), (sb7) xvf0Var7.get(), (ibt) xvf0Var5.get(), (k020) xvf0Var2.get(), (nz01) xvf0Var4.get(), (at2) xvf0Var.get(), (p1b0) xvf0Var6.get());
            case 23:
                return new com.yandex.messaging.domain.h((j) xvf0Var3.get(), (rz10) xvf0Var7.get(), (MessengerEnvironment) xvf0Var5.get(), (lqo) xvf0Var2.get(), (SharedPreferences) xvf0Var4.get(), (kse) xvf0Var.get(), (w5t) xvf0Var6.get());
            case 24:
                return i5b1.e((Context) xvf0Var3.get(), (wff0) xvf0Var7.get(), (h020) xvf0Var5.get(), (com.yandex.messaging.internal.images.b) xvf0Var2.get(), (OkHttpClient) xvf0Var4.get(), (vmr0) xvf0Var.get(), (String) xvf0Var6.get());
            case 25:
                return new ru.yandex.taxi.inapp_calls.a((t270) xvf0Var3.get(), (c) xvf0Var7.get(), this.d, (oep0) xvf0Var2.get(), (zuj0) xvf0Var4.get(), (y3u0) xvf0Var.get(), (v3u0) xvf0Var6.get());
            case 26:
                return new i((y1s) xvf0Var3.get(), (uze0) xvf0Var7.get(), (qbl0) xvf0Var5.get(), (tt2) xvf0Var2.get(), (axm) xvf0Var4.get(), (com.yandex.go.route.interactor.b) xvf0Var.get(), (r) xvf0Var6.get());
            case 27:
                return new ru.yandex.taxi.widget.c((pav) xvf0Var3.get(), (Context) xvf0Var7.get(), (uwx0) xvf0Var5.get(), (z1u) xvf0Var2.get(), (pdc) xvf0Var.get(), (r820) xvf0Var4.get(), (eyu0) xvf0Var6.get());
            case 28:
                return new com.yandex.go.g(i5m.a(xvf0Var3), (po21) xvf0Var7.get(), (rcz) xvf0Var5.get(), (tt2) xvf0Var2.get(), (com.yandex.go.config.i) xvf0Var4.get(), (o) xvf0Var.get(), i5m.a(xvf0Var6));
            default:
                return new l((tse) xvf0Var3.get(), (Lifecycle) xvf0Var7.get(), i5m.a(xvf0Var5), i5m.a(xvf0Var2), (m) xvf0Var4.get(), (zvz) xvf0Var.get(), (jvz) xvf0Var6.get());
        }
    }
}
