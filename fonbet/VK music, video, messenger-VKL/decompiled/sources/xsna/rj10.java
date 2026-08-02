package xsna;

import com.vk.push.pushsdk.masterhost.ipc.HostAppInfo;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class rj10 extends Lambda implements izs<Exception, Result<? extends HostAppInfo>> {
    public static final rj10 i = new rj10(1);

    @Override // xsna.izs
    public final Result<? extends HostAppInfo> invoke(Exception exc) {
        return new Result<>(new Result.Failure(exc));
    }
}
