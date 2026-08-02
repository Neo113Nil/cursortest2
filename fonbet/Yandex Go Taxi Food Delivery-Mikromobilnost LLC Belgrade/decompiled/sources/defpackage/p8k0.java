package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import com.yandex.go.scooters.data.mapper.b;
import com.yandex.go.taxi.order.details.v2.domain.a11y.e;
import com.yandex.go.taxi.order.details.v2.state.elements.feedback.comment.c;
import com.yandex.go.taxi.order.details.v2.state.elements.photo.a;
import com.yandex.go.timer.k;
import com.yandex.messaging.ChatRequest;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.ext.d;
import com.ybsdk.feature.persistence.api.StorageType;
import com.ybsdk.rconfig.configs.HapticFeedbackFlag;
import ru.yandex.taxi.preorder.summary.solid.interactors.z;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.data.v;
import ru.yandex.taxi.scooters.data.w;
import ru.yandex.taxi.scooters.domain.f;
import ru.yandex.taxi.scooters.domain.o;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class p8k0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ p8k0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public static p8k0 a(xvf0 xvf0Var, xvf0 xvf0Var2, lyh lyhVar, xvf0 xvf0Var3) {
        return new p8k0(xvf0Var, xvf0Var2, lyhVar, xvf0Var3, 28);
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
                return new e((q8k0) xvf0Var4.get(), (tt2) xvf0Var3.get(), (ky2) xvf0Var2.get(), (h8k0) xvf0Var.get());
            case 1:
                return new t8k0((k) xvf0Var4.get(), (crg) xvf0Var3.get(), (xdf) xvf0Var2.get(), (o2y0) xvf0Var.get());
            case 2:
                return new c((o2y0) xvf0Var4.get(), (lbk0) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 3:
                return new xjk0((irs0) xvf0Var4.get(), (sqs0) xvf0Var3.get(), (lnk0) xvf0Var2.get(), (jgv) xvf0Var.get());
            case 4:
                return new a((tt2) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (jgv) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 5:
                return new com.yandex.go.taxi.order.details.v2.state.elements.slider.a((jgv) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (sqs0) xvf0Var.get());
            case 6:
                return new com.yandex.go.scooters.passes.active.v3.renew.menu.e((Context) xvf0Var4.get(), (ru.yandex.taxi.widget.c) xvf0Var3.get(), (bia0) xvf0Var2.get(), (rea0) xvf0Var.get());
            case 7:
                return new b((xdf) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (ukn0) xvf0Var.get());
            case 8:
                return new com.yandex.go.scooters.authorization.b((r) xvf0Var4.get(), xvf0Var3, (com.yandex.go.scooters.domain.b) xvf0Var2.get(), xvf0Var);
            case 9:
                return new com.yandex.go.scooters.domain.e((ru.yandex.taxi.scooters.data.mapper.c) xvf0Var4.get(), (com.yandex.go.scooters.data.a) xvf0Var3.get(), (h) xvf0Var2.get(), (com.yandex.go.scooters.payments.data.c) xvf0Var.get());
            case 10:
                return new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.e((zuy) xvf0Var4.get(), (aan0) xvf0Var3.get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.a) xvf0Var2.get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.a) xvf0Var.get());
            case 11:
                return new f((w) xvf0Var4.get(), (v) xvf0Var3.get(), (acn0) xvf0Var2.get(), (ywm0) xvf0Var.get());
            case 12:
                return new com.yandex.go.scooters.domain.w((ah00) xvf0Var4.get(), (ru.yandex.taxi.scooters.domain.c) xvf0Var3.get(), (obn0) xvf0Var2.get(), (t2o0) xvf0Var.get());
            case 13:
                return new com.yandex.go.scooters.qr.domain.result.a((po21) xvf0Var4.get(), (qoo0) xvf0Var3.get(), (com.yandex.go.scooters.qr.domain.c) xvf0Var2.get(), (q) xvf0Var.get());
            case 14:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.f((Context) xvf0Var4.get(), (ky2) xvf0Var3.get(), (o) xvf0Var2.get(), (vvo0) xvf0Var.get());
            case 15:
                return new t((xxo0) xvf0Var4.get(), (qxo0) xvf0Var3.get(), (Context) xvf0Var2.get(), (w030) xvf0Var.get());
            case 16:
                return new n5p0((n6n0) xvf0Var4.get(), (y5p0) xvf0Var3.get(), (s6n0) xvf0Var2.get(), (z2o0) xvf0Var.get());
            case 17:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.e((xhp0) xvf0Var4.get(), (goe) xvf0Var3.get(), (u3s) xvf0Var2.get(), (a2y) xvf0Var.get());
            case 18:
                Context context = (Context) xvf0Var4.get();
                com.ybsdk.persistence.b bVar = (com.ybsdk.persistence.b) xvf0Var3.get();
                com.ybsdk.rconfig.b bVar2 = (com.ybsdk.rconfig.b) xvf0Var2.get();
                return new d(context, bVar.c, ((nbp0) xvf0Var.get()).a, ((HapticFeedbackFlag) bVar2.d(x6u.a).getData()).isNativeHapticEnabled());
            case 19:
                Context context2 = (Context) xvf0Var4.get();
                AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) xvf0Var3.get();
                a1b0 a1b0Var = (a1b0) xvf0Var2.get();
                return new com.ybsdk.feature.divkit.api.data.a(context2, appAnalyticsReporter, ((c1b0) a1b0Var).a(StorageType.SKELETON_UPDATE_STATE), (Moshi) xvf0Var.get());
            case 20:
                return new z((yaj0) xvf0Var4.get(), (c4r0) xvf0Var3.get(), (uze0) xvf0Var2.get(), (b8r) xvf0Var.get());
            case 21:
                return new hwo0((String) xvf0Var4.get(), (ck31) xvf0Var3.get(), (c8r) xvf0Var2.get(), (c4r0) xvf0Var.get(), 7);
            case 22:
                return new com.yandex.messaging.internal.view.input.c((ChatRequest) xvf0Var4.get(), (com.yandex.messaging.internal.chat.info.settings.domain.a) xvf0Var3.get(), (mdb) xvf0Var2.get(), (kse) xvf0Var.get());
            case 23:
                return new com.yandex.messaging.miniapps.js.listeners.e((oh20) xvf0Var4.get(), (th20) xvf0Var3.get(), (sh20) xvf0Var2.get(), (x22) xvf0Var.get());
            case 24:
                return new hwo0((Context) xvf0Var4.get(), (pkr0) xvf0Var3.get(), (ru.yandex.taxi.favorites.data.repo.a) xvf0Var2.get(), (zuj0) xvf0Var.get(), 9);
            case 25:
                return new y8s0((dqe0) xvf0Var4.get(), (rjt0) xvf0Var3.get(), (tq1) xvf0Var2.get(), (rft0) xvf0Var.get());
            case 26:
                return new blt0((elt0) xvf0Var4.get(), (odt) xvf0Var3.get(), (ChatRequest) xvf0Var2.get(), (b00) xvf0Var.get());
            case 27:
                return new spt0((yv0) xvf0Var4.get(), (ru.yandex.taxi.deeplinks.b) xvf0Var3.get(), (fx60) xvf0Var2.get(), (set0) xvf0Var.get());
            case 28:
                return new com.yandex.go.splash.performance.a((ru.yandex.taxi.perf.frame.a) xvf0Var4.get(), (i9n) xvf0Var3.get(), (com.yandex.go.splash.dynamic.a) xvf0Var2.get(), (tse) xvf0Var.get());
            default:
                return new com.yandex.messaging.internal.view.input.d((Activity) xvf0Var4.get(), (kse) xvf0Var3.get(), (SharedPreferences) xvf0Var2.get(), (com.yandex.messaging.internal.view.input.c) xvf0Var.get());
        }
    }
}
