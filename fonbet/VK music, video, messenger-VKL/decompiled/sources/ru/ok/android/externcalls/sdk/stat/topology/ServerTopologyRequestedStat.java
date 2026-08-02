package ru.ok.android.externcalls.sdk.stat.topology;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.topology.TopologyChangedEvent;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: ServerTopologyRequestedStat.kt */
/* loaded from: classes9.dex */
public final class ServerTopologyRequestedStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;
    private final TimeProvider timeProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public ServerTopologyRequestedStat(gzs<? extends CallEventualStatSender> gzsVar, TimeProvider timeProvider) {
        this.getEventualStatSender = gzsVar;
        this.timeProvider = timeProvider;
    }

    public final void onServerTopologyRequested(TopologyChangedEvent topologyChangedEvent) {
        long msSinceBoot = topologyChangedEvent instanceof TopologyChangedEvent.Timeouted ? this.timeProvider.getMsSinceBoot() - ((TopologyChangedEvent.Timeouted) topologyChangedEvent).getStartTime() : 0L;
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(msSinceBoot);
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set("string_value", topologyChangedEvent.getReason().getStringName());
            s3q0 s3q0Var = s3q0.a;
            invoke.send(CallEventualStatName.CLIENT_REQUESTED_SERVER_TOPOLOGY, eventItemValue, eventItemsMap);
        }
    }
}
