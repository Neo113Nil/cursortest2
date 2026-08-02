package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.captcha.i;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.order.q;
import com.yandex.go.yb.domain.o;
import com.yandex.messaging.internal.storage.folders.d;
import ru.yandex.taxi.masstransit.overlay.e;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.preorder.source.cars.a;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.tariffs.interactor.f;

/* loaded from: classes10.dex */
public final class egx0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public /* synthetic */ egx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.h;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.d;
        xvf0 xvf0Var7 = this.b;
        switch (i) {
            case 0:
                return new f((hit) xvf0Var7.get(), (tt2) xvf0Var.get(), (jgv) xvf0Var6.get(), (a) xvf0Var5.get(), (pav) xvf0Var4.get(), (Lifecycle) xvf0Var3.get(), (tse) xvf0Var2.get());
            case 1:
                ysg ysgVar = (ysg) xvf0Var7.get();
                com.yandex.go.taxi.order.tipssuggest.domain.a aVar = (com.yandex.go.taxi.order.tipssuggest.domain.a) xvf0Var.get();
                tgz0 tgz0Var = (tgz0) xvf0Var6.get();
                nfz0 nfz0Var = (nfz0) xvf0Var5.get();
                return new xgz0(ysgVar, aVar, tgz0Var, nfz0Var, (p2y0) xvf0Var3.get(), (ine0) xvf0Var2.get());
            case 2:
                return new d721((com.yandex.messaging.domain.actions.a) xvf0Var7.get(), (d) xvf0Var.get(), (k020) xvf0Var6.get(), (el21) xvf0Var5.get(), (xw50) xvf0Var4.get(), (zwr) xvf0Var3.get(), (kse) xvf0Var2.get());
            case 3:
                return new j721((com.yandex.messaging.domain.actions.a) xvf0Var7.get(), (d) xvf0Var.get(), (w5t) xvf0Var6.get(), (el21) xvf0Var5.get(), (xw50) xvf0Var4.get(), (zwr) xvf0Var3.get(), (kse) xvf0Var2.get());
            case 4:
                return new com.yandex.go.urbanads.a((Context) xvf0Var7.get(), (ru.yandex.taxi.am.token.a) xvf0Var.get(), (fn21) xvf0Var6.get(), (bpt) xvf0Var5.get(), (w9w0) xvf0Var4.get(), (po21) xvf0Var3.get(), (b) xvf0Var2.get());
            case 5:
                return new com.yandex.go.taxi.order.feedback.domain.b((tse) xvf0Var7.get(), (ysg) xvf0Var.get(), (com.yandex.go.feedback_common.services.d) xvf0Var6.get(), (q) xvf0Var5.get(), (jtq0) xvf0Var4.get(), (h) xvf0Var3.get(), (FeedbackStrategy) xvf0Var2.get());
            case 6:
                return new e((Context) xvf0Var7.get(), (tt2) xvf0Var.get(), (pdc) xvf0Var6.get(), (ah00) xvf0Var5.get(), (fz00) xvf0Var4.get(), (e631) xvf0Var3.get(), (cyx) xvf0Var2.get());
            case 7:
                wgr wgrVar = (wgr) xvf0Var7.get();
                com.yandex.go.wallet.flex.a aVar2 = (com.yandex.go.wallet.flex.a) xvf0Var6.get();
                p841 p841Var = (p841) xvf0Var5.get();
                a850 a850Var = (a850) xvf0Var4.get();
                mjv0 mjv0Var = (mjv0) xvf0Var3.get();
                return new n841(wgrVar, this.c, aVar2, p841Var, a850Var, mjv0Var);
            case 8:
                return new i((gf41) xvf0Var7.get(), (i38) xvf0Var.get(), (koe0) xvf0Var6.get(), (hb20) xvf0Var5.get(), (oep0) xvf0Var4.get(), (tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get());
            case 9:
                c cVar = (c) xvf0Var7.get();
                lx4 lx4Var = (lx4) xvf0Var.get();
                yxe0 yxe0Var = (yxe0) xvf0Var6.get();
                xxe0 xxe0Var = (xxe0) xvf0Var5.get();
                uy70 uy70Var = (uy70) xvf0Var4.get();
                s351 s351Var = (s351) xvf0Var3.get();
                return new c151(cVar, lx4Var, yxe0Var, xxe0Var, uy70Var, s351Var);
            case 10:
                return new com.yandex.go.antirobot.c((tt2) xvf0Var7.get(), (fkh) xvf0Var.get(), (uk51) xvf0Var6.get(), (com.yandex.go.antirobot.experiment.b) xvf0Var5.get(), (tst) xvf0Var4.get(), (jtq0) xvf0Var3.get(), (nb20) xvf0Var2.get());
            default:
                return new ly51((com.yandex.go.yb.main_menu.data.i) xvf0Var7.get(), (tt2) xvf0Var.get(), (jj10) xvf0Var6.get(), (jy51) xvf0Var5.get(), (o) xvf0Var4.get(), i5m.a(xvf0Var3), (pwy0) xvf0Var2.get());
        }
    }
}
