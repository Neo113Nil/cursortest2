package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import defpackage.hgz;
import defpackage.q8e;
import defpackage.r8e;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006*\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR0\u0010\u001e\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/work/impl/constraints/SharedNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "Lzy11;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Ls8e;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "addCallback", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Ltls;)Lsls;", "getCurrentNetworkCapabilities", "(Landroid/net/ConnectivityManager;)Landroid/net/NetworkCapabilities;", "", "requestsLock", "Ljava/lang/Object;", "", "requests", "Ljava/util/Map;", "cachedCapabilities", "Landroid/net/NetworkCapabilities;", "getCachedCapabilities", "()Landroid/net/NetworkCapabilities;", "setCachedCapabilities", "(Landroid/net/NetworkCapabilities;)V", "", "capabilitiesInitialized", "Z", "getCapabilitiesInitialized", "()Z", "setCapabilitiesInitialized", "(Z)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    private static NetworkCapabilities cachedCapabilities;
    private static boolean capabilitiesInitialized;
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    private static final Object requestsLock = new Object();
    private static final Map<tls, NetworkRequest> requests = new LinkedHashMap();

    private SharedNetworkCallback() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addCallback$lambda$6(tls tlsVar, ConnectivityManager connectivityManager) {
        synchronized (requestsLock) {
            Map<tls, NetworkRequest> map = requests;
            map.remove(tlsVar);
            if (map.isEmpty()) {
                hgz g = hgz.g();
                int i = d.a;
                g.getClass();
                connectivityManager.unregisterNetworkCallback(INSTANCE);
                cachedCapabilities = null;
                capabilitiesInitialized = false;
            }
        }
        return zy11.a;
    }

    public final sls addCallback(final ConnectivityManager connManager, NetworkRequest networkRequest, final tls onConstraintState) {
        boolean canBeSatisfiedBy;
        synchronized (requestsLock) {
            try {
                Map<tls, NetworkRequest> map = requests;
                boolean isEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (isEmpty) {
                    hgz g = hgz.g();
                    int i = d.a;
                    g.getClass();
                    connManager.registerDefaultNetworkCallback(INSTANCE);
                }
                hgz g2 = hgz.g();
                int i2 = d.a;
                g2.getClass();
                canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(INSTANCE.getCurrentNetworkCapabilities(connManager));
                onConstraintState.invoke(canBeSatisfiedBy ? q8e.a : new r8e(7));
            } catch (Throwable th) {
                throw th;
            }
        }
        return new sls() { // from class: androidx.work.impl.constraints.c
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 addCallback$lambda$6;
                addCallback$lambda$6 = SharedNetworkCallback.addCallback$lambda$6(tls.this, connManager);
                return addCallback$lambda$6;
            }
        };
    }

    public final NetworkCapabilities getCachedCapabilities() {
        return cachedCapabilities;
    }

    public final boolean getCapabilitiesInitialized() {
        return capabilitiesInitialized;
    }

    public final NetworkCapabilities getCurrentNetworkCapabilities(ConnectivityManager connectivityManager) {
        if (capabilitiesInitialized) {
            return cachedCapabilities;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        cachedCapabilities = networkCapabilities;
        capabilitiesInitialized = true;
        return networkCapabilities;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean canBeSatisfiedBy;
        hgz g = hgz.g();
        int i = d.a;
        g.getClass();
        synchronized (requestsLock) {
            try {
                cachedCapabilities = networkCapabilities;
                Iterator<T> it = requests.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    tls tlsVar = (tls) entry.getKey();
                    canBeSatisfiedBy = ((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities);
                    tlsVar.invoke(canBeSatisfiedBy ? q8e.a : new r8e(7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        hgz g = hgz.g();
        int i = d.a;
        g.getClass();
        synchronized (requestsLock) {
            cachedCapabilities = null;
            Iterator<T> it = requests.keySet().iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(new r8e(7));
            }
        }
    }

    public final void setCachedCapabilities(NetworkCapabilities networkCapabilities) {
        cachedCapabilities = networkCapabilities;
    }

    public final void setCapabilitiesInitialized(boolean z) {
        capabilitiesInitialized = z;
    }
}
