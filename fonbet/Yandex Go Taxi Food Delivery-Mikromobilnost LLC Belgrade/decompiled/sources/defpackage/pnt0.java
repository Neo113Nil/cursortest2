package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class pnt0 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int w;

    public pnt0(int i) {
        if (i == 0) {
            this.b = cvw.a;
            this.c = cvw.c;
            return;
        }
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.b = new int[i5];
        this.c = new Object[i5];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pnt0 clone() {
        pnt0 pnt0Var = (pnt0) super.clone();
        pnt0Var.b = (int[]) this.b.clone();
        pnt0Var.c = (Object[]) this.c.clone();
        return pnt0Var;
    }

    public final Object b(int i) {
        Object obj;
        int c = cvw.c(this.b, this.w, i);
        if (c < 0 || (obj = this.c[c]) == kp50.b) {
            return null;
        }
        return obj;
    }

    public final int c(int i) {
        if (this.a) {
            kp50.a(this);
        }
        if (i >= this.w || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final void clear() {
        int i = this.w;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.w = 0;
        this.a = false;
    }

    public final void d(int i, Object obj) {
        int c = cvw.c(this.b, this.w, i);
        if (c >= 0) {
            this.c[c] = obj;
            return;
        }
        int i2 = ~c;
        int i3 = this.w;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == kp50.b) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            kp50.a(this);
            i2 = ~cvw.c(this.b, this.w, i);
        }
        int i4 = this.w;
        if (i4 >= this.b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.b = Arrays.copyOf(this.b, i8);
            this.c = Arrays.copyOf(this.c, i8);
        }
        int i9 = this.w;
        if (i9 - i2 != 0) {
            int[] iArr = this.b;
            int i10 = i2 + 1;
            f73.d(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.c;
            f73.g(objArr2, i10, objArr2, i2, this.w);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.w++;
    }

    public final int e() {
        if (this.a) {
            kp50.a(this);
        }
        return this.w;
    }

    public final Object f(int i) {
        if (this.a) {
            kp50.a(this);
        }
        if (i >= this.w || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.c[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.w * 28);
        sb.append('{');
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(Extension.FIX_SPACE);
            }
            sb.append(c(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public pnt0() {
        this((Object) null);
    }

    public /* synthetic */ pnt0(Object obj) {
        this(10);
    }
}
