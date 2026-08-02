package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.a;
import okio.ByteString;
import xsna.agk0;
import xsna.bn8;
import xsna.e0j0;
import xsna.e8f0;
import xsna.efz;
import xsna.fiv;
import xsna.i5s;
import xsna.i9x;
import xsna.j5g;
import xsna.jw5;
import xsna.l6g;
import xsna.lhg;
import xsna.mxo0;
import xsna.s3q0;
import xsna.swe0;
import xsna.tgw;
import xsna.uhv;
import xsna.vhv;
import xsna.vl8;
import xsna.wvu;
import xsna.x2r0;
import xsna.yhv;

/* compiled from: Http2Reader.kt */
/* loaded from: classes8.dex */
public final class b implements Closeable {
    public static final Logger e = Logger.getLogger(uhv.class.getName());
    public final bn8 b;
    public final C2167b c;
    public final a.C2166a d;

    /* compiled from: Http2Reader.kt */
    public static final class a {
        public static int a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(efz.a(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }
    }

    public b(bn8 bn8Var) {
        this.b = bn8Var;
        C2167b c2167b = new C2167b(bn8Var);
        this.c = c2167b;
        this.d = new a.C2166a(c2167b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x021d, code lost:
    
        throw new java.io.IOException(xsna.lhg.a(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(boolean z, vhv.d dVar) throws IOException {
        ErrorCode errorCode;
        ErrorCode errorCode2;
        Object[] array;
        bn8 bn8Var = this.b;
        int i = 0;
        try {
            bn8Var.G2(9L);
            int s = x2r0.s(bn8Var);
            if (s > 16384) {
                throw new IOException(lhg.a(s, "FRAME_SIZE_ERROR: "));
            }
            int readByte = bn8Var.readByte() & 255;
            byte readByte2 = bn8Var.readByte();
            int i2 = readByte2 & 255;
            int readInt = bn8Var.readInt() & Integer.MAX_VALUE;
            Logger logger = e;
            if (logger.isLoggable(Level.FINE)) {
                uhv.a.getClass();
                logger.fine(uhv.a(readInt, s, readByte, i2, true));
            }
            if (z && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                uhv.a.getClass();
                String[] strArr = uhv.c;
                sb.append(readByte < strArr.length ? strArr[readByte] : x2r0.h("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            switch (readByte) {
                case 0:
                    if (readInt == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z2 = (readByte2 & 1) != 0;
                    if ((readByte2 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int readByte3 = (readByte2 & 8) != 0 ? bn8Var.readByte() & 255 : 0;
                    dVar.a(z2, readInt, bn8Var, a.a(s, i2, readByte3));
                    bn8Var.skip(readByte3);
                    return true;
                case 1:
                    if (readInt == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (readByte2 & 1) != 0;
                    int readByte4 = (readByte2 & 8) != 0 ? bn8Var.readByte() & 255 : 0;
                    if ((readByte2 & 32) != 0) {
                        h(dVar, readInt);
                        s -= 5;
                    }
                    dVar.c(readInt, c(a.a(s, i2, readByte4), readByte4, i2, readInt), z3);
                    return true;
                case 2:
                    if (s != 5) {
                        throw new IOException(tgw.b(s, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (readInt == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    h(dVar, readInt);
                    return true;
                case 3:
                    if (s != 4) {
                        throw new IOException(tgw.b(s, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (readInt == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = bn8Var.readInt();
                    ErrorCode.Companion.getClass();
                    ErrorCode[] values = ErrorCode.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            ErrorCode errorCode3 = values[i];
                            if (errorCode3.h() == readInt2) {
                                errorCode = errorCode3;
                            } else {
                                i++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(lhg.a(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    dVar.g(readInt, errorCode);
                    return true;
                case 4:
                    if (readInt != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (s != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (s % 6 != 0) {
                        throw new IOException(lhg.a(s, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    e0j0 e0j0Var = new e0j0();
                    i9x p = swe0.p(6, swe0.q(0, s));
                    int i3 = p.b;
                    int i4 = p.c;
                    int i5 = p.d;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            short readShort = bn8Var.readShort();
                            byte[] bArr = x2r0.a;
                            int i6 = readShort & 65535;
                            int readInt3 = bn8Var.readInt();
                            if (i6 != 2) {
                                if (i6 == 3) {
                                    i6 = 4;
                                } else if (i6 == 4) {
                                    if (readInt3 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i6 = 7;
                                } else if (i6 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            e0j0Var.c(i6, readInt3);
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                    vhv vhvVar = vhv.this;
                    vhvVar.i.c(new yhv(i5s.a(new StringBuilder(), vhvVar.d, " applyAndAckSettings"), dVar, e0j0Var), 0L);
                    return true;
                case 5:
                    if (readInt == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int readByte5 = (readByte2 & 8) != 0 ? bn8Var.readByte() & 255 : 0;
                    dVar.e(bn8Var.readInt() & Integer.MAX_VALUE, c(a.a(s - 4, i2, readByte5), readByte5, i2, readInt));
                    return true;
                case 6:
                    if (s != 8) {
                        throw new IOException(lhg.a(s, "TYPE_PING length != 8: "));
                    }
                    if (readInt != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    dVar.d(bn8Var.readInt(), bn8Var.readInt(), (readByte2 & 1) != 0);
                    return true;
                case 7:
                    if (s < 8) {
                        throw new IOException(lhg.a(s, "TYPE_GOAWAY length < 8: "));
                    }
                    if (readInt != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt4 = bn8Var.readInt();
                    int readInt5 = bn8Var.readInt();
                    int i7 = s - 8;
                    ErrorCode.Companion.getClass();
                    ErrorCode[] values2 = ErrorCode.values();
                    int length2 = values2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length2) {
                            ErrorCode errorCode4 = values2[i8];
                            if (errorCode4.h() == readInt5) {
                                errorCode2 = errorCode4;
                            } else {
                                i8++;
                            }
                        } else {
                            errorCode2 = null;
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(lhg.a(readInt5, "TYPE_GOAWAY unexpected error code: "));
                    }
                    ByteString byteString = ByteString.d;
                    if (i7 > 0) {
                        byteString = bn8Var.F0(i7);
                    }
                    byteString.n();
                    vhv vhvVar2 = vhv.this;
                    synchronized (vhvVar2) {
                        array = vhvVar2.c.values().toArray(new fiv[0]);
                        vhvVar2.g = true;
                        s3q0 s3q0Var = s3q0.a;
                    }
                    for (fiv fivVar : (fiv[]) array) {
                        if (fivVar.a > readInt4 && fivVar.g()) {
                            ErrorCode errorCode5 = ErrorCode.REFUSED_STREAM;
                            synchronized (fivVar) {
                                if (fivVar.m == null) {
                                    fivVar.m = errorCode5;
                                    fivVar.notifyAll();
                                }
                            }
                            vhv.this.j(fivVar.a);
                        }
                    }
                    return true;
                case 8:
                    if (s != 4) {
                        throw new IOException(lhg.a(s, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long readInt6 = bn8Var.readInt() & 2147483647L;
                    if (readInt6 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (readInt == 0) {
                        vhv vhvVar3 = vhv.this;
                        synchronized (vhvVar3) {
                            vhvVar3.w += readInt6;
                            vhvVar3.notifyAll();
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        return true;
                    }
                    fiv h = vhv.this.h(readInt);
                    if (h != null) {
                        synchronized (h) {
                            h.f += readInt6;
                            if (readInt6 > 0) {
                                h.notifyAll();
                            }
                            s3q0 s3q0Var3 = s3q0.a;
                        }
                        return true;
                    }
                    return true;
                default:
                    bn8Var.skip(s);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final List<wvu> c(int i, int i2, int i3, int i4) throws IOException {
        C2167b c2167b = this.c;
        c2167b.f = i;
        c2167b.c = i;
        c2167b.g = i2;
        c2167b.d = i3;
        c2167b.e = i4;
        a.C2166a c2166a = this.d;
        e8f0 e8f0Var = c2166a.c;
        ArrayList arrayList = c2166a.b;
        while (!e8f0Var.W1()) {
            byte readByte = e8f0Var.readByte();
            byte[] bArr = x2r0.a;
            int i5 = readByte & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e2 = c2166a.e(i5, 127);
                int i6 = e2 - 1;
                if (i6 >= 0) {
                    wvu[] wvuVarArr = okhttp3.internal.http2.a.a;
                    if (i6 <= wvuVarArr.length - 1) {
                        arrayList.add(wvuVarArr[i6]);
                    }
                }
                int length = c2166a.e + 1 + (i6 - okhttp3.internal.http2.a.a.length);
                if (length >= 0) {
                    wvu[] wvuVarArr2 = c2166a.d;
                    if (length < wvuVarArr2.length) {
                        arrayList.add(wvuVarArr2[length]);
                    }
                }
                throw new IOException(lhg.a(e2, "Header index too large "));
            }
            if (i5 == 64) {
                wvu[] wvuVarArr3 = okhttp3.internal.http2.a.a;
                ByteString d = c2166a.d();
                okhttp3.internal.http2.a.a(d);
                c2166a.c(new wvu(d, c2166a.d()));
            } else if ((readByte & 64) == 64) {
                c2166a.c(new wvu(c2166a.b(c2166a.e(i5, 63) - 1), c2166a.d()));
            } else if ((readByte & 32) == 32) {
                int e3 = c2166a.e(i5, 31);
                c2166a.a = e3;
                if (e3 < 0 || e3 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c2166a.a);
                }
                int i7 = c2166a.g;
                if (e3 < i7) {
                    if (e3 == 0) {
                        jw5.p(null, c2166a.d);
                        c2166a.e = c2166a.d.length - 1;
                        c2166a.f = 0;
                        c2166a.g = 0;
                    } else {
                        c2166a.a(i7 - e3);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                wvu[] wvuVarArr4 = okhttp3.internal.http2.a.a;
                ByteString d2 = c2166a.d();
                okhttp3.internal.http2.a.a(d2);
                arrayList.add(new wvu(d2, c2166a.d()));
            } else {
                arrayList.add(new wvu(c2166a.b(c2166a.e(i5, 15) - 1), c2166a.d()));
            }
        }
        List<wvu> O0 = j5g.O0(arrayList);
        arrayList.clear();
        return O0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    public final void h(vhv.d dVar, int i) throws IOException {
        bn8 bn8Var = this.b;
        bn8Var.readInt();
        bn8Var.readByte();
        byte[] bArr = x2r0.a;
    }

    /* compiled from: Http2Reader.kt */
    /* renamed from: okhttp3.internal.http2.b$b, reason: collision with other inner class name */
    public static final class C2167b implements agk0 {
        public final bn8 b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public C2167b(bn8 bn8Var) {
            this.b = bn8Var;
        }

        @Override // xsna.agk0
        public final long read(vl8 vl8Var, long j) throws IOException {
            int i;
            int readInt;
            do {
                int i2 = this.f;
                bn8 bn8Var = this.b;
                if (i2 == 0) {
                    bn8Var.skip(this.g);
                    this.g = 0;
                    if ((this.d & 4) == 0) {
                        i = this.e;
                        int s = x2r0.s(bn8Var);
                        this.f = s;
                        this.c = s;
                        int readByte = bn8Var.readByte() & 255;
                        this.d = bn8Var.readByte() & 255;
                        Logger logger = b.e;
                        if (logger.isLoggable(Level.FINE)) {
                            uhv uhvVar = uhv.a;
                            int i3 = this.e;
                            int i4 = this.c;
                            int i5 = this.d;
                            uhvVar.getClass();
                            logger.fine(uhv.a(i3, i4, readByte, i5, true));
                        }
                        readInt = bn8Var.readInt() & Integer.MAX_VALUE;
                        this.e = readInt;
                        if (readByte != 9) {
                            throw new IOException(l6g.a(readByte, " != TYPE_CONTINUATION"));
                        }
                    }
                } else {
                    long read = bn8Var.read(vl8Var, Math.min(j, i2));
                    if (read != -1) {
                        this.f -= (int) read;
                        return read;
                    }
                }
                return -1L;
            } while (readInt == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // xsna.agk0
        public final mxo0 timeout() {
            return this.b.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
