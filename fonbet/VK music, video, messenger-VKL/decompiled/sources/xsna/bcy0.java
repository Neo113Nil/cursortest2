package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bF;

/* compiled from: DatagramFrame.java */
/* loaded from: classes8.dex */
public final class bcy0 extends ihy0 {
    public byte[] b;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.b.length) + 1 + this.b.length;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 49);
        alk.d(this.b.length, byteBuffer);
        byteBuffer.put(this.b);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        if (bFVar.u == bF.c.c || bFVar.u == bF.c.d) {
            return;
        }
        bFVar.m(ap$a.PROTOCOL_VIOLATION.n, "Datagram frame received, but datagram extension is not enabled");
    }

    public final String toString() {
        return zr.a("DatagramFrame [", kq01.b(this.b), X3.j.e);
    }
}
