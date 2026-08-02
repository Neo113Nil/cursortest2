package xsna;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.kt */
/* loaded from: classes8.dex */
public final class dsu implements agk0 {
    public byte b;
    public final e8f0 c;
    public final Inflater d;
    public final evw e;
    public final CRC32 f;

    public dsu(agk0 agk0Var) {
        e8f0 e8f0Var = new e8f0(agk0Var);
        this.c = e8f0Var;
        Inflater inflater = new Inflater(true);
        this.d = inflater;
        this.e = new evw(e8f0Var, inflater);
        this.f = new CRC32();
    }

    public static void b(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void c(vl8 vl8Var, long j, long j2) {
        m4i0 m4i0Var = vl8Var.b;
        while (true) {
            int i = m4i0Var.c;
            int i2 = m4i0Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            m4i0Var = m4i0Var.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(m4i0Var.c - r6, j2);
            this.f.update(m4i0Var.a, (int) (m4i0Var.b + j), min);
            j2 -= min;
            m4i0Var = m4i0Var.f;
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // xsna.agk0
    public final long read(vl8 vl8Var, long j) throws IOException {
        dsu dsuVar = this;
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = dsuVar.b;
        CRC32 crc32 = dsuVar.f;
        e8f0 e8f0Var = dsuVar.c;
        if (b == 0) {
            e8f0Var.G2(10L);
            vl8 vl8Var2 = e8f0Var.c;
            byte q = vl8Var2.q(3L);
            boolean z = ((q >> 1) & 1) == 1;
            if (z) {
                dsuVar.c(e8f0Var.c, 0L, 10L);
            }
            b(8075, e8f0Var.readShort(), "ID1ID2");
            e8f0Var.skip(8L);
            if (((q >> 2) & 1) == 1) {
                e8f0Var.G2(2L);
                if (z) {
                    c(e8f0Var.c, 0L, 2L);
                }
                long Z = vl8Var2.Z() & 65535;
                e8f0Var.G2(Z);
                if (z) {
                    c(e8f0Var.c, 0L, Z);
                }
                e8f0Var.skip(Z);
            }
            if (((q >> 3) & 1) == 1) {
                long b2 = e8f0Var.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c(e8f0Var.c, 0L, b2 + 1);
                }
                e8f0Var.skip(b2 + 1);
            }
            if (((q >> 4) & 1) == 1) {
                long b3 = e8f0Var.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b3 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    dsuVar = this;
                    dsuVar.c(e8f0Var.c, 0L, b3 + 1);
                } else {
                    dsuVar = this;
                }
                e8f0Var.skip(b3 + 1);
            } else {
                dsuVar = this;
            }
            if (z) {
                b(e8f0Var.Z(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            dsuVar.b = (byte) 1;
        }
        if (dsuVar.b == 1) {
            long j2 = vl8Var.c;
            long read = dsuVar.e.read(vl8Var, j);
            if (read != -1) {
                dsuVar.c(vl8Var, j2, read);
                return read;
            }
            dsuVar.b = (byte) 2;
        }
        if (dsuVar.b == 2) {
            b(e8f0Var.o2(), (int) crc32.getValue(), "CRC");
            b(e8f0Var.o2(), (int) dsuVar.d.getBytesWritten(), "ISIZE");
            dsuVar.b = (byte) 3;
            if (!e8f0Var.W1()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // xsna.agk0
    public final mxo0 timeout() {
        return this.c.b.timeout();
    }
}
