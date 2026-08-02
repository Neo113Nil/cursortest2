package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.base.AidlResult;
import com.vk.push.pushsdk.masterhost.ipc.MasterHostIPCResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class uj10 extends Lambda implements wzs<AidlResult<?>, AppInfo, Result<? extends MasterHostIPCResult>> {
    public static final uj10 i = new uj10(2);

    @Override // xsna.wzs
    public final Result<? extends MasterHostIPCResult> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
        return new Result<>((MasterHostIPCResult) aidlResult.getData());
    }
}
