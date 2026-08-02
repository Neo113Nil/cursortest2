package xsna;

/* compiled from: Luts.kt */
/* loaded from: classes4.dex */
public final class v900 extends y900 {
    public final int c;
    public final String d;
    public final boolean e;
    public final x900 f;

    public v900(int i, String str, boolean z, x900 x900Var) {
        super(i, z);
        this.c = i;
        this.d = str;
        this.e = z;
        this.f = x900Var;
    }

    public static v900 c(v900 v900Var, x900 x900Var) {
        int i = v900Var.c;
        String str = v900Var.d;
        boolean z = v900Var.e;
        v900Var.getClass();
        return new v900(i, str, z, x900Var);
    }

    @Override // xsna.y900
    public final int a() {
        return this.c;
    }

    @Override // xsna.y900
    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v900)) {
            return false;
        }
        v900 v900Var = (v900) obj;
        return this.c == v900Var.c && epx.f(this.d, v900Var.d) && this.e == v900Var.e && epx.f(this.f, v900Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(urd0.a(Integer.hashCode(this.c) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder a = kh10.a(this.c, "Lut(id=", ", name=", this.d, ", isDefault=");
        a.append(this.e);
        a.append(", imageState=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
