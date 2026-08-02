package ru.ok.android.webrtc.stat.screenshare;

import android.util.Size;
import io.reactivex.rxjava3.schedulers.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.screenshare.ScreenshareFirstFrameStat;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.h7l;
import xsna.pn00;
import xsna.s3q0;
import xsna.tdh0;

/* loaded from: classes9.dex */
public final class ScreenshareFirstFrameStat {
    public final CallEventualStatSender a;
    public final TimeProvider b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();

    public ScreenshareFirstFrameStat(CallEventualStatSender callEventualStatSender, TimeProvider timeProvider) {
        this.a = callEventualStatSender;
        this.b = timeProvider;
    }

    public static final void a(ScreenshareFirstFrameStat screenshareFirstFrameStat, CallParticipant.ParticipantId participantId, Size size, long j) {
        screenshareFirstFrameStat.a(participantId, size, j);
    }

    public final void onDisplayLayouts(final List<CallDisplayLayoutItem> list) {
        final long msSinceBoot = this.b.getMsSinceBoot();
        a.a().c(new Runnable() { // from class: xsna.udh0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenshareFirstFrameStat.a(ScreenshareFirstFrameStat.this, list, msSinceBoot);
            }
        });
    }

    public final void onScreenShareFrame(CallParticipant.ParticipantId participantId, VideoFrame videoFrame) {
        long msSinceBoot = this.b.getMsSinceBoot();
        a.a().c(new tdh0(this, participantId, new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight()), msSinceBoot));
    }

    public static final void a(ScreenshareFirstFrameStat screenshareFirstFrameStat, List list, long j) {
        synchronized (screenshareFirstFrameStat) {
            screenshareFirstFrameStat.a(list, j);
            screenshareFirstFrameStat.a(list);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CallDisplayLayoutItem callDisplayLayoutItem = (CallDisplayLayoutItem) it.next();
            if (callDisplayLayoutItem.getVideoTrackParticipantKey().getType() == VideoTrackType.SCREEN_CAPTURE) {
                linkedHashSet.add(callDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId());
            }
        }
        Iterator it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            CallParticipant.ParticipantId participantId = (CallParticipant.ParticipantId) ((Map.Entry) it2.next()).getKey();
            if (!linkedHashSet.contains(participantId)) {
                this.d.add(participantId);
                it2.remove();
            }
        }
    }

    public final void a(CallParticipant.ParticipantId participantId, Size size, long j) {
        synchronized (this) {
            try {
                if (this.d.contains(participantId)) {
                    return;
                }
                Long l = (Long) this.c.get(participantId);
                if (l != null) {
                    io.reactivex.rxjava3.android.schedulers.a.b().c(new h7l(this, j - l.longValue(), pn00.k(new Pair("width", EventItemValueKt.toEventItemValue(size.getWidth())), new Pair("height", EventItemValueKt.toEventItemValue(size.getHeight())))));
                    this.c.remove(participantId);
                    this.d.add(participantId);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(ScreenshareFirstFrameStat screenshareFirstFrameStat, long j, Map map) {
        screenshareFirstFrameStat.a.send(CallEventualStatName.SCREEN_SHARE_FIRST_FRAME, EventItemValueKt.toEventItemValue(j), new EventItemsMap((Map<String, ? extends EventItemValue>) map));
    }

    public final void a(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CallVideoTrackParticipantKey videoTrackParticipantKey = ((CallDisplayLayoutItem) it.next()).getVideoTrackParticipantKey();
            boolean z = videoTrackParticipantKey.getType() == VideoTrackType.SCREEN_CAPTURE;
            boolean containsKey = this.c.containsKey(videoTrackParticipantKey.getParticipantId());
            if (z && !containsKey) {
                this.c.put(videoTrackParticipantKey.getParticipantId(), Long.valueOf(j));
            }
        }
    }
}
