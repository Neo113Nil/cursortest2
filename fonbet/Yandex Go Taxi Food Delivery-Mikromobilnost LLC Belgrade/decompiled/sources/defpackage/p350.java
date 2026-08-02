package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import com.yandex.go.flex.common.data.bdui.FlexApi;
import com.yandex.go.navigator.order.c;
import com.yandex.go.network.connectivity.a;
import com.ybsdk.core.utils.network.retryPolicy.b;
import com.ybsdk.feature.banners.api.MarkEventsApi;
import com.ybsdk.feature.qr.api.data.QrApi;
import com.ybsdk.feature.qr.api.data.QrResolvingRulesApi;
import com.ybsdk.network.PciDssApi;
import java.io.File;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.net.taxi.NearestDriversApi;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes10.dex */
public final class p350 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ p350(fx50 fx50Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        int i3 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new o350((Activity) xvf0Var.get());
            case 1:
                return new co40((pho) xvf0Var.get());
            case 2:
                return new t350((rqo) xvf0Var.get());
            case 3:
                t50 activityResultRegistry = ((ComponentActivity) xvf0Var.get()).getActivityResultRegistry();
                q5z.i(activityResultRegistry);
                return activityResultRegistry;
            case 4:
                return new zis((Activity) xvf0Var.get());
            case 5:
                return new b850((i130) xvf0Var.get());
            case 6:
                return ((y030) xvf0Var.get()).a(ContentContainer$ZOrder.MAIN_ACTIVITY_MODAL_VIEW);
            case 7:
                return new cb50(i5m.a(xvf0Var));
            case 8:
                return new oc50((mf50) xvf0Var.get());
            case 9:
                return new sul((dne0) xvf0Var.get());
            case 10:
                return new ug50((c) xvf0Var.get());
            case 11:
                NearestDriversApi a = ck50.a((on2) xvf0Var.get());
                q5z.i(a);
                return a;
            case 12:
                return new dk50((crg) xvf0Var.get());
            case 13:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                lb7 lb7Var = new lb7(on2Var);
                return new hhr((FlexApi) ((apt) on2Var.e.get()).a(GoApiName.TaxiV4, FlexApi.class, new mn2((OkHttpClient) on2Var.n.getValue(), i2), new kn2(i3, on2Var, lb7Var)), lb7Var);
            case 14:
                OkHttpClient okHttpClient = (OkHttpClient) ((on2) xvf0Var.get()).n.getValue();
                q5z.i(okHttpClient);
                return okHttpClient;
            case 15:
                return new sa7(new File(((Context) xvf0Var.get()).getCacheDir(), "shared-network-cache"), 10485760L);
            case 16:
                OkHttpClient okHttpClient2 = (OkHttpClient) ((on2) xvf0Var.get()).l.getValue();
                q5z.i(okHttpClient2);
                return okHttpClient2;
            case 17:
                return new sa7(new File(((Context) xvf0Var.get()).getCacheDir(), "network-protocol-cache-v2"), 262144000L);
            case 18:
                on2 on2Var2 = (on2) xvf0Var.get();
                apt aptVar = (apt) on2Var2.e.get();
                zn1 zn1Var = new zn1(on2Var2, 1);
                aptVar.getClass();
                i5m.a(cma1.i(new yot(0, zn1Var)));
                return new aq20();
            case 19:
                return new a((Context) xvf0Var.get());
            case 20:
                return new hs50((dne0) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.failure_notificator.c((tt2) xvf0Var.get());
            case 22:
                return (MarkEventsApi) ((t0k0) xvf0Var.get()).b(MarkEventsApi.class);
            case 23:
                return (QrApi) ((t0k0) xvf0Var.get()).b(QrApi.class);
            case 24:
                return (QrResolvingRulesApi) ((t0k0) xvf0Var.get()).b(QrResolvingRulesApi.class);
            case 25:
                return new b(new bx50((com.ybsdk.rconfig.b) xvf0Var.get(), 0));
            case 26:
                return hx50.a((Context) xvf0Var.get());
            case 27:
                return (PciDssApi) ((t0k0) xvf0Var.get()).b(PciDssApi.class);
            case 28:
                return new c7j0(kotlin.a.a(new mj(i5m.a(xvf0Var), 7)));
            default:
                return new uc(13, (com.yandex.go.network_metrics.a) xvf0Var.get());
        }
    }

    public /* synthetic */ p350(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
