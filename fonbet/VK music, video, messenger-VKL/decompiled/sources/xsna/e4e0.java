package xsna;

/* compiled from: ProjectContext.kt */
/* loaded from: classes6.dex */
public final class e4e0 {
    public final String a;
    public final String b;
    public final blq0 c;

    public e4e0(String str, String str2, blq0 blq0Var) {
        this.a = str;
        this.b = str2;
        this.c = blq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4e0)) {
            return false;
        }
        e4e0 e4e0Var = (e4e0) obj;
        return epx.f(this.a, e4e0Var.a) && epx.f(this.b, e4e0Var.b) && epx.f(this.c, e4e0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ProjectContext(project=" + this.a + ", notifier=" + this.b + ", userData=" + this.c + ')';
    }
}
