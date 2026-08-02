package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class muu implements Closeable {
    public static final Logger y = Logger.getLogger(ytu.class.getName());
    public final oq6 a;
    public final yp6 b;
    public int c;
    public boolean w;
    public final ptu x;

    public muu(oq6 oq6Var) {
        this.a = oq6Var;
        yp6 yp6Var = new yp6();
        this.b = yp6Var;
        this.c = 16384;
        this.x = new ptu(yp6Var);
    }

    public final void a(l6r0 l6r0Var) {
        synchronized (this) {
            try {
                if (this.w) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = l6r0Var.a;
                if ((i2 & 32) != 0) {
                    i = l6r0Var.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? l6r0Var.b[1] : -1) != -1) {
                    ptu ptuVar = this.x;
                    int i3 = (i2 & 2) != 0 ? l6r0Var.b[1] : -1;
                    ptuVar.getClass();
                    int min = Math.min(i3, 16384);
                    int i4 = ptuVar.d;
                    if (i4 != min) {
                        if (min < i4) {
                            ptuVar.b = Math.min(ptuVar.b, min);
                        }
                        ptuVar.c = true;
                        ptuVar.d = min;
                        int i5 = ptuVar.h;
                        if (min < i5) {
                            if (min == 0) {
                                y8u[] y8uVarArr = ptuVar.e;
                                Arrays.fill(y8uVarArr, 0, y8uVarArr.length, (Object) null);
                                ptuVar.f = ptuVar.e.length - 1;
                                ptuVar.g = 0;
                                ptuVar.h = 0;
                            } else {
                                ptuVar.a(i5 - min);
                            }
                        }
                    }
                }
                d(0, 0, 4, 1);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z, int i, yp6 yp6Var, int i2) {
        synchronized (this) {
            if (this.w) {
                throw new IOException("closed");
            }
            d(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.a.write(yp6Var, i2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.w = true;
            this.a.close();
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = y;
            if (logger.isLoggable(level)) {
                logger.fine(ytu.b(i, i2, i3, i4, false));
            }
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + Extension.COLON_SPACE + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            w511.f(oyr.i(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = yf61.a;
        oq6 oq6Var = this.a;
        oq6Var.writeByte((i2 >>> 16) & 255);
        oq6Var.writeByte((i2 >>> 8) & 255);
        oq6Var.writeByte(i2 & 255);
        oq6Var.writeByte(i3 & 255);
        oq6Var.writeByte(i4 & 255);
        oq6Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final void e(int i, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            if (this.w) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            d(0, bArr.length + 8, 7, 0);
            this.a.writeInt(i);
            this.a.writeInt(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.w) {
                throw new IOException("closed");
            }
            this.a.flush();
        }
    }

    public final void k(int i, ArrayList arrayList, boolean z) {
        synchronized (this) {
            if (this.w) {
                throw new IOException("closed");
            }
            this.x.d(arrayList);
            long j = this.b.b;
            long min = Math.min(this.c, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            d(i, (int) min, 1, i2);
            this.a.write(this.b, min);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.c, j2);
                    j2 -= min2;
                    d(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.a.write(this.b, min2);
                }
            }
        }
    }

    public final void n(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.w) {
                throw new IOException("closed");
            }
            d(0, 8, 6, z ? 1 : 0);
            this.a.writeInt(i);
            this.a.writeInt(i2);
            this.a.flush();
        }
    }

    public final void o(int i, ErrorCode errorCode) {
        synchronized (this) {
            if (this.w) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            d(i, 4, 3, 0);
            this.a.writeInt(errorCode.getHttpCode());
            this.a.flush();
        }
    }

    public final void v(int i, long j) {
        synchronized (this) {
            try {
                if (this.w) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(ytu.c(i, 4, j, false));
                }
                d(i, 4, 8, 0);
                this.a.writeInt((int) j);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
