package ru.ok.android.webrtc.protocol.notifications.handlers.videoquality;

import java.io.IOException;
import org.msgpack.core.d;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.notifications.VideoQualityUpdateNotification;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;
import xsna.re;

/* loaded from: classes9.dex */
public final class VideoQualityUpdateNotificationParser {
    public final RTCLog a;

    public VideoQualityUpdateNotificationParser(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final VideoQualityUpdateNotification parse(d dVar) throws IOException {
        int x = dVar.x();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < x; i4++) {
            if (i4 == 0) {
                i = dVar.z();
            } else if (i4 == 1) {
                i2 = dVar.z();
            } else if (i4 != 2) {
                try {
                    dVar.skipValue();
                } catch (Throwable th) {
                    this.a.log("VideoQualityUpdateNotificationParser", "Can't parse VideoQualityUpdate " + th);
                    return null;
                }
            } else {
                re J = dVar.J();
                if (J.E() && !J.B()) {
                    i3 = J.g().o();
                }
            }
        }
        return new VideoQualityUpdateNotification(new VideoQualityUpdate(i, i2, i3));
    }
}
