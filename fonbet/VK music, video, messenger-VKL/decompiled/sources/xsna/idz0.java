package xsna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.webrtc.IceCandidate;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes8.dex */
public final class idz0 {
    public final HashMap a = new HashMap();
    public final RTCLog b;
    public boolean c;

    public idz0(RTCLog rTCLog) {
        this.b = rTCLog;
    }

    public final void a(CallParticipant callParticipant, PeerConnectionClient peerConnectionClient) {
        RTCLog rTCLog = this.b;
        rTCLog.log("IceCandidatesHandler", "handle, participant=" + callParticipant + ", client=" + peerConnectionClient);
        if (!this.c || !callParticipant.isCallAccepted() || peerConnectionClient == null || !peerConnectionClient.isReadyForIceCandidates()) {
            rTCLog.log("IceCandidatesHandler", "Cant apply ice candidates, isIceApplyPermitted=" + this.c + ", " + callParticipant + ", client=" + peerConnectionClient);
            return;
        }
        rTCLog.log("IceCandidatesHandler", peerConnectionClient + " is iceable for " + callParticipant);
        Map map = (Map) this.a.get(callParticipant);
        if (map != null) {
            if (CallParticipant.isPeerEquals(callParticipant.getAcceptedCallPeer(), CallParticipant.FAKE_PEER)) {
                rTCLog.log("IceCandidatesHandler", "push all ice candidates to " + peerConnectionClient);
                for (Map.Entry entry : map.entrySet()) {
                    Iterator it = ((List) ((Pair) entry.getValue()).i()).iterator();
                    while (it.hasNext()) {
                        peerConnectionClient.addRemoteIceCandidate((IceCandidate) it.next());
                    }
                    if (!((List) ((Pair) entry.getValue()).j()).isEmpty()) {
                        peerConnectionClient.removeRemoteIceCandidates((IceCandidate[]) ((List) ((Pair) entry.getValue()).j()).toArray(new IceCandidate[((List) ((Pair) entry.getValue()).j()).size()]));
                    }
                }
            } else {
                Pair pair = (Pair) map.get(callParticipant.getAcceptedCallPeer());
                if (pair != null) {
                    Iterator it2 = ((List) pair.i()).iterator();
                    while (it2.hasNext()) {
                        peerConnectionClient.addRemoteIceCandidate((IceCandidate) it2.next());
                    }
                    if (!((List) pair.j()).isEmpty()) {
                        peerConnectionClient.removeRemoteIceCandidates((IceCandidate[]) ((List) pair.j()).toArray(new IceCandidate[((List) pair.j()).size()]));
                    }
                }
            }
            map.clear();
        }
    }
}
