package ru.ok.android.webrtc.protocol.screenshare.recv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.visible.VisibleParticipants;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.j1d;

/* loaded from: classes9.dex */
public class ScreenshareReceiver {
    public final RTCLog b;
    public final MappingProcessor c;
    public RtcTransport d;
    public final Future e;
    public final ParticipantRendererCollection f;
    public g h;
    public volatile Set i;
    public final TimeProvider j;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile boolean g = false;

    public ScreenshareReceiver(RTCLog rTCLog, MappingProcessor mappingProcessor, Future<EglBase.Context> future, ParticipantRendererCollection participantRendererCollection, TimeProvider timeProvider) {
        this.b = rTCLog;
        this.c = mappingProcessor;
        this.f = participantRendererCollection;
        this.e = future;
        this.j = timeProvider;
    }

    public final c a(CallParticipant.ParticipantId participantId) {
        if (this.g) {
            return null;
        }
        if (this.a.get(participantId) == null) {
            if (!(this.i == null ? true : this.i.contains(participantId))) {
                return null;
            }
            this.a.put(participantId, new c(this.b, this.e, this.j, new j1d(this, participantId)));
        }
        return (c) this.a.get(participantId);
    }

    public void dispose() {
        this.g = true;
        for (c cVar : this.a.values()) {
            if (cVar != null) {
                cVar.e();
            }
        }
        RtcTransport rtcTransport = this.d;
        if (rtcTransport == null) {
            return;
        }
        g gVar = this.h;
        if (gVar != null) {
            rtcTransport.removeDataListener(gVar);
        }
        this.d = null;
        this.h = null;
    }

    public ScreenshareRecvStat getStat(CallParticipant.ParticipantId participantId) {
        c cVar = (c) this.a.get(participantId);
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }

    public Map<CallParticipant.ParticipantId, ScreenshareRecvStat> getStats() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            c cVar = (c) entry.getValue();
            if (cVar != null) {
                hashMap.put((CallParticipant.ParticipantId) entry.getKey(), cVar.b());
            }
        }
        return hashMap;
    }

    public void setTransport(RtcTransport rtcTransport) {
        RtcTransport rtcTransport2;
        if (rtcTransport != null && (rtcTransport2 = this.d) != null) {
            g gVar = this.h;
            if (gVar != null) {
                rtcTransport2.removeDataListener(gVar);
            }
            this.d = null;
            this.h = null;
        }
        this.d = rtcTransport;
        g gVar2 = new g(this);
        this.h = gVar2;
        rtcTransport.addDataListener(gVar2);
    }

    public void setVisibleParticipants(VisibleParticipants visibleParticipants) {
        if (this.g) {
            return;
        }
        this.i = Collections.unmodifiableSet(visibleParticipants.getParticipantsWithVisibleScreenShare());
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!this.i.contains(entry.getKey())) {
                c cVar = (c) entry.getValue();
                if (cVar != null) {
                    cVar.e();
                }
                it.remove();
            }
        }
    }

    public final void a(CallParticipant.ParticipantId participantId, VideoFrame videoFrame) {
        if (this.g) {
            return;
        }
        this.f.deliverScreenCaptureFrame(participantId, videoFrame);
    }
}
