package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import java.util.Set;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class h25 implements f25 {
    public final Set a;
    public final ko10 b;
    public final ar10 c;
    public final PayboxScenario d;
    public final Region e;
    public final rzq0 f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public h25(Context context, Set set, ko10 ko10Var, ar10 ar10Var, PayboxScenario payboxScenario, Region region, rzq0 rzq0Var) {
        String str;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        this.a = set;
        this.b = ko10Var;
        this.c = ar10Var;
        this.d = payboxScenario;
        this.e = region;
        this.f = rzq0Var;
        this.g = context.getString(vxh0.finsdk_host_divkit_version);
        this.h = context.getString(vxh0.finsdk_host_flex_version);
        String packageName = context.getPackageName();
        this.i = packageName;
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
        this.j = str;
    }

    @Override // defpackage.f25
    public final MapBuilder getHeaders() {
        String str = (String) this.c.a.a.getValue();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(Header.ClientApp.getKey(), this.i);
        mapBuilder.put(Header.DivkitVersion.getKey(), this.g);
        mapBuilder.put(Header.FlexVersion.getKey(), this.h);
        mapBuilder.put(Header.SdkRegion.getKey(), this.e.getKey());
        mapBuilder.put(Header.SessionId.getKey(), this.f.a);
        mapBuilder.put(Header.PayboxScenario.getKey(), this.d.name());
        String str2 = this.j;
        if (str2 != null) {
        }
        ko10 ko10Var = this.b;
        if (ko10Var != null) {
        }
        if (str != null) {
        }
        Set set = this.a;
        if (!set.isEmpty()) {
            mapBuilder.put(Header.MerchantFeatures.getKey(), a.X(set, ",", null, null, new at3(23), 30));
        }
        return mapBuilder.j();
    }
}
