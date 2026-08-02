package xsna;

/* compiled from: Entry.kt */
/* loaded from: classes2.dex */
public final class krp {
    public final long a;
    public final vh30 b;

    public krp(long j, vh30 vh30Var) {
        this.a = j;
        this.b = vh30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krp)) {
            return false;
        }
        krp krpVar = (krp) obj;
        return this.a == krpVar.a && epx.f(this.b, krpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Entry(dialogId=" + this.a + ", composing=" + this.b + ')';
    }
}
