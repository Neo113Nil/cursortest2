package xsna;

import com.vk.push.core.push.InvalidateTokenResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class nie0 extends Lambda implements izs<Exception, Result<? extends InvalidateTokenResult>> {
    public static final nie0 i = new nie0(1);

    @Override // xsna.izs
    public final Result<? extends InvalidateTokenResult> invoke(Exception exc) {
        return new Result<>(new Result.Failure(exc));
    }
}
