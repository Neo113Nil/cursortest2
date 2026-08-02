package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* compiled from: UnknownDescriptor.java */
/* loaded from: classes13.dex */
public final class l4q0 extends sc6 {
    public ByteBuffer d;

    static {
        Logger.getLogger(l4q0.class.getName());
    }

    @Override // xsna.sc6
    public final int a() {
        throw new RuntimeException("sdjlhfl");
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        this.d = byteBuffer.slice();
    }

    @Override // xsna.sc6
    public final String toString() {
        return "UnknownDescriptor{tag=" + this.a + ", sizeOfInstance=" + this.b + ", data=" + this.d + '}';
    }
}
