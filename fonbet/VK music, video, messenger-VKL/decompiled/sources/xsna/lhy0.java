package xsna;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Arrays;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;

/* compiled from: RetireConnectionIdFrame.java */
/* loaded from: classes8.dex */
public final class lhy0 extends ihy0 {
    public int b;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 25);
        alk.d(this.b, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        zfy0 zfy0Var;
        Integer valueOf;
        String str;
        jey0 jey0Var = ((bE) bFVar).G;
        byte[] v = tly0Var.v();
        jey0Var.getClass();
        if (this.b > ((Integer) jey0Var.d.a.keySet().stream().max(new xlk0(1)).get()).intValue()) {
            zfy0Var = jey0Var.c;
            valueOf = Integer.valueOf(ap$a.PROTOCOL_VIOLATION.n);
            str = "invalid connection ID sequence number";
        } else {
            int i = this.b;
            if (!Arrays.equals(((gey0) jey0Var.d.a.get(Integer.valueOf(i))).b, v)) {
                if (jey0Var.d.a(i) == null || jey0Var.d.b().size() >= jey0Var.h) {
                    return;
                }
                jey0Var.a();
                return;
            }
            zfy0Var = jey0Var.c;
            valueOf = Integer.valueOf(ap$a.PROTOCOL_VIOLATION.n);
            str = "cannot retire current connection ID";
        }
        zfy0Var.accept(valueOf, str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lhy0) && ((lhy0) obj).b == this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return tgw.b(this.b, "RetireConnectionIdFrame[", X3.j.e);
    }
}
