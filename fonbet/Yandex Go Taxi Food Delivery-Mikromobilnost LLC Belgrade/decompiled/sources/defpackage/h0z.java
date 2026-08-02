package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.yandex.go.lootbox.impl.data.mapper.button.a;
import com.yandex.go.navigator.domain.u;
import com.yandex.go.places.experiments.map.map_as_main_places.b;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.search.ui.c;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.timeline.l;
import com.yandex.messaging.internal.view.timeline.m;
import com.yandex.messaging.miniapps.js.MiniAppJsInterface;
import ru.yandex.taxi.masstransit.trains.checkout.tariff.d;

/* loaded from: classes6.dex */
public final class h0z implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ h0z(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new g0z((ro0) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 1:
                return new v5z((z5z) xvf0Var2.get(), (x22) xvf0Var.get());
            case 2:
                return new hdu((Context) xvf0Var2.get(), (k8z) xvf0Var.get());
            case 3:
                return new c((iup0) xvf0Var2.get(), (hnz) xvf0Var.get());
            case 4:
                on2 on2Var = (on2) xvf0Var2.get();
                jnz jnzVar = new jnz();
                new a3y0(TaxiOrderLogGroup.LONG_SEARCH_V2.getTag(), "LongSearchV2InfoDataSource");
                new zn1(on2Var, 23);
                return jnzVar;
            case 5:
                return new a((pdc) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 6:
                return ((uxr0) xvf0Var2.get()).a((ghf) xvf0Var.get());
            case 7:
                return new b((rqo) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 8:
                return new cr00((o2y0) xvf0Var2.get(), (noe) xvf0Var.get());
            case 9:
                return new qr00((pdc) xvf0Var2.get(), (Context) xvf0Var.get());
            case 10:
                return new zg10((s320) xvf0Var2.get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var.get());
            case 11:
                return new yi10((z22) xvf0Var2.get(), (wi10) xvf0Var.get());
            case 12:
                return new gj10((Activity) xvf0Var2.get(), (x22) xvf0Var.get());
            case 13:
                return new at10((o1b0) xvf0Var2.get(), (k020) xvf0Var.get());
            case 14:
                return new et10((Looper) xvf0Var2.get(), (doc) xvf0Var.get());
            case 15:
                return new l((jcz0) xvf0Var2.get(), (f3c) xvf0Var.get());
            case 16:
                return new m((ChatRequest) xvf0Var2.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 17:
                Context context = (Context) xvf0Var2.get();
                mz10 mz10Var = new mz10();
                return mz10Var;
            case 18:
                return new sh20((uh20) xvf0Var2.get(), (wh20) xvf0Var.get());
            case 19:
                return new MiniAppJsInterface((x22) xvf0Var2.get(), (vse) xvf0Var.get());
            case 20:
                return new p030((b4s) xvf0Var2.get(), (u3s) xvf0Var.get());
            case 21:
                ajd ajdVar = (ajd) xvf0Var2.get();
                return new zid(ajdVar.a, (wu30) xvf0Var.get(), ajdVar.b, ajdVar.c, ajdVar.d, ajdVar.e);
            case 22:
                return new pz30((tur0) xvf0Var2.get(), (rz30) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.masstransit.datasource.thread.a((tt2) xvf0Var2.get(), (x210) xvf0Var.get());
            case 24:
                return new d((ru.yandex.taxi.widget.c) xvf0Var2.get(), (xdf) xvf0Var.get());
            case 25:
                return new ru.yandex.taxi.masstransit.datasource.vehicle.a((tt2) xvf0Var2.get(), (x210) xvf0Var.get());
            case 26:
                return new zq40((uq40) xvf0Var2.get(), (i130) xvf0Var.get());
            case 27:
                return new com.yandex.go.places.impl.ui.main.map.my_places.b((y050) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 28:
                return new com.yandex.go.navigator.address.a((com.yandex.go.route.interactor.b) xvf0Var2.get(), (atd0) xvf0Var.get());
            default:
                return new u((el00) xvf0Var2.get(), xvf0Var);
        }
    }
}
