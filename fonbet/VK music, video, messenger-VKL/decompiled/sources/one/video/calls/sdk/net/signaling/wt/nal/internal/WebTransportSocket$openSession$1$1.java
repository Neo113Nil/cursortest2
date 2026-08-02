package one.video.calls.sdk.net.signaling.wt.nal.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import xsna.opy0;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: WebTransportSocket.kt */
/* loaded from: classes8.dex */
public /* synthetic */ class WebTransportSocket$openSession$1$1 extends FunctionReferenceImpl implements wzs<opy0, NALSocket.Listener, s3q0> {
    public WebTransportSocket$openSession$1$1(Object obj) {
        super(2, obj, WebTransportSocket.class, "sendStreamData", "sendStreamData(Ltech/kwik/flupke/webtransport/WebTransportStream;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)V", 0);
    }

    @Override // xsna.wzs
    public final /* bridge */ /* synthetic */ s3q0 invoke(opy0 opy0Var, NALSocket.Listener listener) {
        invoke2(opy0Var, listener);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(opy0 opy0Var, NALSocket.Listener listener) {
        ((WebTransportSocket) this.receiver).sendStreamData(opy0Var, listener);
    }
}
