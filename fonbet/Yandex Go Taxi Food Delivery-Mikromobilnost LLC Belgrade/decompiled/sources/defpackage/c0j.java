package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.favorites.repository.c;
import com.yandex.go.taxi.order.state.h;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.unreadcount.d;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.di.modules.features.kyc.a;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.superapp.k;

/* loaded from: classes15.dex */
public final class c0j implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ c0j(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
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
                return new b0j((dqe0) xvf0Var4.get(), (wiq0) xvf0Var3.get(), i5m.a(xvf0Var2), (nf7) xvf0Var.get());
            case 1:
                return new pvm(xvf0Var4, xvf0Var3, (wiq0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 2:
                k020 k020Var = (k020) xvf0Var4.get();
                h3y a = i5m.a(xvf0Var3);
                i5m.a(xvf0Var2);
                return new lsn(a, k020Var);
            case 3:
                return new a((b) xvf0Var4.get(), (np41) xvf0Var3.get(), (f) xvf0Var2.get(), (ppp0) xvf0Var.get());
            case 4:
                zcw0 zcw0Var = (zcw0) xvf0Var4.get();
                return new k((tse) xvf0Var3.get(), (h1p) xvf0Var2.get(), zcw0Var.a, (s2p) xvf0Var.get());
            case 5:
                return new com.yandex.payment.sdk.flex.actions.ftrequestaction.a((com.yandex.payment.sdk.network.a) xvf0Var4.get(), (lkr) xvf0Var3.get(), (nkr) xvf0Var2.get(), (rwo) xvf0Var.get());
            case 6:
                return new com.yandex.go.navigator.favorites.repository.b((ru.yandex.taxi.favorites.data.repo.a) xvf0Var4.get(), (com.yandex.go.places.impl.data.repositories.favorites.a) xvf0Var3.get(), (c) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 7:
                return new com.yandex.go.taxi.order.feedback.a((jgv) xvf0Var4.get(), (pav) xvf0Var3.get(), (kuq) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 8:
                return new q0r((Context) xvf0Var4.get(), (com.yandex.alicekit.core.permissions.b) xvf0Var3.get(), (k0b) xvf0Var2.get(), (String) xvf0Var.get());
            case 9:
                return new vxr((com.yandex.go.navigator.a) xvf0Var4.get(), (e) xvf0Var3.get(), (o) xvf0Var2.get(), (nyw) xvf0Var.get());
            case 10:
                return new w5s((String) xvf0Var4.get(), (l6s) xvf0Var3.get(), (x230) xvf0Var2.get(), (a6s) xvf0Var.get());
            case 11:
                return new fjs((kse) xvf0Var4.get(), (k020) xvf0Var3.get(), i5m.a(xvf0Var2), (at2) xvf0Var.get());
            case 12:
                return new v5t((w5t) xvf0Var4.get(), (d) xvf0Var3.get(), (lqo) xvf0Var2.get(), (kse) xvf0Var.get());
            case 13:
                return new rbt(i5m.a(xvf0Var4), (com.yandex.messaging.internal.authorized.sync.d) xvf0Var3.get(), (kse) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 14:
                return new cct((com.yandex.messaging.internal.authorized.chat.b) xvf0Var4.get(), (xqi0) xvf0Var3.get(), (bn21) xvf0Var2.get(), (kse) xvf0Var.get());
            case 15:
                return new cft((kse) xvf0Var4.get(), (k020) xvf0Var3.get(), (el21) xvf0Var2.get(), (p4t) xvf0Var.get());
            case 16:
                return new evu((q6v) xvf0Var4.get(), (String) xvf0Var3.get(), (String) xvf0Var2.get(), (gsu) xvf0Var.get());
            case 17:
                return new m0w(i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 18:
                i5m.a(xvf0Var);
                return new r501(29);
            case 19:
                return new o((com.yandex.go.navigator.repository.f) xvf0Var4.get(), (oc50) xvf0Var3.get(), (par) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.map.overlay.diagnostic.a((ney) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.userposition.a) xvf0Var3.get(), (k8z) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 21:
                return new vd00((h) xvf0Var4.get(), (pj0) xvf0Var3.get(), (p4j) xvf0Var2.get(), (v1y0) xvf0Var.get());
            case 22:
                return new wjm((w81) xvf0Var4.get(), (mww0) xvf0Var3.get(), (kg00) xvf0Var2.get(), (ouw0) xvf0Var.get(), 25);
            case 23:
                return new ts10((ChatRequest) xvf0Var4.get(), (Activity) xvf0Var3.get(), (b00) xvf0Var2.get(), (su10) xvf0Var.get());
            case 24:
                return new com.yandex.messaging.internal.view.timeline.translations.f((Lifecycle) xvf0Var4.get(), (ChatRequest) xvf0Var3.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get(), (com.yandex.messaging.internal.translator.b) xvf0Var.get());
            case 25:
                return new ax10((n5t0) xvf0Var4.get(), (o1b0) xvf0Var3.get(), (k020) xvf0Var2.get(), (com.yandex.messaging.data.a) xvf0Var.get());
            case 26:
                return new q920((k020) xvf0Var4.get(), (at2) xvf0Var3.get(), (to3) xvf0Var2.get(), (o1b0) xvf0Var.get());
            case 27:
                return new com.yandex.go.taxi.summary.mobilityhub.mapper.a((Context) xvf0Var4.get(), (mo5) xvf0Var3.get(), (ru.yandex.taxi.design.utils.a) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) xvf0Var.get());
            case 28:
                return new com.yandex.go.morphlex.data.descriptors.actions.load_document.a((Lifecycle) xvf0Var4.get(), (com.yandex.go.flex.common.descriptors.action.d) xvf0Var3.get(), xvf0Var2, (i830) xvf0Var.get());
            default:
                return new nc30((tu30) xvf0Var4.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ru.yandex.taxi.masstransit.domain.f) xvf0Var2.get(), (b0x0) xvf0Var.get());
        }
    }
}
