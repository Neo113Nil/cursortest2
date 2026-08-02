package xsna;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: EventMessageDecoder.java */
/* loaded from: classes12.dex */
public final class h0q extends b920 {
    public static g0q q(xi90 xi90Var) {
        String x = xi90Var.x();
        x.getClass();
        String x2 = xi90Var.x();
        x2.getClass();
        return new g0q(x, x2, xi90Var.w(), xi90Var.w(), Arrays.copyOfRange(xi90Var.a, xi90Var.b, xi90Var.c));
    }

    @Override // xsna.b920
    public final fi20 k(qi20 qi20Var, ByteBuffer byteBuffer) {
        return new fi20(q(new xi90(byteBuffer.array(), byteBuffer.limit())));
    }
}
