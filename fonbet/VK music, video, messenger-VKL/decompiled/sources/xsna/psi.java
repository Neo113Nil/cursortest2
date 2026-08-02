package xsna;

import android.app.PendingIntent;
import android.net.ConnectivityManager;
import android.net.IpSecManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.ProxyInfo;
import android.net.SocketKeepalive;
import android.os.Build;
import android.os.Handler;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CompositeCallbackConnectivityManager.kt */
/* loaded from: classes.dex */
public final class psi extends ConnectivityManager {
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final bui c = new bui();
    public static final boolean d;
    public final ConnectivityManager a;

    static {
        int i;
        d = "huawei".equalsIgnoreCase(Build.MANUFACTURER) && 29 <= (i = gz80.a) && i <= 32;
    }

    public psi(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // android.net.ConnectivityManager
    public final void addDefaultNetworkActiveListener(ConnectivityManager.OnNetworkActiveListener onNetworkActiveListener) {
        this.a.addDefaultNetworkActiveListener(onNetworkActiveListener);
    }

    @Override // android.net.ConnectivityManager
    public final boolean bindProcessToNetwork(Network network) {
        return this.a.bindProcessToNetwork(network);
    }

    @Override // android.net.ConnectivityManager
    public final SocketKeepalive createSocketKeepalive(Network network, IpSecManager.UdpEncapsulationSocket udpEncapsulationSocket, InetAddress inetAddress, InetAddress inetAddress2, Executor executor, SocketKeepalive.Callback callback) {
        SocketKeepalive createSocketKeepalive;
        createSocketKeepalive = this.a.createSocketKeepalive(network, udpEncapsulationSocket, inetAddress, inetAddress2, executor, callback);
        return createSocketKeepalive;
    }

    @Override // android.net.ConnectivityManager
    public final Network getActiveNetwork() {
        return this.a.getActiveNetwork();
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final NetworkInfo getActiveNetworkInfo() {
        return this.a.getActiveNetworkInfo();
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final NetworkInfo[] getAllNetworkInfo() {
        return this.a.getAllNetworkInfo();
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final Network[] getAllNetworks() {
        return this.a.getAllNetworks();
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final boolean getBackgroundDataSetting() {
        return this.a.getBackgroundDataSetting();
    }

    @Override // android.net.ConnectivityManager
    public final Network getBoundNetworkForProcess() {
        return this.a.getBoundNetworkForProcess();
    }

    @Override // android.net.ConnectivityManager
    public final int getConnectionOwnerUid(int i, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        int connectionOwnerUid;
        connectionOwnerUid = this.a.getConnectionOwnerUid(i, inetSocketAddress, inetSocketAddress2);
        return connectionOwnerUid;
    }

    @Override // android.net.ConnectivityManager
    public final ProxyInfo getDefaultProxy() {
        return this.a.getDefaultProxy();
    }

    @Override // android.net.ConnectivityManager
    public final LinkProperties getLinkProperties(Network network) {
        return this.a.getLinkProperties(network);
    }

    @Override // android.net.ConnectivityManager
    public final int getMultipathPreference(Network network) {
        return this.a.getMultipathPreference(network);
    }

    @Override // android.net.ConnectivityManager
    public final NetworkCapabilities getNetworkCapabilities(Network network) {
        return this.a.getNetworkCapabilities(network);
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final NetworkInfo getNetworkInfo(int i) {
        return this.a.getNetworkInfo(i);
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final int getNetworkPreference() {
        return this.a.getNetworkPreference();
    }

    @Override // android.net.ConnectivityManager
    public final byte[] getNetworkWatchlistConfigHash() {
        return this.a.getNetworkWatchlistConfigHash();
    }

    @Override // android.net.ConnectivityManager
    public final int getRestrictBackgroundStatus() {
        return this.a.getRestrictBackgroundStatus();
    }

    @Override // android.net.ConnectivityManager
    public final boolean isActiveNetworkMetered() {
        return this.a.isActiveNetworkMetered();
    }

    @Override // android.net.ConnectivityManager
    public final boolean isDefaultNetworkActive() {
        return this.a.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager
    public final void registerBestMatchingNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        try {
            this.a.registerBestMatchingNetworkCallback(networkRequest, networkCallback, handler);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void registerDefaultNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        boolean andSet = b.getAndSet(true);
        bui buiVar = c;
        if (!andSet) {
            super.registerDefaultNetworkCallback(buiVar);
        }
        try {
            this.a.registerDefaultNetworkCallback(networkCallback);
        } catch (RuntimeException e) {
            try {
                throw e;
            } catch (RuntimeException unused) {
                if (networkCallback instanceof bui) {
                    buiVar.getClass();
                } else {
                    buiVar.a.addIfAbsent(networkCallback);
                }
            }
        }
    }

    @Override // android.net.ConnectivityManager
    public final void registerNetworkCallback(NetworkRequest networkRequest, PendingIntent pendingIntent) {
        try {
            this.a.registerNetworkCallback(networkRequest, pendingIntent);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void releaseNetworkRequest(PendingIntent pendingIntent) {
        try {
            this.a.releaseNetworkRequest(pendingIntent);
        } catch (Throwable unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void removeDefaultNetworkActiveListener(ConnectivityManager.OnNetworkActiveListener onNetworkActiveListener) {
        this.a.removeDefaultNetworkActiveListener(onNetworkActiveListener);
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final void reportBadNetwork(Network network) {
        this.a.reportBadNetwork(network);
    }

    @Override // android.net.ConnectivityManager
    public final void reportNetworkConnectivity(Network network, boolean z) {
        this.a.reportNetworkConnectivity(network, z);
    }

    @Override // android.net.ConnectivityManager
    public final boolean requestBandwidthUpdate(Network network) {
        return this.a.requestBandwidthUpdate(network);
    }

    @Override // android.net.ConnectivityManager
    public final void requestNetwork(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        try {
            this.a.requestNetwork(networkRequest, networkCallback);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final void setNetworkPreference(int i) {
        this.a.setNetworkPreference(i);
    }

    @Override // android.net.ConnectivityManager
    public final void unregisterNetworkCallback(PendingIntent pendingIntent) {
        try {
            this.a.unregisterNetworkCallback(pendingIntent);
        } catch (Throwable unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    @ozl
    public final NetworkInfo getNetworkInfo(Network network) {
        return this.a.getNetworkInfo(network);
    }

    @Override // android.net.ConnectivityManager
    public final void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        boolean andSet = b.getAndSet(true);
        bui buiVar = c;
        if (!andSet) {
            super.registerDefaultNetworkCallback(buiVar);
        }
        try {
            this.a.registerNetworkCallback(networkRequest, networkCallback);
        } catch (RuntimeException e) {
            try {
                throw e;
            } catch (RuntimeException unused) {
                if (networkCallback instanceof bui) {
                    buiVar.getClass();
                } else {
                    buiVar.a.addIfAbsent(networkCallback);
                }
            }
        }
    }

    @Override // android.net.ConnectivityManager
    public final void requestNetwork(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        try {
            this.a.requestNetwork(networkRequest, networkCallback, handler);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        if (c.a.remove(networkCallback)) {
            return;
        }
        try {
            this.a.unregisterNetworkCallback(networkCallback);
        } catch (Throwable unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void requestNetwork(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, int i) {
        try {
            this.a.requestNetwork(networkRequest, networkCallback, i);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void requestNetwork(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler, int i) {
        try {
            this.a.requestNetwork(networkRequest, networkCallback, handler, i);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void requestNetwork(NetworkRequest networkRequest, PendingIntent pendingIntent) {
        try {
            this.a.requestNetwork(networkRequest, pendingIntent);
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.net.ConnectivityManager
    public final void registerDefaultNetworkCallback(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        boolean andSet = b.getAndSet(true);
        bui buiVar = c;
        if (!andSet) {
            super.registerDefaultNetworkCallback(buiVar);
        }
        try {
            this.a.registerDefaultNetworkCallback(networkCallback, handler);
        } catch (RuntimeException e) {
            try {
                throw e;
            } catch (RuntimeException unused) {
                if (networkCallback instanceof bui) {
                    buiVar.getClass();
                } else {
                    buiVar.a.addIfAbsent(networkCallback);
                }
            }
        }
    }

    @Override // android.net.ConnectivityManager
    public final void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        boolean andSet = b.getAndSet(true);
        bui buiVar = c;
        if (!andSet) {
            super.registerDefaultNetworkCallback(buiVar);
        }
        try {
            this.a.registerNetworkCallback(networkRequest, networkCallback, handler);
        } catch (RuntimeException e) {
            try {
                throw e;
            } catch (RuntimeException unused) {
                if (networkCallback instanceof bui) {
                    buiVar.getClass();
                } else {
                    buiVar.a.addIfAbsent(networkCallback);
                }
            }
        }
    }
}
