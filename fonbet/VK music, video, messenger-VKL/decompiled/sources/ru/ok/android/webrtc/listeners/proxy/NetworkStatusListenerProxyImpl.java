package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallNetworkStatusListener;
import ru.ok.android.webrtc.listeners.collection.NetworkStatusListenersCollection;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class NetworkStatusListenerProxyImpl implements NetworkStatusListenersCollection, NetworkStatusListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.NetworkStatusListenersCollection
    public void addNetworkStatusListener(CallNetworkStatusListener callNetworkStatusListener) {
        this.a.add(callNetworkStatusListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallNetworkStatusListener
    public void onCallParticipantNetworkStatusChanged(List<CallParticipant> list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallNetworkStatusListener) it.next()).onCallParticipantNetworkStatusChanged(list);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.NetworkStatusListenersCollection
    public void removeNetworkStatusListener(CallNetworkStatusListener callNetworkStatusListener) {
        this.a.remove(callNetworkStatusListener);
    }
}
