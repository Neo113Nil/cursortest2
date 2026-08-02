package ru.ok.android.webrtc.topology;

import java.util.LinkedHashSet;
import ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener;
import ru.ok.android.webrtc.topology.TopologyChangedEvent;

/* loaded from: classes9.dex */
public final class TopologyUpgradeRequestHistory {
    public final TopologyUpgradeStatEventListener a;
    public final LinkedHashSet b = new LinkedHashSet();

    public TopologyUpgradeRequestHistory(TopologyUpgradeStatEventListener topologyUpgradeStatEventListener) {
        this.a = topologyUpgradeStatEventListener;
    }

    public final void maybeNotifyTopologyUpgradeStatEvent(TopologyChangedEvent topologyChangedEvent) {
        if (topologyChangedEvent.getReason() == TopologyChangedEvent.Reason.SUCCESS_CONNECTION) {
            if (!this.b.contains(TopologyChangedEvent.Reason.NO_CONNECTION_TIMEOUT)) {
                return;
            }
        }
        if (topologyChangedEvent.getReason() == TopologyChangedEvent.Reason.SUCCESS_AUDIO) {
            if (!this.b.contains(TopologyChangedEvent.Reason.NO_DATA_TIMEOUT)) {
                return;
            }
        }
        this.a.onTopologyUpgradeEvent(topologyChangedEvent);
        this.b.add(topologyChangedEvent.getReason());
    }
}
