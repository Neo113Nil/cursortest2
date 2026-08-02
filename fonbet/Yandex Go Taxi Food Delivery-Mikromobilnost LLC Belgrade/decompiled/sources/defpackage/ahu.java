package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.f;
import com.yandex.go.navigator.map_interactions.experiment.a;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.payments.paymentdomain.data.d;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.taxi.order.state.h;
import com.yandex.go.taxi.order.view.l;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.miniapps.js.listeners.b;
import ru.yandex.taxi.delivery.pin.k;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes15.dex */
public final class ahu implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ ahu(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public static ahu a(l180 l180Var, l180 l180Var2, dz90 dz90Var, l180 l180Var3, l180 l180Var4) {
        return new ahu(l180Var, l180Var2, dz90Var, l180Var3, l180Var4, 18);
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
                return new zgu((Looper) xvf0Var5.get(), (ml21) xvf0Var4.get(), (SharedPreferences) xvf0Var3.get(), (vgu) xvf0Var2.get(), (wff0) xvf0Var.get());
            case 1:
                return new b0x((x220) xvf0Var5.get(), (Fragment) xvf0Var4.get(), (a0x) xvf0Var3.get(), (j0x) xvf0Var2.get(), (j420) xvf0Var.get());
            case 2:
                return new o9x((Activity) xvf0Var5.get(), (p4t) xvf0Var4.get(), (mp11) xvf0Var3.get(), (h9x) xvf0Var2.get(), (ChatRequest) xvf0Var.get());
            case 3:
                return new mnz((hnz) xvf0Var5.get(), (knz) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (c) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 4:
                return new h((uw40) xvf0Var5.get(), (k5s0) xvf0Var4.get(), (q5s0) xvf0Var3.get(), (j780) xvf0Var2.get(), (kyx0) xvf0Var.get());
            case 5:
                return new o420((Looper) xvf0Var5.get(), (bfu) xvf0Var4.get(), (wff0) xvf0Var3.get(), (qtq0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 6:
                return new ph20((Activity) xvf0Var5.get(), (r8g) xvf0Var4.get(), (kse) xvf0Var3.get(), (b) xvf0Var2.get(), (x22) xvf0Var.get());
            case 7:
                return new dt20((y30) xvf0Var4.get(), (qcp0) xvf0Var3.get(), (hwy0) xvf0Var2.get(), (dci) xvf0Var.get(), 2);
            case 8:
                return new dr40((rqo) xvf0Var5.get(), (Context) xvf0Var4.get(), (tj60) xvf0Var3.get(), (pav) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 9:
                return new f((ah00) xvf0Var5.get(), (a) xvf0Var4.get(), (o) xvf0Var3.get(), (e) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 10:
                return new ru.yandex.taxi.search.address.view.h((Context) xvf0Var5.get(), (a3v) xvf0Var4.get(), (fk7) xvf0Var3.get(), (i130) xvf0Var2.get(), (cc60) xvf0Var.get());
            case 11:
                return new com.yandex.messaging.internal.authorized.chat.notifications.c((p150) xvf0Var5.get(), (o1b0) xvf0Var4.get(), (at2) xvf0Var3.get(), (xav) xvf0Var2.get(), (ab4) xvf0Var.get());
            case 12:
                return new ru.yandex.taxi.surge.router.a((i130) xvf0Var5.get(), (vf41) xvf0Var4.get(), (ru.yandex.taxi.am.token.a) xvf0Var3.get(), (tt2) xvf0Var2.get(), (fn21) xvf0Var.get());
            case 13:
                return new com.yandex.go.taxi.order.interactors.b((ed80) xvf0Var5.get(), (ry70) xvf0Var4.get(), (l) xvf0Var3.get(), (t5i) xvf0Var2.get(), (ps70) xvf0Var.get());
            case 14:
                return new com.yandex.go.places.organization.card.impl.data.mappers.a((pdc) xvf0Var5.get(), (ru.yandex.taxi.widget.c) xvf0Var4.get(), (dbv) xvf0Var3.get(), (com.yandex.go.places.models.data.mappers.a) xvf0Var2.get(), (com.yandex.go.places.models.data.mappers.b) xvf0Var.get());
            case 15:
                return new e190((kz10) xvf0Var5.get(), (fbi0) xvf0Var4.get(), (a0u0) xvf0Var3.get(), (i5o) xvf0Var2.get(), (vxy0) xvf0Var.get());
            case 16:
                return new kb90((com.yandex.messaging.internal.storage.contacts.a) xvf0Var5.get(), (noy0) xvf0Var4.get(), i5m.a(xvf0Var3), (z5z) xvf0Var2.get(), (Context) xvf0Var.get());
            case 17:
                return new zm90((xqi0) xvf0Var5.get(), (y120) xvf0Var4.get(), (b00) xvf0Var3.get(), (com.yandex.messaging.auth.passport.b) xvf0Var2.get(), (x22) xvf0Var.get());
            case 18:
                return new com.yandex.go.payments.paymentdomain.domain.a((d) xvf0Var5.get(), (wy90) xvf0Var4.get(), (bz90) xvf0Var3.get(), (vy90) xvf0Var2.get(), (ez90) xvf0Var.get());
            case 19:
                return new j5b0((o1b0) xvf0Var5.get(), (m5b0) xvf0Var4.get(), (ml21) xvf0Var3.get(), (k020) xvf0Var2.get(), (at2) xvf0Var.get());
            case 20:
                at2 at2Var = (at2) xvf0Var5.get();
                k020 k020Var = (k020) xvf0Var3.get();
                return new v5b0(at2Var, k020Var);
            case 21:
                return new com.yandex.go.address.position_confirmation.a((kf00) xvf0Var5.get(), (po21) xvf0Var4.get(), (i) xvf0Var3.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get(), (ru.yandex.taxi.preorder.source.userposition.a) xvf0Var.get());
            case 22:
                return new ru.yandex.taxi.preorder.summary.selector.analytics.a((wiq0) xvf0Var5.get(), (uze0) xvf0Var4.get(), (clx0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (com.yandex.go.taxi.tariffs.analytics.c) xvf0Var.get());
            case 23:
                return new com.yandex.go.taxi.order.communications.analytics.realtime.a((wpf0) xvf0Var5.get(), (ypf0) xvf0Var4.get(), (n20) xvf0Var3.get(), (l) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 24:
                return new com.yandex.messaging.internal.authorized.chat.refresher.e((kse) xvf0Var5.get(), (naz0) xvf0Var4.get(), (com.yandex.messaging.internal.authorized.chat.refresher.b) xvf0Var3.get(), (com.yandex.messaging.internal.authorized.chat.refresher.a) xvf0Var2.get(), (rmi0) xvf0Var.get());
            case 25:
                return new boj0((Looper) xvf0Var5.get(), (nk21) xvf0Var4.get(), (k020) xvf0Var3.get(), (sb7) xvf0Var2.get(), (com.yandex.messaging.data.e) xvf0Var.get());
            case 26:
                return new com.yandex.go.taxi.order.details.v2.state.elements.ai_bubble.c((jgv) xvf0Var5.get(), (jkk0) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (sqs0) xvf0Var.get());
            case 27:
                return new com.yandex.go.taxi.order.details.v2.state.d((o2y0) xvf0Var5.get(), (com.yandex.go.taxi.order.details.v2.core.c) xvf0Var4.get(), (tt2) xvf0Var3.get(), (agk0) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.analytics.perf.a) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.preorder.map.interactor.c((nj6) xvf0Var2.get(), (wiq0) xvf0Var5.get(), (ru.yandex.taxi.address.interactor.a) xvf0Var4.get(), (k) xvf0Var.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get());
            default:
                return new f6n0((lx4) xvf0Var5.get(), (p2o0) xvf0Var4.get(), (c3o0) xvf0Var3.get(), (i5n0) xvf0Var2.get(), (q4o0) xvf0Var.get());
        }
    }
}
