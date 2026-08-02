package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.pay.payment.PaymentData;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes12.dex */
public final class a15 implements x05 {
    public final hk3 a;
    public final ar10 b;
    public final d180 c;
    public final PayboxScenario d;
    public final PaymentData e;
    public final Region f;
    public final rzq0 g;
    public final String h;
    public final String i;

    public a15(Context context, hk3 hk3Var, ar10 ar10Var, d180 d180Var, PayboxScenario payboxScenario, PaymentData paymentData, Region region, rzq0 rzq0Var) {
        String str;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        this.a = hk3Var;
        this.b = ar10Var;
        this.c = d180Var;
        this.d = payboxScenario;
        this.e = paymentData;
        this.f = region;
        this.g = rzq0Var;
        String str2 = context.getApplicationInfo().packageName;
        this.h = str2;
        PackageManager packageManager = context.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(str2, of);
            } else {
                packageInfo = packageManager.getPackageInfo(str2, 0);
            }
            str = packageInfo.versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.i = str;
    }

    @Override // defpackage.x05
    public final MapBuilder getParams() {
        g180 g180Var;
        String str;
        Long l;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("session_id", this.g.a);
        mapBuilder.put("paybox_scenario", this.d.name());
        mapBuilder.put("host_app", this.h);
        mapBuilder.put("is_internal", "true");
        mapBuilder.put("region", this.f.getKey());
        mapBuilder.put("source_sdk", "fintech-sdk");
        mapBuilder.put("version", "1.16.9");
        mapBuilder.put(RemoteBioParameters.TIME, String.valueOf(System.currentTimeMillis()));
        String str2 = this.i;
        if (str2 != null) {
        }
        String str3 = (String) this.b.a.a.getValue();
        if (str3 != null) {
        }
        d180 d180Var = this.c;
        String paymentUrl = this.e.getPaymentUrl();
        synchronized (d180Var) {
            g180Var = (g180) d180Var.a.get(paymentUrl);
        }
        if (g180Var != null) {
        }
        d180 d180Var2 = this.c;
        synchronized (d180Var2) {
            str = d180Var2.b;
        }
        if (str != null) {
        }
        xk3 xk3Var = (xk3) this.a.c.a.getValue();
        if (xk3Var instanceof qk3) {
            l = Long.valueOf(((qk3) xk3Var).a.b);
        } else if (xk3Var instanceof sk3) {
            l = Long.valueOf(((sk3) xk3Var).a);
        } else {
            if (!jl40.l(xk3Var, tk3.a) && !(xk3Var instanceof vk3)) {
                w511.b();
                return null;
            }
            l = null;
        }
        if (l != null) {
            mapBuilder.put("puid", String.valueOf(l.longValue()));
        }
        return mapBuilder.j();
    }
}
