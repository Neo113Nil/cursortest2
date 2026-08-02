package defpackage;

import android.content.Context;
import com.yandex.go.fallback_experiment.network.FallbackExperimentApi;
import com.yandex.go.payments.shared.family.invites.data.a;
import com.yandex.go.payments.shared.family.invites.data.b;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.fragment.favorites.c;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class p9p implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ p9p(w8r w8rVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        int i3 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                FallbackExperimentApi e = bka1.e((on2) xvf0Var.get());
                q5z.i(e);
                return e;
            case 1:
                return new y9p((pho) xvf0Var.get());
            case 2:
                return new uap((rqo) xvf0Var.get());
            case 3:
                return new hbp(i3, (a) xvf0Var.get());
            case 4:
                return new b((eex) xvf0Var.get());
            case 5:
                return new s59((uap) xvf0Var.get());
            case 6:
                return new ru.yandex.taxi.favorites.address.impl.domain.a((ru.yandex.taxi.favorites.address.impl.factory.a) xvf0Var.get());
            case 7:
                return new ru.yandex.taxi.favorites.address.api.experiment.a((rqo) xvf0Var.get());
            case 8:
                return new bfp((g) xvf0Var.get());
            case 9:
                return new uhp((dne0) xvf0Var.get());
            case 10:
                return new yhp((rqo) xvf0Var.get(), 0);
            case 11:
                return new bip((lx4) xvf0Var.get());
            case 12:
                return new aip((pho) xvf0Var.get());
            case 13:
                return new c(i5m.a(xvf0Var));
            case 14:
                return new smp((com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 15:
                return new ik3((ru.yandex.taxi.am.token.a) xvf0Var.get(), i2);
            case 16:
                return new hvq((zuj0) xvf0Var.get());
            case 17:
                return new com.yandex.go.feedback_common.services.c((com.yandex.go.feedback_common.services.b) xvf0Var.get());
            case 18:
                return new oyq((Context) xvf0Var.get());
            case 19:
                return new e3r((b220) xvf0Var.get(), i3);
            case 20:
                return new u4r((Context) xvf0Var.get());
            case 21:
                return new d5r((q1q0) xvf0Var.get());
            case 22:
                return new kip((rqo) xvf0Var.get(), 1);
            case 23:
                return new u7r((pho) xvf0Var.get());
            case 24:
                return new mum((ck31) xvf0Var.get());
            case 25:
                return new t8r();
            case 26:
                return new v8r();
            case 27:
                return new ycr((pho) xvf0Var.get());
            case 28:
                return new hdr((h) xvf0Var.get());
            default:
                return new idr((pho) xvf0Var.get());
        }
    }

    public /* synthetic */ p9p(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
