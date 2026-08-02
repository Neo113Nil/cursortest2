package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener;
import ru.ok.android.webrtc.listeners.collection.TopologyUpgradeListenerCollection;
import ru.ok.android.webrtc.topology.TopologyChangedEvent;

/* loaded from: classes9.dex */
public final class TopologyUpgradeStatEventListenerProxyImpl implements TopologyUpgradeStatEventListenerProxy, TopologyUpgradeListenerCollection {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.TopologyUpgradeListenerCollection
    public void addTopologyUpgradeStatEventListener(TopologyUpgradeStatEventListener topologyUpgradeStatEventListener) {
        this.a.add(topologyUpgradeStatEventListener);
    }

    @Override // ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener
    public void onTopologyUpgradeEvent(TopologyChangedEvent topologyChangedEvent) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((TopologyUpgradeStatEventListener) it.next()).onTopologyUpgradeEvent(topologyChangedEvent);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.TopologyUpgradeListenerCollection
    public void removeTopologyUpgradeStatEventListener(TopologyUpgradeStatEventListener topologyUpgradeStatEventListener) {
        this.a.remove(topologyUpgradeStatEventListener);
    }
}
