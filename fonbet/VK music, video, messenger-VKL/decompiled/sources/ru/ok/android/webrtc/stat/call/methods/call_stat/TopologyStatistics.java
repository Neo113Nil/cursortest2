package ru.ok.android.webrtc.stat.call.methods.call_stat;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import ru.ok.android.webrtc.utils.TopologyProvider;

@CallInternalApi
/* loaded from: classes9.dex */
public final class TopologyStatistics {
    public final TopologyProvider a;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Topology.values().length];
            try {
                iArr[Topology.SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Topology.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TopologyStatistics(TopologyProvider topologyProvider) {
        this.a = topologyProvider;
    }

    public final void addStats(EventItemsMap eventItemsMap) {
        eventItemsMap.set(StatCustomFieldKey.CALL_TOPOLOGY, WhenMappings.$EnumSwitchMapping$0[this.a.getIdentity().ordinal()] != 1 ? "D" : "S");
        CallTopology invoke = this.a.getTopology().invoke();
        DirectCallTopology directCallTopology = invoke instanceof DirectCallTopology ? (DirectCallTopology) invoke : null;
        Boolean valueOf = directCallTopology != null ? Boolean.valueOf(directCallTopology.isP2PRelayEnabled()) : null;
        eventItemsMap.set(StatCustomFieldKey.P2P_RELAY, String.valueOf(valueOf != null ? valueOf.booleanValue() : false));
    }
}
