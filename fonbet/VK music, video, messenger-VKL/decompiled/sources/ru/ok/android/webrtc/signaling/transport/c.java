package ru.ok.android.webrtc.signaling.transport;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;

/* loaded from: classes9.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements gzs {
    public c(SignalingTransport signalingTransport) {
        super(0, signalingTransport, SignalingTransport.class, "getOriginalEndpoint", "getOriginalEndpoint()Ljava/lang/String;", 0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return SignalingTransport.access$getOriginalEndpoint((SignalingTransport) this.receiver);
    }
}
