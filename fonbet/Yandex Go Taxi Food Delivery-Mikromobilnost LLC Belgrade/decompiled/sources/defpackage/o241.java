package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.taxi.summary.mobilityhub.interactor.j0;
import com.yandex.go.walking.navigation.impl.navigation_core.b;
import com.yandex.go.xiva.domain.g;
import com.yandex.go.yb.data.u;
import com.yandex.messaging.chat.attachments.d;
import com.yandex.messenger.websdk.api.WebMessenger;
import com.yandex.plus.home.c;
import ru.yandex.taxi.walkroute.a;
import ru.yandex.taxi.web.deeplink.i;

/* loaded from: classes8.dex */
public final class o241 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ o241(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                return new n241((tse) xvf0Var3.get(), (y141) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 1:
                return new a341((y141) xvf0Var3.get(), (b) xvf0Var2.get(), (tse) xvf0Var.get());
            case 2:
                return new a((tt2) xvf0Var3.get(), (kra0) xvf0Var2.get(), (el00) xvf0Var.get());
            case 3:
                return new j0((kra0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 4:
                return new k941((ep90) xvf0Var3.get(), (ComponentActivity) xvf0Var2.get(), (u02) xvf0Var.get());
            case 5:
                return new if41((fva0) xvf0Var3.get(), (w030) xvf0Var2.get(), (zm41) xvf0Var.get());
            case 6:
                return new ru.yandex.taxi.messenger.domain.a((WebMessenger) xvf0Var3.get(), (ru.yandex.taxi.am.token.a) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 7:
                return new am2((u02) xvf0Var3.get(), (ipt) xvf0Var2.get(), (fpt) xvf0Var.get());
            case 8:
                z3d0 z3d0Var = (z3d0) xvf0Var3.get();
                x2d0 x2d0Var = (x2d0) xvf0Var2.get();
                kgz kgzVar = (kgz) xvf0Var.get();
                try {
                    f4d0 f4d0Var = new f4d0(x2d0Var.h, x2d0Var.i);
                    qq31 qq31Var = new qq31(6, x2d0Var);
                    c cVar = (c) z3d0Var;
                    g4d0 g4d0Var = new g4d0(f4d0Var, cVar.b, cVar.c, cVar.d, cVar.f, cVar.g, cVar.h, cVar.j);
                    qq31Var.invoke(g4d0Var);
                    i4d0 a = g4d0Var.a();
                    q5z.i(a);
                    return a;
                } catch (RuntimeException e) {
                    kgzVar.b(e, "Failed to create PlusSdkComponent");
                    ny61.h("Failed to create PlusSdkComponent", e);
                    return null;
                }
            case 9:
                return new i((tt2) xvf0Var3.get(), (gq41) xvf0Var2.get(), (iq41) xvf0Var.get());
            case 10:
                xxe0 xxe0Var = (xxe0) xvf0Var3.get();
                uy70 uy70Var = (uy70) xvf0Var2.get();
                return new h151(xxe0Var, uy70Var);
            case 11:
                return new v551((Context) xvf0Var3.get(), (WifiManager) xvf0Var2.get(), (q7y) xvf0Var.get());
            case 12:
                return new g((com.yandex.go.xiva.data.a) xvf0Var3.get(), (se51) xvf0Var2.get(), (qe51) xvf0Var.get());
            case 13:
                return new d(i5m.a(xvf0Var3), (vse) xvf0Var2.get(), (kse) xvf0Var.get());
            case 14:
                return new com.yandex.go.business.impl.domain.g((rqo) xvf0Var3.get(), (iq41) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 15:
                return new qt51((FragmentActivity) xvf0Var3.get(), (hr51) xvf0Var2.get(), i5m.a(xvf0Var));
            case 16:
                return new u(i5m.a(xvf0Var3), xvf0Var2, i5m.a(xvf0Var));
            case 17:
                return new jy51((u) xvf0Var3.get(), i5m.a(xvf0Var2), (iy51) xvf0Var.get());
            case 18:
                zuj0 zuj0Var = (zuj0) xvf0Var3.get();
                return new ru.yandex.taxi.location.zerokm.datasource.b((tt2) xvf0Var.get(), (wnt) xvf0Var2.get(), zuj0Var);
            default:
                return new sd61((tt2) xvf0Var3.get(), (wnt) xvf0Var2.get(), (dne0) xvf0Var.get());
        }
    }
}
