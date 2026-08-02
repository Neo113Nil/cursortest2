package xsna;

import com.vk.push.pushsdk.masterhost.ipc.MasterHostIPCResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class zj10 extends Lambda implements izs<Exception, Result<? extends MasterHostIPCResult>> {
    public static final zj10 i = new zj10(1);

    @Override // xsna.izs
    public final Result<? extends MasterHostIPCResult> invoke(Exception exc) {
        return new Result<>(new Result.Failure(exc));
    }
}
