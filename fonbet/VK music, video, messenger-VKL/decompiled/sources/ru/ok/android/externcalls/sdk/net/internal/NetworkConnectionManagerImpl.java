package ru.ok.android.externcalls.sdk.net.internal;

import ru.ok.android.external.sdk.TopologyChangedListener;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.NetworkConnectivityListener;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.connection.BadConnectionCallback;

/* compiled from: NetworkConnectionManagerImpl.kt */
/* loaded from: classes9.dex */
public final class NetworkConnectionManagerImpl implements NetworkConnectionManager {
    private final Call call;

    public NetworkConnectionManagerImpl(Call call) {
        this.call = call;
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void addNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        this.call.addNetworkConnectivityListener(networkConnectivityListener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public Topology getTopology() {
        return this.call.topologyIdentity();
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void minusAssign(TopologyChangedListener topologyChangedListener) {
        this.call.removeTopologyChangedListener(topologyChangedListener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void plusAssign(TopologyChangedListener topologyChangedListener) {
        this.call.addTopologyChangedListener(topologyChangedListener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void registerBadConnectionCallback(BadConnectionCallback badConnectionCallback) {
        this.call.registerBadConnectionCallback(badConnectionCallback);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void removeNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        this.call.removeNetworkConnectivityListener(networkConnectivityListener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void unregisterBadConnectionCallback(BadConnectionCallback badConnectionCallback) {
        this.call.unregisterBadConnectionCallback(badConnectionCallback);
    }
}
