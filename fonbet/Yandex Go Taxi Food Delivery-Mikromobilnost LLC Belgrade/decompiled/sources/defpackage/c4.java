package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.rida.bids.data.BidsApi;
import com.yandex.go.summary.interactor.anchored.state.t;
import com.yandex.go.summary.interactor.anchored.state.y;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.ChatRequest;
import com.ybsdk.di.modules.features.u;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.b;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.l;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.summary.solid.interactor.p;
import ru.yandex.taxi.summary.solid.modal_on_order.domain.a;

/* loaded from: classes5.dex */
public final class c4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public c4(xat xatVar, prq prqVar, jde0 jde0Var, xvf0 xvf0Var) {
        this.a = 20;
        this.b = xatVar;
        this.c = prqVar;
        this.d = jde0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.d;
        switch (i) {
            case 0:
                return new mrj(1, (String) ((fxf) xvf0Var2).get(), (u1n) ((k0n) xvf0Var).get(), (g4) xvf0Var3.get());
            case 1:
                return new b((String) ((fxf) xvf0Var2).get(), (cv8) ((fxf) xvf0Var).get(), (ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b) ((p4) xvf0Var3).get());
            case 2:
                return new lb((x201) ((mzf) xvf0Var2).get(), (l) ((ii9) xvf0Var).get(), (kcz0) ((flx0) xvf0Var3).get());
            case 3:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button.b((e) ((mzf) xvf0Var2).get(), (hwy0) ((ibg) xvf0Var).get(), (nb) ((p4) xvf0Var3).get());
            case 4:
                return new md((bk1) ((t0g) xvf0Var2).get(), (wiq0) ((w0g) xvf0Var).get(), (c) ((v0g) xvf0Var3).get());
            case 5:
                return new a((tse) ((y0g) xvf0Var2).get(), (ld) xvf0Var3.get(), (ru.yandex.taxi.sdc.router.a) ((gc) xvf0Var).get());
            case 6:
                return new c00((w3i) ((bo2) xvf0Var2).get(), (ChatRequest) xvf0Var3.get(), (w7b) ((js0) xvf0Var).get());
            case 7:
                return new mrj(3, (o800) xvf0Var3.get(), (xet0) xvf0Var2.get(), (pgk0) ((m7q0) xvf0Var).get());
            case 8:
                return new com.ybsdk.feature.transfer.version2.internal.screens.main.domain.b((r90) ((hag) xvf0Var2).get(), (u) ((qbg) xvf0Var).get(), (com.ybsdk.utils.poller.b) ((qbg) xvf0Var3).get());
            case 9:
                return new ro0((g580) xvf0Var3.get(), (wiq0) ((w0g) xvf0Var2).get(), (lcj0) ((n4g0) xvf0Var).get());
            case 10:
                return new lw0((ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a) xvf0Var3.get(), (p070) ((lq40) xvf0Var2).get(), (h0w) ((p4) xvf0Var).get());
            case 11:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector.b((q8s) ((p1g) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) ((eqh) xvf0Var).get(), (ryh) ((bs0) xvf0Var3).get());
            case 12:
                return new ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.a((q8s) ((n3w) xvf0Var2).a, (kn1) ((f4) xvf0Var).get(), (st2) ((exf) xvf0Var3).get());
            case 13:
                return new mrj(12, (l7x0) ((exf) xvf0Var2).get(), (yfa) ((peb) xvf0Var).get(), (sae) ((srb) xvf0Var3).get());
            case 14:
                return new com.yandex.go.summary.interactor.anchored.state.a((y) ((sit0) xvf0Var2).get(), (ie) ((ht0) xvf0Var).get(), (t) ((nt0) xvf0Var3).get());
            case 15:
                return new zy2((Context) xvf0Var3.get(), (SharedPreferences) ((ecg) xvf0Var2).get(), (x22) xvf0Var.get());
            case 16:
                return new com.yandex.go.taxi.order.change.price.domain.a((tt2) xvf0Var3.get(), (com.yandex.go.taxi.order.change.price.data.repository.a) ((c1) xvf0Var2).get(), (d) xvf0Var.get());
            case 17:
                return new com.ybsdk.feature.autotopup.internal.domain.a((com.ybsdk.feature.autotopup.internal.data.a) ((lk) xvf0Var2).get(), (f42) ((gu3) xvf0Var).get(), (ov3) ((gwf) xvf0Var3).get());
            case 18:
                return new com.ybsdk.feature.autotopup.internal.domain.e((com.ybsdk.feature.autotopup.internal.data.b) ((k4) xvf0Var2).get(), (com.ybsdk.utils.poller.b) ((gwf) xvf0Var).get(), (tv3) ((gwf) xvf0Var3).get());
            case 19:
                return new mrj(24, (pav) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (p370) ((ad) xvf0Var).get());
            case 20:
                return new tu4((xat) xvf0Var2, (prq) xvf0Var, (jde0) xvf0Var3);
            case 21:
                return new zsa(2, xvf0Var3, (u6o0) xvf0Var2, (rz0) ((peb) xvf0Var).get());
            case 22:
                return new com.yandex.go.rida.bids.data.a((BidsApi) ((jzi0) xvf0Var2).get(), (tt2) ((g6g) xvf0Var).get(), (o2y0) ((n3w) xvf0Var3).a);
            case 23:
                return new j26((tu30) xvf0Var3.get(), (acz) ((f3g) xvf0Var2).get(), (o) ((h3g) xvf0Var).get());
            case 24:
                return new z26((y50) xvf0Var3.get(), (Activity) ((b3g) xvf0Var2).get(), (g) ((b3g) xvf0Var).get());
            case 25:
                return new com.yandex.messaging.ui.settings.privacy.blocked.a((com.yandex.messaging.domain.privacy.blocked.a) ((f9t) xvf0Var2).get(), (nft) xvf0Var3.get(), (b00) xvf0Var.get());
            case 26:
                return new com.yandex.go.taxi.order.bottom_modal.domain.a((tt2) ((vwf) xvf0Var2).get(), (pwy0) ((vwf) xvf0Var).get(), (com.yandex.go.taxi.order.bottom_modal.domain.b) ((g6) xvf0Var3).get());
            case 27:
                return new mrj(28, (com.yandex.go.taxi.summary.shared.requirement.e) ((fy30) xvf0Var2).get(), (p) ((so4) xvf0Var).get(), (llx0) ((sit0) xvf0Var3).get());
            case 28:
                return new de6((pm5) ((tl3) xvf0Var2).get(), (jl6) xvf0Var3.get(), (k7x0) xvf0Var.get());
            default:
                return new vt6(0, (ru.yandex.taxi.orderpopup.a) xvf0Var3.get(), (md6) ((du6) xvf0Var2).get(), (yt6) ((n00) xvf0Var).get());
        }
    }

    public /* synthetic */ c4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, byte b) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ c4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ c4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
