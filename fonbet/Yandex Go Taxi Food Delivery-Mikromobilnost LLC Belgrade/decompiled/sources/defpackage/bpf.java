package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.navigation.screen.c;
import com.ybsdk.di.modules.features.d;
import com.ybsdk.di.modules.features.f;
import com.ybsdk.feature.dashboard.internal.domain.interactors.a;
import com.ybsdk.feature.dashboard.internal.domain.interactors.b;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.feature.status.screen.internal.data.DivkitCommonScreenApi;
import ru.yandex.taxi.delivery.impl.requirement.door_to_door.DeliveryD2dRequirementView;
import ru.yandex.taxi.delivery.interactors.e;
import ru.yandex.taxi.delivery.interactors.p;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.DeliveryExplicitCommentCourierView;

/* loaded from: classes5.dex */
public final class bpf implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public bpf(kyf kyfVar, xvf0 xvf0Var, epf epfVar, xvf0 xvf0Var2) {
        this.a = 11;
        this.d = kyfVar;
        this.b = xvf0Var;
        this.e = epfVar;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new apf((t8i) xvf0Var4.get(), (zof) xvf0Var3.get(), (xl10) ((t160) xvf0Var2).get(), (zch) ((rwh) xvf0Var).get(), 0);
            case 1:
                return new cpf((j3i) xvf0Var4.get(), (p) ((qx5) xvf0Var3).get(), (txe) ((srb) xvf0Var2).get(), (k3i) ((fyf) xvf0Var).get());
            case 2:
                return new a((com.ybsdk.feature.dashboard.internal.data.a) ((wif) xvf0Var4).get(), (ov3) ((oxf) xvf0Var3).get(), (wm8) ((oxf) xvf0Var2).get(), (ua8) ((oxf) xvf0Var).get());
            case 3:
                return new DashboardFragment((cng) ((n3w) xvf0Var4).a, (a7i0) ((ayf) xvf0Var3).get(), (dlg) ((ayf) xvf0Var2).get(), (psp0) ((ayf) xvf0Var).get());
            case 4:
                return new b((d) ((ayf) xvf0Var3).get(), (f) ((ayf) xvf0Var2).get(), (com.ybsdk.feature.dashboard.internal.data.b) ((wif) xvf0Var).get(), (a) xvf0Var4.get());
            case 5:
                return new edh((Context) xvf0Var4.get(), (Lifecycle) ((k7g) xvf0Var2).get(), (tt2) ((e7g) xvf0Var).get(), (fva0) xvf0Var3.get());
            case 6:
                return new cwh((wiq0) ((w0g) xvf0Var2).get(), (k) ((qii) xvf0Var).get(), (zuj0) xvf0Var4.get(), (c) xvf0Var3.get());
            case 7:
                return new apf((Context) ((iyf) xvf0Var4).get(), (hwy0) ((iyf) xvf0Var3).get(), (o2i) ((n3w) xvf0Var2).a, (dci) ((iyf) xvf0Var).get(), 10);
            case 8:
                return new n3i((wiq0) ((tyf) xvf0Var4).get(), (pwy0) ((tyf) xvf0Var3).get(), (o3i) ((tyf) xvf0Var2).get(), (pj) ((rwh) xvf0Var).get());
            case 9:
                return new DeliveryD2dRequirementView((Context) ((tyf) xvf0Var4).get(), (pav) ((tyf) xvf0Var3).get(), (n3i) ((bpf) xvf0Var2).get(), (jgv) ((tyf) xvf0Var).get());
            case 10:
                return new ru.yandex.taxi.logistics.sdk.deliverydashboard.data.a(i5m.a(xvf0Var4), (f5i) xvf0Var3.get(), (j5i) ((epf) xvf0Var2).get(), ((v3i) ((kyf) xvf0Var).b.c).a);
            case 11:
                return new ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.d((h4i) ((kyf) xvf0Var2).b.x, (ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.c) xvf0Var4.get(), (ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.c) ((epf) xvf0Var).get(), (ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.b) xvf0Var3.get());
            case 12:
                return new DeliveryExplicitCommentCourierView((Context) ((lyf) xvf0Var2).get(), (g3i) xvf0Var4.get(), (s8i) xvf0Var3.get(), (r8i) ((n3w) xvf0Var).a);
            case 13:
                return new ru.yandex.taxi.delivery.extracted_delivery_form.interactors.f((vsi) xvf0Var4.get(), (jvi) xvf0Var3.get(), (e) ((wrh) xvf0Var2).get(), (nji0) xvf0Var.get());
            case 14:
                return new rgi((ru.yandex.taxi.delivery.impl.paid_insurance.d) xvf0Var4.get(), xvf0Var3, (ngi) ((rwh) xvf0Var2).get(), (oep0) xvf0Var.get());
            case 15:
                return new com.yandex.go.delivery.sdd_slots_selector.a((ru.yandex.taxi.widget.c) ((pyf) xvf0Var4).get(), (boi) ((n3w) xvf0Var3).a, (foi) ((n3w) xvf0Var2).a, (uze0) ((pyf) xvf0Var).get());
            case 16:
                return new koi((qcp0) ((qyf) xvf0Var3).get(), (moi) xvf0Var4.get(), (joi) ((ryf) xvf0Var2).get(), (coi) ((ryf) xvf0Var).get());
            case 17:
                return new moi((Context) ((qyf) xvf0Var3).get(), (hwy0) ((qyf) xvf0Var2).get(), (dci) ((qyf) xvf0Var).get(), (poi) xvf0Var4.get());
            case 18:
                return new poi((joi) ((ryf) xvf0Var3).b.b, (coi) ((ryf) xvf0Var2).b.c, (d5u0) xvf0Var4.get(), (m8h) ((gmh) xvf0Var).get());
            case 19:
                return new com.yandex.go.taxi.order.cancel.popup.model.a((tt2) ((xyf) xvf0Var4).get(), (xdf) ((xyf) xvf0Var3).get(), (pdc) ((xyf) xvf0Var2).get(), (k7x0) ((xyf) xvf0Var).get());
            case 20:
                return new com.yandex.go.taxi.order.detailed_price.domain.mapper.a((pdc) ((zyf) xvf0Var4).get(), (v3j) ((zyf) xvf0Var3).get(), (ru.yandex.taxi.widget.c) ((zyf) xvf0Var2).get(), (ru.yandex.taxi.widget.utils.e) ((zyf) xvf0Var).get());
            case 21:
                return new com.yandex.go.taxi.order.detailed_price.domain.c((com.yandex.go.taxi.order.detailed_price.data.a) ((pgi) xvf0Var4).get(), (com.yandex.go.taxi.order.detailed_price.domain.mapper.a) ((bpf) xvf0Var3).get(), (pwy0) ((zyf) xvf0Var2).get(), (tt2) ((zyf) xvf0Var).get());
            case 22:
                return new apf((z22) ((twf) xvf0Var2).get(), (FlexAdapter) xvf0Var4.get(), (rbs) xvf0Var3.get(), (oaj) ((twf) xvf0Var).get(), 20);
            case 23:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input.b((u3s) ((n3w) xvf0Var3).a, (p6s) ((p1g) xvf0Var2).get(), (ujj) xvf0Var4.get(), (sae) ((srb) xvf0Var).get());
            case 24:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input.c((p070) ((lq40) xvf0Var2).get(), (hwo0) ((z6x0) xvf0Var).get(), (bkj) xvf0Var4.get(), (yjj) xvf0Var3.get());
            case 25:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.b((u3s) ((n3w) xvf0Var4).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.a) ((faj) xvf0Var3).get(), (hwy0) ((gxf) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
            case 26:
                return new com.ybsdk.feature.status.screen.internal.data.a((DivkitCommonScreenApi) ((gmh) xvf0Var4).get(), (com.ybsdk.common.a) ((byf) xvf0Var3).get(), (tvv) ((byf) xvf0Var2).get(), (y1r0) ((byf) xvf0Var).get());
            case 27:
                return new com.yandex.go.navigator.utils.d((vlm) ((k4g) xvf0Var2).get(), (po21) xvf0Var4.get(), (tt2) xvf0Var3.get(), (el00) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.due_selector.impl.domain.interactor.price.e((com.yandex.go.taxi.tariffs.repository.a) ((izf) xvf0Var3).get(), (vwm) ((gwm) xvf0Var2).get(), (cwm) xvf0Var4.get(), (tt2) ((izf) xvf0Var).get());
            default:
                return new wjm((cjw0) ((jzf) xvf0Var4).get(), (nf7) ((fzf) xvf0Var3).get(), (dqe0) ((fzf) xvf0Var2).get(), (jtq0) ((jzf) xvf0Var).get(), 4);
        }
    }

    public /* synthetic */ bpf(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ bpf(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, byte b) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ bpf(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, char c) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ bpf(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.b = xvf0Var4;
    }

    public /* synthetic */ bpf(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.d = xvf0Var;
        this.e = v7pVar;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
    }

    public bpf(qyf qyfVar, xvf0 xvf0Var, ryf ryfVar, ryf ryfVar2) {
        this.a = 16;
        this.c = qyfVar;
        this.b = xvf0Var;
        this.d = ryfVar;
        this.e = ryfVar2;
    }

    public bpf(j7g j7gVar, k7g k7gVar, e7g e7gVar, l7g l7gVar) {
        this.a = 5;
        this.b = j7gVar;
        this.d = k7gVar;
        this.e = e7gVar;
        this.c = l7gVar;
    }
}
