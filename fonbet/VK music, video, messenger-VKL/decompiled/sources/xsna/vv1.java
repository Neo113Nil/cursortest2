package xsna;

import java.nio.ByteBuffer;

/* compiled from: AmfBool.java */
/* loaded from: classes8.dex */
public final class vv1 implements wv1 {
    public boolean a;

    @Override // xsna.wv1
    public final void deserialize(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get() != 0;
    }

    @Override // xsna.wv1
    public final int getSize() {
        return 1;
    }

    @Override // xsna.wv1
    public final byte getType() {
        return (byte) 1;
    }

    @Override // xsna.wv1
    public final void serialize(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a ? (byte) 1 : (byte) 0);
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
