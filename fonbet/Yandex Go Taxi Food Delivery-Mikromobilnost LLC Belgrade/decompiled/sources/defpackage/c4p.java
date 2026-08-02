package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableMap;
import com.squareup.moshi.Moshi;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.requester.c;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.a0;
import com.ybsdk.di.modules.features.t;
import com.ybsdk.feature.futurepayments.internal.screens.FuturePaymentsFragment;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.j;
import ru.yandex.taxi.contacts.a;
import ru.yandex.taxi.contacts.h;
import ru.yandex.taxi.superapp.l;
import ru.yandex.taxi.superapp.p;
import ru.yandex.taxi.superapp.q;
import ru.yandex.taxi.superapp.u;
import ru.yandex.taxi.systemrequeirements.location.f;

/* loaded from: classes5.dex */
public final class c4p implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final Object c;

    public /* synthetic */ c4p(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public static tc9 a(lqs lqsVar, tw51 tw51Var) {
        return new tc9(ImmutableMap.g(FuturePaymentsFragment.class, new hbn(25, new z9n((xvf0) new njp(i5m.b(new hbn(26, new u1g(tw51Var, 0))), 21), (xvf0) n3w.a(tw51Var), (xvf0) new byf(tw51Var, 29), (xvf0) oqs.a, 15, false))), 2);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                jhu0 jhu0Var = (jhu0) ((szf) obj).get();
                return new h((a) jhu0Var.a, (tse) xvf0Var.get());
            case 1:
                k0w0 k0w0Var = (k0w0) ((szf) obj).get();
                return new j0w0((dwl) ((p7w0) k0w0Var.a.a).get(), (h1p) xvf0Var.get());
            case 2:
                jhu0 jhu0Var2 = (jhu0) ((szf) obj).get();
                return new ru.yandex.taxi.superapp.h((po21) jhu0Var2.a, (tse) xvf0Var.get());
            case 3:
                e6w0 e6w0Var = (e6w0) ((szf) obj).get();
                rvq0 rvq0Var = (rvq0) xvf0Var.get();
                e6w0Var.a.getClass();
                return new d6w0(rvq0Var);
            case 4:
                zxs0 zxs0Var = (zxs0) ((tzf) obj).get();
                return new l((g) zxs0Var.a, (j) zxs0Var.b, (tse) xvf0Var.get());
            case 5:
                hhs0 hhs0Var = (hhs0) ((tzf) obj).get();
                return new q((p) hhs0Var.b, (tt2) hhs0Var.c, (tse) xvf0Var.get());
            case 6:
                hwo0 hwo0Var = (hwo0) ((tzf) obj).get();
                return new u((Context) hwo0Var.b, (tt2) hwo0Var.c, (y50) hwo0Var.w, (f) hwo0Var.x, (tse) xvf0Var.get());
            case 7:
                ((szf) obj).get();
                return new msv0((s2p) xvf0Var.get());
            case 8:
                return new u1n(14, (lx4) xvf0Var.get(), (b1) ((c7n) obj).get());
            case 9:
                return new c(((twf) obj).b.g(), (wjm) ((pgi) xvf0Var).get());
            case 10:
                return new jdj((at2) xvf0Var.get(), (p1b) ((mu7) obj).get());
            case 11:
                return new zrm(21, (lg5) xvf0Var.get(), ((twf) obj).b.m());
            case 12:
                return new par((dne0) ((f4g) obj).get(), (zuj0) ((f4g) xvf0Var).get());
            case 13:
                return new wtr((pey) ((n3w) obj).a, (a3v) ((b3g) xvf0Var).get());
            case 14:
                return new ru.yandex.taxi.masstransit.utils.a((ah00) ((f3g) obj).get(), (a3v) xvf0Var.get());
            case 15:
                return new zrm((vfx0) xvf0Var.get(), (a0) ((prq) obj).get());
            case 16:
                return new p3s((l0i) ((m1g) obj).get(), (jln) ((hbn) xvf0Var).get());
            case 17:
                return new c4s((u3s) ((n3w) obj).a, (y3s) ((wrh) xvf0Var).get());
            case 18:
                return new gym((d5s) ((n1g) obj).get(), (y5s) ((cto) xvf0Var).get());
            case 19:
                return new ru.yandex.logistics.sdk.cargo_form.impl.photocomments.a((f4l0) ((fxf) obj).get(), (s5s) xvf0Var.get());
            case 20:
                return new t5s((p370) ((tgb0) obj).get(), (z5s) ((prq) xvf0Var).get());
            case 21:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.data.a((v5s) ((z9n) obj).get(), (gym) ((c4p) xvf0Var).get());
            case 22:
                return new u1n(23, (Moshi) xvf0Var.get(), (l6s) ((cuo) obj).get());
            case 23:
                return new r6s((String) ((n1g) obj).get(), (a6s) ((n1g) xvf0Var).b.k);
            case 24:
                return new com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.a((Transfer2Api) xvf0Var.get(), (t) ((qbg) obj).get());
            case 25:
                return a((lqs) obj, (tw51) xvf0Var.get());
            case 26:
                return new com.yandex.go.navigator.gas_stations.overview.a((pav) ((v1g) obj).get(), (zuj0) xvf0Var.get());
            case 27:
                ((nbg) obj).get();
                return new wly0();
            case 28:
                return new mkt((sjj0) ((n3w) obj).a, (gym) ((xat) xvf0Var).get());
            default:
                return new pkt((ViewGroup) ((n3w) obj).a, (c4p) xvf0Var);
        }
    }

    public /* synthetic */ c4p(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = xvf0Var;
    }
}
