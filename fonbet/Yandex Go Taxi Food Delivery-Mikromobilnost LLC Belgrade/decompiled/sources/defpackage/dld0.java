package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.go.address.address_map_picker.domain.h;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.preload.b;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.domain.j;
import com.ybsdk.network.Api;
import ru.yandex.taxi.logistics.postcard.presentation.g;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.notifications.c;
import ru.yandex.taxi.plus.repository.d;
import ru.yandex.taxi.plus.sdk.micro_widget.repository.a;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes8.dex */
public final class dld0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public dld0(fff0 fff0Var, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 28;
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
                return new d(((x2d0) xvf0Var2.get()).e, (aqp0) xvf0Var.get());
            case 1:
                return new a((u0d0) xvf0Var2.get(), (cqd0) xvf0Var.get());
            case 2:
                return new com.yandex.go.plus.notification.a((c) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 3:
                return new msd0((fga0) xvf0Var2.get(), (i) xvf0Var.get());
            case 4:
                return new PopupDialogModalView((Context) xvf0Var2.get(), (pav) xvf0Var.get());
            case 5:
                return new h((ru.yandex.taxi.search.suggest.i) xvf0Var2.get(), (atd0) xvf0Var.get());
            case 6:
                return new com.yandex.go.payments.porttech.data.a((tt2) xvf0Var2.get(), (ru.yandex.taxi.web.deeplink.a) xvf0Var.get());
            case 7:
                return new com.yandex.go.delivery.tracking.postcard.a((g) xvf0Var2.get(), (com.yandex.go.lifecycle.a) xvf0Var.get());
            case 8:
                return new ru.yandex.taxi.logistics.postcard.presentation.d((tse) xvf0Var2.get(), i5m.a(xvf0Var));
            case 9:
                Context context = (Context) xvf0Var2.get();
                return new lfe0(context);
            case 10:
                return new dhe0((k0b0) xvf0Var2.get(), (n) xvf0Var.get());
            case 11:
                return new com.yandex.go.location.domain.a((ehe0) xvf0Var2.get(), (x8z) xvf0Var.get());
            case 12:
                return new koe0((jtq0) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 13:
                return new b((com.yandex.go.preload.a) xvf0Var2.get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var.get());
            case 14:
                return new com.yandex.go.splash.preload.a((epe0) xvf0Var2.get(), (ru.yandex.taxi.startup.launch.i) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.preorder.repositories.g((dqe0) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 16:
                return new hwe0((b8r) xvf0Var2.get(), (k) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.surge.repository.a((on2) xvf0Var.get(), (tt2) xvf0Var2.get());
            case 18:
                return new com.yandex.go.taxi.order.recalculation.domain.a((on2) xvf0Var2.get(), (hit) xvf0Var.get());
            case 19:
                return new w76((pdc) xvf0Var.get(), (Context) xvf0Var2.get());
            case 20:
                return new b4f0((Looper) xvf0Var2.get(), (k020) xvf0Var.get());
            case 21:
                Api api = (Api) xvf0Var2.get();
                return new c5f0(api);
            case 22:
                return new j((el21) xvf0Var2.get(), (kse) xvf0Var.get());
            case 23:
                return new com.yandex.go.shortcuts.impl.preferences.a((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 24:
                return new xdf0((kse) xvf0Var2.get(), (wff0) xvf0Var.get());
            case 25:
                h3y a = i5m.a(xvf0Var2);
                boolean a2 = ((l8w0) xvf0Var.get()).a();
                if (a2) {
                    i6r i6rVar = (i6r) a.get();
                    i6rVar.getClass();
                    return new v5g(i6rVar);
                }
                if (!a2) {
                    return qgf0.a;
                }
                w511.b();
                return null;
            case 26:
                return new l8w0((rqo) xvf0Var2.get(), (qmp) xvf0Var.get());
            case 27:
                return new yef0((kse) xvf0Var2.get(), (wff0) xvf0Var.get());
            case 28:
                return ((b370) xvf0Var2.get()).c ? (g370) i5m.a(xvf0Var).get() : i370.a;
            default:
                return new off0((gsu) xvf0Var2.get(), (ncy0) xvf0Var.get());
        }
    }

    public /* synthetic */ dld0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
