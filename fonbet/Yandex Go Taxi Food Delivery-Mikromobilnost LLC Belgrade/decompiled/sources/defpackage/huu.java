package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes9.dex */
public final class huu implements Closeable {
    public static final Logger w = Logger.getLogger(ytu.class.getName());
    public final qq6 a;
    public final guu b;
    public final otu c;

    public huu(qq6 qq6Var) {
        this.a = qq6Var;
        guu guuVar = new guu(qq6Var);
        this.b = guuVar;
        this.c = new otu(guuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x023a, code lost:
    
        defpackage.ny61.v(defpackage.oyr.i(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0243, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(boolean z, duu duuVar) {
        int n;
        Object[] array;
        try {
            this.a.B1(9L);
            n = yf61.n(this.a);
        } catch (EOFException unused) {
        }
        if (n > 16384) {
            ny61.v(oyr.i(n, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int readByte = this.a.readByte() & 255;
        byte readByte2 = this.a.readByte();
        int i = readByte2 & 255;
        int readInt = this.a.readInt();
        int i2 = Integer.MAX_VALUE & readInt;
        int i3 = 1;
        if (readByte != 8) {
            Logger logger = w;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(ytu.b(i2, n, readByte, i, true));
            }
        }
        if (z && readByte != 4) {
            w511.r(ytu.a(readByte), "Expected a SETTINGS frame but was ");
            return false;
        }
        ErrorCode errorCode = null;
        switch (readByte) {
            case 0:
                c(duuVar, n, i, i2);
                return true;
            case 1:
                e(duuVar, n, i, i2);
                return true;
            case 2:
                if (n != 5) {
                    ny61.v(oyr.j(n, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i2 == 0) {
                    ny61.v("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                qq6 qq6Var = this.a;
                qq6Var.readInt();
                qq6Var.readByte();
                return true;
            case 3:
                if (n != 4) {
                    ny61.v(oyr.j(n, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i2 == 0) {
                    ny61.v("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int readInt2 = this.a.readInt();
                ErrorCode.Companion.getClass();
                ErrorCode[] values = ErrorCode.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        ErrorCode errorCode2 = values[i4];
                        if (errorCode2.getHttpCode() == readInt2) {
                            errorCode = errorCode2;
                        } else {
                            i4++;
                        }
                    }
                }
                if (errorCode == null) {
                    ny61.v(oyr.i(readInt2, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                euu euuVar = (euu) duuVar.c;
                if (i2 == 0 || (readInt & 1) != 0) {
                    luu d = euuVar.d(i2);
                    if (d != null) {
                        synchronized (d) {
                            if (d.g() == null) {
                                d.E = errorCode;
                                d.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                }
                htx0.c(euuVar.B, euuVar.c + '[' + i2 + "] onReset", 0L, new auu(euuVar, i2, errorCode, i3), 6);
                return true;
            case 4:
                qq6 qq6Var2 = this.a;
                if (i2 != 0) {
                    ny61.v("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((readByte2 & 1) != 0) {
                    if (n != 0) {
                        ny61.v("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (n % 6 != 0) {
                    ny61.v(oyr.i(n, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                l6r0 l6r0Var = new l6r0();
                b6w m = y6i0.m(y6i0.n(0, n), 6);
                int i5 = m.a;
                int i6 = m.b;
                int i7 = m.c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        short readShort = qq6Var2.readShort();
                        byte[] bArr = yf61.a;
                        int i8 = readShort & 65535;
                        int readInt3 = qq6Var2.readInt();
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                }
                            } else if (readInt3 < 0) {
                                ny61.v("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            ny61.v("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        l6r0Var.b(i8, readInt3);
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                }
                euu euuVar2 = (euu) duuVar.c;
                htx0.c(euuVar2.A, oyr.t(new StringBuilder(), euuVar2.c, " applyAndAckSettings"), 0L, new ou(24, duuVar, l6r0Var), 6);
                return true;
            case 5:
                k(duuVar, n, i, i2);
                return true;
            case 6:
                if (n != 8) {
                    ny61.v(oyr.i(n, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i2 != 0) {
                    ny61.v("TYPE_PING streamId != 0");
                    return false;
                }
                int readInt4 = this.a.readInt();
                int readInt5 = this.a.readInt();
                r0 = (readByte2 & 1) != 0 ? 1 : 0;
                euu euuVar3 = (euu) duuVar.c;
                if (r0 == 0) {
                    htx0.c(euuVar3.A, oyr.t(new StringBuilder(), ((euu) duuVar.c).c, " ping"), 0L, new w9m((euu) duuVar.c, readInt4, readInt5, i3), 6);
                    return true;
                }
                synchronized (euuVar3) {
                    try {
                        if (readInt4 == 1) {
                            euuVar3.E++;
                        } else if (readInt4 == 2) {
                            euuVar3.G++;
                        } else if (readInt4 == 3) {
                            euuVar3.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (n < 8) {
                    ny61.v(oyr.i(n, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i2 != 0) {
                    ny61.v("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int readInt6 = this.a.readInt();
                int readInt7 = this.a.readInt();
                int i9 = n - 8;
                ErrorCode.Companion.getClass();
                ErrorCode[] values2 = ErrorCode.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        ErrorCode errorCode3 = values2[i10];
                        if (errorCode3.getHttpCode() == readInt7) {
                            errorCode = errorCode3;
                        } else {
                            i10++;
                        }
                    }
                }
                if (errorCode == null) {
                    ny61.v(oyr.i(readInt7, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                ByteString byteString = ByteString.c;
                if (i9 > 0) {
                    byteString = this.a.l0(i9);
                }
                byteString.h();
                euu euuVar4 = (euu) duuVar.c;
                synchronized (euuVar4) {
                    array = euuVar4.b.values().toArray(new luu[0]);
                    euuVar4.y = true;
                }
                luu[] luuVarArr = (luu[]) array;
                int length3 = luuVarArr.length;
                while (r0 < length3) {
                    luu luuVar = luuVarArr[r0];
                    if (luuVar.a > readInt6 && luuVar.h()) {
                        ErrorCode errorCode4 = ErrorCode.REFUSED_STREAM;
                        synchronized (luuVar) {
                            if (luuVar.g() == null) {
                                luuVar.E = errorCode4;
                                luuVar.notifyAll();
                            }
                        }
                        ((euu) duuVar.c).d(luuVar.a);
                    }
                    r0++;
                }
                return true;
            case 8:
                try {
                    if (n != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + n);
                    }
                    long readInt8 = this.a.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = w;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(ytu.c(i2, n, readInt8, true));
                    }
                    euu euuVar5 = (euu) duuVar.c;
                    if (i2 == 0) {
                        synchronized (euuVar5) {
                            euuVar5.N += readInt8;
                            euuVar5.notifyAll();
                        }
                        return true;
                    }
                    luu c = euuVar5.c(i2);
                    if (c != null) {
                        synchronized (c) {
                            c.x += readInt8;
                            if (readInt8 > 0) {
                                c.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    w.fine(ytu.b(i2, n, 8, i, true));
                    throw e;
                }
            default:
                this.a.skip(n);
                return true;
        }
    }

    public final void c(duu duuVar, int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            ny61.v("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            ny61.v("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = yf61.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int E = jl40.E(i, i2, i4);
        qq6 qq6Var = this.a;
        euu euuVar = (euu) duuVar.c;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            yp6 yp6Var = new yp6();
            long j = E;
            qq6Var.B1(j);
            qq6Var.read(yp6Var, j);
            htx0.c(euuVar.B, euuVar.c + '[' + i3 + "] onData", 0L, new fg6(euuVar, i3, yp6Var, E, z4), 6);
        } else {
            luu c = euuVar.c(i3);
            if (c == null) {
                ((euu) duuVar.c).o(i3, ErrorCode.PROTOCOL_ERROR);
                long j2 = E;
                ((euu) duuVar.c).k(j2);
                qq6Var.skip(j2);
            } else {
                TimeZone timeZone = bg61.a;
                juu juuVar = c.A;
                long j3 = E;
                juuVar.getClass();
                long j4 = j3;
                while (true) {
                    luu luuVar = juuVar.y;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = bg61.a;
                        luuVar.b.k(j3);
                        ypr yprVar = juuVar.y.b.I;
                        long j5 = juuVar.w.b;
                        yprVar.getClass();
                        break;
                    }
                    synchronized (luuVar) {
                        z2 = juuVar.b;
                        z3 = juuVar.w.b + j4 > juuVar.a;
                    }
                    if (z3) {
                        qq6Var.skip(j4);
                        juuVar.y.f(ErrorCode.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        qq6Var.skip(j4);
                        break;
                    }
                    long read = qq6Var.read(juuVar.c, j4);
                    if (read == -1) {
                        ny61.b();
                        return;
                    }
                    j4 -= read;
                    luu luuVar2 = juuVar.y;
                    synchronized (luuVar2) {
                        try {
                            if (juuVar.x) {
                                juuVar.c.clear();
                            } else {
                                yp6 yp6Var2 = juuVar.w;
                                boolean z5 = yp6Var2.b == 0;
                                yp6Var2.N1(juuVar.c);
                                if (z5) {
                                    luuVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    c.j(meu.b, true);
                }
            }
        }
        this.a.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final List d(int i, int i2, int i3, int i4) {
        guu guuVar = this.b;
        guuVar.x = i;
        guuVar.b = i;
        guuVar.y = i2;
        guuVar.c = i3;
        guuVar.w = i4;
        otu otuVar = this.c;
        jci0 jci0Var = otuVar.c;
        ArrayList arrayList = otuVar.b;
        while (!jci0Var.I1()) {
            byte readByte = jci0Var.readByte();
            byte[] bArr = yf61.a;
            int i5 = readByte & 255;
            if (i5 == 128) {
                ny61.v("index == 0");
                return null;
            }
            if ((readByte & DerValue.TAG_CONTEXT) == 128) {
                int e = otuVar.e(i5, HProv.PP_VERSION_TIMESTAMP);
                int i6 = e - 1;
                if (i6 >= 0) {
                    y8u[] y8uVarArr = qtu.a;
                    if (i6 <= y8uVarArr.length - 1) {
                        arrayList.add(y8uVarArr[i6]);
                    }
                }
                int length = otuVar.e + 1 + (i6 - qtu.a.length);
                if (length >= 0) {
                    y8u[] y8uVarArr2 = otuVar.d;
                    if (length < y8uVarArr2.length) {
                        arrayList.add(y8uVarArr2[length]);
                    }
                }
                ny61.v(oyr.i(e, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                y8u[] y8uVarArr3 = qtu.a;
                ByteString d = otuVar.d();
                qtu.a(d);
                otuVar.c(new y8u(d, otuVar.d()));
            } else if ((readByte & DerValue.TAG_APPLICATION) == 64) {
                otuVar.c(new y8u(otuVar.b(otuVar.e(i5, 63) - 1), otuVar.d()));
            } else if ((readByte & BlobHeaderStructure.BLOB_VERSION) == 32) {
                int e2 = otuVar.e(i5, 31);
                otuVar.a = e2;
                if (e2 < 0 || e2 > 4096) {
                    yci0.s(otuVar.a, "Invalid dynamic table size update ");
                    return null;
                }
                int i7 = otuVar.g;
                if (e2 < i7) {
                    if (e2 == 0) {
                        f73.q(otuVar.d, null);
                        otuVar.e = otuVar.d.length - 1;
                        otuVar.f = 0;
                        otuVar.g = 0;
                    } else {
                        otuVar.a(i7 - e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                y8u[] y8uVarArr4 = qtu.a;
                ByteString d2 = otuVar.d();
                qtu.a(d2);
                arrayList.add(new y8u(d2, otuVar.d()));
            } else {
                arrayList.add(new y8u(otuVar.b(otuVar.e(i5, 15) - 1), otuVar.d()));
            }
        }
        List J0 = a.J0(arrayList);
        arrayList.clear();
        return J0;
    }

    public final void e(duu duuVar, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        euu euuVar;
        if (i3 == 0) {
            ny61.v("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = yf61.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            qq6 qq6Var = this.a;
            qq6Var.readInt();
            qq6Var.readByte();
            byte[] bArr2 = yf61.a;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List d = d(jl40.E(i5, i2, i4), i4, i2, i3);
        euu euuVar2 = (euu) duuVar.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = z;
        }
        if (z2) {
            htx0.c(euuVar2.B, euuVar2.c + '[' + i3 + "] onHeaders", 0L, new auu(euuVar2, i3, d, z3), 6);
            return;
        }
        synchronized (euuVar2) {
            try {
                luu c = euuVar2.c(i3);
                if (c != null) {
                    c.j(bg61.i(d), z3);
                    return;
                }
                if (euuVar2.y) {
                    return;
                }
                if (i3 <= euuVar2.w) {
                    return;
                }
                if (i3 % 2 == euuVar2.x % 2) {
                    return;
                }
                euuVar = euuVar2;
                try {
                    luu luuVar = new luu(i3, euuVar, false, z3, bg61.i(d));
                    euuVar.w = i3;
                    euuVar.b.put(Integer.valueOf(i3), luuVar);
                    htx0.c(euuVar.z.d(), euuVar.c + '[' + i3 + "] onStream", 0L, new ou(23, euuVar, luuVar), 6);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                euuVar = euuVar2;
            }
        }
    }

    public final void k(duu duuVar, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            ny61.v("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.a.readByte();
            byte[] bArr = yf61.a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.a.readInt() & Integer.MAX_VALUE;
        List d = d(jl40.E(i - 4, i2, i4), i4, i2, i3);
        euu euuVar = (euu) duuVar.c;
        synchronized (euuVar) {
            if (euuVar.R.contains(Integer.valueOf(readInt))) {
                euuVar.o(readInt, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            euuVar.R.add(Integer.valueOf(readInt));
            htx0.c(euuVar.B, euuVar.c + '[' + readInt + "] onRequest", 0L, new auu(euuVar, readInt, d, i5), 6);
        }
    }
}
