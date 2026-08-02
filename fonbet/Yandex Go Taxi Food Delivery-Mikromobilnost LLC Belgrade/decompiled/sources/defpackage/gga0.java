package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.data.c;
import com.yandex.go.payments.notifications.d;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.zone.repository.o;
import com.ybsdk.network.Api;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.e;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.favorites.data.repo.a;
import ru.yandex.taxi.perf.screen.b;
import ru.yandex.taxi.plus.repository.f;

/* loaded from: classes8.dex */
public final class gga0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ gga0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                dne0 dne0Var = (dne0) xvf0Var3.get();
                return new fga0((b03) xvf0Var.get(), (wnt) xvf0Var2.get(), dne0Var);
            case 1:
                return new mla0((cv51) xvf0Var3.get(), (jx51) xvf0Var2.get(), (vu51) xvf0Var.get());
            case 2:
                return new xma0((wfa0) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (o0m0) xvf0Var.get());
            case 3:
                return new d((fga0) xvf0Var3.get(), (c) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 4:
                return new rua0((lx4) xvf0Var3.get(), (czf0) xvf0Var2.get(), (jua0) xvf0Var.get());
            case 5:
                return new b((Lifecycle) xvf0Var3.get(), (tse) xvf0Var2.get(), (ru.yandex.taxi.perf.screen.c) xvf0Var.get());
            case 6:
                return new ru.yandex.taxi.perf.screen.c((rua0) xvf0Var3.get(), (ru.yandex.taxi.perf.b) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 7:
                return new com.yandex.go.navigation.activity.b((t50) xvf0Var3.get(), (g) xvf0Var2.get(), (tse) xvf0Var.get());
            case 8:
                Context context = (Context) xvf0Var3.get();
                return new hmb0((pav) xvf0Var.get(), (k7x0) xvf0Var2.get(), context);
            case 9:
                return new e((rqo) xvf0Var3.get(), (k0b0) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 10:
                return new ru.yandex.taxi.g((tt2) xvf0Var3.get(), (p) xvf0Var2.get(), (hit) xvf0Var.get());
            case 11:
                return new ru.yandex.taxi.favorites.address.impl.data.b((a) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var.get());
            case 12:
                return new m9c0((fva0) xvf0Var3.get(), (lx4) xvf0Var2.get(), (ma1) xvf0Var.get());
            case 13:
                return new lcc0((wnt) xvf0Var3.get(), (mcc0) xvf0Var2.get(), (pcc0) xvf0Var.get());
            case 14:
                return new lgc0((Lifecycle) xvf0Var3.get(), (po21) xvf0Var2.get(), (qwc) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.cashback.repository.a((alc0) xvf0Var3.get(), (hit) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.cashback.international.c((l) xvf0Var3.get(), (o) xvf0Var2.get(), (cda0) xvf0Var.get());
            case 17:
                return new s3d0(i5m.a(xvf0Var2), xvf0Var3, (oep0) xvf0Var.get());
            case 18:
                return new e5d0((vjd0) xvf0Var3.get(), (ru.yandex.taxi.plus.repository.c) xvf0Var2.get(), (tpr) xvf0Var.get());
            case 19:
                return new r5d0((j29) xvf0Var3.get(), (s5d0) xvf0Var2.get(), (x39) xvf0Var.get());
            case 20:
                return new com.yandex.go.payments.plus.domain.c((qea0) xvf0Var3.get(), (i) xvf0Var2.get(), (nid0) xvf0Var.get());
            case 21:
                return new com.ybsdk.common.repositiories.plus.a((Api) xvf0Var3.get(), (com.ybsdk.network.retrofit.e) xvf0Var2.get(), (com.ybsdk.rconfig.b) xvf0Var.get());
            case 22:
                c2d0 c2d0Var = (c2d0) xvf0Var3.get();
                return new un3(c2d0Var.e, (ru.yandex.taxi.plus.sdk.prefetch.a) xvf0Var2.get(), c2d0Var.b, (kgz) xvf0Var.get());
            case 23:
                return new cnp0((u2d0) xvf0Var3.get(), (qid0) xvf0Var2.get(), (f) xvf0Var.get());
            case 24:
                return new x1d0((z1d0) xvf0Var2.get(), (ru.yandex.taxi.plus.sdk.cache.c) xvf0Var.get());
            case 25:
                x2d0 x2d0Var = (x2d0) xvf0Var3.get();
                return new ru.yandex.taxi.plus.repository.mappers.b(x2d0Var.a, (hld0) xvf0Var2.get(), ((c2d0) xvf0Var.get()).u);
            case 26:
                e1c e1cVar = (e1c) xvf0Var3.get();
                ru.yandex.taxi.plus.sdk.domain.a aVar = (ru.yandex.taxi.plus.sdk.domain.a) xvf0Var2.get();
                c2d0 c2d0Var2 = (c2d0) xvf0Var.get();
                return new ru.yandex.taxi.plus.sdk.prefetch.a(e1cVar, aVar, c2d0Var2.b, c2d0Var2.w, c2d0Var2.c);
            case 27:
                return new ru.yandex.taxi.plus.repository.mappers.d((hld0) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), ((x2d0) xvf0Var.get()).a);
            case 28:
                return new gld0((ru.yandex.taxi.plus.sdk.cache.c) xvf0Var3.get(), (tse) xvf0Var2.get(), (tt2) xvf0Var.get());
            default:
                return new com.yandex.go.plus.notification.b((ky2) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
        }
    }
}
