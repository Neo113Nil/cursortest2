package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Looper;
import com.yandex.go.order.bundle.map.impl.data.repository.g;
import com.yandex.go.taxi.tariffs.interactor.h;
import com.yandex.go.taxi.tariffs.interactor.i;
import com.yandex.go.ypay.impl.a;
import com.yandex.go.zone.interactors.b;
import com.yandex.go.zone.repository.o;
import com.yandex.go.zone.repository.r;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.v;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.personalstate.domain.interactor.j;

/* loaded from: classes8.dex */
public final class mwq implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public mwq(w8r w8rVar, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 4;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new h((c8r) xvf0Var3.get(), (b8r) xvf0Var2.get(), (j) xvf0Var.get());
            case 1:
                return new i((po21) xvf0Var3.get(), (b) xvf0Var2.get(), (com.yandex.go.taxi.tariffs.interactor.b) xvf0Var.get());
            case 2:
                return new b((r) xvf0Var3.get(), (o) xvf0Var2.get(), (c) xvf0Var.get());
            case 3:
                return new g((lv6) xvf0Var3.get(), (j551) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 4:
                return new u8r();
            case 5:
                return new a((ru.yandex.taxi.am.g) xvf0Var3.get(), (ibr) xvf0Var2.get(), (jbr) xvf0Var.get());
            case 6:
                return new jdj((k020) xvf0Var3.get(), (at2) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 7:
                return new h1s((n20) xvf0Var3.get(), (k0b0) xvf0Var2.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var.get());
            case 8:
                return new r1s(1, (lx4) xvf0Var3.get(), (ru.yandex.taxi.perf.b) xvf0Var2.get(), (nbj) xvf0Var.get());
            case 9:
                return new com.yandex.messaging.internal.chat.domain.a((kse) xvf0Var3.get(), (el21) xvf0Var2.get(), (p4t) xvf0Var.get());
            case 10:
                return new com.yandex.messaging.internal.chat.info.settings.domain.c((kse) xvf0Var3.get(), (el21) xvf0Var2.get(), (com.yandex.messaging.internal.chat.domain.a) xvf0Var.get());
            case 11:
                return new com.yandex.messaging.internal.i((com.yandex.messaging.internal.authorized.j) xvf0Var3.get(), (o5e) xvf0Var2.get(), (kse) xvf0Var.get());
            case 12:
                return new v((k020) xvf0Var3.get(), (sb7) xvf0Var2.get(), (kse) xvf0Var.get());
            case 13:
                return new odt((MessengerEnvironment) xvf0Var3.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get(), (kse) xvf0Var.get());
            case 14:
                return new d((k020) xvf0Var3.get(), (sb7) xvf0Var2.get(), (kse) xvf0Var.get());
            case 15:
                return new com.yandex.messaging.internal.team.gaps.c((el21) xvf0Var3.get(), (kse) xvf0Var2.get(), (MessengerEnvironment) xvf0Var.get());
            case 16:
                return new n7u(i5m.a(xvf0Var3), i5m.a(xvf0Var2), (kse) xvf0Var.get());
            case 17:
                return new ogu((Looper) xvf0Var3.get(), (rz10) xvf0Var2.get(), (at2) xvf0Var.get());
            case 18:
                return new iiu((Context) xvf0Var3.get(), (w030) xvf0Var2.get(), (q6r0) xvf0Var.get());
            case 19:
                return new r1s(9, (pp21) xvf0Var3.get(), (vp21) xvf0Var2.get(), (ru.yandex.taxi.am.g) xvf0Var.get());
            case 20:
                return new d9v((Context) xvf0Var3.get(), (wq21) xvf0Var2.get(), (ocv) xvf0Var.get());
            case 21:
                return new njv((lx4) xvf0Var3.get(), (mjv) xvf0Var2.get(), (npv) xvf0Var.get());
            case 22:
                return new qqv((ru.yandex.taxi.communications.data.a) xvf0Var3.get(), (ysg) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 23:
                return new com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a((amc) xvf0Var3.get(), (com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a) xvf0Var2.get(), (klw) xvf0Var.get());
            case 24:
                return new hcw(xvf0Var3, (ciw) xvf0Var2.get(), (oep0) xvf0Var.get());
            case 25:
                return new com.yandex.go.taxi.intercity.dashboard.impl.feedback.interactor.a((adw) xvf0Var3.get(), (edw) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.intercity.deeplink.b((fx60) xvf0Var3.get(), (dcw) xvf0Var2.get(), xvf0Var);
            case 27:
                return new hsx((ru.yandex.taxi.location.g) xvf0Var3.get(), (LocationManager) xvf0Var2.get(), (ai4) xvf0Var.get());
            case 28:
                return new com.yandex.go.payments.paymentlist.domain.preselect.a((tt2) xvf0Var3.get(), (fga0) xvf0Var2.get(), (wsx) xvf0Var.get());
            default:
                return new ru.yandex.taxi.startup.launch.b((ru.yandex.taxi.startup.launch.i) xvf0Var3.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }

    public /* synthetic */ mwq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
