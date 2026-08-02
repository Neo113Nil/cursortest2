package defpackage;

import java.nio.ByteBuffer;
import yads.cs1;

/* loaded from: classes7.dex */
public abstract class eo71 {
    public final cs1 a(u471 u471Var) {
        ByteBuffer byteBuffer = u471Var.c;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            w511.q();
            return null;
        }
        if (u471Var.c(Integer.MIN_VALUE)) {
            return null;
        }
        return b(u471Var, byteBuffer);
    }

    public abstract cs1 b(u471 u471Var, ByteBuffer byteBuffer);
}
