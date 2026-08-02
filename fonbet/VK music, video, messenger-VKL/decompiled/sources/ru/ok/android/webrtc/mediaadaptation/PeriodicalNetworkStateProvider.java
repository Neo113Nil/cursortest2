package ru.ok.android.webrtc.mediaadaptation;

import android.os.Handler;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public final class PeriodicalNetworkStateProvider implements NetworkStateProvider {
    public final Handler a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Timer c;
    public final MediaAdaptation.NetworkState[] d;
    public int e;

    public PeriodicalNetworkStateProvider(Handler handler) {
        this.a = handler;
        Timer timer = new Timer();
        this.c = timer;
        this.d = new MediaAdaptation.NetworkState[]{new MediaAdaptation.NetworkState(125.0d, 0.05d), new MediaAdaptation.NetworkState(1001.0d, 1.0d), new MediaAdaptation.NetworkState(125.0d, 0.05d), new MediaAdaptation.NetworkState(10.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE)};
        timer.schedule(new PeriodicalNetworkStateProvider$scheduleNextState$1(this), 20000L);
    }

    public static final void access$nextState(PeriodicalNetworkStateProvider periodicalNetworkStateProvider) {
        MediaAdaptation.NetworkState networkState = periodicalNetworkStateProvider.d[periodicalNetworkStateProvider.e];
        Iterator it = periodicalNetworkStateProvider.b.iterator();
        while (it.hasNext()) {
            ((NetworkStateListener) it.next()).onNetworkStateChanged(networkState);
        }
        int i = periodicalNetworkStateProvider.e + 1;
        periodicalNetworkStateProvider.e = i;
        if (i > 3) {
            periodicalNetworkStateProvider.e = 0;
        }
        int i2 = periodicalNetworkStateProvider.e;
        if (i2 == 0) {
            periodicalNetworkStateProvider.c.schedule(new PeriodicalNetworkStateProvider$scheduleNextState$1(periodicalNetworkStateProvider), 10000L);
            return;
        }
        if (i2 == 1) {
            periodicalNetworkStateProvider.c.schedule(new PeriodicalNetworkStateProvider$scheduleNextState$1(periodicalNetworkStateProvider), 10000L);
        } else if (i2 != 2) {
            periodicalNetworkStateProvider.c.schedule(new PeriodicalNetworkStateProvider$scheduleNextState$1(periodicalNetworkStateProvider), 32000L);
        } else {
            periodicalNetworkStateProvider.c.schedule(new PeriodicalNetworkStateProvider$scheduleNextState$1(periodicalNetworkStateProvider), 10000L);
        }
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkStateProvider
    public void addListener(NetworkStateListener networkStateListener) {
        if (this.b.contains(networkStateListener)) {
            return;
        }
        this.b.add(networkStateListener);
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkStateProvider
    public void release() {
        this.c.cancel();
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkStateProvider
    public void removeListener(NetworkStateListener networkStateListener) {
        this.b.remove(networkStateListener);
    }
}
