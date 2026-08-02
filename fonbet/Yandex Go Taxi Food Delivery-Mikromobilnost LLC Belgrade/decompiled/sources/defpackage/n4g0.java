package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.yandex.go.diagnostic_qr.network.QrDiagnosticDataApi;
import com.yandex.go.intentprocessor.i;
import com.yandex.go.taxi.order.queue.interactor.d;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.vendor_api.google.push.a;

/* loaded from: classes10.dex */
public final class n4g0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ n4g0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new m4g0((dne0) xvf0Var.get());
            case 1:
                return new o4g0((Application) xvf0Var.get());
            case 2:
                return new q4g0(xvf0Var);
            case 3:
                return new i5g0((a) xvf0Var.get());
            case 4:
                return new x6g0((rqo) xvf0Var.get());
            case 5:
                QrDiagnosticDataApi f = kca1.f((on2) xvf0Var.get());
                q5z.i(f);
                return f;
            case 6:
                return new zgg0(xvf0Var);
            case 7:
                return new s66((rqo) xvf0Var.get(), 9);
            case 8:
                return new tig0((dne0) xvf0Var.get());
            case 9:
                return new d((com.yandex.go.taxi.order.queue.repository.a) xvf0Var.get());
            case 10:
                return new com.yandex.go.taxi.order.queue.repository.a((dne0) xvf0Var.get());
            case 11:
                return new e3r((b220) xvf0Var.get(), 1);
            case 12:
                return new hei0((alv) xvf0Var.get());
            case 13:
                return new yo40((dei0) xvf0Var.get());
            case 14:
                return new aw8((i6r) xvf0Var.get());
            case 15:
                return new mni0((xdf) xvf0Var.get());
            case 16:
                return new u8w((pho) xvf0Var.get());
            case 17:
                return new loi0((u500) xvf0Var.get());
            case 18:
                return new lpi0((rqo) xvf0Var.get());
            case 19:
                return new qti0((Looper) xvf0Var.get());
            case 20:
                return new vui0((AppAnalyticsReporter) xvf0Var.get());
            case 21:
                return new bzi0((rqo) xvf0Var.get());
            case 22:
                return new xzi0((dne0) xvf0Var.get());
            case 23:
                return new dy6((rqo) xvf0Var.get(), 5);
            case 24:
                return new o8g0((Context) xvf0Var.get());
            case 25:
                return new u7j0((cda0) xvf0Var.get());
            case 26:
                return new yaj0((zaj0) xvf0Var.get());
            case 27:
                return new vbj0((dqe0) xvf0Var.get());
            case 28:
                return new lcj0((rqo) xvf0Var.get());
            default:
                return new thj0((i) xvf0Var.get());
        }
    }
}
