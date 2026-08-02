package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.listeners.CallStatsListener;
import ru.ok.android.webrtc.listeners.collection.StatsListenersCollection;

/* loaded from: classes9.dex */
public final class StatsListenerProxyImpl implements StatsListenersCollection, StatsListenerProxy {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.StatsListenersCollection
    public void addStatsListener(CallStatsListener callStatsListener) {
        this.a.add(callStatsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallStatsListener
    public void onMediaDataReceived(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallStatsListener) it.next()).onMediaDataReceived(j);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.StatsListenersCollection
    public void removeStatsListener(CallStatsListener callStatsListener) {
        this.a.remove(callStatsListener);
    }
}
