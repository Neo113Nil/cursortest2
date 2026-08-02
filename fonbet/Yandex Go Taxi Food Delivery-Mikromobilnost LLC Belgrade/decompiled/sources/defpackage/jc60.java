package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.flex.common.router.settings.a;
import com.yandex.go.flex.main_screen.data.widgets.orders.e;
import com.yandex.go.mainscreen.superapp.orders.presentation.color.c;
import com.yandex.go.payments.data.f;
import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.taxi.order.domain.interactors.i;
import com.yandex.messaging.internal.authorized.online.b;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.am.g0;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.superapp.knownOrder.u;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes9.dex */
public final class jc60 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ jc60(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                return new ic60((k0b0) xvf0Var3.get(), (n) xvf0Var2.get(), (zz2) xvf0Var.get());
            case 1:
                return new e100((Looper) xvf0Var3.get(), (k020) xvf0Var2.get(), (at2) xvf0Var.get());
            case 2:
                return new wi60((Context) xvf0Var3.get(), (SharedPreferences) xvf0Var2.get(), (dh60) xvf0Var.get());
            case 3:
                return new qo60((po60) xvf0Var3.get(), (ru11) xvf0Var2.get(), (mo60) xvf0Var.get());
            case 4:
                return new qq60((dqe0) xvf0Var3.get(), (ck31) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 5:
                return new b((x22) xvf0Var3.get(), (xdf0) xvf0Var2.get(), (kse) xvf0Var.get());
            case 6:
                return new a((Context) xvf0Var3.get(), (y50) xvf0Var2.get(), (g) xvf0Var.get());
            case 7:
                return new p870((r870) xvf0Var3.get(), (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var2.get(), (i1w0) xvf0Var.get());
            case 8:
                return new xj70((xdf) xvf0Var3.get(), (pdc) xvf0Var2.get(), (Context) xvf0Var.get());
            case 9:
                return new ly70((tt2) xvf0Var3.get(), (u) xvf0Var2.get(), (ksx) xvf0Var.get());
            case 10:
                return new i((ru.yandex.taxi.communications.data.a) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ysg) xvf0Var.get());
            case 11:
                return new e((t2w0) xvf0Var3.get(), (y) xvf0Var2.get(), (c) xvf0Var.get());
            case 12:
                return new ce80((Context) xvf0Var3.get(), (ab4) xvf0Var2.get(), xvf0Var);
            case 13:
                return new ru.yandex.taxi.design.utils.a((Context) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), i5m.a(xvf0Var));
            case 14:
                return new com.yandex.go.taxi.order.cancel.paid.navigation.a((tt2) xvf0Var3.get(), xvf0Var2, (p2y0) xvf0Var.get());
            case 15:
                return new ol90((ru.yandex.taxi.profile.a) xvf0Var3.get(), (ddf0) xvf0Var2.get(), (lg21) xvf0Var.get());
            case 16:
                return new g0((tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (ip90) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.am.internal.e((u02) xvf0Var.get(), (ep90) xvf0Var3.get(), (k) xvf0Var2.get());
            case 18:
                return new p370(17, (Context) xvf0Var3.get(), (y50) xvf0Var2.get(), (ep90) xvf0Var.get());
            case 19:
                return new to90((tt2) xvf0Var3.get(), (im51) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.am.internal.i((tse) xvf0Var3.get(), (rqo) xvf0Var2.get(), (to90) xvf0Var.get());
            case 21:
                return new hp90((ComponentActivity) xvf0Var3.get(), (ep90) xvf0Var2.get(), (tse) xvf0Var.get());
            case 22:
                return new qp90((Context) xvf0Var3.get(), (com.yandex.messaging.auth.passport.b) xvf0Var2.get(), (x22) xvf0Var.get());
            case 23:
                return xpb1.b((ru.yandex.taxi.am.token.a) xvf0Var3.get(), (h) xvf0Var2.get(), (to90) xvf0Var.get());
            case 24:
                return new com.yandex.go.payments.common.a((com.yandex.go.yb.data.u) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 25:
                return new e6a0((Lifecycle) xvf0Var3.get(), (cda0) xvf0Var2.get(), (com.yandex.go.payments.data.c) xvf0Var.get());
            case 26:
                return new com.yandex.go.payments.domain.y((tt2) xvf0Var3.get(), (f) xvf0Var2.get(), (lca0) xvf0Var.get());
            case 27:
                return new aaa0((fx60) xvf0Var3.get(), xvf0Var2, xvf0Var);
            case 28:
                return new com.yandex.go.payments.yb.domain.b(xvf0Var3, (o) xvf0Var2.get(), (hit) xvf0Var.get());
            default:
                return new sea0((eq51) xvf0Var3.get(), (bia0) xvf0Var2.get(), (se8) xvf0Var.get());
        }
    }
}
