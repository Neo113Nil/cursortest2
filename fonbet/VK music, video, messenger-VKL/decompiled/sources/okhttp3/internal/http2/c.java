package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.a;
import xsna.an8;
import xsna.bd3;
import xsna.e0j0;
import xsna.lhg;
import xsna.uhv;
import xsna.vl8;
import xsna.wvu;
import xsna.x2r0;

/* compiled from: Http2Writer.kt */
/* loaded from: classes8.dex */
public final class c implements Closeable {
    public static final Logger g = Logger.getLogger(uhv.class.getName());
    public final an8 b;
    public final vl8 c;
    public int d;
    public boolean e;
    public final a.b f;

    public c(an8 an8Var) {
        this.b = an8Var;
        vl8 vl8Var = new vl8();
        this.c = vl8Var;
        this.d = 16384;
        this.f = new a.b(vl8Var);
    }

    public final synchronized void b(e0j0 e0j0Var) throws IOException {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            int i = this.d;
            int i2 = e0j0Var.a;
            if ((i2 & 32) != 0) {
                i = e0j0Var.b[5];
            }
            this.d = i;
            if (((i2 & 2) != 0 ? e0j0Var.b[1] : -1) != -1) {
                a.b bVar = this.f;
                int i3 = (i2 & 2) != 0 ? e0j0Var.b[1] : -1;
                bVar.getClass();
                int min = Math.min(i3, 16384);
                int i4 = bVar.d;
                if (i4 != min) {
                    if (min < i4) {
                        bVar.b = Math.min(bVar.b, min);
                    }
                    bVar.c = true;
                    bVar.d = min;
                    int i5 = bVar.h;
                    if (min < i5) {
                        if (min == 0) {
                            wvu[] wvuVarArr = bVar.e;
                            Arrays.fill(wvuVarArr, 0, wvuVarArr.length, (Object) null);
                            bVar.f = bVar.e.length - 1;
                            bVar.g = 0;
                            bVar.h = 0;
                        } else {
                            bVar.a(i5 - min);
                        }
                    }
                }
            }
            h(0, 0, 4, 1);
            this.b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z, int i, vl8 vl8Var, int i2) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        h(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.b.n1(vl8Var, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.e = true;
        this.b.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    public final void h(int i, int i2, int i3, int i4) throws IOException {
        Level level = Level.FINE;
        Logger logger = g;
        if (logger.isLoggable(level)) {
            uhv.a.getClass();
            logger.fine(uhv.a(i, i2, i3, i4, false));
        }
        if (i2 > this.d) {
            throw new IllegalArgumentException(bd3.b(": ", this.d, i2, new StringBuilder("FRAME_SIZE_ERROR length > ")).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(lhg.a(i, "reserved bit set: ").toString());
        }
        byte[] bArr = x2r0.a;
        an8 an8Var = this.b;
        an8Var.writeByte((i2 >>> 16) & 255);
        an8Var.writeByte((i2 >>> 8) & 255);
        an8Var.writeByte(i2 & 255);
        an8Var.writeByte(i3 & 255);
        an8Var.writeByte(i4 & 255);
        an8Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void i(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (errorCode.h() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        h(0, bArr.length + 8, 7, 0);
        this.b.writeInt(i);
        this.b.writeInt(errorCode.h());
        if (bArr.length != 0) {
            this.b.write(bArr);
        }
        this.b.flush();
    }

    public final synchronized void j(ArrayList arrayList, int i, boolean z) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.d(arrayList);
        long j = this.c.c;
        long min = Math.min(this.d, j);
        int i2 = j == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        h(i, (int) min, 1, i2);
        this.b.n1(this.c, min);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.d, j2);
                j2 -= min2;
                h(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.b.n1(this.c, min2);
            }
        }
    }

    public final synchronized void k(int i, int i2, boolean z) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z ? 1 : 0);
        this.b.writeInt(i);
        this.b.writeInt(i2);
        this.b.flush();
    }

    public final synchronized void m(int i, ErrorCode errorCode) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (errorCode.h() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h(i, 4, 3, 0);
        this.b.writeInt(errorCode.h());
        this.b.flush();
    }

    public final synchronized void n(int i, long j) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        h(i, 4, 8, 0);
        this.b.writeInt((int) j);
        this.b.flush();
    }
}
