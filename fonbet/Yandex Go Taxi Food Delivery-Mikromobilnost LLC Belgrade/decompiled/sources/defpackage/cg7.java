package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.messaging.internal.calls.a;
import com.ybsdk.network.retrofit.e;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.h;
import ru.yandex.taxi.map_common.map.c;
import ru.yandex.taxi.map_common.map.p;

/* loaded from: classes8.dex */
public final class cg7 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ cg7(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new bg7((e) xvf0Var2.get(), (b) xvf0Var.get());
            case 1:
                return new kg7((pae) xvf0Var2.get(), (h) xvf0Var.get());
            case 2:
                return new m2v((SharedPreferences) xvf0Var2.get(), (SharedPreferences) xvf0Var.get());
            case 3:
                return new il7((s320) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 4:
                return new c06((k880) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 5:
                return new dw7((a320) xvf0Var2.get(), (rsc) xvf0Var.get());
            case 6:
                return new c58((zuj0) xvf0Var.get(), (mqv0) xvf0Var2.get());
            case 7:
                return new p78(xvf0Var2, i5m.a(xvf0Var));
            case 8:
                return new t((Context) xvf0Var2.get(), (w030) xvf0Var.get(), 1);
            case 9:
                return new se8((zuj0) xvf0Var2.get(), (j5z) xvf0Var.get());
            case 10:
                return new pv8((gd3) xvf0Var2.get(), (jwh) xvf0Var.get());
            case 11:
                return new rz8((p) xvf0Var2.get(), (c) xvf0Var.get());
            case 12:
                return new yz8(xvf0Var2, i5m.a(xvf0Var));
            case 13:
                return new c06((lx4) xvf0Var2.get(), (i29) xvf0Var.get());
            case 14:
                return new j29((s1d0) xvf0Var2.get(), (cba0) xvf0Var.get());
            case 15:
                return new a49((pav) xvf0Var2.get(), (l) xvf0Var.get());
            case 16:
                return new a((Context) xvf0Var.get(), (Looper) xvf0Var2.get());
            case 17:
                return new ga9((fn21) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 18:
                return new com.yandex.go.taxi.order.change.driver.b((d) xvf0Var2.get(), (com.yandex.go.taxi.order.change.driver.d) xvf0Var.get());
            case 19:
                return new ru.yandex.taxi.settings.main.a(xvf0Var, (com.yandex.go.lifecycle.a) xvf0Var2.get());
            case 20:
                return new com.yandex.go.chargers.deeplink.b(xvf0Var, (com.yandex.go.lifecycle.a) xvf0Var2.get());
            case 21:
                return new com.yandex.go.chargers.error.data.a((wnt) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 22:
                return new h3a((em9) xvf0Var2.get(), (dyx) xvf0Var.get());
            case 23:
                return new m3a(xvf0Var2, (pep0) xvf0Var.get());
            case 24:
                return new x5a((oep0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 25:
                return new com.yandex.go.chargers.a(i5m.a(xvf0Var2), (ru.yandex.taxi.deeplinks.b) xvf0Var.get());
            case 26:
                return new com.yandex.go.chargers.order.data.mapper.a(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 27:
                return new kza(xvf0Var2, (ast0) xvf0Var.get());
            case 28:
                return new com.yandex.go.quark.dynamic.chat.a((tse) xvf0Var2.get(), (tt2) xvf0Var.get());
            default:
                return new com.yandex.go.taxi.order.provider.chat.c((com.yandex.go.taxi.order.chat.domain.a) xvf0Var2.get(), (z221) xvf0Var.get());
        }
    }
}
