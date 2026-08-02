package ru.ok.android.webrtc.stat.call.methods.call_stat;

import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.TopologyProvider;

/* loaded from: classes9.dex */
public final class FeatureEnabledStatistics {
    public final boolean a;
    public final TopologyProvider b;

    public FeatureEnabledStatistics(boolean z, TopologyProvider topologyProvider) {
        this.a = z;
        this.b = topologyProvider;
    }

    public final void addStats(EventItemsMap eventItemsMap) {
        if (this.a && this.b.getIdentity() == Topology.SERVER) {
            eventItemsMap.set(StatCustomFieldKey.IS_SIMULCAST, Boolean.TRUE);
        }
    }
}
