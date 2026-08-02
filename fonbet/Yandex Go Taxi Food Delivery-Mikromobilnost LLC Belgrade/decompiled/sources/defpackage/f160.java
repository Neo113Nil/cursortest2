package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class f160 implements xy50 {
    public static final e160 Companion = new e160();
    public final String a;
    public final String b;

    public /* synthetic */ f160(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, d160.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f160)) {
            return false;
        }
        f160 f160Var = (f160) obj;
        return jl40.l(this.a, f160Var.a) && jl40.l(this.b, f160Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStringArgumentModel(type=");
        sb.append(this.a);
        sb.append(", argValue=");
        return b64.p(sb, this.b, ')');
    }
}
