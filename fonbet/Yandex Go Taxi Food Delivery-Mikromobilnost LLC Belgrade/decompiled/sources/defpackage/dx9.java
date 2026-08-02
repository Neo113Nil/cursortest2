package defpackage;

import android.content.Context;
import com.yandex.go.chargers.discovery.domain.c;
import com.yandex.go.chargers.error.a;
import com.yandex.go.chargers.offer.passes.data.f;
import com.yandex.go.chargers.offer.passes.data.g;
import com.yandex.go.chargers.passes.data.k;
import com.yandex.go.chargers.payments.domain.e;
import com.yandex.go.chargers.tariff_item_info.b;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.taxi.order.details.v1.elements.driver.d;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;

/* loaded from: classes12.dex */
public final class dx9 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public dx9(y0g y0gVar, y0g y0gVar2, nwf nwfVar) {
        this.a = 20;
        this.b = y0gVar;
        this.c = y0gVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.c;
        switch (i) {
            case 0:
                return new c((w) ((qxf) xvf0Var2).get(), (rpa) xvf0Var.get());
            case 1:
                return new a((zuj0) ((qxf) xvf0Var2).get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 2:
                return new com.yandex.go.chargers.offer.data.mappers.a((k7x0) xvf0Var.get(), (ru.yandex.taxi.widget.c) ((uxf) xvf0Var2).get());
            case 3:
                return new com.yandex.go.chargers.orchestrator_user_events.domain.a((bg5) ((lxf) xvf0Var2).get(), (po21) xvf0Var.get());
            case 4:
                return new k((yp2) ((lxf) xvf0Var2).get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 5:
                return new g((f) ((xea) xvf0Var2).get(), (io9) ((lu9) xvf0Var).get());
            case 6:
                return new e((tt2) ((lxf) xvf0Var2).get(), (com.yandex.go.chargers.payments.data.a) ((lxf) xvf0Var).get());
            case 7:
                return new b((ru.yandex.taxi.widget.c) xvf0Var.get(), (com.yandex.go.chargers.domain.mapper.a) ((mu7) xvf0Var2).get());
            case 8:
                return new fza();
            case 9:
                return new md6(29, (x501) ((hbg) xvf0Var2).get(), (x201) ((mzf) xvf0Var).get());
            case 10:
                return new ufb((w030) xvf0Var.get(), (v920) ((ncb) xvf0Var2).get());
            case 11:
                return new hgb((o0m0) xvf0Var.get(), (com.yandex.go.taxi.tariffs.repository.g) ((w0g) xvf0Var2).get());
            case 12:
                return new p1b((zuj0) xvf0Var.get(), (gvd) ((peb) xvf0Var2).get());
            case 13:
                ((mt70) xvf0Var2).get();
                return new ru.yandex.taxi.requirements.analytics.a((lt70) ((mt70) xvf0Var).get());
            case 14:
                ((js0) xvf0Var2).get();
                return new q501(13);
            case 15:
                return new p1b((l7x0) ((ibg) xvf0Var2).get(), (i) xvf0Var.get());
            case 16:
                return new com.yandex.go.morphlex.data.descriptors.actions.close_flex_screen.b((a830) xvf0Var.get(), (hit) ((m3g) xvf0Var2).get());
            case 17:
                return new sjc(0, (bc) ((g6) xvf0Var2).get(), (yb) ((t4) xvf0Var).get());
            case 18:
                return new com.yandex.go.taxi.order.details.v1.elements.driver.a((d) ((fwc) xvf0Var2).get(), (com.yandex.go.taxi.order.details.v1.elements.driver.b) ((zo0) xvf0Var).get());
            case 19:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.completed_state_widgets.a((ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.complete_buttons.b) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.payment_button.a) ((zi60) xvf0Var2).get());
            case 20:
                return new hhd((wnt) xvf0Var.get(), (o) ((y0g) xvf0Var2).get(), new liy0());
            case 21:
                return new sk7((Context) ((n3w) xvf0Var2).a, (me0) ((kk) xvf0Var).get());
            case 22:
                return new p1b((gzh) xvf0Var.get(), (yfa) ((srb) xvf0Var2).get());
            case 23:
                return new vbb((mum) ((hbn) xvf0Var2).get(), (u1n) ((c4p) xvf0Var).get());
            case 24:
                return new vbb((up21) ((gxf) xvf0Var2).get(), (yuj0) ((exf) xvf0Var).get());
            case 25:
                return new ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination.d((amp0) ((sit0) xvf0Var2).get(), (n0l0) ((ph70) xvf0Var).get());
            case 26:
                return new s1f((gzh) ((fxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 27:
                return new rwo0(2, (r3g) xvf0Var2, (e840) xvf0Var);
            case 28:
                return new com.ybsdk.feature.credit.deposit.internal.domain.a((com.ybsdk.feature.credit.deposit.internal.data.a) ((qrb) xvf0Var2).get(), (com.ybsdk.utils.poller.b) ((oxf) xvf0Var).get());
            default:
                return new kbf((Context) ((oxf) xvf0Var2).get(), (w530) ((oxf) xvf0Var).get());
        }
    }

    public /* synthetic */ dx9(xvf0 xvf0Var, xvf0 xvf0Var2, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public /* synthetic */ dx9(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }
}
