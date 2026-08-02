package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallRtcStatsListener;
import ru.ok.android.webrtc.listeners.collection.RtcStatsListenersCollection;
import ru.ok.android.webrtc.stat.rtc.RTCStat;

/* loaded from: classes9.dex */
public final class RtcStatsListenerProxyImpl implements RtcStatsListenersCollection, RtcStatsListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.RtcStatsListenersCollection
    public void addRtcStatsListener(CallRtcStatsListener callRtcStatsListener) {
        this.a.add(callRtcStatsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallRtcStatsListener
    public void onRtcStats(RTCStat rTCStat) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallRtcStatsListener) it.next()).onRtcStats(rTCStat);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.RtcStatsListenersCollection
    public void removeRtcStatsListener(CallRtcStatsListener callRtcStatsListener) {
        this.a.remove(callRtcStatsListener);
    }
}
