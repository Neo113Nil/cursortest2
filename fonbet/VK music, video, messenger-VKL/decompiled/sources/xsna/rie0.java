package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.SendPushesResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class rie0 extends Lambda implements wzs<AidlResult<?>, AppInfo, Result<? extends SendPushesResult>> {
    public static final rie0 i = new rie0(2);

    @Override // xsna.wzs
    public final Result<? extends SendPushesResult> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
        return new Result<>((SendPushesResult) aidlResult.getData());
    }
}
