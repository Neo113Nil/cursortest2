package defpackage;

import android.content.Context;
import android.os.Handler;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.navigator.domain.b0;
import com.yandex.go.navigator.navigation.d;
import com.yandex.go.navigator.repository.f;
import com.yandex.go.pickuppoints.impl.l;
import com.yandex.go.places.impl.domain.interactors.organizations.g;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.intercity.e;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.timeline.o;
import ru.yandex.taxi.main.map.i;
import ru.yandex.taxi.masstransit.stop.interactor.h;
import ru.yandex.taxi.walkroute.a;

/* loaded from: classes6.dex */
public final class hs30 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ hs30(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
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
                return new gs30((b540) xvf0Var4.get(), (k7x0) xvf0Var3.get(), (b040) xvf0Var2.get(), (h540) xvf0Var.get());
            case 1:
                return new h((a) xvf0Var4.get(), (po21) xvf0Var3.get(), (dz00) xvf0Var2.get(), (j440) xvf0Var.get());
            case 2:
                return new hi40((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (ti40) xvf0Var2.get(), (pi40) xvf0Var.get());
            case 3:
                return new e((i2s) xvf0Var4.get(), (c) xvf0Var3.get(), (tt2) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 4:
                return new dt20((hzw) xvf0Var4.get(), (my31) xvf0Var3.get(), (mlb0) xvf0Var2.get(), (com.yandex.go.navigator.driving.speaker.a) xvf0Var.get(), 6);
            case 5:
                return new d((wnt) xvf0Var4.get(), (atd0) xvf0Var3.get(), (b) xvf0Var2.get(), (b0) xvf0Var.get());
            case 6:
                return new yb50((i6r) xvf0Var3.get(), (c) xvf0Var2.get(), (y9y0) xvf0Var.get());
            case 7:
                return new com.yandex.go.navigator.settings.debug_panel.domain.a((df50) xvf0Var4.get(), (hb50) xvf0Var3.get(), (com.yandex.go.navigator.settings.debug_panel.domain.b) xvf0Var2.get(), (f) xvf0Var.get());
            case 8:
                return new o((lm50) xvf0Var4.get(), (ChatRequest) xvf0Var3.get(), (sfl0) xvf0Var2.get(), (vse) xvf0Var.get());
            case 9:
                return new com.yandex.go.navigator.events.e((hiq0) xvf0Var4.get(), (x1l0) xvf0Var3.get(), (gpv) xvf0Var2.get(), (wsk0) xvf0Var.get());
            case 10:
                return new com.yandex.messaging.internal.authorized.online.a(i5m.a(xvf0Var4), (kse) xvf0Var3.get(), (g370) xvf0Var2.get(), (vse) xvf0Var.get());
            case 11:
                return new com.yandex.go.taxi.order.multi.shortcuts.e((com.yandex.go.superapp.tracking.data.e) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (c151) xvf0Var2.get(), (i801) xvf0Var.get());
            case 12:
                return new com.yandex.go.places.organization.card.impl.data.repositories.b((tt2) xvf0Var4.get(), (al80) xvf0Var3.get(), (com.yandex.go.places.map.data.mappers.a) xvf0Var2.get(), (com.yandex.go.places.map.domain.layer.c) xvf0Var.get());
            case 13:
                return new g((tt2) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (com.yandex.go.places.impl.data.mappers.organizations.h) xvf0Var2.get(), (com.yandex.go.places.impl.data.repositories.organizations.b) xvf0Var.get());
            case 14:
                return new ex80((Handler) xvf0Var4.get(), (w3c) xvf0Var3.get(), (o1b0) xvf0Var2.get(), (a5e) xvf0Var.get());
            case 15:
                return new y990((ppw0) xvf0Var4.get(), i5m.a(xvf0Var3), (i130) xvf0Var2.get(), (t380) xvf0Var.get());
            case 16:
                return new xv10(i5m.a(xvf0Var4), (xdf0) xvf0Var3.get(), (at2) xvf0Var2.get(), i5m.a(xvf0Var));
            case 17:
                return new com.yandex.go.pickuppoints.impl.o((tt2) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (l) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 18:
                return new i((jgt0) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (iv70) xvf0Var2.get(), (ru.yandex.taxi.address.clarification.impl.repo.a) xvf0Var.get());
            case 19:
                return new w2c0((n5t0) xvf0Var4.get(), (x0j0) xvf0Var3.get(), (naz0) xvf0Var2.get(), (at2) xvf0Var.get());
            case 20:
                return new com.yandex.go.places.impl.ui.main.map.overlay.c((uac0) xvf0Var4.get(), i5m.a(xvf0Var3), (com.yandex.go.places.map.ui.overlay.a) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 21:
                cct cctVar = (cct) xvf0Var4.get();
                a1r a1rVar = (a1r) xvf0Var3.get();
                kg3 kg3Var = (kg3) xvf0Var2.get();
                return new tyc0(cctVar, a1rVar, kg3Var);
            case 22:
                return new ru.yandex.taxi.summary.topnotification.plus.d((s0r0) xvf0Var4.get(), (xdf) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (kld0) xvf0Var.get());
            case 23:
                return new oxd0((n5t0) xvf0Var4.get(), (xxd0) xvf0Var3.get(), (com.yandex.messaging.domain.poll.c) xvf0Var2.get(), (xdf0) xvf0Var.get());
            case 24:
                return new yai0((ChatRequest) xvf0Var4.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var2.get(), i5m.a(xvf0Var));
            case 25:
                return new uli0((rft0) xvf0Var4.get(), (c9l0) xvf0Var3.get(), (ng9) xvf0Var2.get(), (biv0) xvf0Var.get());
            case 26:
                return new com.yandex.messaging.internal.authorized.chat.refresher.c((naz0) xvf0Var4.get(), (n5t0) xvf0Var3.get(), (kse) xvf0Var2.get(), (fbb) xvf0Var.get());
            case 27:
                return new kdd0((bxi0) xvf0Var4.get(), (ff9) xvf0Var3.get(), (pev0) xvf0Var2.get(), (f580) xvf0Var.get());
            case 28:
                return new joj0((vfx0) xvf0Var4.get(), (roj0) xvf0Var3.get(), (ru.yandex.taxi.preorder.extraphone.e) xvf0Var2.get(), (tt2) xvf0Var.get());
            default:
                return new bpj0((dqe0) xvf0Var4.get(), (k7x0) xvf0Var3.get(), (b8r) xvf0Var2.get(), (viv0) xvf0Var.get());
        }
    }
}
