package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.renderscript.RenderScript;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.feed_video.domain.manager.a;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.taxi.client.api.LaunchApi;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.layers.api.LayersApi;
import ru.yandex.taxi.layers.api.TrackerApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class oux implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ oux(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new nux((l0i) xvf0Var.get());
            case 1:
                return new oxn((Context) xvf0Var.get());
            case 2:
                return new au50(17, (i5g0) xvf0Var.get());
            case 3:
                return new cvx((p) xvf0Var.get());
            case 4:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                LaunchApi launchApi = (LaunchApi) on2Var.a(GoApiName.TaxiV3, LaunchApi.class);
                q5z.i(launchApi);
                return launchApi;
            case 5:
                return new gwx((h) xvf0Var.get());
            case 6:
                return new t61((pho) xvf0Var.get());
            case 7:
                return new zjs(i5m.a(xvf0Var), i2);
            case 8:
                on2 on2Var2 = (on2) xvf0Var.get();
                on2Var2.getClass();
                LayersApi layersApi = (LayersApi) on2Var2.a(GoApiName.TaxiV4, LayersApi.class);
                q5z.i(layersApi);
                return layersApi;
            case 9:
                on2 on2Var3 = (on2) xvf0Var.get();
                on2Var3.getClass();
                TrackerApi trackerApi = (TrackerApi) on2Var3.a(GoApiName.TaxiV4, TrackerApi.class);
                q5z.i(trackerApi);
                return trackerApi;
            case 10:
                return new ml00((wnt) xvf0Var.get());
            case 11:
                return new tyx((tt2) xvf0Var.get());
            case 12:
                return new s66((rqo) xvf0Var.get(), 6);
            case 13:
                FragmentManager supportFragmentManager = ((FragmentActivity) xvf0Var.get()).getSupportFragmentManager();
                q5z.i(supportFragmentManager);
                return supportFragmentManager;
            case 14:
                Lifecycle lifecycle = ((ComponentActivity) xvf0Var.get()).getLifecycle();
                q5z.i(lifecycle);
                return lifecycle;
            case 15:
                return new ney(((ComponentActivity) xvf0Var.get()).getLifecycle());
            case 16:
                qx60 onBackPressedDispatcher = ((ComponentActivity) xvf0Var.get()).getOnBackPressedDispatcher();
                q5z.i(onBackPressedDispatcher);
                return onBackPressedDispatcher;
            case 17:
                return (AlarmManager) ((Application) xvf0Var.get()).getSystemService("alarm");
            case 18:
                return (LocationManager) ((Application) xvf0Var.get()).getSystemService("location");
            case 19:
                return (PowerManager) ((Application) xvf0Var.get()).getSystemService("power");
            case 20:
                RenderScript create = RenderScript.create((Context) xvf0Var.get());
                q5z.i(create);
                return create;
            case 21:
                return (SensorManager) ((Application) xvf0Var.get()).getSystemService("sensor");
            case 22:
                return (WifiManager) ((Application) xvf0Var.get()).getSystemService(StartupRequest.PARAM_WIFI);
            case 23:
                return m5h.a;
            case 24:
                return new ua90(new nl40(new kqo((wvy0) xvf0Var.get(), new tfu(0))));
            case 25:
                return new xdf((zby) xvf0Var.get());
            case 26:
                return new wa90((za90) xvf0Var.get());
            case 27:
                return new vly((c) xvf0Var.get());
            case 28:
                return new tty((a) xvf0Var.get(), 0);
            default:
                return new tty((a) xvf0Var.get(), 1);
        }
    }
}
