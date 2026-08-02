package xsna;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: FpsCounter.java */
/* loaded from: classes8.dex */
public final class ias {
    public final ArrayDeque<Long> b = new ArrayDeque<>();
    public final AtomicReference<Double> c = new AtomicReference<>(Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
    public final long a = 2000;
}
