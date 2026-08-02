package ru.ok.android.webrtc.stat.data;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.rtc.SsrcUtils;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.epx;

/* loaded from: classes9.dex */
public final class FirstDataSentStat {
    public final CallEventualStatSender a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public FirstDataSentStat(CallEventualStatSender callEventualStatSender) {
        this.a = callEventualStatSender;
    }

    public final void onRtcStats(RTCStat rTCStat) {
        CandidatePair firstActiveConnection;
        Object obj;
        Object obj2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (this.b.get() || (firstActiveConnection = rTCStat.firstActiveConnection()) == null) {
            return;
        }
        Ssrc.Pack split = SsrcUtils.split(SsrcUtils.ssrcForConnection(rTCStat.ssrcs, firstActiveConnection));
        Iterator<T> it = split.outgoingAudio.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (epx.f(((Ssrc.Send) obj2).isMediaShare, Boolean.FALSE)) {
                    break;
                }
            }
        }
        Ssrc.AudioSend audioSend = (Ssrc.AudioSend) ((Ssrc.Send) obj2);
        if (audioSend != null && (bigInteger2 = audioSend.bytesSent) != null && bigInteger2.signum() == 1 && this.b.compareAndSet(false, true)) {
            CallEventualStatSender.send$default(this.a, CallEventualStatName.FIRST_MEDIA_SENT, null, null, 6, null);
        }
        Iterator<T> it2 = split.outgoingVideo.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (epx.f(((Ssrc.Send) next).isMediaShare, Boolean.FALSE)) {
                obj = next;
                break;
            }
        }
        Ssrc.VideoSend videoSend = (Ssrc.VideoSend) ((Ssrc.Send) obj);
        if (videoSend == null || (bigInteger = videoSend.bytesSent) == null || bigInteger.signum() != 1 || !this.b.compareAndSet(false, true)) {
            return;
        }
        CallEventualStatSender.send$default(this.a, CallEventualStatName.FIRST_MEDIA_SENT, null, null, 6, null);
    }
}
