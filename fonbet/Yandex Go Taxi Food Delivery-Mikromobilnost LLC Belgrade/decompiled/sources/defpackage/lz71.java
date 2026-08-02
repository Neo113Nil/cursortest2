package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import yads.cs1;
import yads.nm0;

/* loaded from: classes7.dex */
public final class lz71 extends eo71 {
    @Override // defpackage.eo71
    public final cs1 b(u471 u471Var, ByteBuffer byteBuffer) {
        dl81 dl81Var = new dl81(byteBuffer.array(), byteBuffer.limit());
        String p = dl81Var.p();
        p.getClass();
        String p2 = dl81Var.p();
        p2.getClass();
        return new cs1(new nm0(p, p2, dl81Var.o(), dl81Var.o(), Arrays.copyOfRange(dl81Var.a, dl81Var.b, dl81Var.c)));
    }
}
