package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.notifications.acknowledge.data.remote.ClientNotifyApi;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.pin.api.widget.a;
import com.yandex.go.zone.repository.o;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.network.Api;
import com.ybsdk.network.retrofit.e;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.routestats.prefetch.m;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.styling.f;
import ru.yandex.taxi.styling.g;

/* loaded from: classes8.dex */
public final class gwb0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ gwb0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
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
                return new a((Context) xvf0Var4.get(), (w0c0) xvf0Var3.get(), (yvb0) xvf0Var2.get(), (b) xvf0Var.get());
            case 1:
                return new f((zuj0) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (c) xvf0Var2.get(), (g) xvf0Var.get());
            case 2:
                return new f1c0((rqo) xvf0Var4.get(), (rgh) xvf0Var3.get(), (hit) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 3:
                return new pcc0((Context) xvf0Var4.get(), (xku0) xvf0Var3.get(), (qcc0) xvf0Var2.get(), (bia0) xvf0Var.get());
            case 4:
                return new com.yandex.go.places.impl.ui.common.map.location.a((Context) xvf0Var4.get(), (pav) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ru.yandex.taxi.am.g) xvf0Var.get());
            case 5:
                return new ajd0((qea0) xvf0Var4.get(), (i0) xvf0Var3.get(), (com.yandex.go.payments.plus.domain.c) xvf0Var2.get(), (tea0) xvf0Var.get());
            case 6:
                x2d0 x2d0Var = (x2d0) xvf0Var4.get();
                return new ru.yandex.taxi.plus.sdk.badge.widget.a(x2d0Var.k, x2d0Var.e, (ru.yandex.taxi.plus.repository.f) xvf0Var3.get(), (q2c) xvf0Var2.get(), ((c2d0) xvf0Var.get()).b);
            case 7:
                return new ru.yandex.taxi.plus.sdk.modal.a((u2d0) xvf0Var4.get(), (String) xvf0Var3.get(), xvf0Var2, (m9y0) xvf0Var.get());
            case 8:
                return new ru.yandex.taxi.plus.repository.mappers.c((hld0) xvf0Var4.get(), (ru.yandex.taxi.widget.c) xvf0Var3.get(), (ru.yandex.taxi.plus.repository.mappers.b) xvf0Var2.get(), (d29) xvf0Var.get());
            case 9:
                return new pmd0((Context) xvf0Var4.get(), (tj60) xvf0Var3.get(), (com.yandex.go.plus.notification.a) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 10:
                return new sfe0((lfe0) xvf0Var4.get(), (w030) xvf0Var3.get(), xvf0Var2, (oep0) xvf0Var.get());
            case 11:
                return new ru.yandex.taxi.main_screen_custom.presentation.analytics.a((lx4) xvf0Var4.get(), (dei0) xvf0Var3.get(), (gei0) xvf0Var2.get(), (e400) xvf0Var.get());
            case 12:
                return new com.yandex.go.communications.actionrouter.a((kof0) xvf0Var4.get(), (y50) xvf0Var3.get(), (h) xvf0Var2.get(), (ru.yandex.taxi.banners.c) xvf0Var.get());
            case 13:
                return new ru.yandex.taxi.layers.actionrouter.b((ah00) xvf0Var4.get(), (i) xvf0Var3.get(), (tit0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 14:
                return new com.yandex.go.notifications.acknowledge.domain.b((ClientNotifyApi) xvf0Var4.get(), (m0g0) xvf0Var3.get(), (erq0) xvf0Var2.get(), (com.yandex.go.notifications.acknowledge.data.local.a) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.settings.handlers.b((wnt) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 16:
                return new xni0((loi0) xvf0Var4.get(), (jni0) xvf0Var3.get(), (com.yandex.go.promocodes.referral.impl.data.c) xvf0Var2.get(), (nni0) xvf0Var.get());
            case 17:
                return new com.ybsdk.rconfig.retriever.a((bvi0) xvf0Var4.get(), (Api) xvf0Var3.get(), (AppAnalyticsReporter) xvf0Var2.get(), (u0k0) xvf0Var.get());
            case 18:
                return new d0j0((wnt) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 19:
                return new com.yandex.go.permission.b((tse) xvf0Var4.get(), (k40) xvf0Var3.get(), (w7j0) xvf0Var2.get(), (j7j0) xvf0Var.get());
            case 20:
                return new e((com.ybsdk.network.retrofit.b) xvf0Var4.get(), (u0k0) xvf0Var3.get(), (com.ybsdk.core.utils.network.retryPolicy.b) xvf0Var2.get(), (com.ybsdk.core.utils.network.retryPolicy.a) xvf0Var.get());
            case 21:
                return new vpk0(i5m.a(xvf0Var4), (b20) xvf0Var3.get(), (ga9) xvf0Var2.get(), i5m.a(xvf0Var));
            case 22:
                return new com.yandex.go.navigator.events.f((p) xvf0Var4.get(), (sb50) xvf0Var3.get(), (com.yandex.go.navigator.events.g) xvf0Var2.get(), (el00) xvf0Var.get());
            case 23:
                return new b2l0((zuj0) xvf0Var4.get(), (ah00) xvf0Var3.get(), (Context) xvf0Var2.get(), (pdc) xvf0Var.get());
            case 24:
                return new v8l0((fif) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (qlp0) xvf0Var2.get(), (awi) xvf0Var.get());
            case 25:
                return new m((on2) xvf0Var4.get(), (tt2) xvf0Var3.get(), (com.yandex.go.analytics.b) xvf0Var2.get(), (nbl0) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.masstransit.detailedroute.ui.f((ru.yandex.taxi.masstransit.domain.c) xvf0Var4.get(), (ru.yandex.taxi.masstransit.mapper.a) xvf0Var3.get(), (wr30) xvf0Var2.get(), (ru.yandex.taxi.masstransit.datasource.routing.a) xvf0Var.get());
            case 27:
                return new bhl0(i5m.a(xvf0Var4), (u7i) xvf0Var3.get(), (AppVisibilitySubscriptionImpl) xvf0Var2.get(), (st2) xvf0Var.get());
            case 28:
                return new eul0((o) xvf0Var4.get(), (k) xvf0Var3.get(), (sh41) xvf0Var2.get(), (ppl0) xvf0Var.get());
            default:
                return new com.yandex.go.beginners.safety.photo.main.ui.c((tt2) xvf0Var4.get(), (f0w0) xvf0Var3.get(), (fjb0) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
        }
    }
}
