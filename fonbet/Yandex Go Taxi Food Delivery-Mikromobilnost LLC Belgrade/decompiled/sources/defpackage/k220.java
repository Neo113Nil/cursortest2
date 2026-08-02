package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.superapp.order.multi.old.provider.h;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.internal.images.b;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.masstransit.datasource.routing.a;
import ru.yandex.taxi.masstransit.mapper.d;
import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.widget.utils.e;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes8.dex */
public final class k220 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public k220(fx50 fx50Var, xvf0 xvf0Var, p350 p350Var, xvf0 xvf0Var2) {
        this.a = 25;
        this.b = xvf0Var;
        this.c = p350Var;
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
                return new b(i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 1:
                return new i720((Context) xvf0Var3.get(), (q6v) xvf0Var2.get(), (String) xvf0Var.get());
            case 2:
                return new f920((com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (kse) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 3:
                return new kb20((dne0) xvf0Var3.get(), (b03) xvf0Var2.get(), (zl60) xvf0Var.get());
            case 4:
                return new xb20((Context) xvf0Var3.get(), (rb20) xvf0Var2.get(), (whl0) xvf0Var.get());
            case 5:
                return new c((j) xvf0Var3.get(), (f430) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 6:
                return new yn30((pav) xvf0Var3.get(), (tse) xvf0Var.get(), (Context) xvf0Var2.get());
            case 7:
                return new yp30((a) xvf0Var3.get(), (ole0) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 8:
                return new ru.yandex.taxi.masstransit.mapper.c((Context) xvf0Var3.get(), (d) xvf0Var2.get(), (ru.yandex.taxi.design.utils.b) xvf0Var.get());
            case 9:
                return new com.yandex.go.payments.transport.navigation.a(xvf0Var3, (po21) xvf0Var2.get(), (com.yandex.go.payments.transport.domain.a) xvf0Var.get());
            case 10:
                return new com.yandex.go.payments.transport.navigation.b(xvf0Var3, (iz30) xvf0Var2.get(), (ru.yandex.taxi.deeplinks.b) xvf0Var.get());
            case 11:
                return new com.yandex.go.payments.transport.navigation.c((Context) xvf0Var3.get(), (qr30) xvf0Var2.get(), (lz30) xvf0Var.get());
            case 12:
                return new ru.yandex.taxi.masstransit.datasource.routing.b((tt2) xvf0Var.get(), (f410) xvf0Var3.get(), (jtq0) xvf0Var2.get());
            case 13:
                return new ru.yandex.taxi.masstransit.datasource.routing.c((tt2) xvf0Var2.get(), (f410) xvf0Var3.get(), (jtq0) xvf0Var.get());
            case 14:
                return new h((g) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (tse) xvf0Var.get());
            case 15:
                return new vo40((rqo) xvf0Var3.get(), (ijj0) xvf0Var.get(), (com.yandex.go.taxi.tariffs.repository.g) xvf0Var2.get());
            case 16:
                return new wr40((yu40) xvf0Var3.get(), (wnt) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 17:
                return new com.yandex.go.multimodal_route.a((i6r) xvf0Var3.get(), xvf0Var2, (lfl0) xvf0Var.get());
            case 18:
                return new com.yandex.go.multimodal_route.interactors.d((e) xvf0Var3.get(), (com.yandex.go.multimodal_route.experiement.c) xvf0Var2.get(), (b8r) xvf0Var.get());
            case 19:
                return new jzz((com.yandex.messaging.internal.authorized.j) xvf0Var3.get(), (zbf) xvf0Var2.get(), (kse) xvf0Var.get());
            case 20:
                return new com.yandex.go.messenger_native.d((Context) xvf0Var3.get(), (c120) xvf0Var2.get(), (t350) xvf0Var.get());
            case 21:
                return new okv((Context) xvf0Var3.get(), (tj60) xvf0Var2.get(), (tj60) xvf0Var.get());
            case 22:
                return new y030((a850) xvf0Var3.get(), (ffe) xvf0Var2.get(), (ru.yandex.taxi.banners.c) xvf0Var.get());
            case 23:
                return new va50((k0b0) xvf0Var3.get(), (i6r) xvf0Var2.get(), (com.yandex.go.navigator.di.a) xvf0Var.get());
            case 24:
                return new jb50((kc50) xvf0Var3.get(), (z0j) xvf0Var2.get(), (fx60) xvf0Var.get());
            case 25:
                return new cx50((c7j0) xvf0Var2.get(), (bg7) xvf0Var.get(), (Moshi) xvf0Var3.get());
            case 26:
                return new ru.yandex.taxi.search.c((q) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 27:
                return new q((pdc) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (yp2) xvf0Var.get());
            case 28:
                return new z660((o) xvf0Var3.get(), (jc00) xvf0Var2.get(), (w660) xvf0Var.get());
            default:
                csu csuVar = (csu) xvf0Var3.get();
                q860 q860Var = (q860) xvf0Var2.get();
                return new lot(2, csuVar, q860Var);
        }
    }

    public /* synthetic */ k220(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
