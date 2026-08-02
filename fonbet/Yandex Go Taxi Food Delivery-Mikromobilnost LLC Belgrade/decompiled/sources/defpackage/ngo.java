package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ngo extends ies0 {
    public static mgo c(ef90 ef90Var) {
        String t = ef90Var.t();
        t.getClass();
        String t2 = ef90Var.t();
        t2.getClass();
        return new mgo(t, t2, ef90Var.s(), ef90Var.s(), Arrays.copyOfRange(ef90Var.a, ef90Var.b, ef90Var.c));
    }

    @Override // defpackage.ies0
    public final w820 b(d920 d920Var, ByteBuffer byteBuffer) {
        return new w820(c(new ef90(byteBuffer.array(), byteBuffer.limit())));
    }
}
