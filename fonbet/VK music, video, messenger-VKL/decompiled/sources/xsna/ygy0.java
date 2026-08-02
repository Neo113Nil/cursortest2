package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import one.video.calls.sdk_private.bF;

/* compiled from: PathChallengeFrame.java */
/* loaded from: classes8.dex */
public final class ygy0 extends ihy0 {
    public byte[] b;

    @Override // xsna.ihy0
    public final int a() {
        return 9;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 26);
        byteBuffer.put(this.b);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        kgy0 kgy0Var = bFVar.a.a;
        byte[] bArr = this.b;
        ehy0 ehy0Var = new ehy0();
        if (bArr.length != 8) {
            throw new IllegalArgumentException("Path Response Frame must contain 8 bytes data");
        }
        ehy0Var.b = bArr;
        bFVar.j(ehy0Var, new iby0(1), false);
    }

    public final String toString() {
        return zr.a("PathChallengeFrame[", kq01.b(this.b), X3.j.e);
    }
}
