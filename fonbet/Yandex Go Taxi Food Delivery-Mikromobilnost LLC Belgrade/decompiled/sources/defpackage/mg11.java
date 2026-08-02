package defpackage;

import android.content.Context;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.go.navigator.domain.b0;
import com.yandex.go.taxi.summary.shared.requirement.e;
import com.yandex.go.universal_qr_scanner.domain.camera.permission.d;
import com.yandex.go.vault.data.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import kotlin.a;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.h;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;
import ru.yandex.taxi.summary.solid.interactor.t;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class mg11 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ mg11(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a201(8, (v770) ((n3w) xvf0Var2).a, (o7r0) ((y501) xvf0Var).get());
            case 1:
                wnt wntVar = (wnt) ((tbg) xvf0Var2).get();
                zuj0 zuj0Var = (zuj0) ((tbg) xvf0Var).get();
                cjw0 cjw0Var = new cjw0();
                cjw0Var.a = wntVar;
                cjw0Var.b = zuj0Var;
                cjw0Var.c = a.a(new pv01(6, cjw0Var));
                return cjw0Var;
            case 2:
                return new lz11((ibw0) ((sag) xvf0Var2).get(), (mz11) xvf0Var.get());
            case 3:
                return new com.yandex.go.universal_qr_scanner.domain.camera.a((Context) ((sag) xvf0Var2).get(), (er7) xvf0Var.get());
            case 4:
                return new com.yandex.go.universal_qr_scanner.domain.camera.permission.a((v7j0) ((sag) xvf0Var2).get(), (pz11) xvf0Var.get());
            case 5:
                return new d(i5m.a((on11) xvf0Var2), (pz11) xvf0Var.get());
            case 6:
                return new wz11((vr) ((tw11) xvf0Var2).get(), (b021) xvf0Var.get());
            case 7:
                return new a201(12, (zuj0) ((sag) xvf0Var2).get(), (a121) xvf0Var.get());
            case 8:
                return new kcz0((a201) ((mg11) xvf0Var2).get(), (a121) xvf0Var.get());
            case 9:
                return new a521((s421) ((ibz0) xvf0Var2).get(), (e) ((fy30) xvf0Var).get());
            case 10:
                return new h((AppVisibilitySubscriptionImpl) ((jbg) xvf0Var2).get(), (com.yandex.delivery.utils.push.impl.a) ((jbg) xvf0Var).get());
            case 11:
                return new lb21((des0) xvf0Var2.get(), (dyp0) ((z1n0) xvf0Var).get());
            case 12:
                return new kcz0((ru.yandex.taxi.logistics.sdk.photocomments.domain.a) xvf0Var2.get(), (u1n) ((k0n) xvf0Var).get());
            case 13:
                return new b0((po21) xvf0Var2.get(), (ru.yandex.taxi.deeplinks.e) ((k4g) xvf0Var).get());
            case 14:
                return new com.yandex.go.data.mappers.a((bq21) xvf0Var2.get(), (c) ((icg) xvf0Var).get());
            case 15:
                return new UsualOptionSelectorView((Context) xvf0Var2.get(), (qv21) ((uw11) xvf0Var).get());
            case 16:
                return new a201(16, (axm) ((u0g) xvf0Var2).get(), (nf7) ((t0g) xvf0Var).get());
            case 17:
                return new z231((o7r0) ((tw11) xvf0Var2).get(), (pho) ((jcg) xvf0Var).get());
            case 18:
                return new b((com.yandex.go.zone.repository.d) ((jcg) xvf0Var2).get(), (k331) xvf0Var.get());
            case 19:
                return ((Yatagan$FeedSdkComponent) ((mir) ((jcg) xvf0Var).get()).a((vlr) xvf0Var2.get())).x();
            case 20:
                return ((mjr) ((jcg) xvf0Var2).get()).a(kjr.w, (com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 21:
                return new r331((wnt) ((jcg) xvf0Var2).get(), (i331) xvf0Var.get());
            case 22:
                return new com.yandex.go.vault.ui.a((pav) ((jcg) xvf0Var).get(), (k7x0) ((jcg) xvf0Var2).get());
            case 23:
                return new uio0((zuj0) xvf0Var2.get(), (t) ((t4v0) xvf0Var).get());
            case 24:
                return new fk31(i5m.a(xvf0Var2), i5m.a((rbx0) xvf0Var));
            case 25:
                return new hk31((ag31) ((nb11) xvf0Var2).get(), (ck31) xvf0Var.get());
            case 26:
                return new sm31((pm31) ((nb11) xvf0Var2).get(), (AppAnalyticsReporter) xvf0Var.get());
            case 27:
                return new com.yandex.go.walking.navigation.impl.domain.interactor.b((ah00) ((pcg) xvf0Var2).get(), (po21) ((pcg) xvf0Var).get());
            case 28:
                return new a441(0, (e441) ((ocg) xvf0Var2).get(), (c441) ((ocg) xvf0Var).get());
            default:
                return new com.yandex.go.walking.navigation.impl.location_mock.settings.interactor.a((e441) ((ocg) xvf0Var2).get(), (com.yandex.go.walking.navigation.impl.location_mock.simulator.a) ((ocg) xvf0Var).get());
        }
    }
}
