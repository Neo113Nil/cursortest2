package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.div.legacy.DivContext;
import com.yandex.go.navigator.driving.top_view.DrivingTopView;
import com.yandex.go.summary.interactor.expanded.state.r;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.divkit.internal.domain.a;
import com.ybsdk.feature.divkit.internal.domain.b;
import com.ybsdk.feature.status.screen.internal.ui.DivkitCommonFragment;
import java.util.LinkedHashMap;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.d;
import ru.yandex.taxi.superapp.address.f;
import ru.yandex.taxi.superapp.g;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class oti implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ oti(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }

    public static csl a(gsl gslVar, tw51 tw51Var) {
        byf byfVar = new byf(tw51Var, 13);
        bpf bpfVar = new bpf(new gmh(new byf(tw51Var, 12), 20), new byf(tw51Var, 3), new byf(tw51Var, 10), new byf(tw51Var, 14), 26);
        byf byfVar2 = new byf(tw51Var, 5);
        byf byfVar3 = new byf(tw51Var, 11);
        byf byfVar4 = new byf(tw51Var, 6);
        gmh gmhVar = new gmh(new byf(tw51Var, 2), 21);
        int i = 15;
        byf byfVar5 = new byf(tw51Var, i);
        gmh gmhVar2 = new gmh(byfVar3, 19);
        pgi pgiVar = new pgi(n3w.a(new rsl(new st0(byfVar, bpfVar, byfVar2, byfVar3, byfVar4, gmhVar, byfVar5, gmhVar2, new byf(tw51Var, 9), new byf(tw51Var, 7), new gmh(new byf(tw51Var, 4), 22)))), gmhVar2, new byf(tw51Var, 8), i);
        LinkedHashMap A = gtq0.A(1);
        A.put(DivkitCommonFragment.class, pgiVar);
        csl cslVar = (csl) i5m.b(new dsl(ksl.a, new br00(A), 0)).get();
        q5z.i(cslVar);
        return cslVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new nti((dqe0) ((xvf0) obj).get(), (wfi) ((lyh) obj2).get());
            case 1:
                return new yvi((gzh) ((fxf) obj).get(), (qnh) ((gmh) obj2).get());
            case 2:
                return ((h0j) obj).b ? (x560) ((t160) obj2).get() : new rw60();
            case 3:
                return new p0j((cwb) ((xvf0) obj).get(), (wwf) ((oe3) obj2).get());
            case 4:
                return new j0g((pzf) ((xv8) obj).get(), (z501) ((ibg) obj2).get());
            case 5:
                return new qhj(svn.a, (z22) ((xvf0) obj).get(), (h6j0) ((vfg0) obj2).get());
            case 6:
                return new d130((jsj) ((xvf0) obj).get(), (a850) ((x4g) obj2).get(), ContentContainer$ZOrder.MOST_IMPORTANT, new qsj());
            case 7:
                return new ikk((Activity) ((xvf0) obj).get(), (faj) obj2);
            case 8:
                return new DivContext((Activity) ((bzf) obj2).get(), (ryk) ((xvf0) obj).get());
            case 9:
                return new a((c7l) ((czf) obj2).get(), (b) ((xvf0) obj).get());
            case 10:
                return a((gsl) obj2, (tw51) ((xvf0) obj).get());
            case 11:
                return new com.yandex.go.transfer_requirement.state.done_button.a((zuj0) ((pbg) obj).get(), (ru.yandex.taxi.design.utils.b) ((pbg) obj2).get());
            case 12:
                return new DrivingTopView((Context) ((xvf0) obj).get(), (ywz0) ((mrv0) obj2).get());
            case 13:
                return new bwm((zuj0) ((izf) obj).get(), (cjw0) ((y2s0) obj2).get());
            case 14:
                return new kxm((iqj0) ((n3w) obj).a, (dvm) ((fzf) obj2).get());
            case 15:
                return new r0n((wiq0) ((jzf) obj).get(), (d6i) ((jde0) obj2).get());
            case 16:
                return new n1n((ote0) ((xvf0) obj).get(), (wiq0) ((jzf) obj2).get());
            case 17:
                return new d((l7x0) ((xvf0) obj).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((gpx0) obj2).get());
            case 18:
                return new j8n((yuj0) ((gbg) obj).get(), (e) ((mzf) obj2).get());
            case 19:
                return new x9n((String) ((xvf0) obj).get(), (s701) ((ibg) obj2).get());
            case 20:
                return new com.yandex.go.eboks.objects.data.mapper.b((c) ((kzf) obj2).get(), (com.yandex.go.eboks.objects.data.b) ((xvf0) obj).get());
            case 21:
                return new zrm(5, (m) ((ut) obj).get(), (z501) ((ibg) obj2).get());
            case 22:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a((zrm) ((oti) obj2).get(), (String) ((xvf0) obj).get());
            case 23:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.editable_route_widget.a((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.b) ((qy8) obj).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector.b) ((c4) obj2).get());
            case 24:
                return new u1n(3, (oh4) ((qh4) obj).get(), (xk4) ((yk4) obj2).get());
            case 25:
                ryh ryhVar = (ryh) ((t51) obj).get();
                SourcePicker sourcePicker = ((s51) obj2).b.a;
                q5z.i(sourcePicker);
                return new f3o(ryhVar, sourcePicker);
            case 26:
                return new com.yandex.go.summary.interactor.expanded.state.a((dpo) ((xvf0) obj).get(), (r) ((nt0) obj2).get());
            case 27:
                return new u1n(12, (gzh) ((xvf0) obj).get(), (gym) ((hbn) obj2).get());
            case 28:
                g0t g0tVar = (g0t) ((szf) obj2).get();
                x6w0 x6w0Var = (x6w0) ((xvf0) obj).get();
                h0t h0tVar = g0tVar.a;
                ru.yandex.taxi.superapp.e eVar = (ru.yandex.taxi.superapp.e) h0tVar.a.get();
                return new f(eVar, (rvf0) h0tVar.c.get(), x6w0Var);
            default:
                zrm zrmVar = (zrm) ((jzf) obj2).get();
                return new g((tse) ((xvf0) obj).get(), (tt2) zrmVar.b, (com.yandex.go.superapp.web.domain.a) zrmVar.c);
        }
    }

    public /* synthetic */ oti(Object obj, xvf0 xvf0Var, int i, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = xvf0Var;
    }

    public /* synthetic */ oti(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
