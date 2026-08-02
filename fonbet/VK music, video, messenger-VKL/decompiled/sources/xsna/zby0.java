package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.al;
import one.video.calls.sdk_private.bF;

/* compiled from: ConnectionCloseFrame.java */
/* loaded from: classes8.dex */
public final class zby0 extends ihy0 {
    public long c;
    public byte[] d = new byte[0];
    public int e = -1;
    public int f = 28;
    public long b = 0;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.d.length) + alk.e(this.b) + 1 + (this.f == 28 ? alk.e(0L) : 0) + this.d.length;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        if (this.f != 28) {
            byteBuffer.put((byte) 29);
            alk.g(this.b, byteBuffer);
            alk.d(this.d.length, byteBuffer);
            byteBuffer.put(this.d);
            return;
        }
        byteBuffer.put((byte) 28);
        alk.g(this.b, byteBuffer);
        alk.d(0, byteBuffer);
        alk.d(this.d.length, byteBuffer);
        byteBuffer.put(this.d);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        aF n = tly0Var.n();
        if (bFVar.p.h()) {
            return;
        }
        bFVar.h(new one.video.calls.sdk_private.al(al.a.b, true, i() ? Long.valueOf(this.b) : null, g() ? Long.valueOf(this.b) : null));
        if (i() || g()) {
            bFVar.i(this);
        }
        bFVar.r().g();
        bFVar.t().f();
        kgy0 kgy0Var = bFVar.a.a;
        bFVar.r().f(new zby0(), n, hjy0.a);
        bFVar.p = bF.f.e;
        try {
            bFVar.s.schedule(new r44(bFVar, 22), bFVar.r().i() * 3, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
        }
    }

    public final boolean g() {
        return this.f == 29 && this.b != 0;
    }

    @Override // xsna.ihy0
    public final boolean h() {
        return false;
    }

    public final boolean i() {
        return this.f == 28 && this.b != 0;
    }

    public final String toString() {
        int i = this.e;
        Object a = i != -1 ? lhg.a(i, "TLS ") : Long.valueOf(this.b);
        long j = this.c;
        byte[] bArr = this.d;
        String str = bArr != null ? new String(bArr) : "-";
        StringBuilder sb = new StringBuilder("ConnectionCloseFrame[");
        sb.append(a);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(j);
        return tdj.a(sb, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str, X3.j.e);
    }
}
