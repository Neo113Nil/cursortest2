package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.work.WorkResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkRegistratorIPCClient.kt */
/* loaded from: classes5.dex */
public final class axx0 extends Lambda implements wzs<AidlResult<?>, AppInfo, Result<? extends WorkResult>> {
    public static final axx0 i = new axx0(2);

    @Override // xsna.wzs
    public final Result<? extends WorkResult> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
        return new Result<>((WorkResult) aidlResult.getData());
    }
}
