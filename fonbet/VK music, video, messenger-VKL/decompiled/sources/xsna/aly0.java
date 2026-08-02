package xsna;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bC$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;

/* compiled from: HandshakePacket.java */
/* loaded from: classes8.dex */
public final class aly0 extends gly0 {
    @Override // xsna.tly0
    public final bC$a d(bF bFVar, com.vk.movika.sdk.base.data.converter.c cVar) {
        ((bE) bFVar).k(this, cVar);
        return bC$a.a;
    }

    @Override // xsna.tly0
    public final aF n() {
        return aF.c;
    }

    @Override // xsna.tly0
    public final aG o() {
        return aG.b;
    }

    @Override // xsna.gly0
    public final byte w() {
        return (byte) (this.a.b() ? 3 : 2);
    }

    @Override // xsna.gly0
    public final int y() {
        return 0;
    }

    @Override // xsna.gly0
    public final void x(ByteBuffer byteBuffer) {
    }

    @Override // xsna.gly0
    public final void z(ByteBuffer byteBuffer) {
    }
}
