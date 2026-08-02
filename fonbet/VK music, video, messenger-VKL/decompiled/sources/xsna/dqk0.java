package xsna;

import android.os.Bundle;
import com.vk.push.core.work.WorkModel;
import com.vk.push.pushsdk.VkpnsPushConfig;

/* compiled from: StartInitiateMasterElectionsWorkerUseCase.kt */
/* loaded from: classes5.dex */
public final class dqk0 {
    public final ezx0 a;

    public dqk0(ezx0 ezx0Var) {
        this.a = ezx0Var;
    }

    public final void a(boolean z) {
        long j = z ? 600000L : 0L;
        VkpnsPushConfig vkpnsPushConfig = qxi.b;
        if (vkpnsPushConfig == null) {
            throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
        }
        boolean z2 = vkpnsPushConfig.g;
        WorkModel.KeepExistingWork keepExistingWork = WorkModel.KeepExistingWork.YES;
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("use_google_connection_check", z2);
        bundle.putLong("initial_delay_millis", j);
        s3q0 s3q0Var = s3q0.a;
        this.a.b(new WorkModel("VKPNS_InitiateMasterElectionsWorker", keepExistingWork, bundle));
    }
}
