package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SLConfigDescriptor.java */
@x2m(tags = {6})
/* loaded from: classes13.dex */
public final class cyg0 extends sc6 {
    public int d;

    public cyg0() {
        this.a = 6;
    }

    @Override // xsna.sc6
    public final int a() {
        return 1;
    }

    @Override // xsna.sc6
    public final void d(ByteBuffer byteBuffer) throws IOException {
        this.d = crx0.e(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cyg0.class == obj.getClass() && this.d == ((cyg0) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // xsna.sc6
    public final String toString() {
        return vu5.b(new StringBuilder("SLConfigDescriptor{predefined="), this.d, '}');
    }
}
