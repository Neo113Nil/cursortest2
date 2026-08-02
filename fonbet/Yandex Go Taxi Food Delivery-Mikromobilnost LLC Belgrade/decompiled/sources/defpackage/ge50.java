package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.navigator.providers.a;
import com.yandex.go.pin.api.widget.b;
import com.yandex.go.places.impl.data.mappers.organizations.h;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.order.info.OrderInfoContentView;
import com.yandex.go.taxi.order.info.OrderInfoModalView;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.ndd_map.pin.g;
import ru.yandex.taxi.parks.api.ParksApi;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class ge50 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public ge50(xvf0 xvf0Var, lq40 lq40Var, x0z x0zVar, xvf0 xvf0Var2) {
        this.a = 11;
        this.b = xvf0Var;
        this.d = lq40Var;
        this.e = x0zVar;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        switch (i) {
            case 0:
                return new a((zuj0) xvf0Var2.get(), (b) ((b900) xvf0Var3).get(), (e) xvf0Var.get(), (tt2) xvf0Var4.get());
            case 1:
                return new y4c0((e840) xvf0Var3, this.b, (uo21) xvf0Var.get(), (ya50) xvf0Var4.get(), 10);
            case 2:
                return new dt20((zg50) xvf0Var2.get(), (k) ((n4g) xvf0Var).get(), (wiq0) ((n4g) xvf0Var4).get(), (ji50) ((n3w) xvf0Var3).a);
            case 3:
                return new g((r0c0) ((n4g) xvf0Var4).get(), (AddressResolveRepository) xvf0Var2.get(), (oh50) xvf0Var.get(), (li50) ((ge50) xvf0Var3).get());
            case 4:
                return new li50((Integer) ((n3w) xvf0Var4).a, (mi50) xvf0Var2.get(), (c) ((o4g) xvf0Var3).get(), (pi50) xvf0Var.get());
            case 5:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.c((u3s) ((n3w) xvf0Var2).a, (p6s) ((p1g) xvf0Var).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.b) ((qy8) xvf0Var4).get(), (sae) ((srb) xvf0Var3).get());
            case 6:
                return new u61((u1n) ((k0n) xvf0Var2).get(), (htg) ((exf) xvf0Var).get(), i5m.a((zs0) xvf0Var4), i5m.a((eqh) xvf0Var3));
            case 7:
                return new nyd((i6r) xvf0Var2.get(), (q3g) xvf0Var.get(), (k6x) xvf0Var4.get(), (oep0) ((r3g) xvf0Var3).get());
            case 8:
                return new dt20((pg7) ((p4g) xvf0Var2).get(), (com.yandex.go.taxi.order.cancel.v2.navigation.c) ((n3w) xvf0Var).a, (o2y0) ((n3w) xvf0Var4).a, (vj70) ((wj70) xvf0Var3).get(), 15);
            case 9:
                return new com.yandex.go.taxi.order.promotions.modal_default.router.a((w030) xvf0Var2.get(), (com.yandex.go.taxi.order.promotions.modal_default.mapper.a) ((t160) xvf0Var4).get(), (tt2) xvf0Var.get(), (bu0) ((o4f) xvf0Var3).get());
            case 10:
                return new OrderInfoModalView((Context) ((s4g) xvf0Var2).get(), (o2y0) ((n3w) xvf0Var).a, (OrderInfoContentView) ((ut) xvf0Var4).get(), (xdf) ((s4g) xvf0Var3).get());
            case 11:
                return new b080((tt2) xvf0Var2.get(), (o2y0) ((lq40) xvf0Var4).get(), (com.yandex.go.taxi.order.map_objects.a) ((x0z) xvf0Var3).get(), (zz70) xvf0Var.get());
            case 12:
                return new com.yandex.go.taxi.order.promotions.mapper.a((s480) ((z10) xvf0Var3).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (e) xvf0Var.get(), (pdc) xvf0Var4.get());
            case 13:
                return new o580((Context) ((o4g) xvf0Var).get(), (xu70) ((n3w) xvf0Var4).a, (com.yandex.div.core.expression.variables.a) xvf0Var2.get(), (ipq) ((o4g) xvf0Var3).get());
            case 14:
                return new jqe((com.yandex.go.superapp.tracking.data.e) xvf0Var2.get(), (q551) xvf0Var.get(), (gb80) ((uc50) xvf0Var4).get(), (com.yandex.go.taxi.order.multi.shortcuts.e) ((hs30) xvf0Var3).get());
            case 15:
                ((gxf) xvf0Var).get();
                ((can) xvf0Var4).get();
                ((dx7) xvf0Var3).get();
                return new ca80();
            case 16:
                return new com.yandex.go.places.organization.card.impl.domain.interactors.map.walkroute.a((ru.yandex.taxi.walkroute.a) xvf0Var2.get(), (po21) xvf0Var.get(), (tk80) xvf0Var4.get(), (com.yandex.go.places.experiments.walkroute.b) ((l180) xvf0Var3).get());
            case 17:
                return new h((dbv) xvf0Var2.get(), (com.yandex.go.places.models.data.mappers.c) ((s90) xvf0Var3).get(), (pdc) xvf0Var.get(), (ru.yandex.taxi.widget.c) xvf0Var4.get());
            case 18:
                return new ze90((ParksApi) ((b5g) xvf0Var2).get(), (tt2) ((b5g) xvf0Var).get(), (bko) ((b5g) xvf0Var4).get(), (cf90) ((n3w) xvf0Var3).a);
            case 19:
                return new oo90((ol3) ((c1) xvf0Var3).get(), (xqi0) xvf0Var2.get(), (qp90) xvf0Var.get(), (xh3) xvf0Var4.get());
            case 20:
                return new doa0((Context) ((x4g) xvf0Var).get(), (boa0) xvf0Var2.get(), (ioa0) ((n3w) xvf0Var4).a, (w030) ((x4g) xvf0Var3).get());
            case 21:
                return new ypb0((pj) ((c1) xvf0Var).get(), (u8w) ((vqa0) xvf0Var4).get(), (x770) ((vqa0) xvf0Var3).get(), (xsv0) xvf0Var2.get());
            case 22:
                return new f28(xvf0Var2.get(), ((n3w) xvf0Var3).a, (w030) ((x4g) xvf0Var4).get(), (Object) this.c, 8);
            case 23:
                return new com.yandex.go.places.impl.domain.interactors.discovery.map.a((ah00) xvf0Var2.get(), (go80) xvf0Var.get(), (ytj) ((x4g) xvf0Var4).get(), (Context) ((x4g) xvf0Var3).get());
            case 24:
                return new com.yandex.go.places.flex.container.domain.interactors.a((flex.engine.a) xvf0Var2.get(), (y7c0) ((n3w) xvf0Var).a, (vr) ((kxb0) xvf0Var4).get(), (k8c0) ((n3w) xvf0Var3).a);
            case 25:
                return new qac0((qf80) xvf0Var2.get(), (rac0) ((y4g) xvf0Var3).get(), (com.yandex.go.places.map.data.mappers.a) xvf0Var.get(), (tt2) xvf0Var4.get());
            case 26:
                return new i((tse) xvf0Var2.get(), (com.yandex.go.places.impl.data.repositories.map.a) ((y4g) xvf0Var3).get(), (tt2) xvf0Var.get(), (yac0) xvf0Var4.get());
            case 27:
                return new com.yandex.go.places.impl.domain.interactors.map.e((com.yandex.go.places.impl.data.repositories.map.layer.a) ((cta0) xvf0Var3).get(), (e2t) xvf0Var2.get(), (tt2) xvf0Var.get(), (fg5) xvf0Var4.get());
            case 28:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.poll.a((z22) ((twf) xvf0Var3).get(), (FlexAdapter) xvf0Var2.get(), (ns31) xvf0Var.get(), (fp51) xvf0Var4.get());
            default:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.b((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.a) ((qy8) xvf0Var2).get(), (hwy0) ((gxf) xvf0Var).get(), (u3s) ((n3w) xvf0Var4).a, (sae) ((srb) xvf0Var3).get());
        }
    }

    public /* synthetic */ ge50(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ ge50(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ ge50(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, char c) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.e = xvf0Var3;
        this.c = xvf0Var4;
    }

    public /* synthetic */ ge50(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ ge50(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, v7p v7pVar2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = v7pVar;
        this.e = v7pVar2;
        this.b = xvf0Var2;
    }

    public ge50(o4g o4gVar, n3w n3wVar, xvf0 xvf0Var, o4g o4gVar2) {
        this.a = 13;
        this.c = o4gVar;
        this.d = n3wVar;
        this.b = xvf0Var;
        this.e = o4gVar2;
    }

    public ge50(n4g n4gVar, xvf0 xvf0Var, xvf0 xvf0Var2, ge50 ge50Var) {
        this.a = 3;
        this.d = n4gVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = ge50Var;
    }

    public ge50(eqh eqhVar, t160 t160Var, xvf0 xvf0Var, o4f o4fVar) {
        this.a = 9;
        this.b = eqhVar;
        this.d = t160Var;
        this.c = xvf0Var;
        this.e = o4fVar;
    }

    public ge50(x4g x4gVar, n3w n3wVar, n3w n3wVar2, x4g x4gVar2) {
        this.a = 20;
        this.c = x4gVar;
        this.b = n3wVar;
        this.d = n3wVar2;
        this.e = x4gVar2;
    }
}
