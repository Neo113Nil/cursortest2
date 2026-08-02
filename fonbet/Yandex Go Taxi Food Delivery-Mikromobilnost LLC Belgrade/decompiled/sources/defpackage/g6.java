package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.folders.g;
import com.yandex.messaging.internal.authorized.chat.l;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.ui.about.a;
import com.yandex.messaging.ui.about.b;
import com.yandex.messaging.ui.folders.f;
import com.yandex.messaging.ui.settings.folder.addChat.i;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes5.dex */
public final class g6 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public g6(nt0 nt0Var, du6 du6Var, w0g w0gVar, vrt0 vrt0Var, n00 n00Var) {
        this.a = 14;
        this.b = nt0Var;
        this.d = du6Var;
        this.e = w0gVar;
        this.c = vrt0Var;
        this.f = n00Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.f;
        switch (i) {
            case 0:
                return new a((q6v) xvf0Var.get(), (f3c) xvf0Var3.get(), (rz10) xvf0Var2.get(), (v) xvf0Var4.get(), (b) ((fwc) xvf0Var5).get());
            case 1:
                return new bc((Context) ((t0g) xvf0Var4).get(), (i130) xvf0Var.get(), (pav) xvf0Var3.get(), (pta0) xvf0Var2.get(), (zb) ((ac) xvf0Var5).get());
            case 2:
                return new i((ec0) ((n3w) xvf0Var4).a, (g) xvf0Var.get(), (l7t) xvf0Var3.get(), (f) ((k0n) xvf0Var5).get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var2.get());
            case 3:
                return new e((ru.yandex.taxi.logistics.sdk.address_details.api.a) ((n3w) xvf0Var).a, (f4l0) ((l2g) xvf0Var3).get(), (ds0) ((lk) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.address_details.impl.domain.a) ((lk) xvf0Var4).get(), (pt0) ((l2g) xvf0Var5).get());
            case 4:
                return new com.yandex.go.taxi.summary.mobilityhub.interactor.a((tt2) xvf0Var.get(), (zuj0) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var4.get(), (com.yandex.go.route.interactor.b) ((l3g) xvf0Var5).get());
            case 5:
                return new dy0((ah00) xvf0Var.get(), (fu00) xvf0Var3.get(), (a3v) xvf0Var2.get(), (a7u) ((xat) xvf0Var5).get(), (fy0) xvf0Var4.get());
            case 6:
                return new w81((c) xvf0Var.get(), (bdv0) ((t4v0) xvf0Var2).get(), (biv0) ((b1g) xvf0Var4).get(), (wiq0) ((w0g) xvf0Var5).get(), (xcv0) xvf0Var3.get());
            case 7:
                return new com.yandex.messaging.internal.view.chat.a((xoq0) xvf0Var.get(), (x870) xvf0Var3.get(), (otq0) ((m7q0) xvf0Var5).get(), (ChatRequest) xvf0Var2.get(), (k0b) xvf0Var4.get());
            case 8:
                return new qw1((z880) xvf0Var.get(), (iw1) ((t0g) xvf0Var4).get(), (t0g) xvf0Var5, (ro0) xvf0Var3.get(), (oep0) xvf0Var2.get(), 0);
            case 9:
                return new as4((cs4) ((n3w) xvf0Var).a, (m5i) ((kyf) xvf0Var3).b.y, (v8e) ((kyf) xvf0Var2).b.z, (ru.yandex.taxi.logistics.sdk.dashboard.storage.c) ((jyf) xvf0Var4).get(), (zch) ((kyf) xvf0Var5).b.a);
            case 10:
                return new bs4((cs4) ((n3w) xvf0Var).a, (gzh) ((fxf) xvf0Var3).get(), (String) ((fxf) xvf0Var2).get(), (f4l0) ((fxf) xvf0Var4).get(), (v0k) ((dxf) xvf0Var5).get());
            case 11:
                return new com.yandex.go.taxi.order.bottom_modal.domain.b((irs0) ((vwf) xvf0Var3).get(), (lbk0) xvf0Var.get(), (jgv) ((vwf) xvf0Var2).get(), (ru.yandex.taxi.widget.utils.e) ((vwf) xvf0Var4).get(), (tt2) ((vwf) xvf0Var5).get());
            case 12:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.bubble_toggle.a((u3s) ((n3w) xvf0Var).a, (hwy0) ((gxf) xvf0Var3).get(), (do6) ((eu0) xvf0Var2).get(), (p6s) ((p1g) xvf0Var4).get(), (sae) ((srb) xvf0Var5).get());
            case 13:
                return new oo6((SummaryStateTracker) xvf0Var.get(), (ajj0) xvf0Var3.get(), (ldj0) ((ii9) xvf0Var5).get(), (bxi0) xvf0Var2.get(), (f580) xvf0Var4.get());
            case 14:
                return new wt6((ru.yandex.taxi.orderpopup.a) xvf0Var.get(), (md6) ((du6) xvf0Var2).get(), (wiq0) ((w0g) xvf0Var4).get(), (xcv0) xvf0Var3.get(), (yt6) ((n00) xvf0Var5).get());
            case 15:
                return new com.yandex.go.taxi.order.chat.call_feedback.navigation.a((TaxiOrder) ((n3w) xvf0Var).a, (Context) ((zag) xvf0Var3).get(), (w030) ((zag) xvf0Var2).get(), (tj60) ((zag) xvf0Var4).get(), (pg5) xvf0Var5);
            case 16:
                return new CardDetailsFragment((ie8) ((n3w) xvf0Var).a, (qn8) ((owf) xvf0Var3).get(), (al8) ((owf) xvf0Var2).get(), (te8) ((owf) xvf0Var4).get(), (n6r0) ((owf) xvf0Var5).get());
            case 17:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cart.b((u3s) ((n3w) xvf0Var).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cart.a) ((qy8) xvf0Var3).get(), (p6s) ((p1g) xvf0Var2).get(), (hwy0) ((gxf) xvf0Var4).get(), (sae) ((srb) xvf0Var5).get());
            case 18:
                return new bc((Context) ((n3w) xvf0Var).a, (qcp0) ((ibg) xvf0Var3).get(), (hwy0) ((ibg) xvf0Var2).get(), (jwh) ((gbg) xvf0Var4).get(), (ru.yandex.taxi.logistics.sdk.delivery.edit.b) ((gbg) xvf0Var5).get());
            case 19:
                return new rm9(this.b, (Context) xvf0Var3.get(), (w030) xvf0Var2.get(), (rm5) ((ba9) xvf0Var5).get(), (xm9) xvf0Var4.get());
            case 20:
                return new com.yandex.go.chargers.debt.screen.data.a((Context) xvf0Var.get(), (xdf) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (bia0) ((qxf) xvf0Var5).get(), (rea0) xvf0Var4.get());
            case 21:
                return new com.yandex.go.chargers.discounts.discount_stations.data.b((po21) ((txf) xvf0Var3).get(), i5m.a(xvf0Var), (com.yandex.go.chargers.error.data.a) ((txf) xvf0Var2).get(), (com.yandex.go.chargers.data.f) ((txf) xvf0Var4).get(), (lpa) ((txf) xvf0Var5).get());
            case 22:
                return new com.yandex.go.chargers.passes.a((Context) xvf0Var.get(), (w030) xvf0Var3.get(), this.d, (com.yandex.go.chargers.passes.ui.purchase.c) ((xea) xvf0Var5).get(), (uia) xvf0Var4.get());
            case 23:
                return new gja((Context) xvf0Var.get(), (w030) xvf0Var3.get(), (kja) xvf0Var2.get(), (com.yandex.go.chargers.offer.passes.ui.a) ((xea) xvf0Var4).get(), (com.yandex.go.chargers.offer.plus_dvizh.ui.a) ((xea) xvf0Var5).get());
            case 24:
                return new mua((qua) xvf0Var.get(), (Context) xvf0Var3.get(), (w030) xvf0Var2.get(), this.e, (xua) ((xea) xvf0Var5).get());
            case 25:
                return new com.yandex.messaging.ui.statuses.a((ChatRequest) xvf0Var.get(), (i2b) ((lu9) xvf0Var4).get(), (com.yandex.messaging.domain.statuses.f) ((wvq) xvf0Var5).get(), (ChatInputHeightState) xvf0Var3.get(), (ut21) xvf0Var2.get());
            case 26:
                return new com.yandex.messaging.internal.authorized.chat.e((Looper) xvf0Var.get(), (sb7) xvf0Var3.get(), (zkt0) xvf0Var2.get(), (o1b0) xvf0Var4.get(), (l) ((wj0) xvf0Var5).get());
            case 27:
                return new bc((u1n) ((k0n) xvf0Var).get(), (htg) ((exf) xvf0Var3).get(), (p6s) ((dxf) xvf0Var2).get(), i5m.a((eqh) xvf0Var4), i5m.a((p4) xvf0Var5));
            case 28:
                return new uv6((sk7) ((f2b) xvf0Var2).get(), (yob) ((zob) xvf0Var4).get(), (Context) xvf0Var.get(), (w030) xvf0Var3.get(), (sue0) ((zni0) xvf0Var5).get());
            default:
                return n5b1.d(mr20.d, new npb(this.b, this.c, this.d, (o0t) xvf0Var4, (o0t) xvf0Var5, 0));
        }
    }

    public /* synthetic */ g6(xvf0 xvf0Var, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var2, v7p v7pVar3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.f = v7pVar2;
        this.d = xvf0Var2;
        this.e = v7pVar3;
    }

    public /* synthetic */ g6(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ g6(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, byte b) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ g6(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
        this.e = xvf0Var5;
    }

    public g6(n3w n3wVar, zbg zbgVar, zbg zbgVar2, k0n k0nVar, ybg ybgVar) {
        this.a = 2;
        this.e = n3wVar;
        this.b = zbgVar;
        this.c = zbgVar2;
        this.f = k0nVar;
        this.d = ybgVar;
    }

    public /* synthetic */ g6(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = v7pVar;
        this.e = xvf0Var;
        this.f = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public g6(t0g t0gVar, v0g v0gVar, u0g u0gVar, xvf0 xvf0Var, ac acVar) {
        this.a = 1;
        this.e = t0gVar;
        this.b = v0gVar;
        this.c = u0gVar;
        this.d = xvf0Var;
        this.f = acVar;
    }

    public g6(b1g b1gVar, t4v0 t4v0Var, b1g b1gVar2, w0g w0gVar, vrt0 vrt0Var) {
        this.a = 6;
        this.b = b1gVar;
        this.d = t4v0Var;
        this.e = b1gVar2;
        this.f = w0gVar;
        this.c = vrt0Var;
    }

    public g6(f2b f2bVar, zob zobVar, xvf0 xvf0Var, eqh eqhVar, zni0 zni0Var) {
        this.a = 28;
        this.d = f2bVar;
        this.e = zobVar;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.f = zni0Var;
    }
}
