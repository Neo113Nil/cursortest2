package xsna;

/* compiled from: OnTypingEndEvent.kt */
/* loaded from: classes2.dex */
public final class oc80 extends sxp {
    public final Object b;
    public final long c;
    public final vh30 d;

    public oc80(Object obj, long j, vh30 vh30Var) {
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
        if (!(obj instanceof oc80)) {
            return false;
        }
        oc80 oc80Var = (oc80) obj;
        return epx.f(this.b, oc80Var.b) && this.c == oc80Var.c && epx.f(this.d, oc80Var.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.d.hashCode() + bh10.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        return "OnTypingEndEvent(changerTag=" + this.b + ", dialogId=" + this.c + ", member=" + this.d + ')';
    }
}
