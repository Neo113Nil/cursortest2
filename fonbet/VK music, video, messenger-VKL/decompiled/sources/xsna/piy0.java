package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.feature.FeatureManager;

/* loaded from: classes9.dex */
public final class piy0 {
    public final ru.rustore.sdk.pushclient.s.c a;
    public final jay0 b;
    public final FeatureManager c;
    public final hpj d;
    public final Logger e;

    public piy0(ru.rustore.sdk.pushclient.s.c cVar, jay0 jay0Var, FeatureManager featureManager, Logger logger) {
        hpj a = zvj.a(bdn.b);
        this.a = cVar;
        this.b = jay0Var;
        this.c = featureManager;
        this.d = a;
        this.e = logger.createLogger("DeleteExpiredPushTokenUseCase");
    }
}
