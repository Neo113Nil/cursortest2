package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.PowerManager;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.taxi.order.change.source.interactor.c;
import com.yandex.go.taxi.order.change.source.interactor.j;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.am.AuthStateRepository;
import ru.yandex.taxi.am.d;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.f;
import ru.yandex.taxi.am.h;
import ru.yandex.taxi.am.l;
import ru.yandex.taxi.am.r;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.discovery.b;
import ru.yandex.taxi.superapp.knownOrder.u;
import ru.yandex.taxi.zalogin.k;

/* loaded from: classes9.dex */
public final class oj implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;

    public /* synthetic */ oj(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.j;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.h;
        xvf0 xvf0Var5 = this.g;
        xvf0 xvf0Var6 = this.f;
        xvf0 xvf0Var7 = this.d;
        xvf0 xvf0Var8 = this.c;
        xvf0 xvf0Var9 = this.b;
        switch (i) {
            case 0:
                return new d((tse) xvf0Var9.get(), (Lifecycle) xvf0Var8.get(), (ru.yandex.taxi.zalogin.d) xvf0Var7.get(), (ip90) xvf0Var3.get(), (g) xvf0Var6.get(), (h) xvf0Var5.get(), (pux) xvf0Var4.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 1:
                return new l((r) xvf0Var9.get(), (e) xvf0Var8.get(), (ru.yandex.taxi.am.g) xvf0Var7.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var3.get(), (tjy) xvf0Var6.get(), (f) xvf0Var5.get(), (vj3) xvf0Var4.get(), (AuthStateRepository) xvf0Var2.get(), (tse) xvf0Var.get());
            case 2:
                return new j4n((pho) xvf0Var7.get(), (k7x0) xvf0Var3.get(), (tt2) xvf0Var6.get(), (pav) xvf0Var5.get(), (exu0) xvf0Var4.get(), (oxu0) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 3:
                return new m48((k3c) xvf0Var9.get(), (tj60) xvf0Var8.get(), (jj10) xvf0Var7.get(), (woe) xvf0Var3.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var6.get(), (Context) xvf0Var5.get(), (oxu0) xvf0Var4.get(), (rqo) xvf0Var2.get(), (a) xvf0Var.get());
            case 4:
                return new j((tt2) xvf0Var9.get(), (ru.yandex.taxi.persuggest.domain.g) xvf0Var8.get(), (p2y0) xvf0Var7.get(), (com.yandex.go.taxi.order.change.common.data.d) xvf0Var3.get(), (c) xvf0Var6.get(), (com.yandex.go.taxi.order.change.source.data.e) xvf0Var5.get(), (sb9) xvf0Var4.get(), (com.yandex.go.taxi.order.change.source.interactor.e) xvf0Var2.get(), (rv0) xvf0Var.get());
            case 5:
                return new com.yandex.go.overdraft.domain.d((Context) xvf0Var9.get(), (tse) xvf0Var8.get(), (Lifecycle) xvf0Var7.get(), (tj60) xvf0Var3.get(), (aug) xvf0Var6.get(), (k7x0) xvf0Var5.get(), (pav) xvf0Var4.get(), (mhf) xvf0Var2.get(), (yy80) xvf0Var.get());
            case 6:
                return new b(i5m.a(xvf0Var9), (zuj0) xvf0Var8.get(), (a3v) xvf0Var7.get(), (kf00) xvf0Var3.get(), i5m.a(xvf0Var6), i5m.a(xvf0Var5), (w030) xvf0Var4.get(), (tse) xvf0Var2.get(), (ru.yandex.taxi.layers.b) xvf0Var.get());
            case 7:
                return new ru.yandex.taxi.favorites.data.repo.a((on2) xvf0Var9.get(), (ru.yandex.taxi.persuggest.api.a) xvf0Var8.get(), (ru.yandex.taxi.launch.c) xvf0Var7.get(), (ru.yandex.taxi.am.g) xvf0Var3.get(), (jtq0) xvf0Var6.get(), (dhe0) xvf0Var5.get(), (bfp) xvf0Var4.get(), (nip) xvf0Var2.get(), (w7v0) xvf0Var.get());
            case 8:
                return new ru.yandex.taxi.persuggest.domain.g((hit) xvf0Var9.get(), (v5v0) xvf0Var8.get(), (ru.yandex.taxi.persuggest.source.c) xvf0Var7.get(), (e2t) xvf0Var3.get(), (j2t) xvf0Var6.get(), (jtq0) xvf0Var5.get(), (o2s) xvf0Var4.get(), (w6r) xvf0Var2.get(), (q9j0) xvf0Var.get());
            case 9:
                return new k((tse) xvf0Var9.get(), (eky) xvf0Var8.get(), (ru.yandex.taxi.zalogin.j) xvf0Var7.get(), (dc61) xvf0Var3.get(), (fhz) xvf0Var6.get(), (Activity) xvf0Var5.get(), (tt2) xvf0Var4.get(), this.i, (grt0) xvf0Var.get());
            case 10:
                return new ru.yandex.taxi.polling.e(i5m.a(xvf0Var9), i5m.a(xvf0Var8), i5m.a(xvf0Var7), i5m.a(xvf0Var3), i5m.a(xvf0Var6), (g9z) xvf0Var5.get(), (tt2) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.userposition.a) xvf0Var2.get(), (h941) xvf0Var.get());
            case 11:
                return new ru.yandex.taxi.maas.impl.ride.common.a((b8r) xvf0Var9.get(), (c8r) xvf0Var8.get(), (c4r0) xvf0Var7.get(), (arv0) xvf0Var3.get(), (ru.yandex.taxi.maas.impl.ride.c) xvf0Var6.get(), (ru.yandex.taxi.deeplinks.e) xvf0Var5.get(), (d200) xvf0Var4.get(), (com.yandex.go.taxi.tariffs.interactor.b) xvf0Var2.get(), (y9y0) xvf0Var.get());
            case 12:
                return new com.yandex.go.multimodal_route.service.c((tse) xvf0Var9.get(), (tt2) xvf0Var8.get(), (com.yandex.go.superapp.tracking.data.e) xvf0Var7.get(), (u) xvf0Var3.get(), (com.yandex.go.multimodal_route.store.a) xvf0Var6.get(), (hyn0) xvf0Var5.get(), (com.yandex.go.multimodal_route.interactors.a) xvf0Var4.get(), (com.yandex.go.multimodal_route.repositories.b) xvf0Var2.get(), (bw40) xvf0Var.get());
            case 13:
                return new ru.yandex.taxi.plus.sdk.di.b((v0r0) xvf0Var9.get(), (ru.yandex.taxi.plus.sdk.cache.c) xvf0Var8.get(), (c2d0) xvf0Var7.get(), (ru.yandex.taxi.plus.repository.c) xvf0Var3.get(), (ru.yandex.taxi.plus.sdk.prefetch.a) xvf0Var6.get(), (un3) xvf0Var5.get(), (ru.yandex.taxi.plus.repository.e) xvf0Var4.get(), (f29) xvf0Var2.get(), this.j);
            case 14:
                return new com.yandex.go.scooters.ignition.domain.a((tt2) xvf0Var9.get(), (tse) xvf0Var8.get(), (oep0) xvf0Var7.get(), this.e, i5m.a(xvf0Var6), i5m.a(xvf0Var5), (vqn0) xvf0Var4.get(), i5m.a(xvf0Var2), (ern0) xvf0Var.get());
            case 15:
                return new com.yandex.go.scooters.ignition.analytics.a((Context) xvf0Var9.get(), (PowerManager) xvf0Var8.get(), (tt2) xvf0Var7.get(), (ky2) xvf0Var3.get(), (lx4) xvf0Var6.get(), (bg5) xvf0Var5.get(), (hit) xvf0Var4.get(), (brn0) xvf0Var2.get(), (com.yandex.go.scooters.ignition.data.j) xvf0Var.get());
            case 16:
                return new com.ybsdk.rconfig.b((bvi0) xvf0Var9.get(), (g2z) xvf0Var8.get(), (Moshi) xvf0Var7.get(), (Context) xvf0Var3.get(), (kg51) xvf0Var6.get(), ((Boolean) xvf0Var5.get()).booleanValue(), (w4o) xvf0Var4.get(), (nbp0) xvf0Var2.get(), (uui0) xvf0Var.get());
            case 17:
                di51 di51Var = (di51) xvf0Var9.get();
                fk3 fk3Var = (fk3) xvf0Var8.get();
                com.ybsdk.common.repositiories.auth.b bVar = (com.ybsdk.common.repositiories.auth.b) xvf0Var7.get();
                nbp0 nbp0Var = (nbp0) xvf0Var3.get();
                return new com.ybsdk.common.e(di51Var, fk3Var, bVar, (AppAnalyticsReporter) xvf0Var6.get(), (ppp0) xvf0Var5.get(), (gff) xvf0Var2.get(), (com.ybsdk.di.modules.e) xvf0Var.get(), nbp0Var.a, new yo40((com.ybsdk.rconfig.b) xvf0Var4.get()));
            default:
                return new ru.yandex.taxi.shortcuts.interactors.b((lx4) xvf0Var9.get(), (e400) xvf0Var8.get(), (com.yandex.go.navigation.screen.c) xvf0Var7.get(), (maf0) xvf0Var3.get(), (sm40) xvf0Var6.get(), (w) xvf0Var5.get(), (pa00) xvf0Var4.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
        }
    }

    public /* synthetic */ oj(epp0 epp0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
    }
}
