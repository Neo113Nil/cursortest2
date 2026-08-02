package one.video.calls.sdk_private;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import xsna.alk;
import xsna.ihy0;
import xsna.jr;
import xsna.tly0;

/* compiled from: MaxStreamDataFrame.java */
/* loaded from: classes8.dex */
public final class d extends ihy0 {
    public int b;
    public long c;

    public d(int i, long j) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.c) + alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 17);
        alk.d(this.b, byteBuffer);
        alk.g(this.c, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        try {
            bFVar.o.b(this);
        } catch (bJ e) {
            bFVar.m(e.a.n, null);
        }
    }

    public final void i(ByteBuffer byteBuffer) throws bq, bJ {
        byteBuffer.get();
        this.b = ihy0.d(byteBuffer);
        this.c = alk.l(byteBuffer);
    }

    public final String toString() {
        StringBuilder b = jr.b(this.b, "MaxStreamDataFrame[", StringUtils.PROCESS_POSTFIX_DELIMITER, this.c);
        b.append(X3.j.e);
        return b.toString();
    }
}
