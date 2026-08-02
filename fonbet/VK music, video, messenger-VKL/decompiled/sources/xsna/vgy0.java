package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;

/* compiled from: NewTokenFrame.java */
/* loaded from: classes8.dex */
public final class vgy0 extends ihy0 {
    public byte[] b;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.b.length) + 1 + this.b.length;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 7);
        alk.d(this.b.length, byteBuffer);
        byteBuffer.put(this.b);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        bE bEVar = (bE) bFVar;
        if (this.b.length == 0) {
            bEVar.e(ap$a.FRAME_ENCODING_ERROR.n, bF.d.a, "empty token in NEW_TOKEN frame");
        }
    }

    public final String toString() {
        return zr.a("NewTokenFrame[", kq01.b(this.b), X3.j.e);
    }
}
