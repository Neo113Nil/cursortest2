package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class mp60 {
    public Object[] a;
    public int b;

    public final Object a() {
        if (!d()) {
            return this.a[0];
        }
        xva1.e("ObjectList is empty.");
        throw null;
    }

    public final Object b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mp60) {
            mp60 mp60Var = (mp60) obj;
            int i = mp60Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = mp60Var.a;
                d6w n = y6i0.n(0, i2);
                int i3 = n.a;
                int i4 = n.b;
                if (i3 > i4) {
                    return true;
                }
                while (jl40.l(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder t = b64.t(i, "Index ", " must be in 0..");
        t.append(this.b - 1);
        xva1.d(t.toString());
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        ub60 ub60Var = new ub60(4, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) Extension.FIX_SPACE);
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) ub60Var.invoke(obj));
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
