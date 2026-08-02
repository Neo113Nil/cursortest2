package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Objects;
import one.video.calls.sdk_private.bF;

/* compiled from: StreamsBlockedFrame.java */
/* loaded from: classes8.dex */
public final class shy0 extends ihy0 {
    public boolean b;
    public long c;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.c) + 1;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.b ? (byte) 22 : (byte) 23);
        alk.g(this.c, byteBuffer);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        Objects.toString(this);
    }

    public final String toString() {
        StringBuilder d = rqi.d(this.c, "StreamsBlockedFrame[", this.b ? "B" : "U", HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        d.append(X3.j.e);
        return d.toString();
    }
}
