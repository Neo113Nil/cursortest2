package ru.ok.android.webrtc.mediaadaptation;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.mediaadaptation.MediaAdaptation;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.call.methods.call_stat.SsrcsReset;
import ru.ok.android.webrtc.stat.listener.StatListenerManager;
import ru.ok.android.webrtc.stat.listener.StatisticsListener;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.stat.utils.LossCalc;
import ru.ok.android.webrtc.utils.Ema;
import xsna.epx;
import xsna.tj0;

/* loaded from: classes9.dex */
public final class StatBasedNetworkStateProvider implements NetworkStateProvider, StatisticsListener {

    @Deprecated
    public static final double EMA_SMOOTHING_FACTOR = 0.5d;

    @Deprecated
    public static final long STATS_READ_INTERVAL_SEC = 5;
    public final StatListenerManager a;
    public final RTCLog b;
    public final boolean c;
    public Ema d;
    public double e;
    public final LossCalc f = new LossCalc();
    public BigInteger g;
    public BigInteger h;
    public final SsrcsReset i;
    public final CopyOnWriteArrayList j;

    public StatBasedNetworkStateProvider(StatListenerManager statListenerManager, RTCLog rTCLog, boolean z) {
        this.a = statListenerManager;
        this.b = rTCLog;
        this.c = z;
        BigInteger bigInteger = BigInteger.ZERO;
        this.g = bigInteger;
        this.h = bigInteger;
        this.i = new SsrcsReset();
        this.j = new CopyOnWriteArrayList();
        statListenerManager.addStatisticsListener(this, 5L, TimeUnit.SECONDS);
    }

    public final void a(Ssrc.VideoSend videoSend) {
        BigInteger bigInteger;
        BigInteger bigInteger2 = videoSend.packetsSent;
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (bigInteger2 == null || (bigInteger = videoSend.packetsLost) == null) {
            this.e = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.b.log(MediaAdaptation.LOG_TAG, "No packets were sent yet. Reset lost to 0");
            return;
        }
        if (this.c) {
            this.e = this.f.update(bigInteger.longValue(), videoSend.packetsSent.longValue());
            long sentDiff = this.f.getSentDiff();
            long lostDiff = this.f.getLostDiff();
            RTCLog rTCLog = this.b;
            BigInteger bigInteger3 = videoSend.packetsSent;
            BigInteger bigInteger4 = videoSend.packetsLost;
            StringBuilder sb = new StringBuilder("Sent stats: sent=");
            sb.append(sentDiff);
            sb.append(" (total=");
            sb.append(bigInteger3);
            tj0.d(sb, "), lost=", lostDiff, " (total=");
            sb.append(bigInteger4);
            sb.append(")");
            rTCLog.log(MediaAdaptation.LOG_TAG, sb.toString());
            this.b.log(MediaAdaptation.LOG_TAG, "Lost packets fraction updated to " + this.e);
            return;
        }
        if (bigInteger2.compareTo(this.g) < 0) {
            this.g = videoSend.packetsSent;
        }
        if (videoSend.packetsLost.compareTo(this.h) < 0) {
            this.h = videoSend.packetsLost;
        }
        BigInteger subtract = videoSend.packetsLost.subtract(this.h);
        BigInteger subtract2 = videoSend.packetsSent.subtract(this.g);
        this.b.log(MediaAdaptation.LOG_TAG, "Sent stats: sent=" + subtract2 + " (total=" + videoSend.packetsSent + "), lost=" + subtract + " (total=" + videoSend.packetsLost + ")");
        BigInteger bigInteger5 = BigInteger.ZERO;
        if (subtract2.compareTo(bigInteger5) > 0 && subtract.compareTo(bigInteger5) > 0) {
            d = subtract.doubleValue() / subtract2.doubleValue();
        }
        this.e = d;
        this.b.log(MediaAdaptation.LOG_TAG, "Lost packets fraction updated to " + d);
        this.g = videoSend.packetsSent;
        this.h = videoSend.packetsLost;
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkStateProvider
    public void addListener(NetworkStateListener networkStateListener) {
        if (this.j.contains(networkStateListener)) {
            return;
        }
        this.j.add(networkStateListener);
    }

    @Override // ru.ok.android.webrtc.stat.listener.StatisticsListener
    public void onStatistics(RTCStat rTCStat) {
        Double d;
        boolean shouldReset = this.i.shouldReset(rTCStat.ssrcs);
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        Object obj = null;
        if (shouldReset) {
            this.d = null;
            this.e = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            BigInteger bigInteger = BigInteger.ZERO;
            this.g = bigInteger;
            this.h = bigInteger;
            this.f.reset();
        }
        CandidatePair firstActiveConnection = rTCStat.firstActiveConnection();
        if (firstActiveConnection != null && (d = firstActiveConnection.rtt) != null) {
            double doubleValue = d.doubleValue();
            Ema ema = this.d;
            if (ema != null) {
                ema.submit(doubleValue);
            } else {
                this.d = new Ema(0.5d, doubleValue);
            }
        }
        Iterator<T> it = SsrcUtils.outgoingVideo(rTCStat.ssrcs).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((Ssrc.Send) next).isMediaShare, Boolean.FALSE)) {
                obj = next;
                break;
            }
        }
        Ssrc.VideoSend videoSend = (Ssrc.VideoSend) ((Ssrc.Send) obj);
        if (videoSend != null) {
            a(videoSend);
        }
        if (this.j.isEmpty()) {
            this.b.log(MediaAdaptation.LOG_TAG, "Ignore network state update because there are no listeners");
            return;
        }
        Ema ema2 = this.d;
        if (ema2 != null) {
            d2 = ema2.get();
        }
        MediaAdaptation.NetworkState networkState = new MediaAdaptation.NetworkState(d2, this.e);
        Iterator it2 = this.j.iterator();
        while (it2.hasNext()) {
            ((NetworkStateListener) it2.next()).onNetworkStateChanged(networkState);
        }
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkStateProvider
    public void release() {
        this.a.removeStatisticsListener(this);
    }

    @Override // ru.ok.android.webrtc.mediaadaptation.NetworkStateProvider
    public void removeListener(NetworkStateListener networkStateListener) {
        this.j.remove(networkStateListener);
    }
}
