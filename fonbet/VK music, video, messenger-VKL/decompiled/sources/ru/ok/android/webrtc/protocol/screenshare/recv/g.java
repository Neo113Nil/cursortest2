package ru.ok.android.webrtc.protocol.screenshare.recv;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;
import xsna.z3z0;

/* loaded from: classes9.dex */
public final class g implements RtcTransport.DataListener {
    public final /* synthetic */ ScreenshareReceiver a;

    public g(ScreenshareReceiver screenshareReceiver) {
        this.a = screenshareReceiver;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.DataListener
    public final void onReceive(RtcTransport rtcTransport, byte[] bArr, RtcFormat rtcFormat) {
        c cVar;
        ScreenshareReceiver screenshareReceiver = this.a;
        if (screenshareReceiver.g) {
            return;
        }
        z3z0 z3z0Var = new z3z0(bArr);
        CallParticipant.ParticipantId query = screenshareReceiver.c.query(z3z0Var.j);
        if (query == null) {
            return;
        }
        c a = screenshareReceiver.a(query);
        if (a != null) {
            a.b(z3z0Var);
        }
        if (!z3z0Var.isEos() || (cVar = (c) screenshareReceiver.a.get(query)) == null) {
            return;
        }
        cVar.e();
        screenshareReceiver.a.remove(query);
    }
}
