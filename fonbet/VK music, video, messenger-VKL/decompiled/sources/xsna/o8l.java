package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: DecoderSpecificInfo.java */
@x2m(tags = {5})
/* loaded from: classes13.dex */
public final class o8l extends sc6 {
    public byte[] d;

    public o8l() {
        this.a = 5;
    }

    @Override // xsna.sc6
    public final int a() {
        return this.d.length;
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.d = bArr;
        byteBuffer.get(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o8l.class == obj.getClass() && Arrays.equals(this.d, ((o8l) obj).d);
    }

    public final int hashCode() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // xsna.sc6
    public final String toString() {
        StringBuilder sb = new StringBuilder("DecoderSpecificInfo{bytes=");
        byte[] bArr = this.d;
        return ho8.a(sb, bArr == null ? "null" : skd.c(0, bArr), '}');
    }
}
