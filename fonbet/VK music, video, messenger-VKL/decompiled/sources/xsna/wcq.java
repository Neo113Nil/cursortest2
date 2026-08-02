package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ExtensionProfileLevelDescriptor.java */
@x2m(tags = {19})
/* loaded from: classes13.dex */
public final class wcq extends sc6 {
    public byte[] d;

    public wcq() {
        this.a = 19;
    }

    @Override // xsna.sc6
    public final int a() {
        throw new RuntimeException("Not Implemented");
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        if (b() > 0) {
            byte[] bArr = new byte[b()];
            this.d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // xsna.sc6
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtensionDescriptor{bytes=");
        byte[] bArr = this.d;
        return ho8.a(sb, bArr == null ? "null" : skd.c(0, bArr), '}');
    }
}
