package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.overdraft.ui.g;
import com.yandex.go.places.flex.container.domain.actions.c;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import com.yandex.go.taxi.order.multi.shortcuts.f;
import com.yandex.go.zone.repository.o;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.l;
import com.ybsdk.feature.partnerpayments.internal.network.PartnerPaymentsApi;
import com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveFragment;
import com.ybsdk.feature.partnerselection.internal.data.a;
import com.ybsdk.feature.partnerselection.internal.data.b;
import com.ybsdk.feature.partnerselection.internal.network.PartnerSelectionApi;
import com.ybsdk.feature.partnerselection.internal.network.PartnerSelectionTipsApi;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.d;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.e;
import com.ybsdk.feature.paymentsdk.internal.screens.PaymentSdkFragment;
import com.ybsdk.feature.pin.internal.network.PinApi;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g680 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final Object c;

    public /* synthetic */ g680(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public static jh90 a(kh90 kh90Var, tw51 tw51Var) {
        int i = 11;
        xvf0 b = i5m.b(new f380(new j3g(tw51Var, 15), i));
        int i2 = 10;
        f380 f380Var = new f380(new j3g(tw51Var, i2), i2);
        int i3 = 8;
        int i4 = 12;
        return new jh90(new nh90(), ImmutableMap.g(PartnerSaveFragment.class, new aos(n3w.a(new uh90(new w040(new g680((xvf0) new g680(b, (xvf0) f380Var, i3), (xvf0) new j3g(tw51Var, 13), 7), new j3g(tw51Var, 9), (xvf0) rh90.a, new j3g(tw51Var, i3), new j3g(tw51Var, i4), new j3g(tw51Var, i), new j3g(tw51Var, 16), new f380(new j3g(tw51Var, 14), i4)))), 24)));
    }

    public static ci90 b(ri90 ri90Var, tw51 tw51Var) {
        j3g j3gVar = new j3g(tw51Var, 24);
        xvf0 b = i5m.b(new hi90(j3gVar, 0));
        xvf0 b2 = i5m.b(new hi90(j3gVar, 1));
        n3w a = n3w.a(new gi90(ei90.a));
        l180 l180Var = new l180(b, 14);
        j3g j3gVar2 = new j3g(tw51Var, 22);
        g680 g680Var = new g680(b2, (xvf0) j3gVar2, 10);
        j3g j3gVar3 = new j3g(tw51Var, 19);
        j3g j3gVar4 = new j3g(tw51Var, 18);
        j3g j3gVar5 = new j3g(tw51Var, 20);
        int i = 25;
        aos aosVar = new aos(n3w.a(new e(new d(n3w.a(new fh90(new m(l180Var, g680Var, a, j3gVar3, j3gVar4, j3gVar5, ni90.a, new j3g(tw51Var, i), new j3g(tw51Var, 23), j3gVar2))), new f380(new j3g(tw51Var, 17), 13), dj90.a, new j3g(tw51Var, 21), j3gVar4, j3gVar5))), i);
        mi90 mi90Var = new mi90();
        a aVar = new a((PartnerSelectionApi) b.get());
        h9g h9gVar = (h9g) tw51Var;
        b bVar = new b((PartnerSelectionTipsApi) b2.get(), h9gVar.m());
        gi90 gi90Var = (gi90) a.a;
        x8g x8gVar = h9gVar.v;
        l lVar = new l((com.ybsdk.common.repositiories.agreements.a) x8gVar.H.get());
        j3h h = h9gVar.h();
        q5z.h(h);
        pi90 pi90Var = new pi90((a3h) x8gVar.T0.get());
        tfl0 t = h9gVar.t();
        q5z.h(t);
        return new ci90(mi90Var, aVar, bVar, gi90Var, lVar, h, pi90Var, t, h9gVar.o(), h9gVar.m(), ImmutableMap.g(PartnersFragment.class, aosVar));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        boolean z = false;
        Object obj = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new f680((f) xvf0Var.get(), (r55) ((l180) obj).get());
            case 1:
                return new h780((String) ((n3w) xvf0Var).a, (ysg) ((dag) obj).get());
            case 2:
                return new at20((o2y0) ((n3w) xvf0Var).a, (tt2) ((p4g) obj).get());
            case 3:
                return new com.yandex.go.places.impl.data.repositories.organizations.b((tt2) xvf0Var.get(), (h) ((ge50) obj).get());
            case 4:
                return new sjc(1, (g) ((v0g) xvf0Var).get(), (dqe0) ((w0g) obj).get());
            case 5:
                return new ru.yandex.taxi.parks.a((ze90) ((ge50) xvf0Var).get(), (x770) ((f380) obj).get());
            case 6:
                return a((kh90) obj, (tw51) xvf0Var.get());
            case 7:
                return new com.ybsdk.feature.partnerpayments.internal.domain.a((com.ybsdk.feature.partnerpayments.internal.data.a) ((g680) xvf0Var).get(), (com.ybsdk.utils.poller.b) ((j3g) obj).get());
            case 8:
                return new com.ybsdk.feature.partnerpayments.internal.data.a((PartnerPaymentsApi) xvf0Var.get(), (lh90) ((f380) obj).get());
            case 9:
                return b((ri90) obj, (tw51) xvf0Var.get());
            case 10:
                return new b((PartnerSelectionTipsApi) xvf0Var.get(), (tv3) ((j3g) obj).get());
            case 11:
                return new at20((yuj0) ((gbg) xvf0Var).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((gpx0) obj).get());
            case 12:
                return new PaymentSdkFragment((com.ybsdk.feature.paymentsdk.internal.screens.a) ((qx5) xvf0Var).get(), (k1x0) ((j3g) obj).get());
            case 13:
                return new pta0((lx4) xvf0Var.get(), (u8w) ((vqa0) obj).get());
            case 14:
                return new c((tse) ((n5g) obj).get(), (wgr) xvf0Var.get());
            case 15:
                ((c7n) xvf0Var).get();
                return new com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.a((com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.requesters.token.a) ((xat) obj).get());
            case 16:
                return new xv10((AppAnalyticsReporter) ((l5g) obj).get(), (vab0) xvf0Var.get());
            case 17:
                return new com.ybsdk.screens.registration.phoneconfirmation.domain.interactors.a((com.ybsdk.di.modules.e) ((k6g) obj).get(), (com.ybsdk.screens.registration.data.c) xvf0Var.get());
            case 18:
                return new y4a0((o) ((n5g) xvf0Var).get(), (com.yandex.go.route.interactor.b) ((n5g) obj).get(), z, 9);
            case 19:
                return new com.ybsdk.feature.pin.internal.repositories.a((PinApi) xvf0Var.get(), (dxf0) ((l5g) obj).get());
            case 20:
                return new com.yandex.go.places.map.ui.pinwar.a((ah00) xvf0Var.get(), (el00) ((x4g) obj).get());
            case 21:
                return new e7c0((tse) ((n3w) xvf0Var).a, (f7c0) ((jag) obj).get());
            case 22:
                return new com.yandex.go.places.map.domain.layer.c((d30) xvf0Var.get(), (Map) ((ei00) obj).get());
            case 23:
                return new com.yandex.go.places.impl.domain.interactors.main.c((wnt) ((x4g) xvf0Var).get(), (e2t) ((x4g) obj).get());
            case 24:
                return new tcc0((Context) ((x4g) obj).get(), (pwy0) xvf0Var.get());
            case 25:
                return new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.b((st2) xvf0Var.get(), (bo5) ((vqa0) obj).get());
            case 26:
                return new wae0((ru.yandex.taxi.e) xvf0Var.get(), (n3a) ((q02) obj).get());
            case 27:
                return new oy80(25, (w040) ((fy30) xvf0Var).get(), (z501) ((ibg) obj).get());
            case 28:
                return new y4a0((gzh) xvf0Var.get(), (oy80) ((g680) obj).get(), z, 20);
            default:
                return new g0f0((w030) xvf0Var.get(), (st0) ((o4f) obj).get());
        }
    }

    public /* synthetic */ g680(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = xvf0Var;
    }
}
