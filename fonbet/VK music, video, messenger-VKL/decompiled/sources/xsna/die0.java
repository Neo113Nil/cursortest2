package xsna;

import com.vk.push.core.push.IsPushTokenExistResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class die0 extends Lambda implements izs<Exception, Result<? extends IsPushTokenExistResult>> {
    public static final die0 i = new die0(1);

    @Override // xsna.izs
    public final Result<? extends IsPushTokenExistResult> invoke(Exception exc) {
        return new Result<>(new Result.Failure(exc));
    }
}
