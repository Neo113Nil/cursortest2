package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.push.PushClient;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class lie0 extends Lambda implements wzs<PushClient, AsyncCallback, s3q0> {
    public static final lie0 i = new lie0(2);

    @Override // xsna.wzs
    public final s3q0 invoke(PushClient pushClient, AsyncCallback asyncCallback) {
        pushClient.onTokenInvalidated(asyncCallback);
        return s3q0.a;
    }
}
