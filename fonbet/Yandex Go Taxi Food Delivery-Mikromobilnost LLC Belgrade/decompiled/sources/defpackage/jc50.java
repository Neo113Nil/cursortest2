package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.yandex.go.navigator.map_interactions.c;
import com.yandex.go.navigator.map_interactions.experiment.a;
import com.yandex.go.superapp.order.multi.old.h;
import com.yandex.go.superapp.order.multi.old.view.OrdersListViewImpl;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.order.interactors.b;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class jc50 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ jc50(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new c((ah00) xvf0Var3.get(), (a) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 1:
                return new lg50((re50) xvf0Var3.get(), (liq0) xvf0Var2.get(), (vff) xvf0Var.get());
            case 2:
                return new wg50((ck31) xvf0Var3.get(), (pb31) xvf0Var2.get(), (q) xvf0Var.get());
            case 3:
                return new com.yandex.go.taxi.order.recenter.c((b) xvf0Var3.get(), (h760) xvf0Var2.get(), (y980) xvf0Var.get());
            case 4:
                return new l270((naz0) xvf0Var3.get(), (oab) xvf0Var2.get(), (n5t0) xvf0Var.get());
            case 5:
                return new com.yandex.go.taxi.order.bubble.interactor.a((lp00) xvf0Var3.get(), (ah00) xvf0Var2.get(), (ru.yandex.taxi.map_common.map.process.b) xvf0Var.get());
            case 6:
                return new com.yandex.go.taxi.order.bubble.interactor.b((lp00) xvf0Var3.get(), (ah00) xvf0Var2.get(), (ru.yandex.taxi.map_common.map.process.b) xvf0Var.get());
            case 7:
                return new com.yandex.go.taxi.order.bubble.b((Context) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 8:
                return new p080((ah00) xvf0Var3.get(), (com.yandex.go.taxi.order.map.overlay.c) xvf0Var2.get(), (o080) xvf0Var.get());
            case 9:
                return new p370(8, (ufb) xvf0Var3.get(), xvf0Var2, (oep0) xvf0Var.get());
            case 10:
                return new t180((k880) xvf0Var3.get(), (p2y0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 11:
                return new h580((w3r0) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (ynj0) xvf0Var.get());
            case 12:
                return new s580((lw70) xvf0Var3.get(), (y3u0) xvf0Var2.get(), (h080) xvf0Var.get());
            case 13:
                return new j780((o2y0) xvf0Var3.get(), (as21) xvf0Var2.get(), (w880) xvf0Var.get());
            case 14:
                return new com.yandex.go.order.tariffs_suggest.mapper.a((e) xvf0Var3.get(), (xdf) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 15:
                return new OrdersListViewImpl((Activity) xvf0Var3.get(), (h) xvf0Var2.get(), (gy70) xvf0Var.get());
            case 16:
                return new egz();
            case 17:
                return new com.yandex.go.places.impl.data.mappers.organizations.a((ru.yandex.taxi.widget.c) xvf0Var3.get(), (dbv) xvf0Var2.get(), (com.yandex.go.places.models.data.mappers.c) xvf0Var.get());
            case 18:
                return new com.yandex.go.places.impl.data.mappers.organizations.b((pdc) xvf0Var3.get(), (dbv) xvf0Var2.get(), (com.yandex.go.places.models.data.mappers.a) xvf0Var.get());
            case 19:
                return new com.yandex.go.places.impl.data.mappers.organizations.c((k7x0) xvf0Var3.get(), (pdc) xvf0Var2.get(), (com.yandex.go.places.models.data.mappers.a) xvf0Var.get());
            case 20:
                return new kt90((hu90) xvf0Var3.get(), (z22) xvf0Var.get(), (h6j0) xvf0Var2.get());
            case 21:
                return new m5b0((o1b0) xvf0Var3.get(), (at2) xvf0Var2.get(), (Looper) xvf0Var.get());
            case 22:
                return new com.yandex.go.pickup_from_photo.data.a((vtx0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (bjb0) xvf0Var.get());
            case 23:
                return new avb0((to3) xvf0Var3.get(), (k020) xvf0Var2.get(), (x22) xvf0Var.get());
            case 24:
                return new nyb0((lyb0) xvf0Var3.get(), i5m.a(xvf0Var2), (jyb0) xvf0Var.get());
            case 25:
                return new r400((Context) xvf0Var3.get(), (nbp0) xvf0Var2.get(), (hh51) xvf0Var.get());
            case 26:
                return new usd0((tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (i) xvf0Var.get());
            case 27:
                return new y2e0((x0j0) xvf0Var3.get(), (n5t0) xvf0Var2.get(), (kse) xvf0Var.get());
            case 28:
                return new spe0((re50) xvf0Var3.get(), (tt2) xvf0Var2.get(), (com.yandex.go.navigator.address.b) xvf0Var.get());
            default:
                return new q6c0(9, (axm) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (iom0) xvf0Var.get());
        }
    }
}
