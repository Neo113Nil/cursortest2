package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import com.yandex.go.address.address_map_picker.domain.d;
import com.yandex.go.agreement.domain.b;
import com.yandex.go.loyalty.impl.common.data.c;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.i;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class lf implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ lf(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new kf(i5m.a(xvf0Var2), (jd) xvf0Var.get());
            case 1:
                ((im51) xvf0Var2.get()).getClass();
                vw60 vw60Var = (vw60) xvf0Var.get();
                q5z.i(vw60Var);
                return vw60Var;
            case 2:
                return new i((g) xvf0Var2.get(), (lm) xvf0Var.get());
            case 3:
                return new k40((Activity) xvf0Var2.get(), (z9s0) xvf0Var.get());
            case 4:
                return new a60((ComponentActivity) xvf0Var2.get(), (f) xvf0Var.get());
            case 5:
                return new d90((cda0) xvf0Var2.get(), (raa0) xvf0Var.get());
            case 6:
                return new ud0((rqo) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 7:
                return new mu0((zuh) xvf0Var2.get(), (nu0) xvf0Var.get());
            case 8:
                return new rv0((eqe) xvf0Var2.get(), (w7v0) xvf0Var.get());
            case 9:
                return new AddressInputView((Context) xvf0Var2.get(), (pav) xvf0Var.get());
            case 10:
                return new d((bp0) xvf0Var2.get(), (a) xvf0Var.get());
            case 11:
                return new k01((w030) xvf0Var.get(), (Context) xvf0Var2.get());
            case 12:
                return new fa1((lx4) xvf0Var.get(), (wnt) xvf0Var2.get());
            case 13:
                return new ij1((Context) xvf0Var2.get(), (i130) xvf0Var.get());
            case 14:
                return new b((h) xvf0Var2.get(), (ru.yandex.taxi.am.token.a) xvf0Var.get());
            case 15:
                return new tq1(i5m.a(xvf0Var2), (dne0) xvf0Var.get());
            case 16:
                return new c((nxz) xvf0Var2.get(), (lvz) xvf0Var.get());
            case 17:
                return new xz1((tj60) xvf0Var.get(), (Context) xvf0Var2.get());
            case 18:
                return new v32((g9a0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 19:
                return new com.yandex.go.performance_class.device_info.a((Context) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 20:
                return new com.yandex.go.network_metrics.a((Context) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 21:
                Context context = (Context) xvf0Var2.get();
                ((na1) ((ma1) xvf0Var.get())).getClass();
                Long m = bvu0.m(10, as6.T());
                return new itt(context, m != null ? m.longValue() : -1L);
            case 22:
                return new gly0();
            case 23:
                return ((lt2) xvf0Var2.get()).b((h6r) xvf0Var.get());
            case 24:
                return ((lt2) xvf0Var2.get()).d((zuj0) xvf0Var.get());
            case 25:
                lt2 lt2Var = (lt2) xvf0Var2.get();
                lt2Var.getClass();
                return new v9h();
            case 26:
                lt2 lt2Var2 = (lt2) xvf0Var2.get();
                lt2Var2.getClass();
                return new Object() { // from class: it2
                };
            case 27:
                return ((lt2) xvf0Var2.get()).w((h6r) xvf0Var.get());
            case 28:
                return ((lt2) xvf0Var2.get()).x((h6r) xvf0Var.get());
            default:
                return new hu2(0, (q5h) xvf0Var2.get(), (com.yandex.go.analytics.b) xvf0Var.get());
        }
    }
}
