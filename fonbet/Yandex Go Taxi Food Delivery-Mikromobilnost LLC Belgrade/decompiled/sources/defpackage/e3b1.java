package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class e3b1 {
    public final String a;
    public final String b;
    public final boolean c;

    public e3b1(String str, String str2, boolean z) {
        cvw.i(str);
        this.a = str;
        cvw.i(str2);
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3b1)) {
            return false;
        }
        e3b1 e3b1Var = (e3b1) obj;
        return ooc.m(this.a, e3b1Var.a) && ooc.m(this.b, e3b1Var.b) && ooc.m(null, null) && this.c == e3b1Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        cvw.l(null);
        throw null;
    }
}
