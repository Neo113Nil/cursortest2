package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bJ;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: LongHeaderPacket.java */
/* loaded from: classes8.dex */
public abstract class gly0 extends tly0 {
    public byte[] g;

    public gly0(kgy0 kgy0Var) {
        this.a = kgy0Var;
    }

    @Override // xsna.tly0
    public final int b(int i) {
        int c = tly0.c(this.b);
        int sum = this.c.stream().mapToInt(new ely0()).sum() + i;
        return tly0.c(this.b) + y() + this.e.length + 7 + this.g.length + (sum + 1 > 63 ? 2 : 1) + sum + Integer.max(0, (4 - c) - sum) + 16;
    }

    @Override // xsna.tly0
    public final void e(byte b) throws bJ {
        if ((b & AmfConstants.TYPE_LONG_STRING_MARKER) != 0) {
            throw new bJ(ap$a.PROTOCOL_VIOLATION, "Reserved bits in long header packet are not zero");
        }
    }

    @Override // xsna.tly0
    public final void h(ByteBuffer byteBuffer, nby0 nby0Var, long j, sp spVar, int i) throws one.video.calls.sdk_private.bt, one.video.calls.sdk_private.bz, bJ {
        if (byteBuffer.position() != 0) {
            throw new IllegalStateException();
        }
        if (byteBuffer.remaining() < 10) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte b = byteBuffer.get();
        if (((b & 48) >> 4) != w()) {
            throw new RuntimeException();
        }
        if (!new kgy0(byteBuffer.getInt()).equals(this.a)) {
            throw new one.video.calls.sdk_private.bz("Version does not match version of the connection");
        }
        int i2 = byteBuffer.get();
        if (i2 < 0 || i2 > 20) {
            throw new one.video.calls.sdk_private.bz();
        }
        if (byteBuffer.remaining() < i2) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (i3 < 0 || i3 > 20) {
            throw new one.video.calls.sdk_private.bz();
        }
        if (byteBuffer.remaining() < i3) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        z(byteBuffer);
        try {
            try {
                f(byteBuffer, b, alk.j(byteBuffer), nby0Var, j);
            } finally {
                this.d = byteBuffer.position();
            }
        } catch (IllegalArgumentException | one.video.calls.sdk_private.bp | one.video.calls.sdk_private.bq unused) {
            throw new bJ(ap$a.FRAME_ENCODING_ERROR);
        }
    }

    @Override // xsna.tly0
    public final byte[] j(nby0 nby0Var) {
        ByteBuffer allocate = ByteBuffer.allocate(1500);
        byte a = tly0.a(this.b, (byte) ((w() << 4) | PsExtractor.AUDIO_STREAM));
        tly0.a(this.b, a);
        allocate.put(a);
        allocate.put(this.a.a());
        allocate.put((byte) this.e.length);
        allocate.put(this.e);
        allocate.put((byte) this.g.length);
        allocate.put(this.g);
        x(allocate);
        byte[] m = tly0.m(this.b);
        ByteBuffer k = k(m.length);
        alk.d(k.limit() + 16 + m.length, allocate);
        allocate.put(m);
        g(allocate, m.length, k, nby0Var);
        this.d = allocate.limit();
        int position = allocate.position();
        byte[] bArr = new byte[position];
        allocate.get(bArr);
        this.d = position;
        return bArr;
    }

    public String toString() {
        String str = this.f ? "P" : "";
        char charAt = n().name().charAt(0);
        long j = this.b;
        String valueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        Object valueOf2 = i >= 0 ? Integer.valueOf(i) : ".";
        int size = this.c.size();
        String str2 = (String) this.c.stream().map(new k3l(1)).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(charAt);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(valueOf);
        sb.append("|L|");
        sb.append(valueOf2);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(size);
        return i5s.a(sb, "  ", str2);
    }

    public abstract byte w();

    public abstract void x(ByteBuffer byteBuffer);

    public abstract int y();

    public abstract void z(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.bz;

    public gly0(kgy0 kgy0Var, byte[] bArr, byte[] bArr2) {
        this.a = kgy0Var;
        this.g = bArr;
        this.e = bArr2;
        this.c = new ArrayList();
    }
}
