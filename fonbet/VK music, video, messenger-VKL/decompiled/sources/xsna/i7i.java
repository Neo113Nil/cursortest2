package xsna;

import android.app.Application;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.ipc.BasePushService;

/* compiled from: CompatNetworkStateManager.kt */
/* loaded from: classes5.dex */
public final class i7i implements p560 {
    public final s4j a;

    public i7i(Application application, Logger logger) {
        this.a = new s4j(application, logger);
    }

    @Override // xsna.p560
    public final void a(BasePushService.g.b bVar) {
        this.a.a(bVar);
    }

    @Override // xsna.p560
    public final void b() {
        this.a.b();
    }
}
