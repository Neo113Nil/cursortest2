package defpackage;

import android.app.Application;
import android.content.Context;
import com.yandex.go.ads.mobile_ads_sdk.data.a;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.tariffs.interactor.b;
import com.yandex.go.zone.repository.o;
import com.yandex.messenger.websdk.api.WebMessenger;
import ru.yandex.taxi.masstransit.geopayment.checkout.l;
import ru.yandex.taxi.masstransit.mapper.d;
import ru.yandex.taxi.messenger.MessengerWebSdkParamsSupplier$MessengerType;
import ru.yandex.taxi.multiorder.e;

/* loaded from: classes8.dex */
public final class i020 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public i020(r220 r220Var, xvf0 xvf0Var, n3w n3wVar) {
        this.a = 4;
        this.b = xvf0Var;
        this.c = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new h020(xvf0Var2, (yef0) xvf0Var.get());
            case 1:
                return new wdz((vse) xvf0Var.get());
            case 2:
                return new m120((x120) xvf0Var2.get(), (nff0) xvf0Var.get());
            case 3:
                return new o120((Application) xvf0Var2.get(), (y72) xvf0Var.get());
            case 4:
                return ((z720) xvf0Var.get()).a((WebMessenger) i5m.a(xvf0Var2).get(), MessengerWebSdkParamsSupplier$MessengerType.Delivery);
            case 5:
                return new f420((rqo) xvf0Var2.get(), (j5z) xvf0Var.get());
            case 6:
                return new s720((WebMessenger) xvf0Var2.get(), (bcy0) xvf0Var.get());
            case 7:
                return new q820((csu) xvf0Var2.get(), (a7j0) xvf0Var.get());
            case 8:
                return new hb20((lx4) xvf0Var2.get(), (hl2) xvf0Var.get());
            case 9:
                return new mb20((lx4) xvf0Var.get(), (wnt) xvf0Var2.get());
            case 10:
                return new y71((g51) xvf0Var2.get(), (w030) xvf0Var.get());
            case 11:
                return new cj20((raa0) xvf0Var2.get(), (lx4) xvf0Var.get());
            case 12:
                return new nq20(i5m.a(xvf0Var2), (hs50) xvf0Var.get());
            case 13:
                return new a((rqo) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 14:
                return new com.yandex.go.preorder.deeplinks.a((vre0) xvf0Var.get(), (b) xvf0Var2.get());
            case 15:
                return new ga30((c) xvf0Var2.get(), (n20) xvf0Var.get());
            case 16:
                return new t((Context) xvf0Var2.get(), (w030) xvf0Var.get(), 3);
            case 17:
                return new l((u0a0) xvf0Var2.get(), (com.yandex.go.payments.superapp.payment.b) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.masstransit.datasource.line.a((tt2) xvf0Var2.get(), (x210) xvf0Var.get());
            case 19:
                return new xn30((g0j) xvf0Var2.get(), (y9y0) xvf0Var.get());
            case 20:
                return new mq30((b540) xvf0Var2.get(), (tu30) xvf0Var.get());
            case 21:
                return new d((Context) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) xvf0Var.get());
            case 22:
                return new jt30((o) xvf0Var2.get(), (gt30) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.masstransit.datasource.routing.a((zuj0) xvf0Var2.get(), (ole0) xvf0Var.get());
            case 24:
                return new gw30((Context) xvf0Var2.get(), xvf0Var);
            case 25:
                return new lz30((qr30) xvf0Var2.get(), (n6a0) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.masstransit.datasource.schedule.b((tt2) xvf0Var2.get(), (x210) xvf0Var.get());
            case 27:
                return new a640((zuj0) xvf0Var.get(), (Context) xvf0Var2.get());
            case 28:
                return new kj40((zuj0) xvf0Var2.get(), (jtq0) xvf0Var.get());
            default:
                return new e((g) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }

    public /* synthetic */ i020(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
