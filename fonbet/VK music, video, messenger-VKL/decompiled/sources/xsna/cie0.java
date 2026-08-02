package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.IsPushTokenExistResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class cie0 extends Lambda implements wzs<AidlResult<?>, AppInfo, Result<? extends IsPushTokenExistResult>> {
    public static final cie0 i = new cie0(2);

    @Override // xsna.wzs
    public final Result<? extends IsPushTokenExistResult> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
        return new Result<>((IsPushTokenExistResult) aidlResult.getData());
    }
}
