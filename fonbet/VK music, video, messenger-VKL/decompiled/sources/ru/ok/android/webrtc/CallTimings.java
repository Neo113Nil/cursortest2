package ru.ok.android.webrtc;

import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.jyy0;
import xsna.ne7;

/* loaded from: classes9.dex */
public interface CallTimings {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final CallTimings create(TimeProvider timeProvider, boolean z, RTCLog rTCLog) {
            return z ? new jyy0(timeProvider, rTCLog) : new ne7();
        }
    }

    static CallTimings create(TimeProvider timeProvider, boolean z, RTCLog rTCLog) {
        return Companion.create(timeProvider, z, rTCLog);
    }

    void trace(String str);
}
