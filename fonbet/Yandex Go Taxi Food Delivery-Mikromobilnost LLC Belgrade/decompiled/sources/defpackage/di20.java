package defpackage;

import android.content.Context;
import com.yandex.go.flex.common.actions.dto.OpenSelectPaymentMethodAction;
import com.yandex.go.flex.common.actions.dto.d;
import com.yandex.go.flex.common.utils.a;
import com.yandex.go.morphlex.data.f;
import com.yandex.go.navigator.safe.SaveOneKilometerTripInMissionControlApi;
import com.yandex.go.places.experiments.map.j;
import defpackage.b700;
import defpackage.i6r;
import defpackage.mu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.b;
import ru.yandex.taxi.masstransit.domain.g;
import ru.yandex.taxi.masstransit.trains.checkout.k;
import ru.yandex.taxi.order.recenter.NextRecenterButtonView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class di20 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public di20(qh4 qh4Var, peb pebVar, qh4 qh4Var2) {
        this.a = 2;
        this.c = qh4Var;
        this.b = pebVar;
        this.d = qh4Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 12;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new e100(10, (yfa) ((peb) xvf0Var3).get(), (l7x0) ((gxf) xvf0Var2).get(), (ryh) ((bs0) xvf0Var).get());
            case 1:
                return new dj20((SaveOneKilometerTripInMissionControlApi) xvf0Var3.get(), (hit) ((b2g) xvf0Var2).get(), (tt2) xvf0Var.get());
            case 2:
                return new e100(11, (oh4) ((qh4) xvf0Var2).get(), (yfa) ((peb) xvf0Var3).get(), (oh4) ((qh4) xvf0Var).get());
            case 3:
                return new tj20((m4v) ((xat) xvf0Var3).get(), (vdc) xvf0Var2.get(), (bh4) ((tl3) xvf0Var).get());
            case 4:
                return new b((e100) ((di20) xvf0Var3).get(), (hwy0) ((k3g) xvf0Var2).b.b, (qj20) xvf0Var.get());
            case 5:
                return new com.yandex.go.taxi.summary.mobilityhub.ui.overlay.b((ah00) xvf0Var3.get(), (b2l0) xvf0Var2.get(), (sv20) ((epf) xvf0Var).get());
            case 6:
                return new uv20((biv0) ((b1g) xvf0Var3).get(), (rft0) ((a1g) xvf0Var2).get(), (wdz) ((nwf) xvf0Var).get());
            case 7:
                return new e100(i2, (gzh) ((kyf) xvf0Var3).get(), (fl10) ((jl00) xvf0Var2).get(), (qdc) ((jyf) xvf0Var).get());
            case 8:
                final p370 p370Var = (p370) ((m3g) xvf0Var3).get();
                final i6r i6rVar = (i6r) xvf0Var2.get();
                final dwl dwlVar = new dwl((k6x) xvf0Var.get());
                return new nu() { // from class: com.yandex.go.flex.common.actions.payment.method.a
                    @Override // defpackage.nu
                    public final mu create() {
                        return new mu("OpenSelectPaymentMethodScreen", qoi0.a(OpenSelectPaymentMethodAction.class), new OpenPaymentMethodDescriptorProviderImpl$create$1$1(0, OpenSelectPaymentMethodAction.Companion, d.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new b700(13, i6r.this, p370Var, dwlVar)), EmptyList.a, false);
                    }
                };
            case 9:
                return new f((Context) ((m3g) xvf0Var3).get(), (a) ((m3g) xvf0Var2).get(), (k6x) xvf0Var.get());
            case 10:
                return new da0(i2, (w030) ((f3g) xvf0Var3).get(), (zuj0) ((g3g) xvf0Var2).get(), (at20) ((f3g) xvf0Var).get());
            case 11:
                return new g((ru.yandex.taxi.masstransit.datasource.routing.f) xvf0Var3.get(), (c) xvf0Var2.get(), (ru.yandex.taxi.masstransit.domain.c) ((xh) xvf0Var).get());
            case 12:
                return new ti30((Context) xvf0Var3.get(), (dwc) xvf0Var2.get(), (w3i) ((bo2) xvf0Var).get());
            case 13:
                return new sw30((ajd) ((b3g) xvf0Var3).get(), (wu30) ((f3g) xvf0Var2).get(), i5m.a((b3g) xvf0Var));
            case 14:
                return new h540((xcv0) ((vrt0) xvf0Var3).get(), (dei0) ((v3g) xvf0Var2).get(), (b040) xvf0Var.get());
            case 15:
                return new k((xdf) ((r3g) xvf0Var2).get(), (zuj0) ((y3g) xvf0Var).get(), (c) ((r3g) xvf0Var3).get());
            case 16:
                return new bf8(3, (wiq0) ((w0g) xvf0Var3).get(), (com.yandex.go.taxi.summary.router.a) xvf0Var2.get(), (mo40) ((v0g) xvf0Var).get());
            case 17:
                return new ru.yandex.taxi.multiexit.a((c) ((a4g) xvf0Var3).get(), (vmw0) ((a4g) xvf0Var2).get(), (mq40) ((n3w) xvf0Var).a);
            case 18:
                return new com.yandex.go.places.impl.domain.interactors.my.places.a((ru.yandex.taxi.favorites.data.repo.a) ((x4g) xvf0Var3).get(), (j) xvf0Var2.get(), (pav) xvf0Var.get());
            case 19:
                return new ed50((bt00) ((k4g) xvf0Var3).get(), (ah00) xvf0Var2.get(), (ru.yandex.taxi.map_common.style.domain.a) xvf0Var.get());
            case 20:
                return new bf50((dne0) xvf0Var3.get(), (r6r0) ((m7q0) xvf0Var2).get(), (j5z) ((f4g) xvf0Var).get());
            case 21:
                return new ei50((mf00) ((n4g) xvf0Var3).get(), (e) xvf0Var2.get(), (ru.yandex.taxi.logistics.ndd_map.pin.g) xvf0Var.get());
            case 22:
                return new fi50((li50) ((ge50) xvf0Var3).get(), (uli) ((n4g) xvf0Var2).get(), (u9i) xvf0Var.get());
            case 23:
                return new e100(23, (ru.yandex.taxi.logistics.experiments.k) ((n4g) xvf0Var3).get(), (ej50) xvf0Var2.get(), (hj50) xvf0Var.get());
            case 24:
                return new aj50((ji50) ((n3w) xvf0Var3).a, (zuj0) ((n4g) xvf0Var2).get(), (ru.yandex.taxi.logistics.experiments.k) ((n4g) xvf0Var).get());
            case 25:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.a(i5m.a(xvf0Var3), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var2).get(), (k360) ((gbg) xvf0Var).get());
            case 26:
                return new NextRecenterButtonView((Context) xvf0Var3.get(), (com.yandex.go.taxi.order.recenter.c) ((jc50) xvf0Var2).get(), (l1t) xvf0Var.get());
            case 27:
                ((kj7) xvf0Var3).get();
                ((ig7) xvf0Var2).get();
                ((owf) xvf0Var).get();
                return new ity();
            case 28:
                ((jc50) xvf0Var2).get();
                return new egz();
            default:
                return new com.ybsdk.di.modules.features.nfc.a((q960) xvf0Var3.get(), (egz) ((lq40) xvf0Var2).get(), (nbp0) xvf0Var.get());
        }
    }

    public /* synthetic */ di20(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
