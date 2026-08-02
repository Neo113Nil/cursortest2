package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.driving.f;
import com.yandex.go.navigator.gas_stations.overview.j;
import com.yandex.go.navigator.share.experiment.c;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import com.yandex.go.tariffcard.interactor.g;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.r;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import com.ybsdk.feature.main.internal.data.network.MainScreenApi;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import java.util.Arrays;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.a;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.b;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.NeuroPostcardShownStagesRepository;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.n;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.summary.requirements.list.recycler.i;

/* loaded from: classes14.dex */
public final class k4 implements v7p {
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
    public final xvf0 k;
    public final xvf0 l;

    public /* synthetic */ k4(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = i;
        this.b = v7pVar;
        this.c = v7pVar2;
        this.k = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
        this.l = v7pVar3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.j;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.l;
        xvf0 xvf0Var6 = this.i;
        xvf0 xvf0Var7 = this.h;
        xvf0 xvf0Var8 = this.g;
        xvf0 xvf0Var9 = this.c;
        xvf0 xvf0Var10 = this.b;
        xvf0 xvf0Var11 = this.k;
        switch (i) {
            case 0:
                return new a((Context) ((exf) xvf0Var10).get(), (cv8) ((fxf) xvf0Var9).get(), (p6s) ((dxf) xvf0Var4).get(), (b) ((c4) xvf0Var3).get(), (ht10) ((ys10) xvf0Var).get(), (ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b) ((p4) xvf0Var8).get(), (AppVisibilitySubscriptionImpl) ((exf) xvf0Var7).get(), (mrj) ((c4) xvf0Var6).get(), i5m.a((cto) xvf0Var2), (vte0) xvf0Var11.get(), (te11) ((gpx0) xvf0Var5).get());
            case 1:
                return new com.ybsdk.feature.autotopup.internal.data.b((AutoTopupApi) ((lk) xvf0Var10).get(), (xv3) ((lk) xvf0Var9).get(), (tvv) ((gwf) xvf0Var4).get(), (com.ybsdk.common.a) ((gwf) xvf0Var3).get(), (com.ybsdk.di.modules.features.a) ((gwf) xvf0Var).get(), (wv3) ((lk) xvf0Var8).get(), (w530) ((gwf) xvf0Var7).get(), (com.ybsdk.feature.autotopup.internal.network.dto.regular.a) ((f04) xvf0Var6).get(), (com.ybsdk.feature.autotopup.internal.network.dto.rounding.a) ((wri0) xvf0Var2).get(), (e04) ((f04) xvf0Var11).get(), (y1r0) ((gwf) xvf0Var5).get());
            case 2:
                return new com.yandex.go.summary.interactor.core.a((i) xvf0Var11.get(), (jdv0) xvf0Var10.get(), (jfv0) xvf0Var9.get(), (ggv0) xvf0Var4.get(), (uhv0) xvf0Var3.get(), (a201) ((du6) xvf0Var).get(), (tt2) xvf0Var8.get(), (com.yandex.go.analytics.b) xvf0Var7.get(), (cjw0) ((y2s0) xvf0Var6).get(), (pev0) xvf0Var2.get(), (fwu0) xvf0Var5.get());
            case 3:
                smg smgVar = (smg) ((n3w) xvf0Var10).a;
                ylg ylgVar = (ylg) ((n3w) xvf0Var9).a;
                ((kk) xvf0Var4).get();
                ((kk) xvf0Var3).get();
                return new DashboardV3Fragment(smgVar, ylgVar, null, null, (dlg) ((ayf) xvf0Var).get(), (ha60) ((ayf) xvf0Var8).get(), (psp0) ((ayf) xvf0Var7).get(), (zon) ((ayf) xvf0Var6).get(), (mig) ((oxf) xvf0Var2).get(), (a7i0) ((ayf) xvf0Var11).get(), (dlg) ((ayf) xvf0Var5).get());
            case 4:
                return j73.f0(new a151[]{(rq0) xvf0Var11.get(), (cd1) ((lk) xvf0Var10).get(), (as4) ((g6) xvf0Var9).get(), (dch) xvf0Var4.get(), (joj) xvf0Var3.get(), (h500) xvf0Var.get(), (jlf0) xvf0Var8.get(), (lkp0) xvf0Var7.get(), (e) xvf0Var6.get(), (jkt0) xvf0Var2.get(), (fmt0) xvf0Var5.get()});
            case 5:
                Context context = (Context) ((t0g) xvf0Var10).get();
                pwy0 pwy0Var = (pwy0) xvf0Var11.get();
                ((u0g) xvf0Var4).get();
                l8i l8iVar = (l8i) xvf0Var3.get();
                t8i t8iVar = (t8i) ((u0g) xvf0Var).get();
                z8i z8iVar = (z8i) xvf0Var8.get();
                ((dx9) xvf0Var7).get();
                return new c9i(context, pwy0Var, l8iVar, t8iVar, z8iVar, (lx4) xvf0Var6.get(), (b8r) xvf0Var2.get(), (ymi) xvf0Var5.get());
            case 6:
                return new com.yandex.go.places.impl.domain.interactors.a((Context) ((x4g) xvf0Var10).get(), (tse) xvf0Var11.get(), (com.yandex.go.places.impl.navigation.common.navigator.internal.b) xvf0Var9.get(), (wbc0) xvf0Var4.get(), (com.yandex.go.places.impl.domain.interactors.b) xvf0Var3.get(), (mg80) xvf0Var.get(), (g3h) xvf0Var8.get(), (PlacesNavigationMode) xvf0Var7.get(), (ysd0) ((y4g) xvf0Var6).get(), (tse) ((x4g) xvf0Var2).get(), (com.yandex.go.places.impl.ui.notifications.favorites.a) ((y2s0) xvf0Var5).get());
            case 7:
                return new nkm((w030) xvf0Var11.get(), (jkm) xvf0Var10.get(), (ukm) xvf0Var9.get(), this.d, this.e, this.f, (c) xvf0Var8.get(), (o) xvf0Var7.get(), (xjm) ((n3w) xvf0Var6).a, (f) xvf0Var2.get(), (eb50) xvf0Var5.get());
            case 8:
                return new j((w030) xvf0Var11.get(), (jvs) xvf0Var10.get(), (wvs) xvf0Var9.get(), (prq) xvf0Var4, i5m.a((w1g) xvf0Var3), (ru.yandex.taxi.deeplinks.e) xvf0Var.get(), (z950) ((w1g) xvf0Var8).get(), (t) ((w1g) xvf0Var7).get(), (com.yandex.go.navigator.events.f) ((w1g) xvf0Var6).get(), (com.yandex.go.navigator.map_interactions.parkings.c) ((v1g) xvf0Var2).get(), (com.yandex.go.navigator.gas_stations.repositories.c) xvf0Var5.get());
            case 9:
                return new com.yandex.go.external_service.delegates.c((x6w0) xvf0Var11.get(), (q7w0) xvf0Var10.get(), (ru.yandex.taxi.launch.c) xvf0Var9.get(), (n) xvf0Var4.get(), (s2p) xvf0Var3.get(), (p6j0) ((szf) xvf0Var).get(), (yrv0) ((szf) xvf0Var8).get(), (rvq0) xvf0Var7.get(), (Lifecycle) xvf0Var6.get(), (tzf) xvf0Var2, (bp90) xvf0Var5.get());
            case 10:
                return new com.yandex.go.taxi.main.a((od61) xvf0Var11.get(), (jgt0) xvf0Var10.get(), (fif) xvf0Var9.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var4.get(), (i130) xvf0Var3.get(), (t5i) xvf0Var.get(), (mrj) ((c4) xvf0Var8).get(), (jc00) xvf0Var7.get(), (o500) xvf0Var6.get(), (biv0) xvf0Var2.get(), (cc60) xvf0Var5.get());
            case 11:
                t9g t9gVar = (t9g) xvf0Var11.get();
                d3s0 d3s0Var = (d3s0) xvf0Var10.get();
                com.yandex.go.taxi.main.shortcuts.interactors.b bVar = (com.yandex.go.taxi.main.shortcuts.interactors.b) xvf0Var9.get();
                s1s0 s1s0Var = (s1s0) xvf0Var4.get();
                sxr0 sxr0Var = (sxr0) xvf0Var3.get();
                ac00 ac00Var = (ac00) xvf0Var.get();
                h1s0 h1s0Var = (h1s0) xvf0Var8.get();
                i0s0 i0s0Var = (i0s0) xvf0Var7.get();
                zzr0 zzr0Var = (zzr0) ((elo0) xvf0Var6).get();
                p1s0 p1s0Var = (p1s0) xvf0Var2.get();
                ((s9g) xvf0Var5).get();
                d3s0Var.getClass();
                bVar.getClass();
                s1s0Var.getClass();
                sxr0Var.getClass();
                ac00Var.getClass();
                oo2 oo2Var = new oo2(d3s0Var, bVar, sxr0Var, ac00Var);
                ShortcutViewSourceType[] shortcutViewSourceTypeArr = (ShortcutViewSourceType[]) j73.A(new ShortcutViewSourceType[]{ShortcutViewSourceType.PRODUCTS, null}).toArray(new ShortcutViewSourceType[0]);
                q4s0 q4s0Var = new q4s0((ShortcutViewSourceType[]) Arrays.copyOf(shortcutViewSourceTypeArr, shortcutViewSourceTypeArr.length));
                t9gVar.getClass();
                h1s0Var.getClass();
                i0s0Var.getClass();
                p1s0Var.getClass();
                return new v9g(t9gVar, oo2Var, sxr0Var, i0s0Var, zzr0Var, p1s0Var, s1s0Var, q4s0Var, null).a();
            case 12:
                return new com.yandex.go.places.map.data.mappers.a((Context) ((x4g) xvf0Var10).get(), (pav) xvf0Var11.get(), (dbv) xvf0Var9.get(), (jxy0) xvf0Var4.get(), (je10) xvf0Var3.get(), (pdc) xvf0Var.get(), (com.yandex.go.places.models.data.mappers.f) xvf0Var8.get(), (ru.yandex.taxi.widget.c) xvf0Var7.get(), (ofc0) xvf0Var6.get(), (com.yandex.go.places.impl.data.repositories.a) xvf0Var2.get(), (com.yandex.go.places.impl.data.providers.a) ((njp) xvf0Var5).get());
            case 13:
                return new mu10((tmt0) xvf0Var11.get(), (dct) xvf0Var10.get(), (nrh) xvf0Var9.get(), (r) ((k0n) xvf0Var4).get(), (ChatRequest) xvf0Var3.get(), (noy0) xvf0Var.get(), (com.yandex.messaging.internal.urlpreview.a) xvf0Var8.get(), (k8g) ((f8g) xvf0Var7).get(), (su10) xvf0Var6.get(), (mdb) xvf0Var2.get(), (lqo) xvf0Var5.get());
            case 14:
                return new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.c((wiq0) ((w0g) xvf0Var10).get(), (vfx0) xvf0Var11.get(), (g) ((e840) xvf0Var9).get(), (com.yandex.go.taxi.tariffs.repository.g) ((w0g) xvf0Var4).get(), i5m.a((w0g) xvf0Var3), (mqv0) xvf0Var.get(), i5m.a((epf) xvf0Var8), i5m.a((lq40) xvf0Var7), (com.yandex.go.tariffcard.interactor.f) ((ys10) xvf0Var6).get(), (zuj0) xvf0Var2.get(), (x29) xvf0Var5.get());
            case 15:
                return new j360((st2) ((gbg) xvf0Var10).get(), (String) xvf0Var11.get(), (cjw0) ((flx0) xvf0Var9).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.c) ((w360) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.e) ((w360) xvf0Var3).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.a) ((di20) xvf0Var).get(), (yuj0) ((gbg) xvf0Var8).get(), (com.yandex.delivery.utils.dialogmanager.impl.b) ((gbg) xvf0Var7).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var6).get(), (NeuroPostcardShownStagesRepository) ((gbg) xvf0Var2).get(), (kcz0) ((flx0) xvf0Var5).get());
            case 16:
                return new ki60((Context) xvf0Var11.get(), (ml21) xvf0Var10.get(), (at2) xvf0Var9.get(), (uu10) xvf0Var4.get(), (pe10) ((ret) xvf0Var3).get(), (poc) ((zfa) xvf0Var).get(), i5m.a(xvf0Var8), (o1b0) xvf0Var7.get(), (lqo) xvf0Var6.get(), i5m.a(xvf0Var2), (xav) xvf0Var5.get());
            case 17:
                return new ru.yandex.taxi.orderforanother.router.a((d800) xvf0Var11.get(), (zuj0) xvf0Var10.get(), (sv70) xvf0Var9.get(), (i130) xvf0Var4.get(), (uv70) xvf0Var3.get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var.get(), (kr0) xvf0Var8.get(), (sln) xvf0Var7, (oep0) xvf0Var6.get(), (rz0) ((peb) xvf0Var2).get(), (qv70) xvf0Var5.get());
            case 18:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j((String) xvf0Var11.get(), (com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var10.get(), (x201) xvf0Var9.get(), (oa9) xvf0Var4.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a) xvf0Var3.get(), (vr) ((peb) xvf0Var).get(), (Context) xvf0Var8.get(), (kcz0) ((flx0) xvf0Var7).get(), (bi60) xvf0Var6.get(), (u1n) ((oti) xvf0Var2).get(), (d301) xvf0Var5.get());
            case 19:
                return new com.yandex.go.taxi.cars.preorder.source.j((wiq0) ((lxf) xvf0Var10).get(), (dqe0) ((lxf) xvf0Var9).get(), (com.yandex.go.route.interactor.c) ((lxf) xvf0Var4).get(), (ru.yandex.taxi.order.map.controller.a) ((lxf) xvf0Var3).get(), (jtq0) ((nup0) xvf0Var).get(), (yz8) ((jxf) xvf0Var8).get(), (com.yandex.go.navigation.screen.c) ((jxf) xvf0Var7).get(), (ta4) ((lxf) xvf0Var6).get(), (tt2) ((jxf) xvf0Var2).get(), (sfa0) ((lxf) xvf0Var11).get(), (qbl0) ((lxf) xvf0Var5).get());
            case 20:
                return new com.ybsdk.feature.main.internal.data.network.a((MainScreenApi) ((v400) xvf0Var10).get(), (com.ybsdk.common.b) ((u1g) xvf0Var9).get(), (n860) ((u2g) xvf0Var4).get(), (f5j0) ((u2g) xvf0Var3).get(), (fdr) ((u1g) xvf0Var).get(), (tvv) ((u1g) xvf0Var8).get(), (com.ybsdk.common.a) ((u1g) xvf0Var7).get(), (com.ybsdk.feature.main.internal.data.network.b) ((kxb0) xvf0Var6).get(), (y1r0) ((u2g) xvf0Var2).get(), (rb00) ((u2g) xvf0Var11).get(), (yig) ((u1g) xvf0Var5).get());
            case 21:
                vbf0 vbf0Var = (vbf0) ((n3w) xvf0Var10).a;
                ta00 ta00Var = (ta00) ((u1g) xvf0Var9).get();
                ua00 ua00Var = (ua00) ((u2g) xvf0Var4).get();
                nb00 nb00Var = (nb00) ((u2g) xvf0Var3).get();
                lc00 lc00Var = (lc00) ((u2g) xvf0Var).get();
                ((aos) xvf0Var8).get();
                return new ProductsFragment(vbf0Var, ta00Var, ua00Var, nb00Var, lc00Var, null, (rb00) ((u2g) xvf0Var7).get(), (sb6) ((w400) xvf0Var6).get(), (qa60) ((u2g) xvf0Var2).get(), (zon) ((u1g) xvf0Var11).get(), (guq0) ((u2g) xvf0Var5).get());
            case 22:
                return new vxf0((ah00) ((i9g) xvf0Var10).get(), (l390) xvf0Var11.get(), (d) xvf0Var9.get(), (ndl0) ((z1n0) xvf0Var4).get(), (com.yandex.go.taxi.order.search.ui.overlay.proxy.c) ((tgb0) xvf0Var3).get(), (cys0) xvf0Var, (ut) xvf0Var8, (ii9) xvf0Var7, (ht0) xvf0Var6, (q150) xvf0Var2, (fy30) xvf0Var5);
            case 23:
                return new com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.a((o2y0) xvf0Var11.get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.a) ((bo2) xvf0Var10).get(), (gpk0) ((s3f0) xvf0Var9).get(), (s6k0) ((jpj0) xvf0Var4).get(), (pfk0) ((n7i0) xvf0Var3).get(), (sue0) ((zni0) xvf0Var).get(), (opk0) ((s3f0) xvf0Var8).get(), (ru.yandex.taxi.widget.c) xvf0Var7.get(), (pdc) xvf0Var6.get(), (irs0) xvf0Var2.get(), (lbk0) xvf0Var5.get());
            case 24:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.a((ukn0) xvf0Var11.get(), (q) xvf0Var10.get(), (j9p0) ((ivo0) xvf0Var9).get(), (p8p0) ((ivo0) xvf0Var4).get(), (hvo0) ((ivo0) xvf0Var3).get(), (zuj0) xvf0Var.get(), (k7x0) xvf0Var8.get(), (ru.yandex.taxi.widget.c) xvf0Var7.get(), (rqo) xvf0Var6.get(), (nyn0) xvf0Var2.get(), (ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.b) ((g1n0) xvf0Var5).get());
            case 25:
                return new com.yandex.go.scooters.offers.v2.domain.g((tt2) ((e7g) xvf0Var10).get(), (y5p0) xvf0Var11.get(), (com.yandex.go.scooters.offers.v2.data.a) xvf0Var9.get(), (com.yandex.go.scooters.offers.v2.domain.f) xvf0Var4.get(), (nro0) xvf0Var3.get(), (lbn0) xvf0Var.get(), (h) xvf0Var8.get(), (com.yandex.go.scooters.payments.domain.a) xvf0Var7.get(), (ufo0) xvf0Var6.get(), (q4o0) xvf0Var2.get(), (vyo0) xvf0Var5.get());
            case 26:
                return new com.yandex.go.scooters.subscription.pci_dss.web.b((w030) xvf0Var11.get(), (fva0) xvf0Var10.get(), (gf41) xvf0Var9.get(), (fko0) xvf0Var4.get(), (vwo0) xvf0Var3.get(), this.f, (MapNotificationsMuteRepository) xvf0Var8.get(), (zwo0) ((n3w) xvf0Var7).a, (com.yandex.go.scooters.subscription.pci_dss.data.a) ((elo0) xvf0Var6).get(), this.j, (com.yandex.go.scooters.subscription.pci_dss.web.a) ((zmm0) xvf0Var5).get());
            case 27:
                return new com.yandex.go.summary.interactor.common.state.c((c6m) ((nt0) xvf0Var10).get(), (ru.yandex.taxi.preorder.summary.selector.ui.interactor.f) ((ubq0) xvf0Var9).get(), (dmq0) xvf0Var11.get(), (bk31) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ru.yandex.taxi.tooltips.repository.b) xvf0Var.get(), (t49) xvf0Var8.get(), (b8r) xvf0Var7.get(), (akv0) ((fat0) xvf0Var6).get(), (zuj0) xvf0Var2.get(), (x29) ((ig7) xvf0Var5).get());
            case 28:
                return j73.f0(new a151[]{(fub) ((k0n) xvf0Var10).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.c) ((k0n) xvf0Var9).get(), (u5n) xvf0Var11.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.e) ((faj) xvf0Var4).get(), (fub) ((k0n) xvf0Var3).get(), (vyc) ((faj) xvf0Var).get(), (n6n) xvf0Var8.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.a) ((faj) xvf0Var7).get(), (u6n) xvf0Var6.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.g) ((c7n) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.d) ((k0n) xvf0Var5).get()});
            default:
                vnt0 vnt0Var = (vnt0) xvf0Var11.get();
                bf50 bf50Var = (bf50) xvf0Var10.get();
                com.yandex.go.navigator.settings.language_settings.b bVar2 = (com.yandex.go.navigator.settings.language_settings.b) xvf0Var9.get();
                com.yandex.go.navigator.driving.speaker.a aVar = (com.yandex.go.navigator.driving.speaker.a) xvf0Var4.get();
                hzw hzwVar = (hzw) xvf0Var3.get();
                qc50 qc50Var = (qc50) ((wz30) xvf0Var).get();
                com.yandex.go.navigator.repository.f fVar = (com.yandex.go.navigator.repository.f) xvf0Var8.get();
                oc50 oc50Var = (oc50) xvf0Var7.get();
                ((f4g) xvf0Var6).get();
                return new com.yandex.go.navigator.driving.speaker.d(vnt0Var, bf50Var, bVar2, aVar, hzwVar, qc50Var, fVar, oc50Var, (hit) ((f4g) xvf0Var2).get(), (tt2) xvf0Var5.get());
        }
    }

    public /* synthetic */ k4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, int i) {
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
        this.k = xvf0Var10;
        this.l = xvf0Var11;
    }

    public /* synthetic */ k4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.k = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.g = xvf0Var7;
        this.h = xvf0Var8;
        this.i = xvf0Var9;
        this.j = xvf0Var10;
        this.l = xvf0Var11;
    }

    public /* synthetic */ k4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, int i, boolean z) {
        this.a = i;
        this.k = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.g = xvf0Var7;
        this.h = xvf0Var8;
        this.i = xvf0Var9;
        this.j = xvf0Var10;
        this.l = xvf0Var11;
    }
}
