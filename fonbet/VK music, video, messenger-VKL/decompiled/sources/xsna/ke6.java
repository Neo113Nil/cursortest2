package xsna;

import android.os.IInterface;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.BindingDiedException;
import com.vk.push.core.ipc.IpcRequest;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseIPCClient.kt */
/* loaded from: classes5.dex */
public final class ke6 extends Lambda implements izs<IpcRequest<IInterface, ?>, s3q0> {
    final /* synthetic */ BaseIPCClient<IInterface> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke6(BaseIPCClient<IInterface> baseIPCClient) {
        super(1);
        this.this$0 = baseIPCClient;
    }

    @Override // xsna.izs
    public final s3q0 invoke(IpcRequest<IInterface, ?> ipcRequest) {
        Logger.DefaultImpls.info$default(this.this$0.getLogger(), "Notify caller about failed request due to binding death", null, 2, null);
        ipcRequest.onError(new BindingDiedException());
        return s3q0.a;
    }
}
