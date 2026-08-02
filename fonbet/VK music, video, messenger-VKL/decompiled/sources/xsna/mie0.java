package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.InvalidateTokenResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class mie0 extends Lambda implements wzs<AidlResult<?>, AppInfo, Result<? extends InvalidateTokenResult>> {
    public static final mie0 i = new mie0(2);

    @Override // xsna.wzs
    public final Result<? extends InvalidateTokenResult> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
        return new Result<>((InvalidateTokenResult) aidlResult.getData());
    }
}
