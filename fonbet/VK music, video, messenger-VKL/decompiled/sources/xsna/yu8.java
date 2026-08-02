package xsna;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: CLElement.java */
/* loaded from: classes11.dex */
public class yu8 implements Cloneable {
    public final char[] b;
    public long c = -1;
    public long d = Long.MAX_VALUE;
    public xu8 e;

    public yu8(char[] cArr) {
        this.b = cArr;
    }

    @Override // 
    @NonNull
    public yu8 e() {
        try {
            return (yu8) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu8)) {
            return false;
        }
        yu8 yu8Var = (yu8) obj;
        if (this.c == yu8Var.c && this.d == yu8Var.d && Arrays.equals(this.b, yu8Var.b)) {
            return Objects.equals(this.e, yu8Var.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.b) * 31;
        long j = this.c;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        xu8 xu8Var = this.e;
        return (i2 + (xu8Var != null ? xu8Var.hashCode() : 0)) * 31;
    }

    public final String i() {
        String str = new String(this.b);
        if (str.length() < 1) {
            return "";
        }
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long j2 = this.c;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.c;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public float j() {
        if (this instanceof av8) {
            return ((av8) this).j();
        }
        return Float.NaN;
    }

    public int k() {
        if (this instanceof av8) {
            return ((av8) this).k();
        }
        return 0;
    }

    public final String l() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public final void m(long j) {
        if (this.d != Long.MAX_VALUE) {
            return;
        }
        this.d = j;
        xu8 xu8Var = this.e;
        if (xu8Var != null) {
            xu8Var.n(this);
        }
    }

    public String toString() {
        long j = this.c;
        long j2 = this.d;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.c);
            sb.append("-");
            return efz.b(this.d, ")", sb);
        }
        return l() + " (" + this.c + " : " + this.d + ") <<" + new String(this.b).substring((int) this.c, ((int) this.d) + 1) + ">>";
    }
}
