package xsna;

import android.content.Context;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.pushsdk.VkpnsPushConfig;

/* compiled from: UseCaseModule.kt */
/* loaded from: classes.dex */
public final class yfq0 {
    public static final Logger a;

    static {
        Logger defaultLogger;
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
        }
        a = defaultLogger;
    }

    public static sul a() {
        return new sul((jlc) v6g0.G.getValue());
    }

    public static GetCallingAppInfoUseCase b() {
        return new GetCallingAppInfoUseCase((CallingAppRepository) v6g0.C.getValue());
    }

    public static e060 c(Logger logger) {
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        Context applicationContext = vkpnsPushConfig.a.getApplicationContext();
        Logger logger2 = v6g0.a;
        PackagesRepository e = v6g0.e();
        bpn0 bpn0Var = o460.a;
        return new e060(applicationContext, o460.a(), e, logger);
    }
}
