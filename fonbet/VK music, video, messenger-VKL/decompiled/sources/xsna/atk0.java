package xsna;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class atk0 {
    public final long a;
    public final String b;
    public final h6n0 c;

    public atk0(long j, String str, h6n0 h6n0Var) {
        this.a = j;
        this.b = str;
        this.c = h6n0Var;
    }

    public static atk0 a(atk0 atk0Var, String str, h6n0 h6n0Var, int i) {
        long j = atk0Var.a;
        if ((i & 2) != 0) {
            str = atk0Var.b;
        }
        if ((i & 4) != 0) {
            h6n0Var = atk0Var.c;
        }
        atk0Var.getClass();
        return new atk0(j, str, h6n0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atk0)) {
            return false;
        }
        atk0 atk0Var = (atk0) obj;
        return this.a == atk0Var.a && epx.f(this.b, atk0Var.b) && epx.f(this.c, atk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "State(dialogId=" + this.a + ", query=" + this.b + ", suggestionData=" + this.c + ')';
    }

    public /* synthetic */ atk0(long j) {
        this(j, "", new h6n0((m420) null, 3));
    }
}
