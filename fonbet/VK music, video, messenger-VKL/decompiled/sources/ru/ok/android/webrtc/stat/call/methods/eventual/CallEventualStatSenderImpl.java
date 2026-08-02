package ru.ok.android.webrtc.stat.call.methods.eventual;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.external.sdk.TopologyChangedListener;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.stat.call.methods.call_stat.ConversationInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.NetworkInfoStatistics;
import ru.ok.android.webrtc.stat.call.methods.call_stat.TopologyStatistics;
import ru.ok.android.webrtc.stat.scheme.CallStatMetric;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.utils.time.Timestamp;
import xsna.j2z0;
import xsna.j5g;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CallEventualStatSenderImpl implements CallEventualStatSender, TopologyChangedListener {
    public static final List i = Collections.singletonList(CallStatMetric.RTT.getKey());
    public final CallAnalyticsSender a;
    public final TimeProvider b;
    public final TopologyStatistics c;
    public final ConversationInfoStatistics d;
    public final NetworkInfoStatistics e;
    public final RTCLog f;
    public EventItemsMap g;
    public final ArrayList h = new ArrayList();

    public CallEventualStatSenderImpl(CallAnalyticsSender callAnalyticsSender, TimeProvider timeProvider, TopologyStatistics topologyStatistics, ConversationInfoStatistics conversationInfoStatistics, NetworkInfoStatistics networkInfoStatistics, RTCLog rTCLog) {
        this.a = callAnalyticsSender;
        this.b = timeProvider;
        this.c = topologyStatistics;
        this.d = conversationInfoStatistics;
        this.e = networkInfoStatistics;
        this.f = rTCLog;
    }

    public final void a(EventItemsMap eventItemsMap) {
        List<j2z0> O0;
        synchronized (this.h) {
            O0 = j5g.O0(this.h);
            this.h.clear();
        }
        for (j2z0 j2z0Var : O0) {
            EventItemsMap eventItemsMap2 = j2z0Var.c;
            eventItemsMap2.addAll(eventItemsMap);
            Long serverTime = j2z0Var.d.getServerTime(this.b);
            this.a.send(new SdkMetricStatEvent.Builder(j2z0Var.a, j2z0Var.b).addAll(eventItemsMap2.getItems()).set("timestamp", Long.valueOf(serverTime != null ? serverTime.longValue() : j2z0Var.d.getTimestamp())).build());
        }
    }

    @Override // ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender
    public void notifyCallEnded() {
        EventItemsMap eventItemsMap = new EventItemsMap();
        this.c.addStats(eventItemsMap);
        this.d.addStats(eventItemsMap);
        this.e.addStats(eventItemsMap);
        a(eventItemsMap);
    }

    public final void onRtcStats(EventItemsMap eventItemsMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(eventItemsMap.getItems());
        Iterator it = i.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
        EventItemsMap eventItemsMap2 = new EventItemsMap(linkedHashMap);
        this.g = eventItemsMap2;
        a(eventItemsMap2);
    }

    @Override // ru.ok.android.external.sdk.TopologyChangedListener
    public void onTopologyUpdated(Topology topology, Topology topology2) {
        EventItemsMap eventItemsMap = this.g;
        if (eventItemsMap != null) {
            this.c.addStats(eventItemsMap);
            this.d.addStats(eventItemsMap);
            this.e.addStats(eventItemsMap);
        } else {
            eventItemsMap = new EventItemsMap();
            this.c.addStats(eventItemsMap);
            this.d.addStats(eventItemsMap);
            this.e.addStats(eventItemsMap);
            a(eventItemsMap);
        }
        this.g = eventItemsMap;
    }

    @Override // ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender
    public void send(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        sendWithTs(str, this.b.timeMs(), eventItemValue, eventItemsMap);
    }

    @Override // ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender
    public void sendWithTs(String str, Timestamp timestamp, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        this.f.log("CallEventualStatSenderImpl", "Event saved " + str + ", value " + eventItemValue + ", additional " + eventItemsMap);
        j2z0 j2z0Var = new j2z0(str, timestamp, eventItemValue, eventItemsMap);
        EventItemsMap eventItemsMap2 = this.g;
        if (eventItemsMap2 == null) {
            synchronized (this.h) {
                this.h.add(j2z0Var);
            }
        } else {
            eventItemsMap.addAll(eventItemsMap2);
            Long serverTime = timestamp.getServerTime(this.b);
            this.a.send(new SdkMetricStatEvent.Builder(str, eventItemValue).addAll(eventItemsMap.getItems()).set("timestamp", Long.valueOf(serverTime != null ? serverTime.longValue() : timestamp.getTimestamp())).build());
        }
    }
}
