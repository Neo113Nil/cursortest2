package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.ipc.NoHostsToBindException;
import com.vk.push.core.retry.RequestRetryComponent;

/* loaded from: classes9.dex */
public final class miy0 extends RequestRetryComponent {
    public final Logger d;

    public miy0(Logger logger, BackOff backOff) {
        super(backOff);
        this.d = logger.createLogger("IPCClientRetryComponent");
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public final Logger getLogger() {
        return this.d;
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public final boolean isRetryableError(Throwable th) {
        if (th instanceof HostIsNotMasterException) {
            return true;
        }
        return th instanceof NoHostsToBindException;
    }
}
