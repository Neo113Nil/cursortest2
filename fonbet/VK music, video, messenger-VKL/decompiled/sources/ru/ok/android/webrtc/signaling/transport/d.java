package ru.ok.android.webrtc.signaling.transport;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;

/* loaded from: classes9.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements gzs {
    public d(SignalingTransport signalingTransport) {
        super(0, signalingTransport, SignalingTransport.class, "getAltEndpoints", "getAltEndpoints()Ljava/util/List;", 0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        List endpointIPs;
        endpointIPs = ((SignalingTransport) this.receiver).i.getEndpointIPs();
        return endpointIPs;
    }
}
