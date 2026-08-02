package ru.ok.android.webrtc.mediaadaptation;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.mediaadaptation.DelegatingNetworkConditionProvider;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public final class DelegatingNetworkConditionProvider implements NetworkConditionProvider {
    public final RTCLog a;
    public volatile NetworkConditionProvider b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public MediaAdaptation.NetworkConditionChange d = new MediaAdaptation.NetworkConditionChange(MediaAdaptation.NetworkCondition.GOOD, new MediaAdaptation.NetworkState(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, true);
    public final MediaAdaptation.EventListener e = new MediaAdaptation.EventListener() { // from class: xsna.xtl
        @Override // ru.ok.android.webrtc.mediaadaptation.MediaAdaptation.EventListener
        public final void onNetworkConditionChanged(MediaAdaptation.NetworkConditionChange networkConditionChange) {
            DelegatingNetworkConditionProvider.a(DelegatingNetworkConditionProvider.this, networkConditionChange);
        }
    };

    public DelegatingNetworkConditionProvider(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public static final void a(DelegatingNetworkConditionProvider delegatingNetworkConditionProvider, MediaAdaptation.NetworkConditionChange networkConditionChange) {
        delegatingNetworkConditionProvider.d = networkConditionChange;
        Iterator it = delegatingNetworkConditionProvider.c.iterator();
        while (it.hasNext()) {
            ((MediaAdaptation.EventListener) it.next()).onNetworkConditionChanged(networkConditionChange);
        }
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkConditionProvider
    public void addEventListener(MediaAdaptation.EventListener eventListener) {
        if (this.c.contains(eventListener)) {
            return;
        }
        this.c.add(eventListener);
        eventListener.onNetworkConditionChanged(this.d);
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkConditionProvider
    public void removeEventListener(MediaAdaptation.EventListener eventListener) {
        this.c.remove(eventListener);
    }

    public final void setSourceProvider(NetworkConditionProvider networkConditionProvider) {
        this.a.log(MediaAdaptation.LOG_TAG, "Set new condition provider source. Is null = " + (networkConditionProvider == null));
        NetworkConditionProvider networkConditionProvider2 = this.b;
        if (networkConditionProvider2 != null) {
            networkConditionProvider2.removeEventListener(this.e);
        }
        this.b = networkConditionProvider;
        if (networkConditionProvider != null) {
            networkConditionProvider.addEventListener(this.e);
            return;
        }
        MediaAdaptation.NetworkConditionChange networkConditionChange = new MediaAdaptation.NetworkConditionChange(MediaAdaptation.NetworkCondition.GOOD, new MediaAdaptation.NetworkState(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, true);
        this.a.log(MediaAdaptation.LOG_TAG, "Since there are no new provider, trigger state change to " + networkConditionChange);
        this.e.onNetworkConditionChanged(networkConditionChange);
    }
}
