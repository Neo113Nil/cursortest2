package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import one.video.calls.sdk_private.bF;

/* compiled from: PathResponseFrame.java */
/* loaded from: classes8.dex */
public final class ehy0 extends ihy0 {
    public byte[] b;

    @Override // xsna.ihy0
    public final int a() {
        return 9;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 27);
        byteBuffer.put(this.b);
    }

    public final String toString() {
        return zr.a("PathResponseFrame[", kq01.b(this.b), X3.j.e);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
    }
}
