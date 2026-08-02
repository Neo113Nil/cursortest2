package xsna;

import android.os.IInterface;
import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.IpcRequest;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseIPCClient.kt */
/* loaded from: classes5.dex */
public final class je6 extends Lambda implements izs<IpcRequest<IInterface, ?>, s3q0> {
    final /* synthetic */ AppInfo $host;
    final /* synthetic */ IInterface $remoteService;
    final /* synthetic */ BaseIPCClient<IInterface> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je6(BaseIPCClient<IInterface> baseIPCClient, IInterface iInterface, AppInfo appInfo) {
        super(1);
        this.this$0 = baseIPCClient;
        this.$remoteService = iInterface;
        this.$host = appInfo;
    }

    @Override // xsna.izs
    public final s3q0 invoke(IpcRequest<IInterface, ?> ipcRequest) {
        IpcRequest<IInterface, ?> ipcRequest2 = ipcRequest;
        Logger.DefaultImpls.info$default(this.this$0.getLogger(), "Executing pending request as connection is alive now", null, 2, null);
        try {
            IpcRequest.execute$default(ipcRequest2, this.$remoteService, this.$host, null, 4, null);
        } catch (RemoteException e) {
            this.this$0.getLogger().error("Could not execute request", e);
            ipcRequest2.onError(e);
        }
        return s3q0.a;
    }
}
