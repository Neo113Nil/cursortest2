package xsna;

import one.video.player.live.proto.rtmp.ProtocolException;
import xsna.xv1;

/* compiled from: ProtoMessageBase.java */
/* loaded from: classes8.dex */
public class q8e0 extends xv1 {
    public final cw1 a;
    public final zv1 b;

    public q8e0() {
        this.a = new cw1();
        this.b = new zv1();
    }

    @Override // xsna.xv1
    public void a(xv1.e eVar) throws ProtocolException {
        eVar.a(this.a);
        eVar.a(this.b);
    }

    public q8e0(String str) {
        this.a = new cw1(str);
        this.b = new zv1(0);
    }
}
