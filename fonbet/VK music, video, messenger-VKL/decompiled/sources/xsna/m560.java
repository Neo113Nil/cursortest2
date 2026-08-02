package xsna;

import android.net.ConnectivityManager;
import android.net.Network;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.ipc.BasePushService;

/* compiled from: NetworkStateCallback.kt */
/* loaded from: classes5.dex */
public final class m560 extends ConnectivityManager.NetworkCallback {
    public final BasePushService.g.b a;
    public final Logger b;

    public m560(BasePushService.g.b bVar, Logger logger) {
        this.a = bVar;
        this.b = logger.createLogger("NetworkStateCallback");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Logger.DefaultImpls.info$default(this.b, "On connection " + network + " available", null, 2, null);
        this.a.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Logger.DefaultImpls.info$default(this.b, "On connection " + network + " lost", null, 2, null);
        this.a.a();
    }
}
