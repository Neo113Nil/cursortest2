package defpackage;

import android.content.Context;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.yandex.go.eboks.objects.data.b;
import com.yandex.go.eboks.objects.data.mapper.c;
import com.yandex.go.superapp.impl.presenter_delegate.e;
import com.yandex.messaging.internal.view.input.emojipanel.a;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaFragment;
import com.ybsdk.feature.kycesia.internal.screens.sdk.OpenEsiaSdkFragment;
import java.util.LinkedHashMap;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.g;

/* loaded from: classes14.dex */
public final class c7n implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public c7n(cpn cpnVar, n3w n3wVar) {
        this.a = 5;
        this.b = n3wVar;
    }

    public static c7n a(eqh eqhVar) {
        return new c7n(eqhVar, 1);
    }

    public static c7n b(xvf0 xvf0Var) {
        return new c7n(xvf0Var, 2);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new g((iry0) xvf0Var.get());
            case 1:
                return new pj((pho) xvf0Var.get());
            case 2:
                return new i9n((rqo) xvf0Var.get());
            case 3:
                return new c((b) xvf0Var.get());
            case 4:
                return new b1((pho) xvf0Var.get());
            case 5:
                tw51 tw51Var = (tw51) xvf0Var.get();
                return new apn(new pgi(i5m.b(new z9n(new byf(tw51Var, 17), new byf(tw51Var, 19), new byf(tw51Var, 20), new byf(tw51Var, 16), 3)), new byf(tw51Var, 18), new byf(tw51Var, 21), 11), new tv3((com.ybsdk.rconfig.b) ((h9g) tw51Var).v.A.get()));
            case 6:
                return new a((Context) xvf0Var.get());
            case 7:
                return new i5o((vse) xvf0Var.get());
            case 8:
                tw51 tw51Var2 = (tw51) xvf0Var.get();
                byf byfVar = new byf(tw51Var2, 28);
                byf byfVar2 = new byf(tw51Var2, 26);
                byf byfVar3 = new byf(tw51Var2, 25);
                byf byfVar4 = new byf(tw51Var2, 24);
                byf byfVar5 = new byf(tw51Var2, 23);
                qrb qrbVar = new qrb((xvf0) byfVar, (xvf0) byfVar3, (xvf0) byfVar2, (xvf0) byfVar4, (xvf0) byfVar5, 25, (byte) 0);
                byf byfVar6 = new byf(tw51Var2, 27);
                b570 b570Var = new b570(n3w.a(new q570(new dt20(byfVar, byfVar2, qrbVar, byfVar6, 13))), byfVar4, i2);
                n3w a = n3w.a(new g570(new v920(new byf(tw51Var2, 22), byfVar, byfVar6, qrbVar, byfVar5, l570.a)));
                int i3 = 1;
                b570 b570Var2 = new b570(a, byfVar4, i3);
                LinkedHashMap A = gtq0.A(2);
                A.put(OpenEsiaFragment.class, b570Var);
                A.put(OpenEsiaSdkFragment.class, b570Var2);
                kbo kboVar = (kbo) i5m.b(new dsl(fdp0.a, new br00(A), i3)).get();
                q5z.i(kboVar);
                return kboVar;
            case 9:
                return new nbo((np41) xvf0Var.get());
            case 10:
                return new lbo((nvd) xvf0Var.get());
            case 11:
                return new fio((pho) xvf0Var.get());
            case 12:
                return new com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.requesters.exchange.a((kt90) xvf0Var.get());
            case 13:
                return new gym((lg5) xvf0Var.get());
            case 14:
                return new pko((lg5) xvf0Var.get(), i2);
            case 15:
                return new woo((voo) xvf0Var.get());
            case 16:
                return new gwo((gd3) xvf0Var.get());
            case 17:
                vzf vzfVar = (vzf) xvf0Var.get();
                return new com.yandex.go.superapp.impl.presenter_delegate.a(vzfVar.e, vzfVar.a, vzfVar.a());
            case 18:
                vzf vzfVar2 = (vzf) xvf0Var.get();
                m mVar = vzfVar2.b;
                yrv0 yrv0Var = (yrv0) mVar.a;
                q5z.h(yrv0Var);
                return new e1p(yrv0Var, (gof0) mVar.b, vzfVar2.f, (v8w0) mVar.j);
            case 19:
                return ((vzf) xvf0Var.get()).a();
            case 20:
                vzf vzfVar3 = (vzf) xvf0Var.get();
                m mVar2 = vzfVar3.b;
                u1p u1pVar = (u1p) mVar2.c;
                q5z.h(u1pVar);
                tt2 tt2Var = (tt2) mVar2.d;
                q5z.h(tt2Var);
                return new com.yandex.go.superapp.impl.presenter_delegate.c(u1pVar, tt2Var, vzfVar3.c, vzfVar3.a, vzfVar3.g, vzfVar3.f);
            case 21:
                return ((vzf) xvf0Var.get()).b();
            case 22:
                vzf vzfVar4 = (vzf) xvf0Var.get();
                fsv0 fsv0Var = (fsv0) vzfVar4.b.g;
                q5z.h(fsv0Var);
                return new e(fsv0Var, vzfVar4.e, vzfVar4.a, vzfVar4.f, vzfVar4.b(), vzfVar4.a(), vzfVar4.h);
            case 23:
                t tVar = ((x1p) xvf0Var.get()).b;
                q5z.i(tVar);
                return tVar;
            case 24:
                return r.a((x1p) xvf0Var.get());
            case 25:
                fen fenVar = ((x6w0) xvf0Var.get()).o;
                q5z.i(fenVar);
                return fenVar;
            case 26:
                return new b1((pho) xvf0Var.get());
            case 27:
                return new q5p((lg5) xvf0Var.get(), i2);
            case 28:
                return new com.yandex.go.navigator.favorites.repository.c((rqo) xvf0Var.get());
            default:
                return new ru.yandex.taxi.favorites.experiment.e((rqo) xvf0Var.get());
        }
    }

    public /* synthetic */ c7n(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
