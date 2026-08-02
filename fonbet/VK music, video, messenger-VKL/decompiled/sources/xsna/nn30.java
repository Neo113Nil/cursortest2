package xsna;

import com.google.gson.JsonSyntaxException;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.util.Arrays;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: MsgPackReader.kt */
/* loaded from: classes3.dex */
public final class nn30 implements Closeable {
    public static final bl3<int[]> l = new bl3<>(32, new i0r(8), new twa((byte) 0, 3));
    public static final bl3<String[]> m = new bl3<>(8, new ot(29), new log(10));
    public byte b;
    public byte c;
    public int d;
    public final f7z e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public String[] j;
    public long k;

    /* compiled from: MsgPackReader.kt */
    public static final class a {
        public static String a(byte b) {
            return b == 0 ? "PEEKED_NONE" : b == 1 ? "PEEKED_BEGIN_OBJECT" : b == 2 ? "PEEKED_END_OBJECT" : b == 3 ? "PEEKED_BEGIN_ARRAY" : b == 4 ? "PEEKED_END_ARRAY" : b == 5 ? "PEEKED_TRUE" : b == 6 ? "PEEKED_FALSE" : b == 7 ? "PEEKED_NULL" : b == 8 ? "PEEKED_STRING" : b == 9 ? "PEEKED_LONG" : b == 10 ? "PEEKED_DOUBLE" : b == 11 ? "PEEKED_STRING_NAME" : b == 12 ? "PEEKED_LONG_NAME" : b == 13 ? "PEEKED_DOUBLE_NAME" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public nn30(agk0 agk0Var) {
        this.e = new f7z(agk0Var);
        bl3<int[]> bl3Var = l;
        this.f = bl3Var.a();
        this.g = bl3Var.a();
        this.h = bl3Var.a();
        this.i = bl3Var.a();
        this.j = m.a();
        n(0);
    }

    public static boolean b(gn30[] gn30VarArr, byte b) {
        for (gn30 gn30Var : gn30VarArr) {
            if (qxm0.f(gn30Var, b)) {
                return true;
            }
        }
        return false;
    }

    public static gn30 r(gn30[] gn30VarArr, byte b) {
        for (gn30 gn30Var : gn30VarArr) {
            if (qxm0.f(gn30Var, b)) {
                return gn30Var;
            }
        }
        return null;
    }

    public final void beginArray() {
        gn30 r = r(m4s.i, this.c);
        if (r != null) {
            c(r, 1);
            return;
        }
        StringBuilder sb = new StringBuilder("Current tag 0x");
        byte b = this.c;
        ro.d(16);
        sb.append(Integer.toString(b, 16));
        sb.append(" is not an array tag.");
        throw new IllegalStateException(sb.toString());
    }

    public final void beginObject() {
        gn30 r = r(m4s.j, this.c);
        if (r != null) {
            c(r, 2);
            return;
        }
        StringBuilder sb = new StringBuilder("Current tag 0x");
        byte b = this.c;
        ro.d(16);
        sb.append(Integer.toString(b, 16));
        sb.append(" is not an map tag.");
        throw new IllegalStateException(sb.toString());
    }

    public final void c(gn30 gn30Var, int i) {
        int w = (int) qxm0.w(gn30Var, this.e, this.c);
        n(i);
        int[] iArr = this.g;
        int i2 = this.d - 1;
        iArr[i2] = w;
        this.i[i2] = 0;
        this.h[i2] = 0;
        this.b = (byte) 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b = (byte) 0;
        this.d = 0;
        this.c = (byte) 0;
        this.e.close();
        int[] iArr = this.f;
        bl3<int[]> bl3Var = l;
        bl3Var.b(iArr);
        bl3Var.b(this.g);
        bl3Var.b(this.i);
        bl3Var.b(this.h);
        m.b(this.j);
    }

    public final String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f[i2];
            if (i3 == 1) {
                sb.append('[');
                sb.append(this.i[i2]);
                sb.append(']');
            } else if (i3 == 2) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = this.j[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final boolean hasNext() {
        int[] iArr = this.i;
        int i = this.d;
        return iArr[i + (-1)] < this.g[i - 1];
    }

    public final void m() {
        int i = this.d;
        int i2 = i - 1;
        this.d = i2;
        this.j[i2] = null;
        int[] iArr = this.i;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f[i2] = -1;
        this.b = (byte) 0;
    }

    public final void n(int i) {
        if (this.d == this.i.length) {
            String[] strArr = this.j;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            m.b(this.j);
            this.j = strArr2;
            int[] iArr = this.i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            bl3<int[]> bl3Var = l;
            bl3Var.b(iArr);
            this.i = copyOf;
            int[] iArr2 = this.g;
            int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length * 2);
            bl3Var.b(iArr2);
            this.g = copyOf2;
            int[] iArr3 = this.f;
            int[] copyOf3 = Arrays.copyOf(iArr3, iArr3.length * 2);
            bl3Var.b(iArr3);
            this.f = copyOf3;
            int[] iArr4 = this.h;
            int[] copyOf4 = Arrays.copyOf(iArr4, iArr4.length * 2);
            bl3Var.b(iArr4);
            this.h = copyOf4;
        }
        int[] iArr5 = this.f;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr5[i2] = i;
    }

    public final Number o(boolean z) {
        Number valueOf;
        q();
        byte b = this.c;
        gn30[] gn30VarArr = m4s.h;
        boolean b2 = b(gn30VarArr, b);
        f7z f7zVar = this.e;
        if (b2) {
            if (this.k == 0) {
                gn30 r = r(gn30VarArr, this.c);
                if (r == null) {
                    throw new AssertionError();
                }
                this.k = qxm0.w(r, f7zVar, this.c);
            }
            long j = this.k;
            f7zVar.h(j);
            double parseDouble = Double.parseDouble(f7zVar.c.Q2(j));
            this.k = 0L;
            valueOf = Double.valueOf(parseDouble);
        } else if (b == -52) {
            valueOf = Integer.valueOf(f7zVar.readByte() & 255);
        } else if (b == -51) {
            f7zVar.h(2L);
            valueOf = Integer.valueOf(f7zVar.c.readShort() & 65535);
        } else if (b == -50) {
            valueOf = Long.valueOf(f7zVar.readInt() & 4294967295L);
        } else if (b == -49) {
            f7zVar.h(8L);
            valueOf = Long.valueOf(f7zVar.c.readLong());
        } else if (-32 <= b && b < 128) {
            valueOf = Byte.valueOf(this.c);
        } else if (b == -53) {
            f7zVar.h(8L);
            valueOf = Double.valueOf(Double.longBitsToDouble(f7zVar.c.readLong()));
        } else if (b == -54) {
            valueOf = Float.valueOf(Float.intBitsToFloat(f7zVar.readInt()));
        } else if (b == -48) {
            valueOf = Byte.valueOf(f7zVar.readByte());
        } else if (b == -46) {
            valueOf = Integer.valueOf(f7zVar.readInt());
        } else if (b == -47) {
            f7zVar.h(2L);
            valueOf = Short.valueOf(f7zVar.c.readShort());
        } else {
            if (b != -45) {
                StringBuilder sb = new StringBuilder("Current tag 0x");
                byte b3 = this.c;
                ro.d(16);
                sb.append(Integer.toString(b3, 16));
                sb.append(" is not a supported number tag.");
                throw new IllegalStateException(sb.toString());
            }
            f7zVar.h(8L);
            valueOf = Long.valueOf(f7zVar.c.readLong());
        }
        this.b = (byte) 0;
        if (z) {
            int[] iArr = this.i;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
        }
        return valueOf;
    }

    public final String p(boolean z) {
        String str;
        byte q = q();
        if (q == 8 || q == 11) {
            q();
            long j = this.k;
            f7z f7zVar = this.e;
            if (j == 0) {
                gn30 r = r(m4s.h, this.c);
                if (r == null) {
                    StringBuilder sb = new StringBuilder("Current tag 0x");
                    byte b = this.c;
                    ro.d(16);
                    sb.append(Integer.toString(b, 16));
                    sb.append(" is not a string tag.");
                    throw new IllegalStateException(sb.toString());
                }
                j = qxm0.w(r, f7zVar, this.c);
            }
            this.k = j;
            f7zVar.h(j);
            String Q2 = f7zVar.c.Q2(j);
            this.k = 0L;
            if (z) {
                int[] iArr = this.i;
                int i = this.d - 1;
                iArr[i] = iArr[i] + 1;
            }
            str = Q2;
        } else {
            if (q != 12 && q != 13 && q != 9 && q != 10) {
                throw new JsonSyntaxException("Expected a string but was " + ((int) this.b) + " at path " + getPath());
            }
            str = o(z).toString();
        }
        this.b = (byte) 0;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (hasNext() != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte q() {
        byte readByte;
        byte b;
        int[] iArr;
        int i;
        if (this.b == 0) {
            int i2 = this.f[this.d - 1];
            byte b2 = 2;
            if (i2 != 1) {
                if (i2 == 2) {
                }
                readByte = this.e.readByte();
                if (!b(m4s.i, readByte)) {
                    b = 3;
                } else if (b(m4s.j, readByte)) {
                    b = 1;
                } else if (b(m4s.h, readByte)) {
                    b = 8;
                } else if ((-32 <= readByte && readByte < 128) || readByte == -52 || readByte == -51 || readByte == -50 || readByte == -49 || readByte == -48 || readByte == -47 || readByte == -46 || readByte == -45) {
                    b = 9;
                } else if (readByte == -54 || readByte == -53) {
                    b = 10;
                } else if (readByte == -64) {
                    b = 7;
                } else if (readByte == -61) {
                    b = 5;
                } else {
                    if (readByte != -62) {
                        throw new IllegalStateException("Msgpack format tag not yet supported: 0x".concat(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(readByte)}, 1))));
                    }
                    b = 6;
                }
                this.c = readByte;
                if (i2 == 2 && hasNext()) {
                    iArr = this.h;
                    i = this.d - 1;
                    if (iArr[i] == this.i[i]) {
                        if (b == 8) {
                            b2 = AmfConstants.TYPE_DATE_MARKER;
                        } else if (b == 9) {
                            b2 = AmfConstants.TYPE_LONG_STRING_MARKER;
                        } else {
                            if (b != 10) {
                                throw new IllegalStateException(lhg.a(b, "Trying to read name "));
                            }
                            b2 = AmfConstants.TYPE_UNSUPPORTED_MARKER;
                        }
                        this.b = b2;
                    }
                }
                b2 = b;
                this.b = b2;
            } else {
                if (!hasNext()) {
                    b2 = 4;
                    this.b = b2;
                }
                readByte = this.e.readByte();
                if (!b(m4s.i, readByte)) {
                }
                this.c = readByte;
                if (i2 == 2) {
                    iArr = this.h;
                    i = this.d - 1;
                    if (iArr[i] == this.i[i]) {
                    }
                }
                b2 = b;
                this.b = b2;
            }
        }
        return this.b;
    }
}
