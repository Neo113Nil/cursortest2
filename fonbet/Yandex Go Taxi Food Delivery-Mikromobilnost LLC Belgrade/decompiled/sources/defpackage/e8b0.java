package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.scooters.domain.g0;
import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.function.Supplier;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.plus.repository.e;
import ru.yandex.taxi.plus.repository.f;
import ru.yandex.taxi.plus.repository.mappers.a;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.yaplus.b;
import ru.yandex.taxi.zalogin.d;

/* loaded from: classes8.dex */
public final class e8b0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ e8b0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new b8b0();
            case 1:
                tse tseVar = (tse) xvf0Var5.get();
                g gVar = (g) xvf0Var4.get();
                b bVar = (b) xvf0Var3.get();
                return new ru.yandex.taxi.cashback.g(tseVar, gVar, bVar, (d) xvf0Var.get());
            case 2:
                hld0 hld0Var = (hld0) xvf0Var5.get();
                c cVar = (c) xvf0Var4.get();
                x2d0 x2d0Var = (x2d0) xvf0Var3.get();
                c2d0 c2d0Var = (c2d0) xvf0Var2.get();
                return new a(hld0Var, cVar, x2d0Var.a, c2d0Var.u, (k0k) xvf0Var.get());
            case 3:
                Context context = (Context) xvf0Var5.get();
                return new zxa((w030) xvf0Var4.get(), context, (wnt) xvf0Var2.get(), (Supplier) xvf0Var3.get(), (oqd0) xvf0Var.get(), 2);
            case 4:
                aqp0 aqp0Var = (aqp0) xvf0Var5.get();
                x2d0 x2d0Var2 = (x2d0) xvf0Var4.get();
                return new e(aqp0Var, x2d0Var2.e, (f) xvf0Var3.get(), (ru.yandex.taxi.plus.repository.mappers.d) xvf0Var2.get(), (n5c) xvf0Var.get());
            case 5:
                return new hne0((ysg) xvf0Var5.get(), (p2y0) xvf0Var4.get(), (com.yandex.go.taxi.order.tipssuggest.domain.a) xvf0Var3.get(), (ine0) xvf0Var2.get(), (tgz0) xvf0Var.get());
            case 6:
                com.ybsdk.rconfig.b bVar2 = (com.ybsdk.rconfig.b) xvf0Var5.get();
                h3y a = i5m.a(xvf0Var4);
                nbp0 nbp0Var = (nbp0) xvf0Var3.get();
                return new com.ybsdk.common.repositiories.auth.g(a, bVar2, nbp0Var.b, (com.ybsdk.feature.pinstorage.internal.data.c) xvf0Var2.get(), (tvv) xvf0Var.get());
            case 7:
                return new a7j0((gff) xvf0Var5.get(), (sw51) xvf0Var4.get(), (wop0) xvf0Var3.get(), (com.ybsdk.common.repositiories.auth.b) xvf0Var2.get(), (com.ybsdk.persistence.b) xvf0Var.get());
            case 8:
                return new fqk0((b20) xvf0Var5.get(), (n20) xvf0Var4.get(), (com.yandex.go.taxi.order.paymentmethods.a) xvf0Var3.get(), (ysg) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 9:
                return new com.yandex.go.beginners.safety.photo.domain.a((Context) xvf0Var5.get(), (ru.yandex.taxi.activity.g) xvf0Var4.get(), (y50) xvf0Var3.get(), (com.yandex.go.navigation.activity.b) xvf0Var2.get(), (v7j0) xvf0Var.get());
            case 10:
                return new ynm0((wiq0) xvf0Var5.get(), (axm) xvf0Var4.get(), (pp40) xvf0Var3.get(), (b8r) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 11:
                return new ru.yandex.taxi.scooters.data.data_source.a((tse) xvf0Var5.get(), (ru.yandex.taxi.scooters.data.mapper.a) xvf0Var4.get(), (ru.yandex.taxi.scooters.data.data_source.b) xvf0Var3.get(), (h) xvf0Var2.get(), (tqm0) xvf0Var.get());
            case 12:
                return new ru.yandex.taxi.scooters.data.mapper.a((tt2) xvf0Var5.get(), (zuj0) xvf0Var4.get(), (cno0) xvf0Var3.get(), (h) xvf0Var2.get(), (kqm0) xvf0Var.get());
            case 13:
                return new ssn0((tt2) xvf0Var5.get(), (tse) xvf0Var4.get(), i5m.a(xvf0Var3), (h) xvf0Var2.get(), i5m.a(xvf0Var));
            case 14:
                return new com.yandex.go.scooters.live.domain.b((tt2) xvf0Var5.get(), (com.yandex.go.analytics.b) xvf0Var4.get(), (m2o0) xvf0Var3.get(), (rwn0) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.g) xvf0Var.get());
            case 15:
                return new zda((tse) xvf0Var5.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var4.get(), (ru.yandex.taxi.scooters.utils.timers.h) xvf0Var3.get(), (s6o0) xvf0Var2.get(), (wmh) xvf0Var.get());
            case 16:
                return new g0((Lifecycle) xvf0Var5.get(), (tse) xvf0Var4.get(), (ky11) xvf0Var3.get(), (iy11) xvf0Var2.get(), (pqm0) xvf0Var.get());
            case 17:
                return new maa0((tse) xvf0Var5.get(), (com.yandex.go.zone.interactors.b) xvf0Var4.get(), (po21) xvf0Var3.get(), (ru.yandex.taxi.preorder.source.userposition.repository.a) xvf0Var2.get(), (vxm0) xvf0Var.get());
            case 18:
                return new top0((com.ybsdk.feature.qr.api.domain.a) xvf0Var5.get(), (com.ybsdk.qr.a) xvf0Var4.get(), (a3h) xvf0Var3.get(), (AppAnalyticsReporter) xvf0Var2.get(), (com.ybsdk.common.e) xvf0Var.get());
            case 19:
                return new com.ybsdk.rconfig.d((com.ybsdk.rconfig.b) xvf0Var5.get(), (AppAnalyticsReporter) xvf0Var4.get(), (nbp0) xvf0Var3.get(), (vui0) xvf0Var2.get(), (w42) xvf0Var.get());
            case 20:
                return new ibq0((ru.yandex.taxi.contacts.a) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (ru.yandex.taxi.contacts.g) xvf0Var2.get(), (uq1) xvf0Var.get());
            case 21:
                return new ycq0((fga0) xvf0Var5.get(), (ru.yandex.taxi.preorder.repositories.g) xvf0Var4.get(), (drd) xvf0Var3.get(), i5m.a(xvf0Var2), (usx) xvf0Var.get());
            case 22:
                return new com.yandex.go.notifications.acknowledge.lifecycle.a((m0g0) xvf0Var5.get(), (ru.yandex.taxi.jobs.b) xvf0Var4.get(), (com.yandex.go.notifications.acknowledge.domain.b) xvf0Var3.get(), (tt2) xvf0Var2.get(), (tse) xvf0Var.get());
            case 23:
                return new w2r0((as21) xvf0Var5.get(), (b20) xvf0Var4.get(), (p2y0) xvf0Var3.get(), (ChangeOrderApi) xvf0Var2.get(), (ga9) xvf0Var.get(), 0);
            case 24:
                return new w2r0((as21) xvf0Var5.get(), (b20) xvf0Var4.get(), (p2y0) xvf0Var3.get(), (ChangeOrderApi) xvf0Var2.get(), (ga9) xvf0Var.get(), 1);
            case 25:
                return new com.yandex.go.pin.api.a((com.yandex.go.pin.api.widget.a) xvf0Var5.get(), i5m.a(xvf0Var4), (tt2) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (tse) xvf0Var.get());
            case 26:
                return new com.yandex.go.slot.mapper.a((ru.yandex.taxi.widget.utils.e) xvf0Var5.get(), (jgv) xvf0Var4.get(), (xdf) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 27:
                return new jqt0((gqt0) xvf0Var5.get(), (com.yandex.go.preload.e) xvf0Var4.get(), (com.yandex.go.splash.dynamic.a) xvf0Var3.get(), (com.yandex.go.splash.data.a) xvf0Var2.get(), (com.yandex.go.splash.performance.a) xvf0Var.get());
            case 28:
                return new hrt0((Activity) xvf0Var5.get(), (hqt0) xvf0Var4.get(), (jqt0) xvf0Var3.get(), (oqt0) xvf0Var2.get(), (com.yandex.go.splash.domain.c) xvf0Var.get());
            default:
                return new ru.yandex.taxi.map_common.image.a((rs2) xvf0Var5.get(), (ko21) xvf0Var4.get(), (wnt) xvf0Var3.get(), (ru.yandex.taxi.map_common.style.domain.a) xvf0Var2.get(), (xs00) xvf0Var.get());
        }
    }

    public /* synthetic */ e8b0(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }
}
