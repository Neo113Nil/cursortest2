package xsna;

import java.nio.ByteBuffer;

/* compiled from: AmfNumber.java */
/* loaded from: classes8.dex */
public final class zv1 implements wv1 {
    public double a;

    public zv1() {
    }

    @Override // xsna.wv1
    public final void deserialize(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getDouble();
    }

    @Override // xsna.wv1
    public final int getSize() {
        return 8;
    }

    @Override // xsna.wv1
    public final byte getType() {
        return (byte) 0;
    }

    @Override // xsna.wv1
    public final void serialize(ByteBuffer byteBuffer) {
        byteBuffer.putDouble(this.a);
    }

    public final String toString() {
        return Double.toString(this.a);
    }

    public zv1(double d) {
        this.a = d;
    }
}
