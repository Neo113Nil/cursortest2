package com.airbnb.lottie.parser.moshi;

import defpackage.hzk;
import defpackage.jci0;
import defpackage.ng70;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.uza;
import defpackage.yp6;
import java.io.EOFException;
import java.nio.charset.Charset;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class c extends a {
    public static final ByteString E;
    public static final ByteString F;
    public static final ByteString G;
    public int A;
    public long B;
    public int C;
    public String D;
    public final jci0 y;
    public final yp6 z;

    static {
        Charset charset = uza.a;
        ByteString byteString = new ByteString("'\\".getBytes(charset));
        byteString.b = "'\\";
        E = byteString;
        ByteString byteString2 = new ByteString("\"\\".getBytes(charset));
        byteString2.b = "\"\\";
        F = byteString2;
        ByteString byteString3 = new ByteString("{}[]:, \n\t\r\f/\\;#=".getBytes(charset));
        byteString3.b = "{}[]:, \n\t\r\f/\\;#=";
        G = byteString3;
        HexString.STR_CR.getBytes(charset);
        "*/".getBytes(charset);
    }

    public c(jci0 jci0Var) {
        this.b = new int[32];
        this.c = new String[32];
        this.w = new int[32];
        this.A = 0;
        this.y = jci0Var;
        this.z = jci0Var.b;
        n(6);
    }

    public final void B() {
        w("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cb, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cd, code lost:
    
        r23.C = r2;
        r9 = 17;
        r23.A = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        if (I(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        if (r4 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ac, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ae, code lost:
    
        if (r13 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b2, code lost:
    
        if (r8 != r18) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b4, code lost:
    
        if (r13 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
    
        if (r13 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ba, code lost:
    
        r23.B = r8;
        r7.skip(r2);
        r9 = 16;
        r23.A = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c5, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D() {
        int i;
        int i2;
        String str;
        String str2;
        long j;
        char e;
        int i3;
        int i4;
        int[] iArr = this.b;
        int i5 = this.a - 1;
        int i6 = iArr[i5];
        yp6 yp6Var = this.z;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int P = P(true);
            yp6Var.readByte();
            if (P != 44) {
                if (P == 59) {
                    B();
                    throw null;
                }
                if (P == 93) {
                    this.A = 4;
                    return 4;
                }
                w("Unterminated array");
                throw null;
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5) {
                    int P2 = P(true);
                    yp6Var.readByte();
                    if (P2 != 44) {
                        if (P2 == 59) {
                            B();
                            throw null;
                        }
                        if (P2 == 125) {
                            this.A = 2;
                            return 2;
                        }
                        w("Unterminated object");
                        throw null;
                    }
                }
                int P3 = P(true);
                if (P3 == 34) {
                    yp6Var.readByte();
                    this.A = 13;
                    return 13;
                }
                if (P3 == 39) {
                    yp6Var.readByte();
                    B();
                    throw null;
                }
                if (P3 != 125) {
                    B();
                    throw null;
                }
                if (i6 == 5) {
                    w("Expected name");
                    throw null;
                }
                yp6Var.readByte();
                this.A = 2;
                return 2;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int P4 = P(true);
                yp6Var.readByte();
                if (P4 != 58) {
                    if (P4 != 61) {
                        w("Expected ':'");
                        throw null;
                    }
                    B();
                    throw null;
                }
            } else if (i6 == 6) {
                iArr[i5] = 7;
            } else {
                if (i6 == 7) {
                    if (P(false) == -1) {
                        this.A = 18;
                        return 18;
                    }
                    B();
                    throw null;
                }
                if (i6 == 8) {
                    ny61.r("JsonReader is closed");
                    return 0;
                }
            }
        }
        int P5 = P(true);
        if (P5 == 34) {
            yp6Var.readByte();
            this.A = 9;
            return 9;
        }
        if (P5 == 39) {
            B();
            throw null;
        }
        if (P5 != 44 && P5 != 59) {
            if (P5 == 91) {
                yp6Var.readByte();
                this.A = 3;
                return 3;
            }
            if (P5 != 93) {
                if (P5 == 123) {
                    yp6Var.readByte();
                    this.A = 1;
                    return 1;
                }
                byte e2 = yp6Var.e(0L);
                jci0 jci0Var = this.y;
                if (e2 == 116 || e2 == 84) {
                    i = 5;
                    i2 = 0;
                    str2 = "true";
                    str = "TRUE";
                } else if (e2 == 102 || e2 == 70) {
                    i2 = 0;
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                } else if (e2 == 110 || e2 == 78) {
                    i2 = 0;
                    i = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j = 0;
                    i = 0;
                    i2 = 0;
                    if (i == 0) {
                        return i;
                    }
                    int i7 = 1;
                    int i8 = i2;
                    int i9 = i8;
                    int i10 = i9;
                    long j2 = j;
                    while (true) {
                        int i11 = i9 + 1;
                        if (!jci0Var.S(i11)) {
                            break;
                        }
                        byte e3 = yp6Var.e(i9);
                        if (e3 != 43) {
                            if (e3 == 69 || e3 == 101) {
                                i4 = 6;
                                if (i8 != 2 && i8 != 4) {
                                    break;
                                }
                                i8 = 5;
                                i9 = i11;
                            } else if (e3 == 45) {
                                i4 = 6;
                                if (i8 == 0) {
                                    i8 = 1;
                                    i10 = 1;
                                    i9 = i11;
                                } else {
                                    if (i8 != 5) {
                                        break;
                                    }
                                    i8 = i4;
                                    i9 = i11;
                                }
                            } else if (e3 == 46) {
                                i4 = 6;
                                if (i8 != 2) {
                                    break;
                                }
                                i8 = 3;
                                i9 = i11;
                            } else {
                                if (e3 < 48 || e3 > 57) {
                                    break;
                                }
                                if (i8 == 1 || i8 == 0) {
                                    i4 = 6;
                                    j2 = -(e3 - 48);
                                    i8 = 2;
                                } else {
                                    if (i8 == 2) {
                                        if (j2 == j) {
                                            break;
                                        }
                                        long j3 = (10 * j2) - (e3 - 48);
                                        i7 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i2;
                                        j2 = j3;
                                    } else if (i8 == 3) {
                                        i8 = 4;
                                    } else {
                                        i4 = 6;
                                        if (i8 == 5 || i8 == 6) {
                                            i8 = 7;
                                        }
                                    }
                                    i4 = 6;
                                    i9 = i11;
                                }
                                i9 = i11;
                            }
                            if (i3 == 0) {
                                return i3;
                            }
                            if (I(yp6Var.e(j))) {
                                B();
                                throw null;
                            }
                            w("Expected value");
                            throw null;
                        }
                        i4 = 6;
                        if (i8 != 5) {
                            break;
                        }
                        i8 = i4;
                        i9 = i11;
                    }
                    i3 = i2;
                    if (i3 == 0) {
                    }
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 < length) {
                        int i13 = i12 + 1;
                        if (!jci0Var.S(i13) || ((e = yp6Var.e(i12)) != str2.charAt(i12) && e != str.charAt(i12))) {
                            break;
                        }
                        i12 = i13;
                    } else if (!jci0Var.S(length + 1) || !I(yp6Var.e(length))) {
                        yp6Var.skip(length);
                        this.A = i;
                    }
                }
                i = i2;
                if (i == 0) {
                }
            } else if (i6 == 1) {
                yp6Var.readByte();
                this.A = 4;
                return 4;
            }
        }
        if (i6 == 1 || i6 == 2) {
            B();
            throw null;
        }
        w("Unexpected value");
        throw null;
    }

    public final int G(String str, hzk hzkVar) {
        int length = ((String[]) hzkVar.a).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) hzkVar.a)[i])) {
                this.A = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean I(int i) {
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
        B();
        throw null;
    }

    public final int P(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            jci0 jci0Var = this.y;
            if (!jci0Var.S(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            yp6 yp6Var = this.z;
            byte e = yp6Var.e(j);
            if (e != 10 && e != 32 && e != 13 && e != 9) {
                yp6Var.skip(j);
                if (e == 47) {
                    if (jci0Var.S(2L)) {
                        B();
                        throw null;
                    }
                } else if (e == 35) {
                    B();
                    throw null;
                }
                return e;
            }
            i = i2;
        }
    }

    public final String R(ByteString byteString) {
        StringBuilder sb = null;
        while (true) {
            long K = this.y.K(byteString);
            if (K == -1) {
                w("Unterminated string");
                throw null;
            }
            yp6 yp6Var = this.z;
            if (yp6Var.e(K) != 92) {
                if (sb == null) {
                    String T = yp6Var.T(K, uza.a);
                    yp6Var.readByte();
                    return T;
                }
                sb.append(yp6Var.T(K, uza.a));
                yp6Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(yp6Var.T(K, uza.a));
            yp6Var.readByte();
            sb.append(U());
        }
    }

    public final String T() {
        long K = this.y.K(G);
        yp6 yp6Var = this.z;
        if (K == -1) {
            return yp6Var.I0();
        }
        yp6Var.getClass();
        return yp6Var.T(K, uza.a);
    }

    public final char U() {
        int i;
        jci0 jci0Var = this.y;
        if (!jci0Var.S(1L)) {
            w("Unterminated escape sequence");
            throw null;
        }
        yp6 yp6Var = this.z;
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
            w("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!jci0Var.S(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(getPath()));
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
                    w("\\u".concat(yp6Var.T(4L, uza.a)));
                    throw null;
                }
                i = e - 55;
            }
            c = (char) (i + c2);
        }
        yp6Var.skip(4L);
        return c;
    }

    public final void W(ByteString byteString) {
        while (true) {
            long K = this.y.K(byteString);
            if (K == -1) {
                w("Unterminated string");
                throw null;
            }
            yp6 yp6Var = this.z;
            if (yp6Var.e(K) != 92) {
                yp6Var.skip(K + 1);
                return;
            } else {
                yp6Var.skip(K + 1);
                U();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void a() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 3) {
            n(1);
            this.w[this.a - 1] = 0;
            this.A = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(k());
            b.a(sb, getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void c() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 1) {
            n(3);
            this.A = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(k());
            b.a(sb, getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A = 0;
        this.b[0] = 8;
        this.a = 1;
        this.z.clear();
        this.y.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void d() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(k());
            b.a(sb, getPath());
        } else {
            int i2 = this.a;
            this.a = i2 - 1;
            int[] iArr = this.w;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.A = 0;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void e() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(k());
            b.a(sb, getPath());
            return;
        }
        int i2 = this.a;
        int i3 = i2 - 1;
        this.a = i3;
        this.c[i3] = null;
        int[] iArr = this.w;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.A = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean hasNext() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final JsonReader$Token k() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        switch (i) {
            case 1:
                return JsonReader$Token.BEGIN_OBJECT;
            case 2:
                return JsonReader$Token.END_OBJECT;
            case 3:
                return JsonReader$Token.BEGIN_ARRAY;
            case 4:
                return JsonReader$Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader$Token.BOOLEAN;
            case 7:
                return JsonReader$Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader$Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader$Token.NAME;
            case 16:
            case 17:
                return JsonReader$Token.NUMBER;
            case 18:
                return JsonReader$Token.END_DOCUMENT;
            default:
                ny61.w();
                return null;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean nextBoolean() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 5) {
            this.A = 0;
            int[] iArr = this.w;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(k());
            b.a(sb, getPath());
            return false;
        }
        this.A = 0;
        int[] iArr2 = this.w;
        int i3 = this.a - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final double nextDouble() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 16) {
            this.A = 0;
            int[] iArr = this.w;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.B;
        }
        if (i == 17) {
            long j = this.C;
            yp6 yp6Var = this.z;
            yp6Var.getClass();
            this.D = yp6Var.T(j, uza.a);
        } else if (i == 9) {
            this.D = R(F);
        } else if (i == 8) {
            this.D = R(E);
        } else if (i == 10) {
            this.D = T();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(k());
            b.a(sb, getPath());
            return 0.0d;
        }
        this.A = 11;
        try {
            double parseDouble = Double.parseDouble(this.D);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder u = oyr.u(parseDouble, "JSON forbids NaN and infinities: ", " at path ");
                u.append(getPath());
                throw new JsonEncodingException(u.toString());
            }
            this.D = null;
            this.A = 0;
            int[] iArr2 = this.w;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.D + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int nextInt() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 16) {
            long j = this.B;
            int i2 = (int) j;
            if (j == i2) {
                this.A = 0;
                int[] iArr = this.w;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.B + " at path " + getPath());
        }
        if (i == 17) {
            long j2 = this.C;
            yp6 yp6Var = this.z;
            yp6Var.getClass();
            this.D = yp6Var.T(j2, uza.a);
        } else if (i == 9 || i == 8) {
            String R = i == 9 ? R(F) : R(E);
            this.D = R;
            try {
                int parseInt = Integer.parseInt(R);
                this.A = 0;
                int[] iArr2 = this.w;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(k());
            b.a(sb, getPath());
            return 0;
        }
        this.A = 11;
        try {
            double parseDouble = Double.parseDouble(this.D);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.D = null;
                this.A = 0;
                int[] iArr3 = this.w;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.D + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.D + " at path " + getPath());
        }
    }

    public final String nextName() {
        String str;
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 14) {
            str = T();
        } else if (i == 13) {
            str = R(F);
        } else if (i == 12) {
            str = R(E);
        } else {
            if (i != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(k());
                b.a(sb, getPath());
                return null;
            }
            str = this.D;
        }
        this.A = 0;
        this.c[this.a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final String nextString() {
        String T;
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 10) {
            T = T();
        } else if (i == 9) {
            T = R(F);
        } else if (i == 8) {
            T = R(E);
        } else if (i == 11) {
            T = this.D;
            this.D = null;
        } else if (i == 16) {
            T = Long.toString(this.B);
        } else {
            if (i != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(k());
                b.a(sb, getPath());
                return null;
            }
            long j = this.C;
            yp6 yp6Var = this.z;
            yp6Var.getClass();
            T = yp6Var.T(j, uza.a);
        }
        this.A = 0;
        int[] iArr = this.w;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return T;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int o(hzk hzkVar) {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return G(this.D, hzkVar);
        }
        int h0 = this.y.h0((ng70) hzkVar.b);
        if (h0 != -1) {
            this.A = 0;
            this.c[this.a - 1] = ((String[]) hzkVar.a)[h0];
            return h0;
        }
        String str = this.c[this.a - 1];
        String nextName = nextName();
        int G2 = G(nextName, hzkVar);
        if (G2 == -1) {
            this.A = 15;
            this.D = nextName;
            this.c[this.a - 1] = str;
        }
        return G2;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void skipValue() {
        int i = 0;
        do {
            int i2 = this.A;
            if (i2 == 0) {
                i2 = D();
            }
            if (i2 == 3) {
                n(1);
            } else if (i2 == 1) {
                n(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(k());
                        b.a(sb, getPath());
                        return;
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(k());
                        b.a(sb2, getPath());
                        return;
                    }
                    this.a--;
                } else {
                    yp6 yp6Var = this.z;
                    if (i2 == 14 || i2 == 10) {
                        long K = this.y.K(G);
                        if (K == -1) {
                            K = yp6Var.b;
                        }
                        yp6Var.skip(K);
                    } else if (i2 == 9 || i2 == 13) {
                        W(F);
                    } else if (i2 == 8 || i2 == 12) {
                        W(E);
                    } else if (i2 == 17) {
                        yp6Var.skip(this.C);
                    } else if (i2 == 18) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(k());
                        b.a(sb3, getPath());
                        return;
                    }
                }
                this.A = 0;
            }
            i++;
            this.A = 0;
        } while (i != 0);
        int[] iArr = this.w;
        int i3 = this.a - 1;
        iArr[i3] = iArr[i3] + 1;
        this.c[i3] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.y + Extension.C_BRAKE;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void v() {
        int i = this.A;
        if (i == 0) {
            i = D();
        }
        if (i == 14) {
            long K = this.y.K(G);
            yp6 yp6Var = this.z;
            if (K == -1) {
                K = yp6Var.b;
            }
            yp6Var.skip(K);
        } else if (i == 13) {
            W(F);
        } else if (i == 12) {
            W(E);
        } else if (i != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(k());
            b.a(sb, getPath());
            return;
        }
        this.A = 0;
        this.c[this.a - 1] = "null";
    }
}
