package xsna;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.ipc.BasePushService;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ConnectivityNetworkStateManager.kt */
/* loaded from: classes5.dex */
public final class s4j implements p560 {
    public final Context a;
    public final Logger b;
    public final LinkedHashSet c = new LinkedHashSet();
    public mh8 d;

    public s4j(Application application, Logger logger) {
        this.a = application;
        this.b = logger;
    }

    @Override // xsna.p560
    public final void a(BasePushService.g.b bVar) {
        Context context = this.a;
        Logger logger = this.b;
        m560 m560Var = new m560(bVar, logger);
        try {
            if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                Logger.DefaultImpls.warn$default(logger, "Failed to registerDefaultNetworkCallback, require ACCESS_NETWORK_STATE permission", null, 2, null);
            } else {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(m560Var);
                this.c.add(m560Var);
            }
        } catch (RuntimeException e) {
            logger.warn("Failed to registerDefaultNetworkCallback", e);
            if (this.d == null) {
                this.d = new mh8(context, logger);
            }
            mh8 mh8Var = this.d;
            if (mh8Var != null) {
                mh8Var.a(bVar);
            }
        }
    }

    @Override // xsna.p560
    public final void b() {
        LinkedHashSet linkedHashSet = this.c;
        try {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager) this.a.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) it.next());
            }
            mh8 mh8Var = this.d;
            if (mh8Var != null) {
                mh8Var.b();
            }
            linkedHashSet.clear();
        } catch (RuntimeException unused) {
            Logger.DefaultImpls.warn$default(this.b, "Failed to unregister network listeners", null, 2, null);
        }
    }
}
