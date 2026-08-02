package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class ch5 implements ah5 {
    public final hk3 a;
    public final PayEnvironment b;
    public final Set c;
    public final s4s d;
    public final ngs e;
    public final ko10 f;
    public final ar10 g;
    public final PayboxScenario h;
    public final Region i;
    public final rzq0 j;
    public final abe k;
    public final String l;
    public final String m;

    public ch5(Context context, hk3 hk3Var, PayEnvironment payEnvironment, Set set, s4s s4sVar, ngs ngsVar, ko10 ko10Var, ar10 ar10Var, PayboxScenario payboxScenario, Region region, rzq0 rzq0Var, abe abeVar) {
        String str;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        this.a = hk3Var;
        this.b = payEnvironment;
        this.c = set;
        this.d = s4sVar;
        this.e = ngsVar;
        this.f = ko10Var;
        this.g = ar10Var;
        this.h = payboxScenario;
        this.i = region;
        this.j = rzq0Var;
        this.k = abeVar;
        String packageName = context.getPackageName();
        this.l = packageName;
        PackageManager packageManager = context.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = packageManager.getPackageInfo(packageName, 0);
            }
            str = packageInfo.versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.m = str == null ? "" : str;
    }

    @Override // defpackage.ah5
    public final MapBuilder getHeaders() {
        ek ekVar;
        ek ekVar2;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String language = Locale.getDefault().getLanguage();
        String a = this.e.a(this.b);
        String str = (String) this.g.a.a.getValue();
        Object value = this.a.c.a.getValue();
        Long l = null;
        qk3 qk3Var = value instanceof qk3 ? (qk3) value : null;
        String str2 = (qk3Var == null || (ekVar2 = qk3Var.a) == null) ? null : ekVar2.a;
        Object value2 = this.a.c.a.getValue();
        qk3 qk3Var2 = value2 instanceof qk3 ? (qk3) value2 : null;
        if (qk3Var2 != null && (ekVar = qk3Var2.a) != null) {
            l = Long.valueOf(ekVar.b);
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(Header.Accept.getKey(), "application/json");
        mapBuilder.put(Header.AcceptLanguage.getKey(), language);
        mapBuilder.put(Header.ClientApp.getKey(), this.l);
        mapBuilder.put(Header.ClientVersion.getKey(), this.m);
        mapBuilder.put(Header.ContentType.getKey(), "application/json");
        mapBuilder.put(Header.PayboxScenario.getKey(), this.h.name());
        String key = Header.PayFormId.getKey();
        String str3 = this.d.b;
        if (str3 == null) {
            str3 = "";
        }
        mapBuilder.put(key, str3);
        mapBuilder.put(Header.PlatformVersion.getKey(), valueOf);
        mapBuilder.put(Header.SdkPlatform.getKey(), ConstantDeviceInfo.APP_PLATFORM);
        mapBuilder.put(Header.SdkRegion.getKey(), this.i.getKey());
        mapBuilder.put(Header.SdkType.getKey(), "internal");
        mapBuilder.put(Header.SdkVersion.getKey(), "1.16.9");
        mapBuilder.put(Header.ServiceToken.getKey(), a);
        mapBuilder.put(Header.SessionId.getKey(), this.j.a);
        mapBuilder.put(Header.UserAgent.getKey(), this.k.d());
        if (str2 != null) {
        }
        ko10 ko10Var = this.f;
        if (ko10Var != null) {
        }
        if (str != null) {
        }
        if (l != null) {
        }
        if (!this.c.isEmpty()) {
            mapBuilder.put(Header.MerchantFeatures.getKey(), a.X(this.c, ",", null, null, new l75(13), 30));
        }
        return mapBuilder.j();
    }
}
