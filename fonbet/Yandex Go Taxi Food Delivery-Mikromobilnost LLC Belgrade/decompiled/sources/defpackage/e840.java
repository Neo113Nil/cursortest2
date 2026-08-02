package defpackage;

import android.app.Application;
import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.masstransit.sdk.order.impl.activation.b;
import com.yandex.go.masstransit.sdk.order.impl.activation.d;
import com.yandex.go.navigator.analitycs.a;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.navigator.main_screen.experiement.e;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestView;
import com.yandex.go.overdraft.domain.l;
import com.ybsdk.feature.pdf.internal.network.PdfService;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.NeuroPostcardShownStagesRepository;
import ru.yandex.taxi.masstransit.trains.checkout.actionpopup.c;
import ru.yandex.taxi.masstransit.trains.schedule.g;
import ru.yandex.taxi.parks.api.ParksApi;

/* loaded from: classes5.dex */
public final class e840 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ e840(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) ((r3g) xvf0Var5).get();
                w030 w030Var = (w030) ((r3g) xvf0Var4).get();
                h410 h410Var = (h410) ((r3g) xvf0Var3).get();
                hhd hhdVar = (hhd) ((jl00) xvf0Var2).get();
                xl10 xl10Var = (xl10) ((jl00) xvf0Var).get();
                to70 to70Var = (to70) h410Var.f.getValue();
                fl10 fl10Var = new fl10(hhdVar);
                hhw hhwVar = to70Var.a;
                return new b(context, w030Var, new d((o370) hhwVar.o, fl10Var), new wpy0(1, (o370) hhwVar.p), new fl10(new at20(xl10Var, (w740) to70Var.g.getValue())), new djb(to70Var, context, w030Var, 3));
            case 1:
                return new ru.yandex.taxi.masstransit.trains.checkout.actionpopup.b((Context) xvf0Var5.get(), (w030) xvf0Var4.get(), (ru.yandex.taxi.masstransit.trains.checkout.actionpopup.d) ((jl00) xvf0Var3).get(), (c) ((wz30) xvf0Var2).get(), (y3g) xvf0Var);
            case 2:
                return new g((ru.yandex.taxi.widget.c) xvf0Var5.get(), (yp2) ((r3g) xvf0Var4).get(), (zuj0) xvf0Var3.get(), (xdf) xvf0Var2.get(), (j5z) ((r3g) xvf0Var).get());
            case 3:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.c((u3s) ((n3w) xvf0Var5).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.b) ((qy8) xvf0Var4).get(), (p6s) ((p1g) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 4:
                return new com.yandex.go.tariffcard.interactor.g((fco) xvf0Var5.get(), (ico) ((q02) xvf0Var4).get(), (com.yandex.go.taxi.tariffs.repository.g) ((w0g) xvf0Var3).get(), (iq40) xvf0Var2.get(), (rqo) ((u0g) xvf0Var).get());
            case 5:
                return new com.yandex.go.multimodal_route.ui.detailed_card.g((ah00) ((y3g) xvf0Var5).get(), (v7j0) ((b4g) xvf0Var4).get(), (po21) ((b4g) xvf0Var3).get(), (b4g) xvf0Var2, (oep0) ((b4g) xvf0Var).get());
            case 6:
                return new j650((Application) ((f4g) xvf0Var5).get(), (ky2) ((f4g) xvf0Var4).get(), (md50) xvf0Var3.get(), (hit) xvf0Var2.get(), (jgu0) ((f4g) xvf0Var).get());
            case 7:
                return new com.yandex.go.navigator.notifications.cartech.b((j19) ((ig7) xvf0Var5).get(), (r) ((epf) xvf0Var4).get(), (k19) ((dx7) xvf0Var3).get(), (e19) ((dx7) xvf0Var2).get(), (tt2) xvf0Var.get());
            case 8:
                return new xb50((liq0) xvf0Var5.get(), (vff) xvf0Var4.get(), (o) xvf0Var3.get(), (ah00) xvf0Var2.get(), (gs7) ((ze) xvf0Var).get());
            case 9:
                return new a((fio) ((c7n) xvf0Var5).get(), (oc50) ((k4g) xvf0Var4).get(), (eb50) xvf0Var3.get(), (e) xvf0Var2.get(), (hit) ((k4g) xvf0Var).get());
            case 10:
                return new ag50((w030) xvf0Var5.get(), (yb50) xvf0Var4.get(), (ac50) ((n3w) xvf0Var3).a, (e100) ((ret) xvf0Var2).get(), (zuj0) xvf0Var.get());
            case 11:
                return new di50((li50) ((ge50) xvf0Var5).get(), (w2h) ((n4g) xvf0Var4).get(), (jei) ((n4g) xvf0Var3).get(), (cyx) ((n4g) xvf0Var2).get(), (dj50) xvf0Var.get());
            case 12:
                return new fm50((xl50) ((n3w) xvf0Var5).a, (w7b) ((js0) xvf0Var4).get(), (hff) xvf0Var3.get(), (qp90) xvf0Var2.get(), (b00) xvf0Var.get());
            case 13:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.b((String) xvf0Var5.get(), (q8s) ((gbg) xvf0Var4).get(), (NeuroPostcardShownStagesRepository) ((gbg) xvf0Var3).get(), (l7x0) ((ibg) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((gpx0) xvf0Var).get());
            case 14:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.d((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var5).get(), (k360) ((gbg) xvf0Var4).get(), (hwy0) ((ibg) xvf0Var3).get(), (String) xvf0Var2.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.b) ((e840) xvf0Var).get());
            case 15:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.notification.c((u3s) ((n3w) xvf0Var5).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.notification.b) ((eu0) xvf0Var4).get(), (p6s) ((p1g) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 16:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.open.a((z22) ((twf) xvf0Var5).get(), (iee) xvf0Var4.get(), (rbs) xvf0Var3.get(), (ns31) xvf0Var2.get(), (fp51) ((twf) xvf0Var).get());
            case 17:
                hk3 hk3Var = (hk3) xvf0Var5.get();
                fke fkeVar = (fke) xvf0Var4.get();
                DefaultEnvironment defaultEnvironment = (DefaultEnvironment) xvf0Var3.get();
                ((twf) xvf0Var2).get();
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.plus.a(hk3Var, fkeVar, defaultEnvironment, (ns31) xvf0Var.get());
            case 18:
                return new wk70((dt20) ((ge50) xvf0Var5).get(), (at20) ((g680) xvf0Var4).get(), (hl70) ((e840) xvf0Var3).get(), (vj70) ((wj70) xvf0Var2).get(), (vj70) ((wj70) xvf0Var).get());
            case 19:
                return new hl70((o2y0) ((n3w) xvf0Var5).a, (pwy0) ((p4g) xvf0Var4).get(), (uk70) ((p4g) xvf0Var3).get(), (xk70) xvf0Var2.get(), (tt2) ((p4g) xvf0Var).get());
            case 20:
                return new wrr((Context) xvf0Var5.get(), (d49) xvf0Var4.get(), (tj60) xvf0Var3.get(), (c29) ((ig7) xvf0Var2).get(), (a49) xvf0Var.get());
            case 21:
                return new OrderWithTariffSuggestView((Context) xvf0Var5.get(), (ru.yandex.taxi.design.utils.a) xvf0Var4.get(), (com.yandex.go.order.tariffs_suggest.ui.a) ((fy30) xvf0Var3).get(), (pwy0) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) xvf0Var.get());
            case 22:
                return new ud80((hit) xvf0Var5.get(), (tt2) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var3.get(), (iup0) xvf0Var2.get(), (u8w) ((ivo0) xvf0Var).get());
            case 23:
                return new com.yandex.go.places.impl.data.mappers.organizations.d((ru.yandex.taxi.widget.c) xvf0Var5.get(), (com.yandex.go.places.models.data.mappers.a) xvf0Var4.get(), (com.yandex.go.places.models.data.mappers.b) ((ze) xvf0Var3).get(), (com.yandex.go.places.models.data.mappers.d) ((srb) xvf0Var2).get(), (com.yandex.go.places.impl.data.mappers.organizations.b) ((jc50) xvf0Var).get());
            case 24:
                return new l((com.yandex.go.overdraft.domain.g) ((z4g) xvf0Var5).get(), (hd) ((z4g) xvf0Var4).get(), (fvt) ((z4g) xvf0Var3).get(), (h2t) ((z4g) xvf0Var2).get(), (aq80) ((f380) xvf0Var).get());
            case 25:
                return new com.yandex.messaging.input.preview.a((j1w) xvf0Var5.get(), i5m.a(xvf0Var4), (com.yandex.messaging.navigation.c) xvf0Var3.get(), (com.yandex.messaging.internal.urlpreview.a) xvf0Var2.get(), (kb90) ((ahu) xvf0Var).get());
            case 26:
                return new nw70((ParksApi) ((b5g) xvf0Var5).get(), (cf90) ((n3w) xvf0Var4).a, (bko) ((b5g) xvf0Var3).get(), (ru.yandex.taxi.parks.a) ((g680) xvf0Var2).get(), (tt2) ((b5g) xvf0Var).get());
            case 27:
                return new ru.yandex.taxi.logistics.payment_method_selector.requirement.a((wti) ((ncb) xvf0Var5).get(), (iei) ((rwh) xvf0Var4).get(), (ru.yandex.taxi.delivery.experiments.e) xvf0Var3.get(), (wt90) xvf0Var2.get(), (ru.yandex.taxi.logistics.payment_method_selector.c) xvf0Var.get());
            case 28:
                return new ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method.c((u3s) ((n3w) xvf0Var5).a, (ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method.b) ((zi60) xvf0Var4).get(), (p6s) ((p1g) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            default:
                return new com.ybsdk.feature.pdf.internal.data.a((Context) ((j3g) xvf0Var5).get(), (PdfService) xvf0Var4.get(), (f42) ((g42) xvf0Var3).get(), (us3) ((g42) xvf0Var2).get(), (if8) ((j3g) xvf0Var).get());
        }
    }
}
