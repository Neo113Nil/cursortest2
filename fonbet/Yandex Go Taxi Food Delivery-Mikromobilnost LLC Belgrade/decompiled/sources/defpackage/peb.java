package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.messaging.internal.i;
import com.yandex.mob.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.e;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class peb implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ peb(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static peb a(eqh eqhVar) {
        return new peb(eqhVar, 4);
    }

    public static peb b(eqh eqhVar) {
        return new peb(eqhVar, 8);
    }

    public static PayEnvironment c(DefaultEnvironment defaultEnvironment) {
        PayEnvironment payEnvironment;
        int i = yah.a[defaultEnvironment.ordinal()];
        if (i == 1) {
            payEnvironment = PayEnvironment.TESTING;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            payEnvironment = PayEnvironment.PRODUCTION;
        }
        q5z.i(payEnvironment);
        return payEnvironment;
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences("finsdk_shared_prefs", 0);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new oeb((at2) xvf0Var.get());
            case 1:
                return new rfb((pho) xvf0Var.get());
            case 2:
                b bVar = (b) ((com.yandex.go.sdk_registry.runtime.b) xvf0Var.get()).a(mr20.c);
                q5z.i(bVar);
                return bVar;
            case 3:
                return new b1((pho) xvf0Var.get());
            case 4:
                return new d3c((pho) xvf0Var.get());
            case 5:
                return new vr((Context) xvf0Var.get(), (char) 0);
            case 6:
                return new yfa((qdc) xvf0Var.get());
            case 7:
                return new dj3(i5m.a(xvf0Var));
            case 8:
                return new wly0();
            case 9:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.comment.b((e) xvf0Var.get());
            case 10:
                return new toc(xvf0Var);
            case 11:
                return new b1((pho) xvf0Var.get());
            case 12:
                return new vbb((zuj0) xvf0Var.get());
            case 13:
                return new vyc((qyc) xvf0Var.get());
            case 14:
                return new rz0((rqo) xvf0Var.get(), 4);
            case 15:
                return new ghd((e6t0) xvf0Var.get());
            case 16:
                return new rz0((rqo) xvf0Var.get(), 5);
            case 17:
                return new gvd((jgv) xvf0Var.get());
            case 18:
                return new hwd((Context) xvf0Var.get());
            case 19:
                return new com.yandex.go.places.models.data.mappers.e((c) xvf0Var.get());
            case 20:
                return new pwd((tt2) xvf0Var.get());
            case 21:
                return new xx70((Context) xvf0Var.get(), 3);
            case 22:
                return new a5e((Looper) xvf0Var.get());
            case 23:
                return new r5e((i) xvf0Var.get());
            case 24:
                return new cce((Context) xvf0Var.get());
            case 25:
                return c((DefaultEnvironment) xvf0Var.get());
            case 26:
                return d((Context) xvf0Var.get());
            case 27:
                return new b1((pho) xvf0Var.get());
            case 28:
                return new z0f((a) xvf0Var.get());
            default:
                return new x1f((zuj0) xvf0Var.get());
        }
    }
}
