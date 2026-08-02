package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bC$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bJ;

/* compiled from: ShortHeaderPacket.java */
/* loaded from: classes8.dex */
public final class xly0 extends tly0 {
    public short g;

    @Override // xsna.tly0
    public final int b(int i) {
        int c = tly0.c(this.b);
        int sum = this.c.stream().mapToInt(new wly0()).sum() + i;
        int max = Integer.max(0, (4 - c) - sum);
        int length = this.e.length + 1;
        if (this.b < 0) {
            c = 4;
        }
        return length + c + sum + max + 16;
    }

    @Override // xsna.tly0
    public final bC$a d(bF bFVar, com.vk.movika.sdk.base.data.converter.c cVar) {
        boolean z;
        bE bEVar = (bE) bFVar;
        jey0 jey0Var = bEVar.G;
        byte[] bArr = this.e;
        lby0 lby0Var = jey0Var.d;
        if (Arrays.equals(lby0Var.b, bArr)) {
            z = false;
        } else {
            lby0Var.a.values().stream().filter(new s620(lby0Var, 3)).forEach(new iby0(0));
            lby0Var.b = bArr;
            z = lby0Var.a.values().stream().filter(new yqp(lby0Var, 1)).anyMatch(new i0y0(1));
            lby0Var.a.values().stream().filter(new jby0(lby0Var, 0)).forEach(new kby0());
            kq01.b(lby0Var.b);
        }
        if (z && jey0Var.d.b().size() < jey0Var.h) {
            jey0Var.a();
        }
        bEVar.k(this, cVar);
        return bC$a.a;
    }

    @Override // xsna.tly0
    public final void e(byte b) throws bJ {
        if ((b & 24) != 0) {
            throw new bJ(ap$a.PROTOCOL_VIOLATION, "Reserved bits in short header packet are not zero");
        }
    }

    @Override // xsna.tly0
    public final void h(ByteBuffer byteBuffer, nby0 nby0Var, long j, sp spVar, int i) throws one.video.calls.sdk_private.bt, one.video.calls.sdk_private.bz, bJ {
        xly0 xly0Var;
        ByteBuffer byteBuffer2;
        nby0 nby0Var2;
        if (byteBuffer.remaining() < i + 1) {
            throw new one.video.calls.sdk_private.bz();
        }
        if (byteBuffer.position() != 0) {
            throw new IllegalStateException();
        }
        byte b = byteBuffer.get();
        if ((b & 192) != 64) {
            throw new RuntimeException();
        }
        byte[] bArr = new byte[i];
        this.e = bArr;
        byteBuffer.get(bArr);
        try {
            xly0Var = this;
            byteBuffer2 = byteBuffer;
            nby0Var2 = nby0Var;
            try {
                try {
                    xly0Var.f(byteBuffer2, b, byteBuffer.limit() - byteBuffer.position(), nby0Var2, j);
                    ((qby0) nby0Var2).g();
                    xly0Var.d = byteBuffer2.position();
                } catch (one.video.calls.sdk_private.bt e) {
                    e = e;
                    one.video.calls.sdk_private.bt btVar = e;
                    qby0 qby0Var = (qby0) nby0Var2;
                    synchronized (qby0Var) {
                        if (qby0Var.o) {
                            qby0Var.d = null;
                            qby0Var.o = false;
                            qby0Var.f = null;
                            qby0Var.h = null;
                        }
                    }
                    throw btVar;
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                xly0Var.d = byteBuffer2.position();
                throw th2;
            }
        } catch (one.video.calls.sdk_private.bt e2) {
            e = e2;
            xly0Var = this;
            byteBuffer2 = byteBuffer;
            nby0Var2 = nby0Var;
        } catch (Throwable th3) {
            th = th3;
            xly0Var = this;
            byteBuffer2 = byteBuffer;
            Throwable th22 = th;
            xly0Var.d = byteBuffer2.position();
            throw th22;
        }
    }

    @Override // xsna.tly0
    public final byte[] j(nby0 nby0Var) {
        ByteBuffer allocate = ByteBuffer.allocate(1500);
        short s = (short) (((qby0) nby0Var).n % 2);
        this.g = s;
        allocate.put(tly0.a(this.b, (byte) ((s << 2) | 64)));
        allocate.put(this.e);
        byte[] m = tly0.m(this.b);
        allocate.put(m);
        g(allocate, m.length, k(m.length), nby0Var);
        int limit = allocate.limit();
        this.d = limit;
        byte[] bArr = new byte[limit];
        allocate.get(bArr);
        this.d = limit;
        return bArr;
    }

    @Override // xsna.tly0
    public final void l(byte b) {
        this.g = (short) ((b & 4) >> 2);
    }

    @Override // xsna.tly0
    public final aF n() {
        return aF.d;
    }

    @Override // xsna.tly0
    public final aG o() {
        return aG.c;
    }

    public final String toString() {
        String str = this.f ? "P" : "";
        char charAt = aF.d.name().charAt(0);
        long j = this.b;
        String valueOf = j >= 0 ? Long.valueOf(j) : ".";
        short s = this.g;
        String b = kq01.b(this.e);
        int i = this.d;
        int size = this.c.size();
        String str2 = (String) this.c.stream().map(new vly0()).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(charAt);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(valueOf);
        sb.append("|S");
        sb.append((int) s);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(b);
        dgn.a(i, size, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, sb);
        return i5s.a(sb, "  ", str2);
    }

    @Override // xsna.tly0
    public final byte[] v() {
        return this.e;
    }
}
