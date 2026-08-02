package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;
import xsna.cmb;

/* compiled from: ReaderBasedJsonParser.java */
/* loaded from: classes12.dex */
public final class w7f0 extends lj90 {
    public static final int R = JsonParser.Feature.ALLOW_TRAILING_COMMA.k();
    public static final int S = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.k();
    public static final int T = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.k();
    public static final int U = JsonParser.Feature.ALLOW_MISSING_VALUES.k();
    public static final int V = JsonParser.Feature.ALLOW_SINGLE_QUOTES.k();
    public static final int W = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.k();
    public static final int X = JsonParser.Feature.ALLOW_COMMENTS.k();
    public static final int Y = JsonParser.Feature.ALLOW_YAML_COMMENTS.k();
    public static final int[] Z = amb.e;
    public Reader L;
    public char[] M;
    public final boolean N;
    public final cmb O;
    public final int P;
    public boolean Q;

    public w7f0(tnv tnvVar, int i, cmb cmbVar, char[] cArr, int i2) {
        super(tnvVar, i);
        this.L = null;
        this.M = cArr;
        this.p = 0;
        this.q = i2;
        this.t = 0;
        this.r = 0;
        this.O = cmbVar;
        this.P = cmbVar.c;
        this.N = true;
    }

    public final char A0() throws IOException {
        if (this.p >= this.q && !E0()) {
            U(" in character escape sequence", JsonToken.VALUE_STRING);
            throw null;
        }
        char[] cArr = this.M;
        int i = this.p;
        this.p = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            j0(c);
            return c;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.p >= this.q && !E0()) {
                U(" in character escape sequence", JsonToken.VALUE_STRING);
                throw null;
            }
            char[] cArr2 = this.M;
            int i4 = this.p;
            this.p = i4 + 1;
            char c2 = cArr2[i4];
            int i5 = amb.k[c2 & 255];
            if (i5 < 0) {
                X(c2, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i5;
        }
        return (char) i2;
    }

    public final void B0() throws IOException {
        int i = this.p;
        int i2 = this.q;
        int[] iArr = Z;
        c7f0 c7f0Var = this.y;
        if (i < i2) {
            int length = iArr.length;
            while (true) {
                char[] cArr = this.M;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    int i3 = this.p;
                    c7f0Var.j(cArr, i3, i - i3);
                    this.p = i + 1;
                    return;
                }
            }
        }
        char[] cArr2 = this.M;
        int i4 = this.p;
        int i5 = i - i4;
        c7f0Var.b = null;
        c7f0Var.c = -1;
        c7f0Var.d = 0;
        c7f0Var.j = null;
        c7f0Var.k = null;
        if (c7f0Var.f) {
            c7f0Var.b();
        } else if (c7f0Var.h == null) {
            c7f0Var.h = c7f0Var.a(i5);
        }
        c7f0Var.g = 0;
        c7f0Var.i = 0;
        if (c7f0Var.c >= 0) {
            c7f0Var.l(i5);
        }
        c7f0Var.j = null;
        c7f0Var.k = null;
        char[] cArr3 = c7f0Var.h;
        int length2 = cArr3.length;
        int i6 = c7f0Var.i;
        int i7 = length2 - i6;
        if (i7 >= i5) {
            System.arraycopy(cArr2, i4, cArr3, i6, i5);
            c7f0Var.i += i5;
        } else {
            int i8 = c7f0Var.g + i6 + i5;
            if (i8 < 0) {
                i8 = Integer.MAX_VALUE;
            }
            c7f0Var.m(i8);
            if (i7 > 0) {
                System.arraycopy(cArr2, i4, cArr3, c7f0Var.i, i7);
                i4 += i7;
                i5 -= i7;
            }
            do {
                c7f0Var.f();
                int min = Math.min(c7f0Var.h.length, i5);
                System.arraycopy(cArr2, i4, c7f0Var.h, 0, min);
                c7f0Var.i += min;
                i4 += min;
                i5 -= min;
            } while (i5 > 0);
        }
        this.p = i;
        char[] h = c7f0Var.h();
        int i9 = c7f0Var.i;
        int length3 = iArr.length;
        while (true) {
            if (this.p >= this.q && !E0()) {
                U(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                throw null;
            }
            char[] cArr4 = this.M;
            int i10 = this.p;
            this.p = i10 + 1;
            char c2 = cArr4[i10];
            if (c2 < length3 && iArr[c2] != 0) {
                if (c2 == '\"') {
                    c7f0Var.i = i9;
                    return;
                } else if (c2 == '\\') {
                    c2 = A0();
                } else if (c2 < ' ') {
                    o0(c2, "string value");
                }
            }
            if (i9 >= h.length) {
                h = c7f0Var.g();
                i9 = 0;
            }
            h[i9] = c2;
            i9++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken C0(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r9 != 44) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r8.w.d() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if ((r0 & xsna.w7f0.U) == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r8.p--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0049, code lost:
    
        if (r8.w.b() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonToken D0(int i) throws IOException {
        int i2 = this.b;
        if (i != 39) {
            int i3 = T;
            if (i == 73) {
                G0(1, "Infinity");
                if ((i2 & i3) != 0) {
                    return u0(Double.POSITIVE_INFINITY, "Infinity");
                }
                throw b("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            }
            if (i == 78) {
                G0(1, "NaN");
                if ((i2 & i3) != 0) {
                    return u0(Double.NaN, "NaN");
                }
                throw b("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            }
            if (i != 93) {
                if (i == 43) {
                    if (this.p >= this.q && !E0()) {
                        V(JsonToken.VALUE_NUMBER_INT);
                        throw null;
                    }
                    char[] cArr = this.M;
                    int i4 = this.p;
                    this.p = i4 + 1;
                    return C0(cArr[i4], false, true);
                }
            }
        } else if ((i2 & V) != 0) {
            c7f0 c7f0Var = this.y;
            char[] e = c7f0Var.e();
            int i5 = c7f0Var.i;
            while (true) {
                if (this.p >= this.q && !E0()) {
                    U(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                    throw null;
                }
                char[] cArr2 = this.M;
                int i6 = this.p;
                this.p = i6 + 1;
                char c = cArr2[i6];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = A0();
                    } else if (c <= '\'') {
                        if (c == '\'') {
                            c7f0Var.i = i5;
                            return JsonToken.VALUE_STRING;
                        }
                        if (c < ' ') {
                            o0(c, "string value");
                        }
                    }
                }
                if (i5 >= e.length) {
                    e = c7f0Var.g();
                    i5 = 0;
                }
                e[i5] = c;
                i5++;
            }
        }
        if (!Character.isJavaIdentifierStart(i)) {
            X(i, "expected a valid value ".concat(p0()));
            throw null;
        }
        Q0("" + ((char) i), p0());
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String E() throws IOException {
        JsonToken jsonToken = this.c;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        c7f0 c7f0Var = this.y;
        if (jsonToken == jsonToken2) {
            if (this.Q) {
                this.Q = false;
                B0();
            }
            return c7f0Var.d();
        }
        if (jsonToken == null) {
            return null;
        }
        int j = jsonToken.j();
        return j != 5 ? (j == 6 || j == 7 || j == 8) ? c7f0Var.d() : jsonToken.i() : this.w.g;
    }

    public final boolean E0() throws IOException {
        Reader reader = this.L;
        if (reader != null) {
            char[] cArr = this.M;
            int read = reader.read(cArr, 0, cArr.length);
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
                throw new IOException("Reader returned 0 characters when trying to read " + this.q);
            }
        }
        return false;
    }

    public final void G0(int i, String str) throws IOException {
        int i2;
        char c;
        int length = str.length();
        if (this.p + length < this.q) {
            while (this.M[this.p] == str.charAt(i)) {
                int i3 = this.p + 1;
                this.p = i3;
                i++;
                if (i >= length) {
                    char c2 = this.M[i3];
                    if (c2 < '0' || c2 == ']' || c2 == '}' || !Character.isJavaIdentifierPart(c2)) {
                        return;
                    }
                    Q0(str.substring(0, i), p0());
                    throw null;
                }
            }
            Q0(str.substring(0, i), p0());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.p >= this.q && !E0()) || this.M[this.p] != str.charAt(i)) {
                Q0(str.substring(0, i), p0());
                throw null;
            }
            i2 = this.p + 1;
            this.p = i2;
            i++;
        } while (i < length2);
        if ((i2 < this.q || E0()) && (c = this.M[this.p]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            Q0(str.substring(0, i), p0());
            throw null;
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
            } else if (this.Q) {
                this.Q = false;
                B0();
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
        } else if (this.Q) {
            this.Q = false;
            B0();
        }
        return this.y.k();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v18 ??, r11v12 ??, r11v6 ??, r11v5 ??, r11v3 ??, r11v10 ??, r11v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken I0(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v18 ??, r11v12 ??, r11v6 ??, r11v5 ??, r11v3 ??, r11v10 ??, r11v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

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
            } else if (this.Q) {
                this.Q = false;
                B0();
            }
            int i = this.y.c;
            if (i >= 0) {
                return i;
            }
        }
        return 0;
    }

    public final JsonToken J0(boolean z) throws IOException {
        if (!JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.j().j(this.b)) {
            return D0(46);
        }
        int i = this.p;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return I0(46, i2, i, 0, z);
    }

    public final String L0(int i, int i2, int i3) throws IOException {
        char[] cArr = this.M;
        int i4 = this.p - i;
        c7f0 c7f0Var = this.y;
        c7f0Var.j(cArr, i, i4);
        char[] h = c7f0Var.h();
        int i5 = c7f0Var.i;
        while (true) {
            if (this.p >= this.q && !E0()) {
                U(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
            char[] cArr2 = this.M;
            int i6 = this.p;
            this.p = i6 + 1;
            char c = cArr2[i6];
            if (c <= '\\') {
                if (c == '\\') {
                    c = A0();
                } else if (c <= i3) {
                    if (c == i3) {
                        c7f0Var.i = i5;
                        char[] i7 = c7f0Var.i();
                        int i8 = c7f0Var.c;
                        return this.O.b(i8 >= 0 ? i8 : 0, c7f0Var.k(), i7, i2);
                    }
                    if (c < ' ') {
                        o0(c, "name");
                    }
                }
            }
            i2 = (i2 * 33) + c;
            int i9 = i5 + 1;
            h[i5] = c;
            if (i9 >= h.length) {
                h = c7f0Var.g();
                i5 = 0;
            } else {
                i5 = i9;
            }
        }
    }

    public final JsonToken M0(int i, boolean z) throws IOException {
        int i2;
        char c1;
        boolean z2;
        boolean z3;
        int i3;
        char c12;
        char c13;
        char c;
        int i4 = this.b;
        this.p = z ? i + 1 : i;
        c7f0 c7f0Var = this.y;
        char[] e = c7f0Var.e();
        boolean z4 = true;
        if (z) {
            e[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = this.p;
        if (i5 < this.q) {
            char[] cArr = this.M;
            this.p = i5 + 1;
            c1 = cArr[i5];
        } else {
            c1 = c1("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (c1 == '0') {
            int i6 = this.p;
            int i7 = this.q;
            if ((i6 >= i7 || ((c = this.M[i6]) >= '0' && c <= '9')) && (i6 < i7 || E0())) {
                char[] cArr2 = this.M;
                int i8 = this.p;
                c1 = cArr2[i8];
                if (c1 >= '0' && c1 <= '9') {
                    if ((S & i4) == 0) {
                        throw b("Invalid numeric value: Leading zeroes not allowed");
                    }
                    this.p = i8 + 1;
                    if (c1 == '0') {
                        do {
                            if (this.p >= this.q && !E0()) {
                                break;
                            }
                            char[] cArr3 = this.M;
                            int i9 = this.p;
                            c1 = cArr3[i9];
                            if (c1 >= '0' && c1 <= '9') {
                                this.p = i9 + 1;
                            }
                        } while (c1 == '0');
                    }
                }
            }
            c1 = '0';
            break;
        }
        int i10 = 0;
        while (c1 >= '0' && c1 <= '9') {
            i10++;
            if (i2 >= e.length) {
                e = c7f0Var.g();
                i2 = 0;
            }
            int i11 = i2 + 1;
            e[i2] = c1;
            if (this.p >= this.q && !E0()) {
                c1 = 0;
                i2 = i11;
                z2 = true;
                break;
            }
            char[] cArr4 = this.M;
            int i12 = this.p;
            this.p = i12 + 1;
            c1 = cArr4[i12];
            i2 = i11;
        }
        z2 = false;
        if (i10 == 0 && !JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.j().j(i4)) {
            return C0(c1, z, false);
        }
        int i13 = -1;
        if (c1 == '.') {
            if (i2 >= e.length) {
                e = c7f0Var.g();
                i2 = 0;
            }
            e[i2] = c1;
            i2++;
            i3 = 0;
            while (true) {
                z3 = z4;
                if (this.p >= this.q && !E0()) {
                    z2 = z3;
                    break;
                }
                char[] cArr5 = this.M;
                int i14 = this.p;
                this.p = i14 + 1;
                c1 = cArr5[i14];
                if (c1 < '0' || c1 > '9') {
                    break;
                }
                i3++;
                if (i2 >= e.length) {
                    e = c7f0Var.g();
                    i2 = 0;
                }
                e[i2] = c1;
                i2++;
                z4 = z3;
            }
            if (i3 == 0 && !JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.j().j(i4)) {
                Y(c1, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z3 = true;
            i3 = -1;
        }
        if (c1 == 'e' || c1 == 'E') {
            if (i2 >= e.length) {
                e = c7f0Var.g();
                i2 = 0;
            }
            int i15 = i2 + 1;
            e[i2] = c1;
            int i16 = this.p;
            if (i16 < this.q) {
                char[] cArr6 = this.M;
                this.p = i16 + 1;
                c12 = cArr6[i16];
            } else {
                c12 = c1("expected a digit for number exponent", JsonToken.VALUE_NUMBER_FLOAT);
            }
            if (c12 == '-' || c12 == '+') {
                if (i15 >= e.length) {
                    e = c7f0Var.g();
                    i15 = 0;
                }
                int i17 = i15 + 1;
                e[i15] = c12;
                int i18 = this.p;
                if (i18 < this.q) {
                    char[] cArr7 = this.M;
                    this.p = i18 + 1;
                    c13 = cArr7[i18];
                } else {
                    c13 = c1("expected a digit for number exponent", JsonToken.VALUE_NUMBER_FLOAT);
                }
                c1 = c13;
                i15 = i17;
            } else {
                c1 = c12;
            }
            int i19 = 0;
            while (c1 <= '9' && c1 >= '0') {
                i19++;
                if (i15 >= e.length) {
                    e = c7f0Var.g();
                    i15 = 0;
                }
                int i20 = i15 + 1;
                e[i15] = c1;
                if (this.p >= this.q && !E0()) {
                    i2 = i20;
                    z2 = z3;
                    break;
                }
                char[] cArr8 = this.M;
                int i21 = this.p;
                this.p = i21 + 1;
                c1 = cArr8[i21];
                i15 = i20;
            }
            i2 = i15;
            i13 = i19;
            if (i13 == 0) {
                Y(c1, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        int i22 = i13;
        if (!z2) {
            this.p--;
            if (this.w.d()) {
                a1(c1);
            }
        }
        c7f0Var.i = i2;
        return (i3 >= 0 || i22 >= 0) ? x0(i10, i3, i22, z) : y0(i10, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0163, code lost:
    
        r2 = r2;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0166, code lost:
    
        if ((xsna.w7f0.R & r1) == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0168, code lost:
    
        if (r2 == 93) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016a, code lost:
    
        if (r2 != 125) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016c, code lost:
    
        z0(r2 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0171, code lost:
    
        return r18.c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0395  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonToken N() throws IOException {
        int i;
        JsonToken jsonToken;
        char c;
        char c2;
        char c3;
        boolean z;
        int i2;
        String b;
        int W0;
        char c4;
        boolean z2;
        int W02;
        int i3;
        int i4 = this.b;
        if (this.c == JsonToken.FIELD_NAME) {
            this.A = false;
            JsonToken jsonToken2 = this.x;
            this.x = null;
            if (jsonToken2 == JsonToken.START_ARRAY) {
                r0(this.u, this.v);
            } else if (jsonToken2 == JsonToken.START_OBJECT) {
                s0(this.u, this.v);
            }
            this.c = jsonToken2;
            return jsonToken2;
        }
        this.B = 0;
        char c5 = ' ';
        if (this.Q) {
            this.Q = false;
            int i5 = this.p;
            int i6 = this.q;
            char[] cArr = this.M;
            while (true) {
                if (i5 >= i6) {
                    this.p = i5;
                    if (!E0()) {
                        U(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                        throw null;
                    }
                    i5 = this.p;
                    i6 = this.q;
                }
                int i7 = i5 + 1;
                char c6 = cArr[i5];
                if (c6 <= '\\') {
                    if (c6 == '\\') {
                        this.p = i7;
                        A0();
                        i5 = this.p;
                        i6 = this.q;
                    } else if (c6 <= '\"') {
                        if (c6 == '\"') {
                            this.p = i7;
                            break;
                        }
                        if (c6 < ' ') {
                            this.p = i7;
                            o0(c6, "string value");
                        }
                    }
                }
                i5 = i7;
            }
        }
        int i8 = 1;
        if (this.p < this.q || E0()) {
            char[] cArr2 = this.M;
            int i9 = this.p;
            int i10 = i9 + 1;
            this.p = i10;
            char c7 = cArr2[i9];
            i = c7;
            if (c7 <= ' ') {
                if (c7 != ' ') {
                    if (c7 == '\n') {
                        this.s++;
                        this.t = i10;
                    } else if (c7 == '\r') {
                        T0();
                    } else if (c7 != '\t') {
                        a0(c7);
                        throw null;
                    }
                }
                while (true) {
                    int i11 = this.p;
                    if (i11 >= this.q) {
                        i = Z0();
                        break;
                    }
                    char[] cArr3 = this.M;
                    int i12 = i11 + 1;
                    this.p = i12;
                    char c8 = cArr3[i11];
                    if (c8 > ' ') {
                        if (c8 == '/' || c8 == '#') {
                            this.p = i11;
                            i = Z0();
                        } else {
                            i = c8;
                        }
                    } else if (c8 != ' ') {
                        if (c8 == '\n') {
                            this.s++;
                            this.t = i12;
                        } else if (c8 == '\r') {
                            T0();
                        } else if (c8 != '\t') {
                            a0(c8);
                            throw null;
                        }
                    }
                }
            } else if (c7 == '/' || c7 == '#') {
                this.p = i9;
                i = Z0();
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
        if (i == 93 || i == 125) {
            z0(i);
            return this.c;
        }
        lay layVar = this.w;
        int i13 = layVar.b + 1;
        layVar.b = i13;
        int i14 = i;
        i14 = i;
        if (layVar.a != 0 && i13 > 0) {
            if (i != 44) {
                X(i, "was expecting comma to separate " + this.w.e() + " entries");
                throw null;
            }
            while (true) {
                int i15 = this.p;
                if (i15 >= this.q) {
                    i3 = R0();
                    break;
                }
                char[] cArr4 = this.M;
                int i16 = i15 + 1;
                this.p = i16;
                char c9 = cArr4[i15];
                if (c9 > ' ') {
                    if (c9 == '/' || c9 == '#') {
                        this.p = i15;
                        i3 = R0();
                    } else {
                        i3 = c9;
                    }
                } else if (c9 < ' ') {
                    if (c9 == '\n') {
                        this.s++;
                        this.t = i16;
                    } else if (c9 == '\r') {
                        T0();
                    } else if (c9 != '\t') {
                        a0(c9);
                        throw null;
                    }
                }
            }
        }
        boolean c10 = this.w.c();
        c7f0 c7f0Var = this.y;
        int i17 = i14;
        if (c10) {
            int i18 = this.p;
            cmb cmbVar = this.O;
            int[] iArr = Z;
            int i19 = this.P;
            if (i14 == 34) {
                while (true) {
                    if (i18 >= this.q) {
                        z = i8;
                        break;
                    }
                    char[] cArr5 = this.M;
                    char c11 = cArr5[i18];
                    z = i8;
                    if (c11 >= iArr.length || iArr[c11] == 0) {
                        i19 = (i19 * 33) + c11;
                        i18++;
                        i8 = z;
                    } else if (c11 == '\"') {
                        int i20 = this.p;
                        this.p = i18 + 1;
                        b = cmbVar.b(i20, i18 - i20, cArr5, i19);
                    }
                }
                int i21 = this.p;
                this.p = i18;
                b = L0(i21, i19, 34);
            } else {
                z = 1;
                if (i14 == 39 && (V & i4) != 0) {
                    int i22 = this.q;
                    if (i18 < i22) {
                        int length = iArr.length;
                        do {
                            char[] cArr6 = this.M;
                            char c12 = cArr6[i18];
                            if (c12 != '\'') {
                                if (c12 < length && iArr[c12] != 0) {
                                    break;
                                }
                                i19 = (i19 * 33) + c12;
                                i18++;
                            } else {
                                int i23 = this.p;
                                this.p = i18 + 1;
                                b = cmbVar.b(i23, i18 - i23, cArr6, i19);
                                break;
                            }
                        } while (i18 < i22);
                    }
                    int i24 = this.p;
                    this.p = i18;
                    b = L0(i24, i19, 39);
                } else {
                    if ((W & i4) == 0) {
                        X(i14 == true ? 1 : 0, "was expecting double-quote to start field name");
                        throw null;
                    }
                    int[] iArr2 = amb.g;
                    int length2 = iArr2.length;
                    if (!(i14 < length2 ? iArr2[i14 == true ? 1 : 0] == 0 : Character.isJavaIdentifierPart(i14 == true ? (char) 1 : (char) 0))) {
                        X(i14 == true ? 1 : 0, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                        throw null;
                    }
                    int i25 = this.p;
                    int i26 = this.q;
                    if (i25 < i26) {
                        do {
                            char[] cArr7 = this.M;
                            char c13 = cArr7[i25];
                            if (c13 < length2) {
                                if (iArr2[c13] != 0) {
                                    int i27 = this.p - 1;
                                    this.p = i25;
                                    b = cmbVar.b(i27, i25 - i27, cArr7, i19);
                                    break;
                                }
                                i19 = (i19 * 33) + c13;
                                i25++;
                            } else {
                                if (!Character.isJavaIdentifierPart(c13)) {
                                    int i28 = this.p - 1;
                                    this.p = i25;
                                    b = cmbVar.b(i28, i25 - i28, this.M, i19);
                                    break;
                                }
                                i19 = (i19 * 33) + c13;
                                i25++;
                            }
                        } while (i25 < i26);
                    }
                    int i29 = this.p - 1;
                    this.p = i25;
                    c7f0Var.j(this.M, i29, i25 - i29);
                    char[] h = c7f0Var.h();
                    int i30 = c7f0Var.i;
                    int length3 = iArr2.length;
                    while (true) {
                        if (this.p >= this.q && !E0()) {
                            break;
                        }
                        char c14 = this.M[this.p];
                        if (c14 < length3) {
                            if (iArr2[c14] != 0) {
                                break;
                            }
                            this.p++;
                            i19 = (i19 * 33) + c14;
                            i2 = i30 + 1;
                            h[i30] = c14;
                            if (i2 < h.length) {
                                h = c7f0Var.g();
                                i30 = 0;
                            } else {
                                i30 = i2;
                            }
                            c5 = ' ';
                            z = 1;
                        } else {
                            if (!Character.isJavaIdentifierPart(c14)) {
                                break;
                            }
                            this.p++;
                            i19 = (i19 * 33) + c14;
                            i2 = i30 + 1;
                            h[i30] = c14;
                            if (i2 < h.length) {
                            }
                            c5 = ' ';
                            z = 1;
                        }
                    }
                    c7f0Var.i = i30;
                    char[] i31 = c7f0Var.i();
                    int i32 = c7f0Var.c;
                    if (i32 < 0) {
                        i32 = 0;
                    }
                    b = cmbVar.b(i32, c7f0Var.k(), i31, i19);
                }
            }
            this.w.f(b);
            this.c = JsonToken.FIELD_NAME;
            int i33 = this.p;
            if (i33 + 4 >= this.q) {
                W0 = W0(false);
            } else {
                char[] cArr8 = this.M;
                char c15 = cArr8[i33];
                if (c15 == ':') {
                    int i34 = i33 + 1;
                    this.p = i34;
                    char c16 = cArr8[i34];
                    if (c16 <= c5) {
                        if (c16 == c5 || c16 == '\t') {
                            int i35 = i33 + 2;
                            this.p = i35;
                            c4 = cArr8[i35];
                            if (c4 > c5) {
                                if (c4 == '/' || c4 == '#') {
                                    z2 = true;
                                    W02 = W0(true);
                                    W0 = W02;
                                } else {
                                    this.p = i33 + 3;
                                    W0 = c4;
                                }
                            }
                        }
                        z2 = true;
                        W02 = W0(true);
                        W0 = W02;
                    } else if (c16 == '/' || c16 == '#') {
                        W0 = W0(z);
                    } else {
                        this.p = i33 + 2;
                        W0 = c16;
                    }
                } else {
                    int i36 = z;
                    if (c15 == c5 || c15 == '\t') {
                        int i37 = i33 + i36;
                        this.p = i37;
                        c15 = cArr8[i37];
                    }
                    if (c15 == ':') {
                        int i38 = this.p;
                        int i39 = i38 + 1;
                        this.p = i39;
                        char c17 = cArr8[i39];
                        if (c17 <= c5) {
                            if (c17 == c5 || c17 == '\t') {
                                int i40 = i38 + 2;
                                this.p = i40;
                                c4 = cArr8[i40];
                                if (c4 > c5) {
                                    if (c4 == '/' || c4 == '#') {
                                        W0 = W0(true);
                                    } else {
                                        this.p = i38 + 3;
                                        W0 = c4;
                                    }
                                }
                            }
                            W0 = W0(true);
                        } else if (c17 == '/' || c17 == '#') {
                            W0 = W0(true);
                        } else {
                            this.p = i38 + 2;
                            W0 = c17;
                        }
                    } else {
                        W0 = W0(false);
                    }
                }
                i17 = W0;
            }
            i17 = W0;
        }
        int i41 = this.p;
        int i42 = this.s;
        this.u = i42;
        int i43 = i41 - this.t;
        this.v = i43;
        if (i17 == 34) {
            this.Q = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (i17 == 43) {
            jsonToken = JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.j().j(i4) ? O0(false) : D0(i17);
        } else if (i17 == 91) {
            if (!c10) {
                r0(i42, i43);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (i17 == 102) {
            int i44 = i41 + 4;
            if (i44 < this.q) {
                char[] cArr9 = this.M;
                if (cArr9[i41] == 'a' && cArr9[i41 + 1] == 'l' && cArr9[i41 + 2] == 's' && cArr9[i41 + 3] == 'e' && ((c = cArr9[i44]) < '0' || c == ']' || c == '}')) {
                    this.p = i44;
                    jsonToken = JsonToken.VALUE_FALSE;
                }
            }
            G0(1, CredentialEntry.FALSE_STRING);
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (i17 == 110) {
            int i45 = i41 + 3;
            if (i45 < this.q) {
                char[] cArr10 = this.M;
                if (cArr10[i41] == 'u' && cArr10[i41 + 1] == 'l' && cArr10[i41 + 2] == 'l' && ((c2 = cArr10[i45]) < '0' || c2 == ']' || c2 == '}')) {
                    this.p = i45;
                    jsonToken = JsonToken.VALUE_NULL;
                }
            }
            G0(1, "null");
            jsonToken = JsonToken.VALUE_NULL;
        } else if (i17 == 116) {
            int i46 = i41 + 3;
            if (i46 < this.q) {
                char[] cArr11 = this.M;
                if (cArr11[i41] == 'r' && cArr11[i41 + 1] == 'u' && cArr11[i41 + 2] == 'e' && ((c3 = cArr11[i46]) < '0' || c3 == ']' || c3 == '}')) {
                    this.p = i46;
                    jsonToken = JsonToken.VALUE_TRUE;
                }
            }
            G0(1, "true");
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (i17 == 123) {
            if (!c10) {
                s0(i42, i43);
            }
            jsonToken = JsonToken.START_OBJECT;
        } else {
            if (i17 == 125) {
                X(i17, "expected a value");
                throw null;
            }
            if (i17 == 45) {
                jsonToken = O0(true);
            } else if (i17 != 46) {
                switch (i17) {
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
                        int i47 = i41 - 1;
                        int i48 = this.q;
                        if (i17 != 48) {
                            int i49 = 1;
                            while (i41 < i48) {
                                int i50 = i41 + 1;
                                char c18 = this.M[i41];
                                if (c18 >= '0' && c18 <= '9') {
                                    i49++;
                                    i41 = i50;
                                } else if (c18 != '.' && c18 != 'e' && c18 != 'E') {
                                    this.p = i41;
                                    if (this.w.d()) {
                                        a1(c18);
                                    }
                                    c7f0Var.j(this.M, i47, i41 - i47);
                                    jsonToken = y0(i49, false);
                                    break;
                                } else {
                                    this.p = i50;
                                    jsonToken = I0(c18, i47, i50, i49, false);
                                    break;
                                }
                            }
                            this.p = i47;
                            jsonToken = M0(i47, false);
                            break;
                        } else {
                            jsonToken = M0(i47, false);
                            break;
                        }
                        break;
                    default:
                        jsonToken = D0(i17);
                        break;
                }
            } else {
                jsonToken = J0(false);
            }
        }
        if (c10) {
            this.x = jsonToken;
            return this.c;
        }
        this.c = jsonToken;
        return jsonToken;
    }

    public final JsonToken O0(boolean z) throws IOException {
        int i = this.p;
        int i2 = z ? i - 1 : i;
        int i3 = this.q;
        if (i >= i3) {
            return M0(i2, z);
        }
        int i4 = i + 1;
        char c = this.M[i];
        char c2 = '9';
        int i5 = 1;
        if (c > '9' || c < '0') {
            this.p = i4;
            return c == '.' ? J0(z) : C0(c, z, true);
        }
        if (c == '0') {
            return M0(i2, z);
        }
        while (i4 < i3) {
            char c3 = c2;
            int i6 = i4 + 1;
            char c4 = this.M[i4];
            if (c4 < '0' || c4 > c3) {
                if (c4 == '.' || c4 == 'e' || c4 == 'E') {
                    this.p = i6;
                    return I0(c4, i2, i6, i5, z);
                }
                this.p = i4;
                if (this.w.d()) {
                    a1(c4);
                }
                this.y.j(this.M, i2, i4 - i2);
                return y0(i5, z);
            }
            i5++;
            i4 = i6;
            c2 = c3;
        }
        return M0(i2, z);
    }

    public final void Q0(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.p >= this.q && !E0()) {
                break;
            }
            char c = this.M[this.p];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.p++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw b("Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    public final int R0() throws IOException {
        while (true) {
            if (this.p >= this.q && !E0()) {
                throw b("Unexpected end-of-input within/between " + this.w.e() + " entries");
            }
            char[] cArr = this.M;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    X0();
                } else {
                    if (c != '#') {
                        return c;
                    }
                    if ((this.b & Y) == 0) {
                        return c;
                    }
                    Y0();
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.s++;
                this.t = i2;
            } else if (c == '\r') {
                T0();
            } else if (c != '\t') {
                a0(c);
                throw null;
            }
        }
    }

    public final void T0() throws IOException {
        if (this.p < this.q || E0()) {
            char[] cArr = this.M;
            int i = this.p;
            if (cArr[i] == '\n') {
                this.p = i + 1;
            }
        }
        this.s++;
        this.t = this.p;
    }

    public final int W0(boolean z) throws IOException {
        while (true) {
            if (this.p >= this.q && !E0()) {
                U(" within/between " + this.w.e() + " entries", null);
                throw null;
            }
            char[] cArr = this.M;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    X0();
                } else if (c == '#' && (this.b & Y) != 0) {
                    Y0();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        X(c, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.s++;
                this.t = i2;
            } else if (c == '\r') {
                T0();
            } else if (c != '\t') {
                a0(c);
                throw null;
            }
        }
    }

    public final void X0() throws IOException {
        if ((this.b & X) == 0) {
            X(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (this.p >= this.q && !E0()) {
            U(" in a comment", null);
            throw null;
        }
        char[] cArr = this.M;
        int i = this.p;
        this.p = i + 1;
        char c = cArr[i];
        if (c == '/') {
            Y0();
            return;
        }
        if (c != '*') {
            X(c, "was expecting either '*' or '/' for a comment");
            throw null;
        }
        while (true) {
            if (this.p >= this.q && !E0()) {
                break;
            }
            char[] cArr2 = this.M;
            int i2 = this.p;
            int i3 = i2 + 1;
            this.p = i3;
            char c2 = cArr2[i2];
            if (c2 <= '*') {
                if (c2 == '*') {
                    if (i3 >= this.q && !E0()) {
                        break;
                    }
                    char[] cArr3 = this.M;
                    int i4 = this.p;
                    if (cArr3[i4] == '/') {
                        this.p = i4 + 1;
                        return;
                    }
                } else if (c2 >= ' ') {
                    continue;
                } else if (c2 == '\n') {
                    this.s++;
                    this.t = i3;
                } else if (c2 == '\r') {
                    T0();
                } else if (c2 != '\t') {
                    a0(c2);
                    throw null;
                }
            }
        }
        U(" in a comment", null);
        throw null;
    }

    public final void Y0() throws IOException {
        while (true) {
            if (this.p >= this.q && !E0()) {
                return;
            }
            char[] cArr = this.M;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.s++;
                    this.t = i2;
                    return;
                } else if (c == '\r') {
                    T0();
                    return;
                } else if (c != '\t') {
                    a0(c);
                    throw null;
                }
            }
        }
    }

    public final int Z0() throws IOException {
        while (true) {
            if (this.p >= this.q && !E0()) {
                Q();
                return -1;
            }
            char[] cArr = this.M;
            int i = this.p;
            int i2 = i + 1;
            this.p = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    X0();
                } else {
                    if (c != '#') {
                        return c;
                    }
                    if ((this.b & Y) == 0) {
                        return c;
                    }
                    Y0();
                }
            } else if (c == ' ') {
                continue;
            } else if (c == '\n') {
                this.s++;
                this.t = i2;
            } else if (c == '\r') {
                T0();
            } else if (c != '\t') {
                a0(c);
                throw null;
            }
        }
    }

    public final void a1(int i) throws IOException {
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

    @Override // xsna.lj90
    public final void c0() throws IOException {
        if (this.L != null) {
            if (this.m.d || JsonParser.Feature.AUTO_CLOSE_SOURCE.j(this.b)) {
                this.L.close();
            }
            this.L = null;
        }
    }

    public final char c1(String str, JsonToken jsonToken) throws IOException {
        if (this.p >= this.q && !E0()) {
            U(str, jsonToken);
            throw null;
        }
        char[] cArr = this.M;
        int i = this.p;
        this.p = i + 1;
        return cArr[i];
    }

    @Override // xsna.lj90
    public final void m0() throws IOException {
        char[] cArr;
        cmb cmbVar;
        super.m0();
        cmb cmbVar2 = this.O;
        if (!cmbVar2.l && (cmbVar = cmbVar2.a) != null && cmbVar2.e) {
            cmb.b bVar = new cmb.b(cmbVar2);
            AtomicReference<cmb.b> atomicReference = cmbVar.b;
            cmb.b bVar2 = atomicReference.get();
            int i = bVar2.a;
            int i2 = bVar.a;
            if (i2 != i) {
                if (i2 > 12000) {
                    bVar = new cmb.b(new String[64], new cmb.a[32]);
                }
                while (!atomicReference.compareAndSet(bVar2, bVar) && atomicReference.get() == bVar2) {
                }
            }
            cmbVar2.l = true;
        }
        if (!this.N || (cArr = this.M) == null) {
            return;
        }
        this.M = null;
        tnv tnvVar = this.m;
        char[] cArr2 = tnvVar.i;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        tnvVar.i = null;
        tnvVar.e.b.set(0, cArr);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonLocation p() {
        return new JsonLocation(d0(), -1L, this.p + this.r, this.s, (this.p - this.t) + 1);
    }

    public final void z0(int i) throws JsonParseException {
        if (i == 93) {
            int i2 = this.p;
            this.u = this.s;
            this.v = i2 - this.t;
            if (!this.w.b()) {
                n0('}', i);
                throw null;
            }
            this.w = this.w.d;
            this.c = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            int i3 = this.p;
            this.u = this.s;
            this.v = i3 - this.t;
            if (!this.w.c()) {
                n0(']', i);
                throw null;
            }
            this.w = this.w.d;
            this.c = JsonToken.END_OBJECT;
        }
    }

    public w7f0(tnv tnvVar, int i, Reader reader, cmb cmbVar) {
        super(tnvVar, i);
        this.L = reader;
        tnv.a(tnvVar.i);
        char[] a = tnvVar.e.a(0, 0);
        tnvVar.i = a;
        this.M = a;
        this.p = 0;
        this.q = 0;
        this.O = cmbVar;
        this.P = cmbVar.c;
        this.N = true;
    }
}
