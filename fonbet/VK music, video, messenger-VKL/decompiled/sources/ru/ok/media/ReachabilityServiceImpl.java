package ru.ok.media;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.streaming.tools.TimeMachine;
import ru.ok.media.api.ReachabilityService;
import xsna.d410;
import xsna.ne7;
import xsna.qox;
import xsna.s3q0;
import xsna.vb;
import xsna.zcl;

/* compiled from: ReachabilityServiceImpl.kt */
/* loaded from: classes9.dex */
public final class ReachabilityServiceImpl implements ReachabilityService, ConnectivityManager.OnNetworkActiveListener {
    public static final Companion Companion = new Companion(null);
    private static final long NET_STATUS_POLL_TIMEOUT_MS = 1000;
    private static final String TAG = "Publisher";
    private final ConnectivityManager connectivityManager;
    private final ReachabilityServiceImpl$defaultNetworkCallback$1 defaultNetworkCallback;
    private final CopyOnWriteArraySet<ReachabilityService.Listener> listeners;
    private final Handler mainQueue;
    private final ReachabilityServiceImpl$networkCallback$1 networkCallback;
    private final NetworkRequest networkRequest;
    private final qox pollTimer;
    private AtomicBoolean prevIsCellular;
    private AtomicBoolean prevIsExpensive;
    private AtomicBoolean prevIsLowDataMode;
    private AtomicBoolean prevIsWiFi;
    private final AtomicBoolean prevReachable;
    private boolean released;

    /* compiled from: ReachabilityServiceImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.net.ConnectivityManager$NetworkCallback, ru.ok.media.ReachabilityServiceImpl$networkCallback$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.net.ConnectivityManager$NetworkCallback, ru.ok.media.ReachabilityServiceImpl$defaultNetworkCallback$1] */
    public ReachabilityServiceImpl(TimeMachine timeMachine, ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainQueue = handler;
        this.prevReachable = new AtomicBoolean(true);
        this.prevIsCellular = new AtomicBoolean(false);
        this.prevIsWiFi = new AtomicBoolean(false);
        this.prevIsExpensive = new AtomicBoolean(false);
        this.prevIsLowDataMode = new AtomicBoolean(false);
        this.listeners = new CopyOnWriteArraySet<>();
        this.pollTimer = new qox(handler, 1000L, 1000L, timeMachine, new d410(this, 28));
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(4).build();
        this.networkRequest = build;
        ?? r0 = new ConnectivityManager.NetworkCallback() { // from class: ru.ok.media.ReachabilityServiceImpl$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                ne7.m("Publisher", "NetworkCallback.onAvailable() - " + network);
                super.onAvailable(network);
                ReachabilityServiceImpl.this.isReachable();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                ne7.m("Publisher", "NetworkCallback.onCapabilitiesChanged() - " + network + " caps: " + networkCapabilities);
                super.onCapabilitiesChanged(network, networkCapabilities);
                ReachabilityServiceImpl.this.isReachable();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                ne7.m("Publisher", "NetworkCallback.onLost() - " + network);
                super.onLost(network);
                ReachabilityServiceImpl.this.isReachable();
            }
        };
        this.networkCallback = r0;
        ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: ru.ok.media.ReachabilityServiceImpl$defaultNetworkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                ne7.m("Publisher", "DefaultNetworkCallback.onAvailable() - " + network);
                super.onAvailable(network);
                ReachabilityServiceImpl.this.isReachable();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                ne7.m("Publisher", "DefaultNetworkCallback.onCapabilitiesChanged() - " + network + " caps: " + networkCapabilities);
                super.onCapabilitiesChanged(network, networkCapabilities);
                ReachabilityServiceImpl.this.isReachable();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                ne7.m("Publisher", "DefaultNetworkCallback.onLost() - " + network);
                super.onLost(network);
                ReachabilityServiceImpl.this.isReachable();
            }
        };
        this.defaultNetworkCallback = r1;
        connectivityManager.addDefaultNetworkActiveListener(this);
        connectivityManager.requestNetwork(build, (ConnectivityManager.NetworkCallback) r0);
        connectivityManager.registerDefaultNetworkCallback(r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyChanged() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ReachabilityService.Listener) it.next()).onReachabilityChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 pollTimer$lambda$0(ReachabilityServiceImpl reachabilityServiceImpl, qox qoxVar) {
        reachabilityServiceImpl.isReachable();
        return s3q0.a;
    }

    @Override // ru.ok.media.api.ReachabilityService
    public void addListener(ReachabilityService.Listener listener) {
        if (this.released) {
            return;
        }
        this.listeners.add(listener);
    }

    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    @Override // ru.ok.media.api.ReachabilityService
    public boolean isReachable() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        NetworkCapabilities networkCapabilities;
        String str;
        synchronized (this) {
            try {
                Network activeNetwork = this.connectivityManager.getActiveNetwork();
                z = activeNetwork != null;
                boolean andSet = this.prevReachable.getAndSet(z);
                if (z != andSet) {
                    if (activeNetwork != null) {
                        str = " caps: " + this.connectivityManager.getNetworkCapabilities(activeNetwork) + " link: " + this.connectivityManager.getLinkProperties(activeNetwork);
                    } else {
                        str = "";
                    }
                    ne7.m(TAG, "isReachable() - " + andSet + " -> " + z + " currentNetwork: " + activeNetwork + str);
                    if (!this.released) {
                        this.mainQueue.post(new vb(this, 16));
                    }
                }
                if (activeNetwork == null || (networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                } else {
                    z3 = networkCapabilities.hasTransport(0);
                    z4 = networkCapabilities.hasTransport(1);
                    z2 = !networkCapabilities.hasCapability(11);
                }
                boolean andSet2 = this.prevIsCellular.getAndSet(z3);
                boolean andSet3 = this.prevIsWiFi.getAndSet(z4);
                boolean andSet4 = this.prevIsExpensive.getAndSet(z2);
                boolean andSet5 = this.prevIsLowDataMode.getAndSet(false);
                if (z != andSet || z3 != andSet2 || z4 != andSet3 || z2 != andSet4 || andSet5) {
                    ne7.m(TAG, "Reachable status: " + toInt(z) + " state: isCellular: " + toInt(z3) + ": isWifi: " + toInt(z4) + " isExpensive: " + toInt(z2) + " isLowDataMode " + toInt(false) + " isReadyForUse: " + toInt(z));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        ne7.t(TAG, "OnNetworkActiveListener.onNetworkActive()");
        isReachable();
    }

    @Override // ru.ok.media.api.ReachabilityService
    public void release() {
        this.released = true;
        this.pollTimer.b();
        this.listeners.isEmpty();
        this.connectivityManager.unregisterNetworkCallback(this.defaultNetworkCallback);
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        this.connectivityManager.removeDefaultNetworkActiveListener(this);
    }

    @Override // ru.ok.media.api.ReachabilityService
    public void removeListener(ReachabilityService.Listener listener) {
        if (this.released) {
            return;
        }
        this.listeners.remove(listener);
    }

    private final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
