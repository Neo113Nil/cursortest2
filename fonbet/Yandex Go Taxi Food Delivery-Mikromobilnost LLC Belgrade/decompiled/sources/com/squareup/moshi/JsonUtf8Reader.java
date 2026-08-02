package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import defpackage.jci0;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qq6;
import defpackage.uza;
import defpackage.yp6;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
final class JsonUtf8Reader extends JsonReader {
    public static final ByteString H;
    public static final ByteString I;
    public static final ByteString J;
    public static final ByteString K;
    public static final ByteString L;
    public final qq6 A;
    public final yp6 B;
    public int C;
    public long D;
    public int E;
    public String F;
    public JsonValueSource G;

    static {
        ByteString byteString = new ByteString("'\\".getBytes(uza.a));
        byteString.b = "'\\";
        H = byteString;
        ByteString byteString2 = new ByteString("\"\\".getBytes(uza.a));
        byteString2.b = "\"\\";
        I = byteString2;
        ByteString byteString3 = new ByteString("{}[]:, \n\t\r\f/\\;#=".getBytes(uza.a));
        byteString3.b = "{}[]:, \n\t\r\f/\\;#=";
        J = byteString3;
        ByteString byteString4 = new ByteString(HexString.STR_CR.getBytes(uza.a));
        byteString4.b = HexString.STR_CR;
        K = byteString4;
        ByteString byteString5 = new ByteString("*/".getBytes(uza.a));
        byteString5.b = "*/";
        L = byteString5;
    }

    public JsonUtf8Reader(JsonUtf8Reader jsonUtf8Reader) {
        super(jsonUtf8Reader);
        this.C = 0;
        jci0 peek = jsonUtf8Reader.A.peek();
        this.A = peek;
        this.B = peek.b;
        this.C = jsonUtf8Reader.C;
        this.D = jsonUtf8Reader.D;
        this.E = jsonUtf8Reader.E;
        this.F = jsonUtf8Reader.F;
        try {
            peek.B1(jsonUtf8Reader.B.b);
        } catch (IOException unused) {
            ny61.w();
            throw null;
        }
    }

    public final String B(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long K2 = this.A.K(byteString);
            if (K2 == -1) {
                c("Unterminated string");
                throw null;
            }
            yp6 yp6Var = this.B;
            if (yp6Var.e(K2) != 92) {
                if (sb == null) {
                    String T = yp6Var.T(K2, uza.a);
                    yp6Var.readByte();
                    return T;
                }
                sb.append(yp6Var.T(K2, uza.a));
                yp6Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(yp6Var.T(K2, uza.a));
            yp6Var.readByte();
            sb.append(G());
        }
    }

    public final String D() {
        long K2 = this.A.K(J);
        yp6 yp6Var = this.B;
        if (K2 == -1) {
            return yp6Var.I0();
        }
        yp6Var.getClass();
        return yp6Var.T(K2, uza.a);
    }

    public final char G() {
        int i;
        qq6 qq6Var = this.A;
        if (!qq6Var.S(1L)) {
            c("Unterminated escape sequence");
            throw null;
        }
        yp6 yp6Var = this.B;
        byte readByte = yp6Var.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return HexString.LF;
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.x) {
                return (char) readByte;
            }
            c("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!qq6Var.S(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte e = yp6Var.e(i2);
            char c2 = (char) (c << 4);
            if (e >= 48 && e <= 57) {
                i = e - 48;
            } else if (e >= 97 && e <= 102) {
                i = e - 87;
            } else {
                if (e < 65 || e > 70) {
                    c("\\u".concat(yp6Var.T(4L, uza.a)));
                    throw null;
                }
                i = e - 55;
            }
            c = (char) (i + c2);
        }
        yp6Var.skip(4L);
        return c;
    }

    public final void I(ByteString byteString) {
        while (true) {
            long K2 = this.A.K(byteString);
            if (K2 == -1) {
                c("Unterminated string");
                throw null;
            }
            yp6 yp6Var = this.B;
            if (yp6Var.e(K2) != 92) {
                yp6Var.skip(K2 + 1);
                return;
            } else {
                yp6Var.skip(K2 + 1);
                G();
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginArray() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 3) {
            a(1);
            this.w[this.a - 1] = 0;
            this.C = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginObject() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 1) {
            a(3);
            this.C = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.C = 0;
        this.b[0] = 8;
        this.a = 1;
        this.B.clear();
        this.A.close();
    }

    public final void e() {
        if (this.x) {
            return;
        }
        c("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // com.squareup.moshi.JsonReader
    public void endArray() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
        } else {
            int i2 = this.a;
            this.a = i2 - 1;
            int[] iArr = this.w;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.C = 0;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void endObject() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
            return;
        }
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        this.c[i3] = null;
        int[] iArr = this.w;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.C = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e4, code lost:
    
        if (r4 == 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
    
        if (r4 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ea, code lost:
    
        if (r4 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ec, code lost:
    
        r24.E = r1;
        r10 = 17;
        r24.C = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
    
        if (v(r14) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        if (r4 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c5, code lost:
    
        if (r5 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cb, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cd, code lost:
    
        if (r2 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d1, code lost:
    
        if (r8 != r16) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d3, code lost:
    
        if (r2 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d5, code lost:
    
        if (r2 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d8, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d9, code lost:
    
        r24.D = r8;
        r11.skip(r1);
        r10 = 16;
        r24.C = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k() {
        int i;
        String str;
        String str2;
        long j;
        int i2;
        char e;
        int i3;
        char c;
        int[] iArr = this.b;
        int i4 = this.a - 1;
        int i5 = iArr[i4];
        qq6 qq6Var = this.A;
        long j2 = 0;
        yp6 yp6Var = this.B;
        if (i5 == 1) {
            iArr[i4] = 2;
        } else if (i5 == 2) {
            int w = w(true);
            yp6Var.readByte();
            if (w != 44) {
                if (w != 59) {
                    if (w == 93) {
                        this.C = 4;
                        return 4;
                    }
                    c("Unterminated array");
                    throw null;
                }
                e();
            }
        } else {
            if (i5 == 3 || i5 == 5) {
                iArr[i4] = 4;
                if (i5 == 5) {
                    int w2 = w(true);
                    yp6Var.readByte();
                    if (w2 != 44) {
                        if (w2 != 59) {
                            if (w2 == 125) {
                                this.C = 2;
                                return 2;
                            }
                            c("Unterminated object");
                            throw null;
                        }
                        e();
                    }
                }
                int w3 = w(true);
                if (w3 == 34) {
                    yp6Var.readByte();
                    this.C = 13;
                    return 13;
                }
                if (w3 == 39) {
                    yp6Var.readByte();
                    e();
                    this.C = 12;
                    return 12;
                }
                if (w3 != 125) {
                    e();
                    if (v((char) w3)) {
                        this.C = 14;
                        return 14;
                    }
                    c("Expected name");
                    throw null;
                }
                if (i5 == 5) {
                    c("Expected name");
                    throw null;
                }
                yp6Var.readByte();
                this.C = 2;
                return 2;
            }
            if (i5 == 4) {
                iArr[i4] = 5;
                int w4 = w(true);
                yp6Var.readByte();
                if (w4 != 58) {
                    if (w4 != 61) {
                        c("Expected ':'");
                        throw null;
                    }
                    e();
                    if (qq6Var.S(1L) && yp6Var.e(0L) == 62) {
                        yp6Var.readByte();
                    }
                }
            } else if (i5 == 6) {
                iArr[i4] = 7;
            } else if (i5 == 7) {
                if (w(false) == -1) {
                    this.C = 18;
                    return 18;
                }
                e();
            } else {
                if (i5 == 9) {
                    this.G.discard();
                    this.G = null;
                    this.a--;
                    return k();
                }
                if (i5 == 8) {
                    ny61.r("JsonReader is closed");
                    return 0;
                }
            }
        }
        int w5 = w(true);
        if (w5 == 34) {
            yp6Var.readByte();
            this.C = 9;
            return 9;
        }
        if (w5 == 39) {
            e();
            yp6Var.readByte();
            this.C = 8;
            return 8;
        }
        if (w5 != 44 && w5 != 59) {
            if (w5 == 91) {
                yp6Var.readByte();
                this.C = 3;
                return 3;
            }
            if (w5 != 93) {
                if (w5 == 123) {
                    yp6Var.readByte();
                    this.C = 1;
                    return 1;
                }
                byte e2 = yp6Var.e(0L);
                if (e2 == 116 || e2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else if (e2 == 102 || e2 == 70) {
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                } else if (e2 == 110 || e2 == 78) {
                    i = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j = 0;
                    i2 = 0;
                    if (i2 == 0) {
                        return i2;
                    }
                    boolean z = true;
                    long j3 = j;
                    int i6 = 0;
                    boolean z2 = false;
                    char c2 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        if (!qq6Var.S(i7)) {
                            break;
                        }
                        byte e3 = yp6Var.e(i6);
                        if (e3 != 43) {
                            if (e3 == 69 || e3 == 101) {
                                if (c2 != 2 && c2 != 4) {
                                    break;
                                }
                                c2 = 5;
                                i6 = i7;
                            } else if (e3 == 45) {
                                c = 6;
                                if (c2 == 0) {
                                    z2 = true;
                                    c2 = 1;
                                    i6 = i7;
                                } else {
                                    if (c2 != 5) {
                                        break;
                                    }
                                    c2 = c;
                                    i6 = i7;
                                }
                            } else if (e3 == 46) {
                                if (c2 != 2) {
                                    break;
                                }
                                c2 = 3;
                                i6 = i7;
                            } else {
                                if (e3 < 48 || e3 > 57) {
                                    break;
                                }
                                if (c2 == 1 || c2 == 0) {
                                    j3 = -(e3 - 48);
                                    c2 = 2;
                                } else if (c2 == 2) {
                                    if (j3 == j) {
                                        break;
                                    }
                                    long j4 = (10 * j3) - (e3 - 48);
                                    z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                    j3 = j4;
                                } else if (c2 == 3) {
                                    c2 = 4;
                                } else if (c2 == 5 || c2 == 6) {
                                    c2 = 7;
                                }
                                i6 = i7;
                            }
                            if (i3 == 0) {
                                return i3;
                            }
                            if (!v(yp6Var.e(j))) {
                                c("Expected value");
                                throw null;
                            }
                            e();
                            this.C = 10;
                            return 10;
                        }
                        c = 6;
                        if (c2 != 5) {
                            break;
                        }
                        c2 = c;
                        i6 = i7;
                    }
                    i3 = 0;
                    if (i3 == 0) {
                    }
                }
                int length = str2.length();
                int i8 = 1;
                while (true) {
                    if (i8 < length) {
                        int i9 = i8 + 1;
                        j = j2;
                        if (!qq6Var.S(i9) || ((e = yp6Var.e(i8)) != str2.charAt(i8) && e != str.charAt(i8))) {
                            break;
                        }
                        i8 = i9;
                        j2 = j;
                    } else {
                        j = j2;
                        if (!qq6Var.S(length + 1) || !v(yp6Var.e(length))) {
                            yp6Var.skip(length);
                            this.C = i;
                            i2 = i;
                        }
                    }
                }
                i2 = 0;
                if (i2 == 0) {
                }
            } else if (i5 == 1) {
                yp6Var.readByte();
                this.C = 4;
                return 4;
            }
        }
        if (i5 != 1 && i5 != 2) {
            c("Unexpected value");
            throw null;
        }
        e();
        this.C = 7;
        return 7;
    }

    public final int n(String str, JsonReader.Options options) {
        int length = options.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.a[i])) {
                this.C = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 5) {
            this.C = 0;
            int[] iArr = this.w;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
            return false;
        }
        this.C = 0;
        int[] iArr2 = this.w;
        int i3 = this.a - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 16) {
            this.C = 0;
            int[] iArr = this.w;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.D;
        }
        if (i == 17) {
            long j = this.E;
            yp6 yp6Var = this.B;
            yp6Var.getClass();
            this.F = yp6Var.T(j, uza.a);
        } else if (i == 9) {
            this.F = B(I);
        } else if (i == 8) {
            this.F = B(H);
        } else if (i == 10) {
            this.F = D();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
            return 0.0d;
        }
        this.C = 11;
        try {
            double parseDouble = Double.parseDouble(this.F);
            if (!this.x && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                StringBuilder u = oyr.u(parseDouble, "JSON forbids NaN and infinities: ", " at path ");
                u.append(getPath());
                throw new JsonEncodingException(u.toString());
            }
            this.F = null;
            this.C = 0;
            int[] iArr2 = this.w;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            kbs.k("Expected a double but was ", this.F, " at path ", getPath());
            return 0.0d;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 16) {
            long j = this.D;
            int i2 = (int) j;
            if (j == i2) {
                this.C = 0;
                int[] iArr = this.w;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.D + " at path " + getPath());
        }
        if (i == 17) {
            long j2 = this.E;
            yp6 yp6Var = this.B;
            yp6Var.getClass();
            this.F = yp6Var.T(j2, uza.a);
        } else if (i == 9 || i == 8) {
            String B = i == 9 ? B(I) : B(H);
            this.F = B;
            try {
                int parseInt = Integer.parseInt(B);
                this.C = 0;
                int[] iArr2 = this.w;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
            return 0;
        }
        this.C = 11;
        try {
            double parseDouble = Double.parseDouble(this.F);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                kbs.k("Expected an int but was ", this.F, " at path ", getPath());
                return 0;
            }
            this.F = null;
            this.C = 0;
            int[] iArr3 = this.w;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            kbs.k("Expected an int but was ", this.F, " at path ", getPath());
            return 0;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 16) {
            this.C = 0;
            int[] iArr = this.w;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.D;
        }
        if (i == 17) {
            long j = this.E;
            yp6 yp6Var = this.B;
            yp6Var.getClass();
            this.F = yp6Var.T(j, uza.a);
        } else if (i == 9 || i == 8) {
            String B = i == 9 ? B(I) : B(H);
            this.F = B;
            try {
                long parseLong = Long.parseLong(B);
                this.C = 0;
                int[] iArr2 = this.w;
                int i3 = this.a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
            return 0L;
        }
        this.C = 11;
        try {
            long longValueExact = new BigDecimal(this.F).longValueExact();
            this.F = null;
            this.C = 0;
            int[] iArr3 = this.w;
            int i4 = this.a - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            kbs.k("Expected a long but was ", this.F, " at path ", getPath());
            return 0L;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() throws IOException {
        String str;
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 14) {
            str = D();
        } else if (i == 13) {
            str = B(I);
        } else if (i == 12) {
            str = B(H);
        } else {
            if (i != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                kbs.u(sb, " at path ", getPath());
                return null;
            }
            str = this.F;
            this.F = null;
        }
        this.C = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    public <T> T nextNull() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(peek());
            kbs.u(sb, " at path ", getPath());
            return null;
        }
        this.C = 0;
        int[] iArr = this.w;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ae  */
    @Override // com.squareup.moshi.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qq6 nextSource() throws IOException {
        int i;
        int i2 = this.C;
        if (i2 == 0) {
            i2 = k();
        }
        yp6 yp6Var = new yp6();
        ByteString byteString = JsonValueSource.F;
        if (i2 == 3) {
            yp6Var.x0("[");
            byteString = JsonValueSource.A;
        } else {
            if (i2 != 1) {
                if (i2 == 9) {
                    yp6Var.x0("\"");
                    byteString = JsonValueSource.C;
                } else if (i2 == 8) {
                    yp6Var.x0("'");
                    byteString = JsonValueSource.B;
                } else if (i2 == 17 || i2 == 16 || i2 == 10) {
                    yp6Var.x0(nextString());
                } else if (i2 == 5) {
                    yp6Var.x0("true");
                } else if (i2 == 6) {
                    yp6Var.x0("false");
                } else if (i2 == 7) {
                    yp6Var.x0("null");
                } else {
                    if (i2 != 11) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(peek());
                        kbs.u(sb, " at path ", getPath());
                        return null;
                    }
                    String nextString = nextString();
                    JsonWriter of = JsonWriter.of(yp6Var);
                    try {
                        of.value(nextString);
                        of.close();
                    } catch (Throwable th) {
                        if (of != null) {
                            try {
                                of.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                i = 0;
                if (this.C != 0) {
                    int[] iArr = this.w;
                    int i3 = this.a - 1;
                    iArr[i3] = iArr[i3] + 1;
                    this.C = 0;
                }
                this.G = new JsonValueSource(this.A, yp6Var, byteString, i);
                a(9);
                return new jci0(this.G);
            }
            yp6Var.x0("{");
            byteString = JsonValueSource.A;
        }
        i = 1;
        if (this.C != 0) {
        }
        this.G = new JsonValueSource(this.A, yp6Var, byteString, i);
        a(9);
        return new jci0(this.G);
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() throws IOException {
        String T;
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 10) {
            T = D();
        } else if (i == 9) {
            T = B(I);
        } else if (i == 8) {
            T = B(H);
        } else if (i == 11) {
            T = this.F;
            this.F = null;
        } else if (i == 16) {
            T = Long.toString(this.D);
        } else {
            if (i != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(peek());
                kbs.u(sb, " at path ", getPath());
                return null;
            }
            long j = this.E;
            yp6 yp6Var = this.B;
            yp6Var.getClass();
            T = yp6Var.T(j, uza.a);
        }
        this.C = 0;
        int[] iArr = this.w;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return T;
    }

    public final int o(String str, JsonReader.Options options) {
        int length = options.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.a[i])) {
                this.C = 0;
                int[] iArr = this.w;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                ny61.w();
                return null;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader peekJson() {
        return new JsonUtf8Reader(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public void promoteNameToValue() throws IOException {
        if (hasNext()) {
            this.F = nextName();
            this.C = 11;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return n(this.F, options);
        }
        int h0 = this.A.h0(options.b);
        if (h0 != -1) {
            this.C = 0;
            this.c[this.a - 1] = options.a[h0];
            return h0;
        }
        String str = this.c[this.a - 1];
        String nextName = nextName();
        int n = n(nextName, options);
        if (n == -1) {
            this.C = 15;
            this.F = nextName;
            this.c[this.a - 1] = str;
        }
        return n;
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectString(JsonReader.Options options) throws IOException {
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return o(this.F, options);
        }
        int h0 = this.A.h0(options.b);
        if (h0 != -1) {
            this.C = 0;
            int[] iArr = this.w;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return h0;
        }
        String nextString = nextString();
        int o = o(nextString, options);
        if (o == -1) {
            this.C = 11;
            this.F = nextString;
            this.w[this.a - 1] = r0[r4] - 1;
        }
        return o;
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipName() throws IOException {
        if (this.y) {
            JsonReader.Token peek = peek();
            nextName();
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(peek);
            kbs.u(sb, " at ", getPath());
            return;
        }
        int i = this.C;
        if (i == 0) {
            i = k();
        }
        if (i == 14) {
            long K2 = this.A.K(J);
            yp6 yp6Var = this.B;
            if (K2 == -1) {
                K2 = yp6Var.b;
            }
            yp6Var.skip(K2);
        } else if (i == 13) {
            I(I);
        } else if (i == 12) {
            I(H);
        } else if (i != 15) {
            StringBuilder sb2 = new StringBuilder("Expected a name but was ");
            sb2.append(peek());
            kbs.u(sb2, " at path ", getPath());
            return;
        }
        this.C = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() throws IOException {
        if (this.y) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(peek());
            kbs.u(sb, " at ", getPath());
            return;
        }
        int i = 0;
        do {
            int i2 = this.C;
            if (i2 == 0) {
                i2 = k();
            }
            if (i2 == 3) {
                a(1);
            } else if (i2 == 1) {
                a(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(peek());
                        kbs.u(sb2, " at path ", getPath());
                        return;
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(peek());
                        kbs.u(sb3, " at path ", getPath());
                        return;
                    }
                    this.a--;
                } else {
                    yp6 yp6Var = this.B;
                    if (i2 == 14 || i2 == 10) {
                        long K2 = this.A.K(J);
                        if (K2 == -1) {
                            K2 = yp6Var.b;
                        }
                        yp6Var.skip(K2);
                    } else if (i2 == 9 || i2 == 13) {
                        I(I);
                    } else if (i2 == 8 || i2 == 12) {
                        I(H);
                    } else if (i2 == 17) {
                        yp6Var.skip(this.E);
                    } else if (i2 == 18) {
                        StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                        sb4.append(peek());
                        kbs.u(sb4, " at path ", getPath());
                        return;
                    }
                }
                this.C = 0;
            }
            i++;
            this.C = 0;
        } while (i != 0);
        int[] iArr = this.w;
        int i3 = this.a - 1;
        iArr[i3] = iArr[i3] + 1;
        this.c[i3] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.A + Extension.C_BRAKE;
    }

    public final boolean v(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case HProv.PP_CIPHEROID /* 93 */:
                            return false;
                        case HProv.PP_HASHOID /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1.skip(r3);
        r2 = com.squareup.moshi.JsonUtf8Reader.K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 != 47) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        e();
        r5 = r5.K(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        r5 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        if (r5.S(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        e();
        r10 = r1.e(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r10 == 42) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.J(com.squareup.moshi.JsonUtf8Reader.L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        r5 = r5 + r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        c("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
    
        r5 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.K(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005d, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005b, code lost:
    
        r5 = r1.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w(boolean z) {
        byte e;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                qq6 qq6Var = this.A;
                if (!qq6Var.S(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                long j = i;
                yp6 yp6Var = this.B;
                e = yp6Var.e(j);
                if (e != 10 && e != 32 && e != 13 && e != 9) {
                    break;
                }
                i = i2;
            }
        }
        return e;
    }

    public JsonUtf8Reader(qq6 qq6Var) {
        this.C = 0;
        if (qq6Var != null) {
            this.A = qq6Var;
            this.B = qq6Var.h();
            a(6);
            return;
        }
        ny61.t("source == null");
        throw null;
    }
}
