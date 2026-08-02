package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.mainscreen.superapp.impl.foundation.domain.g;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.h;
import com.yandex.go.payments.summary.domain.a;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.superapp.orders.v;
import com.yandex.go.taxi.summary.map.focus.data.c;
import ru.yandex.taxi.address.interactor.b;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes9.dex */
public final class m5v0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ m5v0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                return new b((e) xvf0Var3.get(), (f) xvf0Var2.get(), (tse) xvf0Var.get());
            case 1:
                return new f((tt2) xvf0Var3.get(), i5m.a(xvf0Var2), (qmp) xvf0Var.get());
            case 2:
                return new c((tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 3:
                return new mgv0((com.yandex.go.navigation.screen.c) xvf0Var3.get(), (urv0) xvf0Var2.get(), (mzb) xvf0Var.get());
            case 4:
                return new a((qw6) xvf0Var2.get(), (rqo) xvf0Var.get(), (fvt) xvf0Var3.get());
            case 5:
                return new smv0((xcv0) xvf0Var3.get(), (jas0) xvf0Var2.get(), (dei0) xvf0Var.get());
            case 6:
                return new ru.yandex.taxi.tooltips.repository.b((dne0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (tse) xvf0Var.get());
            case 7:
                return new yzv0((fva0) xvf0Var3.get(), (lx4) xvf0Var2.get(), (o631) xvf0Var.get());
            case 8:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.a((rqo) xvf0Var3.get(), (gu11) xvf0Var2.get(), (jc00) xvf0Var.get());
            case 9:
                return new nfh((zuj0) xvf0Var3.get(), (i) xvf0Var2.get(), (dhe0) xvf0Var.get());
            case 10:
                return new h7w0((n20) xvf0Var3.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var2.get(), (ri1) xvf0Var.get());
            case 11:
                return new h((g) xvf0Var3.get(), (s870) xvf0Var2.get(), (c4r0) xvf0Var.get());
            case 12:
                com.yandex.go.superapp.order.multi.old.provider.g gVar = (com.yandex.go.superapp.order.multi.old.provider.g) xvf0Var3.get();
                sm40 sm40Var = (sm40) xvf0Var2.get();
                return new y9w0(gVar, sm40Var);
            case 13:
                return new com.yandex.go.superapp_favorites.router.a((i6r) xvf0Var3.get(), xvf0Var2, (ru.yandex.taxi.deeplinks.b) xvf0Var.get());
            case 14:
                return new com.yandex.go.superapp.searchbar.impl.domain.h((Context) xvf0Var3.get(), (qdw0) xvf0Var2.get(), (pdc) xvf0Var.get());
            case 15:
                return new zew0((gfw0) xvf0Var3.get(), (com.yandex.go.suggest.impl.data.flex.variables.b) xvf0Var2.get(), (com.yandex.go.suggest.impl.data.a) xvf0Var.get());
            case 16:
                return new lhw0(i5m.a(xvf0Var3), (q1w0) xvf0Var2.get(), (tse) xvf0Var.get());
            case 17:
                return new dmw0((hqj0) xvf0Var3.get(), (cg31) xvf0Var2.get(), (pp40) xvf0Var.get());
            case 18:
                return new vpw0((lx4) xvf0Var3.get(), (xcv0) xvf0Var2.get(), (zow0) xvf0Var.get());
            case 19:
                return new sww0((wnt) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 20:
                return new d2x0((ViewGroup) xvf0Var3.get(), (g2x0) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 21:
                return new com.yandex.go.settings.domain.c((xk60) xvf0Var3.get(), (ney) xvf0Var2.get(), (tse) xvf0Var.get());
            case 22:
                return new j7x0((ju6) xvf0Var3.get(), (Context) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 23:
                return new xox0((com.yandex.go.navigation.screen.c) xvf0Var3.get(), (qbl0) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 24:
                return new bux0((k) xvf0Var3.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var2.get(), (ru.yandex.taxi.am.token.a) xvf0Var.get());
            case 25:
                return new fzx0((q280) xvf0Var3.get(), (com.yandex.go.taxi.order.chat.domain.a) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 26:
                return new com.yandex.go.taxi.order.deeplink.b(i5m.a(xvf0Var3), (com.yandex.go.taxi.order.interactors.a) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 27:
                return new s1y0((tse) xvf0Var3.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var2.get(), (v) xvf0Var.get());
            case 28:
                h3y a = i5m.a(xvf0Var3);
                return new e0((tt2) xvf0Var.get(), (tse) xvf0Var2.get(), a);
            default:
                return new kay0((hit) xvf0Var3.get(), (p2y0) xvf0Var2.get(), (u880) xvf0Var.get());
        }
    }
}
