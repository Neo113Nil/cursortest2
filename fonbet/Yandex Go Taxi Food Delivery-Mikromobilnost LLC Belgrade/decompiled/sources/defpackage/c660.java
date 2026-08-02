package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import com.yandex.delivery.utils.notificationmanager.impl.b;
import com.yandex.go.notifications.acknowledge.data.remote.ClientNotifyApi;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.activity.i;
import ru.yandex.taxi.experiments.history.a;
import ru.yandex.taxi.linked_order.interactor.i0;
import ru.yandex.taxi.linked_order.provider.d;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.notifications.c;

/* loaded from: classes9.dex */
public final class c660 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ c660(s960 s960Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((rqo) xvf0Var.get());
            case 1:
                return new co40((pho) xvf0Var.get());
            case 2:
                return new u8w((pho) xvf0Var.get());
            case 3:
                return new wdz();
            case 4:
                return new r960(xvf0Var);
            case 5:
                return new kjz((Context) xvf0Var.get(), 12);
            case 6:
                return new dy6((rqo) xvf0Var.get(), 4);
            case 7:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ClientNotifyApi clientNotifyApi = (ClientNotifyApi) on2Var.a(GoApiName.TaxiV3, ClientNotifyApi.class);
                q5z.i(clientNotifyApi);
                return clientNotifyApi;
            case 8:
                return new mg60((pho) xvf0Var.get());
            case 9:
                return new gh60((dne0) xvf0Var.get());
            case 10:
                return new c(i5m.a(xvf0Var));
            case 11:
                return new i0((d) xvf0Var.get());
            case 12:
                return new b((st2) xvf0Var.get());
            case 13:
                return new yvi0((as21) xvf0Var.get());
            case 14:
                return new fb7((rqo) xvf0Var.get());
            case 15:
                return new ej60((Application) xvf0Var.get());
            case 16:
                return new vj60((y4g0) xvf0Var.get());
            case 17:
                return new cl00(1, (u6) xvf0Var.get());
            case 18:
                return new dp60((dne0) xvf0Var.get());
            case 19:
                Lifecycle lifecycle = ((su2) xvf0Var.get()).getLifecycle();
                q5z.i(lifecycle);
                return (t) lifecycle;
            case 20:
                return new mz60(i5m.a(xvf0Var));
            case 21:
                return new i((tse) xvf0Var.get());
            case 22:
                return new qc20((oxu0) xvf0Var.get());
            case 23:
                return new w270((key0) xvf0Var.get());
            case 24:
                return new d3a((rqo) xvf0Var.get(), 2);
            case 25:
                return new zf((pho) xvf0Var.get());
            case 26:
                return new t61((pho) xvf0Var.get());
            case 27:
                return new cug((pho) xvf0Var.get());
            case 28:
                return new s770((pho) xvf0Var.get());
            default:
                return new y770((AppAnalyticsReporter) xvf0Var.get());
        }
    }

    public /* synthetic */ c660(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
