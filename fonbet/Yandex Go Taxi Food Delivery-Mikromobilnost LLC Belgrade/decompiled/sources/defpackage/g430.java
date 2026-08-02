package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.payments.domain.v;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.taxi.order.change.common.domain.g;
import ru.yandex.taxi.masstransit.experiment.a;
import ru.yandex.taxi.masstransit.experiment.e;
import ru.yandex.taxi.perf.b;

/* loaded from: classes10.dex */
public final class g430 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ g430(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
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
                return new f430((Context) xvf0Var2.get(), (tig0) ((kpp0) xvf0Var).get());
            case 1:
                return new k630((pep0) xvf0Var2.get(), (gb0) xvf0Var, 0);
            case 2:
                return new e((rqo) xvf0Var2.get(), (a) ((le30) xvf0Var).get());
            case 3:
                return new md50((nd50) ((xkw) xvf0Var).get(), (zuj0) xvf0Var2.get());
            case 4:
                return new mf50((e41) ((qy0) xvf0Var2).get(), (sul) ((p350) xvf0Var).get());
            case 5:
                return new q560((co40) ((f870) xvf0Var).get(), (b) xvf0Var2.get());
            case 6:
                return new uc60((c) xvf0Var2.get(), (spt) ((a4t) xvf0Var).get());
            case 7:
                return new kjz((com.yandex.go.permission.location_with_agreement.interactor.e) xvf0Var2.get(), (yvi0) ((c660) xvf0Var).get());
            case 8:
                return new fx60((jj3) xvf0Var2.get(), (ast0) ((rxm0) xvf0Var).get());
            case 9:
                return new com.yandex.go.flex.main_screen.presentation.actions.c((a3g) xvf0Var, (oep0) xvf0Var2.get());
            case 10:
                return new r2h(2, (jc60) xvf0Var, (oep0) xvf0Var2.get());
            case 11:
                return new com.yandex.go.superapp.impl.router.a((tse) xvf0Var2.get(), (com.yandex.go.taxi.order.multi.a) ((rsn0) xvf0Var).get());
            case 12:
                return new i970((vw2) xvf0Var, (oep0) xvf0Var2.get());
            case 13:
                return new lk70((i130) xvf0Var2.get(), (sii) xvf0Var);
            case 14:
                return new d((com.yandex.go.taxi.order.change.common.data.d) xvf0Var2.get(), (g) ((zw30) xvf0Var).get());
            case 15:
                return new rq70((qrj0) ((npe0) xvf0Var).get(), (h6r) xvf0Var2.get());
            case 16:
                return new t380((wnt) xvf0Var2.get(), (mx70) ((f870) xvf0Var).get());
            case 17:
                h601 h601Var = (h601) ((jwx0) xvf0Var2).get();
                ((a3g) xvf0Var).get();
                return new qc20(h601Var);
            case 18:
                return new kjz(17, (Context) xvf0Var2.get(), i5m.a((r2i) xvf0Var));
            case 19:
                return new pd80((jc60) xvf0Var2, (od80) ((xcz) xvf0Var).get());
            case 20:
                return new d2a0((v) ((jk0) xvf0Var2).get(), (cxq0) ((w7u) xvf0Var).get());
            case 21:
                return new com.yandex.go.payments.promo.c((ada0) ((ec80) xvf0Var2).get(), (com.yandex.go.payments.promo.d) ((tj70) xvf0Var).get());
            case 22:
                return new uv6((w030) ((i5g) xvf0Var).get(), (Context) ((c3g) xvf0Var2).get());
            case 23:
                return new ala0((tse) xvf0Var2.get(), (zf) ((bea0) xvf0Var).get());
            case 24:
                return new mua0((yo40) ((n6o0) xvf0Var).get(), (Activity) xvf0Var2.get());
            case 25:
                return new bxa0((pdi) xvf0Var2.get(), (hxa0) ((zw30) xvf0Var).get());
            case 26:
                return new ru.yandex.taxi.logistics.sdk.performer_position.impl.data.a(i5m.a((wnw) xvf0Var2), (jxa0) ((bea0) xvf0Var).get());
            case 27:
                Context context = (Context) xvf0Var2.get();
                t61 t61Var = (t61) ((i0b0) xvf0Var).get();
                nfh nfhVar = new nfh();
                nfhVar.a = context;
                nfhVar.b = t61Var;
                nfhVar.c = context.getPackageManager();
                return nfhVar;
            case 28:
                return new ufb0(i5m.a((le30) xvf0Var2), i5m.a((zof0) xvf0Var));
            default:
                return new com.yandex.go.pin.interactor.a((ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (ru.yandex.taxi.address.interactor.a) ((i0b0) xvf0Var).get());
        }
    }

    public /* synthetic */ g430(xvf0 xvf0Var, xvf0 xvf0Var2, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }
}
