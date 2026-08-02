package ru.ok.android.webrtc;

import ru.ok.android.webrtc.PeerConnectionWebRtcParams;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class PeerConnectionParameters {
    public final PeerConnectionWebRtcParams a;
    public final RTCLog b;

    public static final class Builder {
        public PeerConnectionWebRtcParams a;
        public RTCLog b;

        public final PeerConnectionParameters build() {
            PeerConnectionWebRtcParams peerConnectionWebRtcParams = this.a;
            if (peerConnectionWebRtcParams == null) {
                peerConnectionWebRtcParams = new PeerConnectionWebRtcParams.Builder().build();
            }
            return new PeerConnectionParameters(peerConnectionWebRtcParams, this.b, null);
        }

        public final Builder setLogger(RTCLog rTCLog) {
            this.b = rTCLog;
            return this;
        }

        public final Builder setWebRtcParams(PeerConnectionWebRtcParams peerConnectionWebRtcParams) {
            this.a = peerConnectionWebRtcParams;
            return this;
        }
    }

    public PeerConnectionParameters(PeerConnectionWebRtcParams peerConnectionWebRtcParams, RTCLog rTCLog, zcl zclVar) {
        this.a = peerConnectionWebRtcParams;
        this.b = rTCLog;
    }

    public final RTCLog getLogger() {
        return this.b;
    }

    public final PeerConnectionWebRtcParams getWebRtcParams() {
        return this.a;
    }
}
