package xsna;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import one.video.player.live.proto.rtmp.ProtocolException;

/* compiled from: RtmpClient.java */
/* loaded from: classes8.dex */
public final class cqg0 extends lcc {
    public final /* synthetic */ aqg0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqg0(aqg0 aqg0Var, int i, AtomicLong atomicLong) {
        super(i, atomicLong);
        this.j = aqg0Var;
    }

    @Override // xsna.lcc
    public final void a(byte b, int i, int i2, int i3, ByteBuffer byteBuffer) throws ProtocolException {
        this.j.r(i, i2, i3, b, byteBuffer);
    }
}
