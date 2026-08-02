package xsna;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import one.video.calls.sdk_private.bF;

/* compiled from: MaxStreamsFrame.java */
/* loaded from: classes8.dex */
public final class ecy0 extends ihy0 {
    public long b;
    public boolean c;

    public ecy0(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.c ? 18 : 19));
        alk.g(this.b, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        int longValue;
        Semaphore semaphore;
        mky0 t = bFVar.t();
        t.getClass();
        if (this.c) {
            if (this.b <= t.k.longValue()) {
                return;
            }
            longValue = (int) (this.b - t.k.longValue());
            t.k = Long.valueOf(this.b);
            semaphore = t.m;
        } else {
            if (this.b <= t.l.longValue()) {
                return;
            }
            longValue = (int) (this.b - t.l.longValue());
            t.l = Long.valueOf(this.b);
            semaphore = t.n;
        }
        semaphore.release(longValue);
    }

    public final String toString() {
        StringBuilder d = rqi.d(this.b, "MaxStreamsFrame[", this.c ? "B" : "U", StringUtils.COMMA);
        d.append(X3.j.e);
        return d.toString();
    }

    public ecy0() {
    }
}
