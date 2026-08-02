package xsna;

import com.vk.push.core.push.SendPushesResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class sie0 extends Lambda implements izs<Exception, Result<? extends SendPushesResult>> {
    public static final sie0 i = new sie0(1);

    @Override // xsna.izs
    public final Result<? extends SendPushesResult> invoke(Exception exc) {
        return new Result<>(new Result.Failure(exc));
    }
}
