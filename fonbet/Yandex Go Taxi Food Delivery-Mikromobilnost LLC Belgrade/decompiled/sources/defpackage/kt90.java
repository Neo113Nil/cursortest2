package defpackage;

import android.os.Build;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.core.network.impl.internal.network.a;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class kt90 extends a {
    @Override // com.yandex.fintechsdk.core.network.impl.internal.network.a
    public final Map a() {
        return b.i(new Pair(Header.PlatformVersion.getKey(), String.valueOf(Build.VERSION.SDK_INT)), new Pair(Header.SdkPlatform.getKey(), ConstantDeviceInfo.APP_PLATFORM), new Pair(Header.SdkVersion.getKey(), "1.16.9"));
    }

    @Override // com.yandex.fintechsdk.core.network.impl.internal.network.a
    public final Object b(rvj0 rvj0Var, mgx mgxVar) {
        KSerializer serializer = c.Companion.serializer();
        String string = rvj0Var.string();
        zcx zcxVar = this.d;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) ((c) zcxVar.b(serializer, string)).get(Constants.KEY_DATA);
        if (bVar != null) {
            return zcxVar.a(gtq0.H(itq0.a, mgxVar), bVar);
        }
        ny61.r("Null data field in pay network api response");
        return null;
    }
}
