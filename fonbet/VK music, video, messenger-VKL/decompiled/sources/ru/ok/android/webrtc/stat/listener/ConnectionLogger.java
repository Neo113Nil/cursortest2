package ru.ok.android.webrtc.stat.listener;

import org.webrtc.CandidatePairChangeEvent;
import ru.ok.android.webrtc.RTCLog;
import xsna.j1z0;

/* loaded from: classes9.dex */
public final class ConnectionLogger {

    @Deprecated
    public static final String TAG = "ConnectionLogger";
    public final RTCLog a;
    public j1z0 b;

    public ConnectionLogger(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        if (candidatePairChangeEvent == null) {
            return;
        }
        j1z0 j1z0Var = new j1z0(candidatePairChangeEvent.local, candidatePairChangeEvent.remote);
        this.a.log(TAG, "Active connection: " + this.b + "-> " + j1z0Var + ", reason=" + candidatePairChangeEvent.reason);
        this.b = j1z0Var;
    }
}
