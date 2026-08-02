package xsna;

import one.video.player.live.proto.rtmp.ProtocolException;
import xsna.bw1;

/* compiled from: RtmpMessages.java */
/* loaded from: classes8.dex */
public final class mqg0 extends bw1 {
    public final cw1 a = new cw1();
    public final cw1 b = new cw1();
    public final cw1 c = new cw1();
    public final cw1 d = new cw1();
    public final cw1 e = new cw1();

    @Override // xsna.bw1
    public final void a(bw1.e eVar) throws ProtocolException {
        eVar.a("level", this.a);
        eVar.a("code", this.b);
        eVar.a("description", this.c);
        eVar.a("result", this.d);
        eVar.a("reason", this.e);
    }
}
