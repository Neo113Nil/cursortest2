package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Objects;
import one.video.calls.sdk_private.bF;

/* compiled from: DataBlockedFrame.java */
/* loaded from: classes8.dex */
public final class acy0 extends ihy0 {
    public long b;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 20);
        alk.g(this.b, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        Objects.toString(this);
    }

    public final String toString() {
        return qlb0.a(this.b, "DataBlockedFrame[", X3.j.e);
    }
}
