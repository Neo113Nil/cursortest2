package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract class ies0 implements a920 {
    public final w820 a(d920 d920Var) {
        ByteBuffer byteBuffer = d920Var.w;
        byteBuffer.getClass();
        d6z.l(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(d920Var, byteBuffer);
    }

    public abstract w820 b(d920 d920Var, ByteBuffer byteBuffer);
}
