package xsna;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.vk.dto.common.ImageSizeKey;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: WriterBasedJsonGenerator.java */
/* loaded from: classes12.dex */
public final class p3y0 extends l9y {
    public static final char[] s = amb.b(true);
    public static final char[] t = amb.b(false);
    public final Writer l;
    public final char m;
    public char[] n;
    public int o;
    public int p;
    public final int q;
    public char[] r;

    public p3y0(tnv tnvVar, int i, ip70 ip70Var, Writer writer, char c) {
        super(tnvVar, i, ip70Var);
        this.l = writer;
        tnv.a(tnvVar.j);
        char[] a = tnvVar.e.a(1, 0);
        tnvVar.j = a;
        this.n = a;
        this.q = a.length;
        this.m = c;
        if (c != '\"') {
            this.f = amb.c(c);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void A(String str) throws IOException {
        S("write a string");
        if (str == null) {
            T();
            return;
        }
        int i = this.p;
        int i2 = this.q;
        if (i >= i2) {
            O();
        }
        char[] cArr = this.n;
        int i3 = this.p;
        this.p = i3 + 1;
        char c = this.m;
        cArr[i3] = c;
        V(str);
        if (this.p >= i2) {
            O();
        }
        char[] cArr2 = this.n;
        int i4 = this.p;
        this.p = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[EDGE_INSN: B:15:0x0049->B:16:0x0049 BREAK  A[LOOP:1: B:9:0x0038->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:1: B:9:0x0038->B:33:?, LOOP_END, SYNTHETIC] */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(char[] cArr, int i, int i2) throws IOException {
        char c;
        S("write a string");
        int i3 = this.p;
        int i4 = this.q;
        if (i3 >= i4) {
            O();
        }
        char[] cArr2 = this.n;
        int i5 = this.p;
        this.p = i5 + 1;
        char c2 = this.m;
        cArr2[i5] = c2;
        int i6 = this.g;
        Writer writer = this.l;
        int i7 = 32;
        if (i6 != 0) {
            int i8 = i2 + i;
            int[] iArr = this.f;
            int min = Math.min(iArr.length, i6 + 1);
            int i9 = 0;
            int i10 = i;
            while (i10 < i8) {
                int i11 = i10;
                while (true) {
                    c = cArr[i11];
                    if (c < min) {
                        i9 = iArr[c];
                        if (i9 != 0) {
                            break;
                        }
                        i11++;
                        if (i11 < i8) {
                            break;
                        }
                    } else {
                        if (c > i6) {
                            i9 = -1;
                            break;
                        }
                        i11++;
                        if (i11 < i8) {
                        }
                    }
                }
                int i12 = i11 - i10;
                if (i12 < i7) {
                    if (this.p + i12 > i4) {
                        O();
                    }
                    if (i12 > 0) {
                        System.arraycopy(cArr, i10, this.n, this.p, i12);
                        this.p += i12;
                    }
                } else {
                    O();
                    writer.write(cArr, i10, i12);
                }
                if (i11 >= i8) {
                    break;
                }
                i10 = i11 + 1;
                N(c, i9);
                i7 = 32;
            }
        } else {
            int i13 = i2 + i;
            int[] iArr2 = this.f;
            int length = iArr2.length;
            int i14 = i;
            while (i14 < i13) {
                int i15 = i14;
                do {
                    char c3 = cArr[i15];
                    if (c3 < length && iArr2[c3] != 0) {
                        break;
                    } else {
                        i15++;
                    }
                } while (i15 < i13);
                int i16 = i15 - i14;
                if (i16 < 32) {
                    if (this.p + i16 > i4) {
                        O();
                    }
                    if (i16 > 0) {
                        System.arraycopy(cArr, i14, this.n, this.p, i16);
                        this.p += i16;
                    }
                } else {
                    O();
                    writer.write(cArr, i14, i16);
                }
                if (i15 >= i13) {
                    break;
                }
                i14 = i15 + 1;
                char c4 = cArr[i15];
                N(c4, iArr2[c4]);
            }
        }
        if (this.p >= i4) {
            O();
        }
        char[] cArr3 = this.n;
        int i17 = this.p;
        this.p = i17 + 1;
        cArr3[i17] = c2;
    }

    public final char[] L() {
        char[] cArr = {'\\', 0, '\\', 'u', ImageSizeKey.SIZE_KEY_UNDEFINED, ImageSizeKey.SIZE_KEY_UNDEFINED, 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.r = cArr;
        return cArr;
    }

    public final void N(char c, int i) throws IOException, JsonGenerationException {
        int i2;
        int i3 = this.q;
        if (i >= 0) {
            if (this.p + 2 > i3) {
                O();
            }
            char[] cArr = this.n;
            int i4 = this.p;
            int i5 = i4 + 1;
            this.p = i5;
            cArr[i4] = '\\';
            this.p = i4 + 2;
            cArr[i5] = (char) i;
            return;
        }
        if (i == -2) {
            throw null;
        }
        if (this.p + 5 >= i3) {
            O();
        }
        int i6 = this.p;
        char[] cArr2 = this.n;
        char[] cArr3 = this.j ? s : t;
        cArr2[i6] = '\\';
        int i7 = i6 + 2;
        cArr2[i6 + 1] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i6 + 3;
            cArr2[i7] = cArr3[(i8 & 255) >> 4];
            i2 = i6 + 4;
            cArr2[i9] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i6 + 3;
            cArr2[i7] = ImageSizeKey.SIZE_KEY_UNDEFINED;
            i2 = i6 + 4;
            cArr2[i10] = ImageSizeKey.SIZE_KEY_UNDEFINED;
        }
        cArr2[i2] = cArr3[c >> 4];
        cArr2[i2 + 1] = cArr3[c & 15];
        this.p = i2 + 2;
    }

    public final void O() throws IOException {
        int i = this.p;
        int i2 = this.o;
        int i3 = i - i2;
        if (i3 > 0) {
            this.o = 0;
            this.p = 0;
            this.l.write(this.n, i2, i3);
        }
    }

    public final int P(char[] cArr, int i, int i2, char c, int i3) throws IOException, JsonGenerationException {
        int i4;
        Writer writer = this.l;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArr2 = this.r;
            if (cArr2 == null) {
                cArr2 = L();
            }
            cArr2[1] = (char) i3;
            writer.write(cArr2, 0, 2);
            return i;
        }
        if (i3 == -2) {
            throw null;
        }
        char[] cArr3 = this.j ? s : t;
        if (i <= 5 || i >= i2) {
            char[] cArr4 = this.r;
            if (cArr4 == null) {
                cArr4 = L();
            }
            this.o = this.p;
            if (c <= 255) {
                cArr4[6] = cArr3[c >> 4];
                cArr4[7] = cArr3[c & 15];
                writer.write(cArr4, 2, 6);
                return i;
            }
            int i6 = c >> '\b';
            cArr4[10] = cArr3[(i6 & 255) >> 4];
            cArr4[11] = cArr3[i6 & 15];
            cArr4[12] = cArr3[(c & 255) >> 4];
            cArr4[13] = cArr3[c & 15];
            writer.write(cArr4, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i7 = i - 4;
        cArr[i - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i - 3;
            cArr[i7] = cArr3[(i8 & 255) >> 4];
            i4 = i - 2;
            cArr[i9] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i - 3;
            cArr[i7] = ImageSizeKey.SIZE_KEY_UNDEFINED;
            i4 = i - 2;
            cArr[i10] = ImageSizeKey.SIZE_KEY_UNDEFINED;
        }
        cArr[i4] = cArr3[c >> 4];
        cArr[i4 + 1] = cArr3[c & 15];
        return i4 - 4;
    }

    public final void Q(char c, int i) throws IOException, JsonGenerationException {
        int i2;
        Writer writer = this.l;
        if (i >= 0) {
            int i3 = this.p;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.o = i4;
                char[] cArr = this.n;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArr2 = this.r;
            if (cArr2 == null) {
                cArr2 = L();
            }
            this.o = this.p;
            cArr2[1] = (char) i;
            writer.write(cArr2, 0, 2);
            return;
        }
        if (i == -2) {
            throw null;
        }
        char[] cArr3 = this.j ? s : t;
        int i5 = this.p;
        if (i5 < 6) {
            char[] cArr4 = this.r;
            if (cArr4 == null) {
                cArr4 = L();
            }
            this.o = this.p;
            if (c <= 255) {
                cArr4[6] = cArr3[c >> 4];
                cArr4[7] = cArr3[c & 15];
                writer.write(cArr4, 2, 6);
                return;
            } else {
                int i6 = c >> '\b';
                cArr4[10] = cArr3[(i6 & 255) >> 4];
                cArr4[11] = cArr3[i6 & 15];
                cArr4[12] = cArr3[(c & 255) >> 4];
                cArr4[13] = cArr3[c & 15];
                writer.write(cArr4, 8, 6);
                return;
            }
        }
        char[] cArr5 = this.n;
        int i7 = i5 - 6;
        this.o = i7;
        cArr5[i7] = '\\';
        cArr5[i5 - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            cArr5[i5 - 4] = cArr3[(i8 & 255) >> 4];
            i2 = i5 - 3;
            cArr5[i2] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            cArr5[i5 - 4] = ImageSizeKey.SIZE_KEY_UNDEFINED;
            i2 = i5 - 3;
            cArr5[i2] = ImageSizeKey.SIZE_KEY_UNDEFINED;
        }
        cArr5[i2 + 1] = cArr3[c >> 4];
        cArr5[i2 + 2] = cArr3[c & 15];
    }

    public final void S(String str) throws IOException {
        char c;
        int g = this.d.g();
        if (g == 1) {
            c = ',';
        } else {
            if (g != 2) {
                if (g != 3) {
                    if (g != 5) {
                        return;
                    }
                    J(str);
                    throw null;
                }
                jmi0 jmi0Var = this.h;
                if (jmi0Var != null) {
                    X(((SerializedString) jmi0Var).g());
                    return;
                }
                return;
            }
            c = ':';
        }
        if (this.p >= this.q) {
            O();
        }
        char[] cArr = this.n;
        int i = this.p;
        this.p = i + 1;
        cArr[i] = c;
    }

    public final void T() throws IOException {
        if (this.p + 4 >= this.q) {
            O();
        }
        int i = this.p;
        char[] cArr = this.n;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.p = i + 4;
    }

    public final void U(String str) throws IOException {
        int i = this.p;
        int i2 = this.q;
        if (i >= i2) {
            O();
        }
        char[] cArr = this.n;
        int i3 = this.p;
        this.p = i3 + 1;
        char c = this.m;
        cArr[i3] = c;
        X(str);
        if (this.p >= i2) {
            O();
        }
        char[] cArr2 = this.n;
        int i4 = this.p;
        this.p = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[LOOP:2: B:11:0x0039->B:17:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[EDGE_INSN: B:18:0x004f->B:19:0x004f BREAK  A[LOOP:2: B:11:0x0039->B:17:0x0068], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(String str) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        char[] cArr;
        char c;
        char[] cArr2;
        int i5;
        char c2;
        int length = str.length();
        Writer writer = this.l;
        int i6 = this.q;
        if (length <= i6) {
            if (this.p + length > i6) {
                O();
            }
            str.getChars(0, length, this.n, this.p);
            int i7 = this.g;
            if (i7 == 0) {
                int i8 = this.p + length;
                int[] iArr = this.f;
                int length2 = iArr.length;
                while (this.p < i8) {
                    do {
                        char[] cArr3 = this.n;
                        int i9 = this.p;
                        char c3 = cArr3[i9];
                        if (c3 >= length2 || iArr[c3] == 0) {
                            i = i9 + 1;
                            this.p = i;
                        } else {
                            int i10 = this.o;
                            int i11 = i9 - i10;
                            if (i11 > 0) {
                                writer.write(cArr3, i10, i11);
                            }
                            char[] cArr4 = this.n;
                            int i12 = this.p;
                            this.p = i12 + 1;
                            char c4 = cArr4[i12];
                            Q(c4, iArr[c4]);
                        }
                    } while (i < i8);
                    return;
                }
                return;
            }
            int i13 = this.p + length;
            int[] iArr2 = this.f;
            int min = Math.min(iArr2.length, i7 + 1);
            while (this.p < i13) {
                do {
                    char[] cArr5 = this.n;
                    int i14 = this.p;
                    char c5 = cArr5[i14];
                    if (c5 < min) {
                        i2 = iArr2[c5];
                        if (i2 != 0) {
                            int i15 = this.o;
                            i3 = i14 - i15;
                            if (i3 <= 0) {
                                writer.write(cArr5, i15, i3);
                            }
                            this.p++;
                            Q(c5, i2);
                        }
                        i4 = i14 + 1;
                        this.p = i4;
                    } else {
                        if (c5 > i7) {
                            i2 = -1;
                            int i152 = this.o;
                            i3 = i14 - i152;
                            if (i3 <= 0) {
                            }
                            this.p++;
                            Q(c5, i2);
                        }
                        i4 = i14 + 1;
                        this.p = i4;
                    }
                } while (i4 < i13);
                return;
            }
            return;
        }
        O();
        int length3 = str.length();
        int i16 = 0;
        while (true) {
            int i17 = i16 + i6 > length3 ? length3 - i16 : i6;
            int i18 = i16 + i17;
            str.getChars(i16, i18, this.n, 0);
            int i19 = this.g;
            if (i19 != 0) {
                int[] iArr3 = this.f;
                int min2 = Math.min(iArr3.length, i19 + 1);
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i20 < i17) {
                    while (true) {
                        cArr2 = this.n;
                        i5 = i22;
                        c2 = cArr2[i20];
                        if (c2 < min2) {
                            i5 = iArr3[c2];
                            if (i5 != 0) {
                                break;
                            }
                            i20++;
                            if (i20 < i17) {
                                break;
                            } else {
                                i22 = i5;
                            }
                        } else {
                            if (c2 > i19) {
                                i5 = -1;
                                break;
                            }
                            i20++;
                            if (i20 < i17) {
                            }
                        }
                    }
                    int i23 = i20 - i21;
                    if (i23 > 0) {
                        writer.write(cArr2, i21, i23);
                        if (i20 >= i17) {
                            break;
                        }
                    }
                    int i24 = i20 + 1;
                    int i25 = i5;
                    i21 = P(this.n, i24, i17, c2, i25);
                    i20 = i24;
                    i22 = i25;
                }
            } else {
                int[] iArr4 = this.f;
                int length4 = iArr4.length;
                int i26 = 0;
                int i27 = 0;
                while (i26 < i17) {
                    do {
                        cArr = this.n;
                        c = cArr[i26];
                        if (c < length4 && iArr4[c] != 0) {
                            break;
                        } else {
                            i26++;
                        }
                    } while (i26 < i17);
                    int i28 = i26 - i27;
                    if (i28 > 0) {
                        writer.write(cArr, i27, i28);
                        if (i26 >= i17) {
                            break;
                        }
                    }
                    int i29 = i26 + 1;
                    i27 = P(this.n, i29, i17, c, iArr4[c]);
                    i26 = i29;
                }
            }
            if (i18 >= length3) {
                return;
            } else {
                i16 = i18;
            }
        }
    }

    public final void X(String str) throws IOException {
        int length = str.length();
        int i = this.p;
        int i2 = this.q;
        int i3 = i2 - i;
        if (i3 == 0) {
            O();
            i3 = i2 - this.p;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.n, this.p);
            this.p += length;
            return;
        }
        int i4 = this.p;
        int i5 = i2 - i4;
        str.getChars(0, i5, this.n, i4);
        this.p += i5;
        O();
        int length2 = str.length() - i5;
        while (length2 > i2) {
            int i6 = i5 + i2;
            str.getChars(i5, i6, this.n, 0);
            this.o = 0;
            this.p = i2;
            O();
            length2 -= i2;
            i5 = i6;
        }
        str.getChars(i5, i5 + length2, this.n, 0);
        this.o = 0;
        this.p = length2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws IOException {
        try {
            if (this.n != null && I(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    pby pbyVar = this.d;
                    if (!pbyVar.b()) {
                        if (!pbyVar.c()) {
                            break;
                        } else {
                            n();
                        }
                    } else {
                        m();
                    }
                }
            }
            O();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.o = 0;
        this.p = 0;
        tnv tnvVar = this.e;
        Writer writer = this.l;
        if (writer != null) {
            try {
                if (!tnvVar.d && !I(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    if (I(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                        writer.flush();
                    }
                }
                writer.close();
            } catch (IOException e2) {
                e = e2;
                if (e != null) {
                    e.addSuppressed(e);
                }
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                if (e != null) {
                }
                throw e;
            }
        }
        char[] cArr = this.n;
        if (cArr != null) {
            this.n = null;
            char[] cArr2 = tnvVar.j;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            tnvVar.j = null;
            tnvVar.e.b.set(1, cArr);
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        O();
        Writer writer = this.l;
        if (writer == null || !I(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void k(boolean z) throws IOException {
        int i;
        S("write a boolean value");
        if (this.p + 5 >= this.q) {
            O();
        }
        int i2 = this.p;
        char[] cArr = this.n;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.p = i + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void m() throws IOException {
        if (!this.d.b()) {
            JsonGenerator.i("Current context not Array but ".concat(this.d.e()));
            throw null;
        }
        if (this.p >= this.q) {
            O();
        }
        char[] cArr = this.n;
        int i = this.p;
        this.p = i + 1;
        cArr[i] = ']';
        this.d = this.d.d;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void n() throws IOException {
        if (!this.d.c()) {
            JsonGenerator.i("Current context not Object but ".concat(this.d.e()));
            throw null;
        }
        if (this.p >= this.q) {
            O();
        }
        char[] cArr = this.n;
        int i = this.p;
        this.p = i + 1;
        cArr[i] = '}';
        this.d = this.d.d;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void o(String str) throws IOException {
        int f = this.d.f(str);
        if (f == 4) {
            JsonGenerator.i("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z = f == 1;
        int i = this.p + 1;
        int i2 = this.q;
        if (i >= i2) {
            O();
        }
        if (z) {
            char[] cArr = this.n;
            int i3 = this.p;
            this.p = i3 + 1;
            cArr[i3] = ',';
        }
        if (this.i) {
            V(str);
            return;
        }
        char[] cArr2 = this.n;
        int i4 = this.p;
        this.p = i4 + 1;
        char c = this.m;
        cArr2[i4] = c;
        V(str);
        if (this.p >= i2) {
            O();
        }
        char[] cArr3 = this.n;
        int i5 = this.p;
        this.p = i5 + 1;
        cArr3[i5] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void p() throws IOException {
        S("write a null");
        T();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void q(double d) throws IOException {
        if (!this.c) {
            String str = fn70.a;
            if (Double.isFinite(d) || !I(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                S("write a number");
                X(fn70.k(d, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        A(fn70.k(d, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void r(float f) throws IOException {
        if (!this.c) {
            String str = fn70.a;
            if (Float.isFinite(f) || !I(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                S("write a number");
                X(fn70.l(f, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        A(fn70.l(f, I(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void s(int i) throws IOException {
        S("write a number");
        boolean z = this.c;
        int i2 = this.q;
        if (!z) {
            if (this.p + 11 >= i2) {
                O();
            }
            this.p = fn70.h(this.n, i, this.p);
            return;
        }
        if (this.p + 13 >= i2) {
            O();
        }
        char[] cArr = this.n;
        int i3 = this.p;
        int i4 = i3 + 1;
        this.p = i4;
        char c = this.m;
        cArr[i3] = c;
        int h = fn70.h(cArr, i, i4);
        char[] cArr2 = this.n;
        this.p = h + 1;
        cArr2[h] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void t(long j) throws IOException {
        S("write a number");
        boolean z = this.c;
        int i = this.q;
        if (!z) {
            if (this.p + 21 >= i) {
                O();
            }
            this.p = fn70.j(j, this.n, this.p);
            return;
        }
        if (this.p + 23 >= i) {
            O();
        }
        char[] cArr = this.n;
        int i2 = this.p;
        int i3 = i2 + 1;
        this.p = i3;
        char c = this.m;
        cArr[i2] = c;
        int j2 = fn70.j(j, cArr, i3);
        char[] cArr2 = this.n;
        this.p = j2 + 1;
        cArr2[j2] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void v(BigDecimal bigDecimal) throws IOException {
        S("write a number");
        if (bigDecimal == null) {
            T();
        } else if (this.c) {
            U(H(bigDecimal));
        } else {
            X(H(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void w(BigInteger bigInteger) throws IOException {
        S("write a number");
        if (bigInteger == null) {
            T();
        } else if (this.c) {
            U(bigInteger.toString());
        } else {
            X(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y() throws IOException {
        S("start an array");
        pby pbyVar = this.d;
        pby pbyVar2 = pbyVar.f;
        if (pbyVar2 == null) {
            xno xnoVar = pbyVar.e;
            pbyVar2 = new pby(1, pbyVar, xnoVar != null ? new xno((Closeable) xnoVar.a) : null);
            pbyVar.f = pbyVar2;
        } else {
            pbyVar2.a = 1;
            pbyVar2.b = -1;
            pbyVar2.g = null;
            pbyVar2.h = false;
            xno xnoVar2 = pbyVar2.e;
            if (xnoVar2 != null) {
                xnoVar2.b = null;
                xnoVar2.c = null;
                xnoVar2.d = null;
            }
        }
        this.d = pbyVar2;
        if (this.p >= this.q) {
            O();
        }
        char[] cArr = this.n;
        int i = this.p;
        this.p = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void z() throws IOException {
        S("start an object");
        pby pbyVar = this.d;
        pby pbyVar2 = pbyVar.f;
        if (pbyVar2 == null) {
            xno xnoVar = pbyVar.e;
            pbyVar2 = new pby(2, pbyVar, xnoVar != null ? new xno((Closeable) xnoVar.a) : null);
            pbyVar.f = pbyVar2;
        } else {
            pbyVar2.a = 2;
            pbyVar2.b = -1;
            pbyVar2.g = null;
            pbyVar2.h = false;
            xno xnoVar2 = pbyVar2.e;
            if (xnoVar2 != null) {
                xnoVar2.b = null;
                xnoVar2.c = null;
                xnoVar2.d = null;
            }
        }
        this.d = pbyVar2;
        if (this.p >= this.q) {
            O();
        }
        char[] cArr = this.n;
        int i = this.p;
        this.p = i + 1;
        cArr[i] = '{';
    }
}
