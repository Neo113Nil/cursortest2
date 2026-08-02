package xsna;

import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: ReadConstrainedTextBuffer.java */
/* loaded from: classes12.dex */
public final class c7f0 {
    public static final char[] m = new char[0];
    public final im8 a;
    public char[] b;
    public int c;
    public int d;
    public ArrayList e;
    public boolean f;
    public int g;
    public char[] h;
    public int i;
    public String j;
    public char[] k;
    public final StreamReadConstraints l;

    public c7f0(StreamReadConstraints streamReadConstraints, im8 im8Var) {
        this.a = im8Var;
        this.l = streamReadConstraints;
    }

    public final char[] a(int i) {
        im8 im8Var = this.a;
        return im8Var != null ? im8Var.a(2, i) : new char[Math.max(i, 500)];
    }

    public final void b() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    public final int c(boolean z) {
        char[] cArr;
        int i = this.c;
        return (i < 0 || (cArr = this.b) == null) ? z ? -en70.c(this.h, 1, this.i - 1) : en70.c(this.h, 0, this.i) : z ? -en70.c(cArr, i + 1, this.d - 1) : en70.c(cArr, i, this.d);
    }

    public final String d() throws IOException {
        if (this.j == null) {
            char[] cArr = this.k;
            if (cArr != null) {
                this.j = new String(cArr);
            } else if (this.c >= 0) {
                int i = this.d;
                if (i < 1) {
                    this.j = "";
                    return "";
                }
                m(i);
                this.j = new String(this.b, this.c, this.d);
            } else {
                int i2 = this.g;
                int i3 = this.i;
                if (i2 != 0) {
                    int i4 = i2 + i3;
                    m(i4);
                    StringBuilder sb = new StringBuilder(i4);
                    ArrayList arrayList = this.e;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            char[] cArr2 = (char[]) this.e.get(i5);
                            sb.append(cArr2, 0, cArr2.length);
                        }
                    }
                    sb.append(this.h, 0, this.i);
                    this.j = sb.toString();
                } else if (i3 == 0) {
                    this.j = "";
                } else {
                    m(i3);
                    this.j = new String(this.h, 0, i3);
                }
            }
        }
        return this.j;
    }

    public final char[] e() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.j = null;
        this.k = null;
        if (this.f) {
            b();
        }
        char[] cArr = this.h;
        if (cArr != null) {
            return cArr;
        }
        char[] a = a(0);
        this.h = a;
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r0 > 65536) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        char[] cArr = this.h;
        this.f = true;
        this.e.add(cArr);
        this.g += cArr.length;
        this.i = 0;
        int length = cArr.length;
        int i = length + (length >> 1);
        int i2 = i >= 500 ? 65536 : 500;
        i = i2;
        this.h = new char[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0 > 65536) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final char[] g() throws IOException {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.f = true;
        this.e.add(this.h);
        int length = this.h.length;
        int i = this.g + length;
        this.g = i;
        this.i = 0;
        m(i);
        int i2 = length + (length >> 1);
        int i3 = i2 >= 500 ? 65536 : 500;
        i2 = i3;
        char[] cArr = new char[i2];
        this.h = cArr;
        return cArr;
    }

    public final char[] h() {
        if (this.c >= 0) {
            l(1);
        } else {
            char[] cArr = this.h;
            if (cArr == null) {
                this.h = a(0);
            } else if (this.i >= cArr.length) {
                f();
            }
        }
        return this.h;
    }

    public final char[] i() throws IOException {
        int i;
        int i2 = this.c;
        if (i2 >= 0) {
            return this.b;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        }
        boolean z = this.f;
        char[] cArr2 = m;
        if (!z) {
            char[] cArr3 = this.h;
            return cArr3 == null ? cArr2 : cArr3;
        }
        if (cArr != null) {
            return cArr;
        }
        if (str != null) {
            cArr2 = str.toCharArray();
        } else if (i2 >= 0) {
            int i3 = this.d;
            if (i3 >= 1) {
                m(i3);
                int i4 = this.c;
                cArr2 = i4 == 0 ? Arrays.copyOf(this.b, i3) : Arrays.copyOfRange(this.b, i4, i3 + i4);
            }
        } else {
            int k = k();
            if (k >= 1) {
                m(k);
                cArr2 = new char[k];
                ArrayList arrayList = this.e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    i = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        char[] cArr4 = (char[]) this.e.get(i5);
                        int length = cArr4.length;
                        System.arraycopy(cArr4, 0, cArr2, i, length);
                        i += length;
                    }
                } else {
                    i = 0;
                }
                System.arraycopy(this.h, 0, cArr2, i, this.i);
            }
        }
        this.k = cArr2;
        return cArr2;
    }

    public final void j(char[] cArr, int i, int i2) {
        this.j = null;
        this.k = null;
        this.b = cArr;
        this.c = i;
        this.d = i2;
        if (this.f) {
            b();
        }
    }

    public final int k() {
        if (this.c >= 0) {
            return this.d;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        return str != null ? str.length() : this.g + this.i;
    }

    public final void l(int i) {
        int i2 = this.d;
        this.d = 0;
        char[] cArr = this.b;
        this.b = null;
        int i3 = this.c;
        this.c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    public final void m(int i) throws StreamConstraintsException {
        this.l.d(i);
    }

    public final String toString() {
        try {
            return d();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }
}
