package xsna;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: WebSocketReader.kt */
/* loaded from: classes8.dex */
public final class xhx0 implements Closeable {
    public final bn8 b;
    public final a c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public x920 n;
    public final vl8 l = new vl8();
    public final vl8 m = new vl8();
    public final byte[] o = null;

    /* compiled from: WebSocketReader.kt */
    public interface a {
        void a(ByteString byteString);

        void b(int i, String str);

        void c(ByteString byteString) throws IOException;

        void d(String str) throws IOException;

        void e();
    }

    public xhx0(bn8 bn8Var, p8f0 p8f0Var, boolean z, boolean z2) {
        this.b = bn8Var;
        this.c = p8f0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        x920 x920Var = this.n;
        if (x920Var != null) {
            x920Var.close();
        }
    }

    public final void m() throws IOException {
        short s;
        String str;
        long j = this.h;
        vl8 vl8Var = this.l;
        if (j > 0) {
            this.b.z1(vl8Var, j);
        }
        int i = this.g;
        a aVar = this.c;
        switch (i) {
            case 8:
                long j2 = vl8Var.c;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = vl8Var.readShort();
                    str = vl8Var.x();
                    String a2 = (s < 1000 || s >= 5000) ? lhg.a(s, "Code must be in range [1000,5000): ") : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : tgw.b(s, "Code ", " is reserved and may not be used.");
                    if (a2 != null) {
                        throw new ProtocolException(a2);
                    }
                } else {
                    s = 1005;
                    str = "";
                }
                aVar.b(s, str);
                this.f = true;
                return;
            case 9:
                aVar.a(vl8Var.F0(vl8Var.c));
                return;
            case 10:
                vl8Var.F0(vl8Var.c);
                aVar.e();
                return;
            default:
                int i2 = this.g;
                byte[] bArr = x2r0.a;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i2)));
        }
    }

    public final void n() throws IOException, ProtocolException {
        boolean z;
        if (this.f) {
            throw new IOException("closed");
        }
        bn8 bn8Var = this.b;
        long h = bn8Var.timeout().h();
        bn8Var.timeout().b();
        try {
            byte readByte = bn8Var.readByte();
            byte[] bArr = x2r0.a;
            bn8Var.timeout().g(h, TimeUnit.NANOSECONDS);
            int i = readByte & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
            this.g = i;
            boolean z2 = (readByte & 128) != 0;
            this.i = z2;
            boolean z3 = (readByte & 8) != 0;
            this.j = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (readByte & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.k = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & AmfConstants.TYPE_TYPED_OBJECT_MARKER) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = bn8Var.readByte();
            boolean z5 = (readByte2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.h = j;
            if (j == 126) {
                this.h = bn8Var.readShort() & 65535;
            } else if (j == 127) {
                long readLong = bn8Var.readLong();
                this.h = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.j && this.h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                bn8Var.readFully(this.o);
            }
        } catch (Throwable th) {
            bn8Var.timeout().g(h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
