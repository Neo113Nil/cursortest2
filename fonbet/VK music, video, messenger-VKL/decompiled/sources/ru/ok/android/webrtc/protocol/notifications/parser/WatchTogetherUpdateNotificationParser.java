package ru.ok.android.webrtc.protocol.notifications.parser;

import java.io.IOException;
import java.util.ArrayList;
import org.msgpack.core.d;
import org.msgpack.value.ValueType;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.protocol.notifications.WatchTogetherUpdateNotification;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.watch_together.MovieStateUpdate;
import ru.ok.android.webrtc.watch_together.MovieStateUpdates;
import xsna.lhg;

/* loaded from: classes9.dex */
public final class WatchTogetherUpdateNotificationParser {
    public final MappingProcessor a;
    public final RTCLog b;

    public WatchTogetherUpdateNotificationParser(MappingProcessor mappingProcessor, RTCLog rTCLog) {
        this.a = mappingProcessor;
        this.b = rTCLog;
    }

    public final MovieStateUpdate a(d dVar) {
        float f;
        int x = dVar.x();
        CallVideoTrackParticipantKey callVideoTrackParticipantKey = null;
        Long l = null;
        float f2 = 1.0f;
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                int z3 = dVar.z();
                CallVideoTrackParticipantKey queryKey = this.a.queryKey(z3);
                if (queryKey == null) {
                    throw new RuntimeException(lhg.a(z3, "Can't find compact id for "));
                }
                callVideoTrackParticipantKey = queryKey;
            } else if (i == 1) {
                byte readByte = dVar.readByte();
                if (readByte == -54) {
                    f = dVar.q(4).getFloat(dVar.l);
                } else {
                    if (readByte != -53) {
                        throw d.w("Float", readByte);
                    }
                    f = (float) dVar.q(8).getDouble(dVar.l);
                }
                f2 = f;
            } else if (i == 2) {
                z = dVar.y();
            } else if (i == 3) {
                ValueType h = dVar.n().h();
                h.getClass();
                if (h == ValueType.INTEGER) {
                    l = Long.valueOf(dVar.A());
                }
            } else if (i != 4) {
                dVar.skipValue();
            } else {
                z2 = dVar.y();
            }
        }
        if (callVideoTrackParticipantKey != null) {
            return new MovieStateUpdate(callVideoTrackParticipantKey, f2, z, l, z2);
        }
        throw new RuntimeException("Watch together parse error");
    }

    public final WatchTogetherUpdateNotification parse(d dVar) throws IOException {
        int x = dVar.x();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < x; i++) {
            try {
                arrayList.add(a(dVar));
            } catch (Throwable th) {
                this.b.log("WatchTogetherUpdateParser", "Can't parse video state update " + th);
            }
        }
        return new WatchTogetherUpdateNotification(new MovieStateUpdates(arrayList));
    }
}
