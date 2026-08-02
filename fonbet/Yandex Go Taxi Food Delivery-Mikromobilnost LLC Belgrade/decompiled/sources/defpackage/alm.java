package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.payments.shared.family.invites.d;
import com.yandex.go.shortcuts.impl.repository.s;
import com.yandex.go.splash.dynamic.a;
import com.yandex.go.splash.dynamic.b;
import com.yandex.go.taxi.order.q;
import com.yandex.go.taxi.order.u;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.messaging.domain.folders.i;
import java.io.File;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.e;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.experiments.superapp.k;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.notifications.g;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes9.dex */
public final class alm implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ alm(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
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
                return new zkm((Context) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (xk60) xvf0Var2.get(), (g) xvf0Var.get());
            case 1:
                return new a22((zuj0) xvf0Var.get());
            case 2:
                return new b((a) xvf0Var4.get(), (Context) xvf0Var3.get(), (h9n) xvf0Var2.get(), (tse) xvf0Var.get());
            case 3:
                return new jbn((rqo) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (RequirementsChangedNotifier) xvf0Var.get());
            case 4:
                return new lfn((i6r) xvf0Var4.get(), (com.yandex.go.order.bundle.map.impl.data.repository.g) xvf0Var3.get(), (h) xvf0Var2.get(), (n6w0) xvf0Var.get());
            case 5:
                return new ru.yandex.taxi.settings.email.a(i5m.a(xvf0Var4), (c) xvf0Var3.get(), (hit) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 6:
                return new cxq0((ru.yandex.taxi.startup.launch.h) xvf0Var4.get(), (f0) xvf0Var3.get(), (kb20) xvf0Var2.get(), (rs2) xvf0Var.get());
            case 7:
                return new mso((t8i) xvf0Var4.get(), (l8i) xvf0Var3.get(), (wfi) xvf0Var2.get(), (dqe0) xvf0Var.get());
            case 8:
                return new com.yandex.go.explorer.impl.data.repositories.c((com.yandex.go.explorer.impl.data.storage.a) xvf0Var4.get(), (duo) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ato) xvf0Var.get());
            case 9:
                return new ixo((jtq0) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (hxo) xvf0Var2.get(), (mxo) xvf0Var.get());
            case 10:
                return new d((com.yandex.go.payments.shared.family.invites.data.a) xvf0Var4.get(), (i6r) xvf0Var3.get(), (xbp) xvf0Var2.get(), (i130) xvf0Var.get());
            case 11:
                return new com.yandex.go.payments.shared.family.invites.data.a((ebp) xvf0Var4.get(), (com.yandex.go.payments.shared.family.invites.data.b) xvf0Var3.get(), (xbp) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 12:
                return new ru.yandex.taxi.favorites.address.impl.b((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (ru.yandex.taxi.favorites.address.impl.ui.b) xvf0Var2.get(), (kdp) xvf0Var.get());
            case 13:
                return new com.yandex.go.flex.main_screen.presentation.feed.a((ra00) xvf0Var4.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), xvf0Var2, (com.yandex.go.lifecycle.a) xvf0Var.get());
            case 14:
                return new vtq((hit) xvf0Var4.get(), (u) xvf0Var3.get(), (dm21) xvf0Var2.get(), (FeedbackStrategy) xvf0Var.get());
            case 15:
                return new q((tse) xvf0Var4.get(), (FeedbackApi) xvf0Var3.get(), (ysg) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.deeplinks.h((dne0) xvf0Var4.get(), (Activity) xvf0Var3.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 17:
                Context context = (Context) xvf0Var4.get();
                tse tseVar = (tse) xvf0Var3.get();
                k kVar = (k) xvf0Var2.get();
                pgr pgrVar = (pgr) xvf0Var.get();
                File cacheDir = context.getCacheDir();
                File cacheDir2 = context.getCacheDir();
                new jq90();
                kotlinx.serialization.modules.a aVar = new kotlinx.serialization.modules.a();
                s8o.Q(aVar);
                flex.network.cache.a aVar2 = new flex.network.cache.a(ny2.a, cacheDir, cacheDir2, tje.a(sbx.d, new weu(20, aVar.a())));
                if (!((k5w0) kVar.a.c()).c) {
                    return aVar2;
                }
                pgrVar.getClass();
                return new com.yandex.go.flex.common.a(aVar2, tseVar);
            case 18:
                return new r((e1s) xvf0Var4.get(), (uze0) xvf0Var3.get(), (qbl0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 19:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.d((c7s) xvf0Var4.get(), (e) xvf0Var3.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c) xvf0Var2.get(), (zqb0) xvf0Var.get());
            case 20:
                return new com.yandex.go.flex.common.facade.routers.a((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (yhr) xvf0Var2.get(), (e2x0) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.address.experiment.d((rqo) xvf0Var4.get(), (pdc) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 22:
                return new com.yandex.messaging.internal.e((com.yandex.messaging.internal.authorized.chat.b) xvf0Var4.get(), (k020) xvf0Var3.get(), (m3b) xvf0Var2.get(), (kse) xvf0Var.get());
            case 23:
                return new i((com.yandex.messaging.domain.chat.g) xvf0Var4.get(), (j4t) xvf0Var3.get(), (k020) xvf0Var2.get(), (kse) xvf0Var.get());
            case 24:
                return new com.yandex.messaging.domain.miniapp.c((com.yandex.messaging.internal.authorized.chat.b) xvf0Var4.get(), (f920) xvf0Var3.get(), (kse) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 25:
                return new com.yandex.go.flex.main_screen.domain.a((wnt) xvf0Var4.get(), (s) xvf0Var3.get(), (o5t) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 26:
                return new zoy0((wjt) xvf0Var4.get(), (com.yandex.messaging.domain.personal.a) xvf0Var3.get(), (w5t) xvf0Var2.get(), (kse) xvf0Var.get());
            case 27:
                return new com.yandex.messaging.domain.user.b((nft) xvf0Var4.get(), (w5t) xvf0Var3.get(), (np21) xvf0Var2.get(), (kse) xvf0Var.get());
            case 28:
                return new com.yandex.go.payments.cards.nfc.navigation.a((Context) xvf0Var4.get(), (com.yandex.go.payments.cards.pci_dss.recognition.a) xvf0Var3.get(), (gd0) xvf0Var2.get(), (uq1) xvf0Var.get());
            default:
                return new com.yandex.go.preorder.payments.a((fvt) xvf0Var4.get(), xvf0Var3, (oep0) xvf0Var2.get(), (Activity) xvf0Var.get());
        }
    }
}
