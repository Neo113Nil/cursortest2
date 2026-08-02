package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Objects;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bJ;

/* compiled from: StreamDataBlockedFrame.java */
/* loaded from: classes8.dex */
public final class phy0 extends ihy0 {
    public int b;
    public long c;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.c) + alk.e(this.b) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 21);
        alk.d(this.b, byteBuffer);
        alk.g(this.c, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        Objects.toString(this);
    }

    public final void i(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bq, bJ {
        byteBuffer.get();
        this.b = ihy0.d(byteBuffer);
        this.c = alk.l(byteBuffer);
    }

    public final String toString() {
        StringBuilder b = jr.b(this.b, "StreamDataBlockedFrame[", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, this.c);
        b.append(X3.j.e);
        return b.toString();
    }
}
