package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;
import xsna.d5o0;

/* loaded from: classes9.dex */
public final class ify0 implements cay0 {
    public final CheckHostsAvailabilityUseCase b;
    public final Logger c;

    public ify0(CheckHostsAvailabilityUseCase checkHostsAvailabilityUseCase, Logger logger) {
        this.b = checkHostsAvailabilityUseCase;
        this.c = logger.createLogger(this);
    }

    @Override // xsna.cay0
    public final Object a(d5o0.a aVar, ru.rustore.sdk.pushclient.a.e eVar) {
        Logger logger = this.c;
        Logger.DefaultImpls.info$default(logger, "Check push availability", null, 2, null);
        if (this.b.invoke()) {
            Logger.DefaultImpls.info$default(logger, "Push is available", null, 2, null);
            aVar.b(s3q0.a);
        } else {
            Logger.DefaultImpls.info$default(logger, "Push is unavailable", null, 2, null);
            aVar.a(new RuStorePushClientException.HostAppNotInstalledException("Push is unavailable, need to install host app"));
        }
        return s3q0.a;
    }
}
