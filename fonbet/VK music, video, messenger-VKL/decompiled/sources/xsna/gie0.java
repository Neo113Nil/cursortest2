package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.push.PushClient;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class gie0 extends Lambda implements wzs<PushClient, AsyncCallback, s3q0> {
    public static final gie0 i = new gie0(2);

    @Override // xsna.wzs
    public final s3q0 invoke(PushClient pushClient, AsyncCallback asyncCallback) {
        pushClient.onDeletedMessages(asyncCallback);
        return s3q0.a;
    }
}
