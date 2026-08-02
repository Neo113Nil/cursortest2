package xsna;

/* compiled from: CommentsState.kt */
/* loaded from: classes16.dex */
public final class ggg {
    public final ceg a;
    public final deg b;

    public ggg() {
        this((ceg) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggg)) {
            return false;
        }
        ggg gggVar = (ggg) obj;
        return epx.f(this.a, gggVar.a) && epx.f(this.b, gggVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommentsState(config=" + this.a + ", content=" + this.b + ')';
    }

    public ggg(ceg cegVar, deg degVar) {
        this.a = cegVar;
        this.b = degVar;
    }

    public /* synthetic */ ggg(ceg cegVar, int i) {
        this((i & 1) != 0 ? new ceg(null, null, 15) : cegVar, new deg(0));
    }
}
