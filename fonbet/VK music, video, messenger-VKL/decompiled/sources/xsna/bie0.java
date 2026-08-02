package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.push.PushClient;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class bie0 extends Lambda implements wzs<PushClient, AsyncCallback, s3q0> {
    final /* synthetic */ String $token;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bie0(String str) {
        super(2);
        this.$token = str;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(PushClient pushClient, AsyncCallback asyncCallback) {
        pushClient.isPushTokenExist(this.$token, asyncCallback);
        return s3q0.a;
    }
}
