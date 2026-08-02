package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.nio.ByteBuffer;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bC$a;
import one.video.calls.sdk_private.bF;

/* compiled from: ZeroRttPacket.java */
/* loaded from: classes8.dex */
public final class hmy0 extends gly0 {
    @Override // xsna.tly0
    public final bC$a d(bF bFVar, com.vk.movika.sdk.base.data.converter.c cVar) {
        return bC$a.b;
    }

    @Override // xsna.tly0
    public final aF n() {
        return aF.b;
    }

    @Override // xsna.tly0
    public final aG o() {
        return aG.c;
    }

    @Override // xsna.gly0
    public final String toString() {
        char charAt = aF.b.name().charAt(0);
        long j = this.b;
        String valueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        return "Packet " + charAt + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + valueOf + "|Z|" + (i >= 0 ? Integer.valueOf(i) : ".") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.c.size() + "  " + ((String) this.c.stream().map(new cmy0(0)).collect(Collectors.joining(" ")));
    }

    @Override // xsna.gly0
    public final byte w() {
        return (byte) (this.a.b() ? 2 : 1);
    }

    @Override // xsna.gly0
    public final int y() {
        return 0;
    }

    @Override // xsna.gly0
    public final void x(ByteBuffer byteBuffer) {
    }

    @Override // xsna.gly0
    public final void z(ByteBuffer byteBuffer) {
    }
}
