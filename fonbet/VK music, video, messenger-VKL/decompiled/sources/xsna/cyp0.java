package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import xsna.hu8;

/* compiled from: UTF8StreamJsonParser.java */
/* loaded from: classes12.dex */
public final class cyp0 extends lj90 {
    public static final int R = JsonParser.Feature.ALLOW_TRAILING_COMMA.k();
    public static final int S = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.k();
    public static final int T = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.k();
    public static final int U = JsonParser.Feature.ALLOW_MISSING_VALUES.k();
    public static final int V = JsonParser.Feature.ALLOW_SINGLE_QUOTES.k();
    public static final int W = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.k();
    public static final int X = JsonParser.Feature.ALLOW_COMMENTS.k();
    public static final int Y = JsonParser.Feature.ALLOW_YAML_COMMENTS.k();
    public static final int[] Z = amb.f;
    public static final int[] a0 = amb.e;
    public final hu8 L;
    public int[] M;
    public boolean N;
    public InputStream O;
    public byte[] P;
    public final boolean Q;

    public cyp0(tnv tnvVar, int i, InputStream inputStream, hu8 hu8Var, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(tnvVar, i);
        this.M = new int[16];
        this.O = inputStream;
        this.L = hu8Var;
        this.P = bArr;
        this.p = i2;
        this.q = i3;
        this.t = i2 - i4;
        this.r = (-i2) + i4;
        this.Q = z;
    }

    public static final int Y0(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    public final char A0() throws IOException {
        if (this.p >= this.q && !M0()) {
            U(" in character escape sequence", JsonToken.VALUE_STRING);
            throw null;
        }
        byte[] bArr = this.P;
        int i = this.p;
        this.p = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            char z0 = (char) z0(b);
            j0(z0);
            return z0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.p >= this.q && !M0()) {
                U(" in character escape sequence", JsonToken.VALUE_STRING);
                throw null;
            }
            byte[] bArr2 = this.P;
            int i4 = this.p;
            this.p = i4 + 1;
            int i5 = bArr2[i4] & 255;
            int i6 = amb.k[i5];
            if (i6 < 0) {
                X(i5, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i6;
        }
        return (char) i2;
    }

    public final int A1() throws IOException {
        while (true) {
            if (this.p >= this.q && !M0()) {
                Q();
                return -1;
            }
            byte[] bArr = this.P;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    p1();
                } else {
                    if (i3 != 35) {
                        return i3;
                    }
                    if ((this.b & Y) == 0) {
                        return i3;
                    }
                    q1();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.s++;
                this.t = i2;
            } else if (i3 == 13) {
                l1();
            } else if (i3 != 9) {
                a0(i3);
                throw null;
            }
        }
    }

    public final int B0(int i) throws IOException {
        if (this.p >= this.q) {
            O0();
        }
        byte[] bArr = this.P;
        int i2 = this.p;
        int i3 = i2 + 1;
        this.p = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & CharsetEncoder.DEFAULT_REPLACEMENT);
        }
        j1(b & 255, i3);
        throw null;
    }

    public final int C0(int i) throws IOException {
        if (this.p >= this.q) {
            O0();
        }
        int i2 = i & 15;
        byte[] bArr = this.P;
        int i3 = this.p;
        int i4 = i3 + 1;
        this.p = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            j1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & CharsetEncoder.DEFAULT_REPLACEMENT);
        if (i4 >= this.q) {
            O0();
        }
        byte[] bArr2 = this.P;
        int i6 = this.p;
        int i7 = i6 + 1;
        this.p = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & CharsetEncoder.DEFAULT_REPLACEMENT);
        }
        j1(b2 & 255, i7);
        throw null;
    }

    public final void C1() {
        this.u = this.s;
        this.v = this.p - this.t;
    }

    public final int D0(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this.P;
        int i3 = this.p;
        int i4 = i3 + 1;
        this.p = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            j1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & CharsetEncoder.DEFAULT_REPLACEMENT);
        int i6 = i3 + 2;
        this.p = i6;
        byte b2 = bArr[i4];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & CharsetEncoder.DEFAULT_REPLACEMENT);
        }
        j1(b2 & 255, i6);
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String E() throws IOException {
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        c7f0 c7f0Var = this.y;
        if (jsonToken != jsonToken2) {
            if (jsonToken == null) {
                return null;
            }
            int j = jsonToken.j();
            return j != 5 ? (j == 6 || j == 7 || j == 8) ? c7f0Var.d() : jsonToken.i() : this.w.g;
        }
        if (!this.N) {
            return c7f0Var.d();
        }
        this.N = false;
        int i = this.p;
        if (i >= this.q) {
            O0();
            i = this.p;
        }
        char[] e = c7f0Var.e();
        int min = Math.min(this.q, e.length + i);
        byte[] bArr = this.P;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (Z[i3] == 0) {
                i++;
                e[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.p = i + 1;
                c7f0Var.i = i2;
                if (c7f0Var.g > 0) {
                    return c7f0Var.d();
                }
                c7f0Var.m(i2);
                String str = i2 == 0 ? "" : new String(c7f0Var.h, 0, i2);
                c7f0Var.j = str;
                return str;
            }
        }
        this.p = i;
        I0(e, i2);
        return c7f0Var.d();
    }

    public final int E0(int i) throws IOException {
        if (this.p >= this.q) {
            O0();
        }
        byte[] bArr = this.P;
        int i2 = this.p;
        int i3 = i2 + 1;
        this.p = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            j1(b & 255, i3);
            throw null;
        }
        int i4 = ((i & 7) << 6) | (b & CharsetEncoder.DEFAULT_REPLACEMENT);
        if (i3 >= this.q) {
            O0();
        }
        byte[] bArr2 = this.P;
        int i5 = this.p;
        int i6 = i5 + 1;
        this.p = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            j1(b2 & 255, i6);
            throw null;
        }
        int i7 = (i4 << 6) | (b2 & CharsetEncoder.DEFAULT_REPLACEMENT);
        if (i6 >= this.q) {
            O0();
        }
        byte[] bArr3 = this.P;
        int i8 = this.p;
        int i9 = i8 + 1;
        this.p = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) == 128) {
            return ((i7 << 6) | (b3 & CharsetEncoder.DEFAULT_REPLACEMENT)) - 65536;
        }
        j1(b3 & 255, i9);
        throw null;
    }

    public final int F1() throws IOException {
        if (this.p < this.q || M0()) {
            byte[] bArr = this.P;
            int i = this.p;
            int i2 = bArr[i] & 255;
            if (i2 >= 48 && i2 <= 57) {
                if ((this.b & S) == 0) {
                    throw b("Invalid numeric value: Leading zeroes not allowed");
                }
                this.p = i + 1;
                if (i2 == 48) {
                    do {
                        if (this.p >= this.q && !M0()) {
                            return i2;
                        }
                        byte[] bArr2 = this.P;
                        int i3 = this.p;
                        i2 = bArr2[i3] & 255;
                        if (i2 >= 48 && i2 <= 57) {
                            this.p = i3 + 1;
                        }
                    } while (i2 == 48);
                }
                return i2;
            }
        }
        return 48;
    }

    public final void G0() throws IOException {
        int i = this.p;
        if (i >= this.q) {
            O0();
            i = this.p;
        }
        c7f0 c7f0Var = this.y;
        char[] e = c7f0Var.e();
        int min = Math.min(this.q, e.length + i);
        byte[] bArr = this.P;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (Z[i3] == 0) {
                i++;
                e[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.p = i + 1;
                c7f0Var.i = i2;
                return;
            }
        }
        this.p = i;
        I0(e, i2);
    }

    public final void G1(int i) throws IOException {
        int i2 = this.p;
        int i3 = i2 + 1;
        this.p = i3;
        if (i != 9) {
            if (i == 10) {
                this.s++;
                this.t = i3;
            } else if (i == 13) {
                this.p = i2;
            } else {
                if (i == 32) {
                    return;
                }
                X(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] H() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return null;
        }
        int j = jsonToken.j();
        if (j != 5) {
            if (j != 6) {
                if (j != 7 && j != 8) {
                    return this.c.h();
                }
            } else if (this.N) {
                this.N = false;
                G0();
            }
            return this.y.i();
        }
        if (!this.A) {
            String str = this.w.g;
            int length = str.length();
            char[] cArr = this.z;
            if (cArr == null) {
                tnv tnvVar = this.m;
                tnv.a(tnvVar.k);
                char[] a = tnvVar.e.a(3, length);
                tnvVar.k = a;
                this.z = a;
            } else if (cArr.length < length) {
                this.z = new char[length];
            }
            str.getChars(0, length, this.z, 0);
            this.A = true;
        }
        return this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H1(int i, int i2, int[] iArr) throws JsonParseException, StreamConstraintsException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = ((i << 2) - 4) + i2;
        int i9 = 3;
        if (i2 < 4) {
            int i10 = i - 1;
            i3 = iArr[i10];
            iArr[i10] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        c7f0 c7f0Var = this.y;
        char[] e = c7f0Var.e();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i8) {
            int i13 = iArr[i11 >> 2] >> ((3 - (i11 & 3)) << i9);
            int i14 = i13 & 255;
            int i15 = i11 + 1;
            int i16 = i9;
            if (i14 > 127) {
                if ((i13 & 224) == 192) {
                    i4 = i13 & 31;
                    i5 = 1;
                } else if ((i13 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    i4 = i13 & 15;
                    i5 = 2;
                } else {
                    if ((i13 & 248) != 240) {
                        h1(i14);
                        throw null;
                    }
                    i4 = i13 & 7;
                    i5 = i16;
                }
                if (i15 + i5 > i8) {
                    U(" in field name", JsonToken.FIELD_NAME);
                    throw null;
                }
                int i17 = iArr[i15 >> 2] >> ((3 - (i15 & 3)) << 3);
                int i18 = i11 + 2;
                if ((i17 & PsExtractor.AUDIO_STREAM) != 128) {
                    i1(i17);
                    throw null;
                }
                int i19 = (i4 << 6) | (i17 & 63);
                if (i5 > 1) {
                    int i20 = iArr[i18 >> 2] >> ((3 - (i18 & 3)) << 3);
                    int i21 = i11 + 3;
                    if ((i20 & PsExtractor.AUDIO_STREAM) != 128) {
                        i1(i20);
                        throw null;
                    }
                    i19 = (i19 << 6) | (i20 & 63);
                    i7 = 2;
                    if (i5 > 2) {
                        int i22 = iArr[i21 >> 2] >> ((3 - (i21 & 3)) << 3);
                        int i23 = i11 + 4;
                        if ((i22 & PsExtractor.AUDIO_STREAM) != 128) {
                            i1(i22 & 255);
                            throw null;
                        }
                        i14 = (i19 << 6) | (i22 & 63);
                        i6 = i23;
                        i7 = 2;
                        if (i5 <= i7) {
                            int i24 = i14 - 65536;
                            if (i12 >= e.length) {
                                char[] cArr = c7f0Var.h;
                                int length = cArr.length;
                                int i25 = (length >> 1) + length;
                                if (i25 > 65536) {
                                    i25 = (length >> 2) + length;
                                }
                                e = Arrays.copyOf(cArr, i25);
                                c7f0Var.h = e;
                            }
                            e[i12] = (char) ((i24 >> 10) + 55296);
                            i14 = (i24 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | 56320;
                            i11 = i6;
                            i12++;
                        } else {
                            i11 = i6;
                        }
                    } else {
                        i6 = i21;
                    }
                } else {
                    i6 = i18;
                    i7 = 2;
                }
                i14 = i19;
                if (i5 <= i7) {
                }
            } else {
                i11 = i15;
            }
            if (i12 >= e.length) {
                char[] cArr2 = c7f0Var.h;
                int length2 = cArr2.length;
                int i26 = (length2 >> 1) + length2;
                if (i26 > 65536) {
                    i26 = (length2 >> 2) + length2;
                }
                char[] copyOf = Arrays.copyOf(cArr2, i26);
                c7f0Var.h = copyOf;
                e = copyOf;
            }
            e[i12] = (char) i14;
            i12++;
            i9 = i16;
        }
        String str = new String(e, 0, i12);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.L.f(str, iArr, i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int I() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken == null) {
            return 0;
        }
        int j = jsonToken.j();
        if (j == 5) {
            return this.w.g.length();
        }
        if (j != 6) {
            if (j != 7 && j != 8) {
                return this.c.h().length;
            }
        } else if (this.N) {
            this.N = false;
            G0();
        }
        return this.y.k();
    }

    public final void I0(char[] cArr, int i) throws IOException {
        byte[] bArr = this.P;
        while (true) {
            int i2 = this.p;
            if (i2 >= this.q) {
                O0();
                i2 = this.p;
            }
            int length = cArr.length;
            int i3 = 0;
            c7f0 c7f0Var = this.y;
            if (i >= length) {
                cArr = c7f0Var.g();
                i = 0;
            }
            int min = Math.min(this.q, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.p = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = Z[i5];
                if (i6 != 0) {
                    this.p = i4;
                    if (i5 == 34) {
                        c7f0Var.i = i;
                        return;
                    }
                    if (i6 == 1) {
                        i5 = A0();
                    } else if (i6 == 2) {
                        i5 = B0(i5);
                    } else if (i6 == 3) {
                        i5 = this.q - i4 >= 2 ? D0(i5) : C0(i5);
                    } else if (i6 == 4) {
                        int E0 = E0(i5);
                        int i7 = i + 1;
                        cArr[i] = (char) ((E0 >> 10) | 55296);
                        if (i7 >= cArr.length) {
                            cArr = c7f0Var.g();
                            i = 0;
                        } else {
                            i = i7;
                        }
                        i5 = (E0 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | 56320;
                    } else {
                        if (i5 >= 32) {
                            g1(i5);
                            throw null;
                        }
                        o0(i5, "string value");
                    }
                    if (i >= cArr.length) {
                        cArr = c7f0Var.g();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    public final String I1(int i, int i2) throws JsonParseException, StreamConstraintsException {
        int Y0 = Y0(i, i2);
        String j = this.L.j(Y0);
        if (j != null) {
            return j;
        }
        int[] iArr = this.M;
        iArr[0] = Y0;
        return H1(1, i2, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != 8) goto L17;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J() throws IOException {
        JsonToken jsonToken = this.c;
        if (jsonToken != null) {
            int j = jsonToken.j();
            if (j != 6) {
                if (j != 7) {
                }
            } else if (this.N) {
                this.N = false;
                G0();
            }
            int i = this.y.c;
            if (i >= 0) {
                return i;
            }
        }
        return 0;
    }

    public final JsonToken J0(int i, boolean z, boolean z2) throws IOException {
        String str;
        int i2 = this.b;
        if (i == 73) {
            if (this.p >= this.q && !M0()) {
                V(JsonToken.VALUE_NUMBER_FLOAT);
                throw null;
            }
            byte[] bArr = this.P;
            int i3 = this.p;
            this.p = i3 + 1;
            i = bArr[i3];
            if (i == 78) {
                str = z ? "-INF" : "+INF";
            } else if (i == 110) {
                str = z ? "-Infinity" : "+Infinity";
            }
            T0(3, str);
            if ((i2 & T) != 0) {
                return u0(z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY, str);
            }
            throw b("Non-standard token '" + str + "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j().j(i2) || z) {
            Y(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
            throw null;
        }
        Y(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        throw null;
    }

    public final String J1(int i, int i2, int i3) throws JsonParseException, StreamConstraintsException {
        int Y0 = Y0(i2, i3);
        String k = this.L.k(i, Y0);
        if (k != null) {
            return k;
        }
        int[] iArr = this.M;
        iArr[0] = i;
        iArr[1] = Y0;
        return H1(2, i3, iArr);
    }

    public final String K1(int i, int i2, int i3, int i4) throws JsonParseException, StreamConstraintsException {
        int Y0 = Y0(i3, i4);
        String l = this.L.l(i, i2, Y0);
        if (l != null) {
            return l;
        }
        int[] iArr = this.M;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = Y0(Y0, i4);
        return H1(3, i4, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r13 != 44) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r12.w.d() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if ((r0 & xsna.cyp0.U) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r12.p--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
    
        if (r12.w.b() == false) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonToken L0(int i) throws IOException {
        int A0;
        int i2 = this.b;
        if (i != 39) {
            int i3 = T;
            if (i == 73) {
                T0(1, "Infinity");
                if ((i2 & i3) != 0) {
                    return u0(Double.POSITIVE_INFINITY, "Infinity");
                }
                throw b("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            }
            if (i == 78) {
                T0(1, "NaN");
                if ((i2 & i3) != 0) {
                    return u0(Double.NaN, "NaN");
                }
                throw b("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            }
            if (i != 93) {
                if (i != 125) {
                    if (i == 43) {
                        if (this.p >= this.q && !M0()) {
                            V(JsonToken.VALUE_NUMBER_INT);
                            throw null;
                        }
                        byte[] bArr = this.P;
                        int i4 = this.p;
                        this.p = i4 + 1;
                        return J0(bArr[i4] & 255, false, true);
                    }
                }
            }
            X(i, "expected a value");
            throw null;
        }
        if ((i2 & V) != 0) {
            c7f0 c7f0Var = this.y;
            char[] e = c7f0Var.e();
            byte[] bArr2 = this.P;
            int i5 = 0;
            while (true) {
                if (this.p >= this.q) {
                    O0();
                }
                if (i5 >= e.length) {
                    e = c7f0Var.g();
                    i5 = 0;
                }
                int i6 = this.q;
                int length = (e.length - i5) + this.p;
                if (length < i6) {
                    i6 = length;
                }
                while (true) {
                    int i7 = this.p;
                    if (i7 < i6) {
                        int i8 = i7 + 1;
                        this.p = i8;
                        int i9 = bArr2[i7] & 255;
                        if (i9 == 39) {
                            c7f0Var.i = i5;
                            return JsonToken.VALUE_STRING;
                        }
                        int i10 = Z[i9];
                        if (i10 == 0 || i9 == 34) {
                            e[i5] = (char) i9;
                            i5++;
                        } else {
                            if (i10 == 1) {
                                A0 = A0();
                            } else if (i10 == 2) {
                                A0 = B0(i9);
                            } else if (i10 == 3) {
                                A0 = this.q - i8 >= 2 ? D0(i9) : C0(i9);
                            } else {
                                if (i10 != 4) {
                                    if (i9 < 32) {
                                        o0(i9, "string value");
                                    }
                                    g1(i9);
                                    throw null;
                                }
                                int E0 = E0(i9);
                                int i11 = i5 + 1;
                                e[i5] = (char) ((E0 >> 10) | 55296);
                                if (i11 >= e.length) {
                                    e = c7f0Var.g();
                                    i5 = 0;
                                } else {
                                    i5 = i11;
                                }
                                A0 = (E0 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | 56320;
                            }
                            if (i5 >= e.length) {
                                e = c7f0Var.g();
                                i5 = 0;
                            }
                            e[i5] = (char) A0;
                            i5++;
                        }
                    }
                }
            }
        }
        if (!Character.isJavaIdentifierStart(i)) {
            X(i, "expected a valid value ".concat(p0()));
            throw null;
        }
        k1("" + ((char) i), p0());
        throw null;
    }

    public final boolean M0() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.O;
        if (inputStream != null && (length = (bArr = this.P).length) != 0) {
            int read = inputStream.read(bArr, 0, length);
            if (read > 0) {
                int i = this.q;
                this.r += i;
                this.t -= i;
                this.p = 0;
                this.q = read;
                return true;
            }
            c0();
            if (read == 0) {
                throw new IOException(h5s.c(this.P.length, " bytes", new StringBuilder("InputStream.read() returned 0 characters when trying to read ")));
            }
        }
        return false;
    }

    public final String M1(int i, int i2, int i3, int[] iArr) throws JsonParseException, StreamConstraintsException {
        if (i >= iArr.length) {
            iArr = lj90.t0(iArr.length, iArr);
            this.M = iArr;
        }
        int i4 = i + 1;
        iArr[i] = Y0(i2, i3);
        String m = this.L.m(i4, iArr);
        return m == null ? H1(i4, i3, iArr) : m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01aa, code lost:
    
        if ((xsna.cyp0.R & r6) == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ac, code lost:
    
        if (r1 == 93) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ae, code lost:
    
        if (r1 != 125) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b0, code lost:
    
        if (r1 != 125) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b2, code lost:
    
        C1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01bb, code lost:
    
        if (r24.w.c() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bd, code lost:
    
        r24.w = r24.w.d;
        r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        r24.c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c8, code lost:
    
        n0(']', 125);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cc, code lost:
    
        C1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d5, code lost:
    
        if (r24.w.b() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d7, code lost:
    
        r24.w = r24.w.d;
        r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
        r24.c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e2, code lost:
    
        n0('}', 93);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e5, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x073a  */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonToken N() throws IOException {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        String P1;
        int i4;
        int i5;
        String P12;
        int i6;
        int m1;
        byte b;
        byte b2;
        JsonToken e1;
        int i7;
        int i8 = this.b;
        if (this.c == JsonToken.FIELD_NAME) {
            this.A = false;
            JsonToken jsonToken = this.x;
            this.x = null;
            if (jsonToken == JsonToken.START_ARRAY) {
                r0(this.u, this.v);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                s0(this.u, this.v);
            }
            this.c = jsonToken;
            return jsonToken;
        }
        this.B = 0;
        if (this.N) {
            this.N = false;
            byte[] bArr = this.P;
            while (true) {
                int i9 = this.p;
                int i10 = this.q;
                if (i9 >= i10) {
                    O0();
                    i9 = this.p;
                    i10 = this.q;
                }
                while (true) {
                    if (i9 >= i10) {
                        this.p = i9;
                        break;
                    }
                    int i11 = i9 + 1;
                    int i12 = bArr[i9] & 255;
                    int i13 = Z[i12];
                    if (i13 != 0) {
                        this.p = i11;
                        if (i12 == 34) {
                            break;
                        }
                        if (i13 == 1) {
                            A0();
                        } else if (i13 == 2) {
                            r1();
                        } else if (i13 == 3) {
                            u1();
                        } else if (i13 == 4) {
                            v1();
                        } else {
                            if (i12 >= 32) {
                                g1(i12);
                                throw null;
                            }
                            o0(i12, "string value");
                        }
                    } else {
                        i9 = i11;
                    }
                }
            }
        }
        if (this.p < this.q || M0()) {
            byte[] bArr2 = this.P;
            int i14 = this.p;
            int i15 = i14 + 1;
            this.p = i15;
            i = bArr2[i14] & 255;
            if (i <= 32) {
                if (i != 32) {
                    if (i == 10) {
                        this.s++;
                        this.t = i15;
                    } else if (i == 13) {
                        l1();
                    } else if (i != 9) {
                        a0(i);
                        throw null;
                    }
                }
                while (true) {
                    int i16 = this.p;
                    if (i16 >= this.q) {
                        i = A1();
                        break;
                    }
                    byte[] bArr3 = this.P;
                    int i17 = i16 + 1;
                    this.p = i17;
                    int i18 = bArr3[i16] & 255;
                    if (i18 > 32) {
                        if (i18 == 47 || i18 == 35) {
                            this.p = i16;
                            i = A1();
                        } else {
                            i = i18;
                        }
                    } else if (i18 != 32) {
                        if (i18 == 10) {
                            this.s++;
                            this.t = i17;
                        } else if (i18 == 13) {
                            l1();
                        } else if (i18 != 9) {
                            a0(i18);
                            throw null;
                        }
                    }
                }
            } else if (i == 47 || i == 35) {
                this.p = i14;
                i = A1();
            }
        } else {
            Q();
            i = -1;
        }
        if (i < 0) {
            close();
            this.c = null;
            return null;
        }
        if (i == 93) {
            C1();
            if (!this.w.b()) {
                n0('}', 93);
                throw null;
            }
            this.w = this.w.d;
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            this.c = jsonToken2;
            return jsonToken2;
        }
        if (i == 125) {
            C1();
            if (!this.w.c()) {
                n0(']', 125);
                throw null;
            }
            this.w = this.w.d;
            JsonToken jsonToken3 = JsonToken.END_OBJECT;
            this.c = jsonToken3;
            return jsonToken3;
        }
        lay layVar = this.w;
        int i19 = layVar.b + 1;
        layVar.b = i19;
        if (layVar.a != 0 && i19 > 0) {
            if (i != 44) {
                X(i, "was expecting comma to separate " + this.w.e() + " entries");
                throw null;
            }
            while (true) {
                int i20 = this.p;
                if (i20 >= this.q) {
                    i = w1();
                    break;
                }
                byte[] bArr4 = this.P;
                int i21 = i20 + 1;
                this.p = i21;
                int i22 = bArr4[i20] & 255;
                if (i22 > 32) {
                    if (i22 == 47 || i22 == 35) {
                        this.p = i20;
                        i = w1();
                    } else {
                        i = i22;
                    }
                } else if (i22 != 32) {
                    if (i22 == 10) {
                        this.s++;
                        this.t = i21;
                    } else if (i22 == 13) {
                        l1();
                    } else if (i22 != 9) {
                        a0(i22);
                        throw null;
                    }
                }
            }
        }
        if (!this.w.c()) {
            C1();
            if (i == 34) {
                this.N = true;
                JsonToken jsonToken4 = JsonToken.VALUE_STRING;
                this.c = jsonToken4;
                return jsonToken4;
            }
            if (i == 43) {
                if (JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j().j(i8)) {
                    JsonToken e12 = e1(false);
                    this.c = e12;
                    return e12;
                }
                JsonToken L0 = L0(i);
                this.c = L0;
                return L0;
            }
            if (i == 91) {
                r0(this.u, this.v);
                JsonToken jsonToken5 = JsonToken.START_ARRAY;
                this.c = jsonToken5;
                return jsonToken5;
            }
            if (i == 102) {
                Q0();
                JsonToken jsonToken6 = JsonToken.VALUE_FALSE;
                this.c = jsonToken6;
                return jsonToken6;
            }
            if (i == 110) {
                R0();
                JsonToken jsonToken7 = JsonToken.VALUE_NULL;
                this.c = jsonToken7;
                return jsonToken7;
            }
            if (i == 116) {
                X0();
                JsonToken jsonToken8 = JsonToken.VALUE_TRUE;
                this.c = jsonToken8;
                return jsonToken8;
            }
            if (i == 123) {
                s0(this.u, this.v);
                JsonToken jsonToken9 = JsonToken.START_OBJECT;
                this.c = jsonToken9;
                return jsonToken9;
            }
            if (i == 45) {
                JsonToken e13 = e1(true);
                this.c = e13;
                return e13;
            }
            if (i == 46) {
                JsonToken a1 = a1(false);
                this.c = a1;
                return a1;
            }
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken f1 = f1(i);
                    this.c = f1;
                    return f1;
                default:
                    JsonToken L02 = L0(i);
                    this.c = L02;
                    return L02;
            }
        }
        int i23 = this.p;
        int[] iArr = a0;
        String str = "";
        if (i != 34) {
            hu8 hu8Var = this.L;
            if (i != 39 || (i8 & V) == 0) {
                z = false;
                if ((W & i8) == 0) {
                    X((char) z0(i), "was expecting double-quote to start field name");
                    throw null;
                }
                int[] iArr2 = amb.h;
                if (iArr2[i] != 0) {
                    X(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                    throw null;
                }
                int[] iArr3 = this.M;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (true) {
                    if (i24 < 4) {
                        i24++;
                        i |= i26 << 8;
                    } else {
                        if (i25 >= iArr3.length) {
                            iArr3 = lj90.t0(iArr3.length, iArr3);
                            this.M = iArr3;
                        }
                        iArr3[i25] = i26;
                        i25++;
                        i24 = 1;
                    }
                    i26 = i;
                    if (this.p >= this.q && !M0()) {
                        U(" in field name", JsonToken.FIELD_NAME);
                        throw null;
                    }
                    byte[] bArr5 = this.P;
                    int i27 = this.p;
                    i = bArr5[i27] & 255;
                    if (iArr2[i] != 0) {
                        if (i24 > 0) {
                            if (i25 >= iArr3.length) {
                                iArr3 = lj90.t0(iArr3.length, iArr3);
                                this.M = iArr3;
                            }
                            iArr3[i25] = i26;
                            i25++;
                        }
                        str = hu8Var.m(i25, iArr3);
                        if (str == null) {
                            str = H1(i25, i24, iArr3);
                        }
                    } else {
                        this.p = i27 + 1;
                    }
                }
            } else {
                if (i23 >= this.q && !M0()) {
                    U(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
                    throw null;
                }
                byte[] bArr6 = this.P;
                int i28 = this.p;
                z = false;
                this.p = i28 + 1;
                int i29 = bArr6[i28] & 255;
                if (i29 != 39) {
                    int[] iArr4 = this.M;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    for (int i33 = 39; i29 != i33; i33 = 39) {
                        if (iArr[i29] != 0 && i29 != 34) {
                            if (i29 != 92) {
                                o0(i29, "name");
                            } else {
                                i29 = A0();
                            }
                            if (i29 > 127) {
                                if (i30 >= 4) {
                                    if (i31 >= iArr4.length) {
                                        iArr4 = lj90.t0(iArr4.length, iArr4);
                                        this.M = iArr4;
                                    }
                                    iArr4[i31] = i32;
                                    i31++;
                                    i30 = 0;
                                    i32 = 0;
                                }
                                if (i29 < 2048) {
                                    i7 = (i32 << 8) | (i29 >> 6) | PsExtractor.AUDIO_STREAM;
                                    i30++;
                                } else {
                                    int i34 = (i32 << 8) | (i29 >> 12) | 224;
                                    int i35 = i30 + 1;
                                    if (i35 >= 4) {
                                        if (i31 >= iArr4.length) {
                                            iArr4 = lj90.t0(iArr4.length, iArr4);
                                            this.M = iArr4;
                                        }
                                        iArr4[i31] = i34;
                                        i31++;
                                        i34 = 0;
                                        i35 = 0;
                                    }
                                    i7 = (i34 << 8) | ((i29 >> 6) & 63) | 128;
                                    i30 = i35 + 1;
                                }
                                i32 = i7;
                                i29 = (i29 & 63) | 128;
                            }
                        }
                        if (i30 < 4) {
                            i30++;
                            i29 |= i32 << 8;
                        } else {
                            if (i31 >= iArr4.length) {
                                iArr4 = lj90.t0(iArr4.length, iArr4);
                                this.M = iArr4;
                            }
                            iArr4[i31] = i32;
                            i31++;
                            i30 = 1;
                        }
                        i32 = i29;
                        if (this.p >= this.q && !M0()) {
                            U(" in field name", JsonToken.FIELD_NAME);
                            throw null;
                        }
                        byte[] bArr7 = this.P;
                        int i36 = this.p;
                        this.p = i36 + 1;
                        i29 = bArr7[i36] & 255;
                    }
                    if (i30 > 0) {
                        if (i31 >= iArr4.length) {
                            iArr4 = lj90.t0(iArr4.length, iArr4);
                            this.M = iArr4;
                        }
                        iArr4[i31] = Y0(i32, i30);
                        i31++;
                    }
                    str = hu8Var.m(i31, iArr4);
                    if (str == null) {
                        str = H1(i31, i30, iArr4);
                    }
                }
            }
        } else {
            z = false;
            int i37 = i23 + 13;
            int i38 = this.q;
            if (i37 <= i38) {
                byte[] bArr8 = this.P;
                int i39 = i23 + 1;
                this.p = i39;
                int i40 = bArr8[i23] & 255;
                if (iArr[i40] == 0) {
                    int i41 = i23 + 2;
                    this.p = i41;
                    int i42 = bArr8[i39] & 255;
                    if (iArr[i42] == 0) {
                        int i43 = i42 | (i40 << 8);
                        int i44 = i23 + 3;
                        this.p = i44;
                        int i45 = bArr8[i41] & 255;
                        if (iArr[i45] == 0) {
                            int i46 = (i43 << 8) | i45;
                            int i47 = i23 + 4;
                            this.p = i47;
                            int i48 = bArr8[i44] & 255;
                            if (iArr[i48] == 0) {
                                int i49 = (i46 << 8) | i48;
                                int i50 = i23 + 5;
                                this.p = i50;
                                int i51 = bArr8[i47] & 255;
                                if (iArr[i51] == 0) {
                                    int i52 = i23 + 6;
                                    this.p = i52;
                                    int i53 = bArr8[i50] & 255;
                                    if (iArr[i53] == 0) {
                                        int i54 = (i51 << 8) | i53;
                                        int i55 = i23 + 7;
                                        this.p = i55;
                                        int i56 = bArr8[i52] & 255;
                                        if (iArr[i56] != 0) {
                                            if (i56 == 34) {
                                                P12 = J1(i49, i54, 2);
                                                i2 = 2;
                                            } else {
                                                int[] iArr5 = this.M;
                                                iArr5[0] = i49;
                                                P12 = P1(1, i54, i56, 2, iArr5);
                                                i2 = 2;
                                            }
                                            P1 = P12;
                                            z2 = false;
                                            i3 = 3;
                                            this.w.f(P1);
                                            this.c = JsonToken.FIELD_NAME;
                                            i6 = this.p;
                                            if (i6 + 4 < this.q) {
                                                m1 = m1(z2);
                                            } else {
                                                byte[] bArr9 = this.P;
                                                byte b3 = bArr9[i6];
                                                if (b3 == 58) {
                                                    int i57 = i6 + 1;
                                                    this.p = i57;
                                                    b = bArr9[i57];
                                                    if (b <= 32) {
                                                        if (b == 32 || b == 9) {
                                                            int i58 = i6 + 2;
                                                            this.p = i58;
                                                            b2 = bArr9[i58];
                                                            if (b2 > 32) {
                                                                if (b2 == 47 || b2 == 35) {
                                                                    m1 = m1(true);
                                                                } else {
                                                                    this.p = i6 + i3;
                                                                    m1 = b2;
                                                                }
                                                            }
                                                        }
                                                        m1 = m1(true);
                                                    } else if (b == 47 || b == 35) {
                                                        m1 = m1(true);
                                                    } else {
                                                        this.p = i6 + i2;
                                                        m1 = b;
                                                    }
                                                } else {
                                                    if (b3 == 32 || b3 == 9) {
                                                        int i59 = i6 + 1;
                                                        this.p = i59;
                                                        b3 = bArr9[i59];
                                                    }
                                                    if (b3 == 58) {
                                                        int i60 = this.p;
                                                        int i61 = i60 + 1;
                                                        this.p = i61;
                                                        b = bArr9[i61];
                                                        if (b <= 32) {
                                                            if (b == 32 || b == 9) {
                                                                int i62 = i60 + 2;
                                                                this.p = i62;
                                                                b2 = bArr9[i62];
                                                                if (b2 > 32) {
                                                                    if (b2 == 47 || b2 == 35) {
                                                                        m1 = m1(true);
                                                                    } else {
                                                                        this.p = i60 + i3;
                                                                        m1 = b2;
                                                                    }
                                                                }
                                                            }
                                                            m1 = m1(true);
                                                        } else if (b == 47 || b == 35) {
                                                            m1 = m1(true);
                                                        } else {
                                                            this.p = i60 + i2;
                                                            m1 = b;
                                                        }
                                                    } else {
                                                        m1 = m1(z2);
                                                    }
                                                }
                                            }
                                            C1();
                                            if (m1 != 34) {
                                                this.N = true;
                                                this.x = JsonToken.VALUE_STRING;
                                                return this.c;
                                            }
                                            if (m1 == 43) {
                                                e1 = JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j().j(i8) ? e1(z2) : L0(m1);
                                            } else if (m1 == 91) {
                                                e1 = JsonToken.START_ARRAY;
                                            } else if (m1 == 102) {
                                                Q0();
                                                e1 = JsonToken.VALUE_FALSE;
                                            } else if (m1 == 110) {
                                                R0();
                                                e1 = JsonToken.VALUE_NULL;
                                            } else if (m1 == 116) {
                                                X0();
                                                e1 = JsonToken.VALUE_TRUE;
                                            } else if (m1 == 123) {
                                                e1 = JsonToken.START_OBJECT;
                                            } else if (m1 == 45) {
                                                e1 = e1(true);
                                            } else if (m1 != 46) {
                                                switch (m1) {
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                        e1 = f1(m1);
                                                        break;
                                                    default:
                                                        e1 = L0(m1);
                                                        break;
                                                }
                                            } else {
                                                e1 = a1(z2);
                                            }
                                            this.x = e1;
                                            return this.c;
                                        }
                                        i2 = 2;
                                        int i63 = (i54 << 8) | i56;
                                        int i64 = i23 + 8;
                                        this.p = i64;
                                        int i65 = bArr8[i55] & 255;
                                        if (iArr[i65] == 0) {
                                            i4 = 3;
                                            int i66 = (i63 << 8) | i65;
                                            int i67 = i23 + 9;
                                            this.p = i67;
                                            int i68 = bArr8[i64] & 255;
                                            if (iArr[i68] == 0) {
                                                int i69 = i23 + 10;
                                                this.p = i69;
                                                int i70 = bArr8[i67] & 255;
                                                if (iArr[i70] == 0) {
                                                    int i71 = (i68 << 8) | i70;
                                                    int i72 = i23 + 11;
                                                    this.p = i72;
                                                    int i73 = bArr8[i69] & 255;
                                                    if (iArr[i73] == 0) {
                                                        int i74 = (i71 << 8) | i73;
                                                        int i75 = i23 + 12;
                                                        this.p = i75;
                                                        int i76 = bArr8[i72] & 255;
                                                        if (iArr[i76] == 0) {
                                                            int i77 = (i74 << 8) | i76;
                                                            this.p = i37;
                                                            int i78 = bArr8[i75] & 255;
                                                            if (iArr[i78] == 0) {
                                                                int[] iArr6 = this.M;
                                                                iArr6[0] = i49;
                                                                iArr6[1] = i66;
                                                                iArr6[2] = i77;
                                                                int i79 = i78;
                                                                int i80 = 3;
                                                                while (true) {
                                                                    int i81 = this.p;
                                                                    int i82 = i81 + 4;
                                                                    if (i82 > this.q) {
                                                                        str = P1(i80, 0, i79, 0, this.M);
                                                                        break;
                                                                    }
                                                                    int i83 = i81 + 1;
                                                                    this.p = i83;
                                                                    int i84 = bArr8[i81] & 255;
                                                                    if (iArr[i84] != 0) {
                                                                        str = i84 == 34 ? M1(i80, i79, 1, this.M) : P1(i80, i79, i84, 1, this.M);
                                                                    } else {
                                                                        int i85 = (i79 << 8) | i84;
                                                                        int i86 = i81 + 2;
                                                                        this.p = i86;
                                                                        int i87 = bArr8[i83] & 255;
                                                                        if (iArr[i87] != 0) {
                                                                            str = i87 == 34 ? M1(i80, i85, 2, this.M) : P1(i80, i85, i87, 2, this.M);
                                                                        } else {
                                                                            int i88 = (i85 << 8) | i87;
                                                                            int i89 = i81 + 3;
                                                                            this.p = i89;
                                                                            int i90 = bArr8[i86] & 255;
                                                                            if (iArr[i90] != 0) {
                                                                                str = i90 == 34 ? M1(i80, i88, 3, this.M) : P1(i80, i88, i90, 3, this.M);
                                                                            } else {
                                                                                int i91 = (i88 << 8) | i90;
                                                                                this.p = i82;
                                                                                int i92 = bArr8[i89] & 255;
                                                                                if (iArr[i92] != 0) {
                                                                                    str = i92 == 34 ? M1(i80, i91, 4, this.M) : P1(i80, i91, i92, 4, this.M);
                                                                                } else {
                                                                                    int[] iArr7 = this.M;
                                                                                    if (i80 >= iArr7.length) {
                                                                                        this.M = lj90.t0(i80, iArr7);
                                                                                    }
                                                                                    this.M[i80] = i91;
                                                                                    i79 = i92;
                                                                                    i80++;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                str = i78 == 34 ? K1(i49, i66, i77, 4) : Q1(i49, i66, i77, i78, 4);
                                                            }
                                                        } else {
                                                            str = i76 == 34 ? K1(i49, i66, i74, 3) : Q1(i49, i66, i74, i76, 3);
                                                        }
                                                    } else {
                                                        str = i73 == 34 ? K1(i49, i66, i71, 2) : Q1(i49, i66, i71, i73, 2);
                                                    }
                                                } else {
                                                    str = i70 == 34 ? K1(i49, i66, i68, 1) : Q1(i49, i66, i68, i70, 1);
                                                }
                                            } else if (i68 == 34) {
                                                str = J1(i49, i66, 4);
                                            } else {
                                                int[] iArr8 = this.M;
                                                iArr8[0] = i49;
                                                str = P1(1, i66, i68, 4, iArr8);
                                            }
                                        } else if (i65 == 34) {
                                            str = J1(i49, i63, 3);
                                            i3 = 3;
                                        } else {
                                            int[] iArr9 = this.M;
                                            iArr9[0] = i49;
                                            i5 = 3;
                                            str = P1(1, i63, i65, 3, iArr9);
                                            i3 = i5;
                                        }
                                    } else if (i53 == 34) {
                                        str = J1(i49, i51, 1);
                                    } else {
                                        int[] iArr10 = this.M;
                                        iArr10[0] = i49;
                                        str = P1(1, i51, i53, 1, iArr10);
                                    }
                                } else {
                                    i2 = 2;
                                    i4 = 3;
                                    str = i51 == 34 ? I1(i49, 4) : P1(0, i49, i51, 4, this.M);
                                }
                                i3 = i4;
                            } else {
                                i2 = 2;
                                i4 = 3;
                                if (i48 == 34) {
                                    str = I1(i46, 3);
                                    i3 = i4;
                                } else {
                                    i5 = 3;
                                    str = P1(0, i46, i48, 3, this.M);
                                    i3 = i5;
                                }
                            }
                        } else {
                            i2 = 2;
                            i3 = 3;
                            str = i45 == 34 ? I1(i43, 2) : P1(0, i43, i45, 2, this.M);
                        }
                    } else {
                        i2 = 2;
                        i3 = 3;
                        str = i42 == 34 ? I1(i40, 1) : P1(0, i40, i42, 1, this.M);
                    }
                } else {
                    i2 = 2;
                    i3 = 3;
                    if (i40 != 34) {
                        z2 = false;
                        P1 = P1(0, 0, i40, 0, this.M);
                        this.w.f(P1);
                        this.c = JsonToken.FIELD_NAME;
                        i6 = this.p;
                        if (i6 + 4 < this.q) {
                        }
                        C1();
                        if (m1 != 34) {
                        }
                    }
                }
                P1 = str;
                z2 = false;
                this.w.f(P1);
                this.c = JsonToken.FIELD_NAME;
                i6 = this.p;
                if (i6 + 4 < this.q) {
                }
                C1();
                if (m1 != 34) {
                }
            } else {
                if (i23 >= i38 && !M0()) {
                    U(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
                    throw null;
                }
                byte[] bArr10 = this.P;
                int i93 = this.p;
                this.p = i93 + 1;
                int i94 = bArr10[i93] & 255;
                if (i94 != 34) {
                    str = P1(0, 0, i94, 0, this.M);
                }
            }
        }
        P1 = str;
        z2 = z;
        i2 = 2;
        i3 = 3;
        this.w.f(P1);
        this.c = JsonToken.FIELD_NAME;
        i6 = this.p;
        if (i6 + 4 < this.q) {
        }
        C1();
        if (m1 != 34) {
        }
    }

    public final void O0() throws IOException {
        if (M0()) {
            return;
        }
        U(" in " + this.c, this.c);
        throw null;
    }

    public final int O1() throws IOException {
        if (this.p >= this.q) {
            O0();
        }
        byte[] bArr = this.P;
        int i = this.p;
        this.p = i + 1;
        return bArr[i] & 255;
    }

    public final String P1(int i, int i2, int i3, int i4, int[] iArr) throws IOException {
        while (true) {
            if (a0[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            iArr = lj90.t0(iArr.length, iArr);
                            this.M = iArr;
                        }
                        iArr[i] = Y0(i2, i4);
                        i++;
                    }
                    String m = this.L.m(i, iArr);
                    return m == null ? H1(i, i4, iArr) : m;
                }
                if (i3 != 92) {
                    o0(i3, "name");
                } else {
                    i3 = A0();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = lj90.t0(iArr.length, iArr);
                            this.M = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | PsExtractor.AUDIO_STREAM;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = lj90.t0(iArr.length, iArr);
                                this.M = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = lj90.t0(iArr.length, iArr);
                    this.M = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.p >= this.q && !M0()) {
                U(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
            byte[] bArr = this.P;
            int i8 = this.p;
            this.p = i8 + 1;
            i3 = bArr[i8] & 255;
        }
    }

    public final void Q0() throws IOException {
        int i;
        int i2 = this.p;
        if (i2 + 4 < this.q) {
            byte[] bArr = this.P;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.p = i6;
                            return;
                        }
                    }
                }
            }
        }
        W0(1, CredentialEntry.FALSE_STRING);
    }

    public final String Q1(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this.M;
        iArr[0] = i;
        iArr[1] = i2;
        return P1(2, i3, i4, i5, iArr);
    }

    public final void R0() throws IOException {
        int i;
        int i2 = this.p;
        if (i2 + 3 < this.q) {
            byte[] bArr = this.P;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.p = i5;
                        return;
                    }
                }
            }
        }
        W0(1, "null");
    }

    public final void T0(int i, String str) throws IOException {
        int length = str.length();
        if (this.p + length >= this.q) {
            W0(i, str);
            return;
        }
        while (this.P[this.p] == str.charAt(i)) {
            int i2 = this.p + 1;
            this.p = i2;
            i++;
            if (i >= length) {
                int i3 = this.P[i2] & 255;
                if (i3 < 48 || i3 == 93 || i3 == 125 || !Character.isJavaIdentifierPart((char) z0(i3))) {
                    return;
                }
                k1(str.substring(0, i), p0());
                throw null;
            }
        }
        k1(str.substring(0, i), p0());
        throw null;
    }

    public final void W0(int i, String str) throws IOException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.p >= this.q && !M0()) || this.P[this.p] != str.charAt(i)) {
                k1(str.substring(0, i), p0());
                throw null;
            }
            i2 = this.p + 1;
            this.p = i2;
            i++;
        } while (i < length);
        if ((i2 < this.q || M0()) && (i3 = this.P[this.p] & 255) >= 48 && i3 != 93 && i3 != 125 && Character.isJavaIdentifierPart((char) z0(i3))) {
            k1(str.substring(0, i), p0());
            throw null;
        }
    }

    public final void X0() throws IOException {
        int i;
        int i2 = this.p;
        if (i2 + 3 < this.q) {
            byte[] bArr = this.P;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.p = i5;
                        return;
                    }
                }
            }
        }
        W0(1, "true");
    }

    public final JsonToken Z0(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        char[] cArr2;
        int i4;
        int i5;
        boolean z2;
        int i6 = i2;
        c7f0 c7f0Var = this.y;
        int i7 = 0;
        if (i6 == 46) {
            cArr2 = cArr;
            int i8 = i;
            if (i8 >= cArr2.length) {
                cArr2 = c7f0Var.g();
                i8 = 0;
            }
            int i9 = i8 + 1;
            cArr2[i8] = (char) i6;
            int i10 = 0;
            while (true) {
                if (this.p >= this.q && !M0()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.P;
                int i11 = this.p;
                this.p = i11 + 1;
                i6 = bArr[i11] & 255;
                if (i6 < 48 || i6 > 57) {
                    break;
                }
                i10++;
                if (i9 >= cArr2.length) {
                    cArr2 = c7f0Var.g();
                    i9 = 0;
                }
                cArr2[i9] = (char) i6;
                i9++;
            }
            z2 = false;
            if (i10 == 0 && !JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.j().j(this.b)) {
                Y(i6, "Decimal point not followed by a digit");
                throw null;
            }
            int i12 = i10;
            i4 = i9;
            i5 = i12;
        } else {
            cArr2 = cArr;
            i4 = i;
            i5 = 0;
            z2 = false;
        }
        if (i6 == 101 || i6 == 69) {
            if (i4 >= cArr2.length) {
                cArr2 = c7f0Var.g();
                i4 = 0;
            }
            int i13 = i4 + 1;
            cArr2[i4] = (char) i6;
            if (this.p >= this.q) {
                O0();
            }
            byte[] bArr2 = this.P;
            int i14 = this.p;
            this.p = i14 + 1;
            i6 = bArr2[i14] & 255;
            if (i6 == 45 || i6 == 43) {
                if (i13 >= cArr2.length) {
                    cArr2 = c7f0Var.g();
                    i13 = 0;
                }
                int i15 = i13 + 1;
                cArr2[i13] = (char) i6;
                if (this.p >= this.q) {
                    O0();
                }
                byte[] bArr3 = this.P;
                int i16 = this.p;
                this.p = i16 + 1;
                i6 = bArr3[i16] & 255;
                i13 = i15;
            }
            int i17 = 0;
            while (i6 >= 48 && i6 <= 57) {
                i17++;
                if (i13 >= cArr2.length) {
                    cArr2 = c7f0Var.g();
                    i13 = 0;
                }
                int i18 = i13 + 1;
                cArr2[i13] = (char) i6;
                if (this.p >= this.q && !M0()) {
                    z2 = true;
                    i7 = i17;
                    i4 = i18;
                    break;
                }
                byte[] bArr4 = this.P;
                int i19 = this.p;
                this.p = i19 + 1;
                i6 = bArr4[i19] & 255;
                i13 = i18;
            }
            i7 = i17;
            i4 = i13;
            if (i7 == 0) {
                Y(i6, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.p--;
            if (this.w.d()) {
                G1(i6);
            }
        }
        c7f0Var.i = i4;
        return x0(i3, i5, i7, z);
    }

    public final JsonToken a1(boolean z) throws IOException {
        if (!JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.j().j(this.b)) {
            return L0(46);
        }
        char[] e = this.y.e();
        int i = 0;
        if (z) {
            e[0] = '-';
            i = 1;
        }
        return Z0(e, i, 46, z, 0);
    }

    @Override // xsna.lj90
    public final void c0() throws IOException {
        if (this.O != null) {
            if (this.m.d || JsonParser.Feature.AUTO_CLOSE_SOURCE.j(this.b)) {
                this.O.close();
            }
            this.O = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r3 == 46) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3 == 101) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r3 != 69) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        r6.p = r8;
        r10.i = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r6.w.d() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        G1(r6.P[r6.p] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        return y0(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        return Z0(r1, r2, r3, r9, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonToken c1(char[] cArr, int i, boolean z, int i2) throws IOException {
        char[] cArr2 = cArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.p;
            int i6 = this.q;
            c7f0 c7f0Var = this.y;
            if (i5 >= i6 && !M0()) {
                c7f0Var.i = i3;
                return y0(i4, z);
            }
            byte[] bArr = this.P;
            int i7 = this.p;
            this.p = i7 + 1;
            int i8 = bArr[i7] & 255;
            if (i8 > 57 || i8 < 48) {
                break;
            }
            if (i3 >= cArr2.length) {
                i3 = 0;
                cArr2 = c7f0Var.g();
            }
            cArr2[i3] = (char) i8;
            i4++;
            i3++;
        }
    }

    public final JsonToken e1(boolean z) throws IOException {
        int i;
        int i2;
        c7f0 c7f0Var = this.y;
        char[] e = c7f0Var.e();
        int i3 = 1;
        int i4 = 0;
        if (z) {
            e[0] = '-';
            i4 = 1;
        }
        if (this.p >= this.q) {
            O0();
        }
        byte[] bArr = this.P;
        int i5 = this.p;
        this.p = i5 + 1;
        int i6 = bArr[i5] & 255;
        if (i6 <= 48) {
            if (i6 != 48) {
                return i6 == 46 ? a1(z) : J0(i6, z, true);
            }
            i6 = F1();
        } else if (i6 > 57) {
            return J0(i6, z, true);
        }
        int i7 = i4 + 1;
        e[i4] = (char) i6;
        int min = Math.min(this.q, (this.p + e.length) - i7);
        while (true) {
            i = this.p;
            if (i >= min) {
                return c1(e, i7, z, i3);
            }
            byte[] bArr2 = this.P;
            this.p = i + 1;
            i2 = bArr2[i] & 255;
            if (i2 < 48 || i2 > 57) {
                break;
            }
            i3++;
            e[i7] = (char) i2;
            i7++;
        }
        if (i2 == 46 || i2 == 101 || i2 == 69) {
            return Z0(e, i7, i2, z, i3);
        }
        this.p = i;
        c7f0Var.i = i7;
        if (this.w.d()) {
            G1(i2);
        }
        return y0(i3, z);
    }

    public final JsonToken f1(int i) throws IOException {
        int i2;
        int i3;
        c7f0 c7f0Var = this.y;
        char[] e = c7f0Var.e();
        if (i == 48) {
            i = F1();
        }
        e[0] = (char) i;
        int i4 = 1;
        int min = Math.min(this.q, (this.p + e.length) - 1);
        int i5 = 1;
        while (true) {
            i2 = this.p;
            if (i2 >= min) {
                return c1(e, i4, false, i5);
            }
            byte[] bArr = this.P;
            this.p = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            e[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return Z0(e, i4, i3, false, i5);
        }
        this.p = i2;
        c7f0Var.i = i4;
        if (this.w.d()) {
            G1(i3);
        }
        return y0(i5, false);
    }

    public final void g1(int i) throws JsonParseException {
        if (i < 32) {
            a0(i);
            throw null;
        }
        h1(i);
        throw null;
    }

    public final void h1(int i) throws JsonParseException {
        throw b("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    public final void i1(int i) throws JsonParseException {
        throw b("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    public final void j1(int i, int i2) throws JsonParseException {
        this.p = i2;
        i1(i);
        throw null;
    }

    public final void k1(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.p >= this.q && !M0()) {
                break;
            }
            byte[] bArr = this.P;
            int i = this.p;
            this.p = i + 1;
            char z0 = (char) z0(bArr[i]);
            if (!Character.isJavaIdentifierPart(z0)) {
                break;
            }
            sb.append(z0);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw b("Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    public final void l1() throws IOException {
        if (this.p < this.q || M0()) {
            byte[] bArr = this.P;
            int i = this.p;
            if (bArr[i] == 10) {
                this.p = i + 1;
            }
        }
        this.s++;
        this.t = this.p;
    }

    @Override // xsna.lj90
    public final void m0() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super.m0();
        hu8 hu8Var = this.L;
        hu8 hu8Var2 = hu8Var.a;
        if (hu8Var2 != null && !hu8Var.o) {
            hu8.a aVar = new hu8.a(hu8Var);
            AtomicReference<hu8.a> atomicReference = hu8Var2.b;
            hu8.a aVar2 = atomicReference.get();
            int i = aVar2.b;
            int i2 = aVar.b;
            if (i2 != i) {
                if (i2 > 6000) {
                    aVar = new hu8.a(64, 4, new int[512], new String[128], 448, 512);
                }
                while (!atomicReference.compareAndSet(aVar2, aVar) && atomicReference.get() == aVar2) {
                }
            }
            hu8Var.o = true;
        }
        if (!this.Q || (bArr = this.P) == null || bArr == (bArr2 = qj90.d)) {
            return;
        }
        this.P = bArr2;
        this.m.b(bArr);
    }

    public final int m1(boolean z) throws IOException {
        while (true) {
            if (this.p >= this.q && !M0()) {
                U(" within/between " + this.w.e() + " entries", null);
                throw null;
            }
            byte[] bArr = this.P;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    p1();
                } else if (i3 == 35 && (this.b & Y) != 0) {
                    q1();
                } else {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        X(i3, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.s++;
                this.t = i2;
            } else if (i3 == 13) {
                l1();
            } else if (i3 != 9) {
                a0(i3);
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonLocation p() {
        return new JsonLocation(d0(), this.r + this.p, -1L, this.s, (this.p - this.t) + 1);
    }

    public final void p1() throws IOException {
        if ((this.b & X) == 0) {
            X(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (this.p >= this.q && !M0()) {
            U(" in a comment", null);
            throw null;
        }
        byte[] bArr = this.P;
        int i = this.p;
        this.p = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            q1();
            return;
        }
        if (i2 != 42) {
            X(i2, "was expecting either '*' or '/' for a comment");
            throw null;
        }
        int[] iArr = amb.i;
        while (true) {
            if (this.p >= this.q && !M0()) {
                break;
            }
            byte[] bArr2 = this.P;
            int i3 = this.p;
            int i4 = i3 + 1;
            this.p = i4;
            int i5 = bArr2[i3] & 255;
            int i6 = iArr[i5];
            if (i6 != 0) {
                if (i6 == 2) {
                    r1();
                } else if (i6 == 3) {
                    u1();
                } else if (i6 == 4) {
                    v1();
                } else if (i6 == 10) {
                    this.s++;
                    this.t = i4;
                } else if (i6 == 13) {
                    l1();
                } else {
                    if (i6 != 42) {
                        g1(i5);
                        throw null;
                    }
                    if (i4 >= this.q && !M0()) {
                        break;
                    }
                    byte[] bArr3 = this.P;
                    int i7 = this.p;
                    if (bArr3[i7] == 47) {
                        this.p = i7 + 1;
                        return;
                    }
                }
            }
        }
        U(" in a comment", null);
        throw null;
    }

    public final void q1() throws IOException {
        int[] iArr = amb.i;
        while (true) {
            if (this.p >= this.q && !M0()) {
                return;
            }
            byte[] bArr = this.P;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArr[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    r1();
                } else if (i4 == 3) {
                    u1();
                } else if (i4 == 4) {
                    v1();
                } else if (i4 == 10) {
                    this.s++;
                    this.t = i2;
                    return;
                } else if (i4 == 13) {
                    l1();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    g1(i3);
                    throw null;
                }
            }
        }
    }

    public final void r1() throws IOException {
        if (this.p >= this.q) {
            O0();
        }
        byte[] bArr = this.P;
        int i = this.p;
        int i2 = i + 1;
        this.p = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            return;
        }
        j1(b & 255, i2);
        throw null;
    }

    public final void u1() throws IOException {
        if (this.p >= this.q) {
            O0();
        }
        byte[] bArr = this.P;
        int i = this.p;
        int i2 = i + 1;
        this.p = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            j1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.q) {
            O0();
        }
        byte[] bArr2 = this.P;
        int i3 = this.p;
        int i4 = i3 + 1;
        this.p = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) == 128) {
            return;
        }
        j1(b2 & 255, i4);
        throw null;
    }

    public final void v1() throws IOException {
        if (this.p >= this.q) {
            O0();
        }
        byte[] bArr = this.P;
        int i = this.p;
        int i2 = i + 1;
        this.p = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            j1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.q) {
            O0();
        }
        byte[] bArr2 = this.P;
        int i3 = this.p;
        int i4 = i3 + 1;
        this.p = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            j1(b2 & 255, i4);
            throw null;
        }
        if (i4 >= this.q) {
            O0();
        }
        byte[] bArr3 = this.P;
        int i5 = this.p;
        int i6 = i5 + 1;
        this.p = i6;
        byte b3 = bArr3[i5];
        if ((b3 & 192) == 128) {
            return;
        }
        j1(b3 & 255, i6);
        throw null;
    }

    public final int w1() throws IOException {
        while (true) {
            if (this.p >= this.q && !M0()) {
                throw b("Unexpected end-of-input within/between " + this.w.e() + " entries");
            }
            byte[] bArr = this.P;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    p1();
                } else {
                    if (i3 != 35) {
                        return i3;
                    }
                    if ((this.b & Y) == 0) {
                        return i3;
                    }
                    q1();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.s++;
                this.t = i2;
            } else if (i3 == 13) {
                l1();
            } else if (i3 != 9) {
                a0(i3);
                throw null;
            }
        }
    }

    public final int z0(int i) throws IOException {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & 224) == 192) {
            i2 = i & 31;
            c = 1;
        } else if ((i & PsExtractor.VIDEO_STREAM_MASK) == 224) {
            i2 = i & 15;
            c = 2;
        } else {
            if ((i & 248) != 240) {
                h1(i & 255);
                throw null;
            }
            i2 = i & 7;
            c = 3;
        }
        int O1 = O1();
        if ((O1 & PsExtractor.AUDIO_STREAM) != 128) {
            i1(O1 & 255);
            throw null;
        }
        int i4 = (i2 << 6) | (O1 & 63);
        if (c <= 1) {
            return i4;
        }
        int O12 = O1();
        if ((O12 & PsExtractor.AUDIO_STREAM) != 128) {
            i1(O12 & 255);
            throw null;
        }
        int i5 = (i4 << 6) | (O12 & 63);
        if (c <= 2) {
            return i5;
        }
        int O13 = O1();
        if ((O13 & PsExtractor.AUDIO_STREAM) == 128) {
            return (i5 << 6) | (O13 & 63);
        }
        i1(O13 & 255);
        throw null;
    }
}
