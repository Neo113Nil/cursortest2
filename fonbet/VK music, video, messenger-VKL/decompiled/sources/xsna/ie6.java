package xsna;

import android.os.IInterface;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.IpcRequest;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: BaseIPCClient.kt */
/* loaded from: classes5.dex */
public final class ie6 extends Lambda implements izs<IpcRequest<IInterface, ? extends Object>, s3q0> {
    final /* synthetic */ BaseIPCClient<IInterface> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie6(BaseIPCClient<IInterface> baseIPCClient) {
        super(1);
        this.this$0 = baseIPCClient;
    }

    @Override // xsna.izs
    public final s3q0 invoke(IpcRequest<IInterface, ? extends Object> ipcRequest) {
        Set set;
        set = this.this$0.k;
        set.remove(ipcRequest);
        return s3q0.a;
    }
}
