package yads;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract class h03 {
    public final ut1 a(xt1 xt1Var) {
        ByteBuffer byteBuffer = xt1Var.d;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            throw new IllegalArgumentException();
        }
        if (xt1Var.b(Integer.MIN_VALUE)) {
            return null;
        }
        return a(xt1Var, byteBuffer);
    }

    public abstract ut1 a(xt1 xt1Var, ByteBuffer byteBuffer);
}
