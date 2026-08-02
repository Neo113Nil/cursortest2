package xsna;

/* compiled from: Status.kt */
/* loaded from: classes3.dex */
public final class dzk0 {
    public final int a;
    public final int b;
    public final CharSequence c;
    public final CharSequence d;
    public final au e;

    public dzk0(int i, int i2, CharSequence charSequence, CharSequence charSequence2, au auVar) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = auVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzk0)) {
            return false;
        }
        dzk0 dzk0Var = (dzk0) obj;
        return this.a == dzk0Var.a && this.b == dzk0Var.b && epx.f(this.c, dzk0Var.c) && epx.f(this.d, dzk0Var.d) && epx.f(this.e, dzk0Var.e);
    }

    public final int hashCode() {
        int c = u11.c(u11.c(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        au auVar = this.e;
        return c + (auVar == null ? 0 : auVar.hashCode());
    }

    public final String toString() {
        return "Status(icon=" + this.a + ", iconTint=" + this.b + ", title=" + ((Object) this.c) + ", message=" + ((Object) this.d) + ", action=" + this.e + ')';
    }
}
