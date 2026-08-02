package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.flex.main_screen.experiments.j;
import com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkView;
import com.yandex.go.flex.main_screen.presentation.feed.e;
import com.yandex.go.taxi.tariffs.interactor.s;
import com.yandex.go.yb.domain.p;
import com.yandex.go.yb.lack_of_order.domain.b;
import com.yandex.go.yb.lack_of_order.domain.l;
import java.util.List;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.locationsdk.core.input_controller.internal.d;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.masstransit.domain.q;
import ru.yandex.taxi.order.services.c;
import ru.yandex.taxi.personalstate.data.local.a;
import ru.yandex.taxi.personalstate.domain.interactor.f;
import ru.yandex.taxi.personalstate.domain.o;

/* loaded from: classes9.dex */
public final class bhx implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public bhx(oux ouxVar, xvf0 xvf0Var, qii qiiVar) {
        this.a = 4;
        this.c = ouxVar;
        this.b = xvf0Var;
        this.d = qiiVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new ahx((y180) xvf0Var3.get(), (c) xvf0Var2.get(), i5m.a((kgn) xvf0Var));
            case 1:
                return new b((ky2) xvf0Var3.get(), i5m.a(xvf0Var2), (p) ((gve) xvf0Var).get());
            case 2:
                return new f((o) xvf0Var3.get(), (a) ((bvx) xvf0Var).get(), (k6b0) xvf0Var2.get());
            case 3:
                return new ru.yandex.taxi.launch.c((fn21) xvf0Var3.get(), (evx) ((etx) xvf0Var).get(), (m) xvf0Var2.get());
            case 4:
                return new ru.yandex.taxi.location.lbs.b((s66) ((oux) xvf0Var2).get(), (q7y) xvf0Var3.get(), (yvi0) ((qii) xvf0Var).get());
            case 5:
                return new ru.yandex.taxi.location.a((kb20) xvf0Var3.get(), (q7y) xvf0Var2.get(), (s66) ((y1u) xvf0Var).get());
            case 6:
                return new nay((s) ((l20) xvf0Var).get(), (zuj0) xvf0Var3.get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var2.get());
            case 7:
                List list = (List) ((xcz) xvf0Var).get();
                ru.yandex.taxi.locationsdk.core.location_bus.internal.a aVar = (ru.yandex.taxi.locationsdk.core.location_bus.internal.a) xvf0Var3.get();
                rcz rczVar = (rcz) xvf0Var2.get();
                TimestampSelector timestampSelector = ucz.a;
                return new ru.yandex.taxi.locationsdk.core.input_controller.internal.b(new d(list, timestampSelector, rczVar), aVar, timestampSelector, rczVar);
            case 8:
                return new y4c0((Activity) xvf0Var3.get(), (kkm) ((gdz) xvf0Var).get(), (j7j0) xvf0Var2.get());
            case 9:
                return new zsa((l3e) xvf0Var, xvf0Var3, (ppl0) xvf0Var2.get());
            case 10:
                return new com.yandex.go.lottery.domain.c((y50) xvf0Var3.get(), (wrz) ((kqz) xvf0Var).get(), (rqo) xvf0Var2.get());
            case 11:
                return new com.yandex.go.payments_widgets.section.payments.loyalty.a((tt2) xvf0Var3.get(), (tse) xvf0Var2.get(), (kjz) ((bsz) xvf0Var).get());
            case 12:
                return new com.yandex.go.loyalty.impl.selector.domain.c((bhx) xvf0Var, (fx60) xvf0Var3.get(), (jvz) xvf0Var2.get());
            case 13:
                return new zsa(20, (nxz) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a((bsz) xvf0Var));
            case 14:
                return new kyz((crg) xvf0Var3.get(), (zuj0) ((c3g) xvf0Var2).get(), (xdf) ((c3g) xvf0Var).get());
            case 15:
                return new r1s(29, (zn40) xvf0Var3.get(), (bo40) xvf0Var2.get(), (co40) ((wz30) xvf0Var).get());
            case 16:
                return new ru.yandex.taxi.maas.impl.ride.metropick.d((ru.yandex.taxi.maas.impl.ride.common.a) xvf0Var3.get(), (tc) xvf0Var2, (bsz) xvf0Var);
            case 17:
                return new w800((tt2) ((y2g) xvf0Var3).get(), (cot) ((gw7) xvf0Var2).get(), (com.yandex.go.flex.main_screen.experiments.f) ((e6v0) xvf0Var).get());
            case 18:
                return new e((j) xvf0Var3.get(), (odw0) xvf0Var2.get(), (nbw0) ((p7w0) xvf0Var).get());
            case 19:
                return new MainScreenFlexSdkView((Context) xvf0Var3.get(), (FeedSdkComponent) xvf0Var2.get(), (aa00) ((ba00) xvf0Var).get());
            case 20:
                return new fk00((f0) ((le30) xvf0Var).get(), (ru.yandex.taxi.am.token.a) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 21:
                return new zsa(21, xvf0Var3, (vw2) xvf0Var2, (my0) xvf0Var);
            case 22:
                return new l420((Context) xvf0Var3.get(), (hay) ((p7r0) xvf0Var).get(), (kse) xvf0Var2.get());
            case 23:
                return new h720((com.yandex.messaging.analytics.fps.a) ((cer) xvf0Var).get());
            case 24:
                return new ls20((com.yandex.go.ads.mobile_ads_sdk.domain.a) ((ee) xvf0Var).get(), (com.yandex.go.ads.mobile_ads_sdk.data.a) xvf0Var3.get(), (ums0) xvf0Var2.get());
            case 25:
                return new com.yandex.go.yb.lack_of_order.domain.e((pdc) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (l) ((dqx0) xvf0Var).get());
            case 26:
                return new ru.yandex.taxi.masstransit.detailedroute.mapper.a((Context) xvf0Var3.get(), (ru.yandex.taxi.masstransit.mapper.d) ((i020) xvf0Var2).get(), (ru.yandex.taxi.masstransit.mapper.c) ((k220) xvf0Var).get());
            case 27:
                return new q((tt2) xvf0Var3.get(), (ru.yandex.taxi.masstransit.datasource.schedule.a) ((xcz) xvf0Var).get(), (jtq0) xvf0Var2.get());
            case 28:
                return new wr30((xr30) ((bhx) xvf0Var).get(), (k) xvf0Var3.get(), (tu30) xvf0Var2.get());
            default:
                return new xr30((on2) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ru.yandex.taxi.masstransit.geopayment.tickets.storage.a) ((etx) xvf0Var).get());
        }
    }

    public /* synthetic */ bhx(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = v7pVar;
        this.c = xvf0Var2;
    }

    public /* synthetic */ bhx(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ bhx(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.d = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
