package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.delivery.live.location.impl.repository.b;
import com.yandex.go.flex.main_screen.experiments.j;
import com.yandex.go.intentprocessor.c;
import com.yandex.go.intentprocessor.k;
import com.yandex.go.intentprocessor.l;
import com.yandex.go.payments.domain.l0;
import com.yandex.go.sdk.SourceType;
import com.yandex.go.shortcuts.impl.dto.ShortcutsApi;
import com.yandex.go.shortcuts.impl.interactors.r;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.y;
import defpackage.dyv;
import defpackage.eyv;
import defpackage.w511;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.taxi.layers.domain.o;
import ru.yandex.taxi.layers.source.factory.componentfactory.x;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidFusedLocationProviderType$MobileServicesClient;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.map_common.map.utils.a;
import ru.yandex.taxi.net.taxi.NearestDriversApi;
import ru.yandex.taxi.orders.g;
import ru.yandex.taxi.preorder.source.userposition.repository.d;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.startup.launch.i;
import ru.yandex.taxi.startup.launch.response.e;

/* loaded from: classes.dex */
public final class c8w implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public c8w(y2g y2gVar, y2g y2gVar2, y2g y2gVar3, y2g y2gVar4, a3g a3gVar, y2g y2gVar5) {
        this.a = 9;
        this.e = y2gVar;
        this.b = y2gVar2;
        this.c = y2gVar3;
        this.f = y2gVar4;
        this.d = a3gVar;
        this.g = y2gVar5;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.yandex.go.sdk.config_providers.a] */
    @Override // defpackage.yvf0
    public final Object get() {
        String str;
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new c((Set) xvf0Var6.get(), (rww0) xvf0Var5.get(), (qni0) xvf0Var4.get(), (ng60) xvf0Var2.get(), (l) ((gb0) xvf0Var3).get(), (cpw0) xvf0Var.get());
            case 1:
                return new x((Context) ((m2g) xvf0Var6).get(), (tt2) ((m2g) xvf0Var5).get(), (a) ((n2g) xvf0Var4).get(), (zuj0) ((n2g) xvf0Var2).get(), (kjz) ((c660) xvf0Var).get(), (uqx) ((m2g) xvf0Var3).get());
            case 2:
                return new i((ru.yandex.taxi.startup.launch.l) xvf0Var6.get(), (g) xvf0Var5.get(), (h) xvf0Var4.get(), (e) xvf0Var2.get(), (tt2) xvf0Var.get(), (au50) ((oux) xvf0Var3).get());
            case 3:
                return new com.yandex.delivery.live.location.api.a((st2) ((p2g) xvf0Var5).get(), (b) ((p2g) xvf0Var4).get(), (com.yandex.delivery.live.location.impl.domain.a) xvf0Var6.get(), (f) ((p2g) xvf0Var2).get(), (tbz) ((cnt) xvf0Var).get(), (bdi) ((q2g) xvf0Var3).get());
            case 4:
                return new ru.yandex.taxi.orders.a((uw40) xvf0Var6.get(), (p2y0) xvf0Var5.get(), (ysg) xvf0Var4.get(), (xc80) xvf0Var2.get(), i5m.a(xvf0Var), (kjz) ((g430) xvf0Var3).get());
            case 5:
                return new j5z((Context) xvf0Var6.get(), (ko21) xvf0Var5.get(), (wu2) xvf0Var4.get(), (dne0) xvf0Var2.get(), (rx2) ((lej) xvf0Var).get(), i5m.a((xv2) xvf0Var3));
            case 6:
                return new d(i5m.a(xvf0Var6), (ru.yandex.taxi.preorder.source.userposition.repository.b) xvf0Var5.get(), i5m.a(xvf0Var4), (s66) ((sp00) xvf0Var).get(), (oiy0) ((w7y0) xvf0Var3).get(), i5m.a(xvf0Var2));
            case 7:
                Context context = (Context) xvf0Var6.get();
                final dyv dyvVar = (dyv) xvf0Var5.get();
                rcz rczVar = (rcz) xvf0Var4.get();
                c7z c7zVar = (c7z) xvf0Var2.get();
                bb2 bb2Var = (bb2) ((rqt) xvf0Var).get();
                ((rqt) xvf0Var3).get();
                TimestampSelector timestampSelector = ucz.a;
                rczVar.getClass();
                igz.a(new Pair[0]);
                igz.a(new Pair[0]);
                Pair[] pairArr = {new Pair(AndroidFusedLocationProviderType$MobileServicesClient.Google, bb2Var), new Pair(AndroidFusedLocationProviderType$MobileServicesClient.Huawei, null)};
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i2 = 0; i2 < 2; i2++) {
                    Pair pair = pairArr[i2];
                    Object first = pair.getFirst();
                    Object second = pair.getSecond();
                    if (second != null) {
                        linkedHashMap.put(first, second);
                    }
                }
                n1d n1dVar = new n1d(context, linkedHashMap, new ja2(SourceType.GPS.getSource(), SourceType.NETWORK.getSource(), SourceType.FUSED.getSource()), rczVar, c7zVar);
                i3y i3yVar = (i3y) n1dVar.g;
                ?? r1 = new Object() { // from class: com.yandex.go.sdk.config_providers.a
                    public final com.yandex.go.config.d a(AndroidLocationProviderType androidLocationProviderType) {
                        PropertyReference1Impl propertyReference1Impl;
                        int i3 = eyv.a[androidLocationProviderType.ordinal()];
                        if (i3 == 1) {
                            propertyReference1Impl = InputConfigProviderKt$selector$1.b;
                        } else if (i3 == 2) {
                            propertyReference1Impl = InputConfigProviderKt$selector$2.b;
                        } else if (i3 == 3) {
                            propertyReference1Impl = InputConfigProviderKt$selector$3.b;
                        } else {
                            if (i3 != 4) {
                                w511.b();
                                return null;
                            }
                            propertyReference1Impl = InputConfigProviderKt$selector$4.b;
                        }
                        return new com.yandex.go.config.d(new com.yandex.go.config.f(((com.yandex.go.config.i) dyv.this).d), propertyReference1Impl);
                    }
                };
                k4o<AndroidLocationProviderType> a = AndroidLocationProviderType.a();
                ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                for (AndroidLocationProviderType androidLocationProviderType : a) {
                    com.yandex.go.config.d a2 = r1.a(androidLocationProviderType);
                    int i3 = mc2.a[androidLocationProviderType.ordinal()];
                    if (i3 == 1) {
                        str = ((fa2) i3yVar.getValue()).a.a;
                    } else if (i3 == 2) {
                        str = ((fa2) i3yVar.getValue()).a.b;
                    } else if (i3 == 3) {
                        str = ((fa2) i3yVar.getValue()).a.c;
                    } else {
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        str = null;
                    }
                    arrayList.add(new ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b(str, a2, new ru.yandex.taxi.locationsdk.locationprovider.android.impl.g((ru.yandex.taxi.locationsdk.locationprovider.android.a) ((i3y) n1dVar.f).getValue(), androidLocationProviderType, (fa2) i3yVar.getValue(), (rcz) n1dVar.d)));
                }
                return arrayList;
            case 8:
                return new w300((tse) xvf0Var6.get(), (k) xvf0Var5.get(), (com.yandex.go.messenger_native.d) xvf0Var4.get(), (p) xvf0Var2.get(), (ru.yandex.taxi.deeplinks.g) ((m19) xvf0Var3).get(), i5m.a(xvf0Var));
            case 9:
                return new com.yandex.go.flex.main_screen.data.network.d((wnt) ((y2g) xvf0Var2).get(), (lx4) xvf0Var6.get(), (ajr) xvf0Var5.get(), (ru.yandex.taxi.search.suggest.i) ((y2g) xvf0Var).get(), (j) xvf0Var4.get(), (blh) ((y2g) xvf0Var3).get());
            case 10:
                return new ru.yandex.taxi.layers.presentation.g((com.yandex.go.layers.domain.g) ((m2g) xvf0Var5).get(), (k22) xvf0Var6.get(), (ru.yandex.taxi.layers.domain.a) ((aj0) xvf0Var4).get(), (o) ((pl) xvf0Var2).get(), (gcc0) ((n2g) xvf0Var).get(), i5m.a((n2g) xvf0Var3));
            case 11:
                return new fm10((Context) xvf0Var6.get(), (zuj0) xvf0Var5.get(), (nf7) xvf0Var4.get(), (ney) xvf0Var2.get(), (n20) xvf0Var.get(), (q2p) xvf0Var3);
            case 12:
                return new p640((w030) xvf0Var6.get(), (Context) xvf0Var5.get(), (ru.yandex.taxi.h) xvf0Var4.get(), (ru.yandex.taxi.masstransit.threadvariants.b) xvf0Var2.get(), (e100) ((zw30) xvf0Var3).get(), (y50) xvf0Var.get());
            case 13:
                return new ru.yandex.taxi.order.map.controller.a((tse) xvf0Var6.get(), (dk50) ((p350) xvf0Var).get(), (tt2) xvf0Var5.get(), (NearestDriversApi) xvf0Var4.get(), (ru.yandex.taxi.launch.c) xvf0Var2.get(), (shu) ((y1u) xvf0Var3).get());
            case 14:
                return new k((Activity) xvf0Var6.get(), (tse) xvf0Var5.get(), (f600) xvf0Var4.get(), (ru.yandex.taxi.activity.i) xvf0Var2.get(), (oep0) xvf0Var.get(), i5m.a((c8w) xvf0Var3));
            case 15:
                return new com.yandex.go.taxi.order.change.common.data.d(i5m.a(xvf0Var6), (n20) xvf0Var5.get(), (h) xvf0Var4.get(), (y) xvf0Var2.get(), (hh5) ((gw7) xvf0Var3).get(), (tt2) xvf0Var.get());
            case 16:
                return new com.yandex.go.taxi.order.multi.domain.a((com.yandex.go.taxi.order.cache.data.a) xvf0Var6.get(), i5m.a(xvf0Var5), (os70) xvf0Var4.get(), (com.yandex.go.taxi.order.multi.feed.domain.a) ((kxa0) xvf0Var3).get(), (g) xvf0Var2.get(), (ru.yandex.taxi.am.g) xvf0Var.get());
            case 17:
                nfa0 nfa0Var = (nfa0) xvf0Var6.get();
                com.yandex.go.payments.superapp.payment.a aVar = (com.yandex.go.payments.superapp.payment.a) ((g3p) xvf0Var).get();
                tt2 tt2Var = (tt2) xvf0Var5.get();
                dqh dqhVar = (dqh) xvf0Var4.get();
                aiq0 aiq0Var = (aiq0) xvf0Var2.get();
                ((x2b) xvf0Var3).get();
                return new l0(nfa0Var, aVar, tt2Var, dqhVar, aiq0Var);
            case 18:
                return new g((Lifecycle) xvf0Var6.get(), (tt2) xvf0Var5.get(), (ru.yandex.taxi.am.g) xvf0Var4.get(), (ru.yandex.taxi.orders.a) ((c8w) xvf0Var).get(), (ru.yandex.taxi.orders.b) ((bea0) xvf0Var3).get(), (on2) xvf0Var2.get());
            case 19:
                return new bid0((Context) xvf0Var6.get(), (ru.yandex.taxi.am.g) xvf0Var5.get(), (w030) xvf0Var4.get(), (ru.yandex.taxi.zalogin.d) xvf0Var2.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var.get(), (ru.yandex.taxi.cashback.l) ((on11) xvf0Var3).get());
            case 20:
                return new com.yandex.go.payments.porttech.navigation.a((dqe0) xvf0Var6.get(), (jk0) xvf0Var, (n20) xvf0Var5.get(), (po21) xvf0Var4.get(), (fx60) xvf0Var2.get(), (bce0) ((pqd0) xvf0Var3).get());
            case 21:
                return new com.yandex.go.position_alert.b((Context) xvf0Var6.get(), (ah00) xvf0Var5.get(), (tq1) xvf0Var4.get(), (nce0) xvf0Var2.get(), (agt0) ((wjr0) xvf0Var3).get(), (i130) xvf0Var.get());
            case 22:
                return new com.yandex.go.payments.shared.family.postcard.ui.a((pav) xvf0Var6.get(), (d800) ((v7p) xvf0Var3).get(), (zuj0) xvf0Var5.get(), (rv70) xvf0Var4.get(), (k7x0) xvf0Var2.get(), (z9p) xvf0Var.get());
            case 23:
                return new jaf0((r) xvf0Var6.get(), (ShortcutsApi) xvf0Var5.get(), (q9f0) xvf0Var4.get(), (o5t) ((a4t) xvf0Var3).get(), (po21) xvf0Var2.get(), (blh) xvf0Var.get());
            case 24:
                return new ru.yandex.taxi.settings.domain.e((y4g0) xvf0Var6.get(), (cbr0) xvf0Var5.get(), (ru.yandex.taxi.settings.domain.factory.a) xvf0Var4.get(), (j2g0) xvf0Var2.get(), (l4g0) ((m9a0) xvf0Var).get(), (o8g0) ((zlf0) xvf0Var3).get());
            case 25:
                return new w2j0((com.yandex.go.network_metrics.experiment.a) xvf0Var6.get(), (com.yandex.go.network_metrics.a) xvf0Var5.get(), (bpt) xvf0Var4.get(), (wot) xvf0Var2.get(), (vit) ((mt2) xvf0Var3).get(), (jtq0) xvf0Var.get());
            case 26:
                return new m((ayx0) xvf0Var6.get(), i5m.a((xpj0) xvf0Var2), i5m.a((xpj0) xvf0Var), i5m.a((c660) xvf0Var3), (p2y0) xvf0Var5.get(), (tt2) xvf0Var4.get());
            case 27:
                return new com.yandex.go.preorder.deeplinks.c((cpw0) xvf0Var6.get(), (com.yandex.go.route.interactor.b) xvf0Var5.get(), (vre0) xvf0Var4.get(), (com.yandex.go.preorder.tariffs.b) ((jk0) xvf0Var3).get(), (arv0) xvf0Var2.get(), (com.yandex.go.taxi.tariffs.interactor.r) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.routestats.prefetch.l((tse) xvf0Var6.get(), (tt2) xvf0Var5.get(), (c900) xvf0Var4.get(), (com.yandex.go.taxi.tariffs.internal.routestats.factory.a) ((doe0) xvf0Var3).get(), (ru.yandex.taxi.routestats.prefetch.m) xvf0Var2.get(), (nbl0) xvf0Var.get());
            default:
                return new com.yandex.go.analytics.rythm.a((ru.yandex.taxi.jobs.b) xvf0Var6.get(), (jtq0) xvf0Var5.get(), (com.yandex.go.analytics.rythm.repository.a) xvf0Var4.get(), (fll0) ((ggl0) xvf0Var3).get(), (hit) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }

    public /* synthetic */ c8w(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.f = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar2;
    }

    public /* synthetic */ c8w(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ c8w(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = xvf0Var5;
    }

    public /* synthetic */ c8w(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public c8w(p2g p2gVar, p2g p2gVar2, xvf0 xvf0Var, p2g p2gVar3, cnt cntVar, q2g q2gVar) {
        this.a = 3;
        this.c = p2gVar;
        this.d = p2gVar2;
        this.b = xvf0Var;
        this.e = p2gVar3;
        this.f = cntVar;
        this.g = q2gVar;
    }

    public /* synthetic */ c8w(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.f = v7pVar2;
        this.g = v7pVar3;
        this.e = xvf0Var3;
    }

    public c8w(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 22;
        this.b = xvf0Var;
        this.g = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public c8w(m2g m2gVar, xvf0 xvf0Var, aj0 aj0Var, pl plVar, n2g n2gVar, n2g n2gVar2) {
        this.a = 10;
        this.c = m2gVar;
        this.b = xvf0Var;
        this.d = aj0Var;
        this.e = plVar;
        this.f = n2gVar;
        this.g = n2gVar2;
    }

    public c8w(xvf0 xvf0Var, xpj0 xpj0Var, xpj0 xpj0Var2, c660 c660Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 26;
        this.b = xvf0Var;
        this.e = xpj0Var;
        this.f = xpj0Var2;
        this.g = c660Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
