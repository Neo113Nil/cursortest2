package defpackage;

import android.os.Build;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.core.network.impl.internal.network.a;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class jgs extends a {
    public final PayEnvironment e;
    public final kgs f;
    public final vif g;

    public jgs(rgs rgsVar, h6j0 h6j0Var, z22 z22Var, PayEnvironment payEnvironment, kgs kgsVar, vif vifVar) {
        super(rgsVar, z22Var, h6j0Var);
        this.e = payEnvironment;
        this.f = kgsVar;
        this.g = vifVar;
    }

    @Override // com.yandex.fintechsdk.core.network.impl.internal.network.a
    public final Map a() {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(Header.ServiceToken.getKey(), this.f.a(this.e));
        mapBuilder.put(Header.Connection.getKey(), "keep-alive");
        mapBuilder.put(Header.PlatformVersion.getKey(), String.valueOf(Build.VERSION.SDK_INT));
        mapBuilder.put(Header.SdkPlatform.getKey(), ConstantDeviceInfo.APP_PLATFORM);
        mapBuilder.put(Header.SdkVersion.getKey(), "1.16.9");
        this.g.getClass();
        return mapBuilder.j();
    }
}
