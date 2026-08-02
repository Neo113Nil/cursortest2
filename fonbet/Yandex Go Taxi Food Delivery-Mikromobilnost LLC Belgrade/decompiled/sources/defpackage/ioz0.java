package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ioz0 {
    public final char[] a;
    public int b;
    public final ArrayList c = new ArrayList();

    public ioz0(char[] cArr) {
        this.a = cArr;
    }

    public static char c(ioz0 ioz0Var) {
        int i = ioz0Var.b + 1;
        char[] cArr = ioz0Var.a;
        if (i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    public static char d(ioz0 ioz0Var) {
        int i = ioz0Var.b - 1;
        if (i >= 0) {
            return ioz0Var.a[i];
        }
        return (char) 0;
    }

    public final char a() {
        int i = this.b;
        char[] cArr = this.a;
        if (i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    public final int b(int i) {
        int i2 = this.b;
        this.b = i + i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (ioz0.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.a, ((ioz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "TokenizationState(source=" + Arrays.toString(this.a) + ')';
    }
}
