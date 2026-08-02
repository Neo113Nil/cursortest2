package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.OnDeleteMessagesResult;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class hie0 extends Lambda implements wzs<AidlResult<?>, AppInfo, Result<? extends OnDeleteMessagesResult>> {
    public static final hie0 i = new hie0(2);

    @Override // xsna.wzs
    public final Result<? extends OnDeleteMessagesResult> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
        return new Result<>((OnDeleteMessagesResult) aidlResult.getData());
    }
}
