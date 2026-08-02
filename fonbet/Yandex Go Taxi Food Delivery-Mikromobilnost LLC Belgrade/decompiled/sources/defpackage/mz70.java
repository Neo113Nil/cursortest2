package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.preorder.lifecycle.d;
import com.yandex.go.scooters.domain.r;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.taxi.order.change.source.interactor.x;
import com.yandex.go.taxi.order.map.curtain.a;
import com.yandex.go.taxi.order.popup.b;
import java.util.HashMap;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.j;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.scooters.domain.g;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class mz70 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public /* synthetic */ mz70(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new a((fup0) xvf0Var6.get(), (oz70) xvf0Var5.get(), (c) xvf0Var4.get(), (tt2) xvf0Var2.get(), (pav) xvf0Var.get(), (k7x0) xvf0Var3.get());
            case 1:
                return new f080((b080) xvf0Var6.get(), (x980) xvf0Var5.get(), (vo00) xvf0Var4.get(), (wy1) xvf0Var2.get(), (zz70) xvf0Var.get(), (y180) xvf0Var3.get());
            case 2:
                return new b((Context) xvf0Var6.get(), (ru.yandex.taxi.widget.c) xvf0Var5.get(), (e) xvf0Var4.get(), (tt2) xvf0Var2.get(), (k7x0) xvf0Var.get(), (ip11) xvf0Var3.get());
            case 3:
                return new x((com.yandex.go.taxi.order.change.source.pin.b) xvf0Var6.get(), (iup0) xvf0Var5.get(), (ixx0) xvf0Var4.get(), (c) xvf0Var2.get(), (n20) xvf0Var.get(), (cmm) xvf0Var3.get());
            case 4:
                return new hc80((lx4) xvf0Var6.get(), (yxe0) xvf0Var5.get(), (the) xvf0Var4.get(), (uy70) xvf0Var2.get(), (n17) xvf0Var.get(), (gc80) xvf0Var3.get());
            case 5:
                return new com.yandex.go.places.impl.data.repositories.organizations.a((bl80) xvf0Var6.get(), (yac0) xvf0Var5.get(), (com.yandex.go.places.map.data.mappers.a) xvf0Var4.get(), (h) xvf0Var2.get(), ((Boolean) xvf0Var.get()).booleanValue(), (nfc0) xvf0Var3.get());
            case 6:
                return new com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.core.network.auth.a((z22) xvf0Var6.get(), (hk3) xvf0Var5.get(), (Context) xvf0Var4.get(), (DefaultEnvironment) xvf0Var2.get(), (dn90) xvf0Var.get(), (zn90) xvf0Var3.get());
            case 7:
                return new ru.yandex.taxi.layers.presentation.pickup.b((ah00) xvf0Var6.get(), (xm00) xvf0Var5.get(), (sxx) xvf0Var4.get(), (pdc) xvf0Var2.get(), (tt2) xvf0Var.get(), (Context) xvf0Var3.get());
            case 8:
                return new dac0((bac0) xvf0Var6.get(), (g8c0) xvf0Var5.get(), (f8c0) xvf0Var4.get(), (com.yandex.div.core.expression.variables.a) xvf0Var2.get(), this.f, (i9c0) xvf0Var3.get());
            case 9:
                return new eid0((tj60) xvf0Var6.get(), (s0r0) xvf0Var5.get(), (d49) xvf0Var4.get(), (Context) xvf0Var2.get(), (pav) xvf0Var.get(), (z0a0) xvf0Var3.get());
            case 10:
                return new d((wiq0) xvf0Var6.get(), (com.yandex.go.route.interactor.c) xvf0Var5.get(), (dqe0) xvf0Var4.get(), (RequirementsChangedNotifier) xvf0Var2.get(), (tft0) xvf0Var.get(), (tt2) xvf0Var3.get());
            case 11:
                return new h4g0((jn3) xvf0Var6.get(), (w3c) xvf0Var5.get(), (SharedPreferences) xvf0Var4.get(), (SharedPreferences) xvf0Var2.get(), (Looper) xvf0Var.get(), (x22) xvf0Var3.get());
            case 12:
                return new oeg0((Context) xvf0Var6.get(), (h410) xvf0Var5.get(), (w030) xvf0Var4.get(), (bfg0) xvf0Var2.get(), (deg0) xvf0Var.get(), (deg0) xvf0Var3.get());
            case 13:
                return new bbi0((x22) xvf0Var6.get(), (n5t0) xvf0Var5.get(), (naz0) xvf0Var4.get(), (fw10) xvf0Var2.get(), (kta0) xvf0Var.get(), (nai0) xvf0Var3.get());
            case 14:
                return new vmi0((Looper) xvf0Var6.get(), (at2) xvf0Var5.get(), (k020) xvf0Var4.get(), i5m.a(xvf0Var2), (kse) xvf0Var.get(), (wff0) xvf0Var3.get());
            case 15:
                return new v920(i5m.a(xvf0Var6), (ru.yandex.taxi.preorder.summary.tariffpage.requirements.a) xvf0Var5.get(), (dfj0) xvf0Var4.get(), this.e, (g580) xvf0Var.get(), (zkz0) xvf0Var3.get());
            case 16:
                return new com.yandex.go.taxi.order.robotaxi.domain.c((tt2) xvf0Var6.get(), (irs0) xvf0Var5.get(), (e) xvf0Var4.get(), (z1y0) xvf0Var2.get(), (com.yandex.go.agreement.trackable.repository.a) xvf0Var.get(), (hvk0) xvf0Var3.get());
            case 17:
                bwk0 bwk0Var = new bwk0();
                new HashMap();
                return bwk0Var;
            case 18:
                return new b5n0((Context) xvf0Var6.get(), (n6n0) xvf0Var5.get(), (y5p0) xvf0Var4.get(), (s6n0) xvf0Var2.get(), (z2o0) xvf0Var.get(), (q4o0) xvf0Var3.get());
            case 19:
                return new g((ah00) xvf0Var6.get(), (a3v) xvf0Var5.get(), (ru.yandex.taxi.scooters.domain.c) xvf0Var4.get(), (euo0) xvf0Var2.get(), (vfn0) xvf0Var.get(), (sfn0) xvf0Var3.get());
            case 20:
                return new r((com.yandex.go.scooters.data.c) xvf0Var6.get(), (ru.yandex.taxi.scooters.domain.r) xvf0Var5.get(), (ru.yandex.taxi.scooters.data.h) xvf0Var4.get(), (com.yandex.go.scooters.insurance.data.b) xvf0Var2.get(), (com.yandex.go.scooters.insurance.data.a) xvf0Var.get(), (m7n0) xvf0Var3.get());
            case 21:
                return new nwn0((n6n0) xvf0Var6.get(), (com.yandex.go.scooters.offers.v2.domain.h) xvf0Var5.get(), (s6n0) xvf0Var4.get(), (i5n0) xvf0Var2.get(), (com.yandex.go.scooters.offers.v2.data.b) xvf0Var.get(), (q4o0) xvf0Var3.get());
            case 22:
                return new xvo0((ah00) xvf0Var6.get(), (w) xvf0Var5.get(), (com.yandex.go.scooters.domain.a) xvf0Var4.get(), (com.yandex.go.scooters.mosru.data.a) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.h) xvf0Var.get(), (ufo0) xvf0Var3.get());
            case 23:
                return new com.yandex.go.taxi.summary.shared.sourcedestination.c((uze0) xvf0Var6.get(), (tct0) xvf0Var5.get(), (tt2) xvf0Var4.get(), (q) xvf0Var2.get(), (b0x0) xvf0Var.get(), (pwy0) xvf0Var3.get());
            case 24:
                return new wit0((ru.yandex.taxi.preorder.source.pickup.a) xvf0Var6.get(), (atd0) xvf0Var5.get(), (i) xvf0Var4.get(), (tit0) xvf0Var2.get(), (ir3) xvf0Var.get(), (xwt) xvf0Var3.get());
            case 25:
                return new ru.yandex.taxi.preorder.source.domain.w((nzb0) xvf0Var6.get(), (dqe0) xvf0Var5.get(), (com.yandex.go.route.interactor.c) xvf0Var4.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get(), (ru.yandex.taxi.preorder.source.sourcepointzone.a) xvf0Var.get(), (i6j0) xvf0Var3.get());
            case 26:
                return new pgu0((ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var6.get(), (com.yandex.go.route.interactor.c) xvf0Var5.get(), (biv0) xvf0Var4.get(), (rft0) xvf0Var2.get(), this.f, (oep0) xvf0Var3.get());
            case 27:
                return new xfv0((evr) xvf0Var6.get(), (fgv0) xvf0Var5.get(), (fgv0) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var2.get(), (kgl0) xvf0Var.get(), (yfv0) xvf0Var3.get());
            case 28:
                return new j((ru.yandex.taxi.summary.promotions.repository.e) xvf0Var6.get(), (mnv0) xvf0Var5.get(), (zuj0) xvf0Var4.get(), (pdc) xvf0Var2.get(), (wk21) xvf0Var.get(), (ykz0) xvf0Var3.get());
            default:
                return new iox0((fif) xvf0Var6.get(), (wiq0) xvf0Var5.get(), (pg9) xvf0Var4.get(), (tt2) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get(), (awi) xvf0Var3.get());
        }
    }
}
