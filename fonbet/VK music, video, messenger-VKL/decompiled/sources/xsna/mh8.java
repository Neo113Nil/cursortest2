package xsna;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.broadcast.NetworkChangeReceiver;
import com.vk.push.pushsdk.ipc.BasePushService;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BroadcastNetworkStateManager.kt */
/* loaded from: classes5.dex */
public final class mh8 implements p560 {
    public final Context a;
    public final NetworkChangeReceiver b;
    public final Logger c;

    public mh8(Context context, Logger logger) {
        this.a = context;
        this.b = new NetworkChangeReceiver(logger);
        this.c = logger.createLogger(this);
    }

    @Override // xsna.p560
    public final void a(BasePushService.g.b bVar) {
        q83 q83Var = new q83(0, this, mh8.class, "registerReceiver", "registerReceiver()V", 0, 1);
        CopyOnWriteArraySet<o560> copyOnWriteArraySet = this.b.b;
        if (copyOnWriteArraySet.isEmpty()) {
            q83Var.invoke();
        }
        copyOnWriteArraySet.add(bVar);
    }

    @Override // xsna.p560
    public final void b() {
        NetworkChangeReceiver networkChangeReceiver = this.b;
        networkChangeReceiver.b.clear();
        this.a.unregisterReceiver(networkChangeReceiver);
    }
}
