package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.hostinfo.MasterElections;
import com.vk.push.core.ipc.BaseIPCClient;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterHostElectionsInteractor.kt */
/* loaded from: classes5.dex */
public final class jj10 extends Lambda implements izs<BaseIPCClient<MasterElections>, s3q0> {
    final /* synthetic */ AppInfo $app;
    final /* synthetic */ nj10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj10(nj10 nj10Var, AppInfo appInfo) {
        super(1);
        this.this$0 = nj10Var;
        this.$app = appInfo;
    }

    @Override // xsna.izs
    public final s3q0 invoke(BaseIPCClient<MasterElections> baseIPCClient) {
        nj10 nj10Var = this.this$0;
        AppInfo appInfo = this.$app;
        nj10Var.f.remove(appInfo);
        Logger.DefaultImpls.info$default(nj10Var.o, "IPC client " + appInfo.getPackageName() + " was removed", null, 2, null);
        return s3q0.a;
    }
}
