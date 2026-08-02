package xsna;

import one.video.player.live.proto.rtmp.ProtocolException;
import xsna.xv1;

/* compiled from: RtmpMessages.java */
/* loaded from: classes8.dex */
public final class jqg0 extends q8e0 {
    public final iqg0 c;

    public jqg0() {
        super("connect");
        this.c = new iqg0();
    }

    @Override // xsna.q8e0, xsna.xv1
    public final void a(xv1.e eVar) throws ProtocolException {
        super.a(eVar);
        eVar.a(this.c);
    }
}
