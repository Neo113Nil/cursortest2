package one.video.calls.sdk_private;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.alk;
import xsna.e630;
import xsna.ihy0;
import xsna.jr;
import xsna.mky0;
import xsna.tly0;
import xsna.zjy0;

/* compiled from: ResetStreamFrame.java */
/* loaded from: classes8.dex */
public final class v extends ihy0 {
    public int b;
    public long c;
    public long d;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.d) + alk.e(this.c) + alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 4);
        alk.d(this.b, byteBuffer);
        alk.g(this.c, byteBuffer);
        alk.g(this.d, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        try {
            mky0 t = bFVar.t();
            zjy0 zjy0Var = (zjy0) t.a.get(Integer.valueOf(this.b));
            if (zjy0Var != null) {
                t.z += zjy0Var.f.i(this.d);
            }
        } catch (bJ e) {
            bFVar.m(e.a.n, null);
        }
    }

    public final void i(ByteBuffer byteBuffer) throws bq, bJ {
        byteBuffer.get();
        this.b = ihy0.d(byteBuffer);
        this.c = alk.l(byteBuffer);
        this.d = alk.l(byteBuffer);
    }

    public final String toString() {
        int i = this.b;
        long j = this.c;
        return e630.c(jr.b(i, "ResetStreamFrame[", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, j), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, this.d, X3.j.e);
    }
}
