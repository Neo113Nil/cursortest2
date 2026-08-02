package ru.ok.android.webrtc.stat.call.methods.call_stat;

import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.swe0;

/* loaded from: classes9.dex */
public final class ConnectionStatistics {

    @Deprecated
    public static final int MAX_TRACKABLE_RTT = 60000;

    public final void addStats(EventItemsMap eventItemsMap, CandidatePair candidatePair) {
        eventItemsMap.set(StatCustomFieldKey.LOCAL_CONNECTION_TYPE, candidatePair.localCandidateType);
        eventItemsMap.set(StatCustomFieldKey.REMOTE_CONNECTION_TYPE, candidatePair.remoteCandidateType);
        eventItemsMap.set(StatCustomFieldKey.LOCAL_ADDRESS, candidatePair.localAddress);
        eventItemsMap.set(StatCustomFieldKey.REMOTE_ADDRESS, candidatePair.remoteAddress);
        String key = CallStatMetric.RTT.getKey();
        Double d = candidatePair.rtt;
        eventItemsMap.set(key, d != null ? Integer.valueOf(swe0.g((int) d.doubleValue(), 0, 60000)) : null);
        eventItemsMap.set("transport", candidatePair.transport);
    }
}
