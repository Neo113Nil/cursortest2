package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.c;
import ru.yandex.logistics.sdk.order_validation.impl.interactor.a;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.b;
import ru.yandex.taxi.multiorder.n;
import ru.yandex.taxi.superapp.knownOrder.u;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkJsNativeApi;

/* loaded from: classes8.dex */
public final class jv21 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ jv21(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new r100(false);
            case 1:
                return new b((a) xvf0Var2.get(), (i031) xvf0Var.get());
            case 2:
                return new p631((czf0) xvf0Var2.get(), (jv2) xvf0Var.get());
            case 3:
                return new rfw0((com.yandex.go.analytics.b) xvf0Var2.get(), (cg31) xvf0Var.get());
            case 4:
                return new cr31((xop0) xvf0Var2.get(), (com.ybsdk.rconfig.b) xvf0Var.get());
            case 5:
                return new oy31((oyq) xvf0Var2.get(), (a1r) xvf0Var.get());
            case 6:
                return new n((u) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 7:
                return new n041((dne0) xvf0Var2.get(), (exx0) xvf0Var.get());
            case 8:
                return new a640((zuj0) xvf0Var.get(), (Context) xvf0Var2.get());
            case 9:
                return new p241((n141) xvf0Var2.get(), (i6r) xvf0Var.get());
            case 10:
                return new com.yandex.go.walking.navigation.impl.navigation_core.guidance.b((n141) xvf0Var2.get(), (ehs0) xvf0Var.get());
            case 11:
                return new j441((Lifecycle) xvf0Var2.get(), (k441) xvf0Var.get());
            case 12:
                return new v541((com.yandex.go.walking.navigation.impl.navigation_core.b) xvf0Var2.get(), (ngl0) xvf0Var.get());
            case 13:
                return new x841((a850) xvf0Var2.get(), (c) xvf0Var.get());
            case 14:
                return new b941((t841) xvf0Var2.get(), (x841) xvf0Var.get());
            case 15:
                return new wpy0(29, (dm41) xvf0Var.get());
            case 16:
                return new p450((com.ybsdk.rconfig.b) xvf0Var2.get(), (qpi0) xvf0Var.get());
            case 17:
                return new WebViewFromDeeplinkJsNativeApi((Context) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 18:
                return new yu41((fn21) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 19:
                return new qv41((Context) xvf0Var2.get(), i5m.a(xvf0Var));
            case 20:
                return new f051((rqo) xvf0Var.get(), (zuj0) xvf0Var2.get());
            case 21:
                return new ru.yandex.taxi.widgets.data.repository.widgets.a((ru.yandex.taxi.widgets.data.datasources.api.a) xvf0Var2.get(), (g551) xvf0Var.get());
            case 22:
                return new za51((Context) xvf0Var2.get(), (rz10) xvf0Var.get());
            case 23:
                return new qe51((wnt) xvf0Var2.get(), i5m.a(xvf0Var));
            case 24:
                return new fj51((Activity) xvf0Var2.get(), (jj3) xvf0Var.get());
            case 25:
                hj51 hj51Var = (hj51) ((kg51) xvf0Var.get()).i.invoke((dnp0) xvf0Var2.get());
                q5z.i(hj51Var);
                return hj51Var;
            case 26:
                return new dy31(10);
            case 27:
                return new jn51((lx4) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 28:
                return new m3a((pep0) xvf0Var2.get(), xvf0Var);
            default:
                return new com.yandex.go.business.impl.deeplink.c(i5m.a(xvf0Var2), (iq41) xvf0Var.get());
        }
    }

    public /* synthetic */ jv21(gj51 gj51Var, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
