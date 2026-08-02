package xsna;

/* compiled from: OnTypingBeginEvent.kt */
/* loaded from: classes2.dex */
public final class nc80 extends sxp {
    public final Object b;
    public final long c;
    public final vh30 d;

    public nc80(Object obj, long j, vh30 vh30Var) {
        this.b = obj;
        this.c = j;
        this.d = vh30Var;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc80)) {
            return false;
        }
        nc80 nc80Var = (nc80) obj;
        return epx.f(this.b, nc80Var.b) && this.c == nc80Var.c && epx.f(this.d, nc80Var.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.d.hashCode() + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        return "OnTypingBeginEvent(changerTag=" + this.b + ", dialogId=" + this.c + ", member=" + this.d + ')';
    }
}
