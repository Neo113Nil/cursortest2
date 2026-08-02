package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.agreement.trackable.repository.a;
import com.yandex.go.agreement.trackable.repository.b;
import com.yandex.go.payments.cards.data.g;
import com.yandex.go.payments.cards.data.i;
import com.yandex.go.payments.paymentlist.domain.o;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.user_profile.settings.main.UserInfoView;
import com.yandex.messaging.internal.authorized.j;
import ru.yandex.taxi.communications.q;
import ru.yandex.taxi.location.user.c;
import ru.yandex.taxi.preorder.tollroad.data.e;

/* loaded from: classes9.dex */
public final class dby0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ dby0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new q((tt2) xvf0Var2.get(), (tse) xvf0Var3.get(), i5m.a(xvf0Var));
            case 1:
                return new kcy0((Context) xvf0Var3.get(), (p4t) xvf0Var2.get(), (yef0) xvf0Var.get());
            case 2:
                return new tgy0((SharedPreferences) xvf0Var3.get(), (wff0) xvf0Var2.get(), (qro) xvf0Var.get());
            case 3:
                return new cjw0((zuj0) xvf0Var3.get(), (jtq0) xvf0Var2.get(), (kj40) xvf0Var.get());
            case 4:
                return new mqz0((e) xvf0Var3.get(), (moz0) xvf0Var2.get(), (opz0) xvf0Var.get());
            case 5:
                return new a((on2) xvf0Var3.get(), (tt2) xvf0Var2.get(), (hit) xvf0Var.get());
            case 6:
                dne0 dne0Var = (dne0) xvf0Var3.get();
                return new b((tt2) xvf0Var.get(), (wnt) xvf0Var2.get(), dne0Var);
            case 7:
                return new nz01((com.yandex.messaging.internal.backendconfig.a) xvf0Var3.get(), (lqo) xvf0Var2.get(), i5m.a(xvf0Var));
            case 8:
                return new ru.yandex.taxi.translations.interactor.a((on2) xvf0Var3.get(), (tt2) xvf0Var2.get(), (oz01) xvf0Var.get());
            case 9:
                return new i((g) xvf0Var3.get(), (wnt) xvf0Var2.get(), (u32) xvf0Var.get());
            case 10:
                return new com.yandex.go.ultima_mode.preferences.a((tt2) xvf0Var3.get(), (lv11) xvf0Var2.get(), (iv11) xvf0Var.get());
            case 11:
                return new com.yandex.go.superapp.unified_polling.g((on2) xvf0Var3.get(), i5m.a(xvf0Var2), (y) xvf0Var.get());
            case 12:
                return new com.yandex.go.drive.sdkintegration.domain.session.unified_polling.e((tse) xvf0Var3.get(), (ky11) xvf0Var2.get(), i5m.a(xvf0Var));
            case 13:
                return new o421(i5m.a(xvf0Var3), (Looper) xvf0Var2.get(), (x22) xvf0Var.get());
            case 14:
                return new o((cda0) xvf0Var3.get(), (hit) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 15:
                return new com.yandex.delivery.utils.auth.impl.user.a((x2u0) xvf0Var3.get(), (com.yandex.delivery.utils.auth.impl.user.b) xvf0Var2.get(), (wp21) xvf0Var.get());
            case 16:
                return new UserInfoView((Context) xvf0Var3.get(), (on21) xvf0Var2.get(), (pav) xvf0Var.get());
            case 17:
                return new ko21((dne0) xvf0Var3.get(), (b03) xvf0Var2.get(), (wu2) xvf0Var.get());
            case 18:
                return new xo21((Lifecycle) xvf0Var3.get(), (po21) xvf0Var2.get(), (qwc) xvf0Var.get());
            case 19:
                return new np21((at2) xvf0Var3.get(), (z5z) xvf0Var2.get(), i5m.a(xvf0Var));
            case 20:
                return new c((dqe0) xvf0Var3.get(), (atd0) xvf0Var2.get(), (po21) xvf0Var.get());
            case 21:
                return new as21((b03) xvf0Var3.get(), (wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 22:
                return new com.yandex.go.user_profile.main_menu.profile.a(xvf0Var3, (jj3) xvf0Var2.get(), (o600) xvf0Var.get());
            case 23:
                return new com.yandex.go.user_profile.main_menu.profile.b(xvf0Var3, (jj3) xvf0Var2.get(), (o600) xvf0Var.get());
            case 24:
                return new j(i5m.a(xvf0Var3), i5m.a(xvf0Var2), (xdf0) xvf0Var.get());
            case 25:
                return new com.yandex.go.zone.interactors.e((com.yandex.go.zone.interactors.b) xvf0Var3.get(), (com.yandex.go.route.interactor.c) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.vendor_api.impl.implementations.c((Context) xvf0Var3.get(), (tse) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 27:
                return new fb31((ru.yandex.taxi.tariffs.data.a) xvf0Var3.get(), (maj0) xvf0Var2.get(), (hct) xvf0Var.get());
            case 28:
                return new cg31((wnt) xvf0Var3.get(), (com.yandex.go.zone.repository.o) xvf0Var2.get(), (liy0) xvf0Var.get());
            default:
                return new com.yandex.go.taxi.experiments.q((rqo) xvf0Var3.get(), (pdc) xvf0Var2.get(), (yp2) xvf0Var.get());
        }
    }
}
