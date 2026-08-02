package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.places.impl.data.mappers.organizations.f;
import com.yandex.go.places.impl.data.mappers.organizations.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.about.internal.presentation.AboutComposeFragment;
import com.ybsdk.feature.about.internal.presentation.AboutFragment;
import com.ybsdk.feature.autotopup.internal.domain.c;
import com.ybsdk.rconfig.b;
import java.util.Set;
import ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.a;
import ru.yandex.taxi.logistics.sdk.promotions.impl.data.e;

/* loaded from: classes5.dex */
public final class p4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final Object c;

    public /* synthetic */ p4(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public static d5 a(i5 i5Var, tw51 tw51Var) {
        int i = 0;
        int i2 = 1;
        t4 t4Var = new t4(new gwf(tw51Var, 3), new gwf(tw51Var, i), new gwf(tw51Var, 2), new gwf(tw51Var, i2), 1);
        return new d5(new j5(new bwb0((b) ((h9g) tw51Var).v.A.get())), ImmutableMap.j(AboutFragment.class, new a5(t4Var, i2), AboutComposeFragment.class, new a5(t4Var, i)));
    }

    public static p4 b(c1 c1Var, xvf0 xvf0Var) {
        return new p4((Object) c1Var, xvf0Var, 9);
    }

    public static p4 c(p4 p4Var, c1 c1Var) {
        return new p4((Object) p4Var, (xvf0) c1Var, 10);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 4;
        int i3 = 3;
        xvf0 xvf0Var = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.data.b((a) ((f4) obj).get(), (l4) xvf0Var.get());
            case 1:
                return a((i5) obj, (tw51) xvf0Var.get());
            case 2:
                return new nb((l7x0) ((ibg) obj).get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) ((gpx0) xvf0Var).get());
            case 3:
                return new h0w(i2, (ru.yandex.taxi.logistics.sdk.photocomments.domain.a) xvf0Var.get(), (p370) ((tgb0) obj).get());
            case 4:
                o5s o5sVar = (o5s) xvf0Var.get();
                yj70 yj70Var = (yj70) ((l180) obj).get();
                m2v m2vVar = new m2v();
                m2vVar.a = o5sVar;
                m2vVar.b = yj70Var;
                gci0 gci0Var = o5sVar.c;
                m2vVar.c = new pb(gci0Var, i3);
                m2vVar.w = new pb(gci0Var, i2);
                return m2vVar;
            case 5:
                cu0 cu0Var = (cu0) ((l2g) obj).get();
                return new tgg(v4r0.h(cu0Var.a(), (Set) ((y2r0) xvf0Var).get()));
            case 6:
                return new h0w(5, (vv0) xvf0Var.get(), (z5s) ((prq) obj).get());
            case 7:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field.a((g191) ((bs0) obj).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) ((v7p) xvf0Var).get());
            case 8:
                return new aa1((cov0) ((l9t0) obj).get(), (zuj0) xvf0Var.get());
            case 9:
                return new xn1((b1) ((c1) obj).get(), (dei0) xvf0Var.get());
            case 10:
                return new tp1((xn1) ((p4) obj).get(), (po1) xvf0Var.get());
            case 11:
                kg51 kg51Var = (kg51) xvf0Var.get();
                s621 s621Var = (s621) kg51Var.r.invoke((yy2) ((c1) obj).get());
                q5z.i(s621Var);
                return s621Var;
            case 12:
                return new ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.b((q8s) ((n3w) obj).a, (st2) ((exf) xvf0Var).get());
            case 13:
                return new wb3((dqe0) ((w0g) obj).get(), (xku0) ((t0g) xvf0Var).get());
            case 14:
                return new hk3((kj3) xvf0Var.get(), (ryh) ((oto0) obj).get());
            case 15:
                return new c((com.ybsdk.utils.poller.b) ((gwf) obj).get(), (com.ybsdk.feature.autotopup.internal.data.b) ((k4) xvf0Var).get());
            case 16:
                return new l04((Context) ((gwf) xvf0Var).get(), (AppAnalyticsReporter) ((gwf) obj).get());
            case 17:
                return new ss4((Context) xvf0Var.get(), (hwy0) ((w5g) obj).get(), 0);
            case 18:
                return new h0w(21, (qcp0) ((w5g) obj).get(), (ss4) ((p4) xvf0Var).get());
            case 19:
                return new ru.yandex.taxi.logistics.sdk.promotions.impl.domain.a((e) ((elo0) obj).get(), (st2) xvf0Var.get());
            case 20:
                return new h0w(22, (f) ((zi60) obj).get(), (g) ((zi60) xvf0Var).get());
            case 21:
                return new hf5((ru.yandex.logistics.sdk.cargo_form.impl.domain.c) ((eqh) obj).get(), (p6s) ((dxf) xvf0Var).get());
            case 22:
                return new zc(1, (j4n) ((wj0) obj).get(), (w030) xvf0Var.get());
            case 23:
                return new c06((ro01) ((qbg) obj).get(), (ru01) ((rbg) xvf0Var).get());
            case 24:
                return new md6(i3, (dei0) ((v4g) obj).get(), (gj6) ((t4g) xvf0Var).get());
            case 25:
                return new ru.yandex.taxi.bubbles.interactors.a((ru.yandex.taxi.e) xvf0Var.get(), (ru.yandex.taxi.share_favorites.experiments.c) ((zo0) obj).get());
            case 26:
                return new com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b((com.ybsdk.feature.transfer.version2.internal.screens.budget.data.a) ((tl3) obj).get(), (com.ybsdk.utils.poller.b) ((qbg) xvf0Var).get());
            case 27:
                return new c06((pj) ((xj7) obj).get(), (o61) ((xj7) xvf0Var).get());
            case 28:
                return new sj7((com.yandex.go.call_order_fallback.analytics.a) ((pg5) obj).get(), i5m.a(xvf0Var));
            default:
                return new ov7((ru.yandex.taxi.logistics.sdk.management.f) ((gbg) obj).get(), (String) xvf0Var.get());
        }
    }

    public /* synthetic */ p4(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = xvf0Var;
    }
}
