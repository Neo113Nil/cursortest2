package xsna;

import com.vk.push.core.work.WorkResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkRegistratorIPCClient.kt */
/* loaded from: classes5.dex */
public final class ywx0 extends Lambda implements izs<Exception, Result<? extends WorkResult>> {
    public static final ywx0 i = new ywx0(1);

    @Override // xsna.izs
    public final Result<? extends WorkResult> invoke(Exception exc) {
        return new Result<>(new Result.Failure(exc));
    }
}
