package defpackage;

import com.apollographql.apollo3.exception.JsonDataException;
import java.util.ArrayList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class pq6 implements bfx {
    public static final String[] A;
    public static final o430 z = new o430(17);
    public final yp6 a;
    public int b;
    public final int[] c = new int[256];
    public final String[] w = new String[256];
    public final int[] x = new int[256];
    public String y;

    static {
        String[] strArr = new String[128];
        for (int i = 0; i < 32; i++) {
            byte b = (byte) i;
            z.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & PKIBody._CCP));
            strArr[i] = "\\u00".concat(sb.toString());
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        A = strArr;
    }

    public pq6(yp6 yp6Var) {
        this.a = yp6Var;
        k(6);
    }

    @Override // defpackage.bfx
    public final bfx A1(String str) {
        int i = this.b;
        if (i == 0) {
            ny61.r("JsonWriter is closed.");
            return null;
        }
        if (this.y != null) {
            ny61.r("Nesting problem.");
            return null;
        }
        this.y = str;
        this.w[i - 1] = str;
        return this;
    }

    @Override // defpackage.bfx
    public final bfx X0(long j) {
        d(String.valueOf(j));
        return this;
    }

    @Override // defpackage.bfx
    public final bfx Y0(int i) {
        d(String.valueOf(i));
        return this;
    }

    @Override // defpackage.bfx
    public final bfx Z0(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            d(String.valueOf(d));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d).toString());
    }

    public final void a() {
        int e = e();
        int[] iArr = this.c;
        if (e == 1) {
            iArr[this.b - 1] = 2;
            return;
        }
        yp6 yp6Var = this.a;
        if (e == 2) {
            yp6Var.e0(44);
            return;
        }
        if (e == 4) {
            yp6Var.x0(":");
            iArr[this.b - 1] = 5;
        } else if (e == 6) {
            iArr[this.b - 1] = 7;
        } else if (e != 7) {
            ny61.r("Nesting problem.");
        } else {
            ny61.r("JSON must have only one top-level value.");
        }
    }

    public final void c(int i, int i2, String str) {
        int e = e();
        if (e != i2 && e != i) {
            ny61.r("Nesting problem.");
            return;
        }
        if (this.y != null) {
            vg10.o(this.y, "Dangling name: ");
            return;
        }
        int i3 = this.b;
        int i4 = i3 - 1;
        this.b = i4;
        this.w[i4] = null;
        int i5 = i3 - 2;
        int[] iArr = this.x;
        iArr[i5] = iArr[i5] + 1;
        this.a.x0(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i > 1 || (i == 1 && this.c[i - 1] != 7)) {
            ny61.v("Incomplete document");
        } else {
            this.b = 0;
        }
    }

    public final void d(String str) {
        n();
        a();
        this.a.x0(str);
        int i = this.b - 1;
        int[] iArr = this.x;
        iArr[i] = iArr[i] + 1;
    }

    public final int e() {
        int i = this.b;
        if (i != 0) {
            return this.c[i - 1];
        }
        ny61.r("JsonWriter is closed.");
        return 0;
    }

    @Override // defpackage.bfx
    public final String getPath() {
        String str;
        int i = this.b;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.c[i2];
            if (i3 == 1 || i3 == 2) {
                arrayList.add(Integer.valueOf(this.x[i2]));
            } else if ((i3 == 3 || i3 == 4 || i3 == 5) && (str = this.w[i2]) != null) {
                arrayList.add(str);
            }
        }
        return a.X(arrayList, Extension.DOT_CHAR, null, null, null, 62);
    }

    @Override // defpackage.bfx
    public final bfx j() {
        c(1, 2, "]");
        return this;
    }

    public final void k(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 != iArr.length) {
            this.b = i2 + 1;
            iArr[i2] = i;
        } else {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
    }

    @Override // defpackage.bfx
    public final bfx k2() {
        d("null");
        return this;
    }

    @Override // defpackage.bfx
    public final bfx l() {
        n();
        a();
        k(1);
        this.x[this.b - 1] = 0;
        this.a.x0("[");
        return this;
    }

    public final void n() {
        if (this.y != null) {
            int e = e();
            yp6 yp6Var = this.a;
            if (e == 5) {
                yp6Var.e0(44);
            } else if (e != 3) {
                ny61.r("Nesting problem.");
                return;
            }
            this.c[this.b - 1] = 4;
            o430.q(yp6Var, this.y);
            this.y = null;
        }
    }

    @Override // defpackage.bfx
    public final bfx n1(boolean z2) {
        d(z2 ? "true" : "false");
        return this;
    }

    @Override // defpackage.bfx
    public final bfx o0(hdx hdxVar) {
        d(hdxVar.a());
        return this;
    }

    @Override // defpackage.bfx
    public final bfx r0(String str) {
        n();
        a();
        o430.q(this.a, str);
        int i = this.b - 1;
        int[] iArr = this.x;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.bfx
    public final bfx u() {
        n();
        a();
        k(3);
        this.x[this.b - 1] = 0;
        this.a.x0("{");
        return this;
    }

    @Override // defpackage.bfx
    public final bfx value() {
        k2();
        return this;
    }

    @Override // defpackage.bfx
    public final bfx y() {
        c(3, 5, "}");
        return this;
    }
}
