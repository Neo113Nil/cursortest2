package defpackage;

import android.content.Context;
import com.yandex.go.notifications.acknowledge.data.local.a;
import com.yandex.go.sdk_registry.runtime.b;
import com.yandex.taxi.go_platform.delegates.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.settings.api.PushSettingsApi;

/* loaded from: classes9.dex */
public final class eqf0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ eqf0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new dqf0((dne0) xvf0Var.get());
            case 1:
                return new jc4((pho) xvf0Var.get());
            case 2:
                return new rx2((pho) xvf0Var.get());
            case 3:
                return new t61((pho) xvf0Var.get());
            case 4:
                return new wms(7);
            case 5:
                List a = ((ykw0) xvf0Var.get()).a();
                ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ol20((String) it.next()));
                }
                return arrayList;
            case 6:
                fxf0 fxf0Var = (fxf0) xvf0Var.get();
                q5z.i(fxf0Var);
                return fxf0Var;
            case 7:
                bpt bptVar = (bpt) xvf0Var.get();
                q5z.i(bptVar);
                return bptVar;
            case 8:
                kpt kptVar = (kpt) xvf0Var.get();
                q5z.i(kptVar);
                return kptVar;
            case 9:
                ipt iptVar = (ipt) xvf0Var.get();
                q5z.i(iptVar);
                return iptVar;
            case 10:
                kl20 kl20Var = (kl20) ((b) xvf0Var.get()).a(mr20.a());
                q5z.i(kl20Var);
                return kl20Var;
            case 11:
                return new tyf0((x22) xvf0Var.get());
            case 12:
                return new a((eex) xvf0Var.get());
            case 13:
                return new p0g0((pho) xvf0Var.get());
            case 14:
                return new u0g0(i5m.a(xvf0Var));
            case 15:
                return new a1g0((xk60) xvf0Var.get());
            case 16:
                return new c((g5g0) xvf0Var.get());
            case 17:
                return hba1.f((w1g0) xvf0Var.get());
            case 18:
                return hba1.g((Context) xvf0Var.get());
            case 19:
                return new p1g0(i5m.a(xvf0Var));
            case 20:
                return new kug((rqo) xvf0Var.get(), 2);
            case 21:
                t1g0 t1g0Var = new t1g0((ud0) xvf0Var.get());
                t1g0Var.b = "suggested_favorites";
                return t1g0Var;
            case 22:
                return bei.l((com.yandex.go.navigation.screen.c) xvf0Var.get());
            case 23:
                return new vt51((ut51) xvf0Var.get());
            case 24:
                return new com.ybsdk.feature.push.impl.a((dnp0) xvf0Var.get());
            case 25:
                return new v7j((dne0) xvf0Var.get(), 2);
            case 26:
                return d3g0.a((as21) xvf0Var.get());
            case 27:
                PushSettingsApi b = d3g0.b((on2) xvf0Var.get());
                q5z.i(b);
                return b;
            case 28:
                return new q3g0((rqo) xvf0Var.get());
            default:
                return new g4g0((dne0) xvf0Var.get());
        }
    }
}
