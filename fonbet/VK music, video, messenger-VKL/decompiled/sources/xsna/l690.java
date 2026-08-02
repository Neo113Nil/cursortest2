package xsna;

/* loaded from: classes11.dex */
public final class l690 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final jl20 e;

    public l690(String str, String str2, String str3, String str4, jl20 jl20Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jl20Var;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (!l690.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l690 l690Var = (l690) obj;
        if (!epx.f(this.a, l690Var.a) || !epx.f(this.b, l690Var.b) || !epx.f(this.c, l690Var.c)) {
            return false;
        }
        String str = l690Var.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str == null) {
                equals = true;
            }
            equals = false;
        } else {
            if (str != null) {
                equals = str2.equals(str);
            }
            equals = false;
        }
        return equals && epx.f(this.e, l690Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        moy0 moy0Var = str != null ? new moy0(str) : null;
        return this.e.hashCode() + ((a + (moy0Var != null ? moy0Var.a.hashCode() : 0)) * 31);
    }
}
