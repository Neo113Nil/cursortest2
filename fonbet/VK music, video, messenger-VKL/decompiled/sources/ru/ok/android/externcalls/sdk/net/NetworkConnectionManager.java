package ru.ok.android.externcalls.sdk.net;

import ru.ok.android.external.sdk.TopologyChangedListener;
import ru.ok.android.webrtc.NetworkConnectivityListener;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.connection.BadConnectionCallback;

/* compiled from: NetworkConnectionManager.kt */
/* loaded from: classes9.dex */
public interface NetworkConnectionManager {
    void addNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener);

    Topology getTopology();

    void minusAssign(TopologyChangedListener topologyChangedListener);

    void plusAssign(TopologyChangedListener topologyChangedListener);

    void registerBadConnectionCallback(BadConnectionCallback badConnectionCallback);

    void removeNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener);

    void unregisterBadConnectionCallback(BadConnectionCallback badConnectionCallback);
}
