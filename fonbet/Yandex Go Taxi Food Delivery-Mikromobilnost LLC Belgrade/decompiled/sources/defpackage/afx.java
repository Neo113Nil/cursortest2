package defpackage;

import com.google.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public class afx implements Closeable, Flushable {
    public static final Pattern E = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] F = new String[128];
    public static final String[] G;
    public Strictness A;
    public boolean B;
    public String C;
    public boolean D;
    public final Writer a;
    public int[] b;
    public int c;
    public n9s w;
    public String x;
    public String y;
    public boolean z;

    static {
        for (int i = 0; i <= 31; i++) {
            F[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = F;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        G = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public afx(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i = this.c;
        this.c = i + 1;
        iArr2[i] = 6;
        this.A = Strictness.LEGACY_STRICT;
        this.D = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        D(n9s.d);
    }

    public final int B() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        ny61.r("JsonWriter is closed.");
        return 0;
    }

    public final void D(n9s n9sVar) {
        Objects.requireNonNull(n9sVar);
        this.w = n9sVar;
        this.y = ",";
        if (n9sVar.c) {
            this.x = Extension.COLON_SPACE;
            if (n9sVar.a.isEmpty()) {
                this.y = Extension.FIX_SPACE;
            }
        } else {
            this.x = ":";
        }
        this.z = this.w.a.isEmpty() && this.w.b.isEmpty();
    }

    public final void G(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.A = strictness;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(String str) {
        int i;
        String str2;
        String[] strArr = this.B ? G : F;
        Writer writer = this.a;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    writer.write(str, i2, i - i2);
                }
                writer.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                writer.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public void P(double d) {
        a0();
        if (this.A != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            kbs.d(d, "Numeric values must be finite, but was ");
        } else {
            a();
            this.a.append((CharSequence) Double.toString(d));
        }
    }

    public void R(long j) {
        a0();
        a();
        this.a.write(Long.toString(j));
    }

    public void T(Boolean bool) {
        if (bool == null) {
            w();
            return;
        }
        a0();
        a();
        this.a.write(bool.booleanValue() ? "true" : "false");
    }

    public void U(Number number) {
        if (number == null) {
            w();
            return;
        }
        a0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.A != Strictness.LENIENT) {
                    ny61.g("Numeric values must be finite, but was ".concat(obj));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !E.matcher(obj).matches()) {
                w511.l("String created by ", cls, " is not a valid JSON number: ", obj);
                return;
            }
        }
        a();
        this.a.append((CharSequence) obj);
    }

    public void W(String str) {
        if (str == null) {
            w();
            return;
        }
        a0();
        a();
        I(str);
    }

    public void Z(boolean z) {
        a0();
        a();
        this.a.write(z ? "true" : "false");
    }

    public final void a() {
        int B = B();
        if (B == 1) {
            this.b[this.c - 1] = 2;
            v();
            return;
        }
        Writer writer = this.a;
        if (B == 2) {
            writer.append((CharSequence) this.y);
            v();
            return;
        }
        if (B == 4) {
            writer.append((CharSequence) this.x);
            this.b[this.c - 1] = 5;
            return;
        }
        if (B != 6) {
            if (B != 7) {
                ny61.r("Nesting problem.");
                return;
            } else if (this.A != Strictness.LENIENT) {
                ny61.r("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }

    public final void a0() {
        if (this.C != null) {
            int B = B();
            if (B == 5) {
                this.a.write(this.y);
            } else if (B != 3) {
                ny61.r("Nesting problem.");
                return;
            }
            v();
            this.b[this.c - 1] = 4;
            I(this.C);
            this.C = null;
        }
    }

    public void c() {
        a0();
        a();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 1;
        this.a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            ny61.v("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    public void d() {
        a0();
        a();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 3;
        this.a.write(HProv.PP_PASSWD_TERM);
    }

    public final void e(int i, int i2, char c) {
        int B = B();
        if (B != i2 && B != i) {
            ny61.r("Nesting problem.");
            return;
        }
        if (this.C != null) {
            yci0.t(this.C, "Dangling name: ");
            return;
        }
        this.c--;
        if (B == i2) {
            v();
        }
        this.a.write(c);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.c != 0) {
            this.a.flush();
        } else {
            ny61.r("JsonWriter is closed.");
        }
    }

    public void k() {
        e(1, 2, ']');
    }

    public void n() {
        e(3, 5, '}');
    }

    public void o(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.C != null) {
            ny61.r("Already wrote a name, expecting a value.");
            return;
        }
        int B = B();
        if (B == 3 || B == 5) {
            this.C = str;
        } else {
            ny61.r("Please begin an object before writing a name.");
        }
    }

    public final void v() {
        if (this.z) {
            return;
        }
        String str = this.w.a;
        Writer writer = this.a;
        writer.write(str);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.w.b);
        }
    }

    public afx w() {
        if (this.C != null) {
            if (!this.D) {
                this.C = null;
                return this;
            }
            a0();
        }
        a();
        this.a.write("null");
        return this;
    }
}
