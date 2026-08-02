package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ProfileLevelIndicationDescriptor.java */
@x2m(tags = {20})
/* loaded from: classes13.dex */
public final class dyd0 extends sc6 {
    public int d;

    public dyd0() {
        this.a = 20;
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
        return obj != null && dyd0.class == obj.getClass() && this.d == ((dyd0) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // xsna.sc6
    public final String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.d) + '}';
    }
}
