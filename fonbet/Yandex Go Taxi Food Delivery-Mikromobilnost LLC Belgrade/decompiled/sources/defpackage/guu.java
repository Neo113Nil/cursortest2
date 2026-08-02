package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class guu implements y9t0 {
    public final qq6 a;
    public int b;
    public int c;
    public int w;
    public int x;
    public int y;

    public guu(qq6 qq6Var) {
        this.a = qq6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.x;
            qq6 qq6Var = this.a;
            if (i2 == 0) {
                qq6Var.skip(this.y);
                this.y = 0;
                if ((this.c & 4) == 0) {
                    i = this.w;
                    int n = yf61.n(qq6Var);
                    this.x = n;
                    this.b = n;
                    int readByte = qq6Var.readByte() & 255;
                    this.c = qq6Var.readByte() & 255;
                    Logger logger = huu.w;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = ytu.a;
                        logger.fine(ytu.b(this.w, this.b, readByte, this.c, true));
                    }
                    readInt = qq6Var.readInt() & Integer.MAX_VALUE;
                    this.w = readInt;
                    if (readByte != 9) {
                        ny61.v(b64.e(readByte, " != TYPE_CONTINUATION"));
                        return 0L;
                    }
                }
            } else {
                long read = qq6Var.read(yp6Var, Math.min(j, i2));
                if (read != -1) {
                    this.x -= (int) read;
                    return read;
                }
            }
            return -1L;
        } while (readInt == i);
        ny61.v("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.a.timeout();
    }
}
