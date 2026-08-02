package ru.ok.android.webrtc.stat.rtc;

import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import xsna.epx;

/* loaded from: classes9.dex */
public final class SsrcExtKt {
    public static final /* synthetic */ <T extends Ssrc.Send> T getStatRelativeMedia(List<? extends T> list, RTCLog rTCLog) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((Ssrc.Send) obj).isMediaShare, Boolean.FALSE)) {
                break;
            }
        }
        return (T) obj;
    }

    public static /* synthetic */ Ssrc.Send getStatRelativeMedia$default(List list, RTCLog rTCLog, int i, Object obj) {
        Object obj2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((Ssrc.Send) obj2).isMediaShare, Boolean.FALSE)) {
                break;
            }
        }
        return (Ssrc.Send) obj2;
    }
}
