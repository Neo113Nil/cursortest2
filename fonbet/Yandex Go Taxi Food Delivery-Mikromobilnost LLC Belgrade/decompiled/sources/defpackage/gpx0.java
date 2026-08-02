package defpackage;

import android.content.Context;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.go.multimodal_route.mappers.a;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.q0;
import com.yandex.go.taxi.order.ui.recenter.TaxiOrderTrackingRecenterButton;
import com.yandex.go.transfer_requirement.transferapi.TransferApi;
import com.ybsdk.di.modules.features.s;
import com.ybsdk.feature.transfer.internal.network.TransfersApi;
import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.d;
import ru.yandex.sdk.common.DurationFormatter;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.m;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.b;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class gpx0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public gpx0(tbg tbgVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 26;
        this.d = tbgVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new fpx0((tt2) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (epx0) ((z6x0) xvf0Var).get());
            case 1:
                return new a((c) ((y3g) xvf0Var3).get(), (e) ((y3g) xvf0Var2).get(), (xdf) ((y3g) xvf0Var).get());
            case 2:
                return new com.yandex.go.taxi.order.change.destinations.navigation.a((Context) xvf0Var3.get(), (w030) xvf0Var2.get(), (hhs0) ((rbx0) xvf0Var).get());
            case 3:
                return new izx0((kv1) ((rdt0) xvf0Var2).get(), (w030) xvf0Var3.get(), (pj) ((lu9) xvf0Var).get());
            case 4:
                return new v1y0((sm40) xvf0Var3.get(), (oh70) ((ph70) xvf0Var).get(), (x980) xvf0Var2.get());
            case 5:
                return new com.yandex.go.taxi.order.perf.session.a((tt2) xvf0Var3.get(), (oa1) ((n2y0) xvf0Var).get(), (i6y0) xvf0Var2.get());
            case 6:
                return new TaxiOrderTrackingRecenterButton((Context) xvf0Var3.get(), (c7y0) ((fat0) xvf0Var).get(), (l1t) xvf0Var2.get());
            case 7:
                return new d((st2) ((exf) xvf0Var2).get(), (p6s) ((dxf) xvf0Var).get(), (zhu0) xvf0Var3.get());
            case 8:
                return new cjw0((wiq0) ((izf) xvf0Var3).get(), (zuj0) ((izf) xvf0Var2).get(), (dqe0) ((izf) xvf0Var).get());
            case 9:
                return new cjw0((l7x0) xvf0Var3.get(), (yuj0) xvf0Var2.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((gpx0) xvf0Var).get());
            case 10:
                return new b((DurationFormatter) xvf0Var3.get(), (q8s) ((gbg) xvf0Var2).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((gpx0) xvf0Var).get());
            case 11:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a((l7x0) xvf0Var3.get(), (wpy0) ((qcz0) xvf0Var).get(), (q8s) xvf0Var2.get());
            case 12:
                return new ru.yandex.taxi.superapp.orders.multi.tracking.c((y280) xvf0Var3.get(), (zy70) xvf0Var2.get(), (bu0) ((gc) xvf0Var).get());
            case 13:
                return new m((ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c) ((gbg) xvf0Var3).get(), (x201) ((mzf) xvf0Var2).get(), (d301) ((mzf) xvf0Var).get());
            case 14:
                return new ru.yandex.taxi.logistics.sdk.tracking.preparer.a((z501) ((lbg) xvf0Var2).get(), (c701) ((n3w) xvf0Var3).a, (ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d) ((lbg) xvf0Var).get());
            case 15:
                return new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.d(i5m.a(xvf0Var3), (zri) xvf0Var2.get(), (ds0) ((y501) xvf0Var).get());
            case 16:
                return new com.yandex.go.navigator.domain.traffic_line.a((f4x) xvf0Var3.get(), (tt2) ((h4g) xvf0Var).get(), (zuj0) xvf0Var2.get());
            case 17:
                return new pc01((ru.yandex.taxi.masstransit.trains.config.a) ((y3g) xvf0Var3).get(), (zuj0) ((y3g) xvf0Var2).get(), (TransportRouteAnalytics$FlowOrigin) ((n3w) xvf0Var).a);
            case 18:
                return new com.yandex.go.transfer_requirement.transferapi.a((TransferApi) xvf0Var3.get(), (dqe0) ((w0g) xvf0Var).get(), (fh01) xvf0Var2.get());
            case 19:
                return new TransferMainResultFragment((lk01) ((n3w) xvf0Var3).a, (hu01) ((rbg) xvf0Var2).get(), (ca41) ((rbg) xvf0Var).get());
            case 20:
                return new com.ybsdk.feature.transfer.version2.internal.data.helpers.b((w530) ((qbg) xvf0Var3).get(), (eg01) ((y501) xvf0Var2).get(), (di01) ((qbg) xvf0Var).get());
            case 21:
                return new com.ybsdk.feature.transfer.internal.data.a((s) ((hag) xvf0Var2).get(), (TransfersApi) xvf0Var3.get(), (xr01) ((y501) xvf0Var).get());
            case 22:
                return new dp01((nf7) ((t0g) xvf0Var2).get(), i5m.a(xvf0Var3), (ulx0) ((qcz0) xvf0Var).get());
            case 23:
                return new g211((d0) ((d701) xvf0Var3).get(), (tt2) ((u3g) xvf0Var2).get(), (el00) ((v3g) xvf0Var).get());
            case 24:
                return new com.yandex.go.taxi.summary.mobilityhub.repository.a((ow30) xvf0Var3.get(), (com.yandex.go.route.interactor.b) ((l3g) xvf0Var).get(), (hpi0) xvf0Var2.get());
            case 25:
                return new te11((o3s) ((dxf) xvf0Var2).get(), (qe11) xvf0Var3.get(), (Moshi) ((exf) xvf0Var).get());
            case 26:
                return new yg11((zuj0) ((tbg) xvf0Var).get(), (gg11) xvf0Var3.get(), (ri11) xvf0Var2.get());
            case 27:
                return new w021((Context) ((sag) xvf0Var2).get(), (w030) ((sag) xvf0Var).get(), (r021) xvf0Var3.get());
            case 28:
                return new q0((x421) ((jpn0) xvf0Var2).get(), (com.yandex.go.summary.mapper.a) ((s3f0) xvf0Var).get(), (viv0) xvf0Var3.get());
            default:
                return new nk21((rj21) xvf0Var3.get(), (Looper) xvf0Var2.get(), (yo3) ((rs0) xvf0Var).get());
        }
    }

    public /* synthetic */ gpx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ gpx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, char c) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
    }

    public /* synthetic */ gpx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ gpx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
