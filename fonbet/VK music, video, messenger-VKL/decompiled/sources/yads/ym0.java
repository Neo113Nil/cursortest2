package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ym0 extends h03 {
    @Override // yads.h03
    public final ut1 a(xt1 xt1Var, ByteBuffer byteBuffer) {
        kc2 kc2Var = new kc2(byteBuffer.limit(), byteBuffer.array());
        String j = kc2Var.j();
        j.getClass();
        String j2 = kc2Var.j();
        j2.getClass();
        return new ut1(new xm0(j, j2, kc2Var.i(), kc2Var.i(), Arrays.copyOfRange(kc2Var.a, kc2Var.b, kc2Var.c)));
    }
}
