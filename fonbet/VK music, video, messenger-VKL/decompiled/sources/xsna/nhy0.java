package xsna;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bJ;

/* compiled from: StopSendingFrame.java */
/* loaded from: classes8.dex */
public final class nhy0 extends ihy0 {
    public int b;
    public long c;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.c) + alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 5);
        alk.d(this.b, byteBuffer);
        alk.g(this.c, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        zjy0 zjy0Var = (zjy0) bFVar.t().a.get(Integer.valueOf(this.b));
        if (zjy0Var != null) {
            zjy0Var.b(this.c);
        }
    }

    public final void i(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq, bJ {
        byteBuffer.get();
        this.b = ihy0.d(byteBuffer);
        this.c = alk.l(byteBuffer);
    }

    public final String toString() {
        StringBuilder b = jr.b(this.b, "StopSendingFrame[", StringUtils.PROCESS_POSTFIX_DELIMITER, this.c);
        b.append(X3.j.e);
        return b.toString();
    }
}
